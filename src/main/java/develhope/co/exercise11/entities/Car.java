package develhope.co.exercise11.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Car {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private String serialNumber;
    @Column(nullable = true)
    private String currentPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Car(Long id, String modelName, String serialNumber, String currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                '}';
    }
}
