// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeSpotAdviceRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpotAdviceRequest</p>
 */
public class DescribeSpotAdviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cores")
    private Integer cores;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuAmount")
    private Integer gpuAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuSpec")
    private String gpuSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List<String> instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinCores")
    private Integer minCores;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinMemory")
    private Float minMemory;

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
    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
    public java.util.List<String> getInstanceTypes() {
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
        private java.util.List<String> instanceTypes; 
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
         * <p>The number of vCPUs of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * <p>The number of GPUs that a GPU-accelerated instance has. For information about the valid values, see <a href="https://help.aliyun.com/document_detail/108496.html">GPU-accelerated compute optimized instance types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder gpuAmount(Integer gpuAmount) {
            this.putQueryParameter("GpuAmount", gpuAmount);
            this.gpuAmount = gpuAmount;
            return this;
        }

        /**
         * <p>The GPU type. Valid values:</p>
         * <ul>
         * <li>NVIDIA P4</li>
         * <li>NVIDIA T4</li>
         * <li>NVIDIA P100</li>
         * <li>NVIDIA V100</li>
         * </ul>
         * <p>This parameter is left empty by default, which indicates that all GPU types are queried. For more information, see <a href="https://help.aliyun.com/document_detail/108496.html">GPU-accelerated compute-optimized and vGPU-accelerated instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA T4</p>
         */
        public Builder gpuSpec(String gpuSpec) {
            this.putQueryParameter("GpuSpec", gpuSpec);
            this.gpuSpec = gpuSpec;
            return this;
        }

        /**
         * <p>The level of the instance family. Valid values:</p>
         * <ul>
         * <li>EntryLevel.</li>
         * <li>EnterpriseLevel.</li>
         * <li>CreditEntryLevel. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * <p>This parameter is left empty by default, which indicates that instance families at all levels are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>EntryLevel</p>
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * <p>The instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5</p>
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * <p>The instance types. You can specify up to 10 instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.large</p>
         */
        public Builder instanceTypes(java.util.List<String> instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The memory size of the instance type. Unit: GiB. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The minimum number of vCPUs of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minCores(Integer minCores) {
            this.putQueryParameter("MinCores", minCores);
            this.minCores = minCores;
            return this;
        }

        /**
         * <p>The minimum memory size of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The zone ID.</p>
         * <p>This parameter is left empty by default, which indicates that all zones in the specified region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
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
