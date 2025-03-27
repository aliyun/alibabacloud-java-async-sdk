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
 * {@link UpdateHttpsApplicationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateHttpsApplicationConfigurationRequest</p>
 */
public class UpdateHttpsApplicationConfigurationRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

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

    private UpdateHttpsApplicationConfigurationRequest(Builder builder) {
        super(builder);
        this.altSvc = builder.altSvc;
        this.altSvcClear = builder.altSvcClear;
        this.altSvcMa = builder.altSvcMa;
        this.altSvcPersist = builder.altSvcPersist;
        this.configId = builder.configId;
        this.hsts = builder.hsts;
        this.hstsIncludeSubdomains = builder.hstsIncludeSubdomains;
        this.hstsMaxAge = builder.hstsMaxAge;
        this.hstsPreload = builder.hstsPreload;
        this.httpsForce = builder.httpsForce;
        this.httpsForceCode = builder.httpsForceCode;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHttpsApplicationConfigurationRequest create() {
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
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
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

    public static final class Builder extends Request.Builder<UpdateHttpsApplicationConfigurationRequest, Builder> {
        private String altSvc; 
        private String altSvcClear; 
        private String altSvcMa; 
        private String altSvcPersist; 
        private Long configId; 
        private String hsts; 
        private String hstsIncludeSubdomains; 
        private String hstsMaxAge; 
        private String hstsPreload; 
        private String httpsForce; 
        private String httpsForceCode; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHttpsApplicationConfigurationRequest request) {
            super(request);
            this.altSvc = request.altSvc;
            this.altSvcClear = request.altSvcClear;
            this.altSvcMa = request.altSvcMa;
            this.altSvcPersist = request.altSvcPersist;
            this.configId = request.configId;
            this.hsts = request.hsts;
            this.hstsIncludeSubdomains = request.hstsIncludeSubdomains;
            this.hstsMaxAge = request.hstsMaxAge;
            this.hstsPreload = request.hstsPreload;
            this.httpsForce = request.httpsForce;
            this.httpsForceCode = request.httpsForceCode;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
        } 

        /**
         * <p>Feature switch, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>Whether the Alt-Svc header includes the clear parameter, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>Alt-Svc validity period, in seconds, default is 86400 seconds.</p>
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
         * <p>Whether the Alt-Svc header includes the persist parameter, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>Whether to enable HSTS, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>Whether to include subdomains in HSTS, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>HSTS expiration time, in seconds.</p>
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
         * <p>Whether to enable HSTS preload, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>Whether to enable forced HTTPS, default is disabled. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>Forced HTTPS redirect status code, value range:</p>
         * <ul>
         * <li>301</li>
         * <li>302</li>
         * <li>307</li>
         * <li>308</li>
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
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
         * <p>Rule switch. This parameter is not required when adding a global configuration. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateHttpsApplicationConfigurationRequest build() {
            return new UpdateHttpsApplicationConfigurationRequest(this);
        } 

    } 

}
