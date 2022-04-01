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
    @NameInMap("Cores")
    private Integer cores;

    @Query
    @NameInMap("GpuAmount")
    private Integer gpuAmount;

    @Query
    @NameInMap("GpuSpec")
    private String gpuSpec;

    @Query
    @NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("MinCores")
    private Integer minCores;

    @Query
    @NameInMap("MinMemory")
    private Float minMemory;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

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
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeSpotAdviceRequest(Builder builder) {
        super(builder);
        this.cores = builder.cores;
        this.gpuAmount = builder.gpuAmount;
        this.gpuSpec = builder.gpuSpec;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.instanceTypes = builder.instanceTypes;
        this.memory = builder.memory;
        this.minCores = builder.minCores;
        this.minMemory = builder.minMemory;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
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
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
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

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
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
     * @return minCores
     */
    public Integer getMinCores() {
        return this.minCores;
    }

    /**
     * @return minMemory
     */
    public Float getMinMemory() {
        return this.minMemory;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeSpotAdviceRequest, Builder> {
        private Integer cores; 
        private Integer gpuAmount; 
        private String gpuSpec; 
        private String instanceFamilyLevel; 
        private String instanceTypeFamily; 
        private java.util.List < String > instanceTypes; 
        private Float memory; 
        private Integer minCores; 
        private Float minMemory; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpotAdviceRequest request) {
            super(request);
            this.cores = request.cores;
            this.gpuAmount = request.gpuAmount;
            this.gpuSpec = request.gpuSpec;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.instanceTypes = request.instanceTypes;
            this.memory = request.memory;
            this.minCores = request.minCores;
            this.minMemory = request.minMemory;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Cores.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * GpuAmount.
         */
        public Builder gpuAmount(Integer gpuAmount) {
            this.putQueryParameter("GpuAmount", gpuAmount);
            this.gpuAmount = gpuAmount;
            return this;
        }

        /**
         * GpuSpec.
         */
        public Builder gpuSpec(String gpuSpec) {
            this.putQueryParameter("GpuSpec", gpuSpec);
            this.gpuSpec = gpuSpec;
            return this;
        }

        /**
         * InstanceFamilyLevel.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * InstanceTypeFamily.
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * MinCores.
         */
        public Builder minCores(Integer minCores) {
            this.putQueryParameter("MinCores", minCores);
            this.minCores = minCores;
            return this;
        }

        /**
         * MinMemory.
         */
        public Builder minMemory(Float minMemory) {
            this.putQueryParameter("MinMemory", minMemory);
            this.minMemory = minMemory;
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
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeSpotAdviceRequest build() {
            return new DescribeSpotAdviceRequest(this);
        } 

    } 

}
