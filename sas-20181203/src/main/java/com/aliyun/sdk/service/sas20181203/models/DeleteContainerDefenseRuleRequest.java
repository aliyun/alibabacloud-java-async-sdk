// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContainerDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteContainerDefenseRuleRequest</p>
 */
public class DeleteContainerDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List < Long > ruleIds;

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
    public java.util.List < Long > getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder extends Request.Builder<DeleteContainerDefenseRuleRequest, Builder> {
        private java.util.List < Long > ruleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContainerDefenseRuleRequest request) {
            super(request);
            this.ruleIds = request.ruleIds;
        } 

        /**
         * The IDs of the rules that you want to delete.
         * <p>
         * 
         * >  You can call the [ListContainerDefenseRule](~~2590599~~) operation to query the rule IDs.
         */
        public Builder ruleIds(java.util.List < Long > ruleIds) {
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
