// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceComplianceGroupByRegionRequest} extends {@link RequestModel}
 *
 * <p>GetResourceComplianceGroupByRegionRequest</p>
 */
public class GetResourceComplianceGroupByRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    private String configRuleIds;

    private GetResourceComplianceGroupByRegionRequest(Builder builder) {
        super(builder);
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceComplianceGroupByRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleIds
     */
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public static final class Builder extends Request.Builder<GetResourceComplianceGroupByRegionRequest, Builder> {
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceComplianceGroupByRegionRequest request) {
            super(request);
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * The rule IDs. Separate multiple rule IDs with commas (,).
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public GetResourceComplianceGroupByRegionRequest build() {
            return new GetResourceComplianceGroupByRegionRequest(this);
        } 

    } 

}
