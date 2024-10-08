// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetSensitiveDefineRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>SetSensitiveDefineRuleConfigRequest</p>
 */
public class SetSensitiveDefineRuleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    private SetSensitiveDefineRuleConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSensitiveDefineRuleConfigRequest create() {
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

    public static final class Builder extends Request.Builder<SetSensitiveDefineRuleConfigRequest, Builder> {
        private String config; 

        private Builder() {
            super();
        } 

        private Builder(SetSensitiveDefineRuleConfigRequest request) {
            super(request);
            this.config = request.config;
        } 

        /**
         * <p>The configurations of the custom check rule. The value is in the JSON format. Valid values of keys:</p>
         * <ul>
         * <li><strong>classKey</strong>: the category keyword of the check rule.</li>
         * <li><strong>ruleList</strong>: the keyword of the check rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;classKey&quot;: &quot;password&quot;, &quot;ruleList&quot;: [&quot;huaweicloud_ak&quot;, &quot;ak_leak&quot;]}]</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        @Override
        public SetSensitiveDefineRuleConfigRequest build() {
            return new SetSensitiveDefineRuleConfigRequest(this);
        } 

    } 

}
