// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigRuleComplianceByPackRequest} extends {@link RequestModel}
 *
 * <p>GetConfigRuleComplianceByPackRequest</p>
 */
public class GetConfigRuleComplianceByPackRequest extends Request {
    @Query
    @NameInMap("CompliancePackId")
    @Validation(required = true)
    private String compliancePackId;

    private GetConfigRuleComplianceByPackRequest(Builder builder) {
        super(builder);
        this.compliancePackId = builder.compliancePackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRuleComplianceByPackRequest create() {
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

    public static final class Builder extends Request.Builder<GetConfigRuleComplianceByPackRequest, Builder> {
        private String compliancePackId; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigRuleComplianceByPackRequest request) {
            super(request);
            this.compliancePackId = request.compliancePackId;
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

        @Override
        public GetConfigRuleComplianceByPackRequest build() {
            return new GetConfigRuleComplianceByPackRequest(this);
        } 

    } 

}
