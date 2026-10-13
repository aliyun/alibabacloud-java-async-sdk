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
 * {@link ListHiMarketConsumerSubscriptionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHiMarketConsumerSubscriptionsResponseBody</p>
 */
public class ListHiMarketConsumerSubscriptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListHiMarketConsumerSubscriptionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHiMarketConsumerSubscriptionsResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListHiMarketConsumerSubscriptionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
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
         * <p>The maximum number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * <p>The cursor for the next page. An empty value indicates that the last page is reached.</p>
         * 
         * <strong>example:</strong>
         * <p>token-xxxxxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListHiMarketConsumerSubscriptionsResponseBody build() {
            return new ListHiMarketConsumerSubscriptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHiMarketConsumerSubscriptionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHiMarketConsumerSubscriptionsResponseBody</p>
     */
    public static class Content extends TeaModel {
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

        private Content(Builder builder) {
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

        public static Content create() {
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

            private Builder(Content model) {
                this.consumerId = model.consumerId;
                this.consumerName = model.consumerName;
                this.productId = model.productId;
                this.productName = model.productName;
                this.productType = model.productType;
                this.status = model.status;
                this.subscriptionId = model.subscriptionId;
            } 

            /**
             * <p>The ID of the consumer to which the subscription belongs. This is the same identifier as the consumerId path parameter of this API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-xxxxxxxxxxxx</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The name of the consumer to which the subscription belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-1</p>
             */
            public Builder consumerName(String consumerName) {
                this.consumerName = consumerName;
                return this;
            }

            /**
             * <p>The ID of the subscribed API product, which is the primary ID of the API product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>product-xxxxxxxx</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The name of the subscribed API product.</p>
             * 
             * <strong>example:</strong>
             * <p>model-service</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The type of the subscribed API product. This response parameter does not declare enums. The related ListProductSubscriptions API operation declares the following valid values for the parameter with the same name: REST_API, HTTP_API, MCP_SERVER, AGENT_API, and MODEL_API.</p>
             * 
             * <strong>example:</strong>
             * <p>MCP_SERVER</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The subscription status. Valid values: PENDING and APPROVED. This set of valid values is declared in the enums of the status request parameter in this API operation, and this response parameter does not declare enums.</p>
             * 
             * <strong>example:</strong>
             * <p>APPROVED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subscription ID. You can use this ID to unsubscribe from the product by calling UnsubscribeHiMarketProduct or approve the subscription by calling ApproveProductSubscription. Both operations locate the subscription by using the /himarket/v1/consumers/{consumerId}/subscriptions/{subscriptionId} path.</p>
             * 
             * <strong>example:</strong>
             * <p>sub-xxxxxxxx</p>
             */
            public Builder subscriptionId(String subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHiMarketConsumerSubscriptionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHiMarketConsumerSubscriptionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.content = builder.content;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of API product subscriptions for the consumer. The list element is named subscription, and each element represents an API product subscription record.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
