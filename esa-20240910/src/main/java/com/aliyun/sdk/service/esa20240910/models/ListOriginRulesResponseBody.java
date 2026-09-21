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

        private Builder(ListOriginRulesResponseBody model) {
            this.configs = model.configs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The configurations in the response.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The current page number, same as the PageNumber request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
         * <p>The total number of pages.</p>
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

        @com.aliyun.core.annotation.NameInMap("Follow302Enable")
        private String follow302Enable;

        @com.aliyun.core.annotation.NameInMap("Follow302MaxTries")
        private String follow302MaxTries;

        @com.aliyun.core.annotation.NameInMap("Follow302RetainArgs")
        private String follow302RetainArgs;

        @com.aliyun.core.annotation.NameInMap("Follow302RetainHeader")
        private String follow302RetainHeader;

        @com.aliyun.core.annotation.NameInMap("Follow302TargetHost")
        private String follow302TargetHost;

        @com.aliyun.core.annotation.NameInMap("OriginHost")
        private String originHost;

        @com.aliyun.core.annotation.NameInMap("OriginHttpPort")
        private String originHttpPort;

        @com.aliyun.core.annotation.NameInMap("OriginHttpsPort")
        private String originHttpsPort;

        @com.aliyun.core.annotation.NameInMap("OriginMtls")
        private String originMtls;

        @com.aliyun.core.annotation.NameInMap("OriginReadTimeout")
        private String originReadTimeout;

        @com.aliyun.core.annotation.NameInMap("OriginScheme")
        private String originScheme;

        @com.aliyun.core.annotation.NameInMap("OriginSni")
        private String originSni;

        @com.aliyun.core.annotation.NameInMap("OriginVerify")
        private String originVerify;

        @com.aliyun.core.annotation.NameInMap("Range")
        private String range;

        @com.aliyun.core.annotation.NameInMap("RangeChunkSize")
        private String rangeChunkSize;

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
         * @return siteVersion
         */
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public static final class Builder {
            private Long configId; 
            private String configType; 
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
            private Integer siteVersion; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.configId = model.configId;
                this.configType = model.configType;
                this.dnsRecord = model.dnsRecord;
                this.follow302Enable = model.follow302Enable;
                this.follow302MaxTries = model.follow302MaxTries;
                this.follow302RetainArgs = model.follow302RetainArgs;
                this.follow302RetainHeader = model.follow302RetainHeader;
                this.follow302TargetHost = model.follow302TargetHost;
                this.originHost = model.originHost;
                this.originHttpPort = model.originHttpPort;
                this.originHttpsPort = model.originHttpsPort;
                this.originMtls = model.originMtls;
                this.originReadTimeout = model.originReadTimeout;
                this.originScheme = model.originScheme;
                this.originSni = model.originSni;
                this.originVerify = model.originVerify;
                this.range = model.range;
                this.rangeChunkSize = model.rangeChunkSize;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.siteVersion = model.siteVersion;
            } 

            /**
             * <p>The configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>395386449776640</p>
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The configuration type. You can query global or rule configurations based on this parameter. Valid values:</p>
             * <ul>
             * <li>global: Query global configurations.</li>
             * <li>rule: Query rule configurations.</li>
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
             * <p>The rewritten DNS resolution record for back-to-origin requests.</p>
             * 
             * <strong>example:</strong>
             * <p>test.example.com</p>
             */
            public Builder dnsRecord(String dnsRecord) {
                this.dnsRecord = dnsRecord;
                return this;
            }

            /**
             * <p>The back-to-origin 302 redirect follow switch. Valid values:</p>
             * <ul>
             * <li>on: Enable.</li>
             * <li>off: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder follow302Enable(String follow302Enable) {
                this.follow302Enable = follow302Enable;
                return this;
            }

            /**
             * <p>The maximum number of 302 redirect follows. Valid values: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder follow302MaxTries(String follow302MaxTries) {
                this.follow302MaxTries = follow302MaxTries;
                return this;
            }

            /**
             * <p>The switch for retaining original request parameters. Valid values:</p>
             * <ul>
             * <li>on: Enable.</li>
             * <li>off: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder follow302RetainArgs(String follow302RetainArgs) {
                this.follow302RetainArgs = follow302RetainArgs;
                return this;
            }

            /**
             * <p>The switch for retaining original request headers. Valid values:</p>
             * <ul>
             * <li>on: Enable.</li>
             * <li>off: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder follow302RetainHeader(String follow302RetainHeader) {
                this.follow302RetainHeader = follow302RetainHeader;
                return this;
            }

            /**
             * <p>The back-to-origin host after 302 redirect modification.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder follow302TargetHost(String follow302TargetHost) {
                this.follow302TargetHost = follow302TargetHost;
                return this;
            }

            /**
             * <p>The HOST carried in the back-to-origin request.</p>
             * 
             * <strong>example:</strong>
             * <p>origin.example.com</p>
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * <p>The origin server port accessed when using the HTTP protocol for back-to-origin.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder originHttpPort(String originHttpPort) {
                this.originHttpPort = originHttpPort;
                return this;
            }

            /**
             * <p>The origin server port accessed when using the HTTPS protocol for back-to-origin.</p>
             * 
             * <strong>example:</strong>
             * <p>4433</p>
             */
            public Builder originHttpsPort(String originHttpsPort) {
                this.originHttpsPort = originHttpsPort;
                return this;
            }

            /**
             * <p>The mTLS switch. Valid values:</p>
             * <ul>
             * <li>on: Enable.</li>
             * <li>off: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder originMtls(String originMtls) {
                this.originMtls = originMtls;
                return this;
            }

            /**
             * <p>The origin server read timeout period, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder originReadTimeout(String originReadTimeout) {
                this.originReadTimeout = originReadTimeout;
                return this;
            }

            /**
             * <p>The protocol used for back-to-origin requests. Valid values:</p>
             * <ul>
             * <li>http: Use the HTTP protocol for back-to-origin.</li>
             * <li>https: Use the HTTPS protocol for back-to-origin.</li>
             * <li>follow: Follow the client protocol for back-to-origin.</li>
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
             * <p>The SNI carried in the back-to-origin request.</p>
             * 
             * <strong>example:</strong>
             * <p>origin.example.com</p>
             */
            public Builder originSni(String originSni) {
                this.originSni = originSni;
                return this;
            }

            /**
             * <p>The origin server certificate verification switch. Valid values:</p>
             * <ul>
             * <li>on: Enable.</li>
             * <li>off: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder originVerify(String originVerify) {
                this.originVerify = originVerify;
                return this;
            }

            /**
             * <p>Use range-based slicing for back-to-origin file downloads. Valid values:</p>
             * <ul>
             * <li>on: Enable.</li>
             * <li>off: Disable.</li>
             * <li>force: Force enable.</li>
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
             * <p>The range chunk size.</p>
             * 
             * <strong>example:</strong>
             * <p>1MB</p>
             */
            public Builder rangeChunkSize(String rangeChunkSize) {
                this.rangeChunkSize = rangeChunkSize;
                return this;
            }

            /**
             * <p>The rule content, which uses conditional expressions to match user requests. You do not need to set this parameter when adding a global configuration. There are two usage scenarios:</p>
             * <ul>
             * <li>Match all incoming requests: Set the value to true.</li>
             * <li>Match specified requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>The rule switch. You do not need to set this parameter when adding a global configuration. Valid values:</p>
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
             * <p>The rule name. You do not need to set this parameter when adding a global configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The execution order of the rule. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
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
