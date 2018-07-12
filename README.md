# Vehicle-Management

# Build
 - use the command mvn clean install
 
# Rest API
 - Retrieve  using GET
    - URL :  http://localhost:8080/Vehicle-Management/vehicle?id=11
 - Create a new Vehicle using post method
    - URL : http://localhost:8080/Vehicle-Management/vehicle
    - Body :	{"price": 454000,
             	"year": 2017,
             "speed": 120,
             "model": "Marker",
             "type": "Car",
             "timestampDate": null,
             "date": null
             }
    
