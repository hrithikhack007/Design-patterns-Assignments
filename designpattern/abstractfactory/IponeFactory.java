package net.media.training.designpattern.abstractfactory;

class IphoneFactory implements PhoneFactory {

    @Override
    public Processor createProcessor(){
        return new IphoneProcessor();
    }

    @Override
    public MotherBoard assembleMotherboard(){
      MotherBoard motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(createProcessor());
        return motherBoard;
    }
    @Override

    public Screen assembleScreen(){
        Screen screen = new IphoneScreen();
        return screen;
    }

    @Override

    public Case assembleCase(MotherBoard motherBoard, Screen screen){
       Case phoneCase = new IphoneCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
       return phoneCase;
    }


}
