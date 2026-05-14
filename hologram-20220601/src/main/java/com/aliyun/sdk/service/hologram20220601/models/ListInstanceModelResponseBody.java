// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListInstanceModelResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceModelResponseBody</p>
 */
public class ListInstanceModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instanceModelList")
    private java.util.List<InstanceModelList> instanceModelList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListInstanceModelResponseBody(Builder builder) {
        this.instanceModelList = builder.instanceModelList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceModelList
     */
    public java.util.List<InstanceModelList> getInstanceModelList() {
        return this.instanceModelList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceModelList> instanceModelList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstanceModelResponseBody model) {
            this.instanceModelList = model.instanceModelList;
            this.requestId = model.requestId;
        } 

        /**
         * instanceModelList.
         */
        public Builder instanceModelList(java.util.List<InstanceModelList> instanceModelList) {
            this.instanceModelList = instanceModelList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2C2ECDC1-FBAD-14A5-AA4A-96BC787FBDBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceModelResponseBody build() {
            return new ListInstanceModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceModelResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceModelResponseBody</p>
     */
    public static class InstanceModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aiInstanceId")
        private String aiInstanceId;

        @com.aliyun.core.annotation.NameInMap("aiSpec")
        private String aiSpec;

        @com.aliyun.core.annotation.NameInMap("autoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("chargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("cpu")
        private Long cpu;

        @com.aliyun.core.annotation.NameInMap("cpuUsed")
        private Long cpuUsed;

        @com.aliyun.core.annotation.NameInMap("expirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("gpu")
        private Long gpu;

        @com.aliyun.core.annotation.NameInMap("gpuMemory")
        private Long gpuMemory;

        @com.aliyun.core.annotation.NameInMap("gpuMemoryUsed")
        private Long gpuMemoryUsed;

        @com.aliyun.core.annotation.NameInMap("gpuUsed")
        private Long gpuUsed;

        @com.aliyun.core.annotation.NameInMap("holoInstanceId")
        private String holoInstanceId;

        @com.aliyun.core.annotation.NameInMap("holoInstanceName")
        private String holoInstanceName;

        @com.aliyun.core.annotation.NameInMap("memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("memoryUsed")
        private Long memoryUsed;

        @com.aliyun.core.annotation.NameInMap("nodeCount")
        private Long nodeCount;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private InstanceModelList(Builder builder) {
            this.aiInstanceId = builder.aiInstanceId;
            this.aiSpec = builder.aiSpec;
            this.autoRenewal = builder.autoRenewal;
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.cpu = builder.cpu;
            this.cpuUsed = builder.cpuUsed;
            this.expirationTime = builder.expirationTime;
            this.gpu = builder.gpu;
            this.gpuMemory = builder.gpuMemory;
            this.gpuMemoryUsed = builder.gpuMemoryUsed;
            this.gpuUsed = builder.gpuUsed;
            this.holoInstanceId = builder.holoInstanceId;
            this.holoInstanceName = builder.holoInstanceName;
            this.memory = builder.memory;
            this.memoryUsed = builder.memoryUsed;
            this.nodeCount = builder.nodeCount;
            this.regionId = builder.regionId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceModelList create() {
            return builder().build();
        }

        /**
         * @return aiInstanceId
         */
        public String getAiInstanceId() {
            return this.aiInstanceId;
        }

        /**
         * @return aiSpec
         */
        public String getAiSpec() {
            return this.aiSpec;
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return cpu
         */
        public Long getCpu() {
            return this.cpu;
        }

        /**
         * @return cpuUsed
         */
        public Long getCpuUsed() {
            return this.cpuUsed;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return gpu
         */
        public Long getGpu() {
            return this.gpu;
        }

        /**
         * @return gpuMemory
         */
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        /**
         * @return gpuMemoryUsed
         */
        public Long getGpuMemoryUsed() {
            return this.gpuMemoryUsed;
        }

        /**
         * @return gpuUsed
         */
        public Long getGpuUsed() {
            return this.gpuUsed;
        }

        /**
         * @return holoInstanceId
         */
        public String getHoloInstanceId() {
            return this.holoInstanceId;
        }

        /**
         * @return holoInstanceName
         */
        public String getHoloInstanceName() {
            return this.holoInstanceName;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return memoryUsed
         */
        public Long getMemoryUsed() {
            return this.memoryUsed;
        }

        /**
         * @return nodeCount
         */
        public Long getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aiInstanceId; 
            private String aiSpec; 
            private Boolean autoRenewal; 
            private String chargeType; 
            private String commodityCode; 
            private Long cpu; 
            private Long cpuUsed; 
            private String expirationTime; 
            private Long gpu; 
            private Long gpuMemory; 
            private Long gpuMemoryUsed; 
            private Long gpuUsed; 
            private String holoInstanceId; 
            private String holoInstanceName; 
            private Long memory; 
            private Long memoryUsed; 
            private Long nodeCount; 
            private String regionId; 
            private String resourceType; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstanceModelList model) {
                this.aiInstanceId = model.aiInstanceId;
                this.aiSpec = model.aiSpec;
                this.autoRenewal = model.autoRenewal;
                this.chargeType = model.chargeType;
                this.commodityCode = model.commodityCode;
                this.cpu = model.cpu;
                this.cpuUsed = model.cpuUsed;
                this.expirationTime = model.expirationTime;
                this.gpu = model.gpu;
                this.gpuMemory = model.gpuMemory;
                this.gpuMemoryUsed = model.gpuMemoryUsed;
                this.gpuUsed = model.gpuUsed;
                this.holoInstanceId = model.holoInstanceId;
                this.holoInstanceName = model.holoInstanceName;
                this.memory = model.memory;
                this.memoryUsed = model.memoryUsed;
                this.nodeCount = model.nodeCount;
                this.regionId = model.regionId;
                this.resourceType = model.resourceType;
                this.status = model.status;
            } 

            /**
             * aiInstanceId.
             */
            public Builder aiInstanceId(String aiInstanceId) {
                this.aiInstanceId = aiInstanceId;
                return this;
            }

            /**
             * aiSpec.
             */
            public Builder aiSpec(String aiSpec) {
                this.aiSpec = aiSpec;
                return this;
            }

            /**
             * autoRenewal.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * chargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * cpu.
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * cpuUsed.
             */
            public Builder cpuUsed(Long cpuUsed) {
                this.cpuUsed = cpuUsed;
                return this;
            }

            /**
             * expirationTime.
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * gpu.
             */
            public Builder gpu(Long gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * gpuMemory.
             */
            public Builder gpuMemory(Long gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * gpuMemoryUsed.
             */
            public Builder gpuMemoryUsed(Long gpuMemoryUsed) {
                this.gpuMemoryUsed = gpuMemoryUsed;
                return this;
            }

            /**
             * gpuUsed.
             */
            public Builder gpuUsed(Long gpuUsed) {
                this.gpuUsed = gpuUsed;
                return this;
            }

            /**
             * holoInstanceId.
             */
            public Builder holoInstanceId(String holoInstanceId) {
                this.holoInstanceId = holoInstanceId;
                return this;
            }

            /**
             * holoInstanceName.
             */
            public Builder holoInstanceName(String holoInstanceName) {
                this.holoInstanceName = holoInstanceName;
                return this;
            }

            /**
             * memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * memoryUsed.
             */
            public Builder memoryUsed(Long memoryUsed) {
                this.memoryUsed = memoryUsed;
                return this;
            }

            /**
             * nodeCount.
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceModelList build() {
                return new InstanceModelList(this);
            } 

        } 

    }
}
