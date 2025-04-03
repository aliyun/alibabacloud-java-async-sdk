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
 * {@link GetResourceComplianceGroupByResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetResourceComplianceGroupByResourceTypeRequest</p>
 */
public class GetResourceComplianceGroupByResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    private String configRuleIds;

    private GetResourceComplianceGroupByResourceTypeRequest(Builder builder) {
        super(builder);
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceComplianceGroupByResourceTypeRequest create() {
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

    public static final class Builder extends Request.Builder<GetResourceComplianceGroupByResourceTypeRequest, Builder> {
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceComplianceGroupByResourceTypeRequest request) {
            super(request);
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * <p>The rule IDs. Separate multiple rule IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cr-a5c6626622af0058****</p>
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public GetResourceComplianceGroupByResourceTypeRequest build() {
            return new GetResourceComplianceGroupByResourceTypeRequest(this);
        } 

    } 

}
