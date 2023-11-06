// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachConfigRuleToCompliancePackRequest} extends {@link RequestModel}
 *
 * <p>AttachConfigRuleToCompliancePackRequest</p>
 */
public class AttachConfigRuleToCompliancePackRequest extends Request {
    @Query
    @NameInMap("CompliancePackId")
    @Validation(required = true)
    private String compliancePackId;

    @Query
    @NameInMap("ConfigRuleIds")
    @Validation(required = true)
    private String configRuleIds;

    private AttachConfigRuleToCompliancePackRequest(Builder builder) {
        super(builder);
        this.compliancePackId = builder.compliancePackId;
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachConfigRuleToCompliancePackRequest create() {
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

    public static final class Builder extends Request.Builder<AttachConfigRuleToCompliancePackRequest, Builder> {
        private String compliancePackId; 
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(AttachConfigRuleToCompliancePackRequest request) {
            super(request);
            this.compliancePackId = request.compliancePackId;
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * The ID of the compliance package.
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * The rule ID. Separate multiple rule IDs with commas (,).
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public AttachConfigRuleToCompliancePackRequest build() {
            return new AttachConfigRuleToCompliancePackRequest(this);
        } 

    } 

}
