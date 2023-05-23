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
    @NameInMap("PrefixListId")
    private String prefixListId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteFilter")
    private java.util.List < RouteFilter> routeFilter;

    @Query
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    @Deprecated
    private String transitRouterRouteEntryDestinationCidrBlock;

    @Query
    @NameInMap("TransitRouterRouteEntryIds")
    private java.util.List < String > transitRouterRouteEntryIds;

    @Query
    @NameInMap("TransitRouterRouteEntryNames")
    private java.util.List < String > transitRouterRouteEntryNames;

    @Query
    @NameInMap("TransitRouterRouteEntryNextHopId")
    private String transitRouterRouteEntryNextHopId;

    @Query
    @NameInMap("TransitRouterRouteEntryNextHopResourceId")
    private String transitRouterRouteEntryNextHopResourceId;

    @Query
    @NameInMap("TransitRouterRouteEntryNextHopResourceType")
    private String transitRouterRouteEntryNextHopResourceType;

    @Query
    @NameInMap("TransitRouterRouteEntryNextHopType")
    private String transitRouterRouteEntryNextHopType;

    @Query
    @NameInMap("TransitRouterRouteEntryOriginResourceId")
    private String transitRouterRouteEntryOriginResourceId;

    @Query
    @NameInMap("TransitRouterRouteEntryOriginResourceType")
    private String transitRouterRouteEntryOriginResourceType;

    @Query
    @NameInMap("TransitRouterRouteEntryStatus")
    private String transitRouterRouteEntryStatus;

    @Query
    @NameInMap("TransitRouterRouteEntryType")
    private String transitRouterRouteEntryType;

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
        this.prefixListId = builder.prefixListId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeFilter = builder.routeFilter;
        this.transitRouterRouteEntryDestinationCidrBlock = builder.transitRouterRouteEntryDestinationCidrBlock;
        this.transitRouterRouteEntryIds = builder.transitRouterRouteEntryIds;
        this.transitRouterRouteEntryNames = builder.transitRouterRouteEntryNames;
        this.transitRouterRouteEntryNextHopId = builder.transitRouterRouteEntryNextHopId;
        this.transitRouterRouteEntryNextHopResourceId = builder.transitRouterRouteEntryNextHopResourceId;
        this.transitRouterRouteEntryNextHopResourceType = builder.transitRouterRouteEntryNextHopResourceType;
        this.transitRouterRouteEntryNextHopType = builder.transitRouterRouteEntryNextHopType;
        this.transitRouterRouteEntryOriginResourceId = builder.transitRouterRouteEntryOriginResourceId;
        this.transitRouterRouteEntryOriginResourceType = builder.transitRouterRouteEntryOriginResourceType;
        this.transitRouterRouteEntryStatus = builder.transitRouterRouteEntryStatus;
        this.transitRouterRouteEntryType = builder.transitRouterRouteEntryType;
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
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
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
     * @return routeFilter
     */
    public java.util.List < RouteFilter> getRouteFilter() {
        return this.routeFilter;
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
     * @return transitRouterRouteEntryNextHopId
     */
    public String getTransitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }

    /**
     * @return transitRouterRouteEntryNextHopResourceId
     */
    public String getTransitRouterRouteEntryNextHopResourceId() {
        return this.transitRouterRouteEntryNextHopResourceId;
    }

    /**
     * @return transitRouterRouteEntryNextHopResourceType
     */
    public String getTransitRouterRouteEntryNextHopResourceType() {
        return this.transitRouterRouteEntryNextHopResourceType;
    }

    /**
     * @return transitRouterRouteEntryNextHopType
     */
    public String getTransitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }

    /**
     * @return transitRouterRouteEntryOriginResourceId
     */
    public String getTransitRouterRouteEntryOriginResourceId() {
        return this.transitRouterRouteEntryOriginResourceId;
    }

    /**
     * @return transitRouterRouteEntryOriginResourceType
     */
    public String getTransitRouterRouteEntryOriginResourceType() {
        return this.transitRouterRouteEntryOriginResourceType;
    }

    /**
     * @return transitRouterRouteEntryStatus
     */
    public String getTransitRouterRouteEntryStatus() {
        return this.transitRouterRouteEntryStatus;
    }

    /**
     * @return transitRouterRouteEntryType
     */
    public String getTransitRouterRouteEntryType() {
        return this.transitRouterRouteEntryType;
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
        private String prefixListId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < RouteFilter> routeFilter; 
        private String transitRouterRouteEntryDestinationCidrBlock; 
        private java.util.List < String > transitRouterRouteEntryIds; 
        private java.util.List < String > transitRouterRouteEntryNames; 
        private String transitRouterRouteEntryNextHopId; 
        private String transitRouterRouteEntryNextHopResourceId; 
        private String transitRouterRouteEntryNextHopResourceType; 
        private String transitRouterRouteEntryNextHopType; 
        private String transitRouterRouteEntryOriginResourceId; 
        private String transitRouterRouteEntryOriginResourceType; 
        private String transitRouterRouteEntryStatus; 
        private String transitRouterRouteEntryType; 
        private String transitRouterRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterRouteEntriesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.prefixListId = request.prefixListId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeFilter = request.routeFilter;
            this.transitRouterRouteEntryDestinationCidrBlock = request.transitRouterRouteEntryDestinationCidrBlock;
            this.transitRouterRouteEntryIds = request.transitRouterRouteEntryIds;
            this.transitRouterRouteEntryNames = request.transitRouterRouteEntryNames;
            this.transitRouterRouteEntryNextHopId = request.transitRouterRouteEntryNextHopId;
            this.transitRouterRouteEntryNextHopResourceId = request.transitRouterRouteEntryNextHopResourceId;
            this.transitRouterRouteEntryNextHopResourceType = request.transitRouterRouteEntryNextHopResourceType;
            this.transitRouterRouteEntryNextHopType = request.transitRouterRouteEntryNextHopType;
            this.transitRouterRouteEntryOriginResourceId = request.transitRouterRouteEntryOriginResourceId;
            this.transitRouterRouteEntryOriginResourceType = request.transitRouterRouteEntryOriginResourceType;
            this.transitRouterRouteEntryStatus = request.transitRouterRouteEntryStatus;
            this.transitRouterRouteEntryType = request.transitRouterRouteEntryType;
            this.transitRouterRouteTableId = request.transitRouterRouteTableId;
        } 

        /**
         * The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of **NextToken**.
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
         * PrefixListId.
         */
        public Builder prefixListId(String prefixListId) {
            this.putQueryParameter("PrefixListId", prefixListId);
            this.prefixListId = prefixListId;
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
         * RouteFilter.
         */
        public Builder routeFilter(java.util.List < RouteFilter> routeFilter) {
            this.putQueryParameter("RouteFilter", routeFilter);
            this.routeFilter = routeFilter;
            return this;
        }

        /**
         * The destination CIDR block of the route.
         */
        public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.putQueryParameter("TransitRouterRouteEntryDestinationCidrBlock", transitRouterRouteEntryDestinationCidrBlock);
            this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
            return this;
        }

        /**
         * The route entry ID.
         * <p>
         * 
         * You can specify at most 20 route IDs in each call.
         * 
         * >  You can use only this parameter to query static routes.
         */
        public Builder transitRouterRouteEntryIds(java.util.List < String > transitRouterRouteEntryIds) {
            this.putQueryParameter("TransitRouterRouteEntryIds", transitRouterRouteEntryIds);
            this.transitRouterRouteEntryIds = transitRouterRouteEntryIds;
            return this;
        }

        /**
         * The route name.
         * <p>
         * 
         * The name must be 0 to 128 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -.
         * 
         * You can specify at most 20 route names in each call.
         * 
         * >  You can use only this parameter to query static routes.
         */
        public Builder transitRouterRouteEntryNames(java.util.List < String > transitRouterRouteEntryNames) {
            this.putQueryParameter("TransitRouterRouteEntryNames", transitRouterRouteEntryNames);
            this.transitRouterRouteEntryNames = transitRouterRouteEntryNames;
            return this;
        }

        /**
         * TransitRouterRouteEntryNextHopId.
         */
        public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopId", transitRouterRouteEntryNextHopId);
            this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
            return this;
        }

        /**
         * TransitRouterRouteEntryNextHopResourceId.
         */
        public Builder transitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopResourceId", transitRouterRouteEntryNextHopResourceId);
            this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
            return this;
        }

        /**
         * TransitRouterRouteEntryNextHopResourceType.
         */
        public Builder transitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopResourceType", transitRouterRouteEntryNextHopResourceType);
            this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
            return this;
        }

        /**
         * TransitRouterRouteEntryNextHopType.
         */
        public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopType", transitRouterRouteEntryNextHopType);
            this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
            return this;
        }

        /**
         * TransitRouterRouteEntryOriginResourceId.
         */
        public Builder transitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
            this.putQueryParameter("TransitRouterRouteEntryOriginResourceId", transitRouterRouteEntryOriginResourceId);
            this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
            return this;
        }

        /**
         * TransitRouterRouteEntryOriginResourceType.
         */
        public Builder transitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
            this.putQueryParameter("TransitRouterRouteEntryOriginResourceType", transitRouterRouteEntryOriginResourceType);
            this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
            return this;
        }

        /**
         * The status of the route. Valid values:
         * <p>
         * 
         * *   **Creating**: The route is being created.
         * *   **Active**: The route is available.
         * *   **Deleting**: The route is being deleted.
         */
        public Builder transitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
            this.putQueryParameter("TransitRouterRouteEntryStatus", transitRouterRouteEntryStatus);
            this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
            return this;
        }

        /**
         * TransitRouterRouteEntryType.
         */
        public Builder transitRouterRouteEntryType(String transitRouterRouteEntryType) {
            this.putQueryParameter("TransitRouterRouteEntryType", transitRouterRouteEntryType);
            this.transitRouterRouteEntryType = transitRouterRouteEntryType;
            return this;
        }

        /**
         * The ID of the route table of the Enterprise Edition transit router.
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

    public static class RouteFilter extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private java.util.List < String > value;

        private RouteFilter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteFilter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public java.util.List < String > getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(java.util.List < String > value) {
                this.value = value;
                return this;
            }

            public RouteFilter build() {
                return new RouteFilter(this);
            } 

        } 

    }
}
