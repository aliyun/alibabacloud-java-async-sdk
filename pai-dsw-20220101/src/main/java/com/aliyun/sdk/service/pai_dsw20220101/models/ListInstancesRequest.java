// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorType")
    private String acceleratorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    private String createUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuType")
    private String gpuType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map<String, ?> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxCpu")
    private String maxCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxGpu")
    private String maxGpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxGpuMemory")
    private String maxGpuMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxMemory")
    private String maxMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinCpu")
    private String minCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinGpu")
    private String minGpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinGpuMemory")
    private String minGpuMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinMemory")
    private String minMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldInfo")
    private String oversoldInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldType")
    private String oversoldType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.acceleratorType = builder.acceleratorType;
        this.accessibility = builder.accessibility;
        this.createUserId = builder.createUserId;
        this.gpuType = builder.gpuType;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.labels = builder.labels;
        this.maxCpu = builder.maxCpu;
        this.maxGpu = builder.maxGpu;
        this.maxGpuMemory = builder.maxGpuMemory;
        this.maxMemory = builder.maxMemory;
        this.minCpu = builder.minCpu;
        this.minGpu = builder.minGpu;
        this.minGpuMemory = builder.minGpuMemory;
        this.minMemory = builder.minMemory;
        this.order = builder.order;
        this.oversoldInfo = builder.oversoldInfo;
        this.oversoldType = builder.oversoldType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentType = builder.paymentType;
        this.resourceId = builder.resourceId;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.tag = builder.tag;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    /**
     * @return maxCpu
     */
    public String getMaxCpu() {
        return this.maxCpu;
    }

    /**
     * @return maxGpu
     */
    public String getMaxGpu() {
        return this.maxGpu;
    }

    /**
     * @return maxGpuMemory
     */
    public String getMaxGpuMemory() {
        return this.maxGpuMemory;
    }

    /**
     * @return maxMemory
     */
    public String getMaxMemory() {
        return this.maxMemory;
    }

    /**
     * @return minCpu
     */
    public String getMinCpu() {
        return this.minCpu;
    }

    /**
     * @return minGpu
     */
    public String getMinGpu() {
        return this.minGpu;
    }

    /**
     * @return minGpuMemory
     */
    public String getMinGpuMemory() {
        return this.minGpuMemory;
    }

    /**
     * @return minMemory
     */
    public String getMinMemory() {
        return this.minMemory;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return oversoldInfo
     */
    public String getOversoldInfo() {
        return this.oversoldInfo;
    }

    /**
     * @return oversoldType
     */
    public String getOversoldType() {
        return this.oversoldType;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String acceleratorType; 
        private String accessibility; 
        private String createUserId; 
        private String gpuType; 
        private String imageName; 
        private String instanceId; 
        private String instanceName; 
        private java.util.Map<String, ?> labels; 
        private String maxCpu; 
        private String maxGpu; 
        private String maxGpuMemory; 
        private String maxMemory; 
        private String minCpu; 
        private String minGpu; 
        private String minGpuMemory; 
        private String minMemory; 
        private String order; 
        private String oversoldInfo; 
        private String oversoldType; 
        private Long pageNumber; 
        private Long pageSize; 
        private String paymentType; 
        private String resourceId; 
        private String sortBy; 
        private String status; 
        private java.util.List<Tag> tag; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.acceleratorType = request.acceleratorType;
            this.accessibility = request.accessibility;
            this.createUserId = request.createUserId;
            this.gpuType = request.gpuType;
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.labels = request.labels;
            this.maxCpu = request.maxCpu;
            this.maxGpu = request.maxGpu;
            this.maxGpuMemory = request.maxGpuMemory;
            this.maxMemory = request.maxMemory;
            this.minCpu = request.minCpu;
            this.minGpu = request.minGpu;
            this.minGpuMemory = request.minGpuMemory;
            this.minMemory = request.minMemory;
            this.order = request.order;
            this.oversoldInfo = request.oversoldInfo;
            this.oversoldType = request.oversoldType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentType = request.paymentType;
            this.resourceId = request.resourceId;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.tag = request.tag;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The accelerator type.</p>
         * <ul>
         * <li>CPU: Only CPU computing is used.</li>
         * <li>GPU: GPUs are used to accelerate computing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * <p>The accessibility. Valid values:</p>
         * <ul>
         * <li>PRIVATE (default): The instances are accessible only to you and the administrator of the workspace.</li>
         * <li>PUBLIC: The instances are accessible only to all members in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>12345*****67890</p>
         */
        public Builder createUserId(String createUserId) {
            this.putQueryParameter("CreateUserId", createUserId);
            this.createUserId = createUserId;
            return this;
        }

        /**
         * <p>The GPU type.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA A10</p>
         */
        public Builder gpuType(String gpuType) {
            this.putQueryParameter("GpuType", gpuType);
            this.gpuType = gpuType;
            return this;
        }

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>modelscope:1.9.4-pytorch2.0.1tensorflow2.13.0-cpu-py38-ubuntu20.04</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/470439.html">ListInstances</a> to obtain the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>training_data</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The labels. A maximum of four labels are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;key1&quot;: &quot;value1&quot;,
         *   &quot;key2&quot;: &quot;value2&quot;,
         *   &quot;key3&quot;: &quot;value3&quot;
         * }</p>
         */
        public Builder labels(java.util.Map<String, ?> labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The maximum number of CPUs. Unit: 0.001 CPU. The value 1000 indicates one CPU.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        public Builder maxCpu(String maxCpu) {
            this.putQueryParameter("MaxCpu", maxCpu);
            this.maxCpu = maxCpu;
            return this;
        }

        /**
         * <p>The maximum number of GPUs. Unit: 0.001 GPU. The value 1000 indicates one GPU.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        public Builder maxGpu(String maxGpu) {
            this.putQueryParameter("MaxGpu", maxGpu);
            this.maxGpu = maxGpu;
            return this;
        }

        /**
         * <p>The maximum memory size per GPU card. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder maxGpuMemory(String maxGpuMemory) {
            this.putQueryParameter("MaxGpuMemory", maxGpuMemory);
            this.maxGpuMemory = maxGpuMemory;
            return this;
        }

        /**
         * <p>The maximum memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        public Builder maxMemory(String maxMemory) {
            this.putQueryParameter("MaxMemory", maxMemory);
            this.maxMemory = maxMemory;
            return this;
        }

        /**
         * <p>The minimum number of CPUs. Unit: 0.001 CPU. The value 1000 indicates one CPU.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder minCpu(String minCpu) {
            this.putQueryParameter("MinCpu", minCpu);
            this.minCpu = minCpu;
            return this;
        }

        /**
         * <p>The minimum number of GPUs. Unit: 0.001 GPU. The value 1000 indicates one GPU.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder minGpu(String minGpu) {
            this.putQueryParameter("MinGpu", minGpu);
            this.minGpu = minGpu;
            return this;
        }

        /**
         * <p>The minimum memory size per GPU card. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder minGpuMemory(String minGpuMemory) {
            this.putQueryParameter("MinGpuMemory", minGpuMemory);
            this.minGpuMemory = minGpuMemory;
            return this;
        }

        /**
         * <p>The minimum memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder minMemory(String minMemory) {
            this.putQueryParameter("MinMemory", minMemory);
            this.minMemory = minMemory;
            return this;
        }

        /**
         * <p>The order that you use to sort the query results.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ASC</li>
         * <li>DESC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OversoldInfo.
         */
        public Builder oversoldInfo(String oversoldInfo) {
            this.putQueryParameter("OversoldInfo", oversoldInfo);
            this.oversoldInfo = oversoldInfo;
            return this;
        }

        /**
         * OversoldType.
         */
        public Builder oversoldType(String oversoldType) {
            this.putQueryParameter("OversoldType", oversoldType);
            this.oversoldType = oversoldType;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PayAsYouGo</li>
         * <li>Subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The resource group ID. If you leave this parameter empty, the instances in the pay-as-you-go resource group are queried. If you set this parameter to ALL, all instances are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123456789</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The field that you use to sort the query results.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Priority</li>
         * <li>GmtCreateTime</li>
         * <li>GmtModifiedTime</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gmtCreate</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The instance status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>SaveFailed</li>
         * <li>Stopped</li>
         * <li>Failed</li>
         * <li>ResourceAllocating</li>
         * <li>Stopping</li>
         * <li>Updating</li>
         * <li>Saving</li>
         * <li>Queuing</li>
         * <li>Recovering</li>
         * <li>Starting</li>
         * <li>Running</li>
         * <li>Saved</li>
         * <li>Deleting</li>
         * <li>EnvPreparing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40823</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesRequest} extends {@link TeaModel}
     *
     * <p>ListInstancesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
