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
 * {@link CreateRouterInterfaceRequest} extends {@link RequestModel}
 *
 * <p>CreateRouterInterfaceRequest</p>
 */
public class CreateRouterInterfaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    private String accessPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FastLinkMode")
    private Boolean fastLinkMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckSourceIp")
    private String healthCheckSourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTargetIp")
    private String healthCheckTargetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeAccessPointId")
    private String oppositeAccessPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeInterfaceId")
    private String oppositeInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeInterfaceOwnerId")
    private String oppositeInterfaceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oppositeRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeRouterId")
    private String oppositeRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeRouterType")
    private String oppositeRouterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    @com.aliyun.core.annotation.Validation(required = true)
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private CreateRouterInterfaceRequest(Builder builder) {
        super(builder);
        this.accessPointId = builder.accessPointId;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.fastLinkMode = builder.fastLinkMode;
        this.healthCheckSourceIp = builder.healthCheckSourceIp;
        this.healthCheckTargetIp = builder.healthCheckTargetIp;
        this.instanceChargeType = builder.instanceChargeType;
        this.name = builder.name;
        this.oppositeAccessPointId = builder.oppositeAccessPointId;
        this.oppositeInterfaceId = builder.oppositeInterfaceId;
        this.oppositeInterfaceOwnerId = builder.oppositeInterfaceOwnerId;
        this.oppositeRegionId = builder.oppositeRegionId;
        this.oppositeRouterId = builder.oppositeRouterId;
        this.oppositeRouterType = builder.oppositeRouterType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.pricingCycle = builder.pricingCycle;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.role = builder.role;
        this.routerId = builder.routerId;
        this.routerType = builder.routerType;
        this.spec = builder.spec;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouterInterfaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fastLinkMode
     */
    public Boolean getFastLinkMode() {
        return this.fastLinkMode;
    }

    /**
     * @return healthCheckSourceIp
     */
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    /**
     * @return healthCheckTargetIp
     */
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return oppositeAccessPointId
     */
    public String getOppositeAccessPointId() {
        return this.oppositeAccessPointId;
    }

    /**
     * @return oppositeInterfaceId
     */
    public String getOppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }

    /**
     * @return oppositeInterfaceOwnerId
     */
    public String getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }

    /**
     * @return oppositeRegionId
     */
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
    }

    /**
     * @return oppositeRouterId
     */
    public String getOppositeRouterId() {
        return this.oppositeRouterId;
    }

    /**
     * @return oppositeRouterType
     */
    public String getOppositeRouterType() {
        return this.oppositeRouterType;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
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
     * @return role
     */
    public String getRole() {
        return this.role;
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
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateRouterInterfaceRequest, Builder> {
        private String accessPointId; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String clientToken; 
        private String description; 
        private Boolean fastLinkMode; 
        private String healthCheckSourceIp; 
        private String healthCheckTargetIp; 
        private String instanceChargeType; 
        private String name; 
        private String oppositeAccessPointId; 
        private String oppositeInterfaceId; 
        private String oppositeInterfaceOwnerId; 
        private String oppositeRegionId; 
        private String oppositeRouterId; 
        private String oppositeRouterType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String pricingCycle; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String role; 
        private String routerId; 
        private String routerType; 
        private String spec; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouterInterfaceRequest request) {
            super(request);
            this.accessPointId = request.accessPointId;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.fastLinkMode = request.fastLinkMode;
            this.healthCheckSourceIp = request.healthCheckSourceIp;
            this.healthCheckTargetIp = request.healthCheckTargetIp;
            this.instanceChargeType = request.instanceChargeType;
            this.name = request.name;
            this.oppositeAccessPointId = request.oppositeAccessPointId;
            this.oppositeInterfaceId = request.oppositeInterfaceId;
            this.oppositeInterfaceOwnerId = request.oppositeInterfaceOwnerId;
            this.oppositeRegionId = request.oppositeRegionId;
            this.oppositeRouterId = request.oppositeRouterId;
            this.oppositeRouterType = request.oppositeRouterType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.pricingCycle = request.pricingCycle;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.role = request.role;
            this.routerId = request.routerId;
            this.routerType = request.routerType;
            this.spec = request.spec;
            this.tags = request.tags;
        } 

        /**
         * <p>The ID of the access point to which the VBR belongs. </p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36062.html">DescribeAccessPoints</a> operation to query the access point ID of the Express Connect circuit.  </p>
         * <blockquote>
         * <p>This parameter is required in Express Connect circuit scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-hangzhou-yh-ts-A</p>
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Valid values: </p>
         * <ul>
         * <li><p><strong>false</strong> (default): Automatic payment is disabled. After an order is generated, go to the Order Center to complete the payment.   </p>
         * </li>
         * <li><p><strong>true</strong>: Automatic payment is enabled. The order is automatically paid.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): Auto-renewal is disabled.</li>
         * <li><strong>true</strong>: Auto-renewal is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. </p>
         * <p>The client generates the value of this parameter. Ensure that the value is unique among different requests. </p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the router interface.  </p>
         * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>abcabc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the router interface on the VBR is created in fast link mode. Fast link mode allows the router interfaces on the VBR and VPC to be automatically connected after they are created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong> (default): no.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when <strong>RouterType</strong> is set to <strong>VBR</strong> and <strong>OppositeRouterType</strong> is set to <strong>VRouter</strong>.</li>
         * <li>When <strong>FastLinkMode</strong> is set to <strong>true</strong>, <strong>Role</strong> must be set to <strong>InitiatingSide</strong>, and <strong>AccessPointId</strong>, <strong>OppositeRouterType</strong>, <strong>OppositeRouterId</strong>, and <strong>OppositeInterfaceOwnerId</strong> are required.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fastLinkMode(Boolean fastLinkMode) {
            this.putQueryParameter("FastLinkMode", fastLinkMode);
            this.fastLinkMode = fastLinkMode;
            return this;
        }

        /**
         * <p>The source IP address for health checks. The IP address must be an unused IP address in the local VPC. </p>
         * <blockquote>
         * <p>You can specify this parameter in Express Connect circuit scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.6</p>
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.putQueryParameter("HealthCheckSourceIp", healthCheckSourceIp);
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * <p>The destination IP address for health checks. </p>
         * <blockquote>
         * <p>This parameter is required when <strong>HealthCheckSourceIp</strong> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.8</p>
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * <p>The billing method of the router interface. Valid values: </p>
         * <ul>
         * <li><p><strong>PrePaid</strong>: subscription.</p>
         * </li>
         * <li><p><strong>PostPaid</strong>: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The name of the router interface.  </p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the access point to which the peer belongs.</p>
         * <blockquote>
         * <p>This parameter is required when the peer router interface is on a VBR. This parameter cannot be modified after the router interface is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-shanghai-nt-aligroup-C</p>
         */
        public Builder oppositeAccessPointId(String oppositeAccessPointId) {
            this.putQueryParameter("OppositeAccessPointId", oppositeAccessPointId);
            this.oppositeAccessPointId = oppositeAccessPointId;
            return this;
        }

        /**
         * <p>The ID of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2zeo3xzyf38r4urzd****</p>
         */
        public Builder oppositeInterfaceId(String oppositeInterfaceId) {
            this.putQueryParameter("OppositeInterfaceId", oppositeInterfaceId);
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the owner of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            this.putQueryParameter("OppositeInterfaceOwnerId", oppositeInterfaceOwnerId);
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }

        /**
         * <p>The region ID of the accepter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder oppositeRegionId(String oppositeRegionId) {
            this.putQueryParameter("OppositeRegionId", oppositeRegionId);
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }

        /**
         * <p>The ID of the peer router.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1lhl0taikrteen8****</p>
         */
        public Builder oppositeRouterId(String oppositeRouterId) {
            this.putQueryParameter("OppositeRouterId", oppositeRouterId);
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }

        /**
         * <p>The type of the router associated with the peer router interface. Valid values: </p>
         * <ul>
         * <li><p><strong>VRouter</strong>: vRouter.</p>
         * </li>
         * <li><p><strong>VBR</strong>: Virtual Border Router.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VRouter</p>
         */
        public Builder oppositeRouterType(String oppositeRouterType) {
            this.putQueryParameter("OppositeRouterType", oppositeRouterType);
            this.oppositeRouterType = oppositeRouterType;
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
         * <p>The subscription duration. Valid values: </p>
         * <ul>
         * <li><p>If you select monthly billing, the valid values are <strong>1</strong> to <strong>9</strong>.</p>
         * </li>
         * <li><p>If you select yearly billing, the valid values are <strong>1</strong> to <strong>3</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The billing cycle of the subscription. Valid values:</p>
         * <ul>
         * <li><p><strong>Month</strong> (default): monthly billing.</p>
         * </li>
         * <li><p><strong>Year</strong>: yearly billing.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The region ID of the router interface.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The resource group ID.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group?</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
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
         * <p>The role of the router interface. Valid values: </p>
         * <ul>
         * <li><p><strong>InitiatingSide</strong>: requester.   </p>
         * </li>
         * <li><p><strong>AcceptingSide</strong>: accepter.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InitiatingSide</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>The ID of the router associated with the router interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-m5ebm6g9ptc9mly1c****</p>
         */
        public Builder routerId(String routerId) {
            this.putQueryParameter("RouterId", routerId);
            this.routerId = routerId;
            return this;
        }

        /**
         * <p>The type of the router associated with the router interface. Valid values: </p>
         * <ul>
         * <li><p><strong>VRouter</strong>: vRouter.</p>
         * </li>
         * <li><p><strong>VBR</strong>: Virtual Border Router.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VRouter</p>
         */
        public Builder routerType(String routerType) {
            this.putQueryParameter("RouterType", routerType);
            this.routerType = routerType;
            return this;
        }

        /**
         * <p>The specification of the router interface. The available specifications and corresponding bandwidth values are as follows: </p>
         * <ul>
         * <li><p><strong>Mini.2</strong>: 2 Mbps   </p>
         * </li>
         * <li><p><strong>Mini.5</strong>: 5 Mbps   </p>
         * </li>
         * <li><p><strong>Small.1</strong>: 10 Mbps   </p>
         * </li>
         * <li><p><strong>Small.2</strong>: 20 Mbps   </p>
         * </li>
         * <li><p><strong>Small.5</strong>: 50 Mbps   </p>
         * </li>
         * <li><p><strong>Middle.1</strong>: 100 Mbps   </p>
         * </li>
         * <li><p><strong>Middle.2</strong>: 200 Mbps   </p>
         * </li>
         * <li><p><strong>Middle.5</strong>: 500 Mbps   </p>
         * </li>
         * <li><p><strong>Large.1</strong>: 1000 Mbps   </p>
         * </li>
         * <li><p><strong>Large.2</strong>: 2000 Mbps   </p>
         * </li>
         * <li><p><strong>Large.5</strong>: 5000 Mbps   </p>
         * </li>
         * <li><p><strong>Xlarge.1</strong>: 10000 Mbps</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When <strong>Role</strong> is set to <strong>AcceptingSide</strong> (accepter), set <strong>Spec</strong> to <strong>Negative</strong>. No specification is required when you create an accepter router interface.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mini.2</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The tags of the resource.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateRouterInterfaceRequest build() {
            return new CreateRouterInterfaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRouterInterfaceRequest} extends {@link TeaModel}
     *
     * <p>CreateRouterInterfaceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You must specify at least 1 and can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>A tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
