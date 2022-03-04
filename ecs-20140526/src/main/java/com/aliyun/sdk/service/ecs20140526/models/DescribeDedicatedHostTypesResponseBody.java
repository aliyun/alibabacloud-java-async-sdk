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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("DedicatedHostTypes")
    private DedicatedHostTypes dedicatedHostTypes;

    private DescribeDedicatedHostTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.dedicatedHostTypes = builder.dedicatedHostTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return dedicatedHostTypes
     */
    public DedicatedHostTypes getDedicatedHostTypes() {
        return this.dedicatedHostTypes;
    }

    public static final class Builder {
        private String requestId; 
        private DedicatedHostTypes dedicatedHostTypes; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Returns the specifications of the dedicated host.
         */
        public Builder dedicatedHostTypes(DedicatedHostTypes dedicatedHostTypes) {
            this.dedicatedHostTypes = dedicatedHostTypes;
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

        @NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @NameInMap("GPUSpec")
        private String GPUSpec;

        @NameInMap("TotalVcpus")
        private Integer totalVcpus;

        @NameInMap("CpuOverCommitRatioRange")
        private String cpuOverCommitRatioRange;

        @NameInMap("PhysicalGpus")
        private Integer physicalGpus;

        @NameInMap("MemorySize")
        private Float memorySize;

        @NameInMap("SupportCpuOverCommitRatio")
        private Boolean supportCpuOverCommitRatio;

        @NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @NameInMap("DedicatedHostType")
        private String dedicatedHostType;

        @NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @NameInMap("TotalVgpus")
        private Integer totalVgpus;

        @NameInMap("Sockets")
        private Integer sockets;

        @NameInMap("SupportedInstanceTypeFamilies")
        private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @NameInMap("SupportedInstanceTypesList")
        private SupportedInstanceTypesList supportedInstanceTypesList;

        private DedicatedHostType(Builder builder) {
            this.cores = builder.cores;
            this.localStorageCategory = builder.localStorageCategory;
            this.GPUSpec = builder.GPUSpec;
            this.totalVcpus = builder.totalVcpus;
            this.cpuOverCommitRatioRange = builder.cpuOverCommitRatioRange;
            this.physicalGpus = builder.physicalGpus;
            this.memorySize = builder.memorySize;
            this.supportCpuOverCommitRatio = builder.supportCpuOverCommitRatio;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.dedicatedHostType = builder.dedicatedHostType;
            this.localStorageAmount = builder.localStorageAmount;
            this.totalVgpus = builder.totalVgpus;
            this.sockets = builder.sockets;
            this.supportedInstanceTypeFamilies = builder.supportedInstanceTypeFamilies;
            this.supportedInstanceTypesList = builder.supportedInstanceTypesList;
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
         * @return localStorageCategory
         */
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return totalVcpus
         */
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        /**
         * @return cpuOverCommitRatioRange
         */
        public String getCpuOverCommitRatioRange() {
            return this.cpuOverCommitRatioRange;
        }

        /**
         * @return physicalGpus
         */
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        /**
         * @return memorySize
         */
        public Float getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return supportCpuOverCommitRatio
         */
        public Boolean getSupportCpuOverCommitRatio() {
            return this.supportCpuOverCommitRatio;
        }

        /**
         * @return localStorageCapacity
         */
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        /**
         * @return dedicatedHostType
         */
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        /**
         * @return localStorageAmount
         */
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        /**
         * @return totalVgpus
         */
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

        /**
         * @return sockets
         */
        public Integer getSockets() {
            return this.sockets;
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

        public static final class Builder {
            private Integer cores; 
            private String localStorageCategory; 
            private String GPUSpec; 
            private Integer totalVcpus; 
            private String cpuOverCommitRatioRange; 
            private Integer physicalGpus; 
            private Float memorySize; 
            private Boolean supportCpuOverCommitRatio; 
            private Long localStorageCapacity; 
            private String dedicatedHostType; 
            private Integer localStorageAmount; 
            private Integer totalVgpus; 
            private Integer sockets; 
            private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies; 
            private SupportedInstanceTypesList supportedInstanceTypesList; 

            /**
             * The number of cores per physical CPU.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The type of the local disk.
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
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
             * The total number of virtual CPU cores.
             */
            public Builder totalVcpus(Integer totalVcpus) {
                this.totalVcpus = totalVcpus;
                return this;
            }

            /**
             * You can set the CPU oversell ratio.
             */
            public Builder cpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
                this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
                return this;
            }

            /**
             * The number of physical GPUs.
             */
            public Builder physicalGpus(Integer physicalGpus) {
                this.physicalGpus = physicalGpus;
                return this;
            }

            /**
             * The memory capacity. Unit: GiB.
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * Specifies whether to set the CPU oversell ratio.
             */
            public Builder supportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
                this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
                return this;
            }

            /**
             * The capacity of a local disk. Unit: GiB.
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * The type of the dedicated host. If you want to use more dedicated host specifications, open a ticket to contact Alibaba Cloud.
             */
            public Builder dedicatedHostType(String dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            /**
             * The number of local disks on the dedicated host.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * The total number of virtual GPU cores.
             */
            public Builder totalVgpus(Integer totalVgpus) {
                this.totalVgpus = totalVgpus;
                return this;
            }

            /**
             * The number of physical processors.
             */
            public Builder sockets(Integer sockets) {
                this.sockets = sockets;
                return this;
            }

            /**
             * SupportedInstanceTypeFamilies.
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
             * The type of the dedicated host. If you want to use more dedicated host specifications, open a ticket to contact Alibaba Cloud.
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
