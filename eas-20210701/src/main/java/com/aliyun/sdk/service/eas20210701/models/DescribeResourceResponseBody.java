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

    @NameInMap("ResourceType")
    private String resourceType;

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
        this.resourceType = builder.resourceType;
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
        private String resourceType; 
        private String status; 
        private String updateTime; 

        /**
         * The ID of the cluster to which the resource group belongs.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The total number of CPU cores.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * The time when the resource group was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The additional information, such as the connection status of a virtual private cloud (VPC) and the log status of Log Service.
         */
        public Builder extraData(String extraData) {
            this.extraData = extraData;
            return this;
        }

        /**
         * The total number of GPUs.
         */
        public Builder gpuCount(Integer gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * The total number of instances in the resource group.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the resource group owner.
         */
        public Builder ownerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * The total number of pay-as-you-go instances in the resource group.
         */
        public Builder postPaidInstanceCount(Integer postPaidInstanceCount) {
            this.postPaidInstanceCount = postPaidInstanceCount;
            return this;
        }

        /**
         * The total number of subscription instances in the resource group.
         */
        public Builder prePaidInstanceCount(Integer prePaidInstanceCount) {
            this.prePaidInstanceCount = prePaidInstanceCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the Elastic Algorithm Service (EAS) resource.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The name of the EAS resource.
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * - Dedicated
         * - SelfManaged
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The state of the resource group.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The time when the resource group was last updated.
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
