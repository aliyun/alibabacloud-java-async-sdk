// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

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
         * DedicatedHostTypes.
         */
        public Builder dedicatedHostTypes(DedicatedHostTypes dedicatedHostTypes) {
            this.dedicatedHostTypes = dedicatedHostTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostTypesResponseBody build() {
            return new DescribeDedicatedHostTypesResponseBody(this);
        } 

    } 

    public static class SupportInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportInstanceTypeFamily")
        private java.util.List < String > supportInstanceTypeFamily;

        private SupportInstanceTypeFamilies(Builder builder) {
            this.supportInstanceTypeFamily = builder.supportInstanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportInstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return supportInstanceTypeFamily
         */
        public java.util.List < String > getSupportInstanceTypeFamily() {
            return this.supportInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List < String > supportInstanceTypeFamily; 

            /**
             * SupportInstanceTypeFamily.
             */
            public Builder supportInstanceTypeFamily(java.util.List < String > supportInstanceTypeFamily) {
                this.supportInstanceTypeFamily = supportInstanceTypeFamily;
                return this;
            }

            public SupportInstanceTypeFamilies build() {
                return new SupportInstanceTypeFamilies(this);
            } 

        } 

    }
    public static class SupportInstanceTypesList extends TeaModel {
        @NameInMap("SupportInstanceTypesList")
        private java.util.List < String > supportInstanceTypesList;

        private SupportInstanceTypesList(Builder builder) {
            this.supportInstanceTypesList = builder.supportInstanceTypesList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportInstanceTypesList create() {
            return builder().build();
        }

        /**
         * @return supportInstanceTypesList
         */
        public java.util.List < String > getSupportInstanceTypesList() {
            return this.supportInstanceTypesList;
        }

        public static final class Builder {
            private java.util.List < String > supportInstanceTypesList; 

            /**
             * SupportInstanceTypesList.
             */
            public Builder supportInstanceTypesList(java.util.List < String > supportInstanceTypesList) {
                this.supportInstanceTypesList = supportInstanceTypesList;
                return this;
            }

            public SupportInstanceTypesList build() {
                return new SupportInstanceTypesList(this);
            } 

        } 

    }
    public static class DedicatedHostType extends TeaModel {
        @NameInMap("CpuOverCommitRatioRange")
        private String cpuOverCommitRatioRange;

        @NameInMap("DedicatedHostType")
        private String dedicatedHostType;

        @NameInMap("GPUSpec")
        private String GPUSpec;

        @NameInMap("Generation")
        private String generation;

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

        @NameInMap("SupportCpuOverCommitRatio")
        private Boolean supportCpuOverCommitRatio;

        @NameInMap("SupportInstanceTypeFamilies")
        private SupportInstanceTypeFamilies supportInstanceTypeFamilies;

        @NameInMap("SupportInstanceTypesList")
        private SupportInstanceTypesList supportInstanceTypesList;

        @NameInMap("TotalPhysicalCores")
        private Integer totalPhysicalCores;

        @NameInMap("TotalSockets")
        private Integer totalSockets;

        @NameInMap("TotalVcpus")
        private Integer totalVcpus;

        @NameInMap("TotalVgpus")
        private Integer totalVgpus;

        private DedicatedHostType(Builder builder) {
            this.cpuOverCommitRatioRange = builder.cpuOverCommitRatioRange;
            this.dedicatedHostType = builder.dedicatedHostType;
            this.GPUSpec = builder.GPUSpec;
            this.generation = builder.generation;
            this.localStorageAmount = builder.localStorageAmount;
            this.localStorageCapacity = builder.localStorageCapacity;
            this.localStorageCategory = builder.localStorageCategory;
            this.memorySize = builder.memorySize;
            this.physicalGpus = builder.physicalGpus;
            this.supportCpuOverCommitRatio = builder.supportCpuOverCommitRatio;
            this.supportInstanceTypeFamilies = builder.supportInstanceTypeFamilies;
            this.supportInstanceTypesList = builder.supportInstanceTypesList;
            this.totalPhysicalCores = builder.totalPhysicalCores;
            this.totalSockets = builder.totalSockets;
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
         * @return generation
         */
        public String getGeneration() {
            return this.generation;
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
         * @return supportCpuOverCommitRatio
         */
        public Boolean getSupportCpuOverCommitRatio() {
            return this.supportCpuOverCommitRatio;
        }

        /**
         * @return supportInstanceTypeFamilies
         */
        public SupportInstanceTypeFamilies getSupportInstanceTypeFamilies() {
            return this.supportInstanceTypeFamilies;
        }

        /**
         * @return supportInstanceTypesList
         */
        public SupportInstanceTypesList getSupportInstanceTypesList() {
            return this.supportInstanceTypesList;
        }

        /**
         * @return totalPhysicalCores
         */
        public Integer getTotalPhysicalCores() {
            return this.totalPhysicalCores;
        }

        /**
         * @return totalSockets
         */
        public Integer getTotalSockets() {
            return this.totalSockets;
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
            private String cpuOverCommitRatioRange; 
            private String dedicatedHostType; 
            private String GPUSpec; 
            private String generation; 
            private Integer localStorageAmount; 
            private Long localStorageCapacity; 
            private String localStorageCategory; 
            private Float memorySize; 
            private Integer physicalGpus; 
            private Boolean supportCpuOverCommitRatio; 
            private SupportInstanceTypeFamilies supportInstanceTypeFamilies; 
            private SupportInstanceTypesList supportInstanceTypesList; 
            private Integer totalPhysicalCores; 
            private Integer totalSockets; 
            private Integer totalVcpus; 
            private Integer totalVgpus; 

            /**
             * CpuOverCommitRatioRange.
             */
            public Builder cpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
                this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
                return this;
            }

            /**
             * DedicatedHostType.
             */
            public Builder dedicatedHostType(String dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            /**
             * GPUSpec.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * Generation.
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            /**
             * LocalStorageAmount.
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * LocalStorageCapacity.
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * LocalStorageCategory.
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * PhysicalGpus.
             */
            public Builder physicalGpus(Integer physicalGpus) {
                this.physicalGpus = physicalGpus;
                return this;
            }

            /**
             * SupportCpuOverCommitRatio.
             */
            public Builder supportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
                this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
                return this;
            }

            /**
             * SupportInstanceTypeFamilies.
             */
            public Builder supportInstanceTypeFamilies(SupportInstanceTypeFamilies supportInstanceTypeFamilies) {
                this.supportInstanceTypeFamilies = supportInstanceTypeFamilies;
                return this;
            }

            /**
             * SupportInstanceTypesList.
             */
            public Builder supportInstanceTypesList(SupportInstanceTypesList supportInstanceTypesList) {
                this.supportInstanceTypesList = supportInstanceTypesList;
                return this;
            }

            /**
             * TotalPhysicalCores.
             */
            public Builder totalPhysicalCores(Integer totalPhysicalCores) {
                this.totalPhysicalCores = totalPhysicalCores;
                return this;
            }

            /**
             * TotalSockets.
             */
            public Builder totalSockets(Integer totalSockets) {
                this.totalSockets = totalSockets;
                return this;
            }

            /**
             * TotalVcpus.
             */
            public Builder totalVcpus(Integer totalVcpus) {
                this.totalVcpus = totalVcpus;
                return this;
            }

            /**
             * TotalVgpus.
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
             * DedicatedHostType.
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
