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
 * {@link ModifyCostRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyCostRuleRequest</p>
 */
public class ModifyCostRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheCostPointsPerMillion")
    private String cacheCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheCreationCostPointsPerMillion")
    private String cacheCreationCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String costRuleId;

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

    private ModifyCostRuleRequest(Builder builder) {
        super(builder);
        this.cacheCostPointsPerMillion = builder.cacheCostPointsPerMillion;
        this.cacheCreationCostPointsPerMillion = builder.cacheCreationCostPointsPerMillion;
        this.costRuleId = builder.costRuleId;
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

    public static ModifyCostRuleRequest create() {
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
     * @return costRuleId
     */
    public String getCostRuleId() {
        return this.costRuleId;
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

    public static final class Builder extends Request.Builder<ModifyCostRuleRequest, Builder> {
        private String cacheCostPointsPerMillion; 
        private String cacheCreationCostPointsPerMillion; 
        private String costRuleId; 
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

        private Builder(ModifyCostRuleRequest request) {
            super(request);
            this.cacheCostPointsPerMillion = request.cacheCostPointsPerMillion;
            this.cacheCreationCostPointsPerMillion = request.cacheCreationCostPointsPerMillion;
            this.costRuleId = request.costRuleId;
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
         * <p>The cache cost points per million tokens. Default value: 0.</p>
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
         * <p>The ID of the cost rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>924d450014e64e88ac6e8486f8e990**</p>
         */
        public Builder costRuleId(String costRuleId) {
            this.putQueryParameter("CostRuleId", costRuleId);
            this.costRuleId = costRuleId;
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
         * <p>pg-xxxxxxxxxx</p>
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
         * <p>The input token tiered price (non-cumulative) specified as a JSON array character string. Each element contains Tier and InputCostPointsPerMillion. Valid values for Tier: &quot;&quot; (default tier), 0-32K, 32K-64K, 64K-128K, 128K-256K, 256K-512K, 512K-1M, and 1M+. Example: [{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1200&quot;}]. A non-empty value replaces all existing tiers. If this parameter is not specified or is set to an empty string, the original tiers are retained. An empty array [] is not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Tier&quot;:&quot;0-32K&quot;,&quot;InputCostPointsPerMillion&quot;:&quot;1200&quot;}]</p>
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
         * <p>10</p>
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
        public ModifyCostRuleRequest build() {
            return new ModifyCostRuleRequest(this);
        } 

    } 

}
