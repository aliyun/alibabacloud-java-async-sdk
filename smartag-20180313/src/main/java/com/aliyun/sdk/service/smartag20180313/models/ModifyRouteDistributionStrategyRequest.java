// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ModifyRouteDistributionStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyRouteDistributionStrategyRequest</p>
 */
public class ModifyRouteDistributionStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HcInstanceId")
    private String hcInstanceId;

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
    @com.aliyun.core.annotation.NameInMap("RouteDistribution")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeDistribution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private ModifyRouteDistributionStrategyRequest(Builder builder) {
        super(builder);
        this.destCidrBlock = builder.destCidrBlock;
        this.hcInstanceId = builder.hcInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeDistribution = builder.routeDistribution;
        this.routeSource = builder.routeSource;
        this.smartAGId = builder.smartAGId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRouteDistributionStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destCidrBlock
     */
    public String getDestCidrBlock() {
        return this.destCidrBlock;
    }

    /**
     * @return hcInstanceId
     */
    public String getHcInstanceId() {
        return this.hcInstanceId;
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
     * @return routeDistribution
     */
    public String getRouteDistribution() {
        return this.routeDistribution;
    }

    /**
     * @return routeSource
     */
    public String getRouteSource() {
        return this.routeSource;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ModifyRouteDistributionStrategyRequest, Builder> {
        private String destCidrBlock; 
        private String hcInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeDistribution; 
        private String routeSource; 
        private String smartAGId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRouteDistributionStrategyRequest request) {
            super(request);
            this.destCidrBlock = request.destCidrBlock;
            this.hcInstanceId = request.hcInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeDistribution = request.routeDistribution;
            this.routeSource = request.routeSource;
            this.smartAGId = request.smartAGId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The destination CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XX.0/24</p>
         */
        public Builder destCidrBlock(String destCidrBlock) {
            this.putQueryParameter("DestCidrBlock", destCidrBlock);
            this.destCidrBlock = destCidrBlock;
            return this;
        }

        /**
         * <p>The ID of the health check instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hc-sztovuprqzgm50****</p>
         */
        public Builder hcInstanceId(String hcInstanceId) {
            this.putQueryParameter("HcInstanceId", hcInstanceId);
            this.hcInstanceId = hcInstanceId;
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
         * <p>The region ID of the Smart Access Gateway (SAG) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <p>The route advertisement policy. Valid values:</p>
         * <ul>
         * <li><strong>publish</strong>: advertises routes.</li>
         * <li><strong>no_publish</strong>: does not advertise routes.</li>
         * <li><strong>no_publish_and_publish_on_health_success</strong>: routes are advertised only when they pass the health check.</li>
         * <li><strong>no_publish_and_publish_on_health_fail</strong>: routes are advertised only when they fail the health check.</li>
         * <li><strong>publish_and_revoke_on_health_success</strong>: advertised routes are withdrawn only when they pass the health check.</li>
         * <li><strong>publish_and_revoke_on_health_fail</strong>: advertised routes are withdrawn only when they fail the health check.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163971.html">Configure health checks</a> and <a href="https://help.aliyun.com/document_detail/163973.html">Advertise routes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>publish</p>
         */
        public Builder routeDistribution(String routeDistribution) {
            this.putQueryParameter("RouteDistribution", routeDistribution);
            this.routeDistribution = routeDistribution;
            return this;
        }

        /**
         * <p>The source of routes. Valid values:</p>
         * <ul>
         * <li><p><strong>Alibaba Cloud-facing routes</strong></p>
         * <ul>
         * <li><strong>The ID of the Virtual Private Cloud (VPC)</strong>: learns routes from the VPC network.</li>
         * <li><strong>The ID of the virtual border router (VBR)</strong>: learns routes from the VBR.</li>
         * <li><strong>The ID of the SAG instance</strong>: learns routes from the SAG instance.</li>
         * </ul>
         * </li>
         * <li><p><strong>Private network-facing routes</strong></p>
         * <ul>
         * <li><strong>STATIC</strong>: static routes specified in the SAG console.</li>
         * <li><strong>OSPF</strong>: learns routes through the Open Shortest Path First (OSPF) protocol.</li>
         * <li><strong>BGP</strong>: learns routes through Border Gateway Protocol (BGP).</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSPF</p>
         */
        public Builder routeSource(String routeSource) {
            this.putQueryParameter("RouteSource", routeSource);
            this.routeSource = routeSource;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-erx3qta5xg5zyq****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The type of the route source. Valid values:</p>
         * <ul>
         * <li><strong>cloud</strong>: Alibaba Cloud-facing routes.</li>
         * <li><strong>local</strong>: private network-facing routes.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ModifyRouteDistributionStrategyRequest build() {
            return new ModifyRouteDistributionStrategyRequest(this);
        } 

    } 

}
