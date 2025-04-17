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
         * <p>Configuration ID.</p>
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
         * <p>Rewrite the DNS resolution record of the origin request.</p>
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
         * Follow302Enable.
         */
        public Builder follow302Enable(String follow302Enable) {
            this.putQueryParameter("Follow302Enable", follow302Enable);
            this.follow302Enable = follow302Enable;
            return this;
        }

        /**
         * Follow302MaxTries.
         */
        public Builder follow302MaxTries(String follow302MaxTries) {
            this.putQueryParameter("Follow302MaxTries", follow302MaxTries);
            this.follow302MaxTries = follow302MaxTries;
            return this;
        }

        /**
         * Follow302RetainArgs.
         */
        public Builder follow302RetainArgs(String follow302RetainArgs) {
            this.putQueryParameter("Follow302RetainArgs", follow302RetainArgs);
            this.follow302RetainArgs = follow302RetainArgs;
            return this;
        }

        /**
         * Follow302RetainHeader.
         */
        public Builder follow302RetainHeader(String follow302RetainHeader) {
            this.putQueryParameter("Follow302RetainHeader", follow302RetainHeader);
            this.follow302RetainHeader = follow302RetainHeader;
            return this;
        }

        /**
         * Follow302TargetHost.
         */
        public Builder follow302TargetHost(String follow302TargetHost) {
            this.putQueryParameter("Follow302TargetHost", follow302TargetHost);
            this.follow302TargetHost = follow302TargetHost;
            return this;
        }

        /**
         * <p>The HOST carried in the origin request.</p>
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
         * <p>Port of the origin server when using HTTP protocol for origin pull.</p>
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
         * <p>Port of the origin server when using HTTPS protocol for origin pull.</p>
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
         * <p>mTLS switch. Valid values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * OriginReadTimeout.
         */
        public Builder originReadTimeout(String originReadTimeout) {
            this.putQueryParameter("OriginReadTimeout", originReadTimeout);
            this.originReadTimeout = originReadTimeout;
            return this;
        }

        /**
         * <p>Protocol used for the origin request. Valid values:</p>
         * <ul>
         * <li>http: Use HTTP protocol for origin pull.</li>
         * <li>https: Use HTTPS protocol for origin pull.</li>
         * <li>follow: Follow the client&quot;s protocol for origin pull.</li>
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
         * <p>SNI carried in the origin request.</p>
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
         * <p>Origin certificate verification switch. Valid values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * <p>Use range chunking for origin pull file download. Valid values:</p>
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
            this.putQueryParameter("Range", range);
            this.range = range;
            return this;
        }

        /**
         * RangeChunkSize.
         */
        public Builder rangeChunkSize(String rangeChunkSize) {
            this.putQueryParameter("RangeChunkSize", rangeChunkSize);
            this.rangeChunkSize = rangeChunkSize;
            return this;
        }

        /**
         * <p>Rule content, used to match user requests with conditional expressions. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true</li>
         * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>Rule switch. This parameter is not required when adding a global configuration. Valid values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * <p>Rule name. This parameter is not required when adding a global configuration.</p>
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
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
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
