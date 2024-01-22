package com.example.notes.Controller;

import com.example.notes.Model.Note;
import com.example.notes.Service.NoteService;
import com.example.notes.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @GetMapping("/")
    public String getAllNotes(Model model){
        model.addAttribute("notes", noteService.getAllNotes());
        model.addAttribute("note",new Note());
        return "index";
    }

    @GetMapping("/userNotes")
    public String getAllUserNotes(Model model){
        model.addAttribute("notes", noteService.getAllNotes());
        model.addAttribute("note",new Note());
        return "userNotes";
    }

    @GetMapping("/add")
    public String addNote(Model model){
        model.addAttribute("note",new Note());
        return "addNotes";
    }
    @PostMapping("/save")
    public String saveNote(@ModelAttribute Note note){
        noteService.save(note);
            return "redirect:/userNotes";
        }


      @GetMapping("/info")
        public String infoNote(@RequestParam Long id, Model model){
        noteService.getById(id).ifPresent(o -> model.addAttribute("note", o));
        return "note-info";
        }


        @GetMapping("/edit")
        public String editNote(@RequestParam Long id, Model model){
            Optional<Note> note = noteService.getById(id);
            model.addAttribute("note",note);
            return "edit";
        }

        @PostMapping("/update")
        public String updateNote(@ModelAttribute Note note){
        noteService.save(note);
        return "redirect:/userNotes";
        }

    @GetMapping("/delete")
    public String deleteNote(@RequestParam Long id) {
        noteService.delete(id);
        return "redirect:/userNotes";}

}
