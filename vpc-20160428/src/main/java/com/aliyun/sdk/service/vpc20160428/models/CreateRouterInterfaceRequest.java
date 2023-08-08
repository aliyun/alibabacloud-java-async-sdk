// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouterInterfaceRequest} extends {@link RequestModel}
 *
 * <p>CreateRouterInterfaceRequest</p>
 */
public class CreateRouterInterfaceRequest extends Request {
    @Query
    @NameInMap("AccessPointId")
    private String accessPointId;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FastLinkMode")
    private Boolean fastLinkMode;

    @Query
    @NameInMap("HealthCheckSourceIp")
    private String healthCheckSourceIp;

    @Query
    @NameInMap("HealthCheckTargetIp")
    private String healthCheckTargetIp;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OppositeAccessPointId")
    private String oppositeAccessPointId;

    @Query
    @NameInMap("OppositeInterfaceId")
    private String oppositeInterfaceId;

    @Query
    @NameInMap("OppositeInterfaceOwnerId")
    private String oppositeInterfaceOwnerId;

    @Query
    @NameInMap("OppositeRegionId")
    @Validation(required = true)
    private String oppositeRegionId;

    @Query
    @NameInMap("OppositeRouterId")
    private String oppositeRouterId;

    @Query
    @NameInMap("OppositeRouterType")
    private String oppositeRouterType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
    @NameInMap("Role")
    @Validation(required = true)
    private String role;

    @Query
    @NameInMap("RouterId")
    @Validation(required = true)
    private String routerId;

    @Query
    @NameInMap("RouterType")
    @Validation(required = true)
    private String routerType;

    @Query
    @NameInMap("Spec")
    @Validation(required = true)
    private String spec;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

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
    public java.util.List < Tags> getTags() {
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
        private java.util.List < Tags> tags; 

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
         * The ID of the access point to which the VBR belongs.
         * <p>
         * 
         * You can call the [DescribeAccessPoints](~~36062~~) operation to query the most recent access point list.
         * 
         * >  This parameter is required if an Express Connect circuit is used.
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * Specifies whether to enable automatic payment. Valid values:
         * <p>
         * 
         * *   **false** (default): disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.
         * *   **true**: enables automatic payment. Payments are automatically completed.
         * 
         * >  This parameter is required if **InstanceChargeType** is set to **PrePaid**.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests.
         * 
         * >  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the router interface.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Indicates whether the VBR that is created in the Fast Link mode is uplinked to the router interface. The Fast Link mode helps automatically connect router interfaces that are created for the VBR and its peer VPC. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         * 
         * > 
         * *   This parameter takes effect only if **RouterType** is set to **VBR** and **OppositeRouterType** is set to **VRouter**.
         * *   If **FastLinkMode** is set to **true**, **Role** must be set to **InitiatingSide**. **AccessPointId**, **OppositeRouterType**, **OpppsiteRouterId**, and **OppositeInterfaceOwnerId** are required.
         */
        public Builder fastLinkMode(Boolean fastLinkMode) {
            this.putQueryParameter("FastLinkMode", fastLinkMode);
            this.fastLinkMode = fastLinkMode;
            return this;
        }

        /**
         * The source IP address that is used to perform health checks. The source IP address must be an idle IP address of the local virtual private cloud (VPC).
         * <p>
         * 
         * >  You can set this parameter if an Express Connect circuit is used.
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.putQueryParameter("HealthCheckSourceIp", healthCheckSourceIp);
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * The destination IP address that is used to perform health checks.
         * <p>
         * 
         * >  This parameter is required if the **HealthCheckSourceIp** parameter is set.
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * The billing method of the router interface. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The name of the router interface.
         * <p>
         * 
         * The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the access point to which the peer belongs.
         * <p>
         * 
         * >  This parameter is required if the peer router interface is associated with a VBR. The specified value cannot be changed after the router interface is created.
         */
        public Builder oppositeAccessPointId(String oppositeAccessPointId) {
            this.putQueryParameter("OppositeAccessPointId", oppositeAccessPointId);
            this.oppositeAccessPointId = oppositeAccessPointId;
            return this;
        }

        /**
         * The ID of the peer router interface.
         */
        public Builder oppositeInterfaceId(String oppositeInterfaceId) {
            this.putQueryParameter("OppositeInterfaceId", oppositeInterfaceId);
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the peer router interface belongs.
         */
        public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            this.putQueryParameter("OppositeInterfaceOwnerId", oppositeInterfaceOwnerId);
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }

        /**
         * The ID of the region where the acceptor is deployed.
         */
        public Builder oppositeRegionId(String oppositeRegionId) {
            this.putQueryParameter("OppositeRegionId", oppositeRegionId);
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }

        /**
         * The ID of the peer router.
         */
        public Builder oppositeRouterId(String oppositeRouterId) {
            this.putQueryParameter("OppositeRouterId", oppositeRouterId);
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }

        /**
         * The type of router that is associated with the peer router interface. Valid values:
         * <p>
         * 
         * *   **VRouter**
         * *   **VBR**
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
         * The subscription duration. Valid values:
         * <p>
         * 
         * *   Valid values if the PricingCycle parameter is set to Month: **1 to 9**.
         * *   Valid values if the PricingCycle parameter is set to Year: **1 to 3**.
         * 
         * >  This parameter is required if **InstanceChargeType** is set to **PrePaid**.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The billing cycle of the subscription. Valid values:
         * <p>
         * 
         * *   **Month** (default): monthly subscription
         * *   **Year**: annual subscription
         * 
         * >  This parameter is required if **InstanceChargeType** is set to **PrePaid**.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * The ID of the region to which the router interface belongs.
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
         * ResourceGroupId.
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
         * The role of the router interface. Valid values:
         * <p>
         * 
         * *   **InitiatingSide**: requester
         * *   **AcceptingSide**: acceptor
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * The ID of the router that is associated with the router interface.
         */
        public Builder routerId(String routerId) {
            this.putQueryParameter("RouterId", routerId);
            this.routerId = routerId;
            return this;
        }

        /**
         * The type of router associated with the router interface. Valid values:
         * <p>
         * 
         * *   **VRouter**
         * *   **VBR**
         */
        public Builder routerType(String routerType) {
            this.putQueryParameter("RouterType", routerType);
            this.routerType = routerType;
            return this;
        }

        /**
         * The specification of the router interface. Valid specifications and bandwidth values:
         * <p>
         * 
         * *   **Mini.2**: 2 Mbit/s
         * *   **Mini.5**: 5 Mbit/s
         * *   **Small.1**: 10 Mbit/s
         * *   **Small.2**: 20 Mbit/s
         * *   **Small.5**: 50 Mbit/s
         * *   **Middle.1**: 100 Mbit/s
         * *   **Middle.2**: 200 Mbit/s
         * *   **Middle.5**: 500 Mbit/s
         * *   **Large.1**: 1,000 Mbit/s
         * *   **Large.2**: 2,000 Mbit/s
         * *   **Large.5**: 5,000 Mbit/s
         * *   **Xlarge.1**: 10,000 Mbit/s
         * 
         * >  If **Role** is set to **AcceptingSide** (acceptor), set **Spec** to **Negative**. You do not need to specify specifications when you create an acceptor router interface.
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateRouterInterfaceRequest build() {
            return new CreateRouterInterfaceRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
