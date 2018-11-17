# **JPA WS**


**JOAN**

This application have
* Empresa application serves from 
    http://localhost:8080/empresa
* Blog Application
    http://localhost:8080/post
    http://localhost:8080/comment

**Operaciones disponibles**

- Alta de un post
	POST /posts		
	    Parámetros de entrada:  Title, description
	    Salida:                 id post
	    Ejemplo: 
	     **curl -X POST -H "Content-Type:application/json" -d '{"title":"Post 1","description":"Description post 1","content":"content post 1"}' http://localhost:8080/posts**

- Modificar un post
	PUT /posts		
	    Parámetros de entrada:  Title, description
	    Salida:                 id post
	    Ejemplo: 
	     **curl -i -X PUT -H "Content-Type:application/json" -d '{"title":"Post sobre JPA","description": "post sobre JPA y Spring","content":"Jpa content y spring content"}' http://localhost:8080/posts/1**

- Obtener todos los post	
    GET /post 	
        Parámetros de entrada: NONE	
        Salida:                 List of {id post, Title, description}
        Ejemplo: **curl -i -X GET http://localhost:8080/posts**

	
- Alta del comentario 	
    POST /post/{id post}/comments	
        Parámetros de entrada: Text	
        Salida:                 Id comment
        Ejemplo: 
        **curl -i -X POST -H "Content-Type:application/json" -d '{"text":"Muy buen post! Felicitaciones"}' http://localhost:8080/posts/1/comments**
-Obtener los comentarios de un post
    GET /post/{id post}/comment 	
        Parámetros de entrada: NONE	
        Salida:     List of {id comments, Text}
        Ejemplo: **curl -i -X GET http://localhost:8080/posts/1/comments**
                
- Modificar un comentario	
    PUT /post/{id post}/comment/{id comment]	
        Paramtros de Entrada    Text	
        Salida;                 Id comment
        Ejemplo: **curl -i -X PUT -H "Content-Type:application/json" -d '{"text":"El post de JPA y Spring me gusto mucho! Felicitaciones"}' http://localhost:8080/posts/1/comments/1**

- Eliminar un comentario 	
    DELETE /post/{id post}/comment/{id comment]	
        Paramtros de Entrada    NONE 	
        Salida;                 Id comment
        Ejemplo: **curl -i -X DELETE http://localhost:8080/posts/1/comments/1**



**References**

https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
https://dzone.com/tutorials/java/hibernate/hibernate-example/hibernate-mapping-many-to-one-using-annotations-1.html


