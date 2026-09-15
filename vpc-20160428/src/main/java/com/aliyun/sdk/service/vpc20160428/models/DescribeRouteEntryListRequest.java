// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeRouteEntryListRequest} extends {@link RequestModel}
 *
 * <p>DescribeRouteEntryListRequest</p>
 */
public class DescribeRouteEntryListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCidrBlockList")
    private java.util.List<String> destCidrBlockList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResult")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopId")
    private String nextHopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopType")
    private String nextHopType;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryId")
    private String routeEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryName")
    private String routeEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryType")
    private String routeEntryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    private DescribeRouteEntryListRequest(Builder builder) {
        super(builder);
        this.destCidrBlockList = builder.destCidrBlockList;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.ipVersion = builder.ipVersion;
        this.maxResult = builder.maxResult;
        this.nextHopId = builder.nextHopId;
        this.nextHopType = builder.nextHopType;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntryId = builder.routeEntryId;
        this.routeEntryName = builder.routeEntryName;
        this.routeEntryType = builder.routeEntryType;
        this.routeTableId = builder.routeTableId;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteEntryListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destCidrBlockList
     */
    public java.util.List<String> getDestCidrBlockList() {
        return this.destCidrBlockList;
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return maxResult
     */
    public Integer getMaxResult() {
        return this.maxResult;
    }

    /**
     * @return nextHopId
     */
    public String getNextHopId() {
        return this.nextHopId;
    }

    /**
     * @return nextHopType
     */
    public String getNextHopType() {
        return this.nextHopType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    /**
     * @return routeEntryName
     */
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    /**
     * @return routeEntryType
     */
    public String getRouteEntryType() {
        return this.routeEntryType;
    }

    /**
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<DescribeRouteEntryListRequest, Builder> {
        private java.util.List<String> destCidrBlockList; 
        private String destinationCidrBlock; 
        private String ipVersion; 
        private Integer maxResult; 
        private String nextHopId; 
        private String nextHopType; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeEntryId; 
        private String routeEntryName; 
        private String routeEntryType; 
        private String routeTableId; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRouteEntryListRequest request) {
            super(request);
            this.destCidrBlockList = request.destCidrBlockList;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.ipVersion = request.ipVersion;
            this.maxResult = request.maxResult;
            this.nextHopId = request.nextHopId;
            this.nextHopType = request.nextHopType;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntryId = request.routeEntryId;
            this.routeEntryName = request.routeEntryName;
            this.routeEntryType = request.routeEntryType;
            this.routeTableId = request.routeTableId;
            this.serviceType = request.serviceType;
        } 

        /**
         * <p>The list of destination CIDR blocks of routes.</p>
         */
        public Builder destCidrBlockList(java.util.List<String> destCidrBlockList) {
            this.putQueryParameter("DestCidrBlockList", destCidrBlockList);
            this.destCidrBlockList = destCidrBlockList;
            return this;
        }

        /**
         * <p>The destination CIDR block of the route. Both IPv4 and IPv6 CIDR blocks are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.0/24</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>The version of the IP protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>ipv4</strong>: IPv4.</p>
         * </li>
         * <li><p><strong>ipv6</strong>: IPv6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * <p>The instance ID of the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp10zyaph5cc8b7c7****</p>
         */
        public Builder nextHopId(String nextHopId) {
            this.putQueryParameter("NextHopId", nextHopId);
            this.nextHopId = nextHopId;
            return this;
        }

        /**
         * <p>The next hop type. Valid values:</p>
         * <ul>
         * <li><p><strong>Instance</strong> (default): ECS instance.</p>
         * </li>
         * <li><p><strong>HaVip</strong>: high-availability virtual IP address.</p>
         * </li>
         * <li><p><strong>VpnGateway</strong>: VPN gateway.</p>
         * </li>
         * <li><p><strong>NatGateway</strong>: NAT gateway.</p>
         * </li>
         * <li><p><strong>NetworkInterface</strong>: secondary elastic network interface controller (NIC).</p>
         * </li>
         * <li><p><strong>RouterInterface</strong>: vRouter interface.</p>
         * </li>
         * <li><p><strong>IPv6Gateway</strong>: IPv6 gateway.</p>
         * </li>
         * <li><p><strong>Attachment</strong>: transit router.</p>
         * </li>
         * <li><p><strong>Ipv4Gateway</strong>: IPv4 gateway.</p>
         * </li>
         * <li><p><strong>GatewayEndpoint</strong>: gateway endpoint.</p>
         * </li>
         * <li><p><strong>Ecr</strong>: Express Connect Router (ECR).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder nextHopType(String nextHopType) {
            this.putQueryParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request or if no subsequent request exists.</li>
         * <li>If a subsequent request exists, set the value to the NextToken value that is returned from the last call.</li>
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
         * <p>The region ID of the route table to which the route belongs.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>The ID of the route that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-bp1mnnr2al0naomnp****</p>
         */
        public Builder routeEntryId(String routeEntryId) {
            this.putQueryParameter("RouteEntryId", routeEntryId);
            this.routeEntryId = routeEntryId;
            return this;
        }

        /**
         * <p>The name of the route.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        /**
         * <p>The type of the route. Valid values:</p>
         * <ul>
         * <li><strong>Custom</strong>: custom route.</li>
         * <li><strong>System</strong>: system route.</li>
         * <li><strong>BGP</strong>: BGP route.</li>
         * <li><strong>CEN</strong>: Cloud Enterprise Network (CEN) route.</li>
         * <li><strong>ECR</strong>: Express Connect Router (ECR) route.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder routeEntryType(String routeEntryType) {
            this.putQueryParameter("RouteEntryType", routeEntryType);
            this.routeEntryType = routeEntryType;
            return this;
        }

        /**
         * <p>The ID of the route table that you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1r9pvl4xen8s9ju****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * <p>The type of route hosting. If this field is empty, the route is not hosted.</p>
         * <p>Valid values: <strong>TR</strong>, which indicates that the hosting type is transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>TR</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public DescribeRouteEntryListRequest build() {
            return new DescribeRouteEntryListRequest(this);
        } 

    } 

}
