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
 * {@link CreateCostRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateCostRuleRequest</p>
 */
public class CreateCostRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheCostPointsPerMillion")
    private String cacheCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheCreationCostPointsPerMillion")
    private String cacheCreationCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
    private String effectiveStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTargetType")
    private String effectiveTargetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTargetValue")
    private String effectiveTargetValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExplicitCacheCostPointsPerMillion")
    private String explicitCacheCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageCostPointsPerCount")
    private String imageCostPointsPerCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
    private String inputCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputTokenTiers")
    private String inputTokenTiers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputCostPointsPerMillion")
    private String outputCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoCostPointsPerSecond")
    private String videoCostPointsPerSecond;

    private CreateCostRuleRequest(Builder builder) {
        super(builder);
        this.cacheCostPointsPerMillion = builder.cacheCostPointsPerMillion;
        this.cacheCreationCostPointsPerMillion = builder.cacheCreationCostPointsPerMillion;
        this.effectiveStartTime = builder.effectiveStartTime;
        this.effectiveTargetType = builder.effectiveTargetType;
        this.effectiveTargetValue = builder.effectiveTargetValue;
        this.explicitCacheCostPointsPerMillion = builder.explicitCacheCostPointsPerMillion;
        this.gwClusterId = builder.gwClusterId;
        this.imageCostPointsPerCount = builder.imageCostPointsPerCount;
        this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
        this.inputTokenTiers = builder.inputTokenTiers;
        this.modelName = builder.modelName;
        this.modelServiceId = builder.modelServiceId;
        this.outputCostPointsPerMillion = builder.outputCostPointsPerMillion;
        this.regionId = builder.regionId;
        this.videoCostPointsPerSecond = builder.videoCostPointsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCostRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return inputTokenTiers
     */
    public String getInputTokenTiers() {
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
     * @return outputCostPointsPerMillion
     */
    public String getOutputCostPointsPerMillion() {
        return this.outputCostPointsPerMillion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return videoCostPointsPerSecond
     */
    public String getVideoCostPointsPerSecond() {
        return this.videoCostPointsPerSecond;
    }

    public static final class Builder extends Request.Builder<CreateCostRuleRequest, Builder> {
        private String cacheCostPointsPerMillion; 
        private String cacheCreationCostPointsPerMillion; 
        private String effectiveStartTime; 
        private String effectiveTargetType; 
        private String effectiveTargetValue; 
        private String explicitCacheCostPointsPerMillion; 
        private String gwClusterId; 
        private String imageCostPointsPerCount; 
        private String inputCostPointsPerMillion; 
        private String inputTokenTiers; 
        private String modelName; 
        private String modelServiceId; 
        private String outputCostPointsPerMillion; 
        private String regionId; 
        private String videoCostPointsPerSecond; 

        private Builder() {
            super();
        } 

        private Builder(CreateCostRuleRequest request) {
            super(request);
            this.cacheCostPointsPerMillion = request.cacheCostPointsPerMillion;
            this.cacheCreationCostPointsPerMillion = request.cacheCreationCostPointsPerMillion;
            this.effectiveStartTime = request.effectiveStartTime;
            this.effectiveTargetType = request.effectiveTargetType;
            this.effectiveTargetValue = request.effectiveTargetValue;
            this.explicitCacheCostPointsPerMillion = request.explicitCacheCostPointsPerMillion;
            this.gwClusterId = request.gwClusterId;
            this.imageCostPointsPerCount = request.imageCostPointsPerCount;
            this.inputCostPointsPerMillion = request.inputCostPointsPerMillion;
            this.inputTokenTiers = request.inputTokenTiers;
            this.modelName = request.modelName;
            this.modelServiceId = request.modelServiceId;
            this.outputCostPointsPerMillion = request.outputCostPointsPerMillion;
            this.regionId = request.regionId;
            this.videoCostPointsPerSecond = request.videoCostPointsPerSecond;
        } 

        /**
         * <p>The cache read cost points per million tokens. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
            this.putQueryParameter("CacheCostPointsPerMillion", cacheCostPointsPerMillion);
            this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The cache creation cost points per million tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder cacheCreationCostPointsPerMillion(String cacheCreationCostPointsPerMillion) {
            this.putQueryParameter("CacheCreationCostPointsPerMillion", cacheCreationCostPointsPerMillion);
            this.cacheCreationCostPointsPerMillion = cacheCreationCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The effective start time in the yyyy-MM-dd HH:mm:ss format. If this parameter is not specified, the rule takes effect immediately.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14 00:00:00</p>
         */
        public Builder effectiveStartTime(String effectiveStartTime) {
            this.putQueryParameter("EffectiveStartTime", effectiveStartTime);
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * <p>The effective target type. Valid values: global, consumerGroup, and consumer. Default value: global.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder effectiveTargetType(String effectiveTargetType) {
            this.putQueryParameter("EffectiveTargetType", effectiveTargetType);
            this.effectiveTargetType = effectiveTargetType;
            return this;
        }

        /**
         * <p>The effective target value. This parameter is required when the effective target type is not global.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder effectiveTargetValue(String effectiveTargetValue) {
            this.putQueryParameter("EffectiveTargetValue", effectiveTargetValue);
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
            this.putQueryParameter("ExplicitCacheCostPointsPerMillion", explicitCacheCostPointsPerMillion);
            this.explicitCacheCostPointsPerMillion = explicitCacheCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The gateway instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
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
            this.putQueryParameter("ImageCostPointsPerCount", imageCostPointsPerCount);
            this.imageCostPointsPerCount = imageCostPointsPerCount;
            return this;
        }

        /**
         * <p>The input cost points per million tokens. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.putQueryParameter("InputCostPointsPerMillion", inputCostPointsPerMillion);
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The tiered price for input tokens (non-cumulative). The value is a JSON array character string. Each element contains Tier and InputCostPointsPerMillion. Valid values for Tier: &quot;&quot; (default tier), 0-32K, 32K-64K, 64K-128K, 128K-256K, 256K-512K, 512K-1M, and 1M+. Example: [{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1000&quot;},{&quot;Tier&quot;:&quot;32K-64K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1800&quot;}]. If this parameter is specified, it takes precedence over InputCostPointsPerMillion. An empty array [] is not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1000&quot;},{&quot;Tier&quot;:&quot;32K-64K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1800&quot;}]</p>
         */
        public Builder inputTokenTiers(String inputTokenTiers) {
            this.putQueryParameter("InputTokenTiers", inputTokenTiers);
            this.inputTokenTiers = inputTokenTiers;
            return this;
        }

        /**
         * <p>The name of the model, such as gpt-4 or qwen-turbo.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gpt-4</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The ID of the model service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-xxxxxx</p>
         */
        public Builder modelServiceId(String modelServiceId) {
            this.putQueryParameter("ModelServiceId", modelServiceId);
            this.modelServiceId = modelServiceId;
            return this;
        }

        /**
         * <p>The output cost points per million tokens. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder outputCostPointsPerMillion(String outputCostPointsPerMillion) {
            this.putQueryParameter("OutputCostPointsPerMillion", outputCostPointsPerMillion);
            this.outputCostPointsPerMillion = outputCostPointsPerMillion;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The video input cost points per second.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder videoCostPointsPerSecond(String videoCostPointsPerSecond) {
            this.putQueryParameter("VideoCostPointsPerSecond", videoCostPointsPerSecond);
            this.videoCostPointsPerSecond = videoCostPointsPerSecond;
            return this;
        }

        @Override
        public CreateCostRuleRequest build() {
            return new CreateCostRuleRequest(this);
        } 

    } 

}
