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
 * {@link GetSasContainerWebDefenseRuleApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetSasContainerWebDefenseRuleApplicationRequest</p>
 */
public class GetSasContainerWebDefenseRuleApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
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
         * <p>The ID of the rule.</p>
         * <blockquote>
         * <p> You can call the ListSasContainerWebDefenseRule operation to query the IDs of rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>400599</p>
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
