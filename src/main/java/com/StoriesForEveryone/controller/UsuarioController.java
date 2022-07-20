/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StoriesForEveryone.controller;

import com.StoriesForEveryone.entity.Blog;
import com.StoriesForEveryonea.entity.Usuario;
import com.StoriesForEveryone.service.IBlogService;
import com.StoriesForEveryone.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;
    @Autowired
    private IBlogService blogService;

    @GetMapping("/index")
    public String index(Model model) {
        List<Usuario> listaUsuario = usuarioService.getALLUsuario();
        model.addAttribute("titulo", "Tabla Usuario");
        model.addAttribute("usuarios", listaUsuario);
        //retorna el html 
        return "index";

    }

    @GetMapping("/signup")
    public String crearUsuario(Model model) {
        List<Blog> listaBlog = blogService.listBlog();
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("blog", listaBlog);
        return "profile";

    }

    @PostMapping("/save")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.saveUsuario(usuario);

        return "redirect:/index";
    }

    @GetMapping("/editUsuario/{id}")
    public String editarUsuario(@PathVariable("id") Long idUsuario, Model model) {
        Usuario usuario = usuarioService.getUsuarioById(idUsuario);
        List<Blog> listaBlog = blogService.listBlog();
        model.addAttribute("usuario", usuario);
        model.addAttribute("blog", listaBlog);
        return "signup";
    }

    @GetMapping("/delete/{id}")
    public String editarUsuario(@PathVariable("id") Long idUsuario) {
        usuarioService.delete(idUsuario);

        return "redirect:/index";
    }
}
