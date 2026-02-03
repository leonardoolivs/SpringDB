package org.estudos.spring.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(Object id) {
        super("Object not found ID: " + id);
    }
}
