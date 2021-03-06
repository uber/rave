package com.uber.rave.model;

import androidx.annotation.NonNull;

import com.uber.rave.annotation.Validated;
import com.uber.rave.compiler.MyFactory;

@Validated(factory = MyFactory.class)
public abstract class AbstractAnnotated {
    @NonNull
    public abstract String nonNullAbstractMethodString();

    @NonNull
    public String nonNullString() {
        return "Non Null from abstract";
    }
}
