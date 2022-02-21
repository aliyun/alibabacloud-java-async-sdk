// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterRouteEntriesRequest</p>
 */
public class ListTransitRouterRouteEntriesRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
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
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    private String transitRouterRouteEntryDestinationCidrBlock;

    @Query
    @NameInMap("TransitRouterRouteEntryIds")
    private java.util.List < String > transitRouterRouteEntryIds;

    @Query
    @NameInMap("TransitRouterRouteEntryNames")
    private java.util.List < String > transitRouterRouteEntryNames;

    @Query
    @NameInMap("TransitRouterRouteEntryStatus")
    private String transitRouterRouteEntryStatus;

    @Query
    @NameInMap("TransitRouterRouteTableId")
    @Validation(required = true)
    private String transitRouterRouteTableId;

    private ListTransitRouterRouteEntriesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterRouteEntryDestinationCidrBlock = builder.transitRouterRouteEntryDestinationCidrBlock;
        this.transitRouterRouteEntryIds = builder.transitRouterRouteEntryIds;
        this.transitRouterRouteEntryNames = builder.transitRouterRouteEntryNames;
        this.transitRouterRouteEntryStatus = builder.transitRouterRouteEntryStatus;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteEntriesRequest create() {
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
     * @return transitRouterRouteEntryDestinationCidrBlock
     */
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    /**
     * @return transitRouterRouteEntryIds
     */
    public java.util.List < String > getTransitRouterRouteEntryIds() {
        return this.transitRouterRouteEntryIds;
    }

    /**
     * @return transitRouterRouteEntryNames
     */
    public java.util.List < String > getTransitRouterRouteEntryNames() {
        return this.transitRouterRouteEntryNames;
    }

    /**
     * @return transitRouterRouteEntryStatus
     */
    public String getTransitRouterRouteEntryStatus() {
        return this.transitRouterRouteEntryStatus;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static final class Builder extends Request.Builder<ListTransitRouterRouteEntriesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterRouteEntryDestinationCidrBlock; 
        private java.util.List < String > transitRouterRouteEntryIds; 
        private java.util.List < String > transitRouterRouteEntryNames; 
        private String transitRouterRouteEntryStatus; 
        private String transitRouterRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterRouteEntriesRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.transitRouterRouteEntryDestinationCidrBlock = response.transitRouterRouteEntryDestinationCidrBlock;
            this.transitRouterRouteEntryIds = response.transitRouterRouteEntryIds;
            this.transitRouterRouteEntryNames = response.transitRouterRouteEntryNames;
            this.transitRouterRouteEntryStatus = response.transitRouterRouteEntryStatus;
            this.transitRouterRouteTableId = response.transitRouterRouteTableId;
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
         * TransitRouterRouteEntryDestinationCidrBlock.
         */
        public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.putQueryParameter("TransitRouterRouteEntryDestinationCidrBlock", transitRouterRouteEntryDestinationCidrBlock);
            this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
            return this;
        }

        /**
         * TransitRouterRouteEntryIds.
         */
        public Builder transitRouterRouteEntryIds(java.util.List < String > transitRouterRouteEntryIds) {
            this.putQueryParameter("TransitRouterRouteEntryIds", transitRouterRouteEntryIds);
            this.transitRouterRouteEntryIds = transitRouterRouteEntryIds;
            return this;
        }

        /**
         * TransitRouterRouteEntryNames.
         */
        public Builder transitRouterRouteEntryNames(java.util.List < String > transitRouterRouteEntryNames) {
            this.putQueryParameter("TransitRouterRouteEntryNames", transitRouterRouteEntryNames);
            this.transitRouterRouteEntryNames = transitRouterRouteEntryNames;
            return this;
        }

        /**
         * TransitRouterRouteEntryStatus.
         */
        public Builder transitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
            this.putQueryParameter("TransitRouterRouteEntryStatus", transitRouterRouteEntryStatus);
            this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
            return this;
        }

        /**
         * TransitRouterRouteTableId.
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        @Override
        public ListTransitRouterRouteEntriesRequest build() {
            return new ListTransitRouterRouteEntriesRequest(this);
        } 

    } 

}
