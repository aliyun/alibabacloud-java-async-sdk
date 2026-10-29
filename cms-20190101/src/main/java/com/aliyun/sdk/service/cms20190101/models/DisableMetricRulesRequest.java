// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DisableMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>DisableMetricRulesRequest</p>
 */
public class DisableMetricRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> ruleId;

    private DisableMetricRulesRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableMetricRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ruleId
     */
    public java.util.List<String> getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DisableMetricRulesRequest, Builder> {
        private Boolean dryRun; 
        private java.util.List<String> ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DisableMetricRulesRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>Specifies whether to perform a dry run of the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sends a dry run request and does not bind a security group to the instance. Check items include whether required parameters are specified, the request format, and service limits. If the request fails the check, the corresponding error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends a normal request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ruleId(java.util.List<String> ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DisableMetricRulesRequest build() {
            return new DisableMetricRulesRequest(this);
        } 

    } 

}
