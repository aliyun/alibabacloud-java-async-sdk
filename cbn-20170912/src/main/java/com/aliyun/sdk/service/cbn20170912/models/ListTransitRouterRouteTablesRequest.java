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
 * {@link ListTransitRouterRouteTablesRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterRouteTablesRequest</p>
 */
public class ListTransitRouterRouteTablesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableOptions")
    private RouteTableOptions routeTableOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableIds")
    private java.util.List<String> transitRouterRouteTableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableNames")
    private java.util.List<String> transitRouterRouteTableNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableStatus")
    private String transitRouterRouteTableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableType")
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
    public java.util.List<Tag> getTag() {
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
    public java.util.List<String> getTransitRouterRouteTableIds() {
        return this.transitRouterRouteTableIds;
    }

    /**
     * @return transitRouterRouteTableNames
     */
    public java.util.List<String> getTransitRouterRouteTableNames() {
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
        private java.util.List<Tag> tag; 
        private String transitRouterId; 
        private java.util.List<String> transitRouterRouteTableIds; 
        private java.util.List<String> transitRouterRouteTableNames; 
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
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
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
         * <li>If a subsequent query is to be sent, set the value to the value of <strong>NextToken</strong> that is returned from the last call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dd20****</p>
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
         * <p>The features of the route table.</p>
         */
        public Builder routeTableOptions(RouteTableOptions routeTableOptions) {
            this.putQueryParameter("RouteTableOptions", routeTableOptions);
            this.routeTableOptions = routeTableOptions;
            return this;
        }

        /**
         * <p>The information about the tags.</p>
         * <p>You can specify at most 20 tags in each call.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the Enterprise Edition transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-uf654ttymmljlvh2x****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>The ID of the route table.</p>
         * <p>You can query multiple route tables in each call. Maximum value of <strong>N</strong>: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1l8awdb4iuo9uwu****</p>
         */
        public Builder transitRouterRouteTableIds(java.util.List<String> transitRouterRouteTableIds) {
            this.putQueryParameter("TransitRouterRouteTableIds", transitRouterRouteTableIds);
            this.transitRouterRouteTableIds = transitRouterRouteTableIds;
            return this;
        }

        /**
         * <p>The name of the route table.</p>
         * <p>You can query multiple route tables in each call. Maximum value of <strong>N</strong>: <strong>20</strong>.</p>
         * <blockquote>
         * <p>If you set both <strong>TransitRouterRouteTableNames.N</strong> and <strong>TransitRouterRouteTableIds.N</strong>, make sure that the specified name and ID belong to the same route table.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder transitRouterRouteTableNames(java.util.List<String> transitRouterRouteTableNames) {
            this.putQueryParameter("TransitRouterRouteTableNames", transitRouterRouteTableNames);
            this.transitRouterRouteTableNames = transitRouterRouteTableNames;
            return this;
        }

        /**
         * <p>The status of the route table. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The route table is being created.</li>
         * <li><strong>Deleting</strong>: The route table is being deleted.</li>
         * <li><strong>Active</strong>: The route table is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder transitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
            this.putQueryParameter("TransitRouterRouteTableStatus", transitRouterRouteTableStatus);
            this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
            return this;
        }

        /**
         * <p>The type of the route table. Valid values:</p>
         * <ul>
         * <li><strong>Custom</strong>: a custom route table</li>
         * <li><strong>System</strong>: the default route table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
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

    /**
     * 
     * {@link ListTransitRouterRouteTablesRequest} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteTablesRequest</p>
     */
    public static class RouteTableOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MultiRegionECMP")
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
             * <p>Specifies whether to enable equal-cost multi-path (ECMP) routing. Valid values:</p>
             * <ul>
             * <li><strong>disable</strong>: disables ECMP routing If you disable ECMP routing, routes that are learned from different regions but have the same prefix and attributes select the transit router with the smallest region ID as the next hop. Region IDs are sorted in alphabetic order. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.</li>
             * <li><strong>enable</strong>: enables ECMP routing. If you enable ECMP routing, routes that are learned from different regions but have the same prefix and attributes form an ECMP route. The network latency and bandwidth consumption also vary based on the region. Proceed with caution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disable</p>
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
    /**
     * 
     * {@link ListTransitRouterRouteTablesRequest} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteTablesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify at most 20 tag keys.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>The tag value can be 0 to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
