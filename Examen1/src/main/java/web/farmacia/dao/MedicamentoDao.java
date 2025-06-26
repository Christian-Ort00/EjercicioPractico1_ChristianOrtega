/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package web.farmacia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.farmacia.domain.Medicamento;


public interface MedicamentoDao extends JpaRepository<Medicamento, Long>{

}
