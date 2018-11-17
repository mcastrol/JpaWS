#alta post
curl -X POST -H "Content-Type:application/json" -d '{"title":"Post 1","description":"Description post 1","content":"content post 1"}' http://localhost:8080/posts
#modificar
curl -i -X PUT -H "Content-Type:application/json" -d '{"title":"Post sobre JPA","description": "post sobre JPA y Spring","content":"Jpa content y spring content"}' http://localhost:8080/posts/1
#obtener todos los post
curl -i -X GET http://localhost:8080/posts

#alta de un comentario
curl -X POST -H "Content-Type:application/json" -d '{"text":"Muy buen post! Felicitaciones"}' http://localhost:8080/posts/1/comments
#obtener un comentario
curl -i -X GET http://localhost:8080/posts/1/comments
#modificar  un comentario
curl -i -X PUT -H "Content-Type:application/json" -d '{"text":"El post de JPA y Spring me gusto mucho! Felicitaciones"}' http://localhost:8080/posts/1/comments/1
#borrar un comentarop

