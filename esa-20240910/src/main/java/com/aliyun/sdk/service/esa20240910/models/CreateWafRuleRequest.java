// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateWafRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateWafRuleRequest</p>
 */
public class CreateWafRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private WafRuleConfig config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phase")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phase;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RulesetId")
    private Long rulesetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private CreateWafRuleRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.phase = builder.phase;
        this.rulesetId = builder.rulesetId;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWafRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public WafRuleConfig getConfig() {
        return this.config;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return rulesetId
     */
    public Long getRulesetId() {
        return this.rulesetId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder extends Request.Builder<CreateWafRuleRequest, Builder> {
        private WafRuleConfig config; 
        private String phase; 
        private Long rulesetId; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateWafRuleRequest request) {
            super(request);
            this.config = request.config;
            this.phase = request.phase;
            this.rulesetId = request.rulesetId;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>The specific configuration of the WAF rule (<code>WafRuleConfig</code> data structure). The required fields vary depending on the Phase value:</p>
         * <ul>
         * <li><code>http_custom</code>: <code>Expression</code> (match expression) and <code>Action</code> (action upon match) are required. Setting <code>Name</code> is recommended for easier identification.</li>
         * <li><code>http_whitelist</code>: <code>Expression</code> is required. Matched requests are allowed directly (no Action).</li>
         * <li><code>http_ratelimit</code>: <code>Expression</code> and <code>RateLimit</code> (rate limiting parameters) are required.</li>
         * <li><code>ip_access_rule</code>: <code>Expression</code> (containing IP match) and <code>Action</code> are required.</li>
         * </ul>
         * <blockquote>
         * <p>The complete field definitions are based on the <code>WafRuleConfig</code> data structure. If required fields are missing, the service returns <code>InvalidParameter(400)</code> / <code>Rule.Config.Malformed</code>.</p>
         * </blockquote>
         */
        public Builder config(WafRuleConfig config) {
            String configShrink = shrink(config, "Config", "json");
            this.putBodyParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * <p>The WAF rule execution phase. This <strong>single-creation operation</strong> supports the following phases (it does not support <code>http_anti_scan</code> or <code>http_bot</code>. For these two phases, use the batch operation <code>BatchCreateWafRules</code>):</p>
         * <ul>
         * <li><code>http_whitelist</code>: whitelist rule</li>
         * <li><code>http_custom</code>: custom rule</li>
         * <li><code>http_managed</code>: managed rule</li>
         * <li><code>http_ratelimit</code>: rate limiting rule</li>
         * <li><code>ip_access_rule</code>: IP access rule</li>
         * <li><code>http_security_level_rule</code>: security rule</li>
         * </ul>
         * <blockquote>
         * <p>Note: <code>http_anti_scan</code> and <code>http_bot</code> can only be created through the batch operation. Passing these two values to this operation returns an error.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        public Builder phase(String phase) {
            this.putBodyParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>The ID of the WAF ruleset. You can call the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation to obtain the ruleset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder rulesetId(Long rulesetId) {
            this.putBodyParameter("RulesetId", rulesetId);
            this.rulesetId = rulesetId;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the site version on which the configuration takes effect. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public CreateWafRuleRequest build() {
            return new CreateWafRuleRequest(this);
        } 

    } 

}
