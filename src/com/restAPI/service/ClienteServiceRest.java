package com.restAPI.service;

import java.util.ArrayList;
import java.util.List;

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
	public Cliente getCliente(@PathParam("id") String id ) {
		Cliente c = new Cliente(Long.valueOf(id), "Jesus", "Vazquez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		return c;
	}
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getClienteswithResponse() {
		List<Cliente> clientes = new ArrayList<>();
		Cliente c = new Cliente(1L, "Jesus", "Vazquez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c1 = new Cliente(2L, "Marco", "Polo", 49, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c2 = new Cliente(3L, "Gabriel", "Cardenas", 19, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cliente c3 = new Cliente(4L, "Martin", "Cardenas", 79, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		clientes.add(c);
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		//Distintos tipos de respuestas
		//return Response.ok(clientes).status(Status.CREATED).build();
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
	
	//@Path(value = "/allClientes")
//	@GET
//	@Produces(value = MediaType.APPLICATION_JSON)
//	public List<Cliente> getClientes() {
//		List<Cliente> clientes = new ArrayList<>();
//		Cliente c = new Cliente(1L, "Jesus", "Vazquez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
//		Cliente c1 = new Cliente(2L, "Marco", "Polo", 49, "VACJ930901", "Lazaro Cardenas 8", "55667788");
//		Cliente c2 = new Cliente(3L, "Gabriel", "Cardenas", 19, "VACJ930901", "Lazaro Cardenas 8", "55667788");
//		clientes.add(c);
//		clientes.add(c1);
//		clientes.add(c2);
//		return clientes;
//	}
	
	
}
