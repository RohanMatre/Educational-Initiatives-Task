interface ThirdPartyLibrary {
    void doSomething();
}

class LegacyLibrary implements ThirdPartyLibrary {
    @Override
    public void doSomething() {
        System.out.println("Legacy library doing something");
    }
}

interface ModernLibrary {
    void performAction();
}

class LibraryAdapter implements ModernLibrary {
    private ThirdPartyLibrary legacyLibrary;

    public LibraryAdapter(ThirdPartyLibrary legacyLibrary) {
        this.legacyLibrary = legacyLibrary;
    }

    @Override
    public void performAction() {
        legacyLibrary.doSomething();
    }
}