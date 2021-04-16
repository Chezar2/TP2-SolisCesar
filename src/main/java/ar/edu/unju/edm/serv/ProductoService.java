package ar.edu.unju.edm.serv;

import java.util.ArrayList;

import ar.edu.unju.edm.model.Producto;

public interface ProductoService {
//que se hace
	public void guardarProducto(Producto unProducto);
	public void modificarProducto(Producto unProductoAModificar);
	public void eliminarProducto(Producto productoAEliminar);
	public Producto obtenerProducto(String nombreProducto);
	public ArrayList<Producto> obtenerTodoProducto();
	public Producto obtenerProductoNuevo();
}