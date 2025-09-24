// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link PayOrderResponseBody} extends {@link TeaModel}
 *
 * <p>PayOrderResponseBody</p>
 */
public class PayOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("PayStatus")
    private Long payStatus;

    @com.aliyun.core.annotation.NameInMap("PayerId")
    private Long payerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PayOrderResponseBody(Builder builder) {
        this.metadata = builder.metadata;
        this.orderId = builder.orderId;
        this.payStatus = builder.payStatus;
        this.payerId = builder.payerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PayOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return payStatus
     */
    public Long getPayStatus() {
        return this.payStatus;
    }

    /**
     * @return payerId
     */
    public Long getPayerId() {
        return this.payerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object metadata; 
        private Long orderId; 
        private Long payStatus; 
        private Long payerId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PayOrderResponseBody model) {
            this.metadata = model.metadata;
            this.orderId = model.orderId;
            this.payStatus = model.payStatus;
            this.payerId = model.payerId;
            this.requestId = model.requestId;
        } 

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PayStatus.
         */
        public Builder payStatus(Long payStatus) {
            this.payStatus = payStatus;
            return this;
        }

        /**
         * PayerId.
         */
        public Builder payerId(Long payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PayOrderResponseBody build() {
            return new PayOrderResponseBody(this);
        } 

    } 

}
