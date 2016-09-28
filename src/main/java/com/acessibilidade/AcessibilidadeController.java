package com.acessibilidade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessibilidadeController {

    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/tabelas")
    public String tabelas(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "tabelas";
    }
	
    @RequestMapping("/formularios")
    public String formularios(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "formularios";
    }	
	
	@RequestMapping("/imagens")
    public String imagens(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "imagens";
    }	
	
	@RequestMapping("/cores")
    public String cores(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "cores";
    }		
	
	@RequestMapping("/medidas")
    public String medidas(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "medidas";
    }

	@RequestMapping("/msgFormularios")
    public String msgFormularios(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "mensagens-formulario";
    }	
}