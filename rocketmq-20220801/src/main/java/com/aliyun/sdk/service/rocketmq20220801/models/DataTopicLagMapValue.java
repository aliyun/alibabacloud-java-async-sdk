// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link DataTopicLagMapValue} extends {@link TeaModel}
 *
 * <p>DataTopicLagMapValue</p>
 */
public class DataTopicLagMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("readyCount")
    private Long readyCount;

    @com.aliyun.core.annotation.NameInMap("inflightCount")
    private Long inflightCount;

    @com.aliyun.core.annotation.NameInMap("deliveryDuration")
    private Long deliveryDuration;

    @com.aliyun.core.annotation.NameInMap("lastConsumeTimestamp")
    private Long lastConsumeTimestamp;

    private DataTopicLagMapValue(Builder builder) {
        this.readyCount = builder.readyCount;
        this.inflightCount = builder.inflightCount;
        this.deliveryDuration = builder.deliveryDuration;
        this.lastConsumeTimestamp = builder.lastConsumeTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataTopicLagMapValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return readyCount
     */
    public Long getReadyCount() {
        return this.readyCount;
    }

    /**
     * @return inflightCount
     */
    public Long getInflightCount() {
        return this.inflightCount;
    }

    /**
     * @return deliveryDuration
     */
    public Long getDeliveryDuration() {
        return this.deliveryDuration;
    }

    /**
     * @return lastConsumeTimestamp
     */
    public Long getLastConsumeTimestamp() {
        return this.lastConsumeTimestamp;
    }

    public static final class Builder {
        private Long readyCount; 
        private Long inflightCount; 
        private Long deliveryDuration; 
        private Long lastConsumeTimestamp; 

        private Builder() {
        } 

        private Builder(DataTopicLagMapValue model) {
            this.readyCount = model.readyCount;
            this.inflightCount = model.inflightCount;
            this.deliveryDuration = model.deliveryDuration;
            this.lastConsumeTimestamp = model.lastConsumeTimestamp;
        } 

        /**
         * <p>Ready message count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder readyCount(Long readyCount) {
            this.readyCount = readyCount;
            return this;
        }

        /**
         * <p>The number of messages being consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder inflightCount(Long inflightCount) {
            this.inflightCount = inflightCount;
            return this;
        }

        /**
         * <p>Delivery delay time, in seconds</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder deliveryDuration(Long deliveryDuration) {
            this.deliveryDuration = deliveryDuration;
            return this;
        }

        /**
         * <p>lastConsumeTimestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1735629607846</p>
         */
        public Builder lastConsumeTimestamp(Long lastConsumeTimestamp) {
            this.lastConsumeTimestamp = lastConsumeTimestamp;
            return this;
        }

        public DataTopicLagMapValue build() {
            return new DataTopicLagMapValue(this);
        } 

    } 

}
