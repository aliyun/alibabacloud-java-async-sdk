// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    private DataTopicLagMapValue(Builder builder) {
        this.readyCount = builder.readyCount;
        this.inflightCount = builder.inflightCount;
        this.deliveryDuration = builder.deliveryDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataTopicLagMapValue create() {
        return builder().build();
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

    public static final class Builder {
        private Long readyCount; 
        private Long inflightCount; 
        private Long deliveryDuration; 

        /**
         * readyCount.
         */
        public Builder readyCount(Long readyCount) {
            this.readyCount = readyCount;
            return this;
        }

        /**
         * inflightCount.
         */
        public Builder inflightCount(Long inflightCount) {
            this.inflightCount = inflightCount;
            return this;
        }

        /**
         * deliveryDuration.
         */
        public Builder deliveryDuration(Long deliveryDuration) {
            this.deliveryDuration = deliveryDuration;
            return this;
        }

        public DataTopicLagMapValue build() {
            return new DataTopicLagMapValue(this);
        } 

    } 

}
