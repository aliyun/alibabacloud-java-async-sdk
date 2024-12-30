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
 * {@link CreateQuotaRequest} extends {@link RequestModel}
 *
 * <p>CreateQuotaRequest</p>
 */
public class CreateQuotaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllocateStrategy")
    private String allocateStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Min")
    private ResourceSpec min;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentQuotaId")
    private String parentQuotaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueueStrategy")
    private String queueStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaConfig")
    private QuotaConfig quotaConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private java.util.List<String> resourceGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private CreateQuotaRequest(Builder builder) {
        super(builder);
        this.allocateStrategy = builder.allocateStrategy;
        this.description = builder.description;
        this.labels = builder.labels;
        this.min = builder.min;
        this.parentQuotaId = builder.parentQuotaId;
        this.queueStrategy = builder.queueStrategy;
        this.quotaConfig = builder.quotaConfig;
        this.quotaName = builder.quotaName;
        this.resourceGroupIds = builder.resourceGroupIds;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQuotaRequest create() {
        return builder().build();
    }

    @Override
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
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
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
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

    public static final class Builder extends Request.Builder<CreateQuotaRequest, Builder> {
        private String allocateStrategy; 
        private String description; 
        private java.util.List<Label> labels; 
        private ResourceSpec min; 
        private String parentQuotaId; 
        private String queueStrategy; 
        private QuotaConfig quotaConfig; 
        private String quotaName; 
        private java.util.List<String> resourceGroupIds; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateQuotaRequest request) {
            super(request);
            this.allocateStrategy = request.allocateStrategy;
            this.description = request.description;
            this.labels = request.labels;
            this.min = request.min;
            this.parentQuotaId = request.parentQuotaId;
            this.queueStrategy = request.queueStrategy;
            this.quotaConfig = request.quotaConfig;
            this.quotaName = request.quotaName;
            this.resourceGroupIds = request.resourceGroupIds;
            this.resourceType = request.resourceType;
        } 

        /**
         * AllocateStrategy.
         */
        public Builder allocateStrategy(String allocateStrategy) {
            this.putBodyParameter("AllocateStrategy", allocateStrategy);
            this.allocateStrategy = allocateStrategy;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Min.
         */
        public Builder min(ResourceSpec min) {
            this.putBodyParameter("Min", min);
            this.min = min;
            return this;
        }

        /**
         * ParentQuotaId.
         */
        public Builder parentQuotaId(String parentQuotaId) {
            this.putBodyParameter("ParentQuotaId", parentQuotaId);
            this.parentQuotaId = parentQuotaId;
            return this;
        }

        /**
         * QueueStrategy.
         */
        public Builder queueStrategy(String queueStrategy) {
            this.putBodyParameter("QueueStrategy", queueStrategy);
            this.queueStrategy = queueStrategy;
            return this;
        }

        /**
         * QuotaConfig.
         */
        public Builder quotaConfig(QuotaConfig quotaConfig) {
            this.putBodyParameter("QuotaConfig", quotaConfig);
            this.quotaConfig = quotaConfig;
            return this;
        }

        /**
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.putBodyParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        /**
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(java.util.List<String> resourceGroupIds) {
            this.putBodyParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public CreateQuotaRequest build() {
            return new CreateQuotaRequest(this);
        } 

    } 

}
