package MongoProject.Phonedb;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;
import org.bson.conversions.Bson;
public class Phone {
	
		MongoClient client;
		MongoDatabase db;
		MongoCollection<Document> collection;
		public static final String COLLECTION_NAME="phone_coll";
		public PhoneApp()
		{
			try {
				client=new MongoClient("localhost",27017);
				db=client.getDatabase("phone");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void createCollection()
		{
			try {
				db.createCollection(COLLECTION_NAME);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void getCollections()
		{
			collection=db.getCollection(COLLECTION_NAME);
		}
		public void addToCollection(int transaction_id,String sender_no,String receiver_no,String message_length,String receiving_time)
		{
			Document doc=new Document();
			doc.put("transaction_is", transaction_id);
			doc.put("sender_no", sender_no);
			doc.put("receiver_no", receiver_no);
			doc.put("message_length", message_length);
			doc.put("receiving_time", receiving_time);
			collection.insertOne(doc);
		}
		public void viewDocuments()
		{
			FindIterable<Document> iterable=collection.find();
			for(Document d:iterable)
			{
				System.out.println(d);
			}
		}
}
