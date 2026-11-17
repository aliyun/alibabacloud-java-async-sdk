// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DeleteApplicationCustomRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationCustomRulesRequest</p>
 */
public class DeleteApplicationCustomRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCustomRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> applicationCustomRuleIds;

    private DeleteApplicationCustomRulesRequest(Builder builder) {
        super(builder);
        this.applicationCustomRuleIds = builder.applicationCustomRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationCustomRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCustomRuleIds
     */
    public java.util.List<String> getApplicationCustomRuleIds() {
        return this.applicationCustomRuleIds;
    }

    public static final class Builder extends Request.Builder<DeleteApplicationCustomRulesRequest, Builder> {
        private java.util.List<String> applicationCustomRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationCustomRulesRequest request) {
            super(request);
            this.applicationCustomRuleIds = request.applicationCustomRuleIds;
        } 

        /**
         * <p>The list of IDs of the custom application rules to delete. You can specify up to 100 IDs in a single request. The IDs cannot be empty and must be unique.</p>
         * <p>This parameter is required.</p>
         */
        public Builder applicationCustomRuleIds(java.util.List<String> applicationCustomRuleIds) {
            String applicationCustomRuleIdsShrink = shrink(applicationCustomRuleIds, "ApplicationCustomRuleIds", "json");
            this.putQueryParameter("ApplicationCustomRuleIds", applicationCustomRuleIdsShrink);
            this.applicationCustomRuleIds = applicationCustomRuleIds;
            return this;
        }

        @Override
        public DeleteApplicationCustomRulesRequest build() {
            return new DeleteApplicationCustomRulesRequest(this);
        } 

    } 

}
