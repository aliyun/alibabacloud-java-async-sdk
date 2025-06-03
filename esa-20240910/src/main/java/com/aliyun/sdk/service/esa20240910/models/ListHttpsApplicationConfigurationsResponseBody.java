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
 * {@link ListHttpsApplicationConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHttpsApplicationConfigurationsResponseBody</p>
 */
public class ListHttpsApplicationConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListHttpsApplicationConfigurationsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHttpsApplicationConfigurationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListHttpsApplicationConfigurationsResponseBody model) {
            this.configs = model.configs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Response body configurations.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListHttpsApplicationConfigurationsResponseBody build() {
            return new ListHttpsApplicationConfigurationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHttpsApplicationConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHttpsApplicationConfigurationsResponseBody</p>
     */
    public static class Configs extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("HttpsNoSniDeny")
        private String httpsNoSniDeny;

        @com.aliyun.core.annotation.NameInMap("HttpsSniVerify")
        private String httpsSniVerify;

        @com.aliyun.core.annotation.NameInMap("HttpsSniWhitelist")
        private String httpsSniWhitelist;

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

        private Configs(Builder builder) {
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
            this.httpsNoSniDeny = builder.httpsNoSniDeny;
            this.httpsSniVerify = builder.httpsSniVerify;
            this.httpsSniWhitelist = builder.httpsSniWhitelist;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.siteVersion = builder.siteVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
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
            private String httpsNoSniDeny; 
            private String httpsSniVerify; 
            private String httpsSniWhitelist; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private Integer sequence; 
            private Integer siteVersion; 

            private Builder() {
            } 

            private Builder(Configs model) {
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
                this.httpsNoSniDeny = model.httpsNoSniDeny;
                this.httpsSniVerify = model.httpsSniVerify;
                this.httpsSniWhitelist = model.httpsSniWhitelist;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.siteVersion = model.siteVersion;
            } 

            /**
             * <p>Alt-Svc feature switch, default is off. Value range: </p>
             * <ul>
             * <li>on: enabled. </li>
             * <li>off: disabled.</li>
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
             * <p>Whether the Alt-Svc header includes the clear parameter, default is off. Values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
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
             * <p>The validity period of Alt-Svc in seconds, default is 86400 seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder altSvcMa(String altSvcMa) {
                this.altSvcMa = altSvcMa;
                return this;
            }

            /**
             * <p>Whether the Alt-Svc header includes the persist parameter, default is off. Values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
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
             * <p>395386449776640</p>
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>Configuration type, which can be used to query global or rule-based configurations. Possible values:</p>
             * <ul>
             * <li>global: Query global configuration.</li>
             * <li>rule: Query rule-based configuration.</li>
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
             * <p>Whether HSTS is enabled, default is off. Value range:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
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
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
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
             * <p>The expiration time of HSTS in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder hstsMaxAge(String hstsMaxAge) {
                this.hstsMaxAge = hstsMaxAge;
                return this;
            }

            /**
             * <p>Whether HSTS preloading is enabled, default is off. Value range:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
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
             * <p>Whether to enable forced HTTPS, default is disabled. Possible values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
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
             * <p>Forced HTTPS redirect status code. Possible values:</p>
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
             * HttpsNoSniDeny.
             */
            public Builder httpsNoSniDeny(String httpsNoSniDeny) {
                this.httpsNoSniDeny = httpsNoSniDeny;
                return this;
            }

            /**
             * HttpsSniVerify.
             */
            public Builder httpsSniVerify(String httpsSniVerify) {
                this.httpsSniVerify = httpsSniVerify;
                return this;
            }

            /**
             * HttpsSniWhitelist.
             */
            public Builder httpsSniWhitelist(String httpsSniWhitelist) {
                this.httpsSniWhitelist = httpsSniWhitelist;
                return this;
            }

            /**
             * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
             * <ul>
             * <li>Match all incoming requests: Set the value to true.</li>
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
             * <p>Rule switch. This parameter is not required when adding a global configuration. Possible values:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
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
             * <p>Rule name. This parameter is not required when adding a global configuration.</p>
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
             * <p>Site configuration version number. For sites with version management enabled, this parameter can specify the site version for which the configuration is effective, default is version 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
