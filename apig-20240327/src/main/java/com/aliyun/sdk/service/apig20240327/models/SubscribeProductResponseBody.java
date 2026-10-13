// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link SubscribeProductResponseBody} extends {@link TeaModel}
 *
 * <p>SubscribeProductResponseBody</p>
 */
public class SubscribeProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SubscribeProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeProductResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubscribeProductResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubscribeProductResponseBody build() {
            return new SubscribeProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubscribeProductResponseBody} extends {@link TeaModel}
     *
     * <p>SubscribeProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("consumerName")
        private String consumerName;

        @com.aliyun.core.annotation.NameInMap("productId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("productType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subscriptionId")
        private String subscriptionId;

        private Data(Builder builder) {
            this.consumerId = builder.consumerId;
            this.consumerName = builder.consumerName;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.productType = builder.productType;
            this.status = builder.status;
            this.subscriptionId = builder.subscriptionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return consumerName
         */
        public String getConsumerName() {
            return this.consumerName;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subscriptionId
         */
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public static final class Builder {
            private String consumerId; 
            private String consumerName; 
            private String productId; 
            private String productName; 
            private String productType; 
            private String status; 
            private String subscriptionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumerId = model.consumerId;
                this.consumerName = model.consumerName;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productType = model.productType;
                this.status = model.status;
                this.subscriptionId = model.subscriptionId;
            } 

            /**
             * <p>The ID of the consumer to which the subscription belongs. This is the same identifier as the consumerId path parameter in the request and refers to the same consumer as the consumerName field returned at the same level.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-xxxxxxxxxxxx</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The name of the consumer to which the subscription belongs. This refers to the same consumer as the consumerId field returned at the same level.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-1</p>
             */
            public Builder consumerName(String consumerName) {
                this.consumerName = consumerName;
                return this;
            }

            /**
             * <p>The ID of the subscribed API product. This is the primary ID of the API product resource and is the same identifier as the productId passed in the request body.</p>
             * 
             * <strong>example:</strong>
             * <p>product-xxxxxxxx</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The name of the subscribed API product. This is the Name property of the API product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>model-service</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The type of the subscribed API product. The valid values are not declared in this operation definition. The response parameter with the same name in the related ListProductSubscriptions operation includes the following valid values: REST_API, HTTP_API, MCP_SERVER, AGENT_API, and MODEL_API.</p>
             * 
             * <strong>example:</strong>
             * <p>MCP_SERVER</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The subscription status. Valid values: PENDING and APPROVED. These valid values are declared in the status request parameter of the related ListProductSubscriptions operation.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subscription ID. Identifies the API product subscription record corresponding to this subscription. You can use this ID to cancel the subscription by calling UnsubscribeHiMarketProduct or approve the subscription by calling ApproveProductSubscription. Both operations locate the record by using the /himarket/v1/consumers/{consumerId}/subscriptions/{subscriptionId} path.</p>
             * 
             * <strong>example:</strong>
             * <p>sub-xxxxxxxx</p>
             */
            public Builder subscriptionId(String subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
