package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private Integer series;
    @OneToOne (mappedBy = "cars")
    private User user;

    @Override
    public String toString() {
        return model + series;
    }

    public Car(String model, Integer series) {
        this.model = model;
        this.series = series;
    }

    public Car(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public User setUser(User user) {
        this.user = user;
        return user;
    }


}
