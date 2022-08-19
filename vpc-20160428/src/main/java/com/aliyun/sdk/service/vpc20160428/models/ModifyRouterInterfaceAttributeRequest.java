// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRouterInterfaceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyRouterInterfaceAttributeRequest</p>
 */
public class ModifyRouterInterfaceAttributeRequest extends Request {
    @Query
    @NameInMap("DeleteHealthCheckIp")
    private Boolean deleteHealthCheckIp;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("HcRate")
    private Integer hcRate;

    @Query
    @NameInMap("HcThreshold")
    private Integer hcThreshold;

    @Query
    @NameInMap("HealthCheckSourceIp")
    private String healthCheckSourceIp;

    @Query
    @NameInMap("HealthCheckTargetIp")
    private String healthCheckTargetIp;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OppositeInterfaceId")
    private String oppositeInterfaceId;

    @Query
    @NameInMap("OppositeInterfaceOwnerId")
    private Long oppositeInterfaceOwnerId;

    @Query
    @NameInMap("OppositeRouterId")
    private String oppositeRouterId;

    @Query
    @NameInMap("OppositeRouterType")
    private String oppositeRouterType;

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
    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    private String routerInterfaceId;

    private ModifyRouterInterfaceAttributeRequest(Builder builder) {
        super(builder);
        this.deleteHealthCheckIp = builder.deleteHealthCheckIp;
        this.description = builder.description;
        this.hcRate = builder.hcRate;
        this.hcThreshold = builder.hcThreshold;
        this.healthCheckSourceIp = builder.healthCheckSourceIp;
        this.healthCheckTargetIp = builder.healthCheckTargetIp;
        this.name = builder.name;
        this.oppositeInterfaceId = builder.oppositeInterfaceId;
        this.oppositeInterfaceOwnerId = builder.oppositeInterfaceOwnerId;
        this.oppositeRouterId = builder.oppositeRouterId;
        this.oppositeRouterType = builder.oppositeRouterType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routerInterfaceId = builder.routerInterfaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRouterInterfaceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteHealthCheckIp
     */
    public Boolean getDeleteHealthCheckIp() {
        return this.deleteHealthCheckIp;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hcRate
     */
    public Integer getHcRate() {
        return this.hcRate;
    }

    /**
     * @return hcThreshold
     */
    public Integer getHcThreshold() {
        return this.hcThreshold;
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
     * @return name
     */
    public String getName() {
        return this.name;
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
    public Long getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
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
     * @return routerInterfaceId
     */
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public static final class Builder extends Request.Builder<ModifyRouterInterfaceAttributeRequest, Builder> {
        private Boolean deleteHealthCheckIp; 
        private String description; 
        private Integer hcRate; 
        private Integer hcThreshold; 
        private String healthCheckSourceIp; 
        private String healthCheckTargetIp; 
        private String name; 
        private String oppositeInterfaceId; 
        private Long oppositeInterfaceOwnerId; 
        private String oppositeRouterId; 
        private String oppositeRouterType; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routerInterfaceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRouterInterfaceAttributeRequest request) {
            super(request);
            this.deleteHealthCheckIp = request.deleteHealthCheckIp;
            this.description = request.description;
            this.hcRate = request.hcRate;
            this.hcThreshold = request.hcThreshold;
            this.healthCheckSourceIp = request.healthCheckSourceIp;
            this.healthCheckTargetIp = request.healthCheckTargetIp;
            this.name = request.name;
            this.oppositeInterfaceId = request.oppositeInterfaceId;
            this.oppositeInterfaceOwnerId = request.oppositeInterfaceOwnerId;
            this.oppositeRouterId = request.oppositeRouterId;
            this.oppositeRouterType = request.oppositeRouterType;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routerInterfaceId = request.routerInterfaceId;
        } 

        /**
         * DeleteHealthCheckIp.
         */
        public Builder deleteHealthCheckIp(Boolean deleteHealthCheckIp) {
            this.putQueryParameter("DeleteHealthCheckIp", deleteHealthCheckIp);
            this.deleteHealthCheckIp = deleteHealthCheckIp;
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
         * HcRate.
         */
        public Builder hcRate(Integer hcRate) {
            this.putQueryParameter("HcRate", hcRate);
            this.hcRate = hcRate;
            return this;
        }

        /**
         * HcThreshold.
         */
        public Builder hcThreshold(Integer hcThreshold) {
            this.putQueryParameter("HcThreshold", hcThreshold);
            this.hcThreshold = hcThreshold;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public Builder oppositeInterfaceOwnerId(Long oppositeInterfaceOwnerId) {
            this.putQueryParameter("OppositeInterfaceOwnerId", oppositeInterfaceOwnerId);
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * RouterInterfaceId.
         */
        public Builder routerInterfaceId(String routerInterfaceId) {
            this.putQueryParameter("RouterInterfaceId", routerInterfaceId);
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }

        @Override
        public ModifyRouterInterfaceAttributeRequest build() {
            return new ModifyRouterInterfaceAttributeRequest(this);
        } 

    } 

}
