// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartConfigRuleEvaluationRequest} extends {@link RequestModel}
 *
 * <p>StartConfigRuleEvaluationRequest</p>
 */
public class StartConfigRuleEvaluationRequest extends Request {
    @Query
    @NameInMap("CompliancePackId")
    private String compliancePackId;

    @Query
    @NameInMap("ConfigRuleId")
    private String configRuleId;

    @Query
    @NameInMap("RevertEvaluation")
    private Boolean revertEvaluation;

    private StartConfigRuleEvaluationRequest(Builder builder) {
        super(builder);
        this.compliancePackId = builder.compliancePackId;
        this.configRuleId = builder.configRuleId;
        this.revertEvaluation = builder.revertEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartConfigRuleEvaluationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compliancePackId
     */
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return revertEvaluation
     */
    public Boolean getRevertEvaluation() {
        return this.revertEvaluation;
    }

    public static final class Builder extends Request.Builder<StartConfigRuleEvaluationRequest, Builder> {
        private String compliancePackId; 
        private String configRuleId; 
        private Boolean revertEvaluation; 

        private Builder() {
            super();
        } 

        private Builder(StartConfigRuleEvaluationRequest request) {
            super(request);
            this.compliancePackId = request.compliancePackId;
            this.configRuleId = request.configRuleId;
            this.revertEvaluation = request.revertEvaluation;
        } 

        /**
         * The ID of the compliance package.
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~606968~~).
         * 
         * >  You must set either the CompliancePackId or ConfigRuleId parameter.
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * The rule ID.
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListConfigRules](~~609222~~).
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * Specifies whether to re-evaluate ignored non-compliant resources. Valid values:
         * <p>
         * 
         * *   true: re-evaluates ignored non-compliant resources based on the rule.
         * *   false: continues to ignore non-compliant resources.
         */
        public Builder revertEvaluation(Boolean revertEvaluation) {
            this.putQueryParameter("RevertEvaluation", revertEvaluation);
            this.revertEvaluation = revertEvaluation;
            return this;
        }

        @Override
        public StartConfigRuleEvaluationRequest build() {
            return new StartConfigRuleEvaluationRequest(this);
        } 

    } 

}
