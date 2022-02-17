package autoIndustryTkachova;

public enum MakeList {
   BMW ("BMW"),
   AUDI ("Audi"),
   ;
   private final String make;

   MakeList(String make) {
       this.make = make;

   }

   public String getMake() {
       return make;
   }

}
