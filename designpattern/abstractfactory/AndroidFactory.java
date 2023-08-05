package net.media.training.designpattern.abstractfactory;

 class AndroidFactory implements PhoneFactory{

     @Override
     public MotherBoard assembleMotherboard(){
         MotherBoard motherBoard = new AndroidMotherBoard();
         motherBoard.attachBattery(new Battery());
         motherBoard.attachProcessor(new AndroidProcessor());
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
