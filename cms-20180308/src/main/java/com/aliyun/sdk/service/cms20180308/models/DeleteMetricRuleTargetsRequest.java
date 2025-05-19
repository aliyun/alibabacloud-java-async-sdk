// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DeleteMetricRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetricRuleTargetsRequest</p>
 */
public class DeleteMetricRuleTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetIds")
    private java.util.List<String> targetIds;

    private DeleteMetricRuleTargetsRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
        this.targetIds = builder.targetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetricRuleTargetsRequest create() {
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

    /**
     * @return targetIds
     */
    public java.util.List<String> getTargetIds() {
        return this.targetIds;
    }

    public static final class Builder extends Request.Builder<DeleteMetricRuleTargetsRequest, Builder> {
        private String ruleId; 
        private java.util.List<String> targetIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetricRuleTargetsRequest request) {
            super(request);
            this.ruleId = request.ruleId;
            this.targetIds = request.targetIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * TargetIds.
         */
        public Builder targetIds(java.util.List<String> targetIds) {
            this.putQueryParameter("TargetIds", targetIds);
            this.targetIds = targetIds;
            return this;
        }

        @Override
        public DeleteMetricRuleTargetsRequest build() {
            return new DeleteMetricRuleTargetsRequest(this);
        } 

    } 

}
