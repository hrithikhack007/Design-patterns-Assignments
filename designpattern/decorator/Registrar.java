package net.media.training.designpattern.decorator;


/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:24:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class Registrar {

    public boolean evaluate(Application theApp, Criteria criteria) {
        return criteria.evaluate(theApp);
    }

    public static void main(String[] args) {

        Application app = new Application(9,330,110);

        Criteria criteria = new TOEFL(new GREEval(new GPAEval()));
        System.out.println(criteria.evaluate(app));

    }

}


