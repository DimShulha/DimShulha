package finish;

import models.Personel;
import view.PersonelView;
import counts.PersonelCount;


public class PersonelMain {

    public static void main(String[]args){

    Personel model = new Personel();
    PersonelView views = new PersonelView(model);
    PersonelCount count = new PersonelCount(model, views);

    count.countPersonel();


    }
}
