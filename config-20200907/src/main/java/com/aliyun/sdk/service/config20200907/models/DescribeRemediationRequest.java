// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRemediationRequest} extends {@link RequestModel}
 *
 * <p>DescribeRemediationRequest</p>
 */
public class DescribeRemediationRequest extends Request {
    @Query
    @NameInMap("ConfigRuleId")
    private String configRuleId;

    @Query
    @NameInMap("RemediationId")
    private String remediationId;

    private DescribeRemediationRequest(Builder builder) {
        super(builder);
        this.configRuleId = builder.configRuleId;
        this.remediationId = builder.remediationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRemediationRequest create() {
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

    /**
     * @return remediationId
     */
    public String getRemediationId() {
        return this.remediationId;
    }

    public static final class Builder extends Request.Builder<DescribeRemediationRequest, Builder> {
        private String configRuleId; 
        private String remediationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRemediationRequest request) {
            super(request);
            this.configRuleId = request.configRuleId;
            this.remediationId = request.remediationId;
        } 

        /**
         * The rule ID.
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * The ID of the remediation configuration.
         */
        public Builder remediationId(String remediationId) {
            this.putQueryParameter("RemediationId", remediationId);
            this.remediationId = remediationId;
            return this;
        }

        @Override
        public DescribeRemediationRequest build() {
            return new DescribeRemediationRequest(this);
        } 

    } 

}
