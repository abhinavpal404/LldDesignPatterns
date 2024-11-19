package StrategyDesignPattern;

public class FastestTimeStrategy implements StrategyInterface{

    @Override
    public RouteUnit getNeighbourRoute(RoutePostions routePostions, RouteUnit routeUnit) {
        RouteUnit neighbourRoute = null;
        for(RouteUnit routeUnitListElement : routePostions.getRoutes()){
            // Do Processing to identify neighbour Route.
            neighbourRoute = routeUnitListElement;
        }
        return neighbourRoute;
    }
}