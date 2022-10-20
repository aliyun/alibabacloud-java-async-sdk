// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleByIdRequest} extends {@link RequestModel}
 *
 * <p>GetRuleByIdRequest</p>
 */
public class GetRuleByIdRequest extends Request {
    @Body
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    private GetRuleByIdRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetRuleByIdRequest, Builder> {
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetRuleByIdRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetRuleByIdRequest build() {
            return new GetRuleByIdRequest(this);
        } 

    } 

}
