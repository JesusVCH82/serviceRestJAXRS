package com.restAPI.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.restAPI.models.Cliente;
import com.restAPI.models.Cuenta;

@Path(value = "/cuentas")
public class CuentaServiceRest {
	
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getClientes() {
		List<Cuenta> cuentas = new ArrayList<>();
		Cliente cl1 = new Cliente(1, "Jesus", "Vazquez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cuenta c = new Cuenta(1, cl1, "JCDAREWQ654556", 1000, "ACTIVA");
		Cliente cl2 = new Cliente(2, "Marco", "Lopez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cuenta c2 = new Cuenta(2, cl2, "JCDAREWQ654556", 1000, "ACTIVA");
		cuentas.add(c);
		cuentas.add(c2);

		//Distintos tipos de respuestas
		//return Response.ok(clientes).status(Status.CREATED).build();
		//return Response.ok(clientes).header("miheader", "cualquiervalor").status(Status.CREATED).build();
		return Response.ok(cuentas).status(Status.OK).build();
	}
	
	@GET
	@Path(value = "/{id}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getClienteById(@PathParam("id") int id ) {
		Cliente cl1 = new Cliente(id, "Jesus", "Vazquez", 29, "VACJ930901", "Lazaro Cardenas 8", "55667788");
		Cuenta c = new Cuenta(1L, cl1, "JCDAREWQ654556", 1000, "ACTIVA");
		return Response.ok(c).status(Status.OK).build();
	}

}
