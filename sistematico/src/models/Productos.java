/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Productos implements Serializable{
    int id;
private String name;
double price;

 public Productos() {
this.id = 0;
this.name = "";
this.price = 0.0;
}

 public Productos(int id, String name, double price) {
this.id = id;
this.name = name;
this.price = price;
}

 public int getId() {
return id;
}

 public void setId(int id) {
this.id = id;
}

 public String getName() {
return name;
}

 public void setName(String name) {
this.name = name;
}

 public double getprice() {
return price;
}

 public void setPrice(double price) {
this.price = price;
}
}
