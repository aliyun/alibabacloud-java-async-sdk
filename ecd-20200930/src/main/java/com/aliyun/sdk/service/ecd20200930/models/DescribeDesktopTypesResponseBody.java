// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopTypesResponseBody</p>
 */
public class DescribeDesktopTypesResponseBody extends TeaModel {
    @NameInMap("DesktopTypes")
    private java.util.List < DesktopTypes> desktopTypes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopTypesResponseBody(Builder builder) {
        this.desktopTypes = builder.desktopTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktopTypes
     */
    public java.util.List < DesktopTypes> getDesktopTypes() {
        return this.desktopTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DesktopTypes> desktopTypes; 
        private String requestId; 

        /**
         * DesktopTypes.
         */
        public Builder desktopTypes(java.util.List < DesktopTypes> desktopTypes) {
            this.desktopTypes = desktopTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopTypesResponseBody build() {
            return new DescribeDesktopTypesResponseBody(this);
        } 

    } 

    public static class AllowDiskSize extends TeaModel {
        @NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @NameInMap("DefaultDataDiskSize")
        private Integer defaultDataDiskSize;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private AllowDiskSize(Builder builder) {
            this.dataDiskSize = builder.dataDiskSize;
            this.defaultDataDiskSize = builder.defaultDataDiskSize;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowDiskSize create() {
            return builder().build();
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return defaultDataDiskSize
         */
        public Integer getDefaultDataDiskSize() {
            return this.defaultDataDiskSize;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private Integer dataDiskSize; 
            private Integer defaultDataDiskSize; 
            private Integer systemDiskSize; 

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DefaultDataDiskSize.
             */
            public Builder defaultDataDiskSize(Integer defaultDataDiskSize) {
                this.defaultDataDiskSize = defaultDataDiskSize;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public AllowDiskSize build() {
                return new AllowDiskSize(this);
            } 

        } 

    }
    public static class DesktopTypes extends TeaModel {
        @NameInMap("AllowDiskSize")
        private java.util.List < AllowDiskSize> allowDiskSize;

        @NameInMap("CpuCount")
        private String cpuCount;

        @NameInMap("DataDiskSize")
        private String dataDiskSize;

        @NameInMap("DesktopTypeId")
        private String desktopTypeId;

        @NameInMap("DesktopTypeStatus")
        private String desktopTypeStatus;

        @NameInMap("GpuCount")
        private Float gpuCount;

        @NameInMap("GpuSpec")
        private String gpuSpec;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("MemorySize")
        private String memorySize;

        @NameInMap("SystemDiskSize")
        private String systemDiskSize;

        private DesktopTypes(Builder builder) {
            this.allowDiskSize = builder.allowDiskSize;
            this.cpuCount = builder.cpuCount;
            this.dataDiskSize = builder.dataDiskSize;
            this.desktopTypeId = builder.desktopTypeId;
            this.desktopTypeStatus = builder.desktopTypeStatus;
            this.gpuCount = builder.gpuCount;
            this.gpuSpec = builder.gpuSpec;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.memorySize = builder.memorySize;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTypes create() {
            return builder().build();
        }

        /**
         * @return allowDiskSize
         */
        public java.util.List < AllowDiskSize> getAllowDiskSize() {
            return this.allowDiskSize;
        }

        /**
         * @return cpuCount
         */
        public String getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return dataDiskSize
         */
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return desktopTypeId
         */
        public String getDesktopTypeId() {
            return this.desktopTypeId;
        }

        /**
         * @return desktopTypeStatus
         */
        public String getDesktopTypeStatus() {
            return this.desktopTypeStatus;
        }

        /**
         * @return gpuCount
         */
        public Float getGpuCount() {
            return this.gpuCount;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return systemDiskSize
         */
        public String getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private java.util.List < AllowDiskSize> allowDiskSize; 
            private String cpuCount; 
            private String dataDiskSize; 
            private String desktopTypeId; 
            private String desktopTypeStatus; 
            private Float gpuCount; 
            private String gpuSpec; 
            private String instanceTypeFamily; 
            private String memorySize; 
            private String systemDiskSize; 

            /**
             * AllowDiskSize.
             */
            public Builder allowDiskSize(java.util.List < AllowDiskSize> allowDiskSize) {
                this.allowDiskSize = allowDiskSize;
                return this;
            }

            /**
             * CpuCount.
             */
            public Builder cpuCount(String cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DesktopTypeId.
             */
            public Builder desktopTypeId(String desktopTypeId) {
                this.desktopTypeId = desktopTypeId;
                return this;
            }

            /**
             * DesktopTypeStatus.
             */
            public Builder desktopTypeStatus(String desktopTypeStatus) {
                this.desktopTypeStatus = desktopTypeStatus;
                return this;
            }

            /**
             * GpuCount.
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(String systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public DesktopTypes build() {
                return new DesktopTypes(this);
            } 

        } 

    }
}
