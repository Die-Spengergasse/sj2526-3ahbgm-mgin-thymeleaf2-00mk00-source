package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
@Table(name = "m_medikamente")
public class Medikamente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private int id;
    private String Wirkstoff;
    @Column(name = "m_verfallsdatum")
    private LocalDate Verfallsdatum;
    @Column(name = "m_rezeptpflichtig")
    private boolean rezeptpflichtig;
    @Column(name = "m_menge")
    private int menge;
    @Column(name = "m_einnahmedauer")
    private String einnahmedauer;



    public String getWirkstoff() {
        return Wirkstoff;
    }

    public void setWirkstoff(String wirkstoff) {
        Wirkstoff = wirkstoff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getVerfallsdatum() {
        return Verfallsdatum;
    }

    public void setVerfallsdatum(LocalDate verfallsdatum) {
        Verfallsdatum = verfallsdatum;
    }

    public boolean isRezeptpflichtig() {
        return rezeptpflichtig;
    }

    public void setRezeptpflichtig(boolean rezeptpflichtig) {
        this.rezeptpflichtig = rezeptpflichtig;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public String getEinnahmedauer() {
        return einnahmedauer;
    }

    public void setEinnahmedauer(String einnahmedauer) {
        this.einnahmedauer = einnahmedauer;
    }

    @Override
    public String toString() {
        return "Medikamente [Wirkstoff=" + Wirkstoff + ", id=" + id + ", Verfallsdatum=" + Verfallsdatum + "]";
    }

}
