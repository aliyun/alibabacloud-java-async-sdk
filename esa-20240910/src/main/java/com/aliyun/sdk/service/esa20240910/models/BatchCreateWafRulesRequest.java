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
 * {@link BatchCreateWafRulesRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateWafRulesRequest</p>
 */
public class BatchCreateWafRulesRequest extends Request {
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

    private BatchCreateWafRulesRequest(Builder builder) {
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

    public static BatchCreateWafRulesRequest create() {
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

    public static final class Builder extends Request.Builder<BatchCreateWafRulesRequest, Builder> {
        private java.util.List<WafRuleConfig> configs; 
        private String phase; 
        private Long rulesetId; 
        private WafBatchRuleShared shared; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateWafRulesRequest request) {
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
         * <p><strong>Required subfields for each phase</strong> (only applicable to the two phases supported by this batch operation):</p>
         * <ul>
         * <li>http_anti_scan: You must provide Type and at least one of ManagedList or RateLimit.</li>
         * <li>http_bot: You must provide configurations related to advanced bots. The subfields are subject to the WafRuleConfig data structure definition.</li>
         * </ul>
         * <blockquote>
         * <p>Note: Other phases such as http_custom and http_whitelist cannot use this batch operation. Use the single-item operation CreateWafRule instead. The subfield constraints are subject to the single-item operation documentation.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: If Configs is missing or subfields are missing, the service returns InvalidParameter(400) or Rule.Config.Malformed.</p>
         * </blockquote>
         */
        public Builder configs(java.util.List<WafRuleConfig> configs) {
            String configsShrink = shrink(configs, "Configs", "json");
            this.putBodyParameter("Configs", configsShrink);
            this.configs = configs;
            return this;
        }

        /**
         * <p>The execution phase of the WAF rule. This <strong>batch operation only supports</strong> the following two phases. For other phases, use the single-item operations CreateWafRule or UpdateWafRule:</p>
         * <ul>
         * <li>http_anti_scan: Scan protection rules.</li>
         * <li>http_bot: Advanced bots.</li>
         * </ul>
         * <blockquote>
         * <p>Note: The http_anti_scan and http_bot phases <strong>only support batch creation</strong>. The single-item operation CreateWafRule does not accept these two values. Conversely, other phases (such as http_custom and http_whitelist) can only be created by using the single-item operation and cannot use this batch operation.</p>
         * </blockquote>
         * <p><strong>Required constraint</strong>: Although this parameter is marked as optional (required: false) in the specification, it <strong>must be provided</strong> when you call this batch operation. If it is not provided, the service returns InvalidParameter(400).</p>
         * <p><strong>Edition prerequisite</strong>: http_anti_scan requires the site to have the <strong>High edition or higher</strong>. Calls from the Basic edition return Phase.HttpAntiScan.NotSupport. Verify the site edition before you call the operation.</p>
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
         * <p>The ID of the WAF ruleset. You can obtain the ruleset ID by calling the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation.</p>
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
         * <p>The shared configuration for multiple rules, which specifies the common attributes of the rules.</p>
         * <p><strong>Conditionally required</strong>: Although this parameter is marked as optional (required: false) in the specification, it is <strong>actually required</strong> when Phase is set to http_anti_scan. If it is not provided, the service returns InvalidParameter(400).</p>
         * <p><strong>Subfield requirements</strong>: In the http_anti_scan phase, Shared must include shared fields such as Name (rule name) and Action (rule action). For other phases, the required subfields of Shared depend on the specific phase.</p>
         */
        public Builder shared(WafBatchRuleShared shared) {
            String sharedShrink = shrink(shared, "Shared", "json");
            this.putBodyParameter("Shared", sharedShrink);
            this.shared = shared;
            return this;
        }

        /**
         * <p>The site ID. You can obtain the site ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
         * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version where the configuration takes effect. Default value: 0.</p>
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
        public BatchCreateWafRulesRequest build() {
            return new BatchCreateWafRulesRequest(this);
        } 

    } 

}
