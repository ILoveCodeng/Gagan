class Book{
   int id;
   String title,author;
   double price;
   static int nob;
   
   Book(int i, String t, String a, double p){
      id = i;;
      title = t;
      author = a;
      price = p;
      nob++;
   }
   void display(){
      System.out.println("Book ID: "+id+"\nTitle: "+title+"\nAuthor: "+author+"\nPrice: "+price);
   }
   
   void search(int i){
      if(id==i)
         display();
      else
         System.out.println("The BookID does not exist");
   }
   
   void search(String t){
      if(title.equalsIgnoreCase(t))
         display();
      else
         System.out.println("The Book is not found");
   }
   
   void compare(Book b){
      if(price>b.price)
         System.out.println(title+" is more expensive");
      else
         System.out.println(b.title+" is more expensive");
   }
   
   static void totalbooks(){
      System.out.println("The total number of books is: "+nob);
   }
}

class Main{
   public static void main(String[]args){
      Book b1 = new Book(101,"A","XY",500.0);
      Book b2 = new Book(303,"B","YZ",600.0);
      Book b3 = new Book(505,"C","ZZ",700.0);
      
      b1.display();
      b2.display();
      b3.display();
      
      b3.search(505);
      b1.search("H");
      
      b1.compare(b2);
      
      Book.totalbooks();
   }
}
