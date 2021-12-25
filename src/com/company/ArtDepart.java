package com.company;

//отдел художественной литературы
public class ArtDepart extends Depart {

    public ArtDepart() {
        super();
    }

    @Override
    public String toString() {
        return "Отдел художественной литературы; кол-во книг = " + getSize();
    }

}
