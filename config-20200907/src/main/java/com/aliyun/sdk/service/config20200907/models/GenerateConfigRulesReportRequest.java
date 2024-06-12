// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateConfigRulesReportRequest} extends {@link RequestModel}
 *
 * <p>GenerateConfigRulesReportRequest</p>
 */
public class GenerateConfigRulesReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    private String configRuleIds;

    private GenerateConfigRulesReportRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateConfigRulesReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configRuleIds
     */
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public static final class Builder extends Request.Builder<GenerateConfigRulesReportRequest, Builder> {
        private String clientToken; 
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(GenerateConfigRulesReportRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the rule. Separate multiple rule IDs with commas (,).
         * <p>
         * 
         * For more information about how to query the ID of a rule, see [ListConfigRules](~~169607~~).
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putBodyParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public GenerateConfigRulesReportRequest build() {
            return new GenerateConfigRulesReportRequest(this);
        } 

    } 

}
