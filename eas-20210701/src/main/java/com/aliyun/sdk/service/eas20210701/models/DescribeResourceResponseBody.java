// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceResponseBody</p>
 */
public class DescribeResourceResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("CpuCount")
    private Integer cpuCount;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ExtraData")
    private String extraData;

    @NameInMap("GpuCount")
    private Integer gpuCount;

    @NameInMap("InstanceCount")
    private Integer instanceCount;

    @NameInMap("Message")
    private String message;

    @NameInMap("OwnerUid")
    private String ownerUid;

    @NameInMap("PostPaidInstanceCount")
    private Integer postPaidInstanceCount;

    @NameInMap("PrePaidInstanceCount")
    private Integer prePaidInstanceCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceId")
    private String resourceId;

    @NameInMap("ResourceName")
    private String resourceName;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    private DescribeResourceResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.cpuCount = builder.cpuCount;
        this.createTime = builder.createTime;
        this.extraData = builder.extraData;
        this.gpuCount = builder.gpuCount;
        this.instanceCount = builder.instanceCount;
        this.message = builder.message;
        this.ownerUid = builder.ownerUid;
        this.postPaidInstanceCount = builder.postPaidInstanceCount;
        this.prePaidInstanceCount = builder.prePaidInstanceCount;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceResponseBody create() {
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
    public String getExtraData() {
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
     * @return ownerUid
     */
    public String getOwnerUid() {
        return this.ownerUid;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String extraData; 
        private Integer gpuCount; 
        private Integer instanceCount; 
        private String message; 
        private String ownerUid; 
        private Integer postPaidInstanceCount; 
        private Integer prePaidInstanceCount; 
        private String requestId; 
        private String resourceId; 
        private String resourceName; 
        private String status; 
        private String updateTime; 

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
        public Builder extraData(String extraData) {
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
         * OwnerUid.
         */
        public Builder ownerUid(String ownerUid) {
            this.ownerUid = ownerUid;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeResourceResponseBody build() {
            return new DescribeResourceResponseBody(this);
        } 

    } 

}
