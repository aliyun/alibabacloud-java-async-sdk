// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link Filter} extends {@link TeaModel}
 *
 * <p>Filter</p>
 */
public class Filter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("SubFilters")
    private java.util.List<Filter> subFilters;

    @com.aliyun.core.annotation.NameInMap("Values")
    private Object values;

    private Filter(Builder builder) {
        this.key = builder.key;
        this.operator = builder.operator;
        this.subFilters = builder.subFilters;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Filter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return subFilters
     */
    public java.util.List<Filter> getSubFilters() {
        return this.subFilters;
    }

    /**
     * @return values
     */
    public Object getValues() {
        return this.values;
    }

    public static final class Builder {
        private String key; 
        private String operator; 
        private java.util.List<Filter> subFilters; 
        private Object values; 

        private Builder() {
        } 

        private Builder(Filter model) {
            this.key = model.key;
            this.operator = model.operator;
            this.subFilters = model.subFilters;
            this.values = model.values;
        } 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * SubFilters.
         */
        public Builder subFilters(java.util.List<Filter> subFilters) {
            this.subFilters = subFilters;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(Object values) {
            this.values = values;
            return this;
        }

        public Filter build() {
            return new Filter(this);
        } 

    } 

}
