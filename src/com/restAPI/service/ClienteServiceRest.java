package com.restAPI.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.restAPI.models.Cliente;

@Path(value = "/clientes")
public class ClienteServiceRest {
	
	@GET
	@Path(value = "/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getCliente(@PathParam("id") int id ) {
		Cliente cliente = getClienteMock(id);
		if(Objects.isNull(cliente.getNombre())){
			return Response.ok("No existe el cliente").status(Status.NOT_FOUND).build();
		}else {
			return Response.ok(cliente).status(Status.OK).build();
		}
	}
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getClienteswithResponse() throws Exception{
		List<Cliente> clientes = new ArrayList<>();
		clientes = getAllClientes();
		if(clientes.size()== 0) {
			return Response.ok("No existen registros").status(Status.NOT_FOUND).build();
		}
		//Distintos tipos de respuestas
		//return Response.ok(clientes).header("miheader", "cualquiervalor").status(Status.CREATED).build();
		return Response.ok(clientes).status(Status.OK).build();
	}
	
	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.TEXT_PLAIN)
	public Response saveCliente(Cliente cliente) {
		return Response.ok("Cliente "+cliente.getNombre()+" agregado").status(Status.CREATED).build();
	}
	
	
	@PUT
	@Path(value = "/{id}")
	@Consumes(value = MediaType.APPLICATION_JSON)
	@Produces(value = MediaType.TEXT_PLAIN)
	public Response updateCliente(@PathParam("id") String id, Cliente cliente) {
		String r = "El id: "+ id + " se ha modificado para el nombre de "+ cliente.getNombre();
		return Response.ok(r).status(Status.ACCEPTED).build();
	}
	
	
	@DELETE
	@Path(value = "/{id}")
	public Response deleteClienteById(@PathParam("id") String id) {
		String r = "El id: "+ id + " se ha eliminado ";
		return Response.ok(r).status(Status.OK).build();
	}
	
	public Cliente getClienteMock(int id) {
		int clienteId =  id;
		Cliente c = new Cliente(1, "Jesus", "Vazquez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c1 = new Cliente(2, "Marco", "Polo", 49, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c2 = new Cliente(3, "Gabriel", "Cardenas", 19, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c3 = new Cliente(4, "Martin", "Cardenas", 79, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		switch (clienteId) {
		case 1:
			return c;
			
		case 2:
			return c1;
			
		case 3:
			return c2;
			
		case 4:
			return c3;
		}
		return new Cliente();
		
	}
	
	public List<Cliente> getAllClientes() {
		List<Cliente> clientes = new ArrayList<>();
		Cliente c = new Cliente(1, "Jesus", "Vazquez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c1 = new Cliente(2, "Marco", "Polo", 49, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c2 = new Cliente(3, "Gabriel", "Cardenas", 19, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c3 = new Cliente(4, "Martin", "Cardenas", 79, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		clientes.add(c);
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		return clientes;
	}
}
