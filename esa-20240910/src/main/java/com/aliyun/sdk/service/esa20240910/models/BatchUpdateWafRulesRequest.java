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
         * <p>The list of rule configurations, which specifies the detailed configuration of each rule.</p>
         * <p><strong>Required sub-fields for each phase</strong> (applicable only to the two phases supported by this batch operation):</p>
         * <ul>
         * <li><code>http_anti_scan</code>: You must provide <code>Type</code>, and at least one of <code>ManagedList</code> or <code>RateLimit</code>.</li>
         * <li><code>http_bot</code>: You must provide configurations related to advanced bot management. The sub-fields are subject to the definition of the <code>WafRuleConfig</code> data structure.</li>
         * </ul>
         * <blockquote>
         * <p>Note: Other phases such as <code>http_custom</code> and <code>http_whitelist</code> cannot be updated by using this batch operation. Use the single-rule operation <code>UpdateWafRule</code> instead. The sub-field constraints are subject to the documentation of the single-rule operation.</p>
         * </blockquote>
         * <blockquote>
         * <p>Note: If <code>Configs</code> is empty or sub-fields are missing, the server returns an <code>InvalidParameter(400)</code> or <code>Rule.Config.Malformed</code> error.</p>
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
         * <p>The execution phase of WAF rules. This <strong>batch operation supports only</strong> the following two phases. For other phases, use the single-rule operation <code>UpdateWafRule</code>:</p>
         * <ul>
         * <li><code>http_anti_scan</code>: scan protection rules</li>
         * <li><code>http_bot</code>: advanced bot management rules</li>
         * </ul>
         * <blockquote>
         * <p>Note: The <code>http_anti_scan</code> and <code>http_bot</code> phases <strong>support only batch updates</strong>. The single-rule operation <code>UpdateWafRule</code> does not accept these two values. Conversely, other phases (such as <code>http_custom</code> and <code>http_whitelist</code>) can only be updated by using the single-rule operation and cannot be updated by using this batch operation.</p>
         * </blockquote>
         * <p><strong>Required constraint</strong>: Although this parameter is marked as optional (required: false) in the specification, it <strong>must be specified</strong> when you call this batch operation. The server cannot determine the target rule set without the Phase parameter. If this parameter is not provided, an <code>InvalidParameter(400)</code> error is returned.</p>
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
         * <p>The ID of the WAF rule set. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation.</p>
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
         * <p>The shared configuration for multiple rules, which specifies the common properties of multiple rules.</p>
         * <p><strong>Conditional requirement</strong>: Although this parameter is marked as optional (required: false) in the specification, it is <strong>actually required</strong> when <code>Phase</code> is set to <code>http_anti_scan</code>. If this parameter is not provided, the server returns an <code>InvalidParameter(400)</code> error.</p>
         * <p><strong>Sub-field requirements</strong>: In the <code>http_anti_scan</code> phase, the Shared parameter must include shared fields such as <code>Name</code> (rule name), <code>Expression</code> (match expression), and <code>Action</code> (rule action). For other phases, the required sub-fields of Shared depend on the specific phase.</p>
         */
        public Builder shared(WafBatchRuleShared shared) {
            String sharedShrink = shrink(shared, "Shared", "json");
            this.putBodyParameter("Shared", sharedShrink);
            this.shared = shared;
            return this;
        }

        /**
         * <p>The ID of the site. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
         * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
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
