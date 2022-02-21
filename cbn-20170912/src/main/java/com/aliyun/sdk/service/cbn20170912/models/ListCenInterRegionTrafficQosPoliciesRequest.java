// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCenInterRegionTrafficQosPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListCenInterRegionTrafficQosPoliciesRequest</p>
 */
public class ListCenInterRegionTrafficQosPoliciesRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrafficQosPolicyDescription")
    private String trafficQosPolicyDescription;

    @Query
    @NameInMap("TrafficQosPolicyId")
    private String trafficQosPolicyId;

    @Query
    @NameInMap("TrafficQosPolicyName")
    private String trafficQosPolicyName;

    @Query
    @NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    @Query
    @NameInMap("TransitRouterId")
    @Validation(required = true)
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

        private Builder(ListCenInterRegionTrafficQosPoliciesRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.trafficQosPolicyDescription = response.trafficQosPolicyDescription;
            this.trafficQosPolicyId = response.trafficQosPolicyId;
            this.trafficQosPolicyName = response.trafficQosPolicyName;
            this.transitRouterAttachmentId = response.transitRouterAttachmentId;
            this.transitRouterId = response.transitRouterId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
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
         * TrafficQosPolicyDescription.
         */
        public Builder trafficQosPolicyDescription(String trafficQosPolicyDescription) {
            this.putQueryParameter("TrafficQosPolicyDescription", trafficQosPolicyDescription);
            this.trafficQosPolicyDescription = trafficQosPolicyDescription;
            return this;
        }

        /**
         * TrafficQosPolicyId.
         */
        public Builder trafficQosPolicyId(String trafficQosPolicyId) {
            this.putQueryParameter("TrafficQosPolicyId", trafficQosPolicyId);
            this.trafficQosPolicyId = trafficQosPolicyId;
            return this;
        }

        /**
         * TrafficQosPolicyName.
         */
        public Builder trafficQosPolicyName(String trafficQosPolicyName) {
            this.putQueryParameter("TrafficQosPolicyName", trafficQosPolicyName);
            this.trafficQosPolicyName = trafficQosPolicyName;
            return this;
        }

        /**
         * TransitRouterAttachmentId.
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * TransitRouterId.
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
