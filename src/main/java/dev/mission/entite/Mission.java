package dev.mission.entite;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe représentant l'entité mission
 * 
 * @author antoinelabeeuw
 *
 */
@Entity
@Table(name = "mission")
public class Mission {
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/** libelle */
	private String libelle;
	/** dateDebut */
	private LocalDate dateDebut;
	/** dateFin */
	private LocalDate dateFin;
	/** tauxJournalier */
	private BigDecimal tauxJournalier;

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter
	 * 
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter
	 * 
	 * @return the tauxJournalier
	 */
	public BigDecimal getTauxJournalier() {
		return tauxJournalier;
	}

	/**
	 * Setter
	 * 
	 * @param tauxJournalier the tauxJournalier to set
	 */
	public void setTauxJournalier(BigDecimal tauxJournalier) {
		this.tauxJournalier = tauxJournalier;
	}

	/**
	 * Constructeur
	 * 
	 * @param libelle
	 * @param dateDebut
	 * @param dateFin
	 * @param tauxJournalier
	 */
	public Mission(String libelle, LocalDate dateDebut, LocalDate dateFin, BigDecimal tauxJournalier) {
		this.libelle = libelle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tauxJournalier = tauxJournalier;
	}

	/**
	 * Constructeur
	 * 
	 */
	public Mission() {
		super();
	}

}
