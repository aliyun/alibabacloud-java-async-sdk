// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostTypesResponseBody</p>
 */
public class DescribeDedicatedHostTypesResponseBody extends TeaModel {
    @NameInMap("DedicatedHostTypes")
    private DedicatedHostTypes dedicatedHostTypes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedHostTypesResponseBody(Builder builder) {
        this.dedicatedHostTypes = builder.dedicatedHostTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostTypes
     */
    public DedicatedHostTypes getDedicatedHostTypes() {
        return this.dedicatedHostTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DedicatedHostTypes dedicatedHostTypes; 
        private String requestId; 

        /**
         * The category of the local disks.
         */
        public Builder dedicatedHostTypes(DedicatedHostTypes dedicatedHostTypes) {
            this.dedicatedHostTypes = dedicatedHostTypes;
            return this;
        }

        /**
         * The number of cores in a single physical CPU.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostTypesResponseBody build() {
            return new DescribeDedicatedHostTypesResponseBody(this);
        } 

    } 

    public static class SupportedInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedInstanceTypeFamily")
        private java.util.List < String > supportedInstanceTypeFamily;

        private SupportedInstanceTypeFamilies(Builder builder) {
            this.supportedInstanceTypeFamily = builder.supportedInstanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceTypeFamily
         */
        public java.util.List < String > getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List < String > supportedInstanceTypeFamily; 

            /**
             * SupportedInstanceTypeFamily.
             */
            public Builder supportedInstanceTypeFamily(java.util.List < String > supportedInstanceTypeFamily) {
                this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
                return this;
            }

            public SupportedInstanceTypeFamilies build() {
                return new SupportedInstanceTypeFamilies(this);
            } 

        } 

    }
    public static class SupportedInstanceTypesList extends TeaModel {
        @NameInMap("SupportedInstanceTypesList")
        private java.util.List < String > supportedInstanceTypesList;

        private SupportedInstanceTypesList(Builder builder) {
            this.supportedInstanceTypesList = builder.supportedInstanceTypesList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceTypesList create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceTypesList
         */
        public java.util.List < String > getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public static final class Builder {
            private java.util.List < String > supportedInstanceTypesList; 

            /**
             * SupportedInstanceTypesList.
             */
            public Builder supportedInstanceTypesList(java.util.List < String > supportedInstanceTypesList) {
                this.supportedInstanceTypesList = supportedInstanceTypesList;
                return this;
            }

            public SupportedInstanceTypesList build() {
                return new SupportedInstanceTypesList(this);
            } 

        } 

    }
    public static class DedicatedHostType extends TeaModel {
        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("CpuOverCommitRatioRange")
        private String cpuOverCommitRatioRange;

        @NameInMap("DedicatedHostType")
        private String dedicatedHostType;

        @NameInMap("GPUSpec")
        private String GPUSpec;

        @NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @NameInMap("MemorySize")
        private Float memorySize;

        @NameInMap("PhysicalGpus")
        private Integer physicalGpus;

        @NameInMap("Sockets")
        private Integer sockets;

        @NameInMap("SupportCpuOverCommitRatio")
        private Boolean supportCpuOverCommitRatio;

        @NameInMap("SupportedInstanceTypeFamilies")
        private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @NameInMap("SupportedInstanceTypesList")
        private SupportedInstanceTypesList supportedInstanceTypesList;

        @NameInMap("TotalVcpus")
        private Integer totalVcpus;

        @NameInMap("TotalVgpus")
        private Integer totalVgpus;

