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
 * {@link GetHttpsApplicationConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetHttpsApplicationConfigurationResponseBody</p>
 */
public class GetHttpsApplicationConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AltSvc")
    private String altSvc;

    @com.aliyun.core.annotation.NameInMap("AltSvcClear")
    private String altSvcClear;

    @com.aliyun.core.annotation.NameInMap("AltSvcMa")
    private String altSvcMa;

    @com.aliyun.core.annotation.NameInMap("AltSvcPersist")
    private String altSvcPersist;

    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("Hsts")
    private String hsts;

    @com.aliyun.core.annotation.NameInMap("HstsIncludeSubdomains")
    private String hstsIncludeSubdomains;

    @com.aliyun.core.annotation.NameInMap("HstsMaxAge")
    private String hstsMaxAge;

    @com.aliyun.core.annotation.NameInMap("HstsPreload")
    private String hstsPreload;

    @com.aliyun.core.annotation.NameInMap("HttpsForce")
    private String httpsForce;

    @com.aliyun.core.annotation.NameInMap("HttpsForceCode")
    private String httpsForceCode;

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

    private GetHttpsApplicationConfigurationResponseBody(Builder builder) {
        this.altSvc = builder.altSvc;
        this.altSvcClear = builder.altSvcClear;
        this.altSvcMa = builder.altSvcMa;
        this.altSvcPersist = builder.altSvcPersist;
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.hsts = builder.hsts;
        this.hstsIncludeSubdomains = builder.hstsIncludeSubdomains;
        this.hstsMaxAge = builder.hstsMaxAge;
        this.hstsPreload = builder.hstsPreload;
        this.httpsForce = builder.httpsForce;
        this.httpsForceCode = builder.httpsForceCode;
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

    public static GetHttpsApplicationConfigurationResponseBody create() {
        return builder().build();
    }

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
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
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
        private String altSvc; 
        private String altSvcClear; 
        private String altSvcMa; 
        private String altSvcPersist; 
        private Long configId; 
        private String configType; 
        private String hsts; 
        private String hstsIncludeSubdomains; 
        private String hstsMaxAge; 
        private String hstsPreload; 
        private String httpsForce; 
        private String httpsForceCode; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Integer siteVersion; 

        private Builder() {
        } 

        private Builder(GetHttpsApplicationConfigurationResponseBody model) {
            this.altSvc = model.altSvc;
            this.altSvcClear = model.altSvcClear;
            this.altSvcMa = model.altSvcMa;
            this.altSvcPersist = model.altSvcPersist;
            this.configId = model.configId;
            this.configType = model.configType;
            this.hsts = model.hsts;
            this.hstsIncludeSubdomains = model.hstsIncludeSubdomains;
            this.hstsMaxAge = model.hstsMaxAge;
            this.hstsPreload = model.hstsPreload;
            this.httpsForce = model.httpsForce;
            this.httpsForceCode = model.httpsForceCode;
            this.requestId = model.requestId;
            this.rule = model.rule;
            this.ruleEnable = model.ruleEnable;
            this.ruleName = model.ruleName;
            this.sequence = model.sequence;
            this.siteVersion = model.siteVersion;
        } 

        /**
         * <p>Alt-Svc feature switch. Default is disabled. Possible values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder altSvc(String altSvc) {
            this.altSvc = altSvc;
            return this;
        }

        /**
         * <p>Whether the Alt-Svc header includes the clear parameter. Default is disabled. Possible values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder altSvcClear(String altSvcClear) {
            this.altSvcClear = altSvcClear;
            return this;
        }

        /**
         * <p>Alt-Svc validity period in seconds. The default is 86400 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder altSvcMa(String altSvcMa) {
            this.altSvcMa = altSvcMa;
            return this;
        }

        /**
         * <p>Whether the Alt-Svc header includes the persist parameter. Default is disabled. Possible values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder altSvcPersist(String altSvcPersist) {
            this.altSvcPersist = altSvcPersist;
            return this;
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
         * <p>Configuration type, which can be used to query global or rule configurations. Possible values:</p>
         * <ul>
         * <li>global: Query global configuration.</li>
         * <li>rule: Query rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>Whether to enable HSTS. Default is disabled. Possible values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder hsts(String hsts) {
            this.hsts = hsts;
            return this;
        }

        /**
         * <p>Whether to include subdomains in HSTS, default is off. Value range:</p>
         * <ul>
         * <li>on: enabled. </li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder hstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }

        /**
         * <p>HSTS expiration time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder hstsMaxAge(String hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }

        /**
         * <p>Whether to enable HSTS preload, default is off. Value range:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder hstsPreload(String hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }

        /**
         * <p>Whether to enable forced HTTPS. Default is disabled. Possible values:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder httpsForce(String httpsForce) {
            this.httpsForce = httpsForce;
            return this;
        }

        /**
         * <p>Status code for forced HTTPS redirection. Possible values:</p>
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
            this.httpsForceCode = httpsForceCode;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3790430-3A06-535F-A424-0998BD9A6C9F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true.</li>
         * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
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
         * <p>Rule switch. This parameter does not need to be set when adding a global configuration. Possible values:</p>
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
         * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the version of the site for which the configuration takes effect. The default is version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        public GetHttpsApplicationConfigurationResponseBody build() {
            return new GetHttpsApplicationConfigurationResponseBody(this);
        } 

    } 

}
