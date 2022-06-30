package com.example.dbwithui.allController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dbwithui.services.StudentOperations;

@Controller
public class StudentCon {
    @Autowired
    private StudentOperations studentOperations;
    //handler to display list of Student
    @GetMapping("/")
    public String Display(Model model){
        model.addAttribute("listStudent",studentOperations.getallStudent());
        return "home";

    }
}
