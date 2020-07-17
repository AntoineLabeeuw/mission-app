package dev.mission.exec;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
@Profile("lister")
public class ListerMission implements Runnable {
	private MissionRepository missionRepository;

	public ListerMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {

		List<Mission> missions = missionRepository.findAll();
		for (Mission mission : missions) {
			System.out.println(mission.getLibelle() + " : " + mission.getDateDebut() + "-" + mission.getDateFin()
					+ " (taux : " + mission.getTauxJournalier() + ")");
		}

	}

}
