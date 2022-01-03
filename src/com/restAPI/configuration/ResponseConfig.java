package com.restAPI.configuration;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

//Clase que realiza escaneo para evitar colocarlo en el web.xml y agregar el filter a las peticiones que se hagan 
@Provider
public class ResponseConfig implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		MultivaluedMap<String, Object> headers = responseContext.getHeaders();
		
        headers.add("Access-Control-Allow-Origin", "*");        
        headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");          
        headers.add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, X-Codingpedia");   
        headers.add("miHeader", "valorHader");   

		
	}
	
	

}
