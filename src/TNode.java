package Stack;

public class TNode<T extends Comparable> {
    public T value;
    public TNode<T> left;
    public TNode<T> right;

    public TNode(T val){
        this.value=val;
        this.right=this.left=null;
    }
    public String toString(){
        return this.value.toString();
    }
}
