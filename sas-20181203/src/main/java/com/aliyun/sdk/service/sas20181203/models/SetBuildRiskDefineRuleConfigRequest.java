// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link SetBuildRiskDefineRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>SetBuildRiskDefineRuleConfigRequest</p>
 */
public class SetBuildRiskDefineRuleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    private SetBuildRiskDefineRuleConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetBuildRiskDefineRuleConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    public static final class Builder extends Request.Builder<SetBuildRiskDefineRuleConfigRequest, Builder> {
        private String config; 

        private Builder() {
            super();
        } 

        private Builder(SetBuildRiskDefineRuleConfigRequest request) {
            super(request);
            this.config = request.config;
        } 

        /**
         * <p>The configuration item for scanning image build command risks. Valid values:</p>
         * <ul>
         * <li><strong>classKey</strong>: Set the value to a valid value of the ClassKey parameter in RuleTree.</li>
         * <li><strong>ruleList</strong>: Set the value to a valid value of the RuleKey parameter in RuleList.</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~GetBuildRiskDefineRuleConfig~~">GetBuildRiskDefineRuleConfig</a> operation to query the valid values.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;classKey&quot;: &quot;other&quot;,
         *         &quot;ruleList&quot;: [
         *             &quot;add&quot;,
         *             &quot;apk&quot;
         *         ]
         *     }
         * ]</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        @Override
        public SetBuildRiskDefineRuleConfigRequest build() {
            return new SetBuildRiskDefineRuleConfigRequest(this);
        } 

    } 

}
