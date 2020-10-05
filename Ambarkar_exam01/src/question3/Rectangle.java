/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class Rectangle {

    private int s1;
    private int s2;
    private int s3;
    private int s4;

    public Rectangle(int s1, int s2, int s3, int s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public int getS1() {
        return s1;
    }

    public int getS2() {
        return s2;
    }

    public int getS3() {
        return s3;
    }

    public int getS4() {
        return s4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rect = (Rectangle) o;
        return s1 == rect.s1
            && s2 == rect.s2
            && s3 == rect.s3
            && s4 == rect.s4;
    }
}
