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
    private java.util.List<RouteFilter> routeFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    @Deprecated
    private String transitRouterRouteEntryDestinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryIds")
    private java.util.List<String> transitRouterRouteEntryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNames")
    private java.util.List<String> transitRouterRouteEntryNames;

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
    public java.util.List<RouteFilter> getRouteFilter() {
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
    public java.util.List<String> getTransitRouterRouteEntryIds() {
        return this.transitRouterRouteEntryIds;
    }

    /**
     * @return transitRouterRouteEntryNames
     */
    public java.util.List<String> getTransitRouterRouteEntryNames() {
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
        private java.util.List<RouteFilter> routeFilter; 
        private String transitRouterRouteEntryDestinationCidrBlock; 
        private java.util.List<String> transitRouterRouteEntryIds; 
        private java.util.List<String> transitRouterRouteEntryNames; 
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
         * <p>The number of entries to return per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
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
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If this is your first query or no next query is to be sent, ignore this parameter.</li>
         * <li>If a next query is to be sent, set the value to the <strong>NextToken</strong> value returned from the last API call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fce19****</p>
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
         * <p>The ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-6ehtn5kqxgeyy08fi****</p>
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
         * <p>The filter conditions for the CIDR blocks of the route entry in the routing table.</p>
         */
        public Builder routeFilter(java.util.List<RouteFilter> routeFilter) {
            this.putQueryParameter("RouteFilter", routeFilter);
            this.routeFilter = routeFilter;
            return this;
        }

        /**
         * <p>The destination CIDR block of the route entry (<strong>This parameter is deprecated. Use the RouteFilter parameter instead</strong>).</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.putQueryParameter("TransitRouterRouteEntryDestinationCidrBlock", transitRouterRouteEntryDestinationCidrBlock);
            this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
            return this;
        }

        /**
         * <p>The IDs of the route entry in the routing table.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-oklkgwmj97z6dn****</p>
         */
        public Builder transitRouterRouteEntryIds(java.util.List<String> transitRouterRouteEntryIds) {
            this.putQueryParameter("TransitRouterRouteEntryIds", transitRouterRouteEntryIds);
            this.transitRouterRouteEntryIds = transitRouterRouteEntryIds;
            return this;
        }

        /**
         * <p>The names of the route entry in the routing table.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder transitRouterRouteEntryNames(java.util.List<String> transitRouterRouteEntryNames) {
            this.putQueryParameter("TransitRouterRouteEntryNames", transitRouterRouteEntryNames);
            this.transitRouterRouteEntryNames = transitRouterRouteEntryNames;
            return this;
        }

        /**
         * <p>The ID of the network instance connection associated with the next hop of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-nls9fzkfat8934****</p>
         */
        public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopId", transitRouterRouteEntryNextHopId);
            this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
            return this;
        }

        /**
         * <p>The next hop instance ID of the route entry in the routing table.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5ent6du8deaq5*****</p>
         */
        public Builder transitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopResourceId", transitRouterRouteEntryNextHopResourceId);
            this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
            return this;
        }

        /**
         * <p>The next hop instance type of the route entry. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: VPC.</li>
         * <li><strong>VBR</strong>: VBR.</li>
         * <li><strong>TR</strong>: transit router.</li>
         * <li><strong>VPN</strong>: IPsec connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder transitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopResourceType", transitRouterRouteEntryNextHopResourceType);
            this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
            return this;
        }

        /**
         * <p>The next hop type. Valid values:</p>
         * <ul>
         * <li><strong>BlackHole</strong>: specifies that the route entry is a blackhole route.</li>
         * <li><strong>Attachment</strong>: specifies that the next hop of the route entry is a network instance connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Attachment</p>
         */
        public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopType", transitRouterRouteEntryNextHopType);
            this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
            return this;
        }

        /**
         * <p>The origin instance ID of the route entry in the routing table.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5ent6du8deaq5*****</p>
         */
        public Builder transitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
            this.putQueryParameter("TransitRouterRouteEntryOriginResourceId", transitRouterRouteEntryOriginResourceId);
            this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
            return this;
        }

        /**
         * <p>The origin instance type of the route entry. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: VPC.</li>
         * <li><strong>VBR</strong>: VBR.</li>
         * <li><strong>TR</strong>: transit router.</li>
         * <li><strong>VPN</strong>: IPsec connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder transitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
            this.putQueryParameter("TransitRouterRouteEntryOriginResourceType", transitRouterRouteEntryOriginResourceType);
            this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
            return this;
        }

        /**
         * <p>The status of the route entry. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: queries route entries in all states.</li>
         * <li><strong>Active</strong> (default): queries only active route entries.</li>
         * <li><strong>Rejected</strong>: queries only route entries that are rejected due to route conflicts.</li>
         * <li><strong>Prohibited</strong>: queries only route entries that are prohibited by route maps.</li>
         * <li><strong>Standby</strong>: queries only standby route entries.</li>
         * <li><strong>Candidate</strong>: queries only candidate route entries.</li>
         * </ul>
         * <p>If you do not specify this parameter, the system queries only active route entries by default.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder transitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
            this.putQueryParameter("TransitRouterRouteEntryStatus", transitRouterRouteEntryStatus);
            this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
            return this;
        }

        /**
         * <p>The destination type of the route entry. Valid values:</p>
         * <ul>
         * <li><strong>Propagated</strong>: generated by automatic learning of the current routing table.</li>
         * <li><strong>Static</strong>: statically configured in the current routing table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Propagated</p>
         */
        public Builder transitRouterRouteEntryType(String transitRouterRouteEntryType) {
            this.putQueryParameter("TransitRouterRouteEntryType", transitRouterRouteEntryType);
            this.transitRouterRouteEntryType = transitRouterRouteEntryType;
            return this;
        }

        /**
         * <p>The ID of the route table of the Enterprise Edition transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1dudbh2d5na6b50****</p>
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

    /**
     * 
     * {@link ListTransitRouterRouteEntriesRequest} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteEntriesRequest</p>
     */
    public static class RouteFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

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
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(RouteFilter model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The filter condition. Valid values:</p>
             * <ul>
             * <li><strong>PrefixExactMatchCidrs</strong>: exact match.</li>
             * <li><strong>LongestPrefixMatchCidrs</strong>: longest prefix match. Both IP addresses and CIDR blocks are supported.</li>
             * <li><strong>SubnetOfMatchCidrs</strong>: subnet match. Matches the subnets of the specified CIDR block, including the specified CIDR block.</li>
             * <li><strong>SupernetOfMatchCidrs</strong>: supernet match. Matches the supernets of the specified CIDR block, including the specified CIDR block.</li>
             * </ul>
             * <p>Multiple filter conditions are connected by the <strong>AND</strong> logical operator by default. A route entry must meet all filter conditions to be considered a match. You cannot specify duplicate filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>PrefixExactMatchCidrs</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of filter condition values.</p>
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public RouteFilter build() {
                return new RouteFilter(this);
            } 

        } 

    }
}
