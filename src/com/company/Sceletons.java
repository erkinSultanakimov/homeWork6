package com.company;

public class Sceletons extends Boss {
    private int countOfArrows;

    @Override
    public String printName() {
        return "Скелет";
    }

    public Sceletons(int countOfArrows) {
        this.countOfArrows = countOfArrows;
    }

    public int getCountOfArrows() {
        return countOfArrows;
    }


    @Override
    public String printInfo() {
        return super.printInfo() + " \n" + getCountOfArrows() + " Количество стрел ";
    }
}
