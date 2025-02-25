// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckRulesRequest} extends {@link RequestModel}
 *
 * <p>CheckRulesRequest</p>
 */
public class CheckRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    private CheckRulesRequest(Builder builder) {
        super(builder);
        this.resourceArn = builder.resourceArn;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<CheckRulesRequest, Builder> {
        private String resourceArn; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(CheckRulesRequest request) {
            super(request);
            this.resourceArn = request.resourceArn;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:123<em><strong>890:cn-shanghai:instance/i-001</strong></em>90</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.putBodyParameter("ResourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public CheckRulesRequest build() {
            return new CheckRulesRequest(this);
        } 

    } 

}
