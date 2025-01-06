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
 * {@link ListCenInterRegionTrafficQosPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListCenInterRegionTrafficQosPoliciesRequest</p>
 */
public class ListCenInterRegionTrafficQosPoliciesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyDescription")
    private String trafficQosPolicyDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyId")
    private String trafficQosPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyName")
    private String trafficQosPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private ListCenInterRegionTrafficQosPoliciesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficQosPolicyDescription = builder.trafficQosPolicyDescription;
        this.trafficQosPolicyId = builder.trafficQosPolicyId;
        this.trafficQosPolicyName = builder.trafficQosPolicyName;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCenInterRegionTrafficQosPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return trafficQosPolicyDescription
     */
    public String getTrafficQosPolicyDescription() {
        return this.trafficQosPolicyDescription;
    }

    /**
     * @return trafficQosPolicyId
     */
    public String getTrafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

    /**
     * @return trafficQosPolicyName
     */
    public String getTrafficQosPolicyName() {
        return this.trafficQosPolicyName;
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

    public static final class Builder extends Request.Builder<ListCenInterRegionTrafficQosPoliciesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficQosPolicyDescription; 
        private String trafficQosPolicyId; 
        private String trafficQosPolicyName; 
        private String transitRouterAttachmentId; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(ListCenInterRegionTrafficQosPoliciesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficQosPolicyDescription = request.trafficQosPolicyDescription;
            this.trafficQosPolicyId = request.trafficQosPolicyId;
            this.trafficQosPolicyName = request.trafficQosPolicyName;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
            this.transitRouterId = request.transitRouterId;
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
         * <p>The token that determines the start point of the query. Valid values:</p>
         * <ul>
         * <li>If this is your first query or no subsequent query is to be sent, ignore this parameter.</li>
         * <li>If a next query is to be sent, set the value to the value of <strong>NextToken</strong> that is returned from the last call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
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
         * <p>The description of the QoS policy.</p>
         * <p>The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder trafficQosPolicyDescription(String trafficQosPolicyDescription) {
            this.putQueryParameter("TrafficQosPolicyDescription", trafficQosPolicyDescription);
            this.trafficQosPolicyDescription = trafficQosPolicyDescription;
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
         * <p>The name of the QoS policy.</p>
         * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder trafficQosPolicyName(String trafficQosPolicyName) {
            this.putQueryParameter("TrafficQosPolicyName", trafficQosPolicyName);
            this.trafficQosPolicyName = trafficQosPolicyName;
            return this;
        }

        /**
         * <p>The ID of the inter-region connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-r6g0m3epjehw57****</p>
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
        public ListCenInterRegionTrafficQosPoliciesRequest build() {
            return new ListCenInterRegionTrafficQosPoliciesRequest(this);
        } 

    } 

}
