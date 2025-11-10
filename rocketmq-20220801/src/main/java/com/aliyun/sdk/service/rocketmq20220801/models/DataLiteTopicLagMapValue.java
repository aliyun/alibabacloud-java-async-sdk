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
 * {@link DataLiteTopicLagMapValue} extends {@link TeaModel}
 *
 * <p>DataLiteTopicLagMapValue</p>
 */
public class DataLiteTopicLagMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("readyCount")
    private Long readyCount;

    @com.aliyun.core.annotation.NameInMap("deliveryDuration")
    private Long deliveryDuration;

    private DataLiteTopicLagMapValue(Builder builder) {
        this.readyCount = builder.readyCount;
        this.deliveryDuration = builder.deliveryDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataLiteTopicLagMapValue create() {
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
     * @return deliveryDuration
     */
    public Long getDeliveryDuration() {
        return this.deliveryDuration;
    }

    public static final class Builder {
        private Long readyCount; 
        private Long deliveryDuration; 

        private Builder() {
        } 

        private Builder(DataLiteTopicLagMapValue model) {
            this.readyCount = model.readyCount;
            this.deliveryDuration = model.deliveryDuration;
        } 

        /**
         * readyCount.
         */
        public Builder readyCount(Long readyCount) {
            this.readyCount = readyCount;
            return this;
        }

        /**
         * deliveryDuration.
         */
        public Builder deliveryDuration(Long deliveryDuration) {
            this.deliveryDuration = deliveryDuration;
            return this;
        }

        public DataLiteTopicLagMapValue build() {
            return new DataLiteTopicLagMapValue(this);
        } 

    } 

}
