// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleV4StrRequest} extends {@link RequestModel}
 *
 * <p>GetRuleV4StrRequest</p>
 */
public class GetRuleV4StrRequest extends Request {
    @Body
    @NameInMap("IsSchemeData")
    private Integer isSchemeData;

    @Body
    @NameInMap("RuleId")
    private Long ruleId;

    private GetRuleV4StrRequest(Builder builder) {
        super(builder);
        this.isSchemeData = builder.isSchemeData;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleV4StrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isSchemeData
     */
    public Integer getIsSchemeData() {
        return this.isSchemeData;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetRuleV4StrRequest, Builder> {
        private Integer isSchemeData; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetRuleV4StrRequest request) {
            super(request);
            this.isSchemeData = request.isSchemeData;
            this.ruleId = request.ruleId;
        } 

        /**
         * IsSchemeData.
         */
        public Builder isSchemeData(Integer isSchemeData) {
            this.putBodyParameter("IsSchemeData", isSchemeData);
            this.isSchemeData = isSchemeData;
            return this;
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
        public GetRuleV4StrRequest build() {
            return new GetRuleV4StrRequest(this);
        } 

    } 

}
