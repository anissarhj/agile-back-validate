package com.example.demo.DTO;


import com.example.demo.models.Qualificatif;

public class QuestionDTO {
	
    private Integer id;

    private String type;

    private Qualificatif idQualificatif;

    private String intitule;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Qualificatif getIdQualificatif() {
		return idQualificatif;
	}

	public void setIdQualificatif(Qualificatif idQualificatif) {
		this.idQualificatif = idQualificatif;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
    
    
}
