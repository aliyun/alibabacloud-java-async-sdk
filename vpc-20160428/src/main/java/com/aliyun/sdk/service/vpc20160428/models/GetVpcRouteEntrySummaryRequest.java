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
 * {@link GetVpcRouteEntrySummaryRequest} extends {@link RequestModel}
 *
 * <p>GetVpcRouteEntrySummaryRequest</p>
 */
public class GetVpcRouteEntrySummaryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RouteEntryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeEntryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private GetVpcRouteEntrySummaryRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntryType = builder.routeEntryType;
        this.routeTableId = builder.routeTableId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcRouteEntrySummaryRequest create() {
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<GetVpcRouteEntrySummaryRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeEntryType; 
        private String routeTableId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(GetVpcRouteEntrySummaryRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntryType = request.routeEntryType;
            this.routeTableId = request.routeTableId;
            this.vpcId = request.vpcId;
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
         * <p>The region ID of the route table.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The type of the route. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: all route types</li>
         * <li><strong>Custom</strong>: a custom route</li>
         * <li><strong>System</strong>: a system route</li>
         * <li><strong>BGP</strong>: a BGP route</li>
         * <li><strong>CEN</strong>: a Cloud Enterprise Network (CEN) route</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder routeEntryType(String routeEntryType) {
            this.putQueryParameter("RouteEntryType", routeEntryType);
            this.routeEntryType = routeEntryType;
            return this;
        }

        /**
         * <p>The ID of the route table that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzdvzu2****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the route table belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public GetVpcRouteEntrySummaryRequest build() {
            return new GetVpcRouteEntrySummaryRequest(this);
        } 

    } 

}
