package StrategyDesignPattern;

public class Client {

    public static void main(String[] args) {
        RoutePostions routePostions = new RoutePostions(new FastestTimeStrategy());
        for(int i = 1 ; i < 50 ; i++){
            routePostions.addRoutes(new RouteUnit(i));
        }
        RouteUnit unit = routePostions.getPosition(new RouteUnit(10));


    }
}
