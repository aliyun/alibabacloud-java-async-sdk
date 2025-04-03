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
 * {@link GetResourceComplianceByConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>GetResourceComplianceByConfigRuleRequest</p>
 */
public class GetResourceComplianceByConfigRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComplianceType")
    private String complianceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The compliance evaluation result. Valid values:</p>
         * <ul>
         * <li>COMPLIANT: The resources are evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The resources are evaluated as non-compliant.</li>
         * <li>NOT_APPLICABLE: The rule does not apply to the resources.</li>
         * <li>INSUFFICIENT_DATA: No data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        public Builder complianceType(String complianceType) {
            this.putQueryParameter("ComplianceType", complianceType);
            this.complianceType = complianceType;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-d369626622af008e****</p>
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
