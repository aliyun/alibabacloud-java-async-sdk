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
 * {@link DeleteContainerDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteContainerDefenseRuleRequest</p>
 */
public class DeleteContainerDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List<Long> ruleIds;

    private DeleteContainerDefenseRuleRequest(Builder builder) {
        super(builder);
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContainerDefenseRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleIds
     */
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder extends Request.Builder<DeleteContainerDefenseRuleRequest, Builder> {
        private java.util.List<Long> ruleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContainerDefenseRuleRequest request) {
            super(request);
            this.ruleIds = request.ruleIds;
        } 

        /**
         * <p>The IDs of the rules that you want to delete.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">ListContainerDefenseRule</a> operation to query the rule IDs.</p>
         * </blockquote>
         */
        public Builder ruleIds(java.util.List<Long> ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        @Override
        public DeleteContainerDefenseRuleRequest build() {
            return new DeleteContainerDefenseRuleRequest(this);
        } 

    } 

}
