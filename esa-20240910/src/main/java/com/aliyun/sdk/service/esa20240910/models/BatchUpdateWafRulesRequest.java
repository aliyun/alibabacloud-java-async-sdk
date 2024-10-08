// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List < WafRuleConfig > configs;

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
    public java.util.List < WafRuleConfig > getConfigs() {
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
        private java.util.List < WafRuleConfig > configs; 
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
         * Configs.
         */
        public Builder configs(java.util.List < WafRuleConfig > configs) {
            String configsShrink = shrink(configs, "Configs", "json");
            this.putBodyParameter("Configs", configsShrink);
            this.configs = configs;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.putBodyParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * RulesetId.
         */
        public Builder rulesetId(Long rulesetId) {
            this.putBodyParameter("RulesetId", rulesetId);
            this.rulesetId = rulesetId;
            return this;
        }

        /**
         * Shared.
         */
        public Builder shared(WafBatchRuleShared shared) {
            String sharedShrink = shrink(shared, "Shared", "json");
            this.putBodyParameter("Shared", sharedShrink);
            this.shared = shared;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteVersion.
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
