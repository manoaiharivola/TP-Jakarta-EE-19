/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.manoa.iharivola.tp2prgjsfmanoaiharivola19.jsf;

import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named(value = "bean3")
@RequestScoped
public class Bean3 {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    public String afficher() {
        return "affichage__4?nb=" + nombre + "&faces-redirect=true";
    }
}
