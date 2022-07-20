/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.StoriesForEveryone.service;

import java.util.List;

/**
 *
 * @author carlo
 */
public interface IUsuarioService {
       public  List<Usuario> getALLUsuario();
    public Usuario getUsuarioById (long id);
    public void saveUsuario(Usuario Usuario);
    public void delete (long id);
    public Usuario findByNombre(String nombre);
}
