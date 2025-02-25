// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleTargetsRequest</p>
 */
public class DescribeMetricRuleTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private DescribeMetricRuleTargetsRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleTargetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DescribeMetricRuleTargetsRequest, Builder> {
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricRuleTargetsRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The ID of the alert rule.</p>
         * <p>For information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ae06917_75a8c43178ab66****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DescribeMetricRuleTargetsRequest build() {
            return new DescribeMetricRuleTargetsRequest(this);
        } 

    } 

}
