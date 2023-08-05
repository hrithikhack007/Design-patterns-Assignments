package net.media.training.designpattern.abstractfactory;

public class Main {

    public  static  void main(String [] args){

        PhoneFactory phoneFactory = new IphoneFactory();
        MotherBoard motherBoard =  phoneFactory.assembleMotherboard();
        Screen screen = phoneFactory.assembleScreen();
        Case phoneCase = phoneFactory.assembleCase(motherBoard,screen);

    }
}
