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
 * {@link DescribeDedicatedHostTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostTypesResponseBody</p>
 */
public class DescribeDedicatedHostTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DedicatedHostTypes")
    private DedicatedHostTypes dedicatedHostTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDedicatedHostTypesResponseBody model) {
            this.dedicatedHostTypes = model.dedicatedHostTypes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the dedicated host types.</p>
         */
        public Builder dedicatedHostTypes(DedicatedHostTypes dedicatedHostTypes) {
            this.dedicatedHostTypes = dedicatedHostTypes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FE5FF06-3A33-4658-8495-6445FC54E327</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostTypesResponseBody build() {
            return new DescribeDedicatedHostTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDedicatedHostTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostTypesResponseBody</p>
     */
    public static class SupportedInstanceTypeFamilies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypeFamily")
        private java.util.List<String> supportedInstanceTypeFamily;

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
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List<String> supportedInstanceTypeFamily; 

            private Builder() {
            } 

            private Builder(SupportedInstanceTypeFamilies model) {
                this.supportedInstanceTypeFamily = model.supportedInstanceTypeFamily;
            } 

            /**
             * SupportedInstanceTypeFamily.
             */
            public Builder supportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
                this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
                return this;
            }

            public SupportedInstanceTypeFamilies build() {
                return new SupportedInstanceTypeFamilies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostTypesResponseBody</p>
     */
    public static class SupportedInstanceTypesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypesList")
        private java.util.List<String> supportedInstanceTypesList;

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
        public java.util.List<String> getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public static final class Builder {
            private java.util.List<String> supportedInstanceTypesList; 

            private Builder() {
            } 

            private Builder(SupportedInstanceTypesList model) {
                this.supportedInstanceTypesList = model.supportedInstanceTypesList;
            } 

            /**
             * SupportedInstanceTypesList.
             */
            public Builder supportedInstanceTypesList(java.util.List<String> supportedInstanceTypesList) {
                this.supportedInstanceTypesList = supportedInstanceTypesList;
                return this;
            }

            public SupportedInstanceTypesList build() {
                return new SupportedInstanceTypesList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostTypesResponseBody</p>
     */
    public static class DedicatedHostType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("CpuOverCommitRatioRange")
        private String cpuOverCommitRatioRange;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostType")
        private String dedicatedHostType;

        @com.aliyun.core.annotation.NameInMap("GPUSpec")
        private String GPUSpec;

        @com.aliyun.core.annotation.NameInMap("LocalStorageAmount")
        private Integer localStorageAmount;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCapacity")
        private Long localStorageCapacity;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Float memorySize;

        @com.aliyun.core.annotation.NameInMap("PhysicalGpus")
        private Integer physicalGpus;

        @com.aliyun.core.annotation.NameInMap("Sockets")
        private Integer sockets;

        @com.aliyun.core.annotation.NameInMap("SupportCpuOverCommitRatio")
        private Boolean supportCpuOverCommitRatio;

        @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypeFamilies")
        private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypesList")
        private SupportedInstanceTypesList supportedInstanceTypesList;

        @com.aliyun.core.annotation.NameInMap("TotalVcpus")
        private Integer totalVcpus;

        @com.aliyun.core.annotation.NameInMap("TotalVgpus")
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

            private Builder() {
            } 

            private Builder(DedicatedHostType model) {
                this.cores = model.cores;
                this.cpuOverCommitRatioRange = model.cpuOverCommitRatioRange;
                this.dedicatedHostType = model.dedicatedHostType;
                this.GPUSpec = model.GPUSpec;
                this.localStorageAmount = model.localStorageAmount;
                this.localStorageCapacity = model.localStorageCapacity;
                this.localStorageCategory = model.localStorageCategory;
                this.memorySize = model.memorySize;
                this.physicalGpus = model.physicalGpus;
                this.sockets = model.sockets;
                this.supportCpuOverCommitRatio = model.supportCpuOverCommitRatio;
                this.supportedInstanceTypeFamilies = model.supportedInstanceTypeFamilies;
                this.supportedInstanceTypesList = model.supportedInstanceTypesList;
                this.totalVcpus = model.totalVcpus;
                this.totalVgpus = model.totalVgpus;
            } 

            /**
             * <p>The number of cores per physical CPU.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The supported CPU overcommit ratio range.</p>
             * 
             * <strong>example:</strong>
             * <p>1-5</p>
             */
            public Builder cpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
                this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
                return this;
            }

            /**
             * <p>The dedicated host type.</p>
             * 
             * <strong>example:</strong>
             * <p>ddh.sn1ne</p>
             */
            public Builder dedicatedHostType(String dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            /**
             * <p>The GPU model.</p>
             * 
             * <strong>example:</strong>
             * <p>gpu</p>
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * <p>The number of local disks on a dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder localStorageAmount(Integer localStorageAmount) {
                this.localStorageAmount = localStorageAmount;
                return this;
            }

            /**
             * <p>The capacity of a local disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder localStorageCapacity(Long localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            /**
             * <p>The category of local disks.</p>
             * 
             * <strong>example:</strong>
             * <p>local</p>
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>112.0</p>
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The number of physical GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder physicalGpus(Integer physicalGpus) {
                this.physicalGpus = physicalGpus;
                return this;
            }

            /**
             * <p>The number of physical CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder sockets(Integer sockets) {
                this.sockets = sockets;
                return this;
            }

            /**
             * <p>Indicates whether the CPU overcommit ratio settings are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
                this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
                return this;
            }

            /**
             * <p>The ECS instance families supported by the dedicated host type.</p>
             */
            public Builder supportedInstanceTypeFamilies(SupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
                this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
                return this;
            }

            /**
             * <p>The ECS instance types supported by the dedicated host type.</p>
             */
            public Builder supportedInstanceTypesList(SupportedInstanceTypesList supportedInstanceTypesList) {
                this.supportedInstanceTypesList = supportedInstanceTypesList;
                return this;
            }

            /**
             * <p>The total number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder totalVcpus(Integer totalVcpus) {
                this.totalVcpus = totalVcpus;
                return this;
            }

            /**
             * <p>The total number of vGPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeDedicatedHostTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostTypesResponseBody</p>
     */
    public static class DedicatedHostTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostType")
        private java.util.List<DedicatedHostType> dedicatedHostType;

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
        public java.util.List<DedicatedHostType> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public static final class Builder {
            private java.util.List<DedicatedHostType> dedicatedHostType; 

            private Builder() {
            } 

            private Builder(DedicatedHostTypes model) {
                this.dedicatedHostType = model.dedicatedHostType;
            } 

            /**
             * <p>The dedicated host type.</p>
             * 
             * <strong>example:</strong>
             * <p>ddh.sn1ne</p>
             */
            public Builder dedicatedHostType(java.util.List<DedicatedHostType> dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            public DedicatedHostTypes build() {
                return new DedicatedHostTypes(this);
            } 

        } 

    }
}
