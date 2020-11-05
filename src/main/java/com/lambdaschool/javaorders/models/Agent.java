package com.lambdaschool.javaorders.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agentcode;
    @Column(unique = true, nullable = false)
    private String agentname;
    private String workingarea;
    private double commission;
    private String phone;
    private String country;
    @OneToMany(mappedBy = "agentcode",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    List<Customer> custs = new ArrayList<>();


    public Long getAgentcode() {
        return agentcode;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
