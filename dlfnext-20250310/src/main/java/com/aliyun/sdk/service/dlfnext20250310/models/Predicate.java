// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Predicate} extends {@link TeaModel}
 *
 * <p>Predicate</p>
 */
public class Predicate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("children")
    private java.util.List<Predicate> children;

    @com.aliyun.core.annotation.NameInMap("function")
    private String function;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("literals")
    private java.util.List<?> literals;

    @com.aliyun.core.annotation.NameInMap("transform")
    private Transform transform;

    private Predicate(Builder builder) {
        this.children = builder.children;
        this.function = builder.function;
        this.kind = builder.kind;
        this.literals = builder.literals;
        this.transform = builder.transform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Predicate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return children
     */
    public java.util.List<Predicate> getChildren() {
        return this.children;
    }

    /**
     * @return function
     */
    public String getFunction() {
        return this.function;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return literals
     */
    public java.util.List<?> getLiterals() {
        return this.literals;
    }

    /**
     * @return transform
     */
    public Transform getTransform() {
        return this.transform;
    }

    public static final class Builder {
        private java.util.List<Predicate> children; 
        private String function; 
        private String kind; 
        private java.util.List<?> literals; 
        private Transform transform; 

        private Builder() {
        } 

        private Builder(Predicate model) {
            this.children = model.children;
            this.function = model.function;
            this.kind = model.kind;
            this.literals = model.literals;
            this.transform = model.transform;
        } 

        /**
         * children.
         */
        public Builder children(java.util.List<Predicate> children) {
            this.children = children;
            return this;
        }

        /**
         * function.
         */
        public Builder function(String function) {
            this.function = function;
            return this;
        }

        /**
         * kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * literals.
         */
        public Builder literals(java.util.List<?> literals) {
            this.literals = literals;
            return this;
        }

        /**
         * transform.
         */
        public Builder transform(Transform transform) {
            this.transform = transform;
            return this;
        }

        public Predicate build() {
            return new Predicate(this);
        } 

    } 

}
