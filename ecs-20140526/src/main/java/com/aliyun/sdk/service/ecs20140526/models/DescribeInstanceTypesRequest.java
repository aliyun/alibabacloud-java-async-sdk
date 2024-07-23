// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTypesRequest</p>
 */
public class DescribeInstanceTypesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuArchitecture")
    private String cpuArchitecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuArchitectures")
    private java.util.List < String > cpuArchitectures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GPUSpec")
    private String GPUSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuSpecs")
    private java.util.List < String > gpuSpecs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceCategories")
    private java.util.List < String > instanceCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceCategory")
    private String instanceCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
    private java.util.List < String > instanceTypeFamilies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalStorageCategories")
    private java.util.List < String > localStorageCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalStorageCategory")
    private String localStorageCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1600, minimum = 1)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumCpuCoreCount")
    private Integer maximumCpuCoreCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumCpuSpeedFrequency")
    private Float maximumCpuSpeedFrequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumCpuTurboFrequency")
    private Float maximumCpuTurboFrequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumGPUAmount")
    private Integer maximumGPUAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumMemorySize")
    private Float maximumMemorySize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumBaselineCredit")
    private Integer minimumBaselineCredit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumCpuCoreCount")
    private Integer minimumCpuCoreCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumCpuSpeedFrequency")
    private Float minimumCpuSpeedFrequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumCpuTurboFrequency")
    private Float minimumCpuTurboFrequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumDiskQuantity")
    private Integer minimumDiskQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumEniIpv6AddressQuantity")
    private Integer minimumEniIpv6AddressQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumEniPrivateIpAddressQuantity")
    private Integer minimumEniPrivateIpAddressQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumEniQuantity")
    private Integer minimumEniQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumEriQuantity")
    private Integer minimumEriQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumGPUAmount")
    private Integer minimumGPUAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumInitialCredit")
    private Integer minimumInitialCredit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumInstanceBandwidthRx")
    private Integer minimumInstanceBandwidthRx;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumInstanceBandwidthTx")
    private Integer minimumInstanceBandwidthTx;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumInstancePpsRx")
    private Long minimumInstancePpsRx;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumInstancePpsTx")
    private Long minimumInstancePpsTx;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumLocalStorageAmount")
    private Integer minimumLocalStorageAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumLocalStorageCapacity")
    private Long minimumLocalStorageCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumMemorySize")
    private Float minimumMemorySize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumPrimaryEniQueueNumber")
    private Integer minimumPrimaryEniQueueNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumQueuePairNumber")
    private Integer minimumQueuePairNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumSecondaryEniQueueNumber")
    private Integer minimumSecondaryEniQueueNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 50)
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NvmeSupport")
    private String nvmeSupport;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicalProcessorModel")
    private String physicalProcessorModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicalProcessorModels")
    private java.util.List < String > physicalProcessorModels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeInstanceTypesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.cpuArchitecture = builder.cpuArchitecture;
        this.cpuArchitectures = builder.cpuArchitectures;
        this.GPUSpec = builder.GPUSpec;
        this.gpuSpecs = builder.gpuSpecs;
        this.instanceCategories = builder.instanceCategories;
        this.instanceCategory = builder.instanceCategory;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceTypeFamilies = builder.instanceTypeFamilies;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.instanceTypes = builder.instanceTypes;
        this.localStorageCategories = builder.localStorageCategories;
        this.localStorageCategory = builder.localStorageCategory;
        this.maxResults = builder.maxResults;
        this.maximumCpuCoreCount = builder.maximumCpuCoreCount;
        this.maximumCpuSpeedFrequency = builder.maximumCpuSpeedFrequency;
        this.maximumCpuTurboFrequency = builder.maximumCpuTurboFrequency;
        this.maximumGPUAmount = builder.maximumGPUAmount;
        this.maximumMemorySize = builder.maximumMemorySize;
        this.minimumBaselineCredit = builder.minimumBaselineCredit;
        this.minimumCpuCoreCount = builder.minimumCpuCoreCount;
        this.minimumCpuSpeedFrequency = builder.minimumCpuSpeedFrequency;
        this.minimumCpuTurboFrequency = builder.minimumCpuTurboFrequency;
        this.minimumDiskQuantity = builder.minimumDiskQuantity;
        this.minimumEniIpv6AddressQuantity = builder.minimumEniIpv6AddressQuantity;
        this.minimumEniPrivateIpAddressQuantity = builder.minimumEniPrivateIpAddressQuantity;
        this.minimumEniQuantity = builder.minimumEniQuantity;
        this.minimumEriQuantity = builder.minimumEriQuantity;
        this.minimumGPUAmount = builder.minimumGPUAmount;
        this.minimumInitialCredit = builder.minimumInitialCredit;
        this.minimumInstanceBandwidthRx = builder.minimumInstanceBandwidthRx;
        this.minimumInstanceBandwidthTx = builder.minimumInstanceBandwidthTx;
        this.minimumInstancePpsRx = builder.minimumInstancePpsRx;
        this.minimumInstancePpsTx = builder.minimumInstancePpsTx;
        this.minimumLocalStorageAmount = builder.minimumLocalStorageAmount;
        this.minimumLocalStorageCapacity = builder.minimumLocalStorageCapacity;
        this.minimumMemorySize = builder.minimumMemorySize;
        this.minimumPrimaryEniQueueNumber = builder.minimumPrimaryEniQueueNumber;
        this.minimumQueuePairNumber = builder.minimumQueuePairNumber;
        this.minimumSecondaryEniQueueNumber = builder.minimumSecondaryEniQueueNumber;
        this.nextToken = builder.nextToken;
        this.nvmeSupport = builder.nvmeSupport;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.physicalProcessorModel = builder.physicalProcessorModel;
        this.physicalProcessorModels = builder.physicalProcessorModels;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return cpuArchitecture
     */
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * @return cpuArchitectures
     */
    public java.util.List < String > getCpuArchitectures() {
        return this.cpuArchitectures;
    }

    /**
     * @return GPUSpec
     */
    public String getGPUSpec() {
        return this.GPUSpec;
    }

    /**
     * @return gpuSpecs
     */
    public java.util.List < String > getGpuSpecs() {
        return this.gpuSpecs;
    }

    /**
     * @return instanceCategories
     */
    public java.util.List < String > getInstanceCategories() {
        return this.instanceCategories;
    }

    /**
     * @return instanceCategory
     */
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return instanceTypeFamilies
     */
    public java.util.List < String > getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
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
     * @return localStorageCategories
     */
    public java.util.List < String > getLocalStorageCategories() {
        return this.localStorageCategories;
    }

    /**
     * @return localStorageCategory
     */
    public String getLocalStorageCategory() {
        return this.localStorageCategory;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return maximumCpuCoreCount
     */
    public Integer getMaximumCpuCoreCount() {
        return this.maximumCpuCoreCount;
    }

    /**
     * @return maximumCpuSpeedFrequency
     */
    public Float getMaximumCpuSpeedFrequency() {
        return this.maximumCpuSpeedFrequency;
    }

    /**
     * @return maximumCpuTurboFrequency
     */
    public Float getMaximumCpuTurboFrequency() {
        return this.maximumCpuTurboFrequency;
    }

    /**
     * @return maximumGPUAmount
     */
    public Integer getMaximumGPUAmount() {
        return this.maximumGPUAmount;
    }

    /**
     * @return maximumMemorySize
     */
    public Float getMaximumMemorySize() {
        return this.maximumMemorySize;
    }

    /**
     * @return minimumBaselineCredit
     */
    public Integer getMinimumBaselineCredit() {
        return this.minimumBaselineCredit;
    }

    /**
     * @return minimumCpuCoreCount
     */
    public Integer getMinimumCpuCoreCount() {
        return this.minimumCpuCoreCount;
    }

    /**
     * @return minimumCpuSpeedFrequency
     */
    public Float getMinimumCpuSpeedFrequency() {
        return this.minimumCpuSpeedFrequency;
    }

    /**
     * @return minimumCpuTurboFrequency
     */
    public Float getMinimumCpuTurboFrequency() {
        return this.minimumCpuTurboFrequency;
    }

    /**
     * @return minimumDiskQuantity
     */
    public Integer getMinimumDiskQuantity() {
        return this.minimumDiskQuantity;
    }

    /**
     * @return minimumEniIpv6AddressQuantity
     */
    public Integer getMinimumEniIpv6AddressQuantity() {
        return this.minimumEniIpv6AddressQuantity;
    }

    /**
     * @return minimumEniPrivateIpAddressQuantity
     */
    public Integer getMinimumEniPrivateIpAddressQuantity() {
        return this.minimumEniPrivateIpAddressQuantity;
    }

    /**
     * @return minimumEniQuantity
     */
    public Integer getMinimumEniQuantity() {
        return this.minimumEniQuantity;
    }

    /**
     * @return minimumEriQuantity
     */
    public Integer getMinimumEriQuantity() {
        return this.minimumEriQuantity;
    }

    /**
     * @return minimumGPUAmount
     */
    public Integer getMinimumGPUAmount() {
        return this.minimumGPUAmount;
    }

    /**
     * @return minimumInitialCredit
     */
    public Integer getMinimumInitialCredit() {
        return this.minimumInitialCredit;
    }

    /**
     * @return minimumInstanceBandwidthRx
     */
    public Integer getMinimumInstanceBandwidthRx() {
        return this.minimumInstanceBandwidthRx;
    }

    /**
     * @return minimumInstanceBandwidthTx
     */
    public Integer getMinimumInstanceBandwidthTx() {
        return this.minimumInstanceBandwidthTx;
    }

    /**
     * @return minimumInstancePpsRx
     */
    public Long getMinimumInstancePpsRx() {
        return this.minimumInstancePpsRx;
    }

    /**
     * @return minimumInstancePpsTx
     */
    public Long getMinimumInstancePpsTx() {
        return this.minimumInstancePpsTx;
    }

    /**
     * @return minimumLocalStorageAmount
     */
    public Integer getMinimumLocalStorageAmount() {
        return this.minimumLocalStorageAmount;
    }

    /**
     * @return minimumLocalStorageCapacity
     */
    public Long getMinimumLocalStorageCapacity() {
        return this.minimumLocalStorageCapacity;
    }

    /**
     * @return minimumMemorySize
     */
    public Float getMinimumMemorySize() {
        return this.minimumMemorySize;
    }

    /**
     * @return minimumPrimaryEniQueueNumber
     */
    public Integer getMinimumPrimaryEniQueueNumber() {
        return this.minimumPrimaryEniQueueNumber;
    }

    /**
     * @return minimumQueuePairNumber
     */
    public Integer getMinimumQueuePairNumber() {
        return this.minimumQueuePairNumber;
    }

    /**
     * @return minimumSecondaryEniQueueNumber
     */
    public Integer getMinimumSecondaryEniQueueNumber() {
        return this.minimumSecondaryEniQueueNumber;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nvmeSupport
     */
    public String getNvmeSupport() {
        return this.nvmeSupport;
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
     * @return physicalProcessorModel
     */
    public String getPhysicalProcessorModel() {
        return this.physicalProcessorModel;
    }

    /**
     * @return physicalProcessorModels
     */
    public java.util.List < String > getPhysicalProcessorModels() {
        return this.physicalProcessorModels;
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

    public static final class Builder extends Request.Builder<DescribeInstanceTypesRequest, Builder> {
        private String sourceRegionId; 
        private String cpuArchitecture; 
        private java.util.List < String > cpuArchitectures; 
        private String GPUSpec; 
        private java.util.List < String > gpuSpecs; 
        private java.util.List < String > instanceCategories; 
        private String instanceCategory; 
        private String instanceFamilyLevel; 
        private java.util.List < String > instanceTypeFamilies; 
        private String instanceTypeFamily; 
        private java.util.List < String > instanceTypes; 
        private java.util.List < String > localStorageCategories; 
        private String localStorageCategory; 
        private Long maxResults; 
        private Integer maximumCpuCoreCount; 
        private Float maximumCpuSpeedFrequency; 
        private Float maximumCpuTurboFrequency; 
        private Integer maximumGPUAmount; 
        private Float maximumMemorySize; 
        private Integer minimumBaselineCredit; 
        private Integer minimumCpuCoreCount; 
        private Float minimumCpuSpeedFrequency; 
        private Float minimumCpuTurboFrequency; 
        private Integer minimumDiskQuantity; 
        private Integer minimumEniIpv6AddressQuantity; 
        private Integer minimumEniPrivateIpAddressQuantity; 
        private Integer minimumEniQuantity; 
        private Integer minimumEriQuantity; 
        private Integer minimumGPUAmount; 
        private Integer minimumInitialCredit; 
        private Integer minimumInstanceBandwidthRx; 
        private Integer minimumInstanceBandwidthTx; 
        private Long minimumInstancePpsRx; 
        private Long minimumInstancePpsTx; 
        private Integer minimumLocalStorageAmount; 
        private Long minimumLocalStorageCapacity; 
        private Float minimumMemorySize; 
        private Integer minimumPrimaryEniQueueNumber; 
        private Integer minimumQueuePairNumber; 
        private Integer minimumSecondaryEniQueueNumber; 
        private String nextToken; 
        private String nvmeSupport; 
        private String ownerAccount; 
        private Long ownerId; 
        private String physicalProcessorModel; 
        private java.util.List < String > physicalProcessorModels; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTypesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.cpuArchitecture = request.cpuArchitecture;
            this.cpuArchitectures = request.cpuArchitectures;
            this.GPUSpec = request.GPUSpec;
            this.gpuSpecs = request.gpuSpecs;
            this.instanceCategories = request.instanceCategories;
            this.instanceCategory = request.instanceCategory;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceTypeFamilies = request.instanceTypeFamilies;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.instanceTypes = request.instanceTypes;
            this.localStorageCategories = request.localStorageCategories;
            this.localStorageCategory = request.localStorageCategory;
            this.maxResults = request.maxResults;
            this.maximumCpuCoreCount = request.maximumCpuCoreCount;
            this.maximumCpuSpeedFrequency = request.maximumCpuSpeedFrequency;
            this.maximumCpuTurboFrequency = request.maximumCpuTurboFrequency;
            this.maximumGPUAmount = request.maximumGPUAmount;
            this.maximumMemorySize = request.maximumMemorySize;
            this.minimumBaselineCredit = request.minimumBaselineCredit;
            this.minimumCpuCoreCount = request.minimumCpuCoreCount;
            this.minimumCpuSpeedFrequency = request.minimumCpuSpeedFrequency;
            this.minimumCpuTurboFrequency = request.minimumCpuTurboFrequency;
            this.minimumDiskQuantity = request.minimumDiskQuantity;
            this.minimumEniIpv6AddressQuantity = request.minimumEniIpv6AddressQuantity;
            this.minimumEniPrivateIpAddressQuantity = request.minimumEniPrivateIpAddressQuantity;
            this.minimumEniQuantity = request.minimumEniQuantity;
            this.minimumEriQuantity = request.minimumEriQuantity;
            this.minimumGPUAmount = request.minimumGPUAmount;
            this.minimumInitialCredit = request.minimumInitialCredit;
            this.minimumInstanceBandwidthRx = request.minimumInstanceBandwidthRx;
            this.minimumInstanceBandwidthTx = request.minimumInstanceBandwidthTx;
            this.minimumInstancePpsRx = request.minimumInstancePpsRx;
            this.minimumInstancePpsTx = request.minimumInstancePpsTx;
            this.minimumLocalStorageAmount = request.minimumLocalStorageAmount;
            this.minimumLocalStorageCapacity = request.minimumLocalStorageCapacity;
            this.minimumMemorySize = request.minimumMemorySize;
            this.minimumPrimaryEniQueueNumber = request.minimumPrimaryEniQueueNumber;
            this.minimumQueuePairNumber = request.minimumQueuePairNumber;
            this.minimumSecondaryEniQueueNumber = request.minimumSecondaryEniQueueNumber;
            this.nextToken = request.nextToken;
            this.nvmeSupport = request.nvmeSupport;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.physicalProcessorModel = request.physicalProcessorModel;
            this.physicalProcessorModels = request.physicalProcessorModels;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The CPU architecture. Valid values:
         * <p>
         * 
         * *   X86
         * *   ARM
         */
        public Builder cpuArchitecture(String cpuArchitecture) {
            this.putQueryParameter("CpuArchitecture", cpuArchitecture);
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        /**
         * The CPU architectures of instance types. Valid values:
         * <p>
         * 
         * >  Valid values of N: 1 and 2.
         * 
         * *   X86
         * *   ARM
         */
        public Builder cpuArchitectures(java.util.List < String > cpuArchitectures) {
            this.putQueryParameter("CpuArchitectures", cpuArchitectures);
            this.cpuArchitectures = cpuArchitectures;
            return this;
        }

        /**
         * The GPU model.
         * <p>
         * 
         * >  Fuzzy match is supported. For example, if an instance type provides NVIDIA V100 GPUs and you set this parameter to NVIDIA, information about the instance type is queried.
         */
        public Builder GPUSpec(String GPUSpec) {
            this.putQueryParameter("GPUSpec", GPUSpec);
            this.GPUSpec = GPUSpec;
            return this;
        }

        /**
         * The GPU models of instance types. Valid values of N: 1 to 10.
         */
        public Builder gpuSpecs(java.util.List < String > gpuSpecs) {
            this.putQueryParameter("GpuSpecs", gpuSpecs);
            this.gpuSpecs = gpuSpecs;
            return this;
        }

        /**
         * The categories of instance types. Valid values:
         * <p>
         * 
         * >  Valid values of N: 1 to 10.
         * 
         * *   General-purpose
         * *   Compute-optimized
         * *   Memory-optimized
         * *   Big data
         * *   Local SSDs
         * *   High Clock Speed
         * *   Enhanced
         * *   Shared
         * *   Compute-optimized with GPU
         * *   Visual Compute-optimized
         * *   Heterogeneous Service
         * *   Compute-optimized with FPGA
         * *   Compute-optimized with NPU
         * *   ECS Bare Metal
         * *   Super Computing Cluster
         * *   High Performance Compute
         */
        public Builder instanceCategories(java.util.List < String > instanceCategories) {
            this.putQueryParameter("InstanceCategories", instanceCategories);
            this.instanceCategories = instanceCategories;
            return this;
        }

        /**
         * The category of the instance type. Valid values:
         * <p>
         * 
         * *   General-purpose: general-purpose instance type
         * *   Compute-optimized: compute-optimized instance type
         * *   Memory-optimized: memory-optimized instance type
         * *   Big data: big data instance type
         * *   Local SSDs: instance type with local SSDs
         * *   High Clock Speed: instance type with high clock speeds
         * *   Enhanced: enhanced instance type
         * *   Shared: shared instance type
         * *   Compute-optimized with GPU: GPU-accelerated compute-optimized instance type
         * *   Visual Compute-optimized: visual compute-optimized instance type
         * *   Heterogeneous Service: heterogeneous service instance type
         * *   Compute-optimized with FPGA: FPGA-accelerated compute-optimized instance type
         * *   Compute-optimized with NPU: NPU-accelerated compute-optimized instance type
         * *   ECS Bare Metal: ECS Bare Metal Instance type
         * *   Super Computing Cluster: Super Computing Cluster (SCC) instance type
         * *   High Performance Compute: high-performance computing instance type
         */
        public Builder instanceCategory(String instanceCategory) {
            this.putQueryParameter("InstanceCategory", instanceCategory);
            this.instanceCategory = instanceCategory;
            return this;
        }

        /**
         * The level of the instance family. Valid values:
         * <p>
         * 
         * *   EntryLevel: entry level (shared)
         * *   EnterpriseLevel: enterprise level
         * *   CreditEntryLevel: credit-based entry level
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * The instance families of instance types that you want to query. Valid values of N: 1 to 10.
         */
        public Builder instanceTypeFamilies(java.util.List < String > instanceTypeFamilies) {
            this.putQueryParameter("InstanceTypeFamilies", instanceTypeFamilies);
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * The instance family to which the instance type belongs. For information about the valid values of this parameter, see [DescribeInstanceTypeFamilies](~~25621~~).
         * <p>
         * 
         * For more information about instance families, see [Instance families](~~25378~~).
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * Instance type N. Valid values of N: 1 to 10. If this parameter is left empty, information about all instance types is queried.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The categories of local disks. Valid values of N: 1 and 2. For more information, see [Local disks](~~63138#section_n2w\_8yc\_5u1~~). Valid values:
         * <p>
         * 
         * *   local_hdd_pro: local SATA HDDs, which are attached to d1ne or d1 instances
         * *   local_ssd_pro: local NVMe SSDs, which are attached to i2, i2g, i1, ga1, or gn5 instances
         */
        public Builder localStorageCategories(java.util.List < String > localStorageCategories) {
            this.putQueryParameter("LocalStorageCategories", localStorageCategories);
            this.localStorageCategories = localStorageCategories;
            return this;
        }

        /**
         * The category of local disks. For more information, see [Local disks](~~63138#section_n2w\_8yc\_5u1~~). Valid values:
         * <p>
         * 
         * *   local_hdd_pro: local Serial Advanced Technology Attachment (SATA) HDDs, which are attached to d1ne or d1 instances.
         * *   local_ssd_pro: local Non-Volatile Memory Express (NVMe) SSDs, which are attached to i2, i2g, i1, ga1, or gn5 instances.
         */
        public Builder localStorageCategory(String localStorageCategory) {
            this.putQueryParameter("LocalStorageCategory", localStorageCategory);
            this.localStorageCategory = localStorageCategory;
            return this;
        }

        /**
         * The maximum number of entries per page. Maximum value: 1600.
         * <p>
         * 
         * Default value: 1600.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The maximum number of vCPUs. The value must be a positive integer.
         * <p>
         * 
         * >  If an instance type has more vCPUs than the specified value, information about the instance type is not queried.
         */
        public Builder maximumCpuCoreCount(Integer maximumCpuCoreCount) {
            this.putQueryParameter("MaximumCpuCoreCount", maximumCpuCoreCount);
            this.maximumCpuCoreCount = maximumCpuCoreCount;
            return this;
        }

        /**
         * The maximum clock speed.
         * <p>
         * 
         * >  If an instance type uses processors that have a higher clock speed than the specified value, information about the instance type is not queried.
         */
        public Builder maximumCpuSpeedFrequency(Float maximumCpuSpeedFrequency) {
            this.putQueryParameter("MaximumCpuSpeedFrequency", maximumCpuSpeedFrequency);
            this.maximumCpuSpeedFrequency = maximumCpuSpeedFrequency;
            return this;
        }

        /**
         * The maximum turbo frequency.
         * <p>
         * 
         * >  If an instance type uses processors that deliver a higher turbo frequency than the specified value, information about the instance type is not queried.
         */
        public Builder maximumCpuTurboFrequency(Float maximumCpuTurboFrequency) {
            this.putQueryParameter("MaximumCpuTurboFrequency", maximumCpuTurboFrequency);
            this.maximumCpuTurboFrequency = maximumCpuTurboFrequency;
            return this;
        }

        /**
         * The maximum number of GPUs. The value must be a positive integer.
         * <p>
         * 
         * >  If an instance type provides more GPUs than the specified value, information about the instance type is not queried.
         */
        public Builder maximumGPUAmount(Integer maximumGPUAmount) {
            this.putQueryParameter("MaximumGPUAmount", maximumGPUAmount);
            this.maximumGPUAmount = maximumGPUAmount;
            return this;
        }

        /**
         * The maximum memory size. Unit: GiB.
         * <p>
         * 
         * >  If the memory size of an instance type is larger than the specified value, information about the instance type is not queried.
         */
        public Builder maximumMemorySize(Float maximumMemorySize) {
            this.putQueryParameter("MaximumMemorySize", maximumMemorySize);
            this.maximumMemorySize = maximumMemorySize;
            return this;
        }

        /**
         * The minimum baseline CPU performance (overall baseline performance of all vCPUs) of a t5 or t6 burstable instance.
         * <p>
         * 
         * >  If a t5 or t6 instance type provides baseline CPU performance lower than the specified value, information about the instance type is not queried.
         */
        public Builder minimumBaselineCredit(Integer minimumBaselineCredit) {
            this.putQueryParameter("MinimumBaselineCredit", minimumBaselineCredit);
            this.minimumBaselineCredit = minimumBaselineCredit;
            return this;
        }

        /**
         * The minimum number of vCPUs. The value must be a positive integer.
         * <p>
         * 
         * >  If an instance type has fewer vCPUs than the specified value, information about the instance type is not queried.
         */
        public Builder minimumCpuCoreCount(Integer minimumCpuCoreCount) {
            this.putQueryParameter("MinimumCpuCoreCount", minimumCpuCoreCount);
            this.minimumCpuCoreCount = minimumCpuCoreCount;
            return this;
        }

        /**
         * The minimum clock speed.
         * <p>
         * 
         * >  If an instance type uses processors that have a lower clock speed than the specified value, information about the instance type is not queried.
         */
        public Builder minimumCpuSpeedFrequency(Float minimumCpuSpeedFrequency) {
            this.putQueryParameter("MinimumCpuSpeedFrequency", minimumCpuSpeedFrequency);
            this.minimumCpuSpeedFrequency = minimumCpuSpeedFrequency;
            return this;
        }

        /**
         * The minimum turbo frequency.
         * <p>
         * 
         * >  If an instance type uses processors that deliver a lower turbo frequency than the specified value, information about the instance type is not queried.
         */
        public Builder minimumCpuTurboFrequency(Float minimumCpuTurboFrequency) {
            this.putQueryParameter("MinimumCpuTurboFrequency", minimumCpuTurboFrequency);
            this.minimumCpuTurboFrequency = minimumCpuTurboFrequency;
            return this;
        }

        /**
         * The minimum number of cloud disks per instance.
         * <p>
         * 
         * >  If an instance type supports fewer cloud disks than the specified value, information about the instance type is not queried.
         */
        public Builder minimumDiskQuantity(Integer minimumDiskQuantity) {
            this.putQueryParameter("MinimumDiskQuantity", minimumDiskQuantity);
            this.minimumDiskQuantity = minimumDiskQuantity;
            return this;
        }

        /**
         * The minimum number of IPv6 addresses per ENI.
         * <p>
         * 
         * >  If an instance type supports fewer IPv6 addresses per ENI than the specified value, information about the instance type is not queried.
         */
        public Builder minimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
            this.putQueryParameter("MinimumEniIpv6AddressQuantity", minimumEniIpv6AddressQuantity);
            this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            return this;
        }

        /**
         * The minimum number of IPv4 addresses per ENI.
         * <p>
         * 
         * >  If an instance type supports fewer IPv4 addresses per ENI than the specified value, information about the instance type is not queried.
         */
        public Builder minimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
            this.putQueryParameter("MinimumEniPrivateIpAddressQuantity", minimumEniPrivateIpAddressQuantity);
            this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
            return this;
        }

        /**
         * The minimum number of elastic network interfaces (ENIs) per instance.
         * <p>
         * 
         * >  If an instance type supports fewer ENIs than the specified value, information about the instance type is not queried.
         */
        public Builder minimumEniQuantity(Integer minimumEniQuantity) {
            this.putQueryParameter("MinimumEniQuantity", minimumEniQuantity);
            this.minimumEniQuantity = minimumEniQuantity;
            return this;
        }

        /**
         * The minimum number of ERIs per instance.
         * <p>
         * 
         * >  If an instance type supports fewer ERIs than the specified value, information about the instance type is not queried.
         */
        public Builder minimumEriQuantity(Integer minimumEriQuantity) {
            this.putQueryParameter("MinimumEriQuantity", minimumEriQuantity);
            this.minimumEriQuantity = minimumEriQuantity;
            return this;
        }

        /**
         * The minimum number of GPUs. The value must be a positive integer.
         * <p>
         * 
         * >  If an instance type provides fewer GPUs than the specified value, information about the instance type is not queried.
         */
        public Builder minimumGPUAmount(Integer minimumGPUAmount) {
            this.putQueryParameter("MinimumGPUAmount", minimumGPUAmount);
            this.minimumGPUAmount = minimumGPUAmount;
            return this;
        }

        /**
         * The minimum initial CPU credits of a t5 or t6 burstable instance.
         * <p>
         * 
         * >  If a t5 or t6 instance type provides less initial vCPU credits than the specified value, information about the instance type is not queried.
         */
        public Builder minimumInitialCredit(Integer minimumInitialCredit) {
            this.putQueryParameter("MinimumInitialCredit", minimumInitialCredit);
            this.minimumInitialCredit = minimumInitialCredit;
            return this;
        }

        /**
         * The minimum inbound internal bandwidth. Unit: Kbit/s.
         * <p>
         * 
         * >  If an instance type provides an inbound internal bandwidth that is lower than the specified value, information about the instance type is not queried.
         */
        public Builder minimumInstanceBandwidthRx(Integer minimumInstanceBandwidthRx) {
            this.putQueryParameter("MinimumInstanceBandwidthRx", minimumInstanceBandwidthRx);
            this.minimumInstanceBandwidthRx = minimumInstanceBandwidthRx;
            return this;
        }

        /**
         * The minimum outbound internal bandwidth. Unit: Kbit/s.
         * <p>
         * 
         * >  If an instance type provides an outbound internal bandwidth that is lower than the specified value, information about the instance type is not queried.
         */
        public Builder minimumInstanceBandwidthTx(Integer minimumInstanceBandwidthTx) {
            this.putQueryParameter("MinimumInstanceBandwidthTx", minimumInstanceBandwidthTx);
            this.minimumInstanceBandwidthTx = minimumInstanceBandwidthTx;
            return this;
        }

        /**
         * The minimum inbound packet forwarding rate over the internal network. Unit: pps.
         * <p>
         * 
         * >  If an instance type provides an inbound packet forwarding rate over the internal network that is lower than the specified value, information about the instance type is not queried.
         */
        public Builder minimumInstancePpsRx(Long minimumInstancePpsRx) {
            this.putQueryParameter("MinimumInstancePpsRx", minimumInstancePpsRx);
            this.minimumInstancePpsRx = minimumInstancePpsRx;
            return this;
        }

        /**
         * The minimum outbound packet forwarding rate over the internal network. Unit: pps.
         * <p>
         * 
         * >  If an instance type provides an outbound packet forwarding rate over the internal network that is lower than the specified value, information about the instance type is not queried.
         */
        public Builder minimumInstancePpsTx(Long minimumInstancePpsTx) {
            this.putQueryParameter("MinimumInstancePpsTx", minimumInstancePpsTx);
            this.minimumInstancePpsTx = minimumInstancePpsTx;
            return this;
        }

        /**
         * The minimum number of local disks per instance.
         * <p>
         * 
         * >  If an instance type supports fewer local disks than the specified value, information about the instance type is not queried.
         */
        public Builder minimumLocalStorageAmount(Integer minimumLocalStorageAmount) {
            this.putQueryParameter("MinimumLocalStorageAmount", minimumLocalStorageAmount);
            this.minimumLocalStorageAmount = minimumLocalStorageAmount;
            return this;
        }

        /**
         * The capacity of each local disk attached per instance. Unit: GiB.
         */
        public Builder minimumLocalStorageCapacity(Long minimumLocalStorageCapacity) {
            this.putQueryParameter("MinimumLocalStorageCapacity", minimumLocalStorageCapacity);
            this.minimumLocalStorageCapacity = minimumLocalStorageCapacity;
            return this;
        }

        /**
         * The minimum memory size. Unit: GiB.
         * <p>
         * 
         * >  If the memory size of an instance type is smaller than the specified value, information about the instance type is not queried.
         */
        public Builder minimumMemorySize(Float minimumMemorySize) {
            this.putQueryParameter("MinimumMemorySize", minimumMemorySize);
            this.minimumMemorySize = minimumMemorySize;
            return this;
        }

        /**
         * The minimum default number of queues per primary network interface controller (NIC).
         * <p>
         * 
         * >  If an instance type supports fewer queues per primary NIC than the specified value, information about the instance type is not queried.
         */
        public Builder minimumPrimaryEniQueueNumber(Integer minimumPrimaryEniQueueNumber) {
            this.putQueryParameter("MinimumPrimaryEniQueueNumber", minimumPrimaryEniQueueNumber);
            this.minimumPrimaryEniQueueNumber = minimumPrimaryEniQueueNumber;
            return this;
        }

        /**
         * The minimum number of queue pair (QP) queues per elastic RDMA interface (ERI).
         * <p>
         * 
         * >  If an instance type supports fewer QP queues per ERI than the specified value, information about the instance type is not queried.
         */
        public Builder minimumQueuePairNumber(Integer minimumQueuePairNumber) {
            this.putQueryParameter("MinimumQueuePairNumber", minimumQueuePairNumber);
            this.minimumQueuePairNumber = minimumQueuePairNumber;
            return this;
        }

        /**
         * The minimum default number of queues per secondary NIC.
         * <p>
         * 
         * >  If an instance type supports fewer queues per secondary NIC than the specified value, information about the instance type is not queried.
         */
        public Builder minimumSecondaryEniQueueNumber(Integer minimumSecondaryEniQueueNumber) {
            this.putQueryParameter("MinimumSecondaryEniQueueNumber", minimumSecondaryEniQueueNumber);
            this.minimumSecondaryEniQueueNumber = minimumSecondaryEniQueueNumber;
            return this;
        }

        /**
         * The query token. Set the value to the NextToken value returned in the previous call to the DescribeInstanceTypes operation. You do not need to specify this parameter for the first request.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Specifies whether cloud disks can be attached by using the NVMe protocol. Valid values:
         * <p>
         * 
         * *   required: Cloud disks can be attached by using the NVMe protocol.
         * *   unsupported: Cloud disks cannot be attached by using the NVMe protocol.
         */
        public Builder nvmeSupport(String nvmeSupport) {
            this.putQueryParameter("NvmeSupport", nvmeSupport);
            this.nvmeSupport = nvmeSupport;
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
         * The CPU model.
         * <p>
         * 
         * >  Fuzzy match is supported. For example, if an instance type uses Intel Xeon (Ice Lake) Platinum 8369B processors and you set this parameter to Intel, information about the instance type is queried.
         */
        public Builder physicalProcessorModel(String physicalProcessorModel) {
            this.putQueryParameter("PhysicalProcessorModel", physicalProcessorModel);
            this.physicalProcessorModel = physicalProcessorModel;
            return this;
        }

        /**
         * The CPU models of instance types. Valid values of N: 1 to 10.
         */
        public Builder physicalProcessorModels(java.util.List < String > physicalProcessorModels) {
            this.putQueryParameter("PhysicalProcessorModels", physicalProcessorModels);
            this.physicalProcessorModels = physicalProcessorModels;
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

        @Override
        public DescribeInstanceTypesRequest build() {
            return new DescribeInstanceTypesRequest(this);
        } 

    } 

}
