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
 * {@link DeleteAggregateConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAggregateConfigRulesRequest</p>
 */
public class DeleteAggregateConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleIds;

    private DeleteAggregateConfigRulesRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAggregateConfigRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return configRuleIds
     */
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public static final class Builder extends Request.Builder<DeleteAggregateConfigRulesRequest, Builder> {
        private String aggregatorId; 
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAggregateConfigRulesRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-a4e5626622af0079****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The rule ID. Separate multiple rule IDs with commas (,).</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-4e3d626622af0080****</p>
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public DeleteAggregateConfigRulesRequest build() {
            return new DeleteAggregateConfigRulesRequest(this);
        } 

    } 

}
