// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDeliveryChannelResponseBody} extends {@link TeaModel}
 *
 * <p>PutDeliveryChannelResponseBody</p>
 */
public class PutDeliveryChannelResponseBody extends TeaModel {
    @NameInMap("DeliveryChannelId")
    private String deliveryChannelId;

    @NameInMap("RequestId")
    private String requestId;

    private PutDeliveryChannelResponseBody(Builder builder) {
        this.deliveryChannelId = builder.deliveryChannelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDeliveryChannelResponseBody create() {
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
         * DeliveryChannelId.
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PutDeliveryChannelResponseBody build() {
            return new PutDeliveryChannelResponseBody(this);
        } 

    } 

}
