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
 * {@link FilterCondition} extends {@link TeaModel}
 *
 * <p>FilterCondition</p>
 */
public class FilterCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("op")
    private String op;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private FilterCondition(Builder builder) {
        this.field = builder.field;
        this.op = builder.op;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilterCondition create() {
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
     * @return op
     */
    public String getOp() {
        return this.op;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String field; 
        private String op; 
        private String value; 

        private Builder() {
        } 

        private Builder(FilterCondition model) {
            this.field = model.field;
            this.op = model.op;
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
         * op.
         */
        public Builder op(String op) {
            this.op = op;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public FilterCondition build() {
            return new FilterCondition(this);
        } 

    } 

}
