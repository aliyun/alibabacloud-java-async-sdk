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
 * {@link GetSasContainerWebDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>GetSasContainerWebDefenseRuleRequest</p>
 */
public class GetSasContainerWebDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    private GetSasContainerWebDefenseRuleRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSasContainerWebDefenseRuleRequest create() {
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

    public static final class Builder extends Request.Builder<GetSasContainerWebDefenseRuleRequest, Builder> {
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetSasContainerWebDefenseRuleRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>Rule ID.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListSasContainerWebDefenseRule~~">ListSasContainerWebDefenseRule</a> API to get this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1600009</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetSasContainerWebDefenseRuleRequest build() {
            return new GetSasContainerWebDefenseRuleRequest(this);
        } 

    } 

}
