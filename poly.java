
class poly{
     static class airplane{
        String maker;
        int wings;
        int weight;

        airplane(){
            this.maker = "AF##13";
            this.wings = 1333;
            this.weight = 1200000;

        }
}
        
        static class Boeing extends airplane{
            String fuselage = "v34334";
            int wings = 0033;
            int weight = 93931;
        }

    
    public static void main(String[] args) {
        Boeing b = new Boeing();
        System.out.println("Maker is "+b.maker);
        System.out.println("Weight is "+b.weight);

    }
}