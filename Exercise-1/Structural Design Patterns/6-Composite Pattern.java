abstract class Component {
    abstract void operation();
}

class Leaf extends Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}

class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }
}