// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDesktopTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopTypesResponseBody</p>
 */
public class DescribeDesktopTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesktopTypes")
    private java.util.List < DesktopTypes> desktopTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Details of cloud desktop types.</p>
         */
        public Builder desktopTypes(java.util.List < DesktopTypes> desktopTypes) {
            this.desktopTypes = desktopTypes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDesktopTypesResponseBody build() {
            return new DescribeDesktopTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopTypesResponseBody</p>
     */
    public static class DesktopTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCount")
        private String cpuCount;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private String dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("DesktopTypeId")
        private String desktopTypeId;

        @com.aliyun.core.annotation.NameInMap("DesktopTypeStatus")
        private String desktopTypeStatus;

        @com.aliyun.core.annotation.NameInMap("GpuCount")
        private Float gpuCount;

        @com.aliyun.core.annotation.NameInMap("GpuMemory")
        private Integer gpuMemory;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private String memorySize;

        @com.aliyun.core.annotation.NameInMap("Scopes")
        private java.util.List < String > scopes;

        @com.aliyun.core.annotation.NameInMap("StockState")
        private String stockState;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private String systemDiskSize;

        private DesktopTypes(Builder builder) {
            this.cpuCount = builder.cpuCount;
            this.dataDiskSize = builder.dataDiskSize;
            this.desktopTypeId = builder.desktopTypeId;
            this.desktopTypeStatus = builder.desktopTypeStatus;
            this.gpuCount = builder.gpuCount;
            this.gpuMemory = builder.gpuMemory;
            this.gpuSpec = builder.gpuSpec;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.memorySize = builder.memorySize;
            this.scopes = builder.scopes;
            this.stockState = builder.stockState;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopTypes create() {
            return builder().build();
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
         * @return gpuMemory
         */
        public Integer getGpuMemory() {
            return this.gpuMemory;
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
         * @return scopes
         */
        public java.util.List < String > getScopes() {
            return this.scopes;
        }

        /**
         * @return stockState
         */
        public String getStockState() {
            return this.stockState;
        }

        /**
         * @return systemDiskSize
         */
        public String getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private String cpuCount; 
            private String dataDiskSize; 
            private String desktopTypeId; 
            private String desktopTypeStatus; 
            private Float gpuCount; 
            private Integer gpuMemory; 
            private String gpuSpec; 
            private String instanceTypeFamily; 
            private String memorySize; 
            private java.util.List < String > scopes; 
            private String stockState; 
            private String systemDiskSize; 

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCount(String cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>The ID of the cloud desktop type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd.graphics.xlarge</p>
             */
            public Builder desktopTypeId(String desktopTypeId) {
                this.desktopTypeId = desktopTypeId;
                return this;
            }

            /**
             * <p>The status of the cloud desktop type. If SUFFICIENT is returned, the number of cloud desktops of the type is sufficient.</p>
             * 
             * <strong>example:</strong>
             * <p>SUFFICIENT</p>
             */
            public Builder desktopTypeStatus(String desktopTypeStatus) {
                this.desktopTypeStatus = desktopTypeStatus;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpuCount(Float gpuCount) {
                this.gpuCount = gpuCount;
                return this;
            }

            /**
             * GpuMemory.
             */
            public Builder gpuMemory(Integer gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * <p>The GPU memory.</p>
             * 
             * <strong>example:</strong>
             * <p>16 GiB</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The family of the cloud desktop type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd.graphics</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The memory size. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>23552</p>
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * Scopes.
             */
            public Builder scopes(java.util.List < String > scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * StockState.
             */
            public Builder stockState(String stockState) {
                this.stockState = stockState;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
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
