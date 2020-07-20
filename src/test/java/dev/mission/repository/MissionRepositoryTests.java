package dev.mission.repository;

import static org.assertj.core.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import dev.mission.entite.Mission;

@DataJpaTest
public class MissionRepositoryTests {
	@Autowired
	TestEntityManager entityManager;

	@Autowired
	MissionRepository missionRepository;

	@Test
	void findByDateDebutGreaterThanEqual() {
		Mission m = new Mission();
		m.setLibelle("MissionTest");
		m.setTauxJournalier(new BigDecimal("123.456"));
		m.setDateDebut(LocalDate.of(2019, 1, 2));
		m.setDateFin(LocalDate.of(2019, 3, 4));
		entityManager.persist(m);
		List<Mission> missions = missionRepository.findByDateDebutGreaterThanEqual(LocalDate.of(2019, 1, 1));
		System.out.println(missions.get(0).getLibelle());
		assertThat(missions.get(0).getLibelle()).isEqualTo("MissionTest");
	}

	@Test
	void findByDateDebutGreaterThanEqualAndTauxJournalierGreaterThanEqual() {
		Mission m2 = new Mission();
		m2.setLibelle("MissionTest2");
		m2.setTauxJournalier(new BigDecimal("789.123"));
		m2.setDateDebut(LocalDate.of(2020, 10, 10));
		m2.setDateFin(LocalDate.of(2020, 10, 13));
		entityManager.persist(m2);
		List<Mission> missions = missionRepository.ListerProchainesMissionsParTJM(new BigDecimal("700.00"));
		assertThat(missions.get(0).getLibelle()).isEqualTo("MissionTest2");
	}

}
