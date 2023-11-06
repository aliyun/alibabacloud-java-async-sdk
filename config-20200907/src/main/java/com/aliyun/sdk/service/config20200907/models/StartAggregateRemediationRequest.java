// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartAggregateRemediationRequest} extends {@link RequestModel}
 *
 * <p>StartAggregateRemediationRequest</p>
 */
public class StartAggregateRemediationRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Query
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    private String configRuleId;

    @Query
    @NameInMap("ResourceAccountId")
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
         * The ID of the account group.
         * <p>
         * 
         * For information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The rule ID.
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](~~264148~~).
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the resources to be remediated belong. If this parameter is left empty, non-compliant resources of all accounts in the account group are remediated.
         * <p>
         * 
         * > You must specify the ID of the current management account or a member account in the account group of the management account.
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
