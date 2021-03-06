package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
@Profile("insert")
public class InsererMission implements CommandLineRunner {
	private MissionRepository missionRepository;

	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Mission mission = new Mission();
		mission.setLibelle("Mission 1");
		mission.setTauxJournalier(new BigDecimal("100.90"));
		mission.setDateDebut(LocalDate.of(2019, 1, 1));
		mission.setDateFin(LocalDate.of(2019, 3, 4));
		this.missionRepository.save(mission);

		Mission mission2 = new Mission();
		mission2.setLibelle("Mission 2");
		mission2.setTauxJournalier(new BigDecimal("90"));
		mission2.setDateDebut(LocalDate.of(2011, 2, 3));
		mission2.setDateFin(LocalDate.of(2011, 3, 4));
		this.missionRepository.save(mission2);

		Mission mission3 = new Mission();
		mission3.setLibelle("Mission 3");
		mission3.setTauxJournalier(new BigDecimal("90.10"));
		mission3.setDateDebut(LocalDate.of(2018, 2, 4));
		mission3.setDateFin(LocalDate.of(2019, 4, 2));
		this.missionRepository.save(mission3);

		Mission mission4 = new Mission();
		mission4.setLibelle("Mission 4");
		mission4.setTauxJournalier(new BigDecimal("12"));
		mission4.setDateDebut(LocalDate.of(2020, 2, 2));
		mission4.setDateFin(LocalDate.of(2020, 2, 3));
		this.missionRepository.save(mission4);

		Mission mission5 = new Mission();
		mission5.setLibelle("Mission 5");
		mission5.setTauxJournalier(new BigDecimal("103.5"));
		mission5.setDateDebut(LocalDate.of(2019, 6, 23));
		mission5.setDateFin(LocalDate.of(2019, 6, 30));
		this.missionRepository.save(mission5);

	}
}