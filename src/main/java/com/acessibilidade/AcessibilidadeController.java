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
	listaInfos

    @RequestMapping("/listaInfos")
    public String listaInfos(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "listaInfos";
    }
    
	@RequestMapping("/admin")
    public String admin(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "admin";
    }
	
	@RequestMapping("/login")
    public String login(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }	
	
	@RequestMapping("/addInfo")
    public String addInfo(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "add-info";
    }

	@RequestMapping("/infos")
    public String infos(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "infos";
    }	
	
	@RequestMapping("/roles")
    public String roles(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "roles";
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

	@RequestMapping("/progressBar")
    public String progressBar(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "progressBar";
    }	
	
	@RequestMapping("/tabs")
    public String tabs(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "tabs";
    }

	@RequestMapping("/rolesMenus")
    public String rolesMenus(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "roles-menus";
    }

	@RequestMapping("/modal")
    public String modal(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "modal";
    }	

    @RequestMapping("/sobre")
    public String sobre(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "sobre";
    }   
	
	@RequestMapping("/contato")
    public String contato(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "contato";
    }  
}