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
 * {@link CreateHttpsApplicationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateHttpsApplicationConfigurationRequest</p>
 */
public class CreateHttpsApplicationConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AltSvc")
    private String altSvc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AltSvcClear")
    private String altSvcClear;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AltSvcMa")
    private String altSvcMa;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AltSvcPersist")
    private String altSvcPersist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hsts")
    private String hsts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HstsIncludeSubdomains")
    private String hstsIncludeSubdomains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HstsMaxAge")
    private String hstsMaxAge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HstsPreload")
    private String hstsPreload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsForce")
    private String httpsForce;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsForceCode")
    private String httpsForceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsNoSniDeny")
    private String httpsNoSniDeny;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsSniVerify")
    private String httpsSniVerify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsSniWhitelist")
    private String httpsSniWhitelist;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private CreateHttpsApplicationConfigurationRequest(Builder builder) {
        super(builder);
        this.altSvc = builder.altSvc;
        this.altSvcClear = builder.altSvcClear;
        this.altSvcMa = builder.altSvcMa;
        this.altSvcPersist = builder.altSvcPersist;
        this.hsts = builder.hsts;
        this.hstsIncludeSubdomains = builder.hstsIncludeSubdomains;
        this.hstsMaxAge = builder.hstsMaxAge;
        this.hstsPreload = builder.hstsPreload;
        this.httpsForce = builder.httpsForce;
        this.httpsForceCode = builder.httpsForceCode;
        this.httpsNoSniDeny = builder.httpsNoSniDeny;
        this.httpsSniVerify = builder.httpsSniVerify;
        this.httpsSniWhitelist = builder.httpsSniWhitelist;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpsApplicationConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return altSvc
     */
    public String getAltSvc() {
        return this.altSvc;
    }

    /**
     * @return altSvcClear
     */
    public String getAltSvcClear() {
        return this.altSvcClear;
    }

    /**
     * @return altSvcMa
     */
    public String getAltSvcMa() {
        return this.altSvcMa;
    }

    /**
     * @return altSvcPersist
     */
    public String getAltSvcPersist() {
        return this.altSvcPersist;
    }

    /**
     * @return hsts
     */
    public String getHsts() {
        return this.hsts;
    }

    /**
     * @return hstsIncludeSubdomains
     */
    public String getHstsIncludeSubdomains() {
        return this.hstsIncludeSubdomains;
    }

    /**
     * @return hstsMaxAge
     */
    public String getHstsMaxAge() {
        return this.hstsMaxAge;
    }

    /**
     * @return hstsPreload
     */
    public String getHstsPreload() {
        return this.hstsPreload;
    }

    /**
     * @return httpsForce
     */
    public String getHttpsForce() {
        return this.httpsForce;
    }

    /**
     * @return httpsForceCode
     */
    public String getHttpsForceCode() {
        return this.httpsForceCode;
    }

    /**
     * @return httpsNoSniDeny
     */
    public String getHttpsNoSniDeny() {
        return this.httpsNoSniDeny;
    }

    /**
     * @return httpsSniVerify
     */
    public String getHttpsSniVerify() {
        return this.httpsSniVerify;
    }

    /**
     * @return httpsSniWhitelist
     */
    public String getHttpsSniWhitelist() {
        return this.httpsSniWhitelist;
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

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder extends Request.Builder<CreateHttpsApplicationConfigurationRequest, Builder> {
        private String altSvc; 
        private String altSvcClear; 
        private String altSvcMa; 
        private String altSvcPersist; 
        private String hsts; 
        private String hstsIncludeSubdomains; 
        private String hstsMaxAge; 
        private String hstsPreload; 
        private String httpsForce; 
        private String httpsForceCode; 
        private String httpsNoSniDeny; 
        private String httpsSniVerify; 
        private String httpsSniWhitelist; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateHttpsApplicationConfigurationRequest request) {
            super(request);
            this.altSvc = request.altSvc;
            this.altSvcClear = request.altSvcClear;
            this.altSvcMa = request.altSvcMa;
            this.altSvcPersist = request.altSvcPersist;
            this.hsts = request.hsts;
            this.hstsIncludeSubdomains = request.hstsIncludeSubdomains;
            this.hstsMaxAge = request.hstsMaxAge;
            this.hstsPreload = request.hstsPreload;
            this.httpsForce = request.httpsForce;
            this.httpsForceCode = request.httpsForceCode;
            this.httpsNoSniDeny = request.httpsNoSniDeny;
            this.httpsSniVerify = request.httpsSniVerify;
            this.httpsSniWhitelist = request.httpsSniWhitelist;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>Specifies whether to enable the Alt-Svc header. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder altSvc(String altSvc) {
            this.putQueryParameter("AltSvc", altSvc);
            this.altSvc = altSvc;
            return this;
        }

        /**
         * <p>Specifies whether to include the <code>clear</code> parameter in the Alt-Svc header. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The parameter is included.</p>
         * </li>
         * <li><p><code>off</code>: The parameter is not included.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder altSvcClear(String altSvcClear) {
            this.putQueryParameter("AltSvcClear", altSvcClear);
            this.altSvcClear = altSvcClear;
            return this;
        }

        /**
         * <p>The Max Age for the Alt-Svc header, in seconds. The default is 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder altSvcMa(String altSvcMa) {
            this.putQueryParameter("AltSvcMa", altSvcMa);
            this.altSvcMa = altSvcMa;
            return this;
        }

        /**
         * <p>Specifies whether to include the <code>persist</code> parameter in the Alt-Svc header. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The parameter is included.</p>
         * </li>
         * <li><p><code>off</code>: The parameter is not included.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder altSvcPersist(String altSvcPersist) {
            this.putQueryParameter("AltSvcPersist", altSvcPersist);
            this.altSvcPersist = altSvcPersist;
            return this;
        }

        /**
         * <p>Specifies whether to enable HTTP Strict Transport Security (HSTS). Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder hsts(String hsts) {
            this.putQueryParameter("Hsts", hsts);
            this.hsts = hsts;
            return this;
        }

        /**
         * <p>Specifies whether to include the <code>includeSubDomains</code> directive in the HSTS header. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The directive is included.</p>
         * </li>
         * <li><p><code>off</code>: The directive is not included.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder hstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.putQueryParameter("HstsIncludeSubdomains", hstsIncludeSubdomains);
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }

        /**
         * <p>The value of the <code>max-age</code> directive for the HSTS header, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder hstsMaxAge(String hstsMaxAge) {
            this.putQueryParameter("HstsMaxAge", hstsMaxAge);
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }

        /**
         * <p>Specifies whether to enable HSTS Preload by including the <code>preload</code> directive in the HSTS header. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The directive is included.</p>
         * </li>
         * <li><p><code>off</code>: The directive is not included.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder hstsPreload(String hstsPreload) {
            this.putQueryParameter("HstsPreload", hstsPreload);
            this.hstsPreload = hstsPreload;
            return this;
        }

        /**
         * <p>Specifies whether to enable Force HTTPS. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder httpsForce(String httpsForce) {
            this.putQueryParameter("HttpsForce", httpsForce);
            this.httpsForce = httpsForce;
            return this;
        }

        /**
         * <p>The Redirection Status Code to use when Force HTTPS is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>301</code></p>
         * </li>
         * <li><p><code>302</code></p>
         * </li>
         * <li><p><code>307</code></p>
         * </li>
         * <li><p><code>308</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        public Builder httpsForceCode(String httpsForceCode) {
            this.putQueryParameter("HttpsForceCode", httpsForceCode);
            this.httpsForceCode = httpsForceCode;
            return this;
        }

        /**
         * <p>Specifies whether to reject TLS Handshake Requests that do not include an SNI. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Rejects requests without an SNI.</p>
         * </li>
         * <li><p><code>off</code>: Allows requests without an SNI.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder httpsNoSniDeny(String httpsNoSniDeny) {
            this.putQueryParameter("HttpsNoSniDeny", httpsNoSniDeny);
            this.httpsNoSniDeny = httpsNoSniDeny;
            return this;
        }

        /**
         * <p>Specifies whether to enable Server Name Indication (SNI) verification. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder httpsSniVerify(String httpsSniVerify) {
            this.putQueryParameter("HttpsSniVerify", httpsSniVerify);
            this.httpsSniVerify = httpsSniVerify;
            return this;
        }

        /**
         * <p>Specifies the allowlist of SNI values. Separate multiple values with a space.</p>
         * 
         * <strong>example:</strong>
         * <p>abc edf</p>
         */
        public Builder httpsSniWhitelist(String httpsSniWhitelist) {
            this.putQueryParameter("HttpsSniWhitelist", httpsSniWhitelist);
            this.httpsSniWhitelist = httpsSniWhitelist;
            return this;
        }

        /**
         * <p>The content of the Rule, which is a Conditional Expression that matches user Requests. This parameter is optional when adding a Global Configuration. Supported use cases include:</p>
         * <ul>
         * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, use a custom expression. For example: <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
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
         * <p>Specifies whether to enable the rule. This parameter is optional when adding a Global Configuration. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The rule is enabled.</p>
         * </li>
         * <li><p><code>off</code>: The rule is disabled.</p>
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
         * <p>The name of the Rule. This parameter is optional when adding a Global Configuration.</p>
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
         * <p>The execution order of the rule. A lower value indicates a higher priority.</p>
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
         * <p>The ID of the Site. You can get this ID by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The Site\&quot;s configuration Version. For Sites with version management enabled, this parameter specifies the Version to which the configuration applies. The default is 0.</p>
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
        public CreateHttpsApplicationConfigurationRequest build() {
            return new CreateHttpsApplicationConfigurationRequest(this);
        } 

    } 

}
