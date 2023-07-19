package com.test.tracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskEntryController {

    private final JpaTaskEntryRepository taskEntryRepository;

    public TaskEntryController(JpaTaskEntryRepository taskEntryRepository) {
        this.taskEntryRepository = taskEntryRepository;
    }

    @GetMapping
    public String listAllEntries(Model model) {
        List<TaskEntry> entries = taskEntryRepository.findAll();
        model.addAttribute("entries", entries);
        model.addAttribute("entry", new TaskEntry()); // For form submission
        return "list_entries";
    }

    @PostMapping
    public String addEntry(TaskEntry entry) {
        taskEntryRepository.save(entry);
        return "redirect:/tasks";
    }

    // Add additional methods for filtering entries if needed
}
