class User extends Account {
    
    public User(String name, long document, String email, String password) {
        super(name, document);
        super.name = name;
        super.document = document;
        this.email = email;
        this.password = password;
     }
  }