// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateProductOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProductOrdersResponseBody</p>
 */
public class CreateProductOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuyProductRequestId")
    private String buyProductRequestId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("ProductIds")
    private java.util.List<String> productIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProductOrdersResponseBody(Builder builder) {
        this.buyProductRequestId = builder.buyProductRequestId;
        this.message = builder.message;
        this.orderId = builder.orderId;
        this.productIds = builder.productIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductOrdersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buyProductRequestId
     */
    public String getBuyProductRequestId() {
        return this.buyProductRequestId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return productIds
     */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String buyProductRequestId; 
        private String message; 
        private String orderId; 
        private java.util.List<String> productIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateProductOrdersResponseBody model) {
            this.buyProductRequestId = model.buyProductRequestId;
            this.message = model.message;
            this.orderId = model.orderId;
            this.productIds = model.productIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the product purchase request.</p>
         * 
         * <strong>example:</strong>
         * <p>3ed6a882-0d85-4dd8-ad36-cd8d74ab9fdb</p>
         */
        public Builder buyProductRequestId(String buyProductRequestId) {
            this.buyProductRequestId = buyProductRequestId;
            return this;
        }

        /**
         * <p>The returned message.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The purchase order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>210292536260646</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * ProductIds.
         */
        public Builder productIds(java.util.List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ksdjf-jksd-*****slkdjf</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProductOrdersResponseBody build() {
            return new CreateProductOrdersResponseBody(this);
        } 

    } 

}
