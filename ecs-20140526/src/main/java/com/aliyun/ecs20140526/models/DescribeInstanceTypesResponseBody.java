// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypesResponseBody</p>
 */
public class DescribeInstanceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @NameInMap("NextToken")
    private String nextToken;

    private DescribeInstanceTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.instanceTypes = builder.instanceTypes;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String requestId; 
        private InstanceTypes instanceTypes; 
        private String nextToken; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The set of instance types.
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The Token returned by this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public DescribeInstanceTypesResponseBody build() {
            return new DescribeInstanceTypesResponseBody(this);
        } 

    } 

    public static class InstanceType extends TeaModel {
        @NameInMap("EniTotalQuantity")
        private Integer eniTotalQuantity;

        @NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @NameInMap("PrimaryEniQueueNumber")
        private Integer primaryEniQueueNumber;

        @NameInMap("MemorySize")
        private Float memorySize;

        @NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @NameInMap("InstancePpsRx")
        private Long instancePpsRx;

        @NameInMap("EniIpv6AddressQuantity")
        private Integer eniIpv6AddressQuantity;

        @NameInMap("MaximumQueueNumberPerEni")
        private Integer maximumQueueNumberPerEni;

        @NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @NameInMap("InstanceBandwidthRx")
        private Integer instanceBandwidthRx;

        @NameInMap("SecondaryEniQueueNumber")
        private Integer secondaryEniQueueNumber;

        @NameInMap("GPUSpec")
        private String GPUSpec;

        @NameInMap("InstanceBandwidthTx")
        private Integer instanceBandwidthTx;

        @NameInMap("QueuePairNumber")
        private Integer queuePairNumber;

        @NameInMap("EriQuantity")
        private Integer eriQuantity;

        @NameInMap("GPUAmount")
        private Integer GPUAmount;

        @NameInMap("TotalEniQueueQuantity")
        private Integer totalEniQueueQuantity;

        @NameInMap("NvmeSupport")
        private String nvmeSupport;

        @NameInMap("DiskQuantity")
        private Integer diskQuantity;

        @NameInMap("InitialCredit")
        private Integer initialCredit;

        @NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @NameInMap("BaselineCredit")
        private Integer baselineCredit;

        @NameInMap("InstancePpsTx")
        private Long instancePpsTx;

        @NameInMap("EniPrivateIpAddressQuantity")
        private Integer eniPrivateIpAddressQuantity;

        @NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("EniQuantity")
        private Integer eniQuantity;

        @NameInMap("EniTrunkSupported")
        private Boolean eniTrunkSupported;

        private InstanceType(Builder builder) {
            this.eniTotalQuantity = builder.eniTotalQuantity;
            this.localStorageCategory = builder.localStorageCategory;
            this.primaryEniQueueNumber = builder.primaryEniQueueNumber;
            this.memorySize = builder.memorySize;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instancePpsRx = builder.instancePpsRx;
            this.eniIpv6AddressQuantity = builder.eniIpv6AddressQuantity;
            this.maximumQueueNumberPerEni = builder.maximumQueueNumberPerEni;
            this.instanceTypeId = builder.instanceTypeId;
            this.instanceBandwidthRx = builder.instanceBandwidthRx;
            this.secondaryEniQueueNumber = builder.secondaryEniQueueNumber;
            this.GPUSpec = builder.GPUSpec;
            this.instanceBandwidthTx = builder.instanceBandwidthTx;
            this.queuePairNumber = builder.queuePairNumber;
            this.eriQuantity = builder.eriQuantity;
            this.GPUAmount = builder.GPUAmount;
            this.totalEniQueueQuantity = builder.totalEniQueueQuantity;
            this.nvmeSupport = builder.nvmeSupport;
            this.diskQuantity = builder.diskQuantity;
            this.initialCredit = builder.initialCredit;
            this.localStorageAmount = builder.localStorageAmount;
            this.baselineCredit = builder.baselineCredit;
            this.instancePpsTx = builder.instancePpsTx;
            this.eniPrivateIpAddressQuantity = builder.eniPrivateIpAddressQuantity;
            this.cpuCoreCount = builder.cpuCoreCount;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.eniQuantity = builder.eniQuantity;
            this.eniTrunkSupported = builder.eniTrunkSupported;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return eniTotalQuantity
         */
        public Integer getEniTotalQuantity() {
            return this.eniTotalQuantity;
        }

        /**
         * @return localStorageCategory
         */
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        /**
         * @return primaryEniQueueNumber
         */
        public Integer getPrimaryEniQueueNumber() {
            return this.primaryEniQueueNumber;
        }

        /**
         * @return memorySize
         */
        public Float getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return localStorageCapacity
         */
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
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
         * @return eniIpv6AddressQuantity
         */
        public Integer getEniIpv6AddressQuantity() {
            return this.eniIpv6AddressQuantity;
        }

        /**
         * @return maximumQueueNumberPerEni
         */
        public Integer getMaximumQueueNumberPerEni() {
            return this.maximumQueueNumberPerEni;
        }

        /**
         * @return instanceTypeId
         */
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        /**
         * @return instanceBandwidthRx
         */
        public Integer getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        /**
         * @return secondaryEniQueueNumber
         */
        public Integer getSecondaryEniQueueNumber() {
            return this.secondaryEniQueueNumber;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return instanceBandwidthTx
         */
        public Integer getInstanceBandwidthTx() {
            return this.instanceBandwidthTx;
        }

        /**
         * @return queuePairNumber
         */
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
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
         * @return totalEniQueueQuantity
         */
        public Integer getTotalEniQueueQuantity() {
            return this.totalEniQueueQuantity;
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        /**
         * @return diskQuantity
         */
        public Integer getDiskQuantity() {
            return this.diskQuantity;
        }

        /**
         * @return initialCredit
         */
        public Integer getInitialCredit() {
            return this.initialCredit;
        }

        /**
         * @return localStorageAmount
         */
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        /**
         * @return baselineCredit
         */
        public Integer getBaselineCredit() {
            return this.baselineCredit;
        }

        /**
         * @return instancePpsTx
         */
        public Long getInstancePpsTx() {
            return this.instancePpsTx;
        }

        /**
         * @return eniPrivateIpAddressQuantity
         */
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return eniQuantity
         */
        public Integer getEniQuantity() {
            return this.eniQuantity;
        }

        /**
         * @return eniTrunkSupported
         */
        public Boolean getEniTrunkSupported() {
            return this.eniTrunkSupported;
        }

        public static final class Builder {
            private Integer eniTotalQuantity; 
            private String localStorageCategory; 
            private Integer primaryEniQueueNumber; 
            private Float memorySize; 
            private Long localStorageCapacity; 
            private String instanceFamilyLevel; 
            private Long instancePpsRx; 
            private Integer eniIpv6AddressQuantity; 
            private Integer maximumQueueNumberPerEni; 
            private String instanceTypeId; 
            private Integer instanceBandwidthRx; 
            private Integer secondaryEniQueueNumber; 
            private String GPUSpec; 
            private Integer instanceBandwidthTx; 
            private Integer queuePairNumber; 
            private Integer eriQuantity; 
            private Integer GPUAmount; 
            private Integer totalEniQueueQuantity; 
            private String nvmeSupport; 
            private Integer diskQuantity; 
            private Integer initialCredit; 
            private Integer localStorageAmount; 
            private Integer baselineCredit; 
            private Long instancePpsTx; 
            private Integer eniPrivateIpAddressQuantity; 
            private Integer cpuCoreCount; 
            private String instanceTypeFamily; 
            private Integer eniQuantity; 
            private Boolean eniTrunkSupported; 

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder eniTotalQuantity(Integer eniTotalQuantity) {
                this.eniTotalQuantity = eniTotalQuantity;
                return this;
            }

            /**
             * The type of the local disk. For more information, see [local disk](~~ 63138 ~~). Possible values:
             * <p>
             * 
             * -local_hdd_pro: SATA HDD local disks for d1ne and d1 instance families.
             * -local_ssd_pro: local NVMe SSD disks of instance family i2, i2g, i1, ga1, and gn5.
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * The primary card default number of queues.
             */
            public Builder primaryEniQueueNumber(Integer primaryEniQueueNumber) {
                this.primaryEniQueueNumber = primaryEniQueueNumber;
                return this;
            }

            /**
             * Memory size. Unit: GiB
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * Instance mounted local disk of a single disk capacity. Unit: GiB
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * Instance dimension family level. Possible values:
             * <p>
             * 
             * -EntryLevel: entry-level (sharing).
             * -EnterpriseLevel: enterprise-class.
             * -CreditEntryLevel: integral entry-level. More information, please see [burst performance instance](~~ 59977 ~~).
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * The inbound packet forwarding rate of the intranet. Unit: Pps
             */
            public Builder instancePpsRx(Long instancePpsRx) {
                this.instancePpsRx = instancePpsRx;
                return this;
            }

            /**
             * Single Block elastic network card of IPv6 address limit.
             */
            public Builder eniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
                this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
                return this;
            }

            /**
             * Single Block elastic network card maximum queue number.
             */
            public Builder maximumQueueNumberPerEni(Integer maximumQueueNumberPerEni) {
                this.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
                return this;
            }

            /**
             * Instance dimension ID.
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * The inbound bandwidth limit of the internal network. Unit: kbit/s
             */
            public Builder instanceBandwidthRx(Integer instanceBandwidthRx) {
                this.instanceBandwidthRx = instanceBandwidthRx;
                return this;
            }

            /**
             * Auxiliary elastic network card default number of queues.
             */
            public Builder secondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
                this.secondaryEniQueueNumber = secondaryEniQueueNumber;
                return this;
            }

            /**
             * GPU type.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * Intranet outlet direction bandwidth limit. Unit: kbit/s
             */
            public Builder instanceBandwidthTx(Integer instanceBandwidthTx) {
                this.instanceBandwidthTx = instanceBandwidthTx;
                return this;
            }

            /**
             * The maximum number of QP(QueuePair) queues for a single Elastic RDMA Nic (ERI).
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * Elastic RDMA network card (ERI).
             * <p>
             * 
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder eriQuantity(Integer eriQuantity) {
                this.eriQuantity = eriQuantity;
                return this;
            }

            /**
             * Number of GPUS.
             */
            public Builder GPUAmount(Integer GPUAmount) {
                this.GPUAmount = GPUAmount;
                return this;
            }

            /**
             * The total number of Eni queues that can be modified for the instance type.
             */
            public Builder totalEniQueueQuantity(Integer totalEniQueueQuantity) {
                this.totalEniQueueQuantity = totalEniQueueQuantity;
                return this;
            }

            /**
             * Instance specifications mounted cloud support NVMe. Possible values:
             * <p>
             * -required: support. Said cloud to NVMe way mounted.
             * -unsupported: not supported. Said cloud not NVMe way mounted.
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            /**
             * The maximum number of disks that can be mounted.
             */
            public Builder diskQuantity(Integer diskQuantity) {
                this.diskQuantity = diskQuantity;
                return this;
            }

            /**
             * The initial vCPU credits of the t5 and t6 burstable instances.
             */
            public Builder initialCredit(Integer initialCredit) {
                this.initialCredit = initialCredit;
                return this;
            }

            /**
             * The number of local disks attached to the instance.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * The baseline vCPU computing performance (the sum of all VCPUs) of the t5 and t6 burstable instances.
             */
            public Builder baselineCredit(Integer baselineCredit) {
                this.baselineCredit = baselineCredit;
                return this;
            }

            /**
             * Intranet outlet direction network transceiver bag ability. Unit: Pps
             */
            public Builder instancePpsTx(Long instancePpsTx) {
                this.instancePpsTx = instancePpsTx;
                return this;
            }

            /**
             * Single Block elastic network card private IP ADDRESS limit.
             */
            public Builder eniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
                this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
                return this;
            }

            /**
             * vCPU number of cores.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * The instance type family.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * Support mounted elastic network card limit.
             */
            public Builder eniQuantity(Integer eniQuantity) {
                this.eniQuantity = eniQuantity;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder eniTrunkSupported(Boolean eniTrunkSupported) {
                this.eniTrunkSupported = eniTrunkSupported;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
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
