// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateCostRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCostRuleResponseBody</p>
 */
public class CreateCostRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AffectedModelApiIds")
    private java.util.List<String> affectedModelApiIds;

    @com.aliyun.core.annotation.NameInMap("CacheCostPointsPerMillion")
    private String cacheCostPointsPerMillion;

    @com.aliyun.core.annotation.NameInMap("CacheCreationCostPointsPerMillion")
    private String cacheCreationCostPointsPerMillion;

    @com.aliyun.core.annotation.NameInMap("CostRuleId")
    private String costRuleId;

    @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
    private String effectiveEndTime;

    @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
    private String effectiveStartTime;

    @com.aliyun.core.annotation.NameInMap("EffectiveTargetType")
    private String effectiveTargetType;

    @com.aliyun.core.annotation.NameInMap("EffectiveTargetValue")
    private String effectiveTargetValue;

    @com.aliyun.core.annotation.NameInMap("ExplicitCacheCostPointsPerMillion")
    private String explicitCacheCostPointsPerMillion;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    private String gwClusterId;

    @com.aliyun.core.annotation.NameInMap("ImageCostPointsPerCount")
    private String imageCostPointsPerCount;

    @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
    private String inputCostPointsPerMillion;

    @com.aliyun.core.annotation.NameInMap("InputTokenTier")
    private String inputTokenTier;

    @com.aliyun.core.annotation.NameInMap("InputTokenTiers")
    private java.util.List<InputTokenTiers> inputTokenTiers;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("ModelServiceId")
    private String modelServiceId;

    @com.aliyun.core.annotation.NameInMap("ModelServiceName")
    private String modelServiceName;

    @com.aliyun.core.annotation.NameInMap("OutputCostPointsPerMillion")
    private String outputCostPointsPerMillion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VideoCostPointsPerSecond")
    private String videoCostPointsPerSecond;

    private CreateCostRuleResponseBody(Builder builder) {
        this.affectedModelApiIds = builder.affectedModelApiIds;
        this.cacheCostPointsPerMillion = builder.cacheCostPointsPerMillion;
        this.cacheCreationCostPointsPerMillion = builder.cacheCreationCostPointsPerMillion;
        this.costRuleId = builder.costRuleId;
        this.effectiveEndTime = builder.effectiveEndTime;
        this.effectiveStartTime = builder.effectiveStartTime;
        this.effectiveTargetType = builder.effectiveTargetType;
        this.effectiveTargetValue = builder.effectiveTargetValue;
        this.explicitCacheCostPointsPerMillion = builder.explicitCacheCostPointsPerMillion;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.gwClusterId = builder.gwClusterId;
        this.imageCostPointsPerCount = builder.imageCostPointsPerCount;
        this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
        this.inputTokenTier = builder.inputTokenTier;
        this.inputTokenTiers = builder.inputTokenTiers;
        this.modelName = builder.modelName;
        this.modelServiceId = builder.modelServiceId;
        this.modelServiceName = builder.modelServiceName;
        this.outputCostPointsPerMillion = builder.outputCostPointsPerMillion;
        this.requestId = builder.requestId;
        this.videoCostPointsPerSecond = builder.videoCostPointsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCostRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectedModelApiIds
     */
    public java.util.List<String> getAffectedModelApiIds() {
        return this.affectedModelApiIds;
    }

    /**
     * @return cacheCostPointsPerMillion
     */
    public String getCacheCostPointsPerMillion() {
        return this.cacheCostPointsPerMillion;
    }

    /**
     * @return cacheCreationCostPointsPerMillion
     */
    public String getCacheCreationCostPointsPerMillion() {
        return this.cacheCreationCostPointsPerMillion;
    }

    /**
     * @return costRuleId
     */
    public String getCostRuleId() {
        return this.costRuleId;
    }

    /**
     * @return effectiveEndTime
     */
    public String getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    /**
     * @return effectiveStartTime
     */
    public String getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    /**
     * @return effectiveTargetType
     */
    public String getEffectiveTargetType() {
        return this.effectiveTargetType;
    }

    /**
     * @return effectiveTargetValue
     */
    public String getEffectiveTargetValue() {
        return this.effectiveTargetValue;
    }

    /**
     * @return explicitCacheCostPointsPerMillion
     */
    public String getExplicitCacheCostPointsPerMillion() {
        return this.explicitCacheCostPointsPerMillion;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return imageCostPointsPerCount
     */
    public String getImageCostPointsPerCount() {
        return this.imageCostPointsPerCount;
    }

    /**
     * @return inputCostPointsPerMillion
     */
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
    }

    /**
     * @return inputTokenTier
     */
    public String getInputTokenTier() {
        return this.inputTokenTier;
    }

    /**
     * @return inputTokenTiers
     */
    public java.util.List<InputTokenTiers> getInputTokenTiers() {
        return this.inputTokenTiers;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    /**
     * @return outputCostPointsPerMillion
     */
    public String getOutputCostPointsPerMillion() {
        return this.outputCostPointsPerMillion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoCostPointsPerSecond
     */
    public String getVideoCostPointsPerSecond() {
        return this.videoCostPointsPerSecond;
    }

    public static final class Builder {
        private java.util.List<String> affectedModelApiIds; 
        private String cacheCostPointsPerMillion; 
        private String cacheCreationCostPointsPerMillion; 
        private String costRuleId; 
        private String effectiveEndTime; 
        private String effectiveStartTime; 
        private String effectiveTargetType; 
        private String effectiveTargetValue; 
        private String explicitCacheCostPointsPerMillion; 
        private String gmtCreated; 
        private String gmtModified; 
        private String gwClusterId; 
        private String imageCostPointsPerCount; 
        private String inputCostPointsPerMillion; 
        private String inputTokenTier; 
        private java.util.List<InputTokenTiers> inputTokenTiers; 
        private String modelName; 
        private String modelServiceId; 
        private String modelServiceName; 
        private String outputCostPointsPerMillion; 
        private String requestId; 
        private String videoCostPointsPerSecond; 

        private Builder() {
        } 

        private Builder(CreateCostRuleResponseBody model) {
            this.affectedModelApiIds = model.affectedModelApiIds;
            this.cacheCostPointsPerMillion = model.cacheCostPointsPerMillion;
            this.cacheCreationCostPointsPerMillion = model.cacheCreationCostPointsPerMillion;
            this.costRuleId = model.costRuleId;
            this.effectiveEndTime = model.effectiveEndTime;
            this.effectiveStartTime = model.effectiveStartTime;
            this.effectiveTargetType = model.effectiveTargetType;
            this.effectiveTargetValue = model.effectiveTargetValue;
            this.explicitCacheCostPointsPerMillion = model.explicitCacheCostPointsPerMillion;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.gwClusterId = model.gwClusterId;
            this.imageCostPointsPerCount = model.imageCostPointsPerCount;
            this.inputCostPointsPerMillion = model.inputCostPointsPerMillion;
            this.inputTokenTier = model.inputTokenTier;
            this.inputTokenTiers = model.inputTokenTiers;
            this.modelName = model.modelName;
            this.modelServiceId = model.modelServiceId;
            this.modelServiceName = model.modelServiceName;
            this.outputCostPointsPerMillion = model.outputCostPointsPerMillion;
            this.requestId = model.requestId;
            this.videoCostPointsPerSecond = model.videoCostPointsPerSecond;
        } 

        /**
         * <p>The list of model API IDs affected by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ma-2ze3x6i1d7g5rto28&quot;]</p>
         */
        public Builder affectedModelApiIds(java.util.List<String> affectedModelApiIds) {
            this.affectedModelApiIds = affectedModelApiIds;
            return this;
        }

        /**
         * <p>The cache read cost points per million tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder cacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
            this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The cache creation (write) cost points per million tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder cacheCreationCostPointsPerMillion(String cacheCreationCostPointsPerMillion) {
            this.cacheCreationCostPointsPerMillion = cacheCreationCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The cost rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>924d450014e64e88ac6e8486f8e990**</p>
         */
        public Builder costRuleId(String costRuleId) {
            this.costRuleId = costRuleId;
            return this;
        }

        /**
         * <p>The effective end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01T00:00:00Z</p>
         */
        public Builder effectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }

        /**
         * <p>The effective start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        public Builder effectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * <p>The effective target type. Valid values: global, consumerGroup, and consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder effectiveTargetType(String effectiveTargetType) {
            this.effectiveTargetType = effectiveTargetType;
            return this;
        }

        /**
         * <p>The effective target value. This parameter has a value when the effective target type is not global.</p>
         * 
         * <strong>example:</strong>
         * <p>c-xxx</p>
         */
        public Builder effectiveTargetValue(String effectiveTargetValue) {
            this.effectiveTargetValue = effectiveTargetValue;
            return this;
        }

        /**
         * <p>The explicit cache read cost points per million tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder explicitCacheCostPointsPerMillion(String explicitCacheCostPointsPerMillion) {
            this.explicitCacheCostPointsPerMillion = explicitCacheCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01T12:00:00Z</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01T12:00:00Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The ID of the gateway instance to which the cost rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-2ze3x6i1d7g5rto28</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The image input cost points per image.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder imageCostPointsPerCount(String imageCostPointsPerCount) {
            this.imageCostPointsPerCount = imageCostPointsPerCount;
            return this;
        }

        /**
         * <p>The input cost points per million tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The input token tier. An empty value indicates the default tier.</p>
         * 
         * <strong>example:</strong>
         * <p>0-32K</p>
         */
        public Builder inputTokenTier(String inputTokenTier) {
            this.inputTokenTier = inputTokenTier;
            return this;
        }

        /**
         * <p>The tiered pricing for input tokens. Pricing is applied per tier and is not cumulative. Each element contains Tier and InputCostPointsPerMillion.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1000&quot;}]</p>
         */
        public Builder inputTokenTiers(java.util.List<InputTokenTiers> inputTokenTiers) {
            this.inputTokenTiers = inputTokenTiers;
            return this;
        }

        /**
         * <p>The name of the pricing model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The ID of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-2ze3x6i1d7g5rto28</p>
         */
        public Builder modelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }

        /**
         * <p>The model service name.</p>
         * 
         * <strong>example:</strong>
         * <p>model-service-a</p>
         */
        public Builder modelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
            return this;
        }

        /**
         * <p>The output cost points per million tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder outputCostPointsPerMillion(String outputCostPointsPerMillion) {
            this.outputCostPointsPerMillion = outputCostPointsPerMillion;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>580EF224-9647-59E7-9950-D9EBFD6A2921</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The video input cost points per second.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder videoCostPointsPerSecond(String videoCostPointsPerSecond) {
            this.videoCostPointsPerSecond = videoCostPointsPerSecond;
            return this;
        }

        public CreateCostRuleResponseBody build() {
            return new CreateCostRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCostRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCostRuleResponseBody</p>
     */
    public static class InputTokenTiers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
        private String inputCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("Tier")
        private String tier;

        private InputTokenTiers(Builder builder) {
            this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
            this.tier = builder.tier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputTokenTiers create() {
            return builder().build();
        }

        /**
         * @return inputCostPointsPerMillion
         */
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        /**
         * @return tier
         */
        public String getTier() {
            return this.tier;
        }

        public static final class Builder {
            private String inputCostPointsPerMillion; 
            private String tier; 

            private Builder() {
            } 

            private Builder(InputTokenTiers model) {
                this.inputCostPointsPerMillion = model.inputCostPointsPerMillion;
                this.tier = model.tier;
            } 

            /**
             * <p>The input cost points per million tokens for the tier.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
                this.inputCostPointsPerMillion = inputCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The token tier. Valid values: &quot;&quot; (default tier), 0-32K, 32K-64K, 64K-128K, 128K-256K, 256K-512K, 512K-1M, and 1M+.</p>
             * 
             * <strong>example:</strong>
             * <p>0-32K</p>
             */
            public Builder tier(String tier) {
                this.tier = tier;
                return this;
            }

            public InputTokenTiers build() {
                return new InputTokenTiers(this);
            } 

        } 

    }
}
