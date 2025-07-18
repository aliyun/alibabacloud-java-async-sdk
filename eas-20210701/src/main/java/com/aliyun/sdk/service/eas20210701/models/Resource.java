// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link Resource} extends {@link TeaModel}
 *
 * <p>Resource</p>
 */
public class Resource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("CpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("CpuUsed")
    private Integer cpuUsed;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExtraData")
    private java.util.Map<String, ?> extraData;

    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List<String> features;

    @com.aliyun.core.annotation.NameInMap("GpuCount")
    private Integer gpuCount;

    @com.aliyun.core.annotation.NameInMap("GpuUsed")
    private Float gpuUsed;

    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("InstanceMaxAllocatableCPU")
    private Integer instanceMaxAllocatableCPU;

    @com.aliyun.core.annotation.NameInMap("InstanceMaxAllocatableGPU")
    private Float instanceMaxAllocatableGPU;

    @com.aliyun.core.annotation.NameInMap("InstanceMaxAllocatableMemory")
    private Integer instanceMaxAllocatableMemory;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("MemoryUsed")
    private Integer memoryUsed;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PostPaidInstanceCount")
    private Integer postPaidInstanceCount;

    @com.aliyun.core.annotation.NameInMap("PrePaidInstanceCount")
    private Integer prePaidInstanceCount;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private Resource(Builder builder) {
        this.clusterId = builder.clusterId;
        this.cpuCount = builder.cpuCount;
        this.cpuUsed = builder.cpuUsed;
        this.createTime = builder.createTime;
        this.extraData = builder.extraData;
        this.features = builder.features;
        this.gpuCount = builder.gpuCount;
        this.gpuUsed = builder.gpuUsed;
        this.instanceCount = builder.instanceCount;
        this.instanceMaxAllocatableCPU = builder.instanceMaxAllocatableCPU;
        this.instanceMaxAllocatableGPU = builder.instanceMaxAllocatableGPU;
        this.instanceMaxAllocatableMemory = builder.instanceMaxAllocatableMemory;
        this.memory = builder.memory;
        this.memoryUsed = builder.memoryUsed;
        this.message = builder.message;
        this.postPaidInstanceCount = builder.postPaidInstanceCount;
        this.prePaidInstanceCount = builder.prePaidInstanceCount;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Resource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return cpuUsed
     */
    public Integer getCpuUsed() {
        return this.cpuUsed;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return extraData
     */
    public java.util.Map<String, ?> getExtraData() {
        return this.extraData;
    }

    /**
     * @return features
     */
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    /**
     * @return gpuCount
     */
    public Integer getGpuCount() {
        return this.gpuCount;
    }

    /**
     * @return gpuUsed
     */
    public Float getGpuUsed() {
        return this.gpuUsed;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return instanceMaxAllocatableCPU
     */
    public Integer getInstanceMaxAllocatableCPU() {
        return this.instanceMaxAllocatableCPU;
    }

    /**
     * @return instanceMaxAllocatableGPU
     */
    public Float getInstanceMaxAllocatableGPU() {
        return this.instanceMaxAllocatableGPU;
    }

    /**
     * @return instanceMaxAllocatableMemory
     */
    public Integer getInstanceMaxAllocatableMemory() {
        return this.instanceMaxAllocatableMemory;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return memoryUsed
     */
    public Integer getMemoryUsed() {
        return this.memoryUsed;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return postPaidInstanceCount
     */
    public Integer getPostPaidInstanceCount() {
        return this.postPaidInstanceCount;
    }

    /**
     * @return prePaidInstanceCount
     */
    public Integer getPrePaidInstanceCount() {
        return this.prePaidInstanceCount;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
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

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String clusterId; 
        private Integer cpuCount; 
        private Integer cpuUsed; 
        private String createTime; 
        private java.util.Map<String, ?> extraData; 
        private java.util.List<String> features; 
        private Integer gpuCount; 
        private Float gpuUsed; 
        private Integer instanceCount; 
        private Integer instanceMaxAllocatableCPU; 
        private Float instanceMaxAllocatableGPU; 
        private Integer instanceMaxAllocatableMemory; 
        private Integer memory; 
        private Integer memoryUsed; 
        private String message; 
        private Integer postPaidInstanceCount; 
        private Integer prePaidInstanceCount; 
        private String resourceId; 
        private String resourceName; 
        private String resourceType; 
        private String status; 
        private String updateTime; 
        private String vendor; 

        private Builder() {
        } 

        private Builder(Resource model) {
            this.clusterId = model.clusterId;
            this.cpuCount = model.cpuCount;
            this.cpuUsed = model.cpuUsed;
            this.createTime = model.createTime;
            this.extraData = model.extraData;
            this.features = model.features;
            this.gpuCount = model.gpuCount;
            this.gpuUsed = model.gpuUsed;
            this.instanceCount = model.instanceCount;
            this.instanceMaxAllocatableCPU = model.instanceMaxAllocatableCPU;
            this.instanceMaxAllocatableGPU = model.instanceMaxAllocatableGPU;
            this.instanceMaxAllocatableMemory = model.instanceMaxAllocatableMemory;
            this.memory = model.memory;
            this.memoryUsed = model.memoryUsed;
            this.message = model.message;
            this.postPaidInstanceCount = model.postPaidInstanceCount;
            this.prePaidInstanceCount = model.prePaidInstanceCount;
            this.resourceId = model.resourceId;
            this.resourceName = model.resourceName;
            this.resourceType = model.resourceType;
            this.status = model.status;
            this.updateTime = model.updateTime;
            this.vendor = model.vendor;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CpuCount.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * CpuUsed.
         */
        public Builder cpuUsed(Integer cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExtraData.
         */
        public Builder extraData(java.util.Map<String, ?> extraData) {
            this.extraData = extraData;
            return this;
        }

        /**
         * Features.
         */
        public Builder features(java.util.List<String> features) {
            this.features = features;
            return this;
        }

        /**
         * GpuCount.
         */
        public Builder gpuCount(Integer gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * GpuUsed.
         */
        public Builder gpuUsed(Float gpuUsed) {
            this.gpuUsed = gpuUsed;
            return this;
        }

        /**
         * InstanceCount.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * InstanceMaxAllocatableCPU.
         */
        public Builder instanceMaxAllocatableCPU(Integer instanceMaxAllocatableCPU) {
            this.instanceMaxAllocatableCPU = instanceMaxAllocatableCPU;
            return this;
        }

        /**
         * InstanceMaxAllocatableGPU.
         */
        public Builder instanceMaxAllocatableGPU(Float instanceMaxAllocatableGPU) {
            this.instanceMaxAllocatableGPU = instanceMaxAllocatableGPU;
            return this;
        }

        /**
         * InstanceMaxAllocatableMemory.
         */
        public Builder instanceMaxAllocatableMemory(Integer instanceMaxAllocatableMemory) {
            this.instanceMaxAllocatableMemory = instanceMaxAllocatableMemory;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * MemoryUsed.
         */
        public Builder memoryUsed(Integer memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PostPaidInstanceCount.
         */
        public Builder postPaidInstanceCount(Integer postPaidInstanceCount) {
            this.postPaidInstanceCount = postPaidInstanceCount;
            return this;
        }

        /**
         * PrePaidInstanceCount.
         */
        public Builder prePaidInstanceCount(Integer prePaidInstanceCount) {
            this.prePaidInstanceCount = prePaidInstanceCount;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public Resource build() {
            return new Resource(this);
        } 

    } 

}
