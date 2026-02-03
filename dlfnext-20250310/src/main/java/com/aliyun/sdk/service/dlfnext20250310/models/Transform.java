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
 * {@link Transform} extends {@link TeaModel}
 *
 * <p>Transform</p>
 */
public class Transform extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("castType")
    private FullDataType castType;

    @com.aliyun.core.annotation.NameInMap("fieldRef")
    private FieldRef fieldRef;

    @com.aliyun.core.annotation.NameInMap("inputs")
    private java.util.List<TransformInput> inputs;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private Transform(Builder builder) {
        this.castType = builder.castType;
        this.fieldRef = builder.fieldRef;
        this.inputs = builder.inputs;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Transform create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return castType
     */
    public FullDataType getCastType() {
        return this.castType;
    }

    /**
     * @return fieldRef
     */
    public FieldRef getFieldRef() {
        return this.fieldRef;
    }

    /**
     * @return inputs
     */
    public java.util.List<TransformInput> getInputs() {
        return this.inputs;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private FullDataType castType; 
        private FieldRef fieldRef; 
        private java.util.List<TransformInput> inputs; 
        private String name; 

        private Builder() {
        } 

        private Builder(Transform model) {
            this.castType = model.castType;
            this.fieldRef = model.fieldRef;
            this.inputs = model.inputs;
            this.name = model.name;
        } 

        /**
         * castType.
         */
        public Builder castType(FullDataType castType) {
            this.castType = castType;
            return this;
        }

        /**
         * fieldRef.
         */
        public Builder fieldRef(FieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * inputs.
         */
        public Builder inputs(java.util.List<TransformInput> inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Transform build() {
            return new Transform(this);
        } 

    } 

}
