# Rest MongoDb App

Creating a intermediate springboot Rest application that uses MongoDB using 
Romanian Coder tutorial. Link :https://www.youtube.com/watch?v=Hu-cyytqfp8&t=143s&ab_channel=RomanianCoder

This springboot project uses the dependencies spring web, and spring data mongoDB.

The database used was a locally hosted mongoDB database with Database name: HotelDb and Collection name: Hotels.

The spingboot application had the regular 3-layer structure of model, repository and resource/controller.

The controller requests implemented where:
  1. find all Hotels
  2. insert Hotel
  3. update Hotel
  4. find by Id
  5. get by price per night min
  6. get by Country

These where later tested using Postman.

The completion of this project taught me:
  1. Dealing with mongoDb collections with multiple classes
  2. Using commandLineRunner to inser/delete data
  3. Using mongoDb query language to implement controller requests
  4. Deeper understanding of GetMapping/PostMapping/DeleteMapping requets

In the future I plan to implement qureyDsl for stronger quries.
