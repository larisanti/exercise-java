package uninter;

// abstract class: define que um modelo que não pode ser criado/instanciado sozinho
public abstract class Moeda {
    
    // protected: deixa que as subclasses (classes filhas) vejam o valor
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    // método abstract void: não retorna output
    // abstract: significa que o código não está na mãe, pois está no código das filhas
    public abstract void info();
    public abstract double converter();
}