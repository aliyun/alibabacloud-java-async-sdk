// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Label > labels;

    @com.aliyun.core.annotation.NameInMap("LatestOperationId")
    private String latestOperationId;

    @com.aliyun.core.annotation.NameInMap("Min")
    private ResourceSpec min;

    @com.aliyun.core.annotation.NameInMap("ParentQuotaId")
    private String parentQuotaId;

    @com.aliyun.core.annotation.NameInMap("QueueStrategy")
    private String queueStrategy;

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
    private java.util.List < String > resourceGroupIds;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubQuotas")
    private java.util.List < QuotaIdName > subQuotas;

    @com.aliyun.core.annotation.NameInMap("Workspaces")
    private java.util.List < WorkspaceIdName > workspaces;

    private GetQuotaResponseBody(Builder builder) {
        this.allocateStrategy = builder.allocateStrategy;
        this.creatorId = builder.creatorId;
        this.description = builder.description;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labels = builder.labels;
        this.latestOperationId = builder.latestOperationId;
        this.min = builder.min;
        this.parentQuotaId = builder.parentQuotaId;
        this.queueStrategy = builder.queueStrategy;
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
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaResponseBody create() {
        return builder().build();
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
     * @return labels
     */
    public java.util.List < Label > getLabels() {
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
    public java.util.List < String > getResourceGroupIds() {
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
    public java.util.List < QuotaIdName > getSubQuotas() {
        return this.subQuotas;
    }

    /**
     * @return workspaces
     */
    public java.util.List < WorkspaceIdName > getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private String allocateStrategy; 
        private String creatorId; 
        private String description; 
        private String gmtCreatedTime; 
        private String gmtModifiedTime; 
        private java.util.List < Label > labels; 
        private String latestOperationId; 
        private ResourceSpec min; 
        private String parentQuotaId; 
        private String queueStrategy; 
        private QuotaConfig quotaConfig; 
        private QuotaDetails quotaDetails; 
        private String quotaId; 
        private String quotaName; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private java.util.List < String > resourceGroupIds; 
        private String resourceType; 
        private String status; 
        private java.util.List < QuotaIdName > subQuotas; 
        private java.util.List < WorkspaceIdName > workspaces; 

        /**
         * AllocateStrategy.
         */
        public Builder allocateStrategy(String allocateStrategy) {
            this.allocateStrategy = allocateStrategy;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreatedTime.
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * LatestOperationId.
         */
        public Builder latestOperationId(String latestOperationId) {
            this.latestOperationId = latestOperationId;
            return this;
        }

        /**
         * Min.
         */
        public Builder min(ResourceSpec min) {
            this.min = min;
            return this;
        }

        /**
         * ParentQuotaId.
         */
        public Builder parentQuotaId(String parentQuotaId) {
            this.parentQuotaId = parentQuotaId;
            return this;
        }

        /**
         * QueueStrategy.
         */
        public Builder queueStrategy(String queueStrategy) {
            this.queueStrategy = queueStrategy;
            return this;
        }

        /**
         * QuotaConfig.
         */
        public Builder quotaConfig(QuotaConfig quotaConfig) {
            this.quotaConfig = quotaConfig;
            return this;
        }

        /**
         * QuotaDetails.
         */
        public Builder quotaDetails(QuotaDetails quotaDetails) {
            this.quotaDetails = quotaDetails;
            return this;
        }

        /**
         * Quota Id
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
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
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(java.util.List < String > resourceGroupIds) {
            this.resourceGroupIds = resourceGroupIds;
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
         * SubQuotas.
         */
        public Builder subQuotas(java.util.List < QuotaIdName > subQuotas) {
            this.subQuotas = subQuotas;
            return this;
        }

        /**
         * Workspaces.
         */
        public Builder workspaces(java.util.List < WorkspaceIdName > workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public GetQuotaResponseBody build() {
            return new GetQuotaResponseBody(this);
        } 

    } 

}
