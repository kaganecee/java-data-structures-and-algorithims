package Stack;

public class Edge <T extends Comparable>{
    T vertexId;
    int weight;
    Edge<T> next;
    public Edge(T id,int weight){
        vertexId=id;
        this.weight=weight;
        next=null;
    }
}
