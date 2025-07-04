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
 * {@link CreateMultiAccountDeliveryChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMultiAccountDeliveryChannelResponseBody</p>
 */
public class CreateMultiAccountDeliveryChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    private String deliveryChannelId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMultiAccountDeliveryChannelResponseBody(Builder builder) {
        this.deliveryChannelId = builder.deliveryChannelId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiAccountDeliveryChannelResponseBody create() {
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

        private Builder(CreateMultiAccountDeliveryChannelResponseBody model) {
            this.deliveryChannelId = model.deliveryChannelId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-6q79dm4o9***</p>
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>994BFEFE-4BB5-5A27-8917-4583DEEF2***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMultiAccountDeliveryChannelResponseBody build() {
            return new CreateMultiAccountDeliveryChannelResponseBody(this);
        } 

    } 

}
