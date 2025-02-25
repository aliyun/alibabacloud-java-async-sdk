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
 * {@link DetachConfigRuleToCompliancePackRequest} extends {@link RequestModel}
 *
 * <p>DetachConfigRuleToCompliancePackRequest</p>
 */
public class DetachConfigRuleToCompliancePackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compliancePackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleIds;

    private DetachConfigRuleToCompliancePackRequest(Builder builder) {
        super(builder);
        this.compliancePackId = builder.compliancePackId;
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachConfigRuleToCompliancePackRequest create() {
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

    public static final class Builder extends Request.Builder<DetachConfigRuleToCompliancePackRequest, Builder> {
        private String compliancePackId; 
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DetachConfigRuleToCompliancePackRequest request) {
            super(request);
            this.compliancePackId = request.compliancePackId;
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * <p>The ID of the compliance package.</p>
         * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-5bb1626622af00bd****</p>
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * <p>The rule ID. Separate multiple rule IDs with commas (,).</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-6cc4626622af00e7****</p>
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public DetachConfigRuleToCompliancePackRequest build() {
            return new DetachConfigRuleToCompliancePackRequest(this);
        } 

    } 

}
