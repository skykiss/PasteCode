package club.owtware.controller;

import club.owtware.entity.Code;
import club.owtware.service.impl.CodeServiceImpl;
import club.owtware.util.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Paste {

    @Autowired
    private CodeServiceImpl csi;

    @GetMapping("/")
    public ModelAndView pastePage(){
        return new ModelAndView("paste");
    }

    @PostMapping("/")
    public ModelAndView postPaste(@RequestParam("language") String language,
                                  @RequestParam("code") String code,
                                  @RequestParam("codeName") String name){

        Code c = new Code();
        c.setCode(code);
        c.setLanguage(language);
        c.setName(name);
        csi.addRecord(c);
        Integer id = c.getId();
        System.out.println(id);
        return new ModelAndView("redirect:/"+id+"/");
    }

    @GetMapping("/{id}")
    public ModelAndView codePage(@PathVariable Integer id){
        Code code = csi.getOneRecord(id);
        ModelAndView modelAndView = new ModelAndView("code");
        String url = "http://zui.one/" + id + "/";
        modelAndView.addObject("code", code);
        modelAndView.addObject("url", url);
        return modelAndView;
        }
    }


