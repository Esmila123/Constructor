class Company {

    public Company (){
        String name = "OpenIT";
    }

    public class Subsidiary{

        public static void main(String[] args) {
            Company c = new Company();
            System.out.println("Company Name : " + c.name);
        }
    }


}
