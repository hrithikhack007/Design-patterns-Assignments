package net.media.training.designpattern.decorator;

public class BaseEvaluator implements Criteria{

    private final Criteria wrapped;
    public BaseEvaluator(Criteria wrapped){
        this.wrapped = wrapped;
    }

    @Override
    public boolean evaluate(Application theApp) {
        return wrapped.evaluate(theApp);
    }
}
