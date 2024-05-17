// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterRouteEntriesRequest</p>
 */
public class ListTransitRouterRouteEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
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
    @com.aliyun.core.annotation.NameInMap("PrefixListId")
    private String prefixListId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteFilter")
    private java.util.List < RouteFilter> routeFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    @Deprecated
    private String transitRouterRouteEntryDestinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryIds")
    private java.util.List < String > transitRouterRouteEntryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNames")
    private java.util.List < String > transitRouterRouteEntryNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopId")
    private String transitRouterRouteEntryNextHopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopResourceId")
    private String transitRouterRouteEntryNextHopResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopResourceType")
    private String transitRouterRouteEntryNextHopResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopType")
    private String transitRouterRouteEntryNextHopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryOriginResourceId")
    private String transitRouterRouteEntryOriginResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryOriginResourceType")
    private String transitRouterRouteEntryOriginResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryStatus")
    private String transitRouterRouteEntryStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryType")
    private String transitRouterRouteEntryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The number of entries per page. Valid values: **1** to **100**. Default value: **20**.
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
         * The prefix list ID.
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
         * The filter conditions for route CIDR blocks.
         */
        public Builder routeFilter(java.util.List < RouteFilter> routeFilter) {
            this.putQueryParameter("RouteFilter", routeFilter);
            this.routeFilter = routeFilter;
            return this;
        }

        /**
         * The destination CIDR block of the route. **This parameter is to be deprecated. We recommend that you use the RouteFilter parameter**.
         */
        public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.putQueryParameter("TransitRouterRouteEntryDestinationCidrBlock", transitRouterRouteEntryDestinationCidrBlock);
            this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
            return this;
        }

        /**
         * The route ID.
         * <p>
         * 
         * >  You can use this parameter to query only static routes in the specified route table. This parameter is incompatible with query conditions other than TransitRouterRouteEntryNames.
         */
        public Builder transitRouterRouteEntryIds(java.util.List < String > transitRouterRouteEntryIds) {
            this.putQueryParameter("TransitRouterRouteEntryIds", transitRouterRouteEntryIds);
            this.transitRouterRouteEntryIds = transitRouterRouteEntryIds;
            return this;
        }

        /**
         * The name of the route.
         * <p>
         * 
         * The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.
         * 
         * >  You can use this parameter to query only static routes in the specified route table. This parameter conflicts with other query conditions except for TransitRouterRouteEntryIds.
         */
        public Builder transitRouterRouteEntryNames(java.util.List < String > transitRouterRouteEntryNames) {
            this.putQueryParameter("TransitRouterRouteEntryNames", transitRouterRouteEntryNames);
            this.transitRouterRouteEntryNames = transitRouterRouteEntryNames;
            return this;
        }

        /**
         * The ID of the network instance connection that you want to specify as the next hop.
         */
        public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopId", transitRouterRouteEntryNextHopId);
            this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
            return this;
        }

        /**
         * The next hop ID.
         */
        public Builder transitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopResourceId", transitRouterRouteEntryNextHopResourceId);
            this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
            return this;
        }

        /**
         * The next hop type. Valid values:
         * <p>
         * 
         * *   **VPC**
         * *   **VBR**
         * *   **TR**
         * *   **VPN**
         */
        public Builder transitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopResourceType", transitRouterRouteEntryNextHopResourceType);
            this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
            return this;
        }

        /**
         * The next hop type. Valid values:
         * <p>
         * 
         * *   **BlackHole**: routes network traffic to a black hole.
         * *   **Attachment**: routes network traffic to a network instance connection.
         */
        public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopType", transitRouterRouteEntryNextHopType);
            this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
            return this;
        }

        /**
         * The source instance ID.
         */
        public Builder transitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
            this.putQueryParameter("TransitRouterRouteEntryOriginResourceId", transitRouterRouteEntryOriginResourceId);
            this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
            return this;
        }

        /**
         * The source instance type. Valid values:
         * <p>
         * 
         * *   **VPC**
         * *   **VBR**
         * *   **TR**
         * *   **VPN**
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
         * *   **All**
         * *   **Active** (default)
         * *   **Rejected**
         * *   **Prohibited**
         * *   **Standby**
         * *   **Candidate**
         * 
         * If you do not specify a value, routes in the active state are queried.
         */
        public Builder transitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
            this.putQueryParameter("TransitRouterRouteEntryStatus", transitRouterRouteEntryStatus);
            this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
            return this;
        }

        /**
         * The route type. Valid values:
         * <p>
         * 
         * *   **Propagated**: automatically learned by the route table.
         * *   **Static**: static routes.
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The match pattern for filtering CIDR blocks. Valid values:
             * <p>
             * 
             * *   **PrefixExactMatchCidrs**: exact matching.
             * *   **LongestPrefixMatchCidrs**: longest prefix matching. The specified IP address and CIDR block are considered a match.
             * *   **SubnetOfMatchCidrs**: subnet matching. The specified CIDR block is considered a match.
             * *   **SupernetOfMatchCidrs**: supernet matching. The specified CIDR block is considered a match.
             * 
             * By default, the logical operator among filter conditions is **AND**. Information about a route entry is returned only if the route entry matches all filter conditions. Filter conditions must be unique.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The filter value.
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
