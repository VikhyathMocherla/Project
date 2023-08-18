package MongoProject.Phonedb;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Phone obj=new Phone();
        //obj.createCollection();
        //obj.getCollections();
        obj.addToCollection(1, "999", "888", "234", "10 mins");
        obj.addToCollection(2, "555", "777", "789", "20 mins");
        obj.viewDocuments();
        
    }
}
