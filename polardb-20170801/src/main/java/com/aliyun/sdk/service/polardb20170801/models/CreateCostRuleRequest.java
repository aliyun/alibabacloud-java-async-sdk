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
    @com.aliyun.core.annotation.NameInMap("EffectiveTargetType")
    private String effectiveTargetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTargetValue")
    private String effectiveTargetValue;

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

    private CreateCostRuleRequest(Builder builder) {
        super(builder);
        this.cacheCostPointsPerMillion = builder.cacheCostPointsPerMillion;
        this.effectiveTargetType = builder.effectiveTargetType;
        this.effectiveTargetValue = builder.effectiveTargetValue;
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

    public static final class Builder extends Request.Builder<CreateCostRuleRequest, Builder> {
        private String cacheCostPointsPerMillion; 
        private String effectiveTargetType; 
        private String effectiveTargetValue; 
        private String gwClusterId; 
        private String inputCostPointsPerMillion; 
        private String modelName; 
        private String modelServiceId; 
        private String outputCostPointsPerMillion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCostRuleRequest request) {
            super(request);
            this.cacheCostPointsPerMillion = request.cacheCostPointsPerMillion;
            this.effectiveTargetType = request.effectiveTargetType;
            this.effectiveTargetValue = request.effectiveTargetValue;
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
         * EffectiveTargetType.
         */
        public Builder effectiveTargetType(String effectiveTargetType) {
            this.putQueryParameter("EffectiveTargetType", effectiveTargetType);
            this.effectiveTargetType = effectiveTargetType;
            return this;
        }

        /**
         * EffectiveTargetValue.
         */
        public Builder effectiveTargetValue(String effectiveTargetValue) {
            this.putQueryParameter("EffectiveTargetValue", effectiveTargetValue);
            this.effectiveTargetValue = effectiveTargetValue;
            return this;
        }

        /**
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
        public CreateCostRuleRequest build() {
            return new CreateCostRuleRequest(this);
        } 

    } 

}
