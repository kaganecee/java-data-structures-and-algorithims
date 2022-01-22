package Stack;

public class GenericStack<T extends Comparable<T>> {
    T [] items;
    int top;

    public GenericStack(Class<T> dataType, int size){
        this.top=-1;
        items=(T[])java.lang.reflect.Array.newInstance(dataType,size);
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return items[0];
        }else{
            this.top--;
            return this.items[this.top+1];
        }
    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean isFull(){
        return this.top==this.items.length-1;
    }
    public int size(){
        return this.items.length;
    }
    public T peek(){
        return this.items[this.top];
    }
    public T peekk(){
        return this.items[this.top-1];
    }
    public void clear(){
        this.top=-1;
    }
    public void display(){
        if(!isEmpty()){
            for(int i=top;i>=0;i--){
                System.out.println(this.items[i]);
            }
        }
    }
    // Paranthesis balance.
    //I do examine the balances of the elements from the beginning and the end with the loop, and I do not upload the balanced ones to the stack.
    // If there are unbalanced elements, I push them into the stack.
    public void isBalanced(String paranthesis, GenericStack<Character> paranthesisStack){
        boolean balanced=false;
        for(int i=paranthesis.length()-1,j=0;i>=paranthesis.length()/2;i--,j++){
            if ("(".equals(""+paranthesis.charAt(j)) & ")".equals(""+paranthesis.charAt(i)+"")) {
                balanced = true;
            } else if ("[".equals(""+paranthesis.charAt(j)) & "]".equals(""+paranthesis.charAt(i)+"")) {
                balanced = true;
            } else {
                paranthesisStack.push(paranthesis.charAt(i));
                balanced = false;
            }
        }
        System.out.println("Paranthesis is balanced :" + balanced);
    }
    // Calculate Postfix
    // I'm only pushing integer elements,I don't push the operators elements : I do their calculations in the loop with if statements.
    // Then I push the results.
    public void postFixCalculate(String calculate,GenericStack<Integer> postfixStack){
        for(int i=0;calculate.length()>i;i++){
            if(("+").equals(""+calculate.charAt(i)+"")){
                int element = postfixStack.peek() + postfixStack.peekk(); //peekk() method is peek element which under the top element.
                postfixStack.pop();
                postfixStack.pop();
                postfixStack.push(element);
            }else if(("*").equals(""+calculate.charAt(i)+"")){
                int element = postfixStack.peek() * postfixStack.peekk();
                postfixStack.pop();
                postfixStack.pop();
                postfixStack.push(element);
            }else if(("-").equals(""+calculate.charAt(i)+"")){
                int element = postfixStack.peek() - postfixStack.peekk();
                postfixStack.pop();
                postfixStack.pop();
                postfixStack.push(element);
            }else if(("/").equals(""+calculate.charAt(i)+"")){
                int element = postfixStack.peek() / postfixStack.peekk();
                postfixStack.pop();
                postfixStack.pop();
                postfixStack.push(element);
            }else{
                postfixStack.push(Integer.parseInt(String.valueOf(calculate.charAt(i))));
            }
        }
        postfixStack.display();
    }

    public void push(T val){
        if(isFull()){
            System.out.println("stack is full");
        }else{
            this.items[++this.top]=val;
        }
    }

//    public void push(String val){
//        if(isFull()){
//            System.out.println("stack is full");
//        }else{
//            this.items[++this.top]=Integer.parseInt(val);
//        }
//    }
}
