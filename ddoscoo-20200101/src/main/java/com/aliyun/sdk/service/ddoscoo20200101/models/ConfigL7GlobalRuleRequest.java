// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link ConfigL7GlobalRuleRequest} extends {@link RequestModel}
 *
 * <p>ConfigL7GlobalRuleRequest</p>
 */
public class ConfigL7GlobalRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAttr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleAttr;

    private ConfigL7GlobalRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.ruleAttr = builder.ruleAttr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigL7GlobalRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ruleAttr
     */
    public String getRuleAttr() {
        return this.ruleAttr;
    }

    public static final class Builder extends Request.Builder<ConfigL7GlobalRuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String ruleAttr; 

        private Builder() {
            super();
        } 

        private Builder(ConfigL7GlobalRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.ruleAttr = request.ruleAttr;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The domain name of the website service to configure.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The action and switch settings for global template rules. The value is a string converted from a JSON struct array. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>RuleId</strong>: String | Required | The rule ID.</li>
         * <li><strong>Action</strong>: String | Required | The rule action. Valid values:<ul>
         * <li><strong>block</strong>: Block.</li>
         * <li><strong>watch</strong>: Monitor.</li>
         * <li><strong>challenge</strong>: JavaScript Challenge.</li>
         * </ul>
         * </li>
         * <li><strong>Enabled</strong>: Integer | Required | The rule switch. Valid values:<ul>
         * <li><strong>1</strong>: enables the rule.</li>
         * <li><strong>0</strong>: disables the rule.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;RuleId\&quot;:\&quot;global_01\&quot;,\&quot;Action\&quot;:\&quot;block\&quot;,\&quot;Enabled\&quot;:0}]</p>
         */
        public Builder ruleAttr(String ruleAttr) {
            this.putQueryParameter("RuleAttr", ruleAttr);
            this.ruleAttr = ruleAttr;
            return this;
        }

        @Override
        public ConfigL7GlobalRuleRequest build() {
            return new ConfigL7GlobalRuleRequest(this);
        } 

    } 

}
