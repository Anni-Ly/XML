package sample;
import jakarta.xml.bind.annotation.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@XmlRootElement
//Optional: set the order of the elements

public class Summary {
    public Summary(LocalDate parse, String s, String britisk, String s1) {
        this.Dato = null;
        this.Postnr = null;
        this.CoronaVariant = null;
        this.Smittetal = null;
    }
    public Summary(DateTimeFormatter Dato, int Postnr, String CoronaVariant, int Smittetal) {
        this.Dato = Dato;
        this.Postnr = Postnr;
        this.CoronaVariant = CoronaVariant;
        this.Smittetal = Smittetal;
    }
    private DateTimeFormatter Dato;
    private Integer Postnr;
    private String CoronaVariant;
    private Integer Smittetal;

    public DateTimeFormatter getDato() { return Dato; }
    @XmlElement(name = "Dato")
    public void setDate(DateTimeFormatter Date) {
        Dato = Date;
    }
    public int getPostnr() { return Postnr; }
    @XmlElement(name = "Postnr")
    public void setPostnumber(int Postnumber) {
        Postnr = Postnumber;
    }
    public String getCoronaVariant() { return CoronaVariant; }
    @XmlElement(name = "CoronaVariant")
    public void setVariantCorona(String VariantCorona) {
        CoronaVariant = VariantCorona;
    }

    public int getSmittetal () { return Smittetal; }
    @XmlElement(name = "Smittetal")
    public void setNumberofincidents(int numberofincidents) {
        Smittetal = numberofincidents;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "Dato:'" + Dato + '\'' +
                ", Postnr:" + Postnr +
                ", CoronaVariant:" + CoronaVariant+
                ", Smittetal" + Smittetal +
                '}';
    }
}


