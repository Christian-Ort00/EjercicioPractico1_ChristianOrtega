/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package web.farmacia.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.farmacia.dao.MedicamentoDao;
import web.farmacia.domain.Medicamento;
import web.farmacia.service.MedicamentoService;

/**
 *
 * @author Usuario
 */

@Service
public class MedicamentoServiceImpl  implements MedicamentoService{

    
    @Autowired
    private MedicamentoDao medicamentoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Medicamento> getMedicamentos() {
        return medicamentoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Medicamento med) {
        medicamentoDao.save(med);
    }

    @Override
    @Transactional
    public void delete(Medicamento med) {
        medicamentoDao.delete(med);
    }

    @Override
    @Transactional(readOnly = true)
    public Medicamento getMedicamento(Medicamento med) {
        return medicamentoDao.findById(med.getId()).orElse(null);
    }
}
