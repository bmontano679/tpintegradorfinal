package com.example.demo1.repositories;
import com.example.demo1.models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long>{
   //CrudRepository hace toda la magia de Spring
//**************2da etapa ***********************
public abstract ArrayList<UsuarioModel> findByConsulta(String consulta);
}
