package ar.edu.unju.edm.serv;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.Producto;

public class ProductoServiceimp implements ProductoService {
	//como se hace
	//guardar en array
	//guarde en BD
	
	@Autowired
	Producto unProducto;

	@Override
	public void guardarProducto(Producto unProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarProducto(Producto unProductoAModificar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Producto productoAEliminar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto obtenerProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Producto> obtenerTodoProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto obtenerProductoNuevo() {
		// TODO Auto-generated method stub
		return unProducto;
	}
	
}
