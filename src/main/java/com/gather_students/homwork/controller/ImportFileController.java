package com.gather_students.homwork.controller;

import com.gather_students.homwork.model.Student;
import com.gather_students.homwork.reponsitories.StudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.ReadFileXLSX;

import java.io.IOException;

@Controller
@RequestMapping(path = "importFile")
//http:localhost:8083/importFile
public class ImportFileController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String importFileXLSX(ModelMap modelMap){
        //coming soon
        return "import" ;
    }

    //http:localhost:8083/importFile/uploadFile
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String submit(@RequestParam("file") MultipartFile file, @ModelAttribute Student student){
        //coming soon
        //modelMap.addAttribute("file",file);
        return "";
    }




}
