// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouteTablesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRouteTablesRequest</p>
 */
public class DescribeRouteTablesRequest extends Request {
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
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteTableId")
    private String routeTableId;

    @Query
    @NameInMap("RouteTableName")
    private String routeTableName;

    @Query
    @NameInMap("RouterId")
    private String routerId;

    @Query
    @NameInMap("RouterType")
    private String routerType;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("VRouterId")
    private String vRouterId;

    private DescribeRouteTablesRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeTableId = builder.routeTableId;
        this.routeTableName = builder.routeTableName;
        this.routerId = builder.routerId;
        this.routerType = builder.routerType;
        this.type = builder.type;
        this.vRouterId = builder.vRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * @return routeTableName
     */
    public String getRouteTableName() {
        return this.routeTableName;
    }

    /**
     * @return routerId
     */
    public String getRouterId() {
        return this.routerId;
    }

    /**
     * @return routerType
     */
    public String getRouterType() {
        return this.routerType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vRouterId
     */
    public String getVRouterId() {
        return this.vRouterId;
    }

    public static final class Builder extends Request.Builder<DescribeRouteTablesRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeTableId; 
        private String routeTableName; 
        private String routerId; 
        private String routerType; 
        private String type; 
        private String vRouterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRouteTablesRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeTableId = request.routeTableId;
            this.routeTableName = request.routeTableName;
            this.routerId = request.routerId;
            this.routerType = request.routerType;
            this.type = request.type;
            this.vRouterId = request.vRouterId;
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
         * The number of the page to return. Default value: **1**
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the virtual private cloud (VPC) to which the route table belongs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the route table belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The ID of the route table that you want to query.
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * The name of the route table that you want to query.
         */
        public Builder routeTableName(String routeTableName) {
            this.putQueryParameter("RouteTableName", routeTableName);
            this.routeTableName = routeTableName;
            return this;
        }

        /**
         * The ID of the vRouter or VBR to which the route table belongs.
         */
        public Builder routerId(String routerId) {
            this.putQueryParameter("RouterId", routerId);
            this.routerId = routerId;
            return this;
        }

        /**
         * The type of the router to which the route table belongs. Valid values:
         * <p>
         * 
         * *   **VRouter**: a vRouter
         * *   **VBR**: a virtual border router (VBR)
         */
        public Builder routerType(String routerType) {
            this.putQueryParameter("RouterType", routerType);
            this.routerType = routerType;
            return this;
        }

        /**
         * The type of route table that you want to query. Valid values:
         * <p>
         * 
         * *   **System** : a system route table
         * *   **Custom**: a custom route table
         * *   **BGP**: a Border Gateway Protocol (BGP) route table
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The ID of the vRouter to which the route table belongs.
         * <p>
         * 
         * After you set this parameter, **RouterType** is automatically set to **VRouter**.
         */
        public Builder vRouterId(String vRouterId) {
            this.putQueryParameter("VRouterId", vRouterId);
            this.vRouterId = vRouterId;
            return this;
        }

        @Override
        public DescribeRouteTablesRequest build() {
            return new DescribeRouteTablesRequest(this);
        } 

    } 

}
