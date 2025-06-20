// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link CreateDeliveryChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeliveryChannelResponseBody</p>
 */
public class CreateDeliveryChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    private String deliveryChannelId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDeliveryChannelResponseBody(Builder builder) {
        this.deliveryChannelId = builder.deliveryChannelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeliveryChannelResponseBody create() {
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

        private Builder(CreateDeliveryChannelResponseBody model) {
            this.deliveryChannelId = model.deliveryChannelId;
            this.requestId = model.requestId;
        } 

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

        public CreateDeliveryChannelResponseBody build() {
            return new CreateDeliveryChannelResponseBody(this);
        } 

    } 

}
