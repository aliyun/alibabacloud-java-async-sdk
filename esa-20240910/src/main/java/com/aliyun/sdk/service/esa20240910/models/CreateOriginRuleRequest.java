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
 * {@link CreateOriginRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateOriginRuleRequest</p>
 */
public class CreateOriginRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsRecord")
    private String dnsRecord;

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
    @com.aliyun.core.annotation.NameInMap("OriginScheme")
    private String originScheme;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginSni")
    private String originSni;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Range")
    private String range;

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

    private CreateOriginRuleRequest(Builder builder) {
        super(builder);
        this.dnsRecord = builder.dnsRecord;
        this.originHost = builder.originHost;
        this.originHttpPort = builder.originHttpPort;
        this.originHttpsPort = builder.originHttpsPort;
        this.originScheme = builder.originScheme;
        this.originSni = builder.originSni;
        this.range = builder.range;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOriginRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return range
     */
    public String getRange() {
        return this.range;
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

    public static final class Builder extends Request.Builder<CreateOriginRuleRequest, Builder> {
        private String dnsRecord; 
        private String originHost; 
        private String originHttpPort; 
        private String originHttpsPort; 
        private String originScheme; 
        private String originSni; 
        private String range; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateOriginRuleRequest request) {
            super(request);
            this.dnsRecord = request.dnsRecord;
            this.originHost = request.originHost;
            this.originHttpPort = request.originHttpPort;
            this.originHttpsPort = request.originHttpsPort;
            this.originScheme = request.originScheme;
            this.originSni = request.originSni;
            this.range = request.range;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>Rewrite the DNS resolution record for the origin request.</p>
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
         * <p>Port of the origin server when using the HTTP protocol for origin requests.</p>
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
         * <p>Port of the origin server when using the HTTPS protocol for origin requests.</p>
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
         * <p>Protocol used for the origin request. Possible values:</p>
         * <ul>
         * <li>http: Use HTTP protocol for origin requests.</li>
         * <li>https: Use HTTPS protocol for origin requests.</li>
         * <li>follow: Follow the client&quot;s protocol for origin requests.</li>
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
         * <p>The SNI carried in the origin request.</p>
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
         * <p>Use range chunking for downloading files from the origin. Possible values:</p>
         * <ul>
         * <li>on: Enable</li>
         * <li>off: Disable</li>
         * <li>force: Force</li>
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
         * <p>Rule content.</p>
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
         * <p>Rule switch. Possible values:</p>
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
         * <p>Rule name.</p>
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
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>340035003106221</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the version of the site where the configuration takes effect. The default is version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public CreateOriginRuleRequest build() {
            return new CreateOriginRuleRequest(this);
        } 

    } 

}
