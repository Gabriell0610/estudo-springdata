package com.jornada.mentoria.mentoriaapi.repositories;

import com.jornada.mentoria.mentoriaapi.entity.Mentoria;
import com.jornada.mentoria.mentoriaapi.entity.Modulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Integer>{

}
