// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListCenInterRegionTrafficQosQueuesRequest} extends {@link RequestModel}
 *
 * <p>ListCenInterRegionTrafficQosQueuesRequest</p>
 */
public class ListCenInterRegionTrafficQosQueuesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveBandwidthFilter")
    private EffectiveBandwidthFilter effectiveBandwidthFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyId")
    private String trafficQosPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosQueueDescription")
    private String trafficQosQueueDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosQueueId")
    private String trafficQosQueueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosQueueName")
    private String trafficQosQueueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private ListCenInterRegionTrafficQosQueuesRequest(Builder builder) {
        super(builder);
        this.effectiveBandwidthFilter = builder.effectiveBandwidthFilter;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficQosPolicyId = builder.trafficQosPolicyId;
        this.trafficQosQueueDescription = builder.trafficQosQueueDescription;
        this.trafficQosQueueId = builder.trafficQosQueueId;
        this.trafficQosQueueName = builder.trafficQosQueueName;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCenInterRegionTrafficQosQueuesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveBandwidthFilter
     */
    public EffectiveBandwidthFilter getEffectiveBandwidthFilter() {
        return this.effectiveBandwidthFilter;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return trafficQosPolicyId
     */
    public String getTrafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

    /**
     * @return trafficQosQueueDescription
     */
    public String getTrafficQosQueueDescription() {
        return this.trafficQosQueueDescription;
    }

    /**
     * @return trafficQosQueueId
     */
    public String getTrafficQosQueueId() {
        return this.trafficQosQueueId;
    }

    /**
     * @return trafficQosQueueName
     */
    public String getTrafficQosQueueName() {
        return this.trafficQosQueueName;
    }

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<ListCenInterRegionTrafficQosQueuesRequest, Builder> {
        private EffectiveBandwidthFilter effectiveBandwidthFilter; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficQosPolicyId; 
        private String trafficQosQueueDescription; 
        private String trafficQosQueueId; 
        private String trafficQosQueueName; 
        private String transitRouterAttachmentId; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(ListCenInterRegionTrafficQosQueuesRequest request) {
            super(request);
            this.effectiveBandwidthFilter = request.effectiveBandwidthFilter;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficQosPolicyId = request.trafficQosPolicyId;
            this.trafficQosQueueDescription = request.trafficQosQueueDescription;
            this.trafficQosQueueId = request.trafficQosQueueId;
            this.trafficQosQueueName = request.trafficQosQueueName;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * <p>The filter works based on the actual bandwidth. Enter a positive integer. Unit: Mbit/s.</p>
         */
        public Builder effectiveBandwidthFilter(EffectiveBandwidthFilter effectiveBandwidthFilter) {
            this.putQueryParameter("EffectiveBandwidthFilter", effectiveBandwidthFilter);
            this.effectiveBandwidthFilter = effectiveBandwidthFilter;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2ca1ed1573cb****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rnghap5gc8155x****</p>
         */
        public Builder trafficQosPolicyId(String trafficQosPolicyId) {
            this.putQueryParameter("TrafficQosPolicyId", trafficQosPolicyId);
            this.trafficQosPolicyId = trafficQosPolicyId;
            return this;
        }

        /**
         * <p>The description of the QoS queue.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>qosQueueDescription</p>
         */
        public Builder trafficQosQueueDescription(String trafficQosQueueDescription) {
            this.putQueryParameter("TrafficQosQueueDescription", trafficQosQueueDescription);
            this.trafficQosQueueDescription = trafficQosQueueDescription;
            return this;
        }

        /**
         * <p>The ID of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-siakjb2nn9gz5z****</p>
         */
        public Builder trafficQosQueueId(String trafficQosQueueId) {
            this.putQueryParameter("TrafficQosQueueId", trafficQosQueueId);
            this.trafficQosQueueId = trafficQosQueueId;
            return this;
        }

        /**
         * <p>The name of the QoS queue.</p>
         * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>qosQueueName</p>
         */
        public Builder trafficQosQueueName(String trafficQosQueueName) {
            this.putQueryParameter("TrafficQosQueueName", trafficQosQueueName);
            this.trafficQosQueueName = trafficQosQueueName;
            return this;
        }

        /**
         * <p>The ID of the inter-region connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-a6p8voaodog5c0****</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1rmwxnk221e3fas****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public ListCenInterRegionTrafficQosQueuesRequest build() {
            return new ListCenInterRegionTrafficQosQueuesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCenInterRegionTrafficQosQueuesRequest} extends {@link TeaModel}
     *
     * <p>ListCenInterRegionTrafficQosQueuesRequest</p>
     */
    public static class EffectiveBandwidthFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Gte")
        private Long gte;

        @com.aliyun.core.annotation.NameInMap("Lte")
        private Long lte;

        private EffectiveBandwidthFilter(Builder builder) {
            this.gte = builder.gte;
            this.lte = builder.lte;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveBandwidthFilter create() {
            return builder().build();
        }

        /**
         * @return gte
         */
        public Long getGte() {
            return this.gte;
        }

        /**
         * @return lte
         */
        public Long getLte() {
            return this.lte;
        }

        public static final class Builder {
            private Long gte; 
            private Long lte; 

            private Builder() {
            } 

            private Builder(EffectiveBandwidthFilter model) {
                this.gte = model.gte;
                this.lte = model.lte;
            } 

            /**
             * <p>The actual bandwidth is equal to or larger than the specified value.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder gte(Long gte) {
                this.gte = gte;
                return this;
            }

            /**
             * <p>The actual bandwidth is equal to or smaller than the specified value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder lte(Long lte) {
                this.lte = lte;
                return this;
            }

            public EffectiveBandwidthFilter build() {
                return new EffectiveBandwidthFilter(this);
            } 

        } 

    }
}
