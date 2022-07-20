/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StoriesForEveryone.service;

import com.StoriesForEveryone.entity.Usuario;
import com.StoriesForEveryone.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuario> getALLUsuario() {
      return (List<Usuario>)usuarioRepository.findAll();
        
    }

    @Override
    public Usuario getUsuarioById(long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void delete(long id) {
    usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findByNombre(String nombre) {
       return usuarioRepository.findByNombre(nombre);
        }

}
