// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetInterceptionRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>GetInterceptionRuleDetailRequest</p>
 */
public class GetInterceptionRuleDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private GetInterceptionRuleDetailRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionRuleDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetInterceptionRuleDetailRequest, Builder> {
        private String clusterId; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetInterceptionRuleDetailRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c7f60fdabc84xxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListInterceptionRulePage~~">ListInterceptionRulePage</a> operation to query the IDs of rules.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500002</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetInterceptionRuleDetailRequest build() {
            return new GetInterceptionRuleDetailRequest(this);
        } 

    } 

}
