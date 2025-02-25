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
 * {@link DeleteAggregateConfigDeliveryChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAggregateConfigDeliveryChannelResponseBody</p>
 */
public class DeleteAggregateConfigDeliveryChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    private String deliveryChannelId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAggregateConfigDeliveryChannelResponseBody(Builder builder) {
        this.deliveryChannelId = builder.deliveryChannelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAggregateConfigDeliveryChannelResponseBody create() {
        return builder().build();
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

        /**
         * <p>The ID of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>cdc-38c3013b46c9002c****</p>
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FCC2F05C-F672-5665-8102-0020DF66B9B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAggregateConfigDeliveryChannelResponseBody build() {
            return new DeleteAggregateConfigDeliveryChannelResponseBody(this);
        } 

    } 

}
