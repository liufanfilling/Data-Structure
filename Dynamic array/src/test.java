
public class test {
    public static void main(String[] args) {
        ArrayList<Object> list  = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        list.add(20,100000);
        System.out.println(list);
    }

}
