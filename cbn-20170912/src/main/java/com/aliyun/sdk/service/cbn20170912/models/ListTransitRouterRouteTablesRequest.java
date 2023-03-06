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
    @NameInMap("RouteTableOptions")
    private RouteTableOptions routeTableOptions;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

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
        this.routeTableOptions = builder.routeTableOptions;
        this.tag = builder.tag;
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
     * @return routeTableOptions
     */
    public RouteTableOptions getRouteTableOptions() {
        return this.routeTableOptions;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
        private RouteTableOptions routeTableOptions; 
        private java.util.List < Tag> tag; 
        private String transitRouterId; 
        private java.util.List < String > transitRouterRouteTableIds; 
        private java.util.List < String > transitRouterRouteTableNames; 
        private String transitRouterRouteTableStatus; 
        private String transitRouterRouteTableType; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterRouteTablesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeTableOptions = request.routeTableOptions;
            this.tag = request.tag;
            this.transitRouterId = request.transitRouterId;
            this.transitRouterRouteTableIds = request.transitRouterRouteTableIds;
            this.transitRouterRouteTableNames = request.transitRouterRouteTableNames;
            this.transitRouterRouteTableStatus = request.transitRouterRouteTableStatus;
            this.transitRouterRouteTableType = request.transitRouterRouteTableType;
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
         * The token that determines the start point of the next query. Valid values:
         * <p>
         * 
         * *   If this is your first query or no subsequent query is to be sent, ignore this parameter.
         * *   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
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
         * The features of the route table.
         */
        public Builder routeTableOptions(RouteTableOptions routeTableOptions) {
            this.putQueryParameter("RouteTableOptions", routeTableOptions);
            this.routeTableOptions = routeTableOptions;
            return this;
        }

        /**
         * The information about the tags.
         * <p>
         * 
         * You can specify at most 20 tags in each call.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the Enterprise Edition transit router.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * The ID of the route table.
         * <p>
         * 
         * You can query multiple route tables in each call. Maximum value of **N**: **20**.
         */
        public Builder transitRouterRouteTableIds(java.util.List < String > transitRouterRouteTableIds) {
            this.putQueryParameter("TransitRouterRouteTableIds", transitRouterRouteTableIds);
            this.transitRouterRouteTableIds = transitRouterRouteTableIds;
            return this;
        }

        /**
         * The name of the route table.
         * <p>
         * 
         * You can query multiple route tables in each call. Maximum value of **N**: **20**.
         * 
         * > If you set both **TransitRouterRouteTableNames.N** and **TransitRouterRouteTableIds.N**, make sure that the specified name and ID belong to the same route table.
         */
        public Builder transitRouterRouteTableNames(java.util.List < String > transitRouterRouteTableNames) {
            this.putQueryParameter("TransitRouterRouteTableNames", transitRouterRouteTableNames);
            this.transitRouterRouteTableNames = transitRouterRouteTableNames;
            return this;
        }

        /**
         * The status of the route table. Valid values:
         * <p>
         * 
         * *   **Creating**: being created
         * *   **Deleting**: being deleted
         * *   **Active**: available
         */
        public Builder transitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
            this.putQueryParameter("TransitRouterRouteTableStatus", transitRouterRouteTableStatus);
            this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
            return this;
        }

        /**
         * The type of the route table. Valid values:
         * <p>
         * 
         * *   **Custom**: a custom route table
         * *   **System**: the default system route table
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

    public static class RouteTableOptions extends TeaModel {
        @NameInMap("MultiRegionECMP")
        private String multiRegionECMP;

        private RouteTableOptions(Builder builder) {
            this.multiRegionECMP = builder.multiRegionECMP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTableOptions create() {
            return builder().build();
        }

        /**
         * @return multiRegionECMP
         */
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

        public static final class Builder {
            private String multiRegionECMP; 

            /**
             * Specifies whether to enable equal-cost multi-path (ECMP) routing. Valid values:
             * <p>
             * 
             * *   **disable**: no If you disable ECMP routing, routes that are learned from different regions but have the same prefix and attributes select the transit route with the smallest region ID as the next hop. Region IDs are sorted in alphabetic order. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.
             * *   **enable**: yes If you enable ECMP routing, routes that are learned from different regions but have the same prefix and attributes form an ECMP route. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.
             */
            public Builder multiRegionECMP(String multiRegionECMP) {
                this.multiRegionECMP = multiRegionECMP;
                return this;
            }

            public RouteTableOptions build() {
                return new RouteTableOptions(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             * <p>
             * 
             * The tag key cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             * 
             * You can specify at most 20 tag keys.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
             * 
             * Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
