// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MetricInfo} extends {@link TeaModel}
 *
 * <p>MetricInfo</p>
 */
public class MetricInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Average")
    private Float average;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Float count;

    @com.aliyun.core.annotation.NameInMap("Maximum")
    private Float maximum;

    @com.aliyun.core.annotation.NameInMap("Minimum")
    private Float minimum;

    @com.aliyun.core.annotation.NameInMap("Sum")
    private Float sum;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("value")
    private Float value;

    private MetricInfo(Builder builder) {
        this.average = builder.average;
        this.count = builder.count;
        this.maximum = builder.maximum;
        this.minimum = builder.minimum;
        this.sum = builder.sum;
        this.timestamp = builder.timestamp;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricInfo create() {
        return builder().build();
    }

    /**
     * @return average
     */
    public Float getAverage() {
        return this.average;
    }

    /**
     * @return count
     */
    public Float getCount() {
        return this.count;
    }

    /**
     * @return maximum
     */
    public Float getMaximum() {
        return this.maximum;
    }

    /**
     * @return minimum
     */
    public Float getMinimum() {
        return this.minimum;
    }

    /**
     * @return sum
     */
    public Float getSum() {
        return this.sum;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return value
     */
    public Float getValue() {
        return this.value;
    }

    public static final class Builder {
        private Float average; 
        private Float count; 
        private Float maximum; 
        private Float minimum; 
        private Float sum; 
        private Long timestamp; 
        private Float value; 

        /**
         * Average.
         */
        public Builder average(Float average) {
            this.average = average;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Float count) {
            this.count = count;
            return this;
        }

        /**
         * Maximum.
         */
        public Builder maximum(Float maximum) {
            this.maximum = maximum;
            return this;
        }

        /**
         * Minimum.
         */
        public Builder minimum(Float minimum) {
            this.minimum = minimum;
            return this;
        }

        /**
         * Sum.
         */
        public Builder sum(Float sum) {
            this.sum = sum;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * value.
         */
        public Builder value(Float value) {
            this.value = value;
            return this;
        }

        public MetricInfo build() {
            return new MetricInfo(this);
        } 

    } 

}
