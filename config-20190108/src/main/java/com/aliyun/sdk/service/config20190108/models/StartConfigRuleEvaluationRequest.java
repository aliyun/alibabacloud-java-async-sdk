// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

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

        private Builder(StartConfigRuleEvaluationRequest response) {
            super(response);
            this.compliancePackId = response.compliancePackId;
            this.configRuleId = response.configRuleId;
            this.revertEvaluation = response.revertEvaluation;
        } 

        /**
         * CompliancePackId.
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * ConfigRuleId.
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * RevertEvaluation.
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
