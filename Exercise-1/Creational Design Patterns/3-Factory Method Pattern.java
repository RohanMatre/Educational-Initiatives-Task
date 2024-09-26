interface Document {
    void print();
}

class TextDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing text document");
    }
}

class PDFDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing PDF document");
    }
}

abstract class DocumentFactory {
    abstract Document createDocument();
}

class TextDocumentFactory extends DocumentFactory {
    @Override
    Document createDocument() {
        return new TextDocument();
    }
}

class PDFDocumentFactory extends DocumentFactory {
    @Override
    Document createDocument() {
        return new PDFDocument();
    }
}