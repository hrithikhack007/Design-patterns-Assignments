package net.media.training.designpattern.abstractfactory;

public interface PhoneFactory {

    public MotherBoard assembleMotherboard();
    public Screen assembleScreen();

    public Case assembleCase(MotherBoard motherBoard, Screen screen);
}
