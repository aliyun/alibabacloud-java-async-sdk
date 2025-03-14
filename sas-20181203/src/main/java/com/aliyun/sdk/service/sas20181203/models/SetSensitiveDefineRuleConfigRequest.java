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
 * {@link SetSensitiveDefineRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>SetSensitiveDefineRuleConfigRequest</p>
 */
public class SetSensitiveDefineRuleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableNewRule")
    private Integer enableNewRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private SetSensitiveDefineRuleConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.enableNewRule = builder.enableNewRule;
        this.source = builder.source;
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

    /**
     * @return enableNewRule
     */
    public Integer getEnableNewRule() {
        return this.enableNewRule;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<SetSensitiveDefineRuleConfigRequest, Builder> {
        private String config; 
        private Integer enableNewRule; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(SetSensitiveDefineRuleConfigRequest request) {
            super(request);
            this.config = request.config;
            this.enableNewRule = request.enableNewRule;
            this.source = request.source;
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

        /**
         * <p>Specifies whether to enable the new ruled for automatic check only on agentless detection. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no.</li>
         * <li><strong>1</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableNewRule(Integer enableNewRule) {
            this.putQueryParameter("EnableNewRule", enableNewRule);
            this.enableNewRule = enableNewRule;
            return this;
        }

        /**
         * <p>The source of the check rules. Valid values:</p>
         * <ul>
         * <li><strong>image</strong>: image.</li>
         * <li><strong>agentless</strong>: agentless detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public SetSensitiveDefineRuleConfigRequest build() {
            return new SetSensitiveDefineRuleConfigRequest(this);
        } 

    } 

}
