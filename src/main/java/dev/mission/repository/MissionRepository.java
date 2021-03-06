package dev.mission.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.mission.entite.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> {
	@Query("SELECT m FROM Mission m WHERE m.dateDebut >CURRENT_DATE AND m.tauxJournalier>=?1")
	List<Mission> ListerProchainesMissionsParTJM(BigDecimal tauxMin);

	@Query("SELECT m FROM Mission m WHERE m.dateDebut>=?1")
	List<Mission> findByDateDebutGreaterThanEqual(LocalDate dateMin);
}
