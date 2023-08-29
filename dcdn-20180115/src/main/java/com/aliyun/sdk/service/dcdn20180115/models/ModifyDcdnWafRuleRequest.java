// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDcdnWafRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyDcdnWafRuleRequest</p>
 */
public class ModifyDcdnWafRuleRequest extends Request {
    @Body
    @NameInMap("RuleConfig")
    private String ruleConfig;

    @Body
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Body
    @NameInMap("RuleName")
    private String ruleName;

    @Body
    @NameInMap("RuleStatus")
    private String ruleStatus;

    private ModifyDcdnWafRuleRequest(Builder builder) {
        super(builder);
        this.ruleConfig = builder.ruleConfig;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.ruleStatus = builder.ruleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDcdnWafRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleConfig
     */
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public static final class Builder extends Request.Builder<ModifyDcdnWafRuleRequest, Builder> {
        private String ruleConfig; 
        private Long ruleId; 
        private String ruleName; 
        private String ruleStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDcdnWafRuleRequest request) {
            super(request);
            this.ruleConfig = request.ruleConfig;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.ruleStatus = request.ruleStatus;
        } 

        /**
         * The new configurations of the protection rule.
         * <p>
         * 
         * > After you modify the configurations of the protection rule, the previous configurations are overwritten.
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putBodyParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * The ID of the protection rule. You can specify only one ID in each request.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The new name of the protection rule.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The new status of the protection rule. Valid values:
         * <p>
         * 
         * *   **on**
         * *   **off**
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putBodyParameter("RuleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        @Override
        public ModifyDcdnWafRuleRequest build() {
            return new ModifyDcdnWafRuleRequest(this);
        } 

    } 

}
