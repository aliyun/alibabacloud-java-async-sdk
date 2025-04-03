// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link UpdateAggregateConfigDeliveryChannelResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAggregateConfigDeliveryChannelResponseBody</p>
 */
public class UpdateAggregateConfigDeliveryChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    private String deliveryChannelId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAggregateConfigDeliveryChannelResponseBody(Builder builder) {
        this.deliveryChannelId = builder.deliveryChannelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregateConfigDeliveryChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryChannelId
     */
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deliveryChannelId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateAggregateConfigDeliveryChannelResponseBody model) {
            this.deliveryChannelId = model.deliveryChannelId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>cdc-8e45ff4e06a3a8****</p>
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A7A0FFF8-0B44-40C6-8BBF-3A185EFDERTHG</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAggregateConfigDeliveryChannelResponseBody build() {
            return new UpdateAggregateConfigDeliveryChannelResponseBody(this);
        } 

    } 

}
