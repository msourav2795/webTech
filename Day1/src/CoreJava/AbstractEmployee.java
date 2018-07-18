/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJava;

/**
 *
 * @author sourav.mondal
 */
public abstract class AbstractEmployee {
    public abstract double provideIncrement(double factor);
    public abstract String fullName();
    public abstract double provideIncrement(double factor, double sal);
}

