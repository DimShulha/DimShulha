package counts;

import models.Personel;
import view.PersonelView;

import utils.Rounder;

public class PersonelCount {

    Personel model;
    PersonelView views;

    public void PersonelCount(Personel model, PersonelView views){
        this.model = model;
        this.views = views;
    }

    public void countPersonel(){

        views.InputText();

        String name = model.getName();

        double salary = model.calcSalary(model.getSalary(), model.getHours());
        String roundSalary = Rounder.roundValue(salary);

        String out = "------------------------\n" +
                "Имя работника - " + name + "\n" +
                "Сумма заработной платы" + salary;

        views.Output(out);

    }


}
