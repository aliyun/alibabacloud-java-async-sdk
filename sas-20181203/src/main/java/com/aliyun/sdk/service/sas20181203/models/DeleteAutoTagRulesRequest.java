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
 * {@link DeleteAutoTagRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAutoTagRulesRequest</p>
 */
public class DeleteAutoTagRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleIdList;

    private DeleteAutoTagRulesRequest(Builder builder) {
        super(builder);
        this.ruleIdList = builder.ruleIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAutoTagRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleIdList
     */
    public String getRuleIdList() {
        return this.ruleIdList;
    }

    public static final class Builder extends Request.Builder<DeleteAutoTagRulesRequest, Builder> {
        private String ruleIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAutoTagRulesRequest request) {
            super(request);
            this.ruleIdList = request.ruleIdList;
        } 

        /**
         * <p>The ID of the asset auto-tagging rule. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListAutoTagRules~~">ListAutoTagRules</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2331,56,5644</p>
         */
        public Builder ruleIdList(String ruleIdList) {
            this.putQueryParameter("RuleIdList", ruleIdList);
            this.ruleIdList = ruleIdList;
            return this;
        }

        @Override
        public DeleteAutoTagRulesRequest build() {
            return new DeleteAutoTagRulesRequest(this);
        } 

    } 

}
