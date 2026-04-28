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
    @com.aliyun.core.annotation.NameInMap("CostRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String costRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
    private String inputCostPointsPerMillion;

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

    private ModifyCostRuleRequest(Builder builder) {
        super(builder);
        this.cacheCostPointsPerMillion = builder.cacheCostPointsPerMillion;
        this.costRuleId = builder.costRuleId;
        this.gwClusterId = builder.gwClusterId;
        this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
        this.modelName = builder.modelName;
        this.modelServiceId = builder.modelServiceId;
        this.outputCostPointsPerMillion = builder.outputCostPointsPerMillion;
        this.regionId = builder.regionId;
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
     * @return costRuleId
     */
    public String getCostRuleId() {
        return this.costRuleId;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return inputCostPointsPerMillion
     */
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
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

    public static final class Builder extends Request.Builder<ModifyCostRuleRequest, Builder> {
        private String cacheCostPointsPerMillion; 
        private String costRuleId; 
        private String gwClusterId; 
        private String inputCostPointsPerMillion; 
        private String modelName; 
        private String modelServiceId; 
        private String outputCostPointsPerMillion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCostRuleRequest request) {
            super(request);
            this.cacheCostPointsPerMillion = request.cacheCostPointsPerMillion;
            this.costRuleId = request.costRuleId;
            this.gwClusterId = request.gwClusterId;
            this.inputCostPointsPerMillion = request.inputCostPointsPerMillion;
            this.modelName = request.modelName;
            this.modelServiceId = request.modelServiceId;
            this.outputCostPointsPerMillion = request.outputCostPointsPerMillion;
            this.regionId = request.regionId;
        } 

        /**
         * CacheCostPointsPerMillion.
         */
        public Builder cacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
            this.putQueryParameter("CacheCostPointsPerMillion", cacheCostPointsPerMillion);
            this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
            return this;
        }

        /**
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
         * InputCostPointsPerMillion.
         */
        public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.putQueryParameter("InputCostPointsPerMillion", inputCostPointsPerMillion);
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }

        /**
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
         * OutputCostPointsPerMillion.
         */
        public Builder outputCostPointsPerMillion(String outputCostPointsPerMillion) {
            this.putQueryParameter("OutputCostPointsPerMillion", outputCostPointsPerMillion);
            this.outputCostPointsPerMillion = outputCostPointsPerMillion;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyCostRuleRequest build() {
            return new ModifyCostRuleRequest(this);
        } 

    } 

}
