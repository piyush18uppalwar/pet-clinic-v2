package piyush.springframework.petclinicv2.data.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import piyush.springframework.petclinicv2.data.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
	
	protected Map<Long,T> map= new HashMap<>();

	Set<T> findAll(){
		return new HashSet<T>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T object) {
		
		if(object != null) {
			if(object.getId() == null) {
				object.setId(getNextId());
			}
			map.put(object.getId(),object);
		}
		return object;
	}
	
	void delete(T obect) {
		map.entrySet().removeIf(entry ->entry.getValue().equals(obect));
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	private Long getNextId() {
		
		Long nextId = null;
		
		/*
		 * try { nextId = Collections.max(map.keySet()) +1L ; }
		 * catch(NoSuchElementException e) { nextId = 1L; }
		 */
		
		if(map.size() == 0)
			nextId = 1L;
		else
			nextId = Collections.max(map.keySet()) +1L ;
		
		return nextId ;
	}
	
	
	
}
