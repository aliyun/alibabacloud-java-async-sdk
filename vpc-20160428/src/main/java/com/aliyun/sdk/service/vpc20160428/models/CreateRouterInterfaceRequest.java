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

    private CreateRouterInterfaceRequest(Builder builder) {
        super(builder);
        this.accessPointId = builder.accessPointId;
        this.autoPay = builder.autoPay;
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
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.role = builder.role;
        this.routerId = builder.routerId;
        this.routerType = builder.routerType;
        this.spec = builder.spec;
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

    public static final class Builder extends Request.Builder<CreateRouterInterfaceRequest, Builder> {
        private String accessPointId; 
        private Boolean autoPay; 
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
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String role; 
        private String routerId; 
        private String routerType; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouterInterfaceRequest request) {
            super(request);
            this.accessPointId = request.accessPointId;
            this.autoPay = request.autoPay;
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
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.role = request.role;
            this.routerId = request.routerId;
            this.routerType = request.routerType;
            this.spec = request.spec;
        } 

        /**
         * AccessPointId.
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FastLinkMode.
         */
        public Builder fastLinkMode(Boolean fastLinkMode) {
            this.putQueryParameter("FastLinkMode", fastLinkMode);
            this.fastLinkMode = fastLinkMode;
            return this;
        }

        /**
         * HealthCheckSourceIp.
         */
        public Builder healthCheckSourceIp(String healthCheckSourceIp) {
            this.putQueryParameter("HealthCheckSourceIp", healthCheckSourceIp);
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }

        /**
         * HealthCheckTargetIp.
         */
        public Builder healthCheckTargetIp(String healthCheckTargetIp) {
            this.putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OppositeAccessPointId.
         */
        public Builder oppositeAccessPointId(String oppositeAccessPointId) {
            this.putQueryParameter("OppositeAccessPointId", oppositeAccessPointId);
            this.oppositeAccessPointId = oppositeAccessPointId;
            return this;
        }

        /**
         * OppositeInterfaceId.
         */
        public Builder oppositeInterfaceId(String oppositeInterfaceId) {
            this.putQueryParameter("OppositeInterfaceId", oppositeInterfaceId);
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }

        /**
         * OppositeInterfaceOwnerId.
         */
        public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            this.putQueryParameter("OppositeInterfaceOwnerId", oppositeInterfaceOwnerId);
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }

        /**
         * OppositeRegionId.
         */
        public Builder oppositeRegionId(String oppositeRegionId) {
            this.putQueryParameter("OppositeRegionId", oppositeRegionId);
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }

        /**
         * OppositeRouterId.
         */
        public Builder oppositeRouterId(String oppositeRouterId) {
            this.putQueryParameter("OppositeRouterId", oppositeRouterId);
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }

        /**
         * OppositeRouterType.
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
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * RegionId.
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
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * RouterId.
         */
        public Builder routerId(String routerId) {
            this.putQueryParameter("RouterId", routerId);
            this.routerId = routerId;
            return this;
        }

        /**
         * RouterType.
         */
        public Builder routerType(String routerType) {
            this.putQueryParameter("RouterType", routerType);
            this.routerType = routerType;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public CreateRouterInterfaceRequest build() {
            return new CreateRouterInterfaceRequest(this);
        } 

    } 

}
