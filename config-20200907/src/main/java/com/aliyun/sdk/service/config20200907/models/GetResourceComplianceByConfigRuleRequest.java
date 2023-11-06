// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceComplianceByConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>GetResourceComplianceByConfigRuleRequest</p>
 */
public class GetResourceComplianceByConfigRuleRequest extends Request {
    @Query
    @NameInMap("ComplianceType")
    private String complianceType;

    @Query
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    private String configRuleId;

    private GetResourceComplianceByConfigRuleRequest(Builder builder) {
        super(builder);
        this.complianceType = builder.complianceType;
        this.configRuleId = builder.configRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceComplianceByConfigRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return complianceType
     */
    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public static final class Builder extends Request.Builder<GetResourceComplianceByConfigRuleRequest, Builder> {
        private String complianceType; 
        private String configRuleId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceComplianceByConfigRuleRequest request) {
            super(request);
            this.complianceType = request.complianceType;
            this.configRuleId = request.configRuleId;
        } 

        /**
         * The compliance evaluation result of the resource. Valid values:
         * <p>
         * 
         * *   COMPLIANT: The resource is evaluated as compliant.
         * *   NON_COMPLIANT: The resource is evaluated as non-compliant.
         * *   NOT_APPLICABLE: The rule does not apply to the resource.
         * *   INSUFFICIENT_DATA: No resource data is available.
         */
        public Builder complianceType(String complianceType) {
            this.putQueryParameter("ComplianceType", complianceType);
            this.complianceType = complianceType;
            return this;
        }

        /**
         * The ID of the rule.
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        @Override
        public GetResourceComplianceByConfigRuleRequest build() {
            return new GetResourceComplianceByConfigRuleRequest(this);
        } 

    } 

}
