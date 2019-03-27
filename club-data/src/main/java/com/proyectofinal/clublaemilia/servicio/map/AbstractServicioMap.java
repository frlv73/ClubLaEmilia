package com.proyectofinal.clublaemilia.servicio.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractServicioMap<T, ID> {

	protected Map<ID, T> map = new HashMap<>();
	
	Set<T> buscarTodos(){
		return new HashSet<>(map.values());
	}
	
	T buscarPorId(ID id) {
		return map.get(id);
	}
	
	T guardar(ID id, T objeto) {
		map.put(id, objeto);
        return  objeto;
	}
	
	void borrar(T objeto) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(objeto));
	}
	
	void borrarPorId(ID id) {
		map.remove(id);
	}
}
