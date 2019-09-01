package sda.hibernate.entity.przyklad1;

import javax.persistence.*;

@Entity
@Table(name = "uzytkownikextradata2")
public class UzytkownikExtraData2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Embedded
    private Adres adresZameldowania;


//   to poniżej dotyczy adresuKOrespondencyjnego. Trzeba mapować, bo inaczej po stworzeniu
//    adresuZameldowania Hibernate będzie jeszcze raz tworzył to samo przy adresieKorespondecyjnym
//    A gdyby było więcej, to i tak się mapuje z tego pierwotnego
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "ulucaZam", column = @Column(name = "ulucaKor")),
            @AttributeOverride(name = "nrDomuZam", column = @Column(name = "nrDomuKor")),
            @AttributeOverride(name = "nrMieszkaniaZam", column = @Column(name = "nrMieszkaniaKor")),
            @AttributeOverride(name = "kodPocztowyZam", column = @Column(name = "kodPocztowyKor")),
            @AttributeOverride(name = "miejscowoscZam", column = @Column(name = "miejscowoscKor")),
    })
    private Adres adresKorespondencyjny;

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

    public Adres getAdresZameldowania() {
        return adresZameldowania;
    }

    public void setAdresZameldowania(Adres adresZameldowania) {
        this.adresZameldowania = adresZameldowania;
    }

    public Adres getAdresKorespondencyjny() {
        return adresKorespondencyjny;
    }

    public void setAdresKorespondencyjny(Adres adresKorespondencyjny) {
        this.adresKorespondencyjny = adresKorespondencyjny;
    }
}

