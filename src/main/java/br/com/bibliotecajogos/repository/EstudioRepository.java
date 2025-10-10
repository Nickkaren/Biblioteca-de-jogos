package br.com.bibliotecajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bibliotecajogos.entity.Estudio;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long> {
}
