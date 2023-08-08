package net.media.training.designpattern.abstractfactory;

 class AndroidFactory implements PhoneFactory{

     public Processor createProcessor(){
         return new AndroidProcessor();
     }

     @Override
     public MotherBoard assembleMotherboard(){
         MotherBoard motherBoard = new AndroidMotherBoard();
         motherBoard.attachBattery(new Battery());
         motherBoard.attachProcessor(createProcessor());
         return motherBoard;
     }
     @Override

     public Screen assembleScreen(){
         Screen screen = new AndroidScreen();
         return screen;
     }

     @Override

     public Case assembleCase(MotherBoard motherBoard, Screen screen){
         Case phoneCase = new AndroidCase();
         phoneCase.attachMotherBoard(motherBoard);
         phoneCase.attachScreen(screen);
         return phoneCase;
     }
}
