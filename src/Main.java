import java.util.*;
class Main{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1); st.add(2); st.add(3); st.add(4); st.add(5);
        stackReverse(st);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    public static void stackReverse(Stack<Integer> st){
        if (st.isEmpty()) return;

        int temp = st.pop();
        stackReverse(st);
        insertBottom(st, temp);
    }
    public static void insertBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);  // once we empty the stack it will insert the desired element
            return;
        }
        // also the recursion continues and add the popped elements
        int temp = st.pop();
        insertBottom(st,x);
        st.push(temp); // after reaching base condition, it will push temp one by one for each recursion

    }
}