// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link StartConfigRuleEvaluationRequest} extends {@link RequestModel}
 *
 * <p>StartConfigRuleEvaluationRequest</p>
 */
public class StartConfigRuleEvaluationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    private String compliancePackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    private String configRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevertEvaluation")
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
         * <p>The compliance package ID.</p>
         * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/606968.html">ListCompliancePacks</a>.</p>
         * <blockquote>
         * <p> You must configure either the <code>CompliancePackId</code> or <code>ConfigRuleId</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cp-ac16626622af0053****</p>
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/609222.html">ListConfigRules</a> operation to obtain the rule ID.</p>
         * <blockquote>
         * <p> You must configure either the <code>CompliancePackId</code> or <code>ConfigRuleId</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cr-9920626622af0035****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * <p>Specifies whether to re-evaluate the ignored non-compliant resource. Valid values:</p>
         * <ul>
         * <li>true: re-evaluates the ignored non-compliant resource based on the rule.</li>
         * <li>false (default): does not re-evaluate the ignored non-compliant resource based on the rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
