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
 * {@link ListOriginRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOriginRulesResponseBody</p>
 */
public class ListOriginRulesResponseBody extends TeaModel {
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

    private ListOriginRulesResponseBody(Builder builder) {
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

    public static ListOriginRulesResponseBody create() {
        return builder().build();
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

        /**
         * <p>Response body configuration.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The size of each page.</p>
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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

        public ListOriginRulesResponseBody build() {
            return new ListOriginRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOriginRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOriginRulesResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("DnsRecord")
        private String dnsRecord;

        @com.aliyun.core.annotation.NameInMap("OriginHost")
        private String originHost;

        @com.aliyun.core.annotation.NameInMap("OriginHttpPort")
        private String originHttpPort;

        @com.aliyun.core.annotation.NameInMap("OriginHttpsPort")
        private String originHttpsPort;

        @com.aliyun.core.annotation.NameInMap("OriginMtls")
        private String originMtls;

        @com.aliyun.core.annotation.NameInMap("OriginScheme")
        private String originScheme;

        @com.aliyun.core.annotation.NameInMap("OriginSni")
        private String originSni;

        @com.aliyun.core.annotation.NameInMap("OriginVerify")
        private String originVerify;

        @com.aliyun.core.annotation.NameInMap("Range")
        private String range;

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
            this.configId = builder.configId;
            this.configType = builder.configType;
            this.dnsRecord = builder.dnsRecord;
            this.originHost = builder.originHost;
            this.originHttpPort = builder.originHttpPort;
            this.originHttpsPort = builder.originHttpsPort;
            this.originMtls = builder.originMtls;
            this.originScheme = builder.originScheme;
            this.originSni = builder.originSni;
            this.originVerify = builder.originVerify;
            this.range = builder.range;
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
            private String originHost; 
            private String originHttpPort; 
            private String originHttpsPort; 
            private String originMtls; 
            private String originScheme; 
            private String originSni; 
            private String originVerify; 
            private String range; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private Integer sequence; 
            private Integer siteVersion; 

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
             * <p>Configuration type, which can be used to query global or rule configurations. Value range:</p>
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
             * <p>The origin server port accessed when using the HTTP protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder originHttpPort(String originHttpPort) {
                this.originHttpPort = originHttpPort;
                return this;
            }

            /**
             * <p>The origin server port to access when using the HTTPS protocol for back-to-origin requests.</p>
             * 
             * <strong>example:</strong>
             * <p>4433</p>
             */
            public Builder originHttpsPort(String originHttpsPort) {
                this.originHttpsPort = originHttpsPort;
                return this;
            }

            /**
             * OriginMtls.
             */
            public Builder originMtls(String originMtls) {
                this.originMtls = originMtls;
                return this;
            }

            /**
             * <p>Protocol used for the origin request. Value range:</p>
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
             * OriginVerify.
             */
            public Builder originVerify(String originVerify) {
                this.originVerify = originVerify;
                return this;
            }

            /**
             * <p>Use range slicing to download files from the origin. The value range is:</p>
             * <ul>
             * <li>on: enabled</li>
             * <li>off: disabled</li>
             * <li>force: forced</li>
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
             * <p>Rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>(http.host eq &quot;video.example.com&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Rule switch. Value range:</p>
             * <ul>
             * <li>on: Enabled</li>
             * <li>off: Disabled</li>
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
             * <p>Rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Rule execution sequence.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Site version number.</p>
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
