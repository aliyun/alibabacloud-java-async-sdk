// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchedulerRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateSchedulerRuleRequest</p>
 */
public class CreateSchedulerRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Param")
    private String param;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("RuleType")
    @Validation(required = true)
    private Integer ruleType;

    @Query
    @NameInMap("Rules")
    @Validation(required = true)
    private String rules;

    private CreateSchedulerRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.param = builder.param;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchedulerRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<CreateSchedulerRuleRequest, Builder> {
        private String regionId; 
        private String param; 
        private String resourceGroupId; 
        private String ruleName; 
        private Integer ruleType; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(CreateSchedulerRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.param = request.param;
            this.resourceGroupId = request.resourceGroupId;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.rules = request.rules;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Param.
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public CreateSchedulerRuleRequest build() {
            return new CreateSchedulerRuleRequest(this);
        } 

    } 

}
