package dio.me.dio_desafio_api.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_recipie")
public class Recipie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TINYINT(1) CHECK (classification BETWEEN 0 AND 5)")
    private Integer classification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }
}
