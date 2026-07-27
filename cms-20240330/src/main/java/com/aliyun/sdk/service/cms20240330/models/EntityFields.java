// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link EntityFields} extends {@link TeaModel}
 *
 * <p>EntityFields</p>
 */
public class EntityFields extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private EntityFields(Builder builder) {
        this.field = builder.field;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityFields create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String field; 
        private String value; 

        private Builder() {
        } 

        private Builder(EntityFields model) {
            this.field = model.field;
            this.value = model.value;
        } 

        /**
         * field.
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public EntityFields build() {
            return new EntityFields(this);
        } 

    } 

}
