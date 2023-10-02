import java.util.PriorityQueue;

public class PQforObjects {
    public static class PQ {
        static class Student implements Comparable<Student> {
            String name;
            int rank;

            public Student(String name, int rank) {
                this.name = name;
                this.rank = rank;
            }

            @Override
            public int compareTo(Student s2) {
                return this.rank - s2.rank;
            }

        }
    }

    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(name:"A",rank:4));
        pq.add(new Student(name:"B",rank:5));
        pq.add(new Student(name:"C",rank:2));
        pq.add(new Student(name:"D",rank:1));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
    }

}
