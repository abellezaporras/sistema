package net.clinica.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import net.clinica.dao.MedicamentoRepository;
import net.clinica.entity.Medicamento;



@Service
public class MedicamentoService extends ICRUDImpl<Medicamento, Integer>{
	@Autowired
	private MedicamentoRepository repo;

	@Override
	public JpaRepository<Medicamento, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return repo;
	}


	
	
}
