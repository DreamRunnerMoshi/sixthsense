package com.sixthsense;

public class PointR {
    public double X, Y;    
    public int T;

    public PointR(double X, double Y) {
        this.X = X;
        this.Y = Y;
        this.T = 0;
    }

    public PointR(double X, double Y, double T) {
        this.X = X;
        this.Y = Y;
        this.T = T;
    }   

    public PointR(PointR p) {
        X = p.X;
        Y = p.Y;
        T = p.T;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        } 

        return ((this.X == o.X) && (this.Y == o.Y) && (this.T == o.T));       
    }       

    
}
