// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DeleteConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigRulesRequest</p>
 */
public class DeleteConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleIds;

    private DeleteConfigRulesRequest(Builder builder) {
        super(builder);
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleIds
     */
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public static final class Builder extends Request.Builder<DeleteConfigRulesRequest, Builder> {
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigRulesRequest request) {
            super(request);
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/609222.html">ListConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-9908626622af0035****</p>
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public DeleteConfigRulesRequest build() {
            return new DeleteConfigRulesRequest(this);
        } 

    } 

}
