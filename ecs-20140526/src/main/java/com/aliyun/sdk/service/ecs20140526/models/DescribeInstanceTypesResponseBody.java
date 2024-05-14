// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypesResponseBody</p>
 */
public class DescribeInstanceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTypesResponseBody(Builder builder) {
        this.instanceTypes = builder.instanceTypes;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTypes
     */
    public InstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceTypes instanceTypes; 
        private String nextToken; 
        private String requestId; 

        /**
         * Details about the instance types.
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The query token returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTypesResponseBody build() {
            return new DescribeInstanceTypesResponseBody(this);
        } 

    } 

    public static class NetworkCardInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkCardIndex")
        private Integer networkCardIndex;

        private NetworkCardInfo(Builder builder) {
            this.networkCardIndex = builder.networkCardIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkCardInfo create() {
            return builder().build();
        }

        /**
         * @return networkCardIndex
         */
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        public static final class Builder {
            private Integer networkCardIndex; 

            /**
             * The index of the network card.
             */
            public Builder networkCardIndex(Integer networkCardIndex) {
                this.networkCardIndex = networkCardIndex;
                return this;
            }

            public NetworkCardInfo build() {
                return new NetworkCardInfo(this);
            } 

        } 

    }
    public static class NetworkCards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkCardInfo")
        private java.util.List < NetworkCardInfo> networkCardInfo;

        private NetworkCards(Builder builder) {
            this.networkCardInfo = builder.networkCardInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkCards create() {
            return builder().build();
        }

        /**
         * @return networkCardInfo
         */
        public java.util.List < NetworkCardInfo> getNetworkCardInfo() {
            return this.networkCardInfo;
        }

        public static final class Builder {
            private java.util.List < NetworkCardInfo> networkCardInfo; 

            /**
             * NetworkCardInfo.
             */
            public Builder networkCardInfo(java.util.List < NetworkCardInfo> networkCardInfo) {
                this.networkCardInfo = networkCardInfo;
                return this;
            }

            public NetworkCards build() {
                return new NetworkCards(this);
            } 

        } 

    }
    public static class SupportedBootModes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedBootMode")
        private java.util.List < String > supportedBootMode;

        private SupportedBootModes(Builder builder) {
            this.supportedBootMode = builder.supportedBootMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedBootModes create() {
            return builder().build();
        }

        /**
         * @return supportedBootMode
         */
        public java.util.List < String > getSupportedBootMode() {
            return this.supportedBootMode;
        }

        public static final class Builder {
            private java.util.List < String > supportedBootMode; 

            /**
             * SupportedBootMode.
             */
            public Builder supportedBootMode(java.util.List < String > supportedBootMode) {
                this.supportedBootMode = supportedBootMode;
                return this;
            }

            public SupportedBootModes build() {
                return new SupportedBootModes(this);
            } 

        } 

    }
    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineCredit")
        private Integer baselineCredit;

        @com.aliyun.core.annotation.NameInMap("CpuArchitecture")
        private String cpuArchitecture;

        @com.aliyun.core.annotation.NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("CpuSpeedFrequency")
        private Float cpuSpeedFrequency;

        @com.aliyun.core.annotation.NameInMap("CpuTurboFrequency")
        private Float cpuTurboFrequency;

        @com.aliyun.core.annotation.NameInMap("DiskQuantity")
        private Integer diskQuantity;

        @com.aliyun.core.annotation.NameInMap("EniIpv6AddressQuantity")
        private Integer eniIpv6AddressQuantity;

        @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddressQuantity")
        private Integer eniPrivateIpAddressQuantity;

        @com.aliyun.core.annotation.NameInMap("EniQuantity")
        private Integer eniQuantity;

        @com.aliyun.core.annotation.NameInMap("EniTotalQuantity")
        private Integer eniTotalQuantity;

        @com.aliyun.core.annotation.NameInMap("EniTrunkSupported")
        private Boolean eniTrunkSupported;

        @com.aliyun.core.annotation.NameInMap("EriQuantity")
        private Integer eriQuantity;

        @com.aliyun.core.annotation.NameInMap("GPUAmount")
        private Integer GPUAmount;

        @com.aliyun.core.annotation.NameInMap("GPUMemorySize")
        private Float GPUMemorySize;

        @com.aliyun.core.annotation.NameInMap("GPUSpec")
        private String GPUSpec;

        @com.aliyun.core.annotation.NameInMap("InitialCredit")
        private Integer initialCredit;

        @com.aliyun.core.annotation.NameInMap("InstanceBandwidthRx")
        private Integer instanceBandwidthRx;

        @com.aliyun.core.annotation.NameInMap("InstanceBandwidthTx")
        private Integer instanceBandwidthTx;

        @com.aliyun.core.annotation.NameInMap("InstanceCategory")
        private String instanceCategory;

        @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @com.aliyun.core.annotation.NameInMap("InstancePpsRx")
        private Long instancePpsRx;

        @com.aliyun.core.annotation.NameInMap("InstancePpsTx")
        private Long instancePpsTx;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @com.aliyun.core.annotation.NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @com.aliyun.core.annotation.NameInMap("MaximumQueueNumberPerEni")
        private Integer maximumQueueNumberPerEni;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Float memorySize;

        @com.aliyun.core.annotation.NameInMap("NetworkCardQuantity")
        private Integer networkCardQuantity;

        @com.aliyun.core.annotation.NameInMap("NetworkCards")
        private NetworkCards networkCards;

        @com.aliyun.core.annotation.NameInMap("NetworkEncryptionSupport")
        private Boolean networkEncryptionSupport;

        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        @com.aliyun.core.annotation.NameInMap("PhysicalProcessorModel")
        private String physicalProcessorModel;

        @com.aliyun.core.annotation.NameInMap("PrimaryEniQueueNumber")
        private Integer primaryEniQueueNumber;

        @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
        private Integer queuePairNumber;

        @com.aliyun.core.annotation.NameInMap("SecondaryEniQueueNumber")
        private Integer secondaryEniQueueNumber;

        @com.aliyun.core.annotation.NameInMap("SupportedBootModes")
        private SupportedBootModes supportedBootModes;

        @com.aliyun.core.annotation.NameInMap("TotalEniQueueQuantity")
        private Integer totalEniQueueQuantity;

        private InstanceType(Builder builder) {
            this.baselineCredit = builder.baselineCredit;
            this.cpuArchitecture = builder.cpuArchitecture;
            this.cpuCoreCount = builder.cpuCoreCount;
            this.cpuSpeedFrequency = builder.cpuSpeedFrequency;
            this.cpuTurboFrequency = builder.cpuTurboFrequency;
            this.diskQuantity = builder.diskQuantity;
            this.eniIpv6AddressQuantity = builder.eniIpv6AddressQuantity;
            this.eniPrivateIpAddressQuantity = builder.eniPrivateIpAddressQuantity;
            this.eniQuantity = builder.eniQuantity;
            this.eniTotalQuantity = builder.eniTotalQuantity;
            this.eniTrunkSupported = builder.eniTrunkSupported;
            this.eriQuantity = builder.eriQuantity;
            this.GPUAmount = builder.GPUAmount;
            this.GPUMemorySize = builder.GPUMemorySize;
            this.GPUSpec = builder.GPUSpec;
            this.initialCredit = builder.initialCredit;
            this.instanceBandwidthRx = builder.instanceBandwidthRx;
            this.instanceBandwidthTx = builder.instanceBandwidthTx;
            this.instanceCategory = builder.instanceCategory;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instancePpsRx = builder.instancePpsRx;
            this.instancePpsTx = builder.instancePpsTx;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.instanceTypeId = builder.instanceTypeId;
            this.localStorageAmount = builder.localStorageAmount;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.localStorageCategory = builder.localStorageCategory;
            this.maximumQueueNumberPerEni = builder.maximumQueueNumberPerEni;
            this.memorySize = builder.memorySize;
            this.networkCardQuantity = builder.networkCardQuantity;
            this.networkCards = builder.networkCards;
            this.networkEncryptionSupport = builder.networkEncryptionSupport;
            this.nvmeSupport = builder.nvmeSupport;
            this.physicalProcessorModel = builder.physicalProcessorModel;
            this.primaryEniQueueNumber = builder.primaryEniQueueNumber;
            this.queuePairNumber = builder.queuePairNumber;
            this.secondaryEniQueueNumber = builder.secondaryEniQueueNumber;
            this.supportedBootModes = builder.supportedBootModes;
            this.totalEniQueueQuantity = builder.totalEniQueueQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return baselineCredit
         */
        public Integer getBaselineCredit() {
            return this.baselineCredit;
        }

        /**
         * @return cpuArchitecture
         */
        public String getCpuArchitecture() {
            return this.cpuArchitecture;
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return cpuSpeedFrequency
         */
        public Float getCpuSpeedFrequency() {
            return this.cpuSpeedFrequency;
        }

        /**
         * @return cpuTurboFrequency
         */
        public Float getCpuTurboFrequency() {
            return this.cpuTurboFrequency;
        }

        /**
         * @return diskQuantity
         */
        public Integer getDiskQuantity() {
            return this.diskQuantity;
        }

        /**
         * @return eniIpv6AddressQuantity
         */
        public Integer getEniIpv6AddressQuantity() {
            return this.eniIpv6AddressQuantity;
        }

        /**
         * @return eniPrivateIpAddressQuantity
         */
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        /**
         * @return eniQuantity
         */
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

        /**
         * @return eniTotalQuantity
         */
        public Integer getEniTotalQuantity() {
            return this.eniTotalQuantity;
        }

        /**
         * @return eniTrunkSupported
         */
        public Boolean getEniTrunkSupported() {
            return this.eniTrunkSupported;
        }

        /**
         * @return eriQuantity
         */
        public Integer getEriQuantity() {
            return this.eriQuantity;
        }

        /**
         * @return GPUAmount
         */
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        /**
         * @return GPUMemorySize
         */
        public Float getGPUMemorySize() {
            return this.GPUMemorySize;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return initialCredit
         */
        public Integer getInitialCredit() {
            return this.initialCredit;
        }

        /**
         * @return instanceBandwidthRx
         */
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        /**
         * @return instanceBandwidthTx
         */
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
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
         * @return instancePpsRx
         */
        public Long getInstancePpsRx() {
            return this.instancePpsRx;
        }

        /**
         * @return instancePpsTx
         */
        public Long getInstancePpsTx() {
            return this.instancePpsTx;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return instanceTypeId
         */
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        /**
         * @return localStorageAmount
         */
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        /**
         * @return localStorageCapacity
         */
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        /**
         * @return localStorageCategory
         */
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        /**
         * @return maximumQueueNumberPerEni
         */
        public Integer getMaximumQueueNumberPerEni() {
            return this.maximumQueueNumberPerEni;
        }

        /**
         * @return memorySize
         */
        public Float getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return networkCardQuantity
         */
        public Integer getNetworkCardQuantity() {
            return this.networkCardQuantity;
        }

        /**
         * @return networkCards
         */
        public NetworkCards getNetworkCards() {
            return this.networkCards;
        }

        /**
         * @return networkEncryptionSupport
         */
        public Boolean getNetworkEncryptionSupport() {
            return this.networkEncryptionSupport;
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        /**
         * @return physicalProcessorModel
         */
        public String getPhysicalProcessorModel() {
            return this.physicalProcessorModel;
        }

        /**
         * @return primaryEniQueueNumber
         */
        public Integer getPrimaryEniQueueNumber() {
            return this.primaryEniQueueNumber;
        }

        /**
         * @return queuePairNumber
         */
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        /**
         * @return secondaryEniQueueNumber
         */
        public Integer getSecondaryEniQueueNumber() {
            return this.secondaryEniQueueNumber;
        }

        /**
         * @return supportedBootModes
         */
        public SupportedBootModes getSupportedBootModes() {
            return this.supportedBootModes;
        }

        /**
         * @return totalEniQueueQuantity
         */
        public Integer getTotalEniQueueQuantity() {
            return this.totalEniQueueQuantity;
        }

        public static final class Builder {
            private Integer baselineCredit; 
            private String cpuArchitecture; 
            private Integer cpuCoreCount; 
            private Float cpuSpeedFrequency; 
            private Float cpuTurboFrequency; 
            private Integer diskQuantity; 
            private Integer eniIpv6AddressQuantity; 
            private Integer eniPrivateIpAddressQuantity; 
            private Integer eniQuantity; 
            private Integer eniTotalQuantity; 
            private Boolean eniTrunkSupported; 
            private Integer eriQuantity; 
            private Integer GPUAmount; 
            private Float GPUMemorySize; 
            private String GPUSpec; 
            private Integer initialCredit; 
            private Integer instanceBandwidthRx; 
            private Integer instanceBandwidthTx; 
            private String instanceCategory; 
            private String instanceFamilyLevel; 
            private Long instancePpsRx; 
            private Long instancePpsTx; 
            private String instanceTypeFamily; 
            private String instanceTypeId; 
            private Integer localStorageAmount; 
            private Long localStorageCapacity; 
            private String localStorageCategory; 
            private Integer maximumQueueNumberPerEni; 
            private Float memorySize; 
            private Integer networkCardQuantity; 
            private NetworkCards networkCards; 
            private Boolean networkEncryptionSupport; 
            private String nvmeSupport; 
            private String physicalProcessorModel; 
            private Integer primaryEniQueueNumber; 
            private Integer queuePairNumber; 
            private Integer secondaryEniQueueNumber; 
            private SupportedBootModes supportedBootModes; 
            private Integer totalEniQueueQuantity; 

            /**
             * The baseline vCPU computing performance (overall baseline performance of all vCPUs) per t5 or t6 burstable instance.
             */
            public Builder baselineCredit(Integer baselineCredit) {
                this.baselineCredit = baselineCredit;
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
                this.cpuArchitecture = cpuArchitecture;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * The CPU base frequency. Unit: GHz.
             */
            public Builder cpuSpeedFrequency(Float cpuSpeedFrequency) {
                this.cpuSpeedFrequency = cpuSpeedFrequency;
                return this;
            }

            /**
             * The CPU turbo frequency. Unit: GHz.
             */
            public Builder cpuTurboFrequency(Float cpuTurboFrequency) {
                this.cpuTurboFrequency = cpuTurboFrequency;
                return this;
            }

            /**
             * The maximum number of cloud disks per instance.
             */
            public Builder diskQuantity(Integer diskQuantity) {
                this.diskQuantity = diskQuantity;
                return this;
            }

            /**
             * The maximum number of IPv6 addresses per ENI.
             */
            public Builder eniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
                this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
                return this;
            }

            /**
             * The maximum number of IPv4 addresses per ENI.
             */
            public Builder eniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
                this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
                return this;
            }

            /**
             * The maximum number of ENIs per instance.
             */
            public Builder eniQuantity(Integer eniQuantity) {
                this.eniQuantity = eniQuantity;
                return this;
            }

            /**
             * The maximum number of ENIs, including primary, secondary, and trunk ENIs.
             * <p>
             * 
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder eniTotalQuantity(Integer eniTotalQuantity) {
                this.eniTotalQuantity = eniTotalQuantity;
                return this;
            }

            /**
             * Indicates whether trunk ENIs are supported.
             * <p>
             * 
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder eniTrunkSupported(Boolean eniTrunkSupported) {
                this.eniTrunkSupported = eniTrunkSupported;
                return this;
            }

            /**
             * The number of elastic RDMA interfaces (ERIs).
             * <p>
             * 
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder eriQuantity(Integer eriQuantity) {
                this.eriQuantity = eriQuantity;
                return this;
            }

            /**
             * The number of GPUs.
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * The amount of GPU memory per GPU. Unit: GiB.
             */
            public Builder GPUMemorySize(Float GPUMemorySize) {
                this.GPUMemorySize = GPUMemorySize;
                return this;
            }

            /**
             * The GPU model.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * The initial vCPU credits per t5 or t6 burstable instance.
             */
            public Builder initialCredit(Integer initialCredit) {
                this.initialCredit = initialCredit;
                return this;
            }

            /**
             * The maximum inbound internal bandwidth. Unit: Kbit/s.
             */
            public Builder instanceBandwidthRx(Integer instanceBandwidthRx) {
                this.instanceBandwidthRx = instanceBandwidthRx;
                return this;
            }

            /**
             * The maximum outbound internal bandwidth. Unit: Kbit/s.
             */
            public Builder instanceBandwidthTx(Integer instanceBandwidthTx) {
                this.instanceBandwidthTx = instanceBandwidthTx;
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
             * *   Super Computing Cluster: SCC instance type
             * *   High Performance Compute: high-performance computing instance type
             */
            public Builder instanceCategory(String instanceCategory) {
                this.instanceCategory = instanceCategory;
                return this;
            }

            /**
             * The level of the instance family. Valid values:
             * <p>
             * 
             * *   EntryLevel: entry level (shared).
             * *   EnterpriseLevel: enterprise level.
             * *   CreditEntryLevel: credit-based entry level. For more information, see [Overview](~~59977~~).
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * The inbound packet forwarding rate over the internal network. Unit: pps.
             */
            public Builder instancePpsRx(Long instancePpsRx) {
                this.instancePpsRx = instancePpsRx;
                return this;
            }

            /**
             * The outbound packet forwarding rate over the internal network. Unit: pps.
             */
            public Builder instancePpsTx(Long instancePpsTx) {
                this.instancePpsTx = instancePpsTx;
                return this;
            }

            /**
             * The instance family.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The ID of the instance type.
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * The number of local disks per instance.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * The capacity of each local disk attached per instance. Unit: GiB.
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * The category of local disks. For more information, see [Local disks](~~63138~~). Valid values:
             * <p>
             * 
             * *   local_hdd_pro: local SATA HDDs, which are attached to d1ne or d1 instances.
             * *   local_ssd_pro: local NVMe SSDs, which are attached to i2, i2g, i1, ga1, or gn5 instances.
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * The maximum number of queues per ENI, including primary and secondary ENIs.
             */
            public Builder maximumQueueNumberPerEni(Integer maximumQueueNumberPerEni) {
                this.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
                return this;
            }

            /**
             * The memory size. Unit: GiB.
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * The maximum number of network cards that the instance type supports.
             */
            public Builder networkCardQuantity(Integer networkCardQuantity) {
                this.networkCardQuantity = networkCardQuantity;
                return this;
            }

            /**
             * The information about the network cards.
             */
            public Builder networkCards(NetworkCards networkCards) {
                this.networkCards = networkCards;
                return this;
            }

            /**
             * Indicates whether to allow network traffic transmitted over virtual private clouds (VPCs) to be encrypted. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder networkEncryptionSupport(Boolean networkEncryptionSupport) {
                this.networkEncryptionSupport = networkEncryptionSupport;
                return this;
            }

            /**
             * Indicates whether cloud disks can be attached by using the NVMe protocol. Valid values:
             * <p>
             * 
             * *   required: Cloud disks can be attached by using the NVMe protocol.
             * *   unsupported: Cloud disks cannot be attached by using the NVMe protocol.
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            /**
             * The CPU model.
             */
            public Builder physicalProcessorModel(String physicalProcessorModel) {
                this.physicalProcessorModel = physicalProcessorModel;
                return this;
            }

            /**
             * The default number of queues per primary ENI.
             */
            public Builder primaryEniQueueNumber(Integer primaryEniQueueNumber) {
                this.primaryEniQueueNumber = primaryEniQueueNumber;
                return this;
            }

            /**
             * The maximum number of QP queues per ERI.
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * The default number of queues per secondary ENI.
             */
            public Builder secondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
                this.secondaryEniQueueNumber = secondaryEniQueueNumber;
                return this;
            }

            /**
             * 规格支持的启动模式。
             */
            public Builder supportedBootModes(SupportedBootModes supportedBootModes) {
                this.supportedBootModes = supportedBootModes;
                return this;
            }

            /**
             * The maximum number of queues on ENIs that the instance type supports.
             */
            public Builder totalEniQueueQuantity(Integer totalEniQueueQuantity) {
                this.totalEniQueueQuantity = totalEniQueueQuantity;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private java.util.List < InstanceType> instanceType;

        private InstanceTypes(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public java.util.List < InstanceType> getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List < InstanceType> instanceType; 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List < InstanceType> instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}
