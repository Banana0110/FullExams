package com.company;

//юридический отдел
public class LawDepart extends Depart {

    public LawDepart() {
        super();
    }

    @Override
    public String toString() {
        return "Отдел юридической литературы; кол-во книг = " + getSize();
    }

}
