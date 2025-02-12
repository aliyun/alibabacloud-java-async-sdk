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
 * {@link CreateCompressionRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateCompressionRuleRequest</p>
 */
public class CreateCompressionRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Brotli")
    private String brotli;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gzip")
    private String gzip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    private String ruleEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Zstd")
    private String zstd;

    private CreateCompressionRuleRequest(Builder builder) {
        super(builder);
        this.brotli = builder.brotli;
        this.gzip = builder.gzip;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
        this.zstd = builder.zstd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCompressionRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brotli
     */
    public String getBrotli() {
        return this.brotli;
    }

    /**
     * @return gzip
     */
    public String getGzip() {
        return this.gzip;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return ruleEnable
     */
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
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

    /**
     * @return zstd
     */
    public String getZstd() {
        return this.zstd;
    }

    public static final class Builder extends Request.Builder<CreateCompressionRuleRequest, Builder> {
        private String brotli; 
        private String gzip; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private Integer siteVersion; 
        private String zstd; 

        private Builder() {
            super();
        } 

        private Builder(CreateCompressionRuleRequest request) {
            super(request);
            this.brotli = request.brotli;
            this.gzip = request.gzip;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
            this.zstd = request.zstd;
        } 

        /**
         * Brotli.
         */
        public Builder brotli(String brotli) {
            this.putQueryParameter("Brotli", brotli);
            this.brotli = brotli;
            return this;
        }

        /**
         * Gzip.
         */
        public Builder gzip(String gzip) {
            this.putQueryParameter("Gzip", gzip);
            this.gzip = gzip;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * RuleEnable.
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1231231221***</p>
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

        /**
         * Zstd.
         */
        public Builder zstd(String zstd) {
            this.putQueryParameter("Zstd", zstd);
            this.zstd = zstd;
            return this;
        }

        @Override
        public CreateCompressionRuleRequest build() {
            return new CreateCompressionRuleRequest(this);
        } 

    } 

}
