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

    @com.aliyun.core.annotation.NameInMap("Follow302Enable")
    private String follow302Enable;

    @com.aliyun.core.annotation.NameInMap("Follow302MaxTries")
    private String follow302MaxTries;

    @com.aliyun.core.annotation.NameInMap("Follow302RetainArgs")
    private String follow302RetainArgs;

    @com.aliyun.core.annotation.NameInMap("Follow302RetainHeader")
    private String follow302RetainHeader;

    @com.aliyun.core.annotation.NameInMap("Follow302TargetHost")
    private String follow302TargetHost;

    @com.aliyun.core.annotation.NameInMap("OriginHost")
    private String originHost;

    @com.aliyun.core.annotation.NameInMap("OriginHttpPort")
    private String originHttpPort;

    @com.aliyun.core.annotation.NameInMap("OriginHttpsPort")
    private String originHttpsPort;

    @com.aliyun.core.annotation.NameInMap("OriginMtls")
    private String originMtls;

    @com.aliyun.core.annotation.NameInMap("OriginReadTimeout")
    private String originReadTimeout;

    @com.aliyun.core.annotation.NameInMap("OriginScheme")
    private String originScheme;

    @com.aliyun.core.annotation.NameInMap("OriginSni")
    private String originSni;

    @com.aliyun.core.annotation.NameInMap("OriginVerify")
    private String originVerify;

    @com.aliyun.core.annotation.NameInMap("Range")
    private String range;

    @com.aliyun.core.annotation.NameInMap("RangeChunkSize")
    private String rangeChunkSize;

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
        this.follow302Enable = builder.follow302Enable;
        this.follow302MaxTries = builder.follow302MaxTries;
        this.follow302RetainArgs = builder.follow302RetainArgs;
        this.follow302RetainHeader = builder.follow302RetainHeader;
        this.follow302TargetHost = builder.follow302TargetHost;
        this.originHost = builder.originHost;
        this.originHttpPort = builder.originHttpPort;
        this.originHttpsPort = builder.originHttpsPort;
        this.originMtls = builder.originMtls;
        this.originReadTimeout = builder.originReadTimeout;
        this.originScheme = builder.originScheme;
        this.originSni = builder.originSni;
        this.originVerify = builder.originVerify;
        this.range = builder.range;
        this.rangeChunkSize = builder.rangeChunkSize;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return follow302Enable
     */
    public String getFollow302Enable() {
        return this.follow302Enable;
    }

    /**
     * @return follow302MaxTries
     */
    public String getFollow302MaxTries() {
        return this.follow302MaxTries;
    }

    /**
     * @return follow302RetainArgs
     */
    public String getFollow302RetainArgs() {
        return this.follow302RetainArgs;
    }

    /**
     * @return follow302RetainHeader
     */
    public String getFollow302RetainHeader() {
        return this.follow302RetainHeader;
    }

    /**
     * @return follow302TargetHost
     */
    public String getFollow302TargetHost() {
        return this.follow302TargetHost;
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
     * @return originReadTimeout
     */
    public String getOriginReadTimeout() {
        return this.originReadTimeout;
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
     * @return rangeChunkSize
     */
    public String getRangeChunkSize() {
        return this.rangeChunkSize;
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
        private String follow302Enable; 
        private String follow302MaxTries; 
        private String follow302RetainArgs; 
        private String follow302RetainHeader; 
        private String follow302TargetHost; 
        private String originHost; 
        private String originHttpPort; 
        private String originHttpsPort; 
        private String originMtls; 
        private String originReadTimeout; 
        private String originScheme; 
        private String originSni; 
        private String originVerify; 
        private String range; 
        private String rangeChunkSize; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Integer siteVersion; 

        private Builder() {
        } 

        private Builder(GetOriginRuleResponseBody model) {
            this.configId = model.configId;
            this.configType = model.configType;
            this.dnsRecord = model.dnsRecord;
            this.follow302Enable = model.follow302Enable;
            this.follow302MaxTries = model.follow302MaxTries;
            this.follow302RetainArgs = model.follow302RetainArgs;
            this.follow302RetainHeader = model.follow302RetainHeader;
            this.follow302TargetHost = model.follow302TargetHost;
            this.originHost = model.originHost;
            this.originHttpPort = model.originHttpPort;
            this.originHttpsPort = model.originHttpsPort;
            this.originMtls = model.originMtls;
            this.originReadTimeout = model.originReadTimeout;
            this.originScheme = model.originScheme;
            this.originSni = model.originSni;
            this.originVerify = model.originVerify;
            this.range = model.range;
            this.rangeChunkSize = model.rangeChunkSize;
            this.requestId = model.requestId;
            this.rule = model.rule;
            this.ruleEnable = model.ruleEnable;
            this.ruleName = model.ruleName;
            this.sequence = model.sequence;
            this.siteVersion = model.siteVersion;
        } 

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
         * Follow302Enable.
         */
        public Builder follow302Enable(String follow302Enable) {
            this.follow302Enable = follow302Enable;
            return this;
        }

        /**
         * Follow302MaxTries.
         */
        public Builder follow302MaxTries(String follow302MaxTries) {
            this.follow302MaxTries = follow302MaxTries;
            return this;
        }

        /**
         * Follow302RetainArgs.
         */
        public Builder follow302RetainArgs(String follow302RetainArgs) {
            this.follow302RetainArgs = follow302RetainArgs;
            return this;
        }

        /**
         * Follow302RetainHeader.
         */
        public Builder follow302RetainHeader(String follow302RetainHeader) {
            this.follow302RetainHeader = follow302RetainHeader;
            return this;
        }

        /**
         * Follow302TargetHost.
         */
        public Builder follow302TargetHost(String follow302TargetHost) {
            this.follow302TargetHost = follow302TargetHost;
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
         * <p>Port of the origin server accessed when using the HTTP protocol for origin.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder originHttpPort(String originHttpPort) {
            this.originHttpPort = originHttpPort;
            return this;
        }

        /**
         * <p>Port of the origin server accessed when using the HTTPS protocol for origin.</p>
         * 
         * <strong>example:</strong>
         * <p>4433</p>
         */
        public Builder originHttpsPort(String originHttpsPort) {
            this.originHttpsPort = originHttpsPort;
            return this;
        }

        /**
         * <p>mTLS switch. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder originMtls(String originMtls) {
            this.originMtls = originMtls;
            return this;
        }

        /**
         * OriginReadTimeout.
         */
        public Builder originReadTimeout(String originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }

        /**
         * <p>Protocol used for the origin request. Value range:</p>
         * <ul>
         * <li>http: Use HTTP protocol for origin.</li>
         * <li>https: Use HTTPS protocol for origin.</li>
         * <li>follow: Follow the client&quot;s protocol for origin.</li>
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
         * <p>Origin certificate verification switch. Value range: </p>
         * <ul>
         * <li>on: Enable. </li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder originVerify(String originVerify) {
            this.originVerify = originVerify;
            return this;
        }

        /**
         * <p>Use the range chunk method for origin file download. Value range:</p>
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
         * RangeChunkSize.
         */
        public Builder rangeChunkSize(String rangeChunkSize) {
            this.rangeChunkSize = rangeChunkSize;
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true</li>
         * <li>Match specific requests: Set the value to a custom expression, e.g., (http.host eq &quot;video.example.com&quot;)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>Rule switch. This parameter does not need to be set when adding a global configuration. Value range:</p>
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
         * <p>Rule name. This parameter does not need to be set when adding a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Rule execution order. The smaller the value, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the site configuration, defaulting to version 0.</p>
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
