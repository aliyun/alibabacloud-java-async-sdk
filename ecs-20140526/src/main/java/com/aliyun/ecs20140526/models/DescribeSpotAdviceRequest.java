// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpotAdviceRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpotAdviceRequest</p>
 */
public class DescribeSpotAdviceRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("MinCores")
    private Integer minCores;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @Query
    @NameInMap("MinMemory")
    private Float minMemory;

    @Query
    @NameInMap("GpuAmount")
    private Integer gpuAmount;

    @Query
    @NameInMap("GpuSpec")
    private String gpuSpec;

    private DescribeSpotAdviceRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.zoneId = builder.zoneId;
        this.regionId = builder.regionId;
        this.instanceTypes = builder.instanceTypes;
        this.minCores = builder.minCores;
        this.cores = builder.cores;
        this.memory = builder.memory;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.minMemory = builder.minMemory;
        this.gpuAmount = builder.gpuAmount;
        this.gpuSpec = builder.gpuSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotAdviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return minCores
     */
    public Integer getMinCores() {
        return this.minCores;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return minMemory
     */
    public Float getMinMemory() {
        return this.minMemory;
    }

    /**
     * @return gpuAmount
     */
    public Integer getGpuAmount() {
        return this.gpuAmount;
    }

    /**
     * @return gpuSpec
     */
    public String getGpuSpec() {
        return this.gpuSpec;
    }

    public static final class Builder extends Request.Builder<DescribeSpotAdviceRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String instanceTypeFamily; 
        private String zoneId; 
        private String regionId; 
        private java.util.List < String > instanceTypes; 
        private Integer minCores; 
        private Integer cores; 
        private Float memory; 
        private String instanceFamilyLevel; 
        private Float minMemory; 
        private Integer gpuAmount; 
        private String gpuSpec; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpotAdviceRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.instanceTypeFamily = response.instanceTypeFamily;
            this.zoneId = response.zoneId;
            this.regionId = response.regionId;
            this.instanceTypes = response.instanceTypes;
            this.minCores = response.minCores;
            this.cores = response.cores;
            this.memory = response.memory;
            this.instanceFamilyLevel = response.instanceFamilyLevel;
            this.minMemory = response.minMemory;
            this.gpuAmount = response.gpuAmount;
            this.gpuSpec = response.gpuSpec;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The instance type family. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * The ID of the zone.
         * <p>
         * 
         * Default value: none, that query specified geographical lower all the available area.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The instance type. Valid values of N: 1 to 10. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The minimum number of VCPUs of the instance type. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder minCores(Integer minCores) {
            this.putQueryParameter("MinCores", minCores);
            this.minCores = minCores;
            return this;
        }

        /**
         * Instance dimension of VCPUs. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * Instance specifications of the memory size. Unit: GiB. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * Instance dimension family level. Valid values:
         * <p>
         * 
         * -EntryLevel: entry-level.
         * -EnterpriseLevel: enterprise-class.
         * -CreditEntryLevel: integral entry-level. More information, please see [burst performance instance](~~ 59977 ~~).
         * 
         * Default value: none, that query all levels.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * Instance dimension the memory size of the minimum value. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder minMemory(Float minMemory) {
            this.putQueryParameter("MinMemory", minMemory);
            this.minMemory = minMemory;
            return this;
        }

        /**
         * GPU instance corresponding to the number of GPUS. Value please see [GPU computing-type instance Overview](~~ 108496 ~~).
         */
        public Builder gpuAmount(Integer gpuAmount) {
            this.putQueryParameter("GpuAmount", gpuAmount);
            this.gpuAmount = gpuAmount;
            return this;
        }

        /**
         * GPU computing type of card. Valid values:
         * <p>
         * 
         * -NVIDIA P4
         * -NVIDIA T4
         * -NVIDIA P100
         * -NVIDIA V100
         * -NVIDIA A100
         * 
         * Default value: none, that query all types. More information, please see [GPU computing-type instance Overview](~~ 108496 ~~).
         */
        public Builder gpuSpec(String gpuSpec) {
            this.putQueryParameter("GpuSpec", gpuSpec);
            this.gpuSpec = gpuSpec;
            return this;
        }

        @Override
        public DescribeSpotAdviceRequest build() {
            return new DescribeSpotAdviceRequest(this);
        } 

    } 

}
