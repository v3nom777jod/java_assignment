public class question6_9 {
        public static void main(String[] args) {
            int math[]={70,55,65,45,80}; // math marks of 5 candidates
            int phys[]={55,60,70,40,75}; // phys marks of 5 candidates
            int chem[]={50,45,60,35,70}; // chem marks of 5 candidates
    
            System.out.println("Eligible candidates:");
            for (int i=0;i<math.length;i++){
                int totalMarks=math[i]+phys[i];
                int totalInThree=math[i]+phys[i]+chem[i];
                if (math[i]>=60 && phys[i]>=50 && chem[i]>=40 &&
                        (totalInThree>=200 || totalMarks>=150)) {
                    System.out.println((i+1) + ". Candidate with math:" + math[i] +
                            " phys:" + phys[i] + " chem:" + chem[i]);
                }
            }
        }
    
}
