// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link Metric} extends {@link TeaModel}
 *
 * <p>Metric</p>
 */
public class Metric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Double value;

    private Metric(Builder builder) {
        this.timestamp = builder.timestamp;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Metric create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Double getValue() {
        return this.value;
    }

    public static final class Builder {
        private String timestamp; 
        private Double value; 

        private Builder() {
        } 

        private Builder(Metric model) {
            this.timestamp = model.timestamp;
            this.value = model.value;
        } 

        /**
         * Timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Double value) {
            this.value = value;
            return this;
        }

        public Metric build() {
            return new Metric(this);
        } 

    } 

}
