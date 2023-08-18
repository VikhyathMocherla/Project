Connecting to No SQL Database MongoDB

1.Add dependency
	<dependency>
	    <groupId>org.mongodb</groupId>
	    <artifactId>mongo-java-driver</artifactId>
	    <version>3.12.14</version>
	</dependency>

2.Start MongoDb Database
3.In Java Program create a client connection
  using com.mongodb.MongoClient
  MongoClient client=new MongoClient("localhost",27017);
 4.Getting database instance from MongoDB
   com.mongodb.client.MongoDatabase
   
   MongoDatabase db=client.getDatabase("payroll");
   
5.Create a collection
  db.createCollection(COLLECTION_NAME)
6. Retrieving existing collections from databases;
   collection=d.getCollection(COLLECTION_NAME)
7. Creating a document
Document doc=new Document()
 doc.put(key,value)
 8.Add a document to collection
 collectio.insertOne(doc)
 