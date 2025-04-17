// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.NameInMap("SubQueries")
    private java.util.List<SimpleQuery> subQueries;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

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
     * @return operation
     */
    public String getOperation() {
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
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String field; 
        private String operation; 
        private java.util.List<SimpleQuery> subQueries; 
        private String value; 

        private Builder() {
        } 

        private Builder(SimpleQuery model) {
            this.field = model.field;
            this.operation = model.operation;
            this.subQueries = model.subQueries;
            this.value = model.value;
        } 

        /**
         * Field.
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
         * SubQueries.
         */
        public Builder subQueries(java.util.List<SimpleQuery> subQueries) {
            this.subQueries = subQueries;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public SimpleQuery build() {
            return new SimpleQuery(this);
        } 

    } 

}
