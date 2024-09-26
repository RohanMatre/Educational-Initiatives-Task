// 1. Observer Pattern:
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

interface Observer {
    void update(Subject subject);
}

class Stock implements Subject {
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

class Investor implements Observer {
    @Override
    public void update(Subject subject) {
        Stock stock = (Stock) subject;
        System.out.println("Investor: Stock price changed to " + stock.getPrice());
    }
}