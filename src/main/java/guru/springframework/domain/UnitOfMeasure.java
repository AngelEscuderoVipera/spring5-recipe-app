package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    //este no necesita tener un ingrediente relacionado


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUom() {
        return description;
    }

    public void setUom(String uom) {
        this.description = uom;
    }

}
