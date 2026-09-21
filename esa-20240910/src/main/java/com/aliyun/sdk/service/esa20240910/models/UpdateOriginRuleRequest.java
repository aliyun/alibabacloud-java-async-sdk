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
 * {@link UpdateOriginRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateOriginRuleRequest</p>
 */
public class UpdateOriginRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsRecord")
    private String dnsRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Follow302Enable")
    private String follow302Enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Follow302MaxTries")
    private String follow302MaxTries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Follow302RetainArgs")
    private String follow302RetainArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Follow302RetainHeader")
    private String follow302RetainHeader;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Follow302TargetHost")
    private String follow302TargetHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginHost")
    private String originHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginHttpPort")
    private String originHttpPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginHttpsPort")
    private String originHttpsPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginMtls")
    private String originMtls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginReadTimeout")
    private String originReadTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginScheme")
    private String originScheme;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginSni")
    private String originSni;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginVerify")
    private String originVerify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Range")
    private String range;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RangeChunkSize")
    private String rangeChunkSize;

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
    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateOriginRuleRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
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
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOriginRuleRequest create() {
        return builder().build();
    }

@Override
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateOriginRuleRequest, Builder> {
        private Long configId; 
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
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOriginRuleRequest request) {
            super(request);
            this.configId = request.configId;
            this.dnsRecord = request.dnsRecord;
            this.follow302Enable = request.follow302Enable;
            this.follow302MaxTries = request.follow302MaxTries;
            this.follow302RetainArgs = request.follow302RetainArgs;
            this.follow302RetainHeader = request.follow302RetainHeader;
            this.follow302TargetHost = request.follow302TargetHost;
            this.originHost = request.originHost;
            this.originHttpPort = request.originHttpPort;
            this.originHttpsPort = request.originHttpsPort;
            this.originMtls = request.originMtls;
            this.originReadTimeout = request.originReadTimeout;
            this.originScheme = request.originScheme;
            this.originSni = request.originSni;
            this.originVerify = request.originVerify;
            this.range = request.range;
            this.rangeChunkSize = request.rangeChunkSize;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The configuration ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>Overrides the DNS record for the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        public Builder dnsRecord(String dnsRecord) {
            this.putQueryParameter("DnsRecord", dnsRecord);
            this.dnsRecord = dnsRecord;
            return this;
        }

        /**
         * <p>Indicates whether to follow 302 redirects for origin requests. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Follows 302 redirects.</p>
         * </li>
         * <li><p><code>off</code>: Does not follow 302 redirects.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder follow302Enable(String follow302Enable) {
            this.putQueryParameter("Follow302Enable", follow302Enable);
            this.follow302Enable = follow302Enable;
            return this;
        }

        /**
         * <p>The maximum number of 302 redirects to follow. The value must be an integer from 1 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder follow302MaxTries(String follow302MaxTries) {
            this.putQueryParameter("Follow302MaxTries", follow302MaxTries);
            this.follow302MaxTries = follow302MaxTries;
            return this;
        }

        /**
         * <p>Indicates whether to retain the original request parameters when following a 302 redirect. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Retains the parameters.</p>
         * </li>
         * <li><p><code>off</code>: Does not retain the parameters.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder follow302RetainArgs(String follow302RetainArgs) {
            this.putQueryParameter("Follow302RetainArgs", follow302RetainArgs);
            this.follow302RetainArgs = follow302RetainArgs;
            return this;
        }

        /**
         * <p>Indicates whether to retain the original request headers when following a 302 redirect. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Retains the headers.</p>
         * </li>
         * <li><p><code>off</code>: Does not retain the headers.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder follow302RetainHeader(String follow302RetainHeader) {
            this.putQueryParameter("Follow302RetainHeader", follow302RetainHeader);
            this.follow302RetainHeader = follow302RetainHeader;
            return this;
        }

        /**
         * <p>The <code>Host</code> header for the redirected origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        public Builder follow302TargetHost(String follow302TargetHost) {
            this.putQueryParameter("Follow302TargetHost", follow302TargetHost);
            this.follow302TargetHost = follow302TargetHost;
            return this;
        }

        /**
         * <p>The <code>Host</code> header for the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        public Builder originHost(String originHost) {
            this.putQueryParameter("OriginHost", originHost);
            this.originHost = originHost;
            return this;
        }

        /**
         * <p>The origin server port for HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder originHttpPort(String originHttpPort) {
            this.putQueryParameter("OriginHttpPort", originHttpPort);
            this.originHttpPort = originHttpPort;
            return this;
        }

        /**
         * <p>The origin server port for HTTPS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>4433</p>
         */
        public Builder originHttpsPort(String originHttpsPort) {
            this.putQueryParameter("OriginHttpsPort", originHttpsPort);
            this.originHttpsPort = originHttpsPort;
            return this;
        }

        /**
         * <p>Indicates whether to enable mutual TLS (mTLS) for origin requests. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables mTLS.</p>
         * </li>
         * <li><p><code>off</code>: Disables mTLS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder originMtls(String originMtls) {
            this.putQueryParameter("OriginMtls", originMtls);
            this.originMtls = originMtls;
            return this;
        }

        /**
         * <p>The read timeout period for the origin server, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder originReadTimeout(String originReadTimeout) {
            this.putQueryParameter("OriginReadTimeout", originReadTimeout);
            this.originReadTimeout = originReadTimeout;
            return this;
        }

        /**
         * <p>The protocol for origin requests. Valid values:</p>
         * <ul>
         * <li><p><code>http</code>: The origin request uses HTTP.</p>
         * </li>
         * <li><p><code>https</code>: The origin request uses HTTPS.</p>
         * </li>
         * <li><p><code>follow</code>: The origin request uses the same protocol as the client request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        public Builder originScheme(String originScheme) {
            this.putQueryParameter("OriginScheme", originScheme);
            this.originScheme = originScheme;
            return this;
        }

        /**
         * <p>The Server Name Indication (SNI) for the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        public Builder originSni(String originSni) {
            this.putQueryParameter("OriginSni", originSni);
            this.originSni = originSni;
            return this;
        }

        /**
         * <p>Indicates whether to enable origin certificate verification. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables verification.</p>
         * </li>
         * <li><p><code>off</code>: Disables verification.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder originVerify(String originVerify) {
            this.putQueryParameter("OriginVerify", originVerify);
            this.originVerify = originVerify;
            return this;
        }

        /**
         * <p>Indicates whether to use range requests when fetching files from the origin server. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables range requests.</p>
         * </li>
         * <li><p><code>off</code>: Disables range requests.</p>
         * </li>
         * <li><p><code>force</code>: Enforces range requests.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder range(String range) {
            this.putQueryParameter("Range", range);
            this.range = range;
            return this;
        }

        /**
         * <p>The size of each chunk for range requests. Valid values:</p>
         * <ul>
         * <li><p>512KB</p>
         * </li>
         * <li><p>1MB</p>
         * </li>
         * <li><p>2MB</p>
         * </li>
         * <li><p>4MB</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1MB</p>
         */
        public Builder rangeChunkSize(String rangeChunkSize) {
            this.putQueryParameter("RangeChunkSize", rangeChunkSize);
            this.rangeChunkSize = rangeChunkSize;
            return this;
        }

        /**
         * <p>The rule content, which is a conditional expression that matches user requests. This parameter is not required when you add a global configuration.</p>
         * <ul>
         * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, set the value to a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>Indicates whether the rule is enabled. This parameter is not required when you add a global configuration. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables the rule.</p>
         * </li>
         * <li><p><code>off</code>: Disables the rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * <p>The rule name. This parameter is not required when you add a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The execution priority of the rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The site ID. You can get this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5407498413****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateOriginRuleRequest build() {
            return new UpdateOriginRuleRequest(this);
        } 

    } 

}
