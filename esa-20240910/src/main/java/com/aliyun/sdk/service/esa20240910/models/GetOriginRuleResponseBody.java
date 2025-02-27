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
 * {@link GetOriginRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetOriginRuleResponseBody</p>
 */
public class GetOriginRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("DnsRecord")
    private String dnsRecord;

    @com.aliyun.core.annotation.NameInMap("OriginHost")
    private String originHost;

    @com.aliyun.core.annotation.NameInMap("OriginHttpPort")
    private String originHttpPort;

    @com.aliyun.core.annotation.NameInMap("OriginHttpsPort")
    private String originHttpsPort;

    @com.aliyun.core.annotation.NameInMap("OriginMtls")
    private String originMtls;

    @com.aliyun.core.annotation.NameInMap("OriginScheme")
    private String originScheme;

    @com.aliyun.core.annotation.NameInMap("OriginSni")
    private String originSni;

    @com.aliyun.core.annotation.NameInMap("OriginVerify")
    private String originVerify;

    @com.aliyun.core.annotation.NameInMap("Range")
    private String range;

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

    private GetOriginRuleResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.dnsRecord = builder.dnsRecord;
        this.originHost = builder.originHost;
        this.originHttpPort = builder.originHttpPort;
        this.originHttpsPort = builder.originHttpsPort;
        this.originMtls = builder.originMtls;
        this.originScheme = builder.originScheme;
        this.originSni = builder.originSni;
        this.originVerify = builder.originVerify;
        this.range = builder.range;
        this.requestId = builder.requestId;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOriginRuleResponseBody create() {
        return builder().build();
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
     * @return dnsRecord
     */
    public String getDnsRecord() {
        return this.dnsRecord;
    }

    /**
     * @return originHost
     */
    public String getOriginHost() {
        return this.originHost;
    }

    /**
     * @return originHttpPort
     */
    public String getOriginHttpPort() {
        return this.originHttpPort;
    }

    /**
     * @return originHttpsPort
     */
    public String getOriginHttpsPort() {
        return this.originHttpsPort;
    }

    /**
     * @return originMtls
     */
    public String getOriginMtls() {
        return this.originMtls;
    }

    /**
     * @return originScheme
     */
    public String getOriginScheme() {
        return this.originScheme;
    }

    /**
     * @return originSni
     */
    public String getOriginSni() {
        return this.originSni;
    }

    /**
     * @return originVerify
     */
    public String getOriginVerify() {
        return this.originVerify;
    }

    /**
     * @return range
     */
    public String getRange() {
        return this.range;
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

    public static final class Builder {
        private Long configId; 
        private String configType; 
        private String dnsRecord; 
        private String originHost; 
        private String originHttpPort; 
        private String originHttpsPort; 
        private String originMtls; 
        private String originScheme; 
        private String originSni; 
        private String originVerify; 
        private String range; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Integer siteVersion; 

        /**
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>Configuration type, which can be used to query global or rule configurations. Value range:</p>
         * <ul>
         * <li>global: Query global configuration.</li>
         * <li>rule: Query rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>Rewrite the DNS resolution record for the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        public Builder dnsRecord(String dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }

        /**
         * <p>HOST carried in the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        public Builder originHost(String originHost) {
            this.originHost = originHost;
            return this;
        }

        /**
         * <p>Source site port accessed when using the HTTP protocol for origin.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder originHttpPort(String originHttpPort) {
            this.originHttpPort = originHttpPort;
            return this;
        }

        /**
         * <p>Source site port accessed when using the HTTPS protocol for origin.</p>
         * 
         * <strong>example:</strong>
         * <p>4433</p>
         */
        public Builder originHttpsPort(String originHttpsPort) {
            this.originHttpsPort = originHttpsPort;
            return this;
        }

        /**
         * OriginMtls.
         */
        public Builder originMtls(String originMtls) {
            this.originMtls = originMtls;
            return this;
        }

        /**
         * <p>Protocol used for the origin request. Value range:</p>
         * <ul>
         * <li>http: Use HTTP protocol for origin.</li>
         * <li>https: Use HTTPS protocol for origin.</li>
         * <li>follow: Follow client protocol for origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        public Builder originScheme(String originScheme) {
            this.originScheme = originScheme;
            return this;
        }

        /**
         * <p>SNI carried in the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        public Builder originSni(String originSni) {
            this.originSni = originSni;
            return this;
        }

        /**
         * OriginVerify.
         */
        public Builder originVerify(String originVerify) {
            this.originVerify = originVerify;
            return this;
        }

        /**
         * <p>Use range chunking method for origin download. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * <li>force: Force.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder range(String range) {
            this.range = range;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>Rule switch. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Rule execution sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>Site version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        public GetOriginRuleResponseBody build() {
            return new GetOriginRuleResponseBody(this);
        } 

    } 

}
