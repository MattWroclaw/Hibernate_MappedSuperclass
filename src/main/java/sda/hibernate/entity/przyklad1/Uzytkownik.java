package sda.hibernate.entity.przyklad1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
//tutaj jest pokazane jak jest źle. Że jest tyle pól w jednej klasie
@Entity
@Table(name = "uzytkownik")
public class Uzytkownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    //adres zameldowania
    @Column
    private String ulucaZam;
    @Column
    private String nrDomuZam;
    @Column
    private String nrMieszkaniaZam;
    @Column
    private String kodPocztowyZam;
    @Column
    private String miejscowoscZam;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getUlucaZam() {
        return ulucaZam;
    }

    public void setUlucaZam(String ulucaZam) {
        this.ulucaZam = ulucaZam;
    }

    public String getNrDomuZam() {
        return nrDomuZam;
    }

    public void setNrDomuZam(String nrDomuZam) {
        this.nrDomuZam = nrDomuZam;
    }

    public String getNrMieszkaniaZam() {
        return nrMieszkaniaZam;
    }

    public void setNrMieszkaniaZam(String nrMieszkaniaZam) {
        this.nrMieszkaniaZam = nrMieszkaniaZam;
    }

    public String getKodPocztowyZam() {
        return kodPocztowyZam;
    }

    public void setKodPocztowyZam(String kodPocztowyZam) {
        this.kodPocztowyZam = kodPocztowyZam;
    }

    public String getMiejscowoscZam() {
        return miejscowoscZam;
    }

    public void setMiejscowoscZam(String miejscowoscZam) {
        this.miejscowoscZam = miejscowoscZam;
    }

}
