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
         * <p>A list of configurations for each rule, specifying detailed configurations for each rule.</p>
         */
        public Builder configs(java.util.List<WafRuleConfig> configs) {
            String configsShrink = shrink(configs, "Configs", "json");
            this.putBodyParameter("Configs", configsShrink);
            this.configs = configs;
            return this;
        }

        /**
         * <p>WAF rule type, with values:</p>
         * <ul>
         * <li><strong>http_anti_scan</strong>: Scan protection.</li>
         * <li><strong>http_bot</strong>: Bots.</li>
         * </ul>
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
         * <p>Ruleset ID.</p>
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
         * <p>Shared configuration for multiple rules, specifying common attributes of multiple rules.</p>
         */
        public Builder shared(WafBatchRuleShared shared) {
            String sharedShrink = shrink(shared, "Shared", "json");
            this.putBodyParameter("Shared", sharedShrink);
            this.shared = shared;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
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
         * <p>Site version.</p>
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
