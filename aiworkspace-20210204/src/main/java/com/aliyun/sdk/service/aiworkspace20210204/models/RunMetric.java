// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunMetric} extends {@link TeaModel}
 *
 * <p>RunMetric</p>
 */
public class RunMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.NameInMap("Step")
    private Long step;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float value;

    private RunMetric(Builder builder) {
        this.key = builder.key;
        this.step = builder.step;
        this.timestamp = builder.timestamp;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunMetric create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return step
     */
    public Long getStep() {
        return this.step;
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
        private String key; 
        private Long step; 
        private Long timestamp; 
        private Float value; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Step.
         */
        public Builder step(Long step) {
            this.step = step;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder value(Float value) {
            this.value = value;
            return this;
        }

        public RunMetric build() {
            return new RunMetric(this);
        } 

    } 

}
