// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExtraData")
    private java.util.Map < String, ? > extraData;

    @com.aliyun.core.annotation.NameInMap("GpuCount")
    private Integer gpuCount;

    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    private Integer instanceCount;

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
        this.createTime = builder.createTime;
        this.extraData = builder.extraData;
        this.gpuCount = builder.gpuCount;
        this.instanceCount = builder.instanceCount;
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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return extraData
     */
    public java.util.Map < String, ? > getExtraData() {
        return this.extraData;
    }

    /**
     * @return gpuCount
     */
    public Integer getGpuCount() {
        return this.gpuCount;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
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
        private String createTime; 
        private java.util.Map < String, ? > extraData; 
        private Integer gpuCount; 
        private Integer instanceCount; 
        private String message; 
        private Integer postPaidInstanceCount; 
        private Integer prePaidInstanceCount; 
        private String resourceId; 
        private String resourceName; 
        private String resourceType; 
        private String status; 
        private String updateTime; 
        private String vendor; 

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
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExtraData.
         */
        public Builder extraData(java.util.Map < String, ? > extraData) {
            this.extraData = extraData;
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
         * InstanceCount.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
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
