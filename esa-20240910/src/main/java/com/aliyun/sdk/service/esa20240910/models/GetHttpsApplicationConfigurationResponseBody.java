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

        /**
         * AltSvc.
         */
        public Builder altSvc(String altSvc) {
            this.altSvc = altSvc;
            return this;
        }

        /**
         * AltSvcClear.
         */
        public Builder altSvcClear(String altSvcClear) {
            this.altSvcClear = altSvcClear;
            return this;
        }

        /**
         * AltSvcMa.
         */
        public Builder altSvcMa(String altSvcMa) {
            this.altSvcMa = altSvcMa;
            return this;
        }

        /**
         * AltSvcPersist.
         */
        public Builder altSvcPersist(String altSvcPersist) {
            this.altSvcPersist = altSvcPersist;
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
         * Hsts.
         */
        public Builder hsts(String hsts) {
            this.hsts = hsts;
            return this;
        }

        /**
         * HstsIncludeSubdomains.
         */
        public Builder hstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }

        /**
         * HstsMaxAge.
         */
        public Builder hstsMaxAge(String hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }

        /**
         * HstsPreload.
         */
        public Builder hstsPreload(String hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }

        /**
         * HttpsForce.
         */
        public Builder httpsForce(String httpsForce) {
            this.httpsForce = httpsForce;
            return this;
        }

        /**
         * HttpsForceCode.
         */
        public Builder httpsForceCode(String httpsForceCode) {
            this.httpsForceCode = httpsForceCode;
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

        public GetHttpsApplicationConfigurationResponseBody build() {
            return new GetHttpsApplicationConfigurationResponseBody(this);
        } 

    } 

}
