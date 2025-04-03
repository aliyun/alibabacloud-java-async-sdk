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
 * {@link ActiveAggregateConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>ActiveAggregateConfigRulesRequest</p>
 */
public class ActiveAggregateConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    private String compliancePackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    private String configRuleIds;

    private ActiveAggregateConfigRulesRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.compliancePackId = builder.compliancePackId;
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveAggregateConfigRulesRequest create() {
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
     * @return compliancePackId
     */
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    /**
     * @return configRuleIds
     */
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public static final class Builder extends Request.Builder<ActiveAggregateConfigRulesRequest, Builder> {
        private String aggregatorId; 
        private String compliancePackId; 
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(ActiveAggregateConfigRulesRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.compliancePackId = request.compliancePackId;
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
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
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-fe416457e0d90022****</p>
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * <ul>
         * <li>If the rule is enabled, no error code is returned.</li>
         * <li>If the rule fails to be enabled, an error code is returned. For more information about error codes, see <a href="https://error-center.alibabacloud.com/status/product/Config">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cr-5772ba41209e007b****</p>
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public ActiveAggregateConfigRulesRequest build() {
            return new ActiveAggregateConfigRulesRequest(this);
        } 

    } 

}
