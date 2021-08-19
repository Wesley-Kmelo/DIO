//aqui foi criada uma interface que implementa tambem a interface comparable, e cuja função é fornecer os métodos
//necessários para uma classe poder trabalhar com os objetos em si.

package one.digitalinnovation.model;

public abstract class ObjArvore<T> implements  Comparable<T> {
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public String toString;

}
