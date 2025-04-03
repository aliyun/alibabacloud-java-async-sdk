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
 * {@link StartAggregateRemediationRequest} extends {@link RequestModel}
 *
 * <p>StartAggregateRemediationRequest</p>
 */
public class StartAggregateRemediationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAccountId")
    private Long resourceAccountId;

    private StartAggregateRemediationRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.configRuleId = builder.configRuleId;
        this.resourceAccountId = builder.resourceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAggregateRemediationRequest create() {
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
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return resourceAccountId
     */
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public static final class Builder extends Request.Builder<StartAggregateRemediationRequest, Builder> {
        private String aggregatorId; 
        private String configRuleId; 
        private Long resourceAccountId; 

        private Builder() {
            super();
        } 

        private Builder(StartAggregateRemediationRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.configRuleId = request.configRuleId;
            this.resourceAccountId = request.resourceAccountId;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-6b4a626622af0012****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-6b7c626622af00b4****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the resources to be remediated belong. If this parameter is left empty, non-compliant resources of all accounts in the account group are remediated.</p>
         * <blockquote>
         * <p>You must specify the ID of the current management account or a member account in the account group of the management account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100271897542****</p>
         */
        public Builder resourceAccountId(Long resourceAccountId) {
            this.putQueryParameter("ResourceAccountId", resourceAccountId);
            this.resourceAccountId = resourceAccountId;
            return this;
        }

        @Override
        public StartAggregateRemediationRequest build() {
            return new StartAggregateRemediationRequest(this);
        } 

    } 

}
