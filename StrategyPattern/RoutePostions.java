package StrategyDesignPattern.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class RoutePostions {
    private List<RouteUnit> routes;
    private StrategyInterface strategy;
    RoutePostions(StrategyInterface strategy){
        this.strategy = strategy;
        this.routes = new ArrayList<>();
    }
    public void addRoutes(RouteUnit routeUnits){
        routes.add(routeUnits);
    }
    public List<RouteUnit> getRoutes(){
        return this.routes;
    }
    public RouteUnit getPosition(RouteUnit routeUnit){
        return this.strategy.getNeighbourRoute(this, routeUnit);
    }
}
