/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package web.farmacia.service;

import java.util.List;
import web.farmacia.domain.Medicamento;



public interface MedicamentoService {

    public List<Medicamento> getMedicamentos();
    public void save(Medicamento medicamento);
    public void delete(Medicamento medicamento);
    public Medicamento getMedicamento(Medicamento medicamento);
}
