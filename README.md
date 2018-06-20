Car Service
===========

Running
-------

Just run com.jdriven.consumerbased.cardservice.Application.kt in your IDE ;)

Endpoints
---------

* GET /car - returns all cars
* POST /car/search - search for cars

Post body (see service/domain/CarSearch):

```json
{
  "kilometersMax":"80000",
  "fuel": "DIESEL"
}
```

