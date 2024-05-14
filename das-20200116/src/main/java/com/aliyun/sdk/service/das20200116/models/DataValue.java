// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Object value;

    private DataValue(Builder builder) {
        this.timestamp = builder.timestamp;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return value
     */
    public Object getValue() {
        return this.value;
    }

    public static final class Builder {
        private String timestamp; 
        private Object value; 

        /**
         * The timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * The value of the metric.
         */
        public Builder value(Object value) {
            this.value = value;
            return this;
        }

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}
