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
            this.siteId = request.siteId;
        } 

        /**
         * AltSvc.
         */
        public Builder altSvc(String altSvc) {
            this.putQueryParameter("AltSvc", altSvc);
            this.altSvc = altSvc;
            return this;
        }

        /**
         * AltSvcClear.
         */
        public Builder altSvcClear(String altSvcClear) {
            this.putQueryParameter("AltSvcClear", altSvcClear);
            this.altSvcClear = altSvcClear;
            return this;
        }

        /**
         * AltSvcMa.
         */
        public Builder altSvcMa(String altSvcMa) {
            this.putQueryParameter("AltSvcMa", altSvcMa);
            this.altSvcMa = altSvcMa;
            return this;
        }

        /**
         * AltSvcPersist.
         */
        public Builder altSvcPersist(String altSvcPersist) {
            this.putQueryParameter("AltSvcPersist", altSvcPersist);
            this.altSvcPersist = altSvcPersist;
            return this;
        }

        /**
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
         * Hsts.
         */
        public Builder hsts(String hsts) {
            this.putQueryParameter("Hsts", hsts);
            this.hsts = hsts;
            return this;
        }

        /**
         * HstsIncludeSubdomains.
         */
        public Builder hstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.putQueryParameter("HstsIncludeSubdomains", hstsIncludeSubdomains);
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }

        /**
         * HstsMaxAge.
         */
        public Builder hstsMaxAge(String hstsMaxAge) {
            this.putQueryParameter("HstsMaxAge", hstsMaxAge);
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }

        /**
         * HstsPreload.
         */
        public Builder hstsPreload(String hstsPreload) {
            this.putQueryParameter("HstsPreload", hstsPreload);
            this.hstsPreload = hstsPreload;
            return this;
        }

        /**
         * HttpsForce.
         */
        public Builder httpsForce(String httpsForce) {
            this.putQueryParameter("HttpsForce", httpsForce);
            this.httpsForce = httpsForce;
            return this;
        }

        /**
         * HttpsForceCode.
         */
        public Builder httpsForceCode(String httpsForceCode) {
            this.putQueryParameter("HttpsForceCode", httpsForceCode);
            this.httpsForceCode = httpsForceCode;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * RuleEnable.
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
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