        private DedicatedHostType(Builder builder) {
            this.cores = builder.cores;
            this.cpuOverCommitRatioRange = builder.cpuOverCommitRatioRange;
            this.dedicatedHostType = builder.dedicatedHostType;
            this.GPUSpec = builder.GPUSpec;
            this.localStorageAmount = builder.localStorageAmount;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.localStorageCategory = builder.localStorageCategory;
            this.memorySize = builder.memorySize;
            this.physicalGpus = builder.physicalGpus;
            this.sockets = builder.sockets;
            this.supportCpuOverCommitRatio = builder.supportCpuOverCommitRatio;
            this.supportedInstanceTypeFamilies = builder.supportedInstanceTypeFamilies;
            this.supportedInstanceTypesList = builder.supportedInstanceTypesList;
            this.totalVcpus = builder.totalVcpus;
            this.totalVgpus = builder.totalVgpus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostType create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return cpuOverCommitRatioRange
         */
        public String getCpuOverCommitRatioRange() {
            return this.cpuOverCommitRatioRange;
        }

        /**
         * @return dedicatedHostType
         */
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
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
         * @return memorySize
         */
        public Float getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return physicalGpus
         */
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        /**
         * @return sockets
         */
        public Integer getSockets() {
            return this.sockets;
        }

        /**
         * @return supportCpuOverCommitRatio
         */
        public Boolean getSupportCpuOverCommitRatio() {
            return this.supportCpuOverCommitRatio;
        }

        /**
         * @return supportedInstanceTypeFamilies
         */
        public SupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

        /**
         * @return supportedInstanceTypesList
         */
        public SupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        /**
         * @return totalVcpus
         */
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        /**
         * @return totalVgpus
         */
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

        public static final class Builder {
            private Integer cores; 
            private String cpuOverCommitRatioRange; 
            private String dedicatedHostType; 
            private String GPUSpec; 
            private Integer localStorageAmount; 
            private Long localStorageCapacity; 
            private String localStorageCategory; 
            private Float memorySize; 
            private Integer physicalGpus; 
            private Integer sockets; 
            private Boolean supportCpuOverCommitRatio; 
            private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies; 
            private SupportedInstanceTypesList supportedInstanceTypesList; 
            private Integer totalVcpus; 
            private Integer totalVgpus; 

            /**
             * The GPU model.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The size of the memory. Unit: GiB.
             */
            public Builder cpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
                this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
                return this;
            }

            /**
             * The total number of vGPUs.
             */
            public Builder dedicatedHostType(String dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            /**
             * The supported CPU overcommit ratio range.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * The number of physical CPUs.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * The number of local disks on a dedicated host.
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * The total number of vCPUs.
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * The capacity of a local disk. Unit: GiB.
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * Indicates whether the CPU overcommit ratio setting is supported.
             */
            public Builder physicalGpus(Integer physicalGpus) {
                this.physicalGpus = physicalGpus;
                return this;
            }

            /**
             * The ECS instance family.
             */
            public Builder sockets(Integer sockets) {
                this.sockets = sockets;
                return this;
            }

            /**
             * The type of the dedicated host. You can submit a ticket to request more dedicated host types.
             */
            public Builder supportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
                this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
                return this;
            }

            /**
             * The ECS instance types supported by the dedicated host.
             */
            public Builder supportedInstanceTypeFamilies(SupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
                this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
                return this;
            }

            /**
             * SupportedInstanceTypesList.
             */
            public Builder supportedInstanceTypesList(SupportedInstanceTypesList supportedInstanceTypesList) {
                this.supportedInstanceTypesList = supportedInstanceTypesList;
                return this;
            }

            /**
             * The number of physical GPUs.
             */
            public Builder totalVcpus(Integer totalVcpus) {
                this.totalVcpus = totalVcpus;
                return this;
            }

            /**
             * The ECS instance families supported by the dedicated host.
             */
            public Builder totalVgpus(Integer totalVgpus) {
                this.totalVgpus = totalVgpus;
                return this;
            }

            public DedicatedHostType build() {
                return new DedicatedHostType(this);
            } 

        } 

    }
    public static class DedicatedHostTypes extends TeaModel {
        @NameInMap("DedicatedHostType")
        private java.util.List < DedicatedHostType> dedicatedHostType;

        private DedicatedHostTypes(Builder builder) {
            this.dedicatedHostType = builder.dedicatedHostType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostTypes create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostType
         */
        public java.util.List < DedicatedHostType> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public static final class Builder {
            private java.util.List < DedicatedHostType> dedicatedHostType; 

            /**
             * The total number of vGPUs.
             */
            public Builder dedicatedHostType(java.util.List < DedicatedHostType> dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            public DedicatedHostTypes build() {
                return new DedicatedHostTypes(this);
            } 

        } 

    }
}
