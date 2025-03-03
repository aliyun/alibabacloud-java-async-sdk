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
 * {@link EventFilter} extends {@link TeaModel}
 *
 * <p>EventFilter</p>
 */
public class EventFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Op")
    @com.aliyun.core.annotation.Validation(required = true)
    private String op;

    @com.aliyun.core.annotation.NameInMap("SubFilters")
    private java.util.List<EventFilter> subFilters;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<String> values;

    private EventFilter(Builder builder) {
        this.key = builder.key;
        this.op = builder.op;
        this.subFilters = builder.subFilters;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventFilter create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return op
     */
    public String getOp() {
        return this.op;
    }

    /**
     * @return subFilters
     */
    public java.util.List<EventFilter> getSubFilters() {
        return this.subFilters;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String key; 
        private String op; 
        private java.util.List<EventFilter> subFilters; 
        private java.util.List<String> values; 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder op(String op) {
            this.op = op;
            return this;
        }

        /**
         * SubFilters.
         */
        public Builder subFilters(java.util.List<EventFilter> subFilters) {
            this.subFilters = subFilters;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public EventFilter build() {
            return new EventFilter(this);
        } 

    } 

}
