// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link Aggregation} extends {@link TeaModel}
 *
 * <p>Aggregation</p>
 */
public class Aggregation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("field")
    private byte[] field;

    @com.aliyun.core.annotation.NameInMap("groups")
    private java.util.List<AggregationsGroup> groups;

    @com.aliyun.core.annotation.NameInMap("operation")
    private byte[] operation;

    @com.aliyun.core.annotation.NameInMap("value")
    private Double value;

    private Aggregation(Builder builder) {
        this.field = builder.field;
        this.groups = builder.groups;
        this.operation = builder.operation;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Aggregation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return field
     */
    public byte[] getField() {
        return this.field;
    }

    /**
     * @return groups
     */
    public java.util.List<AggregationsGroup> getGroups() {
        return this.groups;
    }

    /**
     * @return operation
     */
    public byte[] getOperation() {
        return this.operation;
    }

    /**
     * @return value
     */
    public Double getValue() {
        return this.value;
    }

    public static final class Builder {
        private byte[] field; 
        private java.util.List<AggregationsGroup> groups; 
        private byte[] operation; 
        private Double value; 

        private Builder() {
        } 

        private Builder(Aggregation model) {
            this.field = model.field;
            this.groups = model.groups;
            this.operation = model.operation;
            this.value = model.value;
        } 

        /**
         * field.
         */
        public Builder field(byte[] field) {
            this.field = field;
            return this;
        }

        /**
         * groups.
         */
        public Builder groups(java.util.List<AggregationsGroup> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * operation.
         */
        public Builder operation(byte[] operation) {
            this.operation = operation;
            return this;
        }

        /**
         * value.
         */
        public Builder value(Double value) {
            this.value = value;
            return this;
        }

        public Aggregation build() {
            return new Aggregation(this);
        } 

    } 

}
