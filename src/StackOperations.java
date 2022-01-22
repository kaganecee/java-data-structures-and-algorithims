package Stack;

public class StackOperations {
    public static boolean search(Stack s,int val){
        Stack temp = new Stack(s.size());
        boolean found=false;
        while(!s.isEmpty()){
            int topElement=s.pop();
            if(topElement==val){
                found=true;
                break;
            }
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }

        return found;
    }
}
