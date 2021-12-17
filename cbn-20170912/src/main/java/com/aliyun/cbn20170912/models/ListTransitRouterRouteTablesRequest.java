// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListTransitRouterRouteTablesRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterRouteTablesRequest</p>
 */
public class ListTransitRouterRouteTablesRequest extends Request {
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
    @NameInMap("TransitRouterId")
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

    public static final class Builder extends Request.Builder<Builder> {
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

        /**
         * <p>MaxResults.</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>NextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>OwnerAccount.</p>
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * <p>OwnerId.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>ResourceOwnerAccount.</p>
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>TransitRouterId.</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>TransitRouterRouteTableIds.</p>
         */
        public Builder transitRouterRouteTableIds(java.util.List < String > transitRouterRouteTableIds) {
            this.putQueryParameter("TransitRouterRouteTableIds", transitRouterRouteTableIds);
            this.transitRouterRouteTableIds = transitRouterRouteTableIds;
            return this;
        }

        /**
         * <p>TransitRouterRouteTableNames.</p>
         */
        public Builder transitRouterRouteTableNames(java.util.List < String > transitRouterRouteTableNames) {
            this.putQueryParameter("TransitRouterRouteTableNames", transitRouterRouteTableNames);
            this.transitRouterRouteTableNames = transitRouterRouteTableNames;
            return this;
        }

        /**
         * <p>TransitRouterRouteTableStatus.</p>
         */
        public Builder transitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
            this.putQueryParameter("TransitRouterRouteTableStatus", transitRouterRouteTableStatus);
            this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
            return this;
        }

        /**
         * <p>TransitRouterRouteTableType.</p>
         */
        public Builder transitRouterRouteTableType(String transitRouterRouteTableType) {
            this.putQueryParameter("TransitRouterRouteTableType", transitRouterRouteTableType);
            this.transitRouterRouteTableType = transitRouterRouteTableType;
            return this;
        }

        public ListTransitRouterRouteTablesRequest build() {
            return new ListTransitRouterRouteTablesRequest(this);
        } 

    } 

}
