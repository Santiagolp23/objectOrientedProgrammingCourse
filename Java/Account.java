class Account {
   Integer id;
   String name;
   long document;
   String email;
   String password;

   public Account(String name, long document) {
      this.name = name;
      this.document = document;
   }
   public void printAccountData() {
      System.out.println("Your name is: " + name + " and your document is: " + document);
   }
}