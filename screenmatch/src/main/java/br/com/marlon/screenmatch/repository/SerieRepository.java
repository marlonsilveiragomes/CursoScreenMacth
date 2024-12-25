package br.com.marlon.screenmatch.repository;

import br.com.marlon.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}

