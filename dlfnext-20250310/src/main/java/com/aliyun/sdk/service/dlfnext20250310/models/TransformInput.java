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
 * {@link TransformInput} extends {@link TeaModel}
 *
 * <p>TransformInput</p>
 */
public class TransformInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("input")
    private Object input;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private TransformInput(Builder builder) {
        this.input = builder.input;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public Object getInput() {
        return this.input;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Object input; 
        private String type; 

        private Builder() {
        } 

        private Builder(TransformInput model) {
            this.input = model.input;
            this.type = model.type;
        } 

        /**
         * input.
         */
        public Builder input(Object input) {
            this.input = input;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TransformInput build() {
            return new TransformInput(this);
        } 

    } 

}
