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
 * {@link ListMultiAccountDeliveryChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiAccountDeliveryChannelsResponseBody</p>
 */
public class ListMultiAccountDeliveryChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryChannels")
    private java.util.List<DeliveryChannels> deliveryChannels;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMultiAccountDeliveryChannelsResponseBody(Builder builder) {
        this.deliveryChannels = builder.deliveryChannels;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountDeliveryChannelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryChannels
     */
    public java.util.List<DeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
        private java.util.List<DeliveryChannels> deliveryChannels; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMultiAccountDeliveryChannelsResponseBody model) {
            this.deliveryChannels = model.deliveryChannels;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The delivery channels.</p>
         */
        public Builder deliveryChannels(java.util.List<DeliveryChannels> deliveryChannels) {
            this.deliveryChannels = deliveryChannels;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17502A1B-7026-5551-8E1C-CCABD0CBC***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMultiAccountDeliveryChannelsResponseBody build() {
            return new ListMultiAccountDeliveryChannelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMultiAccountDeliveryChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiAccountDeliveryChannelsResponseBody</p>
     */
    public static class DeliveryChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelDescription")
        private String deliveryChannelDescription;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
        private String deliveryChannelId;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelName")
        private String deliveryChannelName;

        private DeliveryChannels(Builder builder) {
            this.createTime = builder.createTime;
            this.deliveryChannelDescription = builder.deliveryChannelDescription;
            this.deliveryChannelId = builder.deliveryChannelId;
            this.deliveryChannelName = builder.deliveryChannelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryChannels create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deliveryChannelDescription
         */
        public String getDeliveryChannelDescription() {
            return this.deliveryChannelDescription;
        }

        /**
         * @return deliveryChannelId
         */
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        /**
         * @return deliveryChannelName
         */
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public static final class Builder {
            private String createTime; 
            private String deliveryChannelDescription; 
            private String deliveryChannelId; 
            private String deliveryChannelName; 

            private Builder() {
            } 

            private Builder(DeliveryChannels model) {
                this.createTime = model.createTime;
                this.deliveryChannelDescription = model.deliveryChannelDescription;
                this.deliveryChannelId = model.deliveryChannelId;
                this.deliveryChannelName = model.deliveryChannelName;
            } 

            /**
             * <p>The time when the delivery channel was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-17T00:23:55Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the delivery channel.</p>
             */
            public Builder deliveryChannelDescription(String deliveryChannelDescription) {
                this.deliveryChannelDescription = deliveryChannelDescription;
                return this;
            }

            /**
             * <p>The ID of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>dc-0bzhsqpnk***</p>
             */
            public Builder deliveryChannelId(String deliveryChannelId) {
                this.deliveryChannelId = deliveryChannelId;
                return this;
            }

            /**
             * <p>The name of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>test-multi-account-delivery-channel</p>
             */
            public Builder deliveryChannelName(String deliveryChannelName) {
                this.deliveryChannelName = deliveryChannelName;
                return this;
            }

            public DeliveryChannels build() {
                return new DeliveryChannels(this);
            } 

        } 

    }
}
