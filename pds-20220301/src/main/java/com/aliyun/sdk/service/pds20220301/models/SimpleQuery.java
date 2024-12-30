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
 * {@link SimpleQuery} extends {@link TeaModel}
 *
 * <p>SimpleQuery</p>
 */
public class SimpleQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("field")
    private byte[] field;

    @com.aliyun.core.annotation.NameInMap("operation")
    private byte[] operation;

    @com.aliyun.core.annotation.NameInMap("sub_queries")
    private java.util.List<SimpleQuery> subQueries;

    @com.aliyun.core.annotation.NameInMap("value")
    private byte[] value;

    private SimpleQuery(Builder builder) {
        this.field = builder.field;
        this.operation = builder.operation;
        this.subQueries = builder.subQueries;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleQuery create() {
        return builder().build();
    }

    /**
     * @return field
     */
    public byte[] getField() {
        return this.field;
    }

    /**
     * @return operation
     */
    public byte[] getOperation() {
        return this.operation;
    }

    /**
     * @return subQueries
     */
    public java.util.List<SimpleQuery> getSubQueries() {
        return this.subQueries;
    }

    /**
     * @return value
     */
    public byte[] getValue() {
        return this.value;
    }

    public static final class Builder {
        private byte[] field; 
        private byte[] operation; 
        private java.util.List<SimpleQuery> subQueries; 
        private byte[] value; 

        /**
         * field.
         */
        public Builder field(byte[] field) {
            this.field = field;
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
         * sub_queries.
         */
        public Builder subQueries(java.util.List<SimpleQuery> subQueries) {
            this.subQueries = subQueries;
            return this;
        }

        /**
         * value.
         */
        public Builder value(byte[] value) {
            this.value = value;
            return this;
        }

        public SimpleQuery build() {
            return new SimpleQuery(this);
        } 

    } 

}
