// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitRouteTableAggregationRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransitRouteTableAggregationRequest</p>
 */
public class DescribeTransitRouteTableAggregationRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

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
    @NameInMap("TransitRouteTableAggregationCidr")
    private String transitRouteTableAggregationCidr;

    @Query
    @NameInMap("TransitRouteTableId")
    @Validation(required = true)
    private String transitRouteTableId;

    private DescribeTransitRouteTableAggregationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouteTableAggregationCidr = builder.transitRouteTableAggregationCidr;
        this.transitRouteTableId = builder.transitRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouteTableAggregationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
     * @return transitRouteTableAggregationCidr
     */
    public String getTransitRouteTableAggregationCidr() {
        return this.transitRouteTableAggregationCidr;
    }

    /**
     * @return transitRouteTableId
     */
    public String getTransitRouteTableId() {
        return this.transitRouteTableId;
    }

    public static final class Builder extends Request.Builder<DescribeTransitRouteTableAggregationRequest, Builder> {
        private String clientToken; 
        private Long maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouteTableAggregationCidr; 
        private String transitRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTransitRouteTableAggregationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouteTableAggregationCidr = request.transitRouteTableAggregationCidr;
            this.transitRouteTableId = request.transitRouteTableId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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
         * TransitRouteTableAggregationCidr.
         */
        public Builder transitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
            this.putQueryParameter("TransitRouteTableAggregationCidr", transitRouteTableAggregationCidr);
            this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
            return this;
        }

        /**
         * TransitRouteTableId.
         */
        public Builder transitRouteTableId(String transitRouteTableId) {
            this.putQueryParameter("TransitRouteTableId", transitRouteTableId);
            this.transitRouteTableId = transitRouteTableId;
            return this;
        }

        @Override
        public DescribeTransitRouteTableAggregationRequest build() {
            return new DescribeTransitRouteTableAggregationRequest(this);
        } 

    } 

}
