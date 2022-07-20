/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StoriesForEveryone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author carlo
 */
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    
        
        
        
    }

    @Override
    public List<Object> getALLUsuario() {
       return (List<Persona>)personaRepository.findAll(); 
        }

    @Override
    public Object getUsuarioById(long id) {
       return personaRepository.findById(id).orElse(null); 
        }

    @Override
    public void saveUsuario(Object Usuario) {
          personaRepository.save(persona);
        }

    @Override
    public void delete(long id) {
     personaRepository.deleteById(id);
        }

    @Override
    public Object findByNombre(String nombre) {
       return personaRepository.findByNombre(nombre);
        }

}
