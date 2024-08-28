// Encapsulation/Abstraciton   --  Assign 1
public class OPPsAssignments{
class Author {

private String name;

private String email;

private char gender;

public Author (String name, String email, char gender) {

super();

this.name = name;

this.email = email;

this.gender = gender;

}
public String getName() {

return name;

}

public String getEmail() {

return email;

}

public char getGender() { return gender;

}

public String toString() {

return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";

}

}

class Book {
private String name;

private Author author;

private double price;

private int qtyInStock;

public Book (String name, Author author, double price, int

qtyInStock) {

super();

this.name = name;

this.author = author;

this.price = price;

this.qtyInStock = qtyInStock;

}
 public double getPrice() {

return price;

}

public void setPrice (double price) {

this.price = price;

} 
 public int getQtyInStock() {
 return qtyInStock;

}

public void setQtyInStock(int qtyInStock) {
 this.qty InStock = qtyInStock;

}
 public String getName() {

return name;

}

public Author getAuthor() {

return author;

}

public String toString() {

return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";

}

}


//Classes and Objects ---- assign 2
class Calculator {

public static int powerInt(int num1, int num2) 
  {
    return (int) Math.pow(num1, num2);

}

public static double powerDouble(double num1, int num2)
  {
    return Math.pow(num1, num2);

} 
}



public static void main(String[] args) {

System.out.println(Calculator.powerInt(12, 2));
  System.out.println(Calculator.powerDouble (1.5, 2));

  Author author = new Author ("Arpan Das", "arp14@yahoo.com", 'M');
Book book = new Book("Java Fundamentals", author, 199.0,500);

System.out.println(book);

}}
