// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("MinMemory")
    private Float minMemory;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("GpuSpec")
    private String gpuSpec;

    @Query
    @NameInMap("GpuAmount")
    private Integer gpuAmount;

    @Query
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @Query
    @NameInMap("MinCores")
    private Integer minCores;

    private DescribeSpotAdviceRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.minMemory = builder.minMemory;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.zoneId = builder.zoneId;
        this.gpuSpec = builder.gpuSpec;
        this.gpuAmount = builder.gpuAmount;
        this.cores = builder.cores;
        this.instanceTypes = builder.instanceTypes;
        this.memory = builder.memory;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.minCores = builder.minCores;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return minMemory
     */
    public Float getMinMemory() {
        return this.minMemory;
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
     * @return gpuSpec
     */
    public String getGpuSpec() {
        return this.gpuSpec;
    }

    /**
     * @return gpuAmount
     */
    public Integer getGpuAmount() {
        return this.gpuAmount;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
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
     * @return minCores
     */
    public Integer getMinCores() {
        return this.minCores;
    }

    public static final class Builder extends Request.Builder<DescribeSpotAdviceRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private String regionId; 
        private Float minMemory; 
        private String instanceTypeFamily; 
        private String zoneId; 
        private String gpuSpec; 
        private Integer gpuAmount; 
        private Integer cores; 
        private java.util.List < String > instanceTypes; 
        private Float memory; 
        private String instanceFamilyLevel; 
        private Integer minCores; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpotAdviceRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.minMemory = request.minMemory;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.zoneId = request.zoneId;
            this.gpuSpec = request.gpuSpec;
            this.gpuAmount = request.gpuAmount;
            this.cores = request.cores;
            this.instanceTypes = request.instanceTypes;
            this.memory = request.memory;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.minCores = request.minCores;
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
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The minimum memory size of the instance type. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder minMemory(Float minMemory) {
            this.putQueryParameter("MinMemory", minMemory);
            this.minMemory = minMemory;
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
         * Default value: none.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The type of the GPU computing card. Valid values:
         * <p>
         * 
         * -NVIDIA P4
         * -NVIDIA T4
         * -NVIDIA P100
         * -NVIDIA V100
         * -NVIDIA A100
         * 
         * Default value: none. For more information, see [GPU compute instance Overview](~~ 108496 ~~).
         */
        public Builder gpuSpec(String gpuSpec) {
            this.putQueryParameter("GpuSpec", gpuSpec);
            this.gpuSpec = gpuSpec;
            return this;
        }

        /**
         * The number of GPUs corresponding to the GPU instance. For more information, see [GPU compute instance Overview](~~ 108496 ~~).
         */
        public Builder gpuAmount(Integer gpuAmount) {
            this.putQueryParameter("GpuAmount", gpuAmount);
            this.gpuAmount = gpuAmount;
            return this;
        }

        /**
         * The number of VCPUs of the instance type. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
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
         * The memory size of the instance type. Unit: GiB. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The instance type family. Valid values:
         * <p>
         * 
         * -EntryLevel: entry-level.
         * -EnterpriseLevel: enterprise-level.
         * -CreditEntryLevel: the entry level of points. For more information, see [burstable instances](~~ 59977 ~~).
         * 
         * Default value: none.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
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

        @Override
        public DescribeSpotAdviceRequest build() {
            return new DescribeSpotAdviceRequest(this);
        } 

    } 

}
