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
 * {@link BatchUpdateWafRulesRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateWafRulesRequest</p>
 */
public class BatchUpdateWafRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<WafRuleConfig> configs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RulesetId")
    private Long rulesetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Shared")
    private WafBatchRuleShared shared;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private BatchUpdateWafRulesRequest(Builder builder) {
        super(builder);
        this.configs = builder.configs;
        this.phase = builder.phase;
        this.rulesetId = builder.rulesetId;
        this.shared = builder.shared;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateWafRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<WafRuleConfig> getConfigs() {
        return this.configs;
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
     * @return shared
     */
    public WafBatchRuleShared getShared() {
        return this.shared;
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

    public static final class Builder extends Request.Builder<BatchUpdateWafRulesRequest, Builder> {
        private java.util.List<WafRuleConfig> configs; 
        private String phase; 
        private Long rulesetId; 
        private WafBatchRuleShared shared; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateWafRulesRequest request) {
            super(request);
            this.configs = request.configs;
            this.phase = request.phase;
            this.rulesetId = request.rulesetId;
            this.shared = request.shared;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>The list of rule configurations. Specifies the detailed configuration for each rule.</p>
         * <p><strong>Required subfields for each phase</strong> (applicable only to the two phases supported by this batch operation):</p>
         * <ul>
         * <li><code>http_anti_scan</code>: You must provide <code>Type</code> and at least one of <code>ManagedList</code> or <code>RateLimit</code>.</li>
         * <li><code>http_bot</code>: You must provide the advanced mode bots configuration. The subfields are defined in the <code>WafRuleConfig</code> data structure.</li>
         * </ul>
         * <blockquote>
         * <p>Note: Other phases such as <code>http_custom</code> and <code>http_whitelist</code> cannot use this batch operation. Use the single-rule operation <code>UpdateWafRule</code> instead. The subfield constraints for those phases are described in the single-rule operation documentation.</p>
         * </blockquote>
         * <blockquote>
         * <p>Important: If <code>Configs</code> is missing or subfields are incomplete, the server returns <code>InvalidParameter(400)</code> or <code>Rule.Config.Malformed</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder configs(java.util.List<WafRuleConfig> configs) {
            String configsShrink = shrink(configs, "Configs", "json");
            this.putBodyParameter("Configs", configsShrink);
            this.configs = configs;
            return this;
        }

        /**
         * <p>The WAF rule execution phase. This <strong>batch operation supports only</strong> the following two phases. For other phases, use the single-rule operation <code>UpdateWafRule</code>:</p>
         * <ul>
         * <li><code>http_anti_scan</code>: scan protection rules</li>
         * <li><code>http_bot</code>: advanced mode bots</li>
         * </ul>
         * <blockquote>
         * <p>Note: The <code>http_anti_scan</code> and <code>http_bot</code> phases <strong>support only batch updates</strong>. The single-rule operation <code>UpdateWafRule</code> does not accept these two values. Conversely, other phases such as <code>http_custom</code> and <code>http_whitelist</code> can be updated only by using the single-rule operation, not this batch operation.</p>
         * </blockquote>
         * <p><strong>Required constraint</strong>: Although this parameter is marked as optional (required: false) in the specification, it is <strong>required</strong> when you call this batch operation. The server cannot determine the target ruleset without the Phase parameter and returns <code>InvalidParameter(400)</code> if it is not provided.</p>
         * 
         * <strong>example:</strong>
         * <p>http_anti_scan</p>
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
         * <p>The shared configuration for multiple rules. Specifies the common properties shared across multiple rules.</p>
         * <p><strong>Conditionally required</strong>: Although this parameter is marked as optional (required: false) in the specification, it is <strong>required</strong> when <code>Phase=http_anti_scan</code>. The server returns <code>InvalidParameter(400)</code> if it is not provided.</p>
         * <p><strong>Subfield requirements</strong>: When the phase is <code>http_anti_scan</code>, Shared must include the <code>Name</code> (rule name), <code>Expression</code> (match expression), and <code>Action</code> (rule action) shared fields. For other phases, the required subfields of Shared vary depending on the specific phase.</p>
         */
        public Builder shared(WafBatchRuleShared shared) {
            String sharedShrink = shrink(shared, "Shared", "json");
            this.putBodyParameter("Shared", sharedShrink);
            this.shared = shared;
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
        public BatchUpdateWafRulesRequest build() {
            return new BatchUpdateWafRulesRequest(this);
        } 

    } 

}
