// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCenChildInstanceRouteEntriesToAttachmentRequest} extends {@link RequestModel}
 *
 * <p>ListCenChildInstanceRouteEntriesToAttachmentRequest</p>
 */
public class ListCenChildInstanceRouteEntriesToAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceRouteTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
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
    @com.aliyun.core.annotation.NameInMap("RouteFilter")
    private java.util.List < RouteFilter> routeFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterAttachmentId;

    private ListCenChildInstanceRouteEntriesToAttachmentRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.childInstanceRouteTableId = builder.childInstanceRouteTableId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeFilter = builder.routeFilter;
        this.serviceType = builder.serviceType;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCenChildInstanceRouteEntriesToAttachmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return childInstanceRouteTableId
     */
    public String getChildInstanceRouteTableId() {
        return this.childInstanceRouteTableId;
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
     * @return routeFilter
     */
    public java.util.List < RouteFilter> getRouteFilter() {
        return this.routeFilter;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public static final class Builder extends Request.Builder<ListCenChildInstanceRouteEntriesToAttachmentRequest, Builder> {
        private String cenId; 
        private String childInstanceRouteTableId; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < RouteFilter> routeFilter; 
        private String serviceType; 
        private String transitRouterAttachmentId; 

        private Builder() {
            super();
        } 

        private Builder(ListCenChildInstanceRouteEntriesToAttachmentRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.childInstanceRouteTableId = request.childInstanceRouteTableId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeFilter = request.routeFilter;
            this.serviceType = request.serviceType;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
        } 

        /**
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-dc4vwznpwbobrl****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The ID of the route table configured on the network instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp174d1gje79u1g4t****</p>
         */
        public Builder childInstanceRouteTableId(String childInstanceRouteTableId) {
            this.putQueryParameter("ChildInstanceRouteTableId", childInstanceRouteTableId);
            this.childInstanceRouteTableId = childInstanceRouteTableId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
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
         * <li>If this is your first query and no subsequent queries are to be sent, ignore this parameter.</li>
         * <li>If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
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
         * <p>The filter condition for the destination CIDR block.</p>
         */
        public Builder routeFilter(java.util.List < RouteFilter> routeFilter) {
            this.putQueryParameter("RouteFilter", routeFilter);
            this.routeFilter = routeFilter;
            return this;
        }

        /**
         * <p>Specifies whether to host the route. If you leave the parameter empty, the route is not hosted. A value of TR specifies that the route is hosted on a transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>TR</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The ID of the network instance connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-r6g0m3epjehw57****</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        @Override
        public ListCenChildInstanceRouteEntriesToAttachmentRequest build() {
            return new ListCenChildInstanceRouteEntriesToAttachmentRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCenChildInstanceRouteEntriesToAttachmentRequest} extends {@link TeaModel}
     *
     * <p>ListCenChildInstanceRouteEntriesToAttachmentRequest</p>
     */
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
             * <p>The match mode of the route.</p>
             * <ul>
             * <li><strong>prefix-exact-match</strong>: exact match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>prefix-exact-match</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The destination CIDR blocks.</p>
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
