public class Lab {
    private Student[] students;
    private float avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * create new lab with a given capacity and day
     * @param cap
     * @param d
     */
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
            for(int i=0 ;i < currentSize ; i++ ){
                students[i].print();
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

    /** get the average of labs
     *
     * @return avg field
     */
    public float getAvg(){
            calculateAvg();
            return avg ;
        }
        public void calculateAvg(){
        float sum = 0 ;
        int cnt = 0;
            for(int i = 0 ; i < currentSize ; i++){
                sum += students[i].getGrade();
                cnt ++ ;
            }
        avg = sum / cnt;
        }

        /**
         * get the day
         * @return day field
         */
        public String getDay() {
            return day ;
        }

    /**
     *
     * @param day set day of lab
     */
    public void setDay(String day) {
            this.day = day ;
        }

    /**
     * get capacity of lab
     * @return capacity
     */
    public int getCapacity() {
            return capacity ;
        }

    /**
     * set capacity of lab
     * @param capacity
     */
    public void setCapacity(int capacity) {
            this.capacity = capacity ;
        }


}

