package Stack;

public class Graph <T extends Comparable> {
    Vertex<T> head;

    public void addVertex(T id){
        Vertex<T> temp=new Vertex(id);
        Vertex<T> iterator=head;
        if(head==null) {
            head = temp;
        }else {
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = temp;
            }
        }


    public void addEdge(T startId, T endId,int weight){

        Vertex<T> current=findVertex(startId);
        if(current==null)
            System.out.println("no vertex exist with this id");
        else{
            Edge<T> iterator=current.edgeLink;
            if(iterator==null){
                current.edgeLink = new Edge(endId,weight);
            }else{
                while(iterator.next!=null)
                    iterator=iterator.next;
                iterator.next=new Edge(endId,weight);
            }

        }
    }
    public Vertex<T> findVertex(T id){
        Vertex<T> iterator=head;
        while(iterator!=null){
            if(iterator.id==id)
                return iterator;
            iterator=iterator.next;
        }
        return null;
    }
    public void display(){
         Vertex<T> iterator=head;
         while(iterator!=null){
             System.out.print(iterator.id+"--->");
             Edge<T> iteratorEdge=iterator.edgeLink;
             while(iteratorEdge!=null){
                 System.out.print(iteratorEdge.vertexId+" ");
                 iteratorEdge=iteratorEdge.next;
             }
             System.out.println();
             iterator=iterator.next;
         }

    }
    public void outdegree(T id){
        Vertex<T> current=findVertex(id);
        Edge<T> iteratorEdge=current.edgeLink;
        while(iteratorEdge!=null){
            System.out.println(iteratorEdge.vertexId);
            iteratorEdge=iteratorEdge.next;
        }
    }
    public void indegree(T id){
        Vertex<T> current=findVertex(id);
        Vertex<T> iterator=head;
        while(iterator!=null){
            Edge<T> iteratorEdge=iterator.edgeLink;
            while(iteratorEdge!=null){
                if(iteratorEdge.vertexId==current.id){
                    System.out.println(iterator.id);
                }
                iteratorEdge=iteratorEdge.next;
            }
            iterator=iterator.next;
        }
    }
    public void findTopologicalOrderFirstPoint(){
        Vertex<T> temp=head;
        Vertex<T> iterator=head;
        while(iterator!=null){
            Edge<T> iteratorEdge=iterator.edgeLink;
            while(iteratorEdge!=null){
                while(temp.next!=null) {
                    if (iteratorEdge.vertexId == temp.id) {
                        temp = temp.next;
                    }else{
                        temp = temp;
                    }
                    temp = temp.next;
                }
                iteratorEdge=iteratorEdge.next;
            }
            iterator=iterator.next;
        }
        System.out.println(temp.id);
    }
    public void adjacencyMatrix(){
        Vertex<T> iterator=head;
        while(iterator!=null){
            Edge<T> iteratorEdge=iterator.edgeLink;
            if(iteratorEdge==null)
                System.out.println(iterator.id+"| 0 for every value");
            while(iteratorEdge!=null){
                System.out.println(iterator.id+"|"+iteratorEdge.vertexId+"(1)");
                iteratorEdge=iteratorEdge.next;
            }
            iterator=iterator.next;
        }
        System.out.println("Outputta çıkmayan değerler arasında edge yoktur,0 alır. örneğin 1|2 (0)");
    }
    public void weight(){
        Vertex<T> iterator=head;
        int sum=0;
        Edge<T> iteratorEdge=iterator.edgeLink;
        while(iterator!=null){
            while(iteratorEdge!=null){
                sum=sum+ iteratorEdge.weight;
                iteratorEdge=iteratorEdge.next;
            }
            iterator = iterator.next;
        }
        System.out.println(sum);
    }
}
