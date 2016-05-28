package com.tvd12.ezyfox.core.structure;

import java.lang.reflect.Field;

import com.tvd12.ezyfox.core.annotation.ConfigProperty;

/**
 * Hold structure of all methods be annotated with {@code ConfigProperty} annotation
 * 
 * @see ClassWrapper
 * 
 * @author tavandung12
 *
 */

public class PropertiesClassWrapper extends ClassWrapper {

    // prevent new instance with default constructor
    private PropertiesClassWrapper() {}
    
    /**
     * @see ClassWrapper#ClassWrapper(Class)
     */
    public PropertiesClassWrapper(Class<?> clazz) {
        super(clazz);
    }
    
    /**
     * @see ClassWrapper#initWithField(Field)
     */
    @Override
    protected SetterMethodCover initWithField(Field field) {
        return new PropertySetterMethod(clazz, field);
    }
    
    /**
     * @see ClassWrapper#initWithMethod(java.lang.reflect.Method)
     */
    @Override
    protected ClassWrapper newClass() {
        return new PropertiesClassWrapper();
    }

    /**
     * @see ClassWrapper#getAnnotationClasses()
     */
    @Override
    @SuppressWarnings("unchecked")
    protected Class<ConfigProperty>[] getAnnotationClasses() {
        return new Class[] {ConfigProperty.class};
    }

}
