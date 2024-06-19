// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerGroupPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerGroupPriceRequest</p>
 */
public class DescribeContainerGroupPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeCategory")
    private String computeCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Float cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EphemeralStorage")
    private Integer ephemeralStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

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
    @com.aliyun.core.annotation.NameInMap("SpotDuration")
    private Integer spotDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeContainerGroupPriceRequest(Builder builder) {
        super(builder);
        this.computeCategory = builder.computeCategory;
        this.cpu = builder.cpu;
        this.ephemeralStorage = builder.ephemeralStorage;
        this.instanceType = builder.instanceType;
        this.memory = builder.memory;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotDuration = builder.spotDuration;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computeCategory
     */
    public String getComputeCategory() {
        return this.computeCategory;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return ephemeralStorage
     */
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
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
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeContainerGroupPriceRequest, Builder> {
        private String computeCategory; 
        private Float cpu; 
        private Integer ephemeralStorage; 
        private String instanceType; 
        private Float memory; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer spotDuration; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerGroupPriceRequest request) {
            super(request);
            this.computeCategory = request.computeCategory;
            this.cpu = request.cpu;
            this.ephemeralStorage = request.ephemeralStorage;
            this.instanceType = request.instanceType;
            this.memory = request.memory;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotDuration = request.spotDuration;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.zoneId = request.zoneId;
        } 

        /**
         * The computing power type. A value of economy specifies economic instances.
         */
        public Builder computeCategory(String computeCategory) {
            this.putQueryParameter("ComputeCategory", computeCategory);
            this.computeCategory = computeCategory;
            return this;
        }

        /**
         * The number of vCPUs. For information about the vCPU and memory specifications that are supported by Elastic Container Instance, see [vCPU and memory specifications](~~114662~~).
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The storage size of the temporary storage space. Unit: GiB.
         */
        public Builder ephemeralStorage(Integer ephemeralStorage) {
            this.putQueryParameter("EphemeralStorage", ephemeralStorage);
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * The instance type of the Elastic Compute Service (ECS) instance that is used to create the elastic container instance. For information about the ECS instance types that are supported by Elastic Container Instance, see [ECS instance types that are supported by Elastic Container Instance](~~114664~~).
         * <p>
         * 
         * > If you specify this parameter, the specified specifications of vCPUs and memory are ignored. Only the price of the ECS instance type is returned.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The size of the memory. Unit: GiB. For information about the vCPU and memory specifications that are supported by Elastic Container Instance, see [vCPU and memory specifications](~~114662~~).
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
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
         * The region ID of the instance. You can call the [DescribeRegions](~~146965~~) operation to query the most recent region and zone list.
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
         * The protection period of the preemptible instance. Unit: hours. Default value: 1. The value of 0 indicates no protection period.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * The maximum hourly price of the preemptible elastic container instance. The value can contain up to three decimal places. If you set SpotStrategy to SpotWithPriceLimit, you must specify SpotPriceLimit.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The bidding policy for the elastic container instance. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is a regular pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.
         * 
         * Default value: NoSpot.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The zone ID of the instance. You can call the [DescribeRegions](~~146965~~) operation to query the most recent region and zone list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeContainerGroupPriceRequest build() {
            return new DescribeContainerGroupPriceRequest(this);
        } 

    } 

}
