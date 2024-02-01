import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String descrizione;
    private OffsetDateTime scadenza;
    private Boolean iscompleto;
    private final Integer id;
    static Integer counter = 0;


    public Task(String descrizione, OffsetDateTime scadenza, Boolean iscompleto) {
        counter++;
        this.descrizione = descrizione;
        this.scadenza = scadenza;
        this.iscompleto = iscompleto;
        this.id = counter;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public OffsetDateTime getScadenza() {
        return scadenza;
    }

    public void setScadenza(OffsetDateTime scadenza) {
        this.scadenza = scadenza;
    }

    public Boolean getIscompleto() {
        return iscompleto;
    }

    public void setIscompleto(Boolean iscompleto) {
        this.iscompleto = iscompleto;
    }

    public Integer getId() {
        return id;
    }

    public void stampaDettagli() {
        System.out.println("ID: " + id + " descrizione: " + descrizione + " scadenza: " + scadenza.format(DateTimeFormatter.ofPattern("dd/MM/yy")) + " comleto? " + iscompleto);
    }
}
