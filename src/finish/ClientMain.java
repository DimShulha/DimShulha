package finish;

import models.Client;
import counts.ClientCount;
import view.ClientView;

public class ClientMain {

    public static  void main(String[] args){


    Client models = new Client();
    ClientView view = new ClientView(models);
    ClientCount count = new ClientCount(models,view);

   count.CountApp();


    }
}
