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
    @com.aliyun.core.annotation.NameInMap("ClusterSpec")
    private ClusterSpec clusterSpec;

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
        this.clusterSpec = builder.clusterSpec;
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
     * @return clusterSpec
     */
    public ClusterSpec getClusterSpec() {
        return this.clusterSpec;
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
        private ClusterSpec clusterSpec; 
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
            this.clusterSpec = request.clusterSpec;
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
         * <p>The quota allocation strategy. Currently, only ByNodeSpecs is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ByNodeSpecs</p>
         */
        public Builder allocateStrategy(String allocateStrategy) {
            this.putBodyParameter("AllocateStrategy", allocateStrategy);
            this.allocateStrategy = allocateStrategy;
            return this;
        }

        /**
         * <p>The specifications of the native cluster for the resource quota.</p>
         */
        public Builder clusterSpec(ClusterSpec clusterSpec) {
            this.putBodyParameter("ClusterSpec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * <p>The quota description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test quota</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The quota labels.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The minimum quota configuration. Valid options:</p>
         * <ul>
         * <li>ResourceAmount: specifies CPU, memory, or GPU details.</li>
         * <li>NodeSpecs: specifies the instance type and quantity.</li>
         * </ul>
         * <p>Constraints:</p>
         * <ul>
         * <li>If the quota allocates resources from a dedicated resource group, only the NodeSpecs strategy is allowed.</li>
         * <li>If the quota allocates resources from a parent quota, both strategies are allowed, but all child quotas must use the same strategy.</li>
         * <li>All GPU specifications within a quota must use the same GPU type.</li>
         * <li>Resource quotas with the ECS or Lingjun resource type can only use the NodeSpecs strategy.</li>
         * </ul>
         */
        public Builder min(ResourceSpec min) {
            this.putBodyParameter("Min", min);
            this.min = min;
            return this;
        }

        /**
         * <p>The parent QuotaId:</p>
         * <ul>
         * <li>If ParentQuotaId is empty, a root quota is created and machines are allocated from the dedicated resource group.</li>
         * <li>If ParentQuotaId is not empty, a child quota is created and resources are allocated from the nodes bound to the root quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>quota1ci8g793pgm</p>
         */
        public Builder parentQuotaId(String parentQuotaId) {
            this.putBodyParameter("ParentQuotaId", parentQuotaId);
            this.parentQuotaId = parentQuotaId;
            return this;
        }

        /**
         * <p>Four queuing policies are supported for quotas.</p>
         * <ul>
         * <li>PaiStrategyIntelligent: intelligent policies.</li>
         * <li>PaiStrategyBalance: balanced policy.</li>
         * <li>PaiStrategyRoundRobin: resource-priority policy.</li>
         * <li>PaiStrategyStrictFIFO: FIFO policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PaiStrategyIntelligent</p>
         */
        public Builder queueStrategy(String queueStrategy) {
            this.putBodyParameter("QueueStrategy", queueStrategy);
            this.queueStrategy = queueStrategy;
            return this;
        }

        /**
         * <p>QuotaConfig configuration constraints:</p>
         * <ul>
         * <li>This configuration does not take effect when the ECS or Lingjun resource type is used.</li>
         * <li>When the ACS resource type is used, the user VPC information and ACS configuration take effect.</li>
         * </ul>
         */
        public Builder quotaConfig(QuotaConfig quotaConfig) {
            this.putBodyParameter("QuotaConfig", quotaConfig);
            this.quotaConfig = quotaConfig;
            return this;
        }

        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-quota</p>
         */
        public Builder quotaName(String quotaName) {
            this.putBodyParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        /**
         * <p>The list of dedicated resource groups. Constraints:</p>
         * <ul>
         * <li>Only root quotas (where ParentQuotaId is empty) can allocate machines from resource groups.</li>
         * <li>The VPC configurations in the specified resource groups must be consistent.</li>
         * </ul>
         */
        public Builder resourceGroupIds(java.util.List<String> resourceGroupIds) {
            this.putBodyParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * <p>The quota resource type (Lingjun/ECS/ACS). Default value: ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
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
