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
 * {@link GetCompressionRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetCompressionRuleResponseBody</p>
 */
public class GetCompressionRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Brotli")
    private String brotli;

    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("Gzip")
    private String gzip;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    private String ruleEnable;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.NameInMap("Zstd")
    private String zstd;

    private GetCompressionRuleResponseBody(Builder builder) {
        this.brotli = builder.brotli;
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.gzip = builder.gzip;
        this.requestId = builder.requestId;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteVersion = builder.siteVersion;
        this.zstd = builder.zstd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompressionRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return brotli
     */
    public String getBrotli() {
        return this.brotli;
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return gzip
     */
    public String getGzip() {
        return this.gzip;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return sequence
     */
    public Integer getSequence() {
        return this.sequence;
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

    public static final class Builder {
        private String brotli; 
        private Long configId; 
        private String configType; 
        private String gzip; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Integer siteVersion; 
        private String zstd; 

        /**
         * Brotli.
         */
        public Builder brotli(String brotli) {
            this.brotli = brotli;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * Gzip.
         */
        public Builder gzip(String gzip) {
            this.gzip = gzip;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * RuleEnable.
         */
        public Builder ruleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * SiteVersion.
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * Zstd.
         */
        public Builder zstd(String zstd) {
            this.zstd = zstd;
            return this;
        }

        public GetCompressionRuleResponseBody build() {
            return new GetCompressionRuleResponseBody(this);
        } 

    } 

}
