import java.util.*;
class Main{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1); st.add(2); st.add(3); st.add(4); st.add(5);
//        stackReverse(st);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    public static void stackReverse(Stack<Integer> st){
        if(st.size() == 0) return;
        int temp = st.pop();
        stackReverse(st);
        st.push(temp);
    }
}