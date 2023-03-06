// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenRouteMapsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenRouteMapsRequest</p>
 */
public class DescribeCenRouteMapsRequest extends Request {
    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("CenRegionId")
    private String cenRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteMapId")
    private String routeMapId;

    @Query
    @NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;

    @Query
    @NameInMap("TransmitDirection")
    private String transmitDirection;

    private DescribeCenRouteMapsRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.cenRegionId = builder.cenRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeMapId = builder.routeMapId;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
        this.transmitDirection = builder.transmitDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenRouteMapsRequest create() {
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
     * @return cenRegionId
     */
    public String getCenRegionId() {
        return this.cenRegionId;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return routeMapId
     */
    public String getRouteMapId() {
        return this.routeMapId;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    /**
     * @return transmitDirection
     */
    public String getTransmitDirection() {
        return this.transmitDirection;
    }

    public static final class Builder extends Request.Builder<DescribeCenRouteMapsRequest, Builder> {
        private String cenId; 
        private String cenRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeMapId; 
        private String transitRouterRouteTableId; 
        private String transmitDirection; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCenRouteMapsRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.cenRegionId = request.cenRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeMapId = request.routeMapId;
            this.transitRouterRouteTableId = request.transitRouterRouteTableId;
            this.transmitDirection = request.transmitDirection;
        } 

        /**
         * The ID of the CEN instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The ID of the region where the routing policy is applied.
         * <p>
         * 
         * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
         */
        public Builder cenRegionId(String cenRegionId) {
            this.putQueryParameter("CenRegionId", cenRegionId);
            this.cenRegionId = cenRegionId;
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
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * The ID of the routing policy.
         */
        public Builder routeMapId(String routeMapId) {
            this.putQueryParameter("RouteMapId", routeMapId);
            this.routeMapId = routeMapId;
            return this;
        }

        /**
         * The route table ID of the transit router with which the routing policy is associated.
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * The direction in which the routing policy is applied. Valid values:
         * <p>
         * 
         * *   **RegionIn**: Routes are advertised to the gateways in the regions that are connected by the CEN instance.
         * 
         *     For example, routes are advertised from network instances deployed in the current region or other regions to the gateway deployed in the current region.
         * 
         * *   **RegionOut**: Routes are advertised from the gateways in the regions that are connected by the CEN instance.
         * 
         *     For example, routes are advertised from the gateway deployed in the current region to network instances deployed in the current region, or to gateways deployed in other regions.
         */
        public Builder transmitDirection(String transmitDirection) {
            this.putQueryParameter("TransmitDirection", transmitDirection);
            this.transmitDirection = transmitDirection;
            return this;
        }

        @Override
        public DescribeCenRouteMapsRequest build() {
            return new DescribeCenRouteMapsRequest(this);
        } 

    } 

}
