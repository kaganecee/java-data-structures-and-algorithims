package Stack;

public class BinarySearchTree<T extends Comparable> {
    private TNode<T> root;

    public int findHeight(){
        return findHeight(root);
    }
    public int findHeight(TNode<T> currentRoot){
        if(currentRoot!=null){
            int left = findHeight(currentRoot.left);
            int right = findHeight(currentRoot.right);
            return(left>right ? left+1 : right+1);
        }
        return 0;
    }

    public boolean search(T val){
        TNode<T> iterator = root;
        while(iterator!=null){
            if(val.compareTo(iterator.value)==0){
                return true;
            }else if(val.compareTo(iterator.value)==1){
                iterator=iterator.right;
            }else{
                iterator=iterator.left;
            }
        }
        return false;
    }
//    public void encodes(T val){
//        TNode<T> iterator = root;
//        while(iterator!=null){
//            if(val.compareTo(iterator.value)==0){
//                return true;
//            }else if(val.compareTo(iterator.value)==1){
//                iterator=iterator.right;
//            }else{
//                iterator=iterator.left;
//            }
//        }
//    }
//    public void sortHeapTree() {
//        TNode<T> iterator = root;
//        while(iterator!=null){
//            if(iterator.value.compareTo(iterator.left.value))
//        }


    public boolean searchRecursively(T val){
        return searchRecursively(root, val);
    }
    public boolean searchRecursively(TNode<T> currentRoot, T val){
        if(currentRoot==null){
            return false;
        }else if(val.compareTo(currentRoot.value)==-1){
            return searchRecursively(currentRoot.left,val);
        }else if(val.compareTo(currentRoot.value)==1){
            return searchRecursively(currentRoot.right,val);
        }else{
            return true;
        }
    }

    public void insert(T val){
        TNode<T> newNode = new TNode<T>(val);
        if(root==null){
            root=newNode;
        }else{
            TNode<T> iterator=root;
            while(iterator!=null){
                if(val.compareTo(iterator.value)==-1){
                    if(iterator.left == null){
                        iterator.left=newNode;
                        return;
                    }else{
                        iterator=iterator.left;
                    }
                }else if(val.compareTo(iterator.value)==1){
                    if(iterator.right == null){
                        iterator.right=newNode;
                        return;
                    }else{
                        iterator=iterator.right;
                    }

                }else{
                    System.out.println("the same value exist");
                    return;
                }
            }
        }
    }
//    // BUNLARI YAP*
//    public void findParent(T val){
//        TNode<T> iterator = root;
//        while(iterator!=null){
//            if(val.compareTo(iterator.value)==0){
////                return true;
//            }else if(val.compareTo(iterator.value)==1){
//                iterator=iterator.right;
//            }else{
//                iterator=iterator.left;
//            }
//        }
//    }
//    public void findInorderSuccessor(){
//        inorder(root); //recursive function
//        System.out.println();
//    }
//    public void findNode(T val){
//        TNode<T> iterator = root;
//        while(iterator!=null){
//            if(val.compareTo(iterator.value)==0){
//                System.out.println(iterator);
//            }else if(val.compareTo(iterator.value)==1){
//                iterator=iterator.right;
//            }else{
//                iterator=iterator.left;
//            }
//        }
//    }
//    public void findNumberofElements(){
//        inorder(root); //recursive function
//        System.out.println();
//    }
//    public void findNumberofElements(TNode<T> currentRoot){ //left root right
//        if(currentRoot!=null){
//            inorder(currentRoot.left);
//            System.out.println(currentRoot.value);
//            inorder(currentRoot.right);
//            System.out.println(currentRoot.value);
//        }
//    }

    // recursive function => Döngüler gibi çalıştıklarından dolayı yapılan işin bir sınırı olmalı ve
    // her bir adımdan sonra fonksiyonumuzun bu sınıra yaklaştığından emin olmalıyız.
    public void inorder(){
        inorder(root); //recursive function
        System.out.println();
    }
    public void inorder(TNode<T> currentRoot){ //left root right
        if(currentRoot!=null){
            inorder(currentRoot.left);
            System.out.println(currentRoot.value);
            inorder(currentRoot.right);
            System.out.println(currentRoot.value);
        }
    }
}
