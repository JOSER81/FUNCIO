package services;

import com.example.demo.Demomodels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositores.demorepositores;

import java.util.List;

@Service
public class Demoservices {
    @Autowired
    private demorepositores  demorepositores;

    public List<Demomodels> findALL(){
        return demorepositores.findAll();

    }

    public Demomodels buscarPorId(Long ID){
        return demorepositores.findAll(ID).get();

    }

    public Demomodels criarPessoa(Demomodels  demomodels){

    }




}
