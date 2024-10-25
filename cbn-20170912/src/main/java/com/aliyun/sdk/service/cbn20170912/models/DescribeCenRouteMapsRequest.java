// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCenRouteMapsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenRouteMapsRequest</p>
 */
public class DescribeCenRouteMapsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenRegionId")
    private String cenRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteMapId")
    private String routeMapId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransmitDirection")
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
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-wx12mmlt17ld82****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The region ID of the routing policy.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The routing policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cenrmap-y40mxdvf7joc12****</p>
         */
        public Builder routeMapId(String routeMapId) {
            this.putQueryParameter("RouteMapId", routeMapId);
            this.routeMapId = routeMapId;
            return this;
        }

        /**
         * <p>The route table ID of the transit router with which the routing policy is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-gw8nx3515m1mbd1z1****</p>
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * <p>The direction in which the routing policy is applied. Valid values:</p>
         * <ul>
         * <li><strong>RegionIn</strong>: Routes are advertised to the gateways in the regions that are connected by the CEN instance.</li>
         * </ul>
         * <p>For example, routes are advertised from network instances deployed in the current region or other regions to the gateway deployed in the current region.</p>
         * <ul>
         * <li><strong>RegionOut</strong>: Routes are advertised from the gateways in the regions that are connected by the CEN instance.</li>
         * </ul>
         * <p>For example, routes are advertised from the gateway deployed in the current region to network instances deployed in the current region, or to gateways deployed in other regions.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionOut</p>
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
