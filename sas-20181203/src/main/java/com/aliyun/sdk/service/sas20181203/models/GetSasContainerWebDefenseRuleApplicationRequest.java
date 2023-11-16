// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSasContainerWebDefenseRuleApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetSasContainerWebDefenseRuleApplicationRequest</p>
 */
public class GetSasContainerWebDefenseRuleApplicationRequest extends Request {
    @Query
    @NameInMap("RuleId")
    private Long ruleId;

    private GetSasContainerWebDefenseRuleApplicationRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSasContainerWebDefenseRuleApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<GetSasContainerWebDefenseRuleApplicationRequest, Builder> {
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetSasContainerWebDefenseRuleApplicationRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetSasContainerWebDefenseRuleApplicationRequest build() {
            return new GetSasContainerWebDefenseRuleApplicationRequest(this);
        } 

    } 

}
