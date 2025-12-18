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
 * {@link DryRunConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DryRunConfigRuleResponseBody</p>
 */
public class DryRunConfigRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComplianceType")
    private String complianceType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleConditionContext")
    private String ruleConditionContext;

    private DryRunConfigRuleResponseBody(Builder builder) {
        this.complianceType = builder.complianceType;
        this.requestId = builder.requestId;
        this.ruleConditionContext = builder.ruleConditionContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DryRunConfigRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return complianceType
     */
    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleConditionContext
     */
    public String getRuleConditionContext() {
        return this.ruleConditionContext;
    }

    public static final class Builder {
        private String complianceType; 
        private String requestId; 
        private String ruleConditionContext; 

        private Builder() {
        } 

        private Builder(DryRunConfigRuleResponseBody model) {
            this.complianceType = model.complianceType;
            this.requestId = model.requestId;
            this.ruleConditionContext = model.ruleConditionContext;
        } 

        /**
         * ComplianceType.
         */
        public Builder complianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C32EEAD7-BF64-5927-977A-AFF9342B7275</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleConditionContext.
         */
        public Builder ruleConditionContext(String ruleConditionContext) {
            this.ruleConditionContext = ruleConditionContext;
            return this;
        }

        public DryRunConfigRuleResponseBody build() {
            return new DryRunConfigRuleResponseBody(this);
        } 

    } 

}
