// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteTablesRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterRouteTablesRequest</p>
 */
public class ListTransitRouterRouteTablesRequest extends Request {
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
    @NameInMap("TransitRouterId")
    @Validation(required = true)
    private String transitRouterId;

    @Query
    @NameInMap("TransitRouterRouteTableIds")
    private java.util.List < String > transitRouterRouteTableIds;

    @Query
    @NameInMap("TransitRouterRouteTableNames")
    private java.util.List < String > transitRouterRouteTableNames;

    @Query
    @NameInMap("TransitRouterRouteTableStatus")
    private String transitRouterRouteTableStatus;

    @Query
    @NameInMap("TransitRouterRouteTableType")
    private String transitRouterRouteTableType;

    private ListTransitRouterRouteTablesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterId = builder.transitRouterId;
        this.transitRouterRouteTableIds = builder.transitRouterRouteTableIds;
        this.transitRouterRouteTableNames = builder.transitRouterRouteTableNames;
        this.transitRouterRouteTableStatus = builder.transitRouterRouteTableStatus;
        this.transitRouterRouteTableType = builder.transitRouterRouteTableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteTablesRequest create() {
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
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return transitRouterRouteTableIds
     */
    public java.util.List < String > getTransitRouterRouteTableIds() {
        return this.transitRouterRouteTableIds;
    }

    /**
     * @return transitRouterRouteTableNames
     */
    public java.util.List < String > getTransitRouterRouteTableNames() {
        return this.transitRouterRouteTableNames;
    }

    /**
     * @return transitRouterRouteTableStatus
     */
    public String getTransitRouterRouteTableStatus() {
        return this.transitRouterRouteTableStatus;
    }

    /**
     * @return transitRouterRouteTableType
     */
    public String getTransitRouterRouteTableType() {
        return this.transitRouterRouteTableType;
    }

    public static final class Builder extends Request.Builder<ListTransitRouterRouteTablesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterId; 
        private java.util.List < String > transitRouterRouteTableIds; 
        private java.util.List < String > transitRouterRouteTableNames; 
        private String transitRouterRouteTableStatus; 
        private String transitRouterRouteTableType; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterRouteTablesRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.transitRouterId = response.transitRouterId;
            this.transitRouterRouteTableIds = response.transitRouterRouteTableIds;
            this.transitRouterRouteTableNames = response.transitRouterRouteTableNames;
            this.transitRouterRouteTableStatus = response.transitRouterRouteTableStatus;
            this.transitRouterRouteTableType = response.transitRouterRouteTableType;
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
         * TransitRouterId.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * TransitRouterRouteTableIds.
         */
        public Builder transitRouterRouteTableIds(java.util.List < String > transitRouterRouteTableIds) {
            this.putQueryParameter("TransitRouterRouteTableIds", transitRouterRouteTableIds);
            this.transitRouterRouteTableIds = transitRouterRouteTableIds;
            return this;
        }

        /**
         * TransitRouterRouteTableNames.
         */
        public Builder transitRouterRouteTableNames(java.util.List < String > transitRouterRouteTableNames) {
            this.putQueryParameter("TransitRouterRouteTableNames", transitRouterRouteTableNames);
            this.transitRouterRouteTableNames = transitRouterRouteTableNames;
            return this;
        }

        /**
         * TransitRouterRouteTableStatus.
         */
        public Builder transitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
            this.putQueryParameter("TransitRouterRouteTableStatus", transitRouterRouteTableStatus);
            this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
            return this;
        }

        /**
         * TransitRouterRouteTableType.
         */
        public Builder transitRouterRouteTableType(String transitRouterRouteTableType) {
            this.putQueryParameter("TransitRouterRouteTableType", transitRouterRouteTableType);
            this.transitRouterRouteTableType = transitRouterRouteTableType;
            return this;
        }

        @Override
        public ListTransitRouterRouteTablesRequest build() {
            return new ListTransitRouterRouteTablesRequest(this);
        } 

    } 

}
