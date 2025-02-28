package com.pau.personal.model.entitats;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ARTISTA")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    long id;
    String name;
    int birth;
    String country;
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "artistaName")
    String artista_Name;

    String actual_Image;

    @OneToMany(mappedBy = "artista_id")
    @JsonIgnoreProperties("artista")
    List<Album> albums;

    public Artista() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getCountry() {
        return country;
    }

    public String getArtista_Name() {
        return artista_Name;
    }

    public String getActual_Image() {
        return actual_Image;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Album> getAlbums() {
        return albums;
    }
}
