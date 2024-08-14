// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.Map < String, ? > labels;

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
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentType = builder.paymentType;
        this.resourceId = builder.resourceId;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
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
    public java.util.Map < String, ? > getLabels() {
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
        private java.util.Map < String, ? > labels; 
        private String maxCpu; 
        private String maxGpu; 
        private String maxGpuMemory; 
        private String maxMemory; 
        private String minCpu; 
        private String minGpu; 
        private String minGpuMemory; 
        private String minMemory; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String paymentType; 
        private String resourceId; 
        private String sortBy; 
        private String status; 
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
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentType = request.paymentType;
            this.resourceId = request.resourceId;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AcceleratorType.
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * CreateUserId.
         */
        public Builder createUserId(String createUserId) {
            this.putQueryParameter("CreateUserId", createUserId);
            this.createUserId = createUserId;
            return this;
        }

        /**
         * GpuType.
         */
        public Builder gpuType(String gpuType) {
            this.putQueryParameter("GpuType", gpuType);
            this.gpuType = gpuType;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.Map < String, ? > labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * MaxCpu.
         */
        public Builder maxCpu(String maxCpu) {
            this.putQueryParameter("MaxCpu", maxCpu);
            this.maxCpu = maxCpu;
            return this;
        }

        /**
         * MaxGpu.
         */
        public Builder maxGpu(String maxGpu) {
            this.putQueryParameter("MaxGpu", maxGpu);
            this.maxGpu = maxGpu;
            return this;
        }

        /**
         * MaxGpuMemory.
         */
        public Builder maxGpuMemory(String maxGpuMemory) {
            this.putQueryParameter("MaxGpuMemory", maxGpuMemory);
            this.maxGpuMemory = maxGpuMemory;
            return this;
        }

        /**
         * MaxMemory.
         */
        public Builder maxMemory(String maxMemory) {
            this.putQueryParameter("MaxMemory", maxMemory);
            this.maxMemory = maxMemory;
            return this;
        }

        /**
         * MinCpu.
         */
        public Builder minCpu(String minCpu) {
            this.putQueryParameter("MinCpu", minCpu);
            this.minCpu = minCpu;
            return this;
        }

        /**
         * MinGpu.
         */
        public Builder minGpu(String minGpu) {
            this.putQueryParameter("MinGpu", minGpu);
            this.minGpu = minGpu;
            return this;
        }

        /**
         * MinGpuMemory.
         */
        public Builder minGpuMemory(String minGpuMemory) {
            this.putQueryParameter("MinGpuMemory", minGpuMemory);
            this.minGpuMemory = minGpuMemory;
            return this;
        }

        /**
         * MinMemory.
         */
        public Builder minMemory(String minMemory) {
            this.putQueryParameter("MinMemory", minMemory);
            this.minMemory = minMemory;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * WorkspaceId.
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

}
