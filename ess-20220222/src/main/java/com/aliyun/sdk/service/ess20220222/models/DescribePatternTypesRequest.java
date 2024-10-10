// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePatternTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribePatternTypesRequest</p>
 */
public class DescribePatternTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private java.util.List < String > architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstablePerformance")
    private String burstablePerformance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private Long channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cores")
    private Integer cores;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoresList")
    private java.util.List < Integer > coresList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuArchitectures")
    private java.util.List < String > cpuArchitectures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludedInstanceType")
    private java.util.List < String > excludedInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuSpecs")
    private java.util.List < String > gpuSpecs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceCategories")
    private java.util.List < String > instanceCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamilies")
    private java.util.List < String > instanceTypeFamilies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPrice")
    private Float maxPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumCpuCoreCount")
    private Integer maximumCpuCoreCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumGpuAmount")
    private Integer maximumGpuAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumMemorySize")
    private Float maximumMemorySize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryList")
    private java.util.List < Float > memoryList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumBaselineCredit")
    private Integer minimumBaselineCredit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumCpuCoreCount")
    private Integer minimumCpuCoreCount;

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
    @com.aliyun.core.annotation.NameInMap("MinimumGpuAmount")
    private Integer minimumGpuAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumInitialCredit")
    private Integer minimumInitialCredit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinimumMemorySize")
    private Float minimumMemorySize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicalProcessorModels")
    private java.util.List < String > physicalProcessorModels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private java.util.List < String > vSwitchId;

    private DescribePatternTypesRequest(Builder builder) {
        super(builder);
        this.architecture = builder.architecture;
        this.burstablePerformance = builder.burstablePerformance;
        this.channelId = builder.channelId;
        this.cores = builder.cores;
        this.coresList = builder.coresList;
        this.cpuArchitectures = builder.cpuArchitectures;
        this.excludedInstanceType = builder.excludedInstanceType;
        this.gpuSpecs = builder.gpuSpecs;
        this.instanceCategories = builder.instanceCategories;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceTypeFamilies = builder.instanceTypeFamilies;
        this.maxPrice = builder.maxPrice;
        this.maximumCpuCoreCount = builder.maximumCpuCoreCount;
        this.maximumGpuAmount = builder.maximumGpuAmount;
        this.maximumMemorySize = builder.maximumMemorySize;
        this.memory = builder.memory;
        this.memoryList = builder.memoryList;
        this.minimumBaselineCredit = builder.minimumBaselineCredit;
        this.minimumCpuCoreCount = builder.minimumCpuCoreCount;
        this.minimumEniIpv6AddressQuantity = builder.minimumEniIpv6AddressQuantity;
        this.minimumEniPrivateIpAddressQuantity = builder.minimumEniPrivateIpAddressQuantity;
        this.minimumEniQuantity = builder.minimumEniQuantity;
        this.minimumGpuAmount = builder.minimumGpuAmount;
        this.minimumInitialCredit = builder.minimumInitialCredit;
        this.minimumMemorySize = builder.minimumMemorySize;
        this.physicalProcessorModels = builder.physicalProcessorModels;
        this.regionId = builder.regionId;
        this.spotStrategy = builder.spotStrategy;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePatternTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architecture
     */
    public java.util.List < String > getArchitecture() {
        return this.architecture;
    }

    /**
     * @return burstablePerformance
     */
    public String getBurstablePerformance() {
        return this.burstablePerformance;
    }

    /**
     * @return channelId
     */
    public Long getChannelId() {
        return this.channelId;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return coresList
     */
    public java.util.List < Integer > getCoresList() {
        return this.coresList;
    }

    /**
     * @return cpuArchitectures
     */
    public java.util.List < String > getCpuArchitectures() {
        return this.cpuArchitectures;
    }

    /**
     * @return excludedInstanceType
     */
    public java.util.List < String > getExcludedInstanceType() {
        return this.excludedInstanceType;
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
     * @return maxPrice
     */
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return maximumCpuCoreCount
     */
    public Integer getMaximumCpuCoreCount() {
        return this.maximumCpuCoreCount;
    }

    /**
     * @return maximumGpuAmount
     */
    public Integer getMaximumGpuAmount() {
        return this.maximumGpuAmount;
    }

    /**
     * @return maximumMemorySize
     */
    public Float getMaximumMemorySize() {
        return this.maximumMemorySize;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return memoryList
     */
    public java.util.List < Float > getMemoryList() {
        return this.memoryList;
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
     * @return minimumGpuAmount
     */
    public Integer getMinimumGpuAmount() {
        return this.minimumGpuAmount;
    }

    /**
     * @return minimumInitialCredit
     */
    public Integer getMinimumInitialCredit() {
        return this.minimumInitialCredit;
    }

    /**
     * @return minimumMemorySize
     */
    public Float getMinimumMemorySize() {
        return this.minimumMemorySize;
    }

    /**
     * @return physicalProcessorModels
     */
    public java.util.List < String > getPhysicalProcessorModels() {
        return this.physicalProcessorModels;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return vSwitchId
     */
    public java.util.List < String > getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribePatternTypesRequest, Builder> {
        private java.util.List < String > architecture; 
        private String burstablePerformance; 
        private Long channelId; 
        private Integer cores; 
        private java.util.List < Integer > coresList; 
        private java.util.List < String > cpuArchitectures; 
        private java.util.List < String > excludedInstanceType; 
        private java.util.List < String > gpuSpecs; 
        private java.util.List < String > instanceCategories; 
        private String instanceFamilyLevel; 
        private java.util.List < String > instanceTypeFamilies; 
        private Float maxPrice; 
        private Integer maximumCpuCoreCount; 
        private Integer maximumGpuAmount; 
        private Float maximumMemorySize; 
        private Float memory; 
        private java.util.List < Float > memoryList; 
        private Integer minimumBaselineCredit; 
        private Integer minimumCpuCoreCount; 
        private Integer minimumEniIpv6AddressQuantity; 
        private Integer minimumEniPrivateIpAddressQuantity; 
        private Integer minimumEniQuantity; 
        private Integer minimumGpuAmount; 
        private Integer minimumInitialCredit; 
        private Float minimumMemorySize; 
        private java.util.List < String > physicalProcessorModels; 
        private String regionId; 
        private String spotStrategy; 
        private java.util.List < String > vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePatternTypesRequest request) {
            super(request);
            this.architecture = request.architecture;
            this.burstablePerformance = request.burstablePerformance;
            this.channelId = request.channelId;
            this.cores = request.cores;
            this.coresList = request.coresList;
            this.cpuArchitectures = request.cpuArchitectures;
            this.excludedInstanceType = request.excludedInstanceType;
            this.gpuSpecs = request.gpuSpecs;
            this.instanceCategories = request.instanceCategories;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.instanceTypeFamilies = request.instanceTypeFamilies;
            this.maxPrice = request.maxPrice;
            this.maximumCpuCoreCount = request.maximumCpuCoreCount;
            this.maximumGpuAmount = request.maximumGpuAmount;
            this.maximumMemorySize = request.maximumMemorySize;
            this.memory = request.memory;
            this.memoryList = request.memoryList;
            this.minimumBaselineCredit = request.minimumBaselineCredit;
            this.minimumCpuCoreCount = request.minimumCpuCoreCount;
            this.minimumEniIpv6AddressQuantity = request.minimumEniIpv6AddressQuantity;
            this.minimumEniPrivateIpAddressQuantity = request.minimumEniPrivateIpAddressQuantity;
            this.minimumEniQuantity = request.minimumEniQuantity;
            this.minimumGpuAmount = request.minimumGpuAmount;
            this.minimumInitialCredit = request.minimumInitialCredit;
            this.minimumMemorySize = request.minimumMemorySize;
            this.physicalProcessorModels = request.physicalProcessorModels;
            this.regionId = request.regionId;
            this.spotStrategy = request.spotStrategy;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The architectures of instance types. Valid values:</p>
         * <ul>
         * <li>X86: x86</li>
         * <li>Heterogeneous: heterogeneous computing, such as GPU-accelerated or FPGA-accelerated</li>
         * <li>BareMetal: ECS Bare Metal Instance</li>
         * <li>Arm: Arm</li>
         * <li>SuperComputeCluster: Super Computing Cluster</li>
         * </ul>
         * <p>By default, all values are selected.</p>
         */
        public Builder architecture(java.util.List < String > architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>Specifies whether to include burstable instance types. Valid values:</p>
         * <ul>
         * <li>Exclude: does not include burstable instance types.</li>
         * <li>Include: includes burstable instance types.</li>
         * <li>Required: includes only burstable instance types.</li>
         * </ul>
         * <p>Default value: Include.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        public Builder burstablePerformance(String burstablePerformance) {
            this.putQueryParameter("BurstablePerformance", burstablePerformance);
            this.burstablePerformance = burstablePerformance;
            return this;
        }

        /**
         * <p>The channel ID. This parameter is not for public use.</p>
         * 
         * <strong>example:</strong>
         * <p>79425074</p>
         */
        public Builder channelId(Long channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The number of vCPUs that you want to assign to the instance type.</p>
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
         * <p>The number of vCPUs that you want to assign to the instance type. You can specify multiple vCPUs.</p>
         */
        public Builder coresList(java.util.List < Integer > coresList) {
            this.putQueryParameter("CoresList", coresList);
            this.coresList = coresList;
            return this;
        }

        /**
         * <p>The CPU architectures of the instance types. Valid values:</p>
         * <blockquote>
         * <p> You can specify 1 to 2 CPU architectures.</p>
         * </blockquote>
         * <ul>
         * <li>x86</li>
         * <li>Arm</li>
         * </ul>
         */
        public Builder cpuArchitectures(java.util.List < String > cpuArchitectures) {
            this.putQueryParameter("CpuArchitectures", cpuArchitectures);
            this.cpuArchitectures = cpuArchitectures;
            return this;
        }

        /**
         * ExcludedInstanceType.
         */
        public Builder excludedInstanceType(java.util.List < String > excludedInstanceType) {
            this.putQueryParameter("ExcludedInstanceType", excludedInstanceType);
            this.excludedInstanceType = excludedInstanceType;
            return this;
        }

        /**
         * <p>The GPU models.</p>
         */
        public Builder gpuSpecs(java.util.List < String > gpuSpecs) {
            this.putQueryParameter("GpuSpecs", gpuSpecs);
            this.gpuSpecs = gpuSpecs;
            return this;
        }

        /**
         * <p>The categories of the instance types. Valid values:</p>
         * <ul>
         * <li>General-purpose</li>
         * <li>Compute-optimized</li>
         * <li>Memory-optimized</li>
         * <li>Big data</li>
         * <li>Local SSDs</li>
         * <li>High Clock Speed</li>
         * <li>Enhanced</li>
         * <li>Shared</li>
         * <li>Compute-optimized with GPU</li>
         * <li>Visual Compute-optimized</li>
         * <li>Heterogeneous Service</li>
         * <li>Compute-optimized with FPGA</li>
         * <li>Compute-optimized with NPU</li>
         * <li>ECS Bare Metal</li>
         * <li>Super Computing Cluster</li>
         * <li>High Performance Compute</li>
         * </ul>
         */
        public Builder instanceCategories(java.util.List < String > instanceCategories) {
            this.putQueryParameter("InstanceCategories", instanceCategories);
            this.instanceCategories = instanceCategories;
            return this;
        }

        /**
         * <p>The level of the instance family. Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry level</li>
         * <li>EnterpriseLevel: enterprise level</li>
         * <li>CreditEntryLevel: credit-based entry level For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instance families</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * <p>The instance families that you want to query. You can query 1 to 10 instance families in each call.</p>
         */
        public Builder instanceTypeFamilies(java.util.List < String > instanceTypeFamilies) {
            this.putQueryParameter("InstanceTypeFamilies", instanceTypeFamilies);
            this.instanceTypeFamilies = instanceTypeFamilies;
            return this;
        }

        /**
         * <p>The maximum hourly price for pay-as-you-go or preemptible instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxPrice(Float maxPrice) {
            this.putQueryParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * <p>The maximum number of vCPUs per instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder maximumCpuCoreCount(Integer maximumCpuCoreCount) {
            this.putQueryParameter("MaximumCpuCoreCount", maximumCpuCoreCount);
            this.maximumCpuCoreCount = maximumCpuCoreCount;
            return this;
        }

        /**
         * <p>The maximum number of GPUs per instance. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maximumGpuAmount(Integer maximumGpuAmount) {
            this.putQueryParameter("MaximumGpuAmount", maximumGpuAmount);
            this.maximumGpuAmount = maximumGpuAmount;
            return this;
        }

        /**
         * <p>The maximum memory size per instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder maximumMemorySize(Float maximumMemorySize) {
            this.putQueryParameter("MaximumMemorySize", maximumMemorySize);
            this.maximumMemorySize = maximumMemorySize;
            return this;
        }

        /**
         * <p>The memory size that you want to assign to the instance type. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The memory size that you want to assign to the instance type. Unit: GiB. You can specify multiple memory sizes.</p>
         */
        public Builder memoryList(java.util.List < Float > memoryList) {
            this.putQueryParameter("MemoryList", memoryList);
            this.memoryList = memoryList;
            return this;
        }

        /**
         * <p>The baseline vCPU computing performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder minimumBaselineCredit(Integer minimumBaselineCredit) {
            this.putQueryParameter("MinimumBaselineCredit", minimumBaselineCredit);
            this.minimumBaselineCredit = minimumBaselineCredit;
            return this;
        }

        /**
         * <p>The minimum number of vCPUs per instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minimumCpuCoreCount(Integer minimumCpuCoreCount) {
            this.putQueryParameter("MinimumCpuCoreCount", minimumCpuCoreCount);
            this.minimumCpuCoreCount = minimumCpuCoreCount;
            return this;
        }

        /**
         * <p>The minimum number of IPv6 addresses per ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
            this.putQueryParameter("MinimumEniIpv6AddressQuantity", minimumEniIpv6AddressQuantity);
            this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            return this;
        }

        /**
         * <p>The minimum number of IPv4 addresses per ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
            this.putQueryParameter("MinimumEniPrivateIpAddressQuantity", minimumEniPrivateIpAddressQuantity);
            this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
            return this;
        }

        /**
         * <p>The minimum number of elastic network interfaces (ENIs) per instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minimumEniQuantity(Integer minimumEniQuantity) {
            this.putQueryParameter("MinimumEniQuantity", minimumEniQuantity);
            this.minimumEniQuantity = minimumEniQuantity;
            return this;
        }

        /**
         * <p>The minimum number of GPUs per instance. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minimumGpuAmount(Integer minimumGpuAmount) {
            this.putQueryParameter("MinimumGpuAmount", minimumGpuAmount);
            this.minimumGpuAmount = minimumGpuAmount;
            return this;
        }

        /**
         * <p>The initial vCPU credits per t5 or t6 burstable instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder minimumInitialCredit(Integer minimumInitialCredit) {
            this.putQueryParameter("MinimumInitialCredit", minimumInitialCredit);
            this.minimumInitialCredit = minimumInitialCredit;
            return this;
        }

        /**
         * <p>The minimum memory size per instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder minimumMemorySize(Float minimumMemorySize) {
            this.putQueryParameter("MinimumMemorySize", minimumMemorySize);
            this.minimumMemorySize = minimumMemorySize;
            return this;
        }

        /**
         * <p>The processor models of the instance types. You can specify 1 to 10 processor models.</p>
         */
        public Builder physicalProcessorModels(java.util.List < String > physicalProcessorModels) {
            this.putQueryParameter("PhysicalProcessorModels", physicalProcessorModels);
            this.physicalProcessorModels = physicalProcessorModels;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The preemption policy that you want to apply to pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instances are created as regular pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The instances are created as preemptible instances that have a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instances are created as preemptible instances for which the market price at the time of purchase is automatically used as the bidding price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The IDs of the vSwitches.</p>
         */
        public Builder vSwitchId(java.util.List < String > vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public DescribePatternTypesRequest build() {
            return new DescribePatternTypesRequest(this);
        } 

    } 

}
