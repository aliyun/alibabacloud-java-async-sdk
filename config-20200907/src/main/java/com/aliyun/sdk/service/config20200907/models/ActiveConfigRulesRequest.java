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
 * {@link ActiveConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>ActiveConfigRulesRequest</p>
 */
public class ActiveConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    private String compliancePackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    private String configRuleIds;

    private ActiveConfigRulesRequest(Builder builder) {
        super(builder);
        this.compliancePackId = builder.compliancePackId;
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveConfigRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ActiveConfigRulesRequest, Builder> {
        private String compliancePackId; 
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(ActiveConfigRulesRequest request) {
            super(request);
            this.compliancePackId = request.compliancePackId;
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * <p>The ID of the compliance package.</p>
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
         * <p>The rule ID. Separate multiple rule IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cr-2da35180a8d1008e****,cr-2da35180a8d1008e****</p>
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public ActiveConfigRulesRequest build() {
            return new ActiveConfigRulesRequest(this);
        } 

    } 

}
