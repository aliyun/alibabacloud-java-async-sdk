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
 * {@link StartAggregateConfigRuleEvaluationRequest} extends {@link RequestModel}
 *
 * <p>StartAggregateConfigRuleEvaluationRequest</p>
 */
public class StartAggregateConfigRuleEvaluationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    private String compliancePackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    private String configRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevertEvaluation")
    private Boolean revertEvaluation;

    private StartAggregateConfigRuleEvaluationRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.compliancePackId = builder.compliancePackId;
        this.configRuleId = builder.configRuleId;
        this.revertEvaluation = builder.revertEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAggregateConfigRuleEvaluationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
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

    public static final class Builder extends Request.Builder<StartAggregateConfigRuleEvaluationRequest, Builder> {
        private String aggregatorId; 
        private String compliancePackId; 
        private String configRuleId; 
        private Boolean revertEvaluation; 

        private Builder() {
            super();
        } 

        private Builder(StartAggregateConfigRuleEvaluationRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.compliancePackId = request.compliancePackId;
            this.configRuleId = request.configRuleId;
            this.revertEvaluation = request.revertEvaluation;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-3a58626622af0005****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The ID of the compliance package.</p>
         * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
         * <blockquote>
         * <p>You must configure either the <code>CompliancePackId</code> or <code>ConfigRuleId</code> parameter.</p>
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
         * <p>For more information about how to query the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
         * <blockquote>
         * <p> You must configure either the <code>CompliancePackId</code> or <code>ConfigRuleId</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cr-c169626622af009f****</p>
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
        public StartAggregateConfigRuleEvaluationRequest build() {
            return new StartAggregateConfigRuleEvaluationRequest(this);
        } 

    } 

}
