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
 * {@link WithdrawVpcPublishedRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>WithdrawVpcPublishedRouteEntriesRequest</p>
 */
public class WithdrawVpcPublishedRouteEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntries")
    private java.util.List<RouteEntries> routeEntries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private WithdrawVpcPublishedRouteEntriesRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntries = builder.routeEntries;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WithdrawVpcPublishedRouteEntriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return routeEntries
     */
    public java.util.List<RouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<WithdrawVpcPublishedRouteEntriesRequest, Builder> {
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<RouteEntries> routeEntries; 
        private String targetInstanceId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(WithdrawVpcPublishedRouteEntriesRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntries = request.routeEntries;
            this.targetInstanceId = request.targetInstanceId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * <p>The ID of the region. Call the DescribeRegions operation to access it.</p>
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
         * <p>The route entries to be withdrawn. Maximum value: 50.</p>
         */
        public Builder routeEntries(java.util.List<RouteEntries> routeEntries) {
            this.putQueryParameter("RouteEntries", routeEntries);
            this.routeEntries = routeEntries;
            return this;
        }

        /**
         * <p>Target instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-dhw2xsds5****</p>
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * <p>The type of target instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECR</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public WithdrawVpcPublishedRouteEntriesRequest build() {
            return new WithdrawVpcPublishedRouteEntriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link WithdrawVpcPublishedRouteEntriesRequest} extends {@link TeaModel}
     *
     * <p>WithdrawVpcPublishedRouteEntriesRequest</p>
     */
    public static class RouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        @com.aliyun.core.annotation.Validation(required = true)
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String routeTableId;

        private RouteEntries(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntries create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(RouteEntries model) {
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * <p>The destination CIDR block</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp145q7glnuzd****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public RouteEntries build() {
                return new RouteEntries(this);
            } 

        } 

    }
}
