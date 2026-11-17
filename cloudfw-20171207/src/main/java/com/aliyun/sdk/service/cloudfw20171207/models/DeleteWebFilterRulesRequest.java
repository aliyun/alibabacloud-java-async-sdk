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
 * {@link DeleteWebFilterRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteWebFilterRulesRequest</p>
 */
public class DeleteWebFilterRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebFilterRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> webFilterRuleIds;

    private DeleteWebFilterRulesRequest(Builder builder) {
        super(builder);
        this.webFilterRuleIds = builder.webFilterRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWebFilterRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return webFilterRuleIds
     */
    public java.util.List<String> getWebFilterRuleIds() {
        return this.webFilterRuleIds;
    }

    public static final class Builder extends Request.Builder<DeleteWebFilterRulesRequest, Builder> {
        private java.util.List<String> webFilterRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWebFilterRulesRequest request) {
            super(request);
            this.webFilterRuleIds = request.webFilterRuleIds;
        } 

        /**
         * <p>The list of web filtering rule IDs to delete. You can specify up to 100 IDs in a single request. The IDs cannot be empty and must be unique.</p>
         * <p>This parameter is required.</p>
         */
        public Builder webFilterRuleIds(java.util.List<String> webFilterRuleIds) {
            String webFilterRuleIdsShrink = shrink(webFilterRuleIds, "WebFilterRuleIds", "json");
            this.putQueryParameter("WebFilterRuleIds", webFilterRuleIdsShrink);
            this.webFilterRuleIds = webFilterRuleIds;
            return this;
        }

        @Override
        public DeleteWebFilterRulesRequest build() {
            return new DeleteWebFilterRulesRequest(this);
        } 

    } 

}
