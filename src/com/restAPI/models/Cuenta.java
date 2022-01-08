package com.restAPI.models;

public class Cuenta {
	
	private long id;
	private Cliente cliente;
	private String numeroCuenta;
	private double saldo;
	private String estadoCuenta;
	
	public Cuenta() {
	}
	public Cuenta(long id, Cliente cliente, String numeroCuenta, double saldo, String estadoCuenta) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.estadoCuenta = estadoCuenta;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getEstadoCuenta() {
		return estadoCuenta;
	}
	public void setEstadoCuenta(String estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}
}
