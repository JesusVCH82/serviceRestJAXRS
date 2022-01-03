

function llamar() {
    url = "http://localhost:8080/serviceREST-JAX-RS/api/v1/clientes/allClientes";
 
    fetch(url)
        .then((respuesta) => respuesta.json())
        .then(function(data) {
        	console.log(data.length);
		for (var i = 0; i < data.length; i++) {
		  var object = data[i];
		  for (var property in object) {
			console.log('item ' + i + ': ' + property + '=' + object['nombre']);
		  }
}

            
        })
        .catch(function(error) {
            console.log(error);
        });
}


function llamar2() {
   
 url2="http://localhost:8080/serviceREST-JAX-RS/api/v1/clientes/2"
    fetch(url2)
        .then((respuesta) => respuesta.json())
        .then(function(data) {
            
              console.log(data['nombre']);
		})
        .catch(function(error) {
            console.log(error);
        });
}
