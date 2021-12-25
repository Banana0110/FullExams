package com.company;

//отдел технической литературы
public class TechDepart extends Depart {

    boolean computer; //есть компьютер или нет

    public TechDepart(boolean computer) {
        super();
        this.computer = computer;
    }

    @Override
    public String toString() {
        String comp;
        if (computer) {
            comp = "с компьютером";
        } else {
            comp = "без компьютера";
        }
        return "отдел технической литературы " + comp + "; кол-во книг = " + getSize();
    }

}
