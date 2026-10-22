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
 * {@link DescribeCostRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCostRulesRequest</p>
 */
public class DescribeCostRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostRuleId")
    private String costRuleId;

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
    @com.aliyun.core.annotation.NameInMap("InputTokenTier")
    private String inputTokenTier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelServiceId")
    private String modelServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeCostRulesRequest(Builder builder) {
        super(builder);
        this.costRuleId = builder.costRuleId;
        this.effectiveTargetType = builder.effectiveTargetType;
        this.effectiveTargetValue = builder.effectiveTargetValue;
        this.gwClusterId = builder.gwClusterId;
        this.inputTokenTier = builder.inputTokenTier;
        this.modelName = builder.modelName;
        this.modelServiceId = builder.modelServiceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costRuleId
     */
    public String getCostRuleId() {
        return this.costRuleId;
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
     * @return inputTokenTier
     */
    public String getInputTokenTier() {
        return this.inputTokenTier;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCostRulesRequest, Builder> {
        private String costRuleId; 
        private String effectiveTargetType; 
        private String effectiveTargetValue; 
        private String gwClusterId; 
        private String inputTokenTier; 
        private String modelName; 
        private String modelServiceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCostRulesRequest request) {
            super(request);
            this.costRuleId = request.costRuleId;
            this.effectiveTargetType = request.effectiveTargetType;
            this.effectiveTargetValue = request.effectiveTargetValue;
            this.gwClusterId = request.gwClusterId;
            this.inputTokenTier = request.inputTokenTier;
            this.modelName = request.modelName;
            this.modelServiceId = request.modelServiceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the cost rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-xxx</p>
         */
        public Builder costRuleId(String costRuleId) {
            this.putQueryParameter("CostRuleId", costRuleId);
            this.costRuleId = costRuleId;
            return this;
        }

        /**
         * <p>The effective target type used to filter the results. Valid values: global, consumerGroup, and consumer.</p>
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
         * <p>The effective target value used to filter the results.</p>
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
         * <p>The gateway instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The input token tier used to filter the results. Returns rules that include this tier. Valid values: 0-32K, 32K-64K, 64K-128K, 128K-256K, 256K-512K, 512K-1M, and 1M+.</p>
         * 
         * <strong>example:</strong>
         * <p>0-32K</p>
         */
        public Builder inputTokenTier(String inputTokenTier) {
            this.putQueryParameter("InputTokenTier", inputTokenTier);
            this.inputTokenTier = inputTokenTier;
            return this;
        }

        /**
         * <p>The name of the model, such as gpt-4 or qwen-turbo.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The ID of the model service.</p>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public DescribeCostRulesRequest build() {
            return new DescribeCostRulesRequest(this);
        } 

    } 

}
