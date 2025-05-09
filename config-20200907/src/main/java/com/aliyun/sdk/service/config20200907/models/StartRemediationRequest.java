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
 * {@link StartRemediationRequest} extends {@link RequestModel}
 *
 * <p>StartRemediationRequest</p>
 */
public class StartRemediationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    private StartRemediationRequest(Builder builder) {
        super(builder);
        this.configRuleId = builder.configRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRemediationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public static final class Builder extends Request.Builder<StartRemediationRequest, Builder> {
        private String configRuleId; 

        private Builder() {
            super();
        } 

        private Builder(StartRemediationRequest request) {
            super(request);
            this.configRuleId = request.configRuleId;
        } 

        /**
         * <p>The rule ID.</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-8a973ac2e2be00a2****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        @Override
        public StartRemediationRequest build() {
            return new StartRemediationRequest(this);
        } 

    } 

}
