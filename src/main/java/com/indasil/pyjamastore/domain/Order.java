package com.indasil.pyjamastore.domain;

/**
 * Created by Ady on 1/26/17.
 */
public class Order {
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
