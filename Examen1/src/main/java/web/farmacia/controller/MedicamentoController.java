/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package web.farmacia.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import web.farmacia.domain.Medicamento;
import web.farmacia.service.MedicamentoService;


@Controller
@Slf4j
@RequestMapping("/medicamento")
public class MedicamentoController {

    
    @Autowired
    private MedicamentoService medicamentoService;


    @GetMapping("/listado")
    public String inicio(Model model) {
        var medicamentos = medicamentoService.getMedicamentos();
        model.addAttribute("medicamentos", medicamentos);
        model.addAttribute("totalMedicamentos", medicamentos.size());
        model.addAttribute("medicamento", new Medicamento()); 
        return "/arbol/listado";
    }


    @GetMapping("/eliminar/{id}")
    public String eliminaMedicamento(Medicamento m) {
        medicamentoService.delete(m);
        return "redirect:/medicamento/listado";
    }


    @GetMapping("/modificar/{id}")
    public String modificaMedicamento(Medicamento m, Model model) {
        m = medicamentoService.getMedicamento(m);
        model.addAttribute("medicamento", m);
        return "/medicamento/modifica";
    }


    @PostMapping("/guardar")
    public String guardaMedicamento(Medicamento med) {
        medicamentoService.save(med);
        return "redirect:/medicamento/listado";
    }
}
