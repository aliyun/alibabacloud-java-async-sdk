// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceResponseBody</p>
 */
public class DescribeResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("CpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExtraData")
    private String extraData;

    @com.aliyun.core.annotation.NameInMap("GpuCount")
    private Integer gpuCount;

    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OwnerUid")
    private String ownerUid;

    @com.aliyun.core.annotation.NameInMap("PostPaidInstanceCount")
    private Integer postPaidInstanceCount;

    @com.aliyun.core.annotation.NameInMap("PrePaidInstanceCount")
    private Integer prePaidInstanceCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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
         * <p>The ID of the cluster to which the resource group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The total number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * <p>The time when the resource group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-19T14:19:42Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The additional information, such as the connection status of a virtual private cloud (VPC) and the log status of Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;vswitch_id&quot;:&quot;vsw-bp17uo6xebcusy****&quot;,&quot;gpu_share&quot;:true,&quot;aux_vswitch_id_list&quot;:[&quot;vsw-bp13b3pvjap3vxn****&quot;,&quot;vsw-bp1nls8o5hk8mt8*****&quot;],&quot;security_group_id&quot;:&quot;sg-bp1j1z7297hcink*****&quot;,&quot;vpc_id&quot;:&quot;vpc-bp1kjr3rfyhx01*****&quot;,&quot;destination_cidr&quot;:&quot;172.16.0.12/28&quot;,&quot;role_arn&quot;:&quot;acs:ram::1157703270*****:role/AliyunServiceRoleForPaiEas&quot;,&quot;sls_project&quot;:&quot;&quot;,&quot;sls_logstore&quot;:&quot;&quot;,&quot;sls_status&quot;:&quot;ResourceReady&quot;,&quot;sls_message&quot;:&quot;&quot;,&quot;update_time&quot;:&quot;&quot;}</p>
         */
        public Builder extraData(String extraData) {
            this.extraData = extraData;
            return this;
        }

        /**
         * <p>The total number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gpuCount(Integer gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * <p>The total number of instances in the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource is ready</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the resource group owner.</p>
         * 
         * <strong>example:</strong>
         * <p>14401087478****</p>
         */
        public Builder ownerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * <p>The total number of pay-as-you-go instances in the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder postPaidInstanceCount(Integer postPaidInstanceCount) {
            this.postPaidInstanceCount = postPaidInstanceCount;
            return this;
        }

        /**
         * <p>The total number of subscription instances in the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder prePaidInstanceCount(Integer prePaidInstanceCount) {
            this.prePaidInstanceCount = prePaidInstanceCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>902976F2-6FAF-5404-8A4D-6CC223***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the Elastic Algorithm Service (EAS) resource.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-glkfpsxuw57x1h*****</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of the EAS resource.</p>
         * 
         * <strong>example:</strong>
         * <p>my-resouce****</p>
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The type of the resource group. Valid values:</p>
         * <ul>
         * <li>Dedicated: the dedicated resource group.</li>
         * <li>SelfManaged: the self-managed resource group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The state of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceReady</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the resource group was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-24T11:52:17Z</p>
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
