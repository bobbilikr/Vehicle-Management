# Vehicle-Management

# Build
 - use the command mvn clean install
 
# Rest API
 - Retrieve the Vehicle  using HTTP  GET
    - URL :  http://localhost:8080/Vehicle-Management/vehicle?id=11
 - Create a new Vehicle using HTTP POST
    - URL : http://localhost:8080/Vehicle-Management/vehicle
    - Body :	{"price": 454000,
             	"year": 2017,
             "speed": 120,
             "model": "Marker",
             "type": "Car",
             "timestampDate": null,
             "date": null
             }
 - Update a Vehicle using HTTP PUT
   - URL : http://localhost:8080/Vehicle-Management/vehicle
   - Body:
          {   "id":3
              "price": 454000,
             	"year": 2017,
             "speed": 120,
             "model": "Marker",
             "type": "Car",
             "timestampDate": null,
             "date": null
             }
 - Delete the last added record using HTTP GET
   - URL : http://localhost:8080/Vehicle-Management/vehicle/delete
   
    
