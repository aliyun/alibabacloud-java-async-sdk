// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Resource} extends {@link TeaModel}
 *
 * <p>Resource</p>
 */
public class Resource extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("CpuCount")
    private Integer cpuCount;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ExtraData")
    private java.util.Map < String, ? > extraData;

    @NameInMap("GpuCount")
    private Integer gpuCount;

    @NameInMap("InstanceCount")
    private Integer instanceCount;

    @NameInMap("Message")
    private String message;

    @NameInMap("PostPaidInstanceCount")
    private Integer postPaidInstanceCount;

    @NameInMap("PrePaidInstanceCount")
    private Integer prePaidInstanceCount;

    @NameInMap("ResourceId")
    private String resourceId;

    @NameInMap("ResourceName")
    private String resourceName;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

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
        this.status = builder.status;
        this.updateTime = builder.updateTime;
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
        private String status; 
        private String updateTime; 

        /**
         * 资源组所在的集群
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 资源组CPU数量
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * 资源组创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 资源组自定义数据
         */
        public Builder extraData(java.util.Map < String, ? > extraData) {
            this.extraData = extraData;
            return this;
        }

        /**
         * 资源组GPU个数
         */
        public Builder gpuCount(Integer gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * 资源组实例个数
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * 资源组摘要信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 资源组按量付费实例个数
         */
        public Builder postPaidInstanceCount(Integer postPaidInstanceCount) {
            this.postPaidInstanceCount = postPaidInstanceCount;
            return this;
        }

        /**
         * 资源组预付费实例个数
         */
        public Builder prePaidInstanceCount(Integer prePaidInstanceCount) {
            this.prePaidInstanceCount = prePaidInstanceCount;
            return this;
        }

        /**
         * 资源组ID
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 资源组名字
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * 资源组的状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 资源组更新时间
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Resource build() {
            return new Resource(this);
        } 

    } 

}
