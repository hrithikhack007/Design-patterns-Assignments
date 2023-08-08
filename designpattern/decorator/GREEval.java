package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:28:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GREEval extends BaseEvaluator{

    public GREEval(Criteria wrapped){
        super(wrapped);
    }

    @Override
    public boolean evaluate(Application theApp) {

        boolean result =  (super.evaluate(theApp) && theApp.getGre() > 329);
        System.out.println("GREEval called");
        return result;
    }
}
