package counts;

import view.ClientView;
import models.Client;

import utils.Rounder;

public class ClientCount {

    Client models;
    ClientView view;

    public void ClienCount( Client models, ClientView view ) {
        this.models = models;
        this.view = view;
    }

    public void CountApp(){
        view.InputText();

        String name = models.getName();

        double coast = models.calcCoast(models.getPrice(), models.getQuontity());
        String roundCoast = Rounder.roundValue(coast);

        double discount = models.calculDiscount( coast );
        String roundDiscount = Rounder.roundValue(discount);

        double summ = models.calcCoast( coast, discount);
        String roundSumm = Rounder.roundValue(summ);

        String out = "---------------------------\n" +
            "Имя клиента : " + name + "\n" +
            "Cумма покупки : " + roundCoast + "\n" +
            "Сумма скидки : " + roundDiscount + "\n" +
            "Всего к оплате : " + roundSumm + "\n" ;

        view.Output(out);

    }
}
