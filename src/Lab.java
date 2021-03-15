public class Lab {
    private Student[] students;
    private float avg;
    private String day;
    private int capacity;
    private int currentSize;
    public Lab(int cap, String d) {
        capacity = cap ;
        students = new Student[cap] ;
        day = d ;
    }
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }
        public void print() {
            for(Student std : students){
                std.print();
            }
            calculateAvg();
            System.out.println( "Average:" + avg);
        }
        public Student[] getStudents() {
            return students ;
        }
        public void setStudents(Student[] students) {
            this.students = students ;
        }
        public int getAvg(){
            return avg ;
        }
        public void calculateAvg(){
        float sum = 0 ;
        int cnt = 0;
            for(Student std : students){
            sum += std.getGrade();
            cnt ++ ;
            }
        avg = sum / cnt;
        }
        public String getDay() {
            return day ;
        }
        public void setDay(String day) {
            this.day = day ;
        }
        public int getCapacity() {
            return capacity ;
        }
        public void setCapacity(int capacity) {
            this.capacity = capacity ;
        }

}

