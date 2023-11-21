// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteEntryListRequest} extends {@link RequestModel}
 *
 * <p>DescribeRouteEntryListRequest</p>
 */
public class DescribeRouteEntryListRequest extends Request {
    @Query
    @NameInMap("DestCidrBlockList")
    private java.util.List < String > destCidrBlockList;

    @Query
    @NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("MaxResult")
    @Validation(maximum = 500)
    private Integer maxResult;

    @Query
    @NameInMap("NextHopId")
    private String nextHopId;

    @Query
    @NameInMap("NextHopType")
    private String nextHopType;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteEntryId")
    private String routeEntryId;

    @Query
    @NameInMap("RouteEntryName")
    private String routeEntryName;

    @Query
    @NameInMap("RouteEntryType")
    private String routeEntryType;

    @Query
    @NameInMap("RouteTableId")
    @Validation(required = true)
    private String routeTableId;

    @Query
    @NameInMap("ServiceType")
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
    public java.util.List < String > getDestCidrBlockList() {
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
        private java.util.List < String > destCidrBlockList; 
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
         * The destination CIDR blocks of the routes.
         */
        public Builder destCidrBlockList(java.util.List < String > destCidrBlockList) {
            this.putQueryParameter("DestCidrBlockList", destCidrBlockList);
            this.destCidrBlockList = destCidrBlockList;
            return this;
        }

        /**
         * The destination CIDR block of the route. IPv4 and IPv6 CIDR blocks are supported.
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * The IP version. Valid values:
         * <p>
         * 
         * *   **IPv4**
         * *   **IPv6**
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1** to **100**. Default value: **10**.
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * The ID of the next hop.
         */
        public Builder nextHopId(String nextHopId) {
            this.putQueryParameter("NextHopId", nextHopId);
            this.nextHopId = nextHopId;
            return this;
        }

        /**
         * The type of the next hop. Valid values:
         * <p>
         * 
         * *   **Instance** (default): an Elastic Compute Service (ECS) instance
         * *   **HaVip**: a high-availability virtual IP address (HAVIP).
         * *   **VpnGateway**: a VPN gateway
         * *   **NatGateway**: a NAT gateway
         * *   **NetworkInterface**: a secondary elastic network interface (ENI)
         * *   **RouterInterface**: a router interface
         * *   **IPv6Gateway**: an IPv6 gateway
         * *   **Attachment**: a transit router
         */
        public Builder nextHopType(String nextHopType) {
            this.putQueryParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of NextToken.
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
         * The region ID of the route table.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * The ID of the route that you want to query.
         */
        public Builder routeEntryId(String routeEntryId) {
            this.putQueryParameter("RouteEntryId", routeEntryId);
            this.routeEntryId = routeEntryId;
            return this;
        }

        /**
         * The name of the route entry.
         * <p>
         * 
         * The name must be 1 to 128 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        /**
         * The route type. Valid values:
         * <p>
         * 
         * *   **Custom**
         * *   **System**
         * *   **BGP**
         * *   **CEN**
         */
        public Builder routeEntryType(String routeEntryType) {
            this.putQueryParameter("RouteEntryType", routeEntryType);
            this.routeEntryType = routeEntryType;
            return this;
        }

        /**
         * The ID of the route table that you want to query.
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * Specifies whether to host the route. If the parameter is empty, the route is not hosted.
         * <p>
         * 
         * Set the value to **TR**, which specifies that the route is hosted by a transit router.
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
