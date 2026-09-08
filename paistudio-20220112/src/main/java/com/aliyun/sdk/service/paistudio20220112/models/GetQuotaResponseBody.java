// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaResponseBody</p>
 */
public class GetQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocateStrategy")
    private String allocateStrategy;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("HyperZones")
    private java.util.List<String> hyperZones;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.NameInMap("LatestOperationId")
    private String latestOperationId;

    @com.aliyun.core.annotation.NameInMap("Min")
    private ResourceSpec min;

    @com.aliyun.core.annotation.NameInMap("ParentQuotaId")
    private String parentQuotaId;

    @com.aliyun.core.annotation.NameInMap("QueueStrategy")
    private String queueStrategy;

    @com.aliyun.core.annotation.NameInMap("QuotaCluster")
    private QuotaCluster quotaCluster;

    @com.aliyun.core.annotation.NameInMap("QuotaConfig")
    private QuotaConfig quotaConfig;

    @com.aliyun.core.annotation.NameInMap("QuotaDetails")
    private QuotaDetails quotaDetails;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private java.util.List<String> resourceGroupIds;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubQuotas")
    private java.util.List<QuotaIdName> subQuotas;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("Workspaces")
    private java.util.List<WorkspaceIdName> workspaces;

    private GetQuotaResponseBody(Builder builder) {
        this.allocateStrategy = builder.allocateStrategy;
        this.creatorId = builder.creatorId;
        this.description = builder.description;
        this.GPUType = builder.GPUType;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.hyperZones = builder.hyperZones;
        this.labels = builder.labels;
        this.latestOperationId = builder.latestOperationId;
        this.min = builder.min;
        this.parentQuotaId = builder.parentQuotaId;
        this.queueStrategy = builder.queueStrategy;
        this.quotaCluster = builder.quotaCluster;
        this.quotaConfig = builder.quotaConfig;
        this.quotaDetails = builder.quotaDetails;
        this.quotaId = builder.quotaId;
        this.quotaName = builder.quotaName;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.resourceGroupIds = builder.resourceGroupIds;
        this.resourceType = builder.resourceType;
        this.status = builder.status;
        this.subQuotas = builder.subQuotas;
        this.version = builder.version;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocateStrategy
     */
    public String getAllocateStrategy() {
        return this.allocateStrategy;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return gmtCreatedTime
     */
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return hyperZones
     */
    public java.util.List<String> getHyperZones() {
        return this.hyperZones;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return latestOperationId
     */
    public String getLatestOperationId() {
        return this.latestOperationId;
    }

    /**
     * @return min
     */
    public ResourceSpec getMin() {
        return this.min;
    }

    /**
     * @return parentQuotaId
     */
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    /**
     * @return queueStrategy
     */
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    /**
     * @return quotaCluster
     */
    public QuotaCluster getQuotaCluster() {
        return this.quotaCluster;
    }

    /**
     * @return quotaConfig
     */
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
    }

    /**
     * @return quotaDetails
     */
    public QuotaDetails getQuotaDetails() {
        return this.quotaDetails;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupIds
     */
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
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
     * @return subQuotas
     */
    public java.util.List<QuotaIdName> getSubQuotas() {
        return this.subQuotas;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return workspaces
     */
    public java.util.List<WorkspaceIdName> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private String allocateStrategy; 
        private String creatorId; 
        private String description; 
        private String GPUType; 
        private String gmtCreatedTime; 
        private String gmtModifiedTime; 
        private java.util.List<String> hyperZones; 
        private java.util.List<Label> labels; 
        private String latestOperationId; 
        private ResourceSpec min; 
        private String parentQuotaId; 
        private String queueStrategy; 
        private QuotaCluster quotaCluster; 
        private QuotaConfig quotaConfig; 
        private QuotaDetails quotaDetails; 
        private String quotaId; 
        private String quotaName; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private java.util.List<String> resourceGroupIds; 
        private String resourceType; 
        private String status; 
        private java.util.List<QuotaIdName> subQuotas; 
        private String version; 
        private java.util.List<WorkspaceIdName> workspaces; 

        private Builder() {
        } 

        private Builder(GetQuotaResponseBody model) {
            this.allocateStrategy = model.allocateStrategy;
            this.creatorId = model.creatorId;
            this.description = model.description;
            this.GPUType = model.GPUType;
            this.gmtCreatedTime = model.gmtCreatedTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.hyperZones = model.hyperZones;
            this.labels = model.labels;
            this.latestOperationId = model.latestOperationId;
            this.min = model.min;
            this.parentQuotaId = model.parentQuotaId;
            this.queueStrategy = model.queueStrategy;
            this.quotaCluster = model.quotaCluster;
            this.quotaConfig = model.quotaConfig;
            this.quotaDetails = model.quotaDetails;
            this.quotaId = model.quotaId;
            this.quotaName = model.quotaName;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.requestId = model.requestId;
            this.resourceGroupIds = model.resourceGroupIds;
            this.resourceType = model.resourceType;
            this.status = model.status;
            this.subQuotas = model.subQuotas;
            this.version = model.version;
            this.workspaces = model.workspaces;
        } 

        /**
         * <p>The resource allocation strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>ByNodeSpec</p>
         */
        public Builder allocateStrategy(String allocateStrategy) {
            this.allocateStrategy = allocateStrategy;
            return this;
        }

        /**
         * <p>The ID of the quota creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1884692****</p>
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The description of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test quota</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The GPU type.</p>
         * 
         * <strong>example:</strong>
         * <p>L20</p>
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * <p>The time when the quota was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }

        /**
         * <p>The time when the quota was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The list of high-performance network zones.</p>
         */
        public Builder hyperZones(java.util.List<String> hyperZones) {
            this.hyperZones = hyperZones;
            return this;
        }

        /**
         * <p>The labels of the quota.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The ID of the latest quota operation.</p>
         * 
         * <strong>example:</strong>
         * <p>operation****</p>
         */
        public Builder latestOperationId(String latestOperationId) {
            this.latestOperationId = latestOperationId;
            return this;
        }

        /**
         * <p>The minimum quota configuration.</p>
         */
        public Builder min(ResourceSpec min) {
            this.min = min;
            return this;
        }

        /**
         * <p>The ID of the parent quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota1ci8g79****</p>
         */
        public Builder parentQuotaId(String parentQuotaId) {
            this.parentQuotaId = parentQuotaId;
            return this;
        }

        /**
         * <p>The queuing strategy for tasks in the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>PaiStrategyIntelligent</p>
         */
        public Builder queueStrategy(String queueStrategy) {
            this.queueStrategy = queueStrategy;
            return this;
        }

        /**
         * <p>The cluster specifications and status composed of resources in the quota.</p>
         */
        public Builder quotaCluster(QuotaCluster quotaCluster) {
            this.quotaCluster = quotaCluster;
            return this;
        }

        /**
         * <p>The quota configuration:</p>
         * <ul>
         * <li><p>VPC information</p>
         * </li>
         * <li><p>Whether RDMA is supported</p>
         * </li>
         * <li><p>ACS configuration (takes effect when the resource type is ACS)</p>
         * </li>
         * </ul>
         */
        public Builder quotaConfig(QuotaConfig quotaConfig) {
            this.quotaConfig = quotaConfig;
            return this;
        }

        /**
         * <p>The details of the quota.</p>
         */
        public Builder quotaDetails(QuotaDetails quotaDetails) {
            this.quotaDetails = quotaDetails;
            return this;
        }

        /**
         * <p>The resource quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>quotajradxh4****</p>
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The name of the resource quota.</p>
         * 
         * <strong>example:</strong>
         * <p>test-quota</p>
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * <p>The error reason.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group information associated with the resource quota.</p>
         */
        public Builder resourceGroupIds(java.util.List<String> resourceGroupIds) {
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * <p>The resource type of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The status of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of sub-quotas under the quota.</p>
         */
        public Builder subQuotas(java.util.List<QuotaIdName> subQuotas) {
            this.subQuotas = subQuotas;
            return this;
        }

        /**
         * <p>The version information. Takes effect when the resource type is ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The workspaces associated with the quota.</p>
         */
        public Builder workspaces(java.util.List<WorkspaceIdName> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public GetQuotaResponseBody build() {
            return new GetQuotaResponseBody(this);
        } 

    } 

}
