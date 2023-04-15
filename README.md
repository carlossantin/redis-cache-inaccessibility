# Handling Redis Server Inaccessibility in Spring Boot

This example shows how to create an error handler for avoiding throwing exception when Redis server is not accessible.

To test it, you can run a Redis docker container in your local machine:

```shell
docker pull redis
docker run --name my-redis -p 6379:6379 -d redis
```

Run the project with Redis server started and you will realize that calling the endpoint http://localhost:8080/persons a cached data will be returned after the first call. The first call will have a delay of 3 seconds for each returned name.

Stop the container running the following command:
```shell
docker stop my-redis
```

Now call the endpoint http://localhost:8080/persons again and you will realize that all calls will have the mentioned delay since cache is not being used anymore.
