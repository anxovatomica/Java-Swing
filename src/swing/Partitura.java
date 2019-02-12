/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author dam
 */
public class Partitura {
    /* Toda partitura tiene un código que le
da el usuario para identificarla. No puede haber dos partituras del mismo
usuario con el mismo código. Además se guardará título de la canción,
artista (cantante o grupo), instrumento para el que es la partitura (que
puede ser: piano, batería, guitarra, flauta o bajo), género musical, nivel
de dificultad (alto, medio, bajo) y si está impresa o no*/
    private int id;
    private String title;
    private String artist;
    private String instrument;
    private String genre;
    private String level;

    public Partitura(int id, String title, String artist, String instrument, String genre, String level) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.instrument = instrument;
        this.genre = genre;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
}
