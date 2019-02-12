package com.henrique.dayplanner.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Remedio {

    @Id
    private long id;
    private String nomeRemedio;
    private String intervaloEntreDoses;
    private String volumeDaDose;

    public Remedio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }

    public String getIntervaloEntreDoses() {
        return intervaloEntreDoses;
    }

    public void setIntervaloEntreDoses(String intervaloEntreDoses) {
        this.intervaloEntreDoses = intervaloEntreDoses;
    }

    public String getVolumeDaDose() {
        return volumeDaDose;
    }

    public void setVolumeDaDose(String volumeDaDose) {
        this.volumeDaDose = volumeDaDose;
    }
}
