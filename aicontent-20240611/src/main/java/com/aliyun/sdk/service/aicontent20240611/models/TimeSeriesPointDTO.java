// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link TimeSeriesPointDTO} extends {@link TeaModel}
 *
 * <p>TimeSeriesPointDTO</p>
 */
public class TimeSeriesPointDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.NameInMap("value")
    private Object value;

    private TimeSeriesPointDTO(Builder builder) {
        this.label = builder.label;
        this.timestamp = builder.timestamp;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimeSeriesPointDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
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
        private String label; 
        private String timestamp; 
        private Object value; 

        private Builder() {
        } 

        private Builder(TimeSeriesPointDTO model) {
            this.label = model.label;
            this.timestamp = model.timestamp;
            this.value = model.value;
        } 

        /**
         * label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * value.
         */
        public Builder value(Object value) {
            this.value = value;
            return this;
        }

        public TimeSeriesPointDTO build() {
            return new TimeSeriesPointDTO(this);
        } 

    } 

}
