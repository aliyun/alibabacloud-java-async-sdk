// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSiteFunctionResponseBody</p>
 */
public class CreateSiteFunctionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private Configs configs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSiteFunctionResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteFunctionResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public Configs getConfigs() {
        return this.configs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Configs configs; 
        private String requestId; 

        /**
         * Configs.
         */
        public Builder configs(Configs configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSiteFunctionResponseBody build() {
            return new CreateSiteFunctionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class CacheReserve extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private CacheReserve(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CacheReserve create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Long configId; 
            private String enable; 
            private String instanceId; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public CacheReserve build() {
                return new CacheReserve(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class CacheRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalCacheablePorts")
        private String additionalCacheablePorts;

        @com.aliyun.core.annotation.NameInMap("BrowserCacheMode")
        private String browserCacheMode;

        @com.aliyun.core.annotation.NameInMap("BrowserCacheTtl")
        private String browserCacheTtl;

        @com.aliyun.core.annotation.NameInMap("BypassCache")
        private String bypassCache;

        @com.aliyun.core.annotation.NameInMap("CacheDeceptionArmor")
        private String cacheDeceptionArmor;

        @com.aliyun.core.annotation.NameInMap("CacheReserveEligibility")
        private String cacheReserveEligibility;

        @com.aliyun.core.annotation.NameInMap("CheckPresenceCookie")
        private String checkPresenceCookie;

        @com.aliyun.core.annotation.NameInMap("CheckPresenceHeader")
        private String checkPresenceHeader;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("EdgeCacheMode")
        private String edgeCacheMode;

        @com.aliyun.core.annotation.NameInMap("EdgeCacheTtl")
        private String edgeCacheTtl;

        @com.aliyun.core.annotation.NameInMap("EdgeStatusCodeCacheTtl")
        private String edgeStatusCodeCacheTtl;

        @com.aliyun.core.annotation.NameInMap("IncludeCookie")
        private String includeCookie;

        @com.aliyun.core.annotation.NameInMap("IncludeHeader")
        private String includeHeader;

        @com.aliyun.core.annotation.NameInMap("QueryString")
        private String queryString;

        @com.aliyun.core.annotation.NameInMap("QueryStringMode")
        private String queryStringMode;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("ServeStale")
        private String serveStale;

        @com.aliyun.core.annotation.NameInMap("SortQueryStringForCache")
        private String sortQueryStringForCache;

        @com.aliyun.core.annotation.NameInMap("UserDeviceType")
        private String userDeviceType;

        @com.aliyun.core.annotation.NameInMap("UserGeo")
        private String userGeo;

        @com.aliyun.core.annotation.NameInMap("UserLanguage")
        private String userLanguage;

        private CacheRules(Builder builder) {
            this.additionalCacheablePorts = builder.additionalCacheablePorts;
            this.browserCacheMode = builder.browserCacheMode;
            this.browserCacheTtl = builder.browserCacheTtl;
            this.bypassCache = builder.bypassCache;
            this.cacheDeceptionArmor = builder.cacheDeceptionArmor;
            this.cacheReserveEligibility = builder.cacheReserveEligibility;
            this.checkPresenceCookie = builder.checkPresenceCookie;
            this.checkPresenceHeader = builder.checkPresenceHeader;
            this.configId = builder.configId;
            this.edgeCacheMode = builder.edgeCacheMode;
            this.edgeCacheTtl = builder.edgeCacheTtl;
            this.edgeStatusCodeCacheTtl = builder.edgeStatusCodeCacheTtl;
            this.includeCookie = builder.includeCookie;
            this.includeHeader = builder.includeHeader;
            this.queryString = builder.queryString;
            this.queryStringMode = builder.queryStringMode;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.serveStale = builder.serveStale;
            this.sortQueryStringForCache = builder.sortQueryStringForCache;
            this.userDeviceType = builder.userDeviceType;
            this.userGeo = builder.userGeo;
            this.userLanguage = builder.userLanguage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CacheRules create() {
            return builder().build();
        }

        /**
         * @return additionalCacheablePorts
         */
        public String getAdditionalCacheablePorts() {
            return this.additionalCacheablePorts;
        }

        /**
         * @return browserCacheMode
         */
        public String getBrowserCacheMode() {
            return this.browserCacheMode;
        }

        /**
         * @return browserCacheTtl
         */
        public String getBrowserCacheTtl() {
            return this.browserCacheTtl;
        }

        /**
         * @return bypassCache
         */
        public String getBypassCache() {
            return this.bypassCache;
        }

        /**
         * @return cacheDeceptionArmor
         */
        public String getCacheDeceptionArmor() {
            return this.cacheDeceptionArmor;
        }

        /**
         * @return cacheReserveEligibility
         */
        public String getCacheReserveEligibility() {
            return this.cacheReserveEligibility;
        }

        /**
         * @return checkPresenceCookie
         */
        public String getCheckPresenceCookie() {
            return this.checkPresenceCookie;
        }

        /**
         * @return checkPresenceHeader
         */
        public String getCheckPresenceHeader() {
            return this.checkPresenceHeader;
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return edgeCacheMode
         */
        public String getEdgeCacheMode() {
            return this.edgeCacheMode;
        }

        /**
         * @return edgeCacheTtl
         */
        public String getEdgeCacheTtl() {
            return this.edgeCacheTtl;
        }

        /**
         * @return edgeStatusCodeCacheTtl
         */
        public String getEdgeStatusCodeCacheTtl() {
            return this.edgeStatusCodeCacheTtl;
        }

        /**
         * @return includeCookie
         */
        public String getIncludeCookie() {
            return this.includeCookie;
        }

        /**
         * @return includeHeader
         */
        public String getIncludeHeader() {
            return this.includeHeader;
        }

        /**
         * @return queryString
         */
        public String getQueryString() {
            return this.queryString;
        }

        /**
         * @return queryStringMode
         */
        public String getQueryStringMode() {
            return this.queryStringMode;
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
        public String getSequence() {
            return this.sequence;
        }

        /**
         * @return serveStale
         */
        public String getServeStale() {
            return this.serveStale;
        }

        /**
         * @return sortQueryStringForCache
         */
        public String getSortQueryStringForCache() {
            return this.sortQueryStringForCache;
        }

        /**
         * @return userDeviceType
         */
        public String getUserDeviceType() {
            return this.userDeviceType;
        }

        /**
         * @return userGeo
         */
        public String getUserGeo() {
            return this.userGeo;
        }

        /**
         * @return userLanguage
         */
        public String getUserLanguage() {
            return this.userLanguage;
        }

        public static final class Builder {
            private String additionalCacheablePorts; 
            private String browserCacheMode; 
            private String browserCacheTtl; 
            private String bypassCache; 
            private String cacheDeceptionArmor; 
            private String cacheReserveEligibility; 
            private String checkPresenceCookie; 
            private String checkPresenceHeader; 
            private Long configId; 
            private String edgeCacheMode; 
            private String edgeCacheTtl; 
            private String edgeStatusCodeCacheTtl; 
            private String includeCookie; 
            private String includeHeader; 
            private String queryString; 
            private String queryStringMode; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 
            private String serveStale; 
            private String sortQueryStringForCache; 
            private String userDeviceType; 
            private String userGeo; 
            private String userLanguage; 

            /**
             * AdditionalCacheablePorts.
             */
            public Builder additionalCacheablePorts(String additionalCacheablePorts) {
                this.additionalCacheablePorts = additionalCacheablePorts;
                return this;
            }

            /**
             * BrowserCacheMode.
             */
            public Builder browserCacheMode(String browserCacheMode) {
                this.browserCacheMode = browserCacheMode;
                return this;
            }

            /**
             * BrowserCacheTtl.
             */
            public Builder browserCacheTtl(String browserCacheTtl) {
                this.browserCacheTtl = browserCacheTtl;
                return this;
            }

            /**
             * BypassCache.
             */
            public Builder bypassCache(String bypassCache) {
                this.bypassCache = bypassCache;
                return this;
            }

            /**
             * CacheDeceptionArmor.
             */
            public Builder cacheDeceptionArmor(String cacheDeceptionArmor) {
                this.cacheDeceptionArmor = cacheDeceptionArmor;
                return this;
            }

            /**
             * CacheReserveEligibility.
             */
            public Builder cacheReserveEligibility(String cacheReserveEligibility) {
                this.cacheReserveEligibility = cacheReserveEligibility;
                return this;
            }

            /**
             * CheckPresenceCookie.
             */
            public Builder checkPresenceCookie(String checkPresenceCookie) {
                this.checkPresenceCookie = checkPresenceCookie;
                return this;
            }

            /**
             * CheckPresenceHeader.
             */
            public Builder checkPresenceHeader(String checkPresenceHeader) {
                this.checkPresenceHeader = checkPresenceHeader;
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
             * EdgeCacheMode.
             */
            public Builder edgeCacheMode(String edgeCacheMode) {
                this.edgeCacheMode = edgeCacheMode;
                return this;
            }

            /**
             * EdgeCacheTtl.
             */
            public Builder edgeCacheTtl(String edgeCacheTtl) {
                this.edgeCacheTtl = edgeCacheTtl;
                return this;
            }

            /**
             * EdgeStatusCodeCacheTtl.
             */
            public Builder edgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
                this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
                return this;
            }

            /**
             * IncludeCookie.
             */
            public Builder includeCookie(String includeCookie) {
                this.includeCookie = includeCookie;
                return this;
            }

            /**
             * IncludeHeader.
             */
            public Builder includeHeader(String includeHeader) {
                this.includeHeader = includeHeader;
                return this;
            }

            /**
             * QueryString.
             */
            public Builder queryString(String queryString) {
                this.queryString = queryString;
                return this;
            }

            /**
             * QueryStringMode.
             */
            public Builder queryStringMode(String queryStringMode) {
                this.queryStringMode = queryStringMode;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * ServeStale.
             */
            public Builder serveStale(String serveStale) {
                this.serveStale = serveStale;
                return this;
            }

            /**
             * SortQueryStringForCache.
             */
            public Builder sortQueryStringForCache(String sortQueryStringForCache) {
                this.sortQueryStringForCache = sortQueryStringForCache;
                return this;
            }

            /**
             * UserDeviceType.
             */
            public Builder userDeviceType(String userDeviceType) {
                this.userDeviceType = userDeviceType;
                return this;
            }

            /**
             * UserGeo.
             */
            public Builder userGeo(String userGeo) {
                this.userGeo = userGeo;
                return this;
            }

            /**
             * UserLanguage.
             */
            public Builder userLanguage(String userLanguage) {
                this.userLanguage = userLanguage;
                return this;
            }

            public CacheRules build() {
                return new CacheRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class CacheTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaseInsensitive")
        private String caseInsensitive;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private CacheTags(Builder builder) {
            this.caseInsensitive = builder.caseInsensitive;
            this.configId = builder.configId;
            this.sequence = builder.sequence;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CacheTags create() {
            return builder().build();
        }

        /**
         * @return caseInsensitive
         */
        public String getCaseInsensitive() {
            return this.caseInsensitive;
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String caseInsensitive; 
            private Long configId; 
            private String sequence; 
            private String tagName; 

            /**
             * CaseInsensitive.
             */
            public Builder caseInsensitive(String caseInsensitive) {
                this.caseInsensitive = caseInsensitive;
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
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public CacheTags build() {
                return new CacheTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class CnameFlattening extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("FlattenMode")
        private String flattenMode;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private CnameFlattening(Builder builder) {
            this.configId = builder.configId;
            this.flattenMode = builder.flattenMode;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CnameFlattening create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return flattenMode
         */
        public String getFlattenMode() {
            return this.flattenMode;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private String flattenMode; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * FlattenMode.
             */
            public Builder flattenMode(String flattenMode) {
                this.flattenMode = flattenMode;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public CnameFlattening build() {
                return new CnameFlattening(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class CompressionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Brotli")
        private String brotli;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Gzip")
        private String gzip;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private CompressionRules(Builder builder) {
            this.brotli = builder.brotli;
            this.configId = builder.configId;
            this.gzip = builder.gzip;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompressionRules create() {
            return builder().build();
        }

        /**
         * @return brotli
         */
        public String getBrotli() {
            return this.brotli;
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return gzip
         */
        public String getGzip() {
            return this.gzip;
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
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private String brotli; 
            private Long configId; 
            private String gzip; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            /**
             * Brotli.
             */
            public Builder brotli(String brotli) {
                this.brotli = brotli;
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
             * Gzip.
             */
            public Builder gzip(String gzip) {
                this.gzip = gzip;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public CompressionRules build() {
                return new CompressionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class CrossBorderOptimization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private CrossBorderOptimization(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossBorderOptimization create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Long configId; 
            private String enable; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            public CrossBorderOptimization build() {
                return new CrossBorderOptimization(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class DevelopmentMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private DevelopmentMode(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevelopmentMode create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private String enable; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public DevelopmentMode build() {
                return new DevelopmentMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class RequestHeaderModification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RequestHeaderModification(Builder builder) {
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestHeaderModification create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String operation; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RequestHeaderModification build() {
                return new RequestHeaderModification(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class HttpRequestHeaderModificationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("RequestHeaderModification")
        private java.util.List < RequestHeaderModification> requestHeaderModification;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private HttpRequestHeaderModificationRules(Builder builder) {
            this.configId = builder.configId;
            this.requestHeaderModification = builder.requestHeaderModification;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpRequestHeaderModificationRules create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return requestHeaderModification
         */
        public java.util.List < RequestHeaderModification> getRequestHeaderModification() {
            return this.requestHeaderModification;
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
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private java.util.List < RequestHeaderModification> requestHeaderModification; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * RequestHeaderModification.
             */
            public Builder requestHeaderModification(java.util.List < RequestHeaderModification> requestHeaderModification) {
                this.requestHeaderModification = requestHeaderModification;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public HttpRequestHeaderModificationRules build() {
                return new HttpRequestHeaderModificationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class ResponseHeaderModification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ResponseHeaderModification(Builder builder) {
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseHeaderModification create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String operation; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResponseHeaderModification build() {
                return new ResponseHeaderModification(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class HttpResponseHeaderModificationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ResponseHeaderModification")
        private java.util.List < ResponseHeaderModification> responseHeaderModification;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private HttpResponseHeaderModificationRules(Builder builder) {
            this.configId = builder.configId;
            this.responseHeaderModification = builder.responseHeaderModification;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpResponseHeaderModificationRules create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return responseHeaderModification
         */
        public java.util.List < ResponseHeaderModification> getResponseHeaderModification() {
            return this.responseHeaderModification;
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
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private java.util.List < ResponseHeaderModification> responseHeaderModification; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * ResponseHeaderModification.
             */
            public Builder responseHeaderModification(java.util.List < ResponseHeaderModification> responseHeaderModification) {
                this.responseHeaderModification = responseHeaderModification;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public HttpResponseHeaderModificationRules build() {
                return new HttpResponseHeaderModificationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class HttpsApplicationConfiguration extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private HttpsApplicationConfiguration(Builder builder) {
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
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpsApplicationConfiguration create() {
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
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
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
            private String sequence; 

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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public HttpsApplicationConfiguration build() {
                return new HttpsApplicationConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class HttpsBasicConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphersuite")
        private String ciphersuite;

        @com.aliyun.core.annotation.NameInMap("CiphersuiteGroup")
        private String ciphersuiteGroup;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Http2")
        private String http2;

        @com.aliyun.core.annotation.NameInMap("Http3")
        private String http3;

        @com.aliyun.core.annotation.NameInMap("Https")
        private String https;

        @com.aliyun.core.annotation.NameInMap("OcspStapling")
        private String ocspStapling;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("Tls10")
        private String tls10;

        @com.aliyun.core.annotation.NameInMap("Tls11")
        private String tls11;

        @com.aliyun.core.annotation.NameInMap("Tls12")
        private String tls12;

        @com.aliyun.core.annotation.NameInMap("Tls13")
        private String tls13;

        private HttpsBasicConfiguration(Builder builder) {
            this.ciphersuite = builder.ciphersuite;
            this.ciphersuiteGroup = builder.ciphersuiteGroup;
            this.configId = builder.configId;
            this.http2 = builder.http2;
            this.http3 = builder.http3;
            this.https = builder.https;
            this.ocspStapling = builder.ocspStapling;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.tls10 = builder.tls10;
            this.tls11 = builder.tls11;
            this.tls12 = builder.tls12;
            this.tls13 = builder.tls13;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpsBasicConfiguration create() {
            return builder().build();
        }

        /**
         * @return ciphersuite
         */
        public String getCiphersuite() {
            return this.ciphersuite;
        }

        /**
         * @return ciphersuiteGroup
         */
        public String getCiphersuiteGroup() {
            return this.ciphersuiteGroup;
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return http2
         */
        public String getHttp2() {
            return this.http2;
        }

        /**
         * @return http3
         */
        public String getHttp3() {
            return this.http3;
        }

        /**
         * @return https
         */
        public String getHttps() {
            return this.https;
        }

        /**
         * @return ocspStapling
         */
        public String getOcspStapling() {
            return this.ocspStapling;
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
        public String getSequence() {
            return this.sequence;
        }

        /**
         * @return tls10
         */
        public String getTls10() {
            return this.tls10;
        }

        /**
         * @return tls11
         */
        public String getTls11() {
            return this.tls11;
        }

        /**
         * @return tls12
         */
        public String getTls12() {
            return this.tls12;
        }

        /**
         * @return tls13
         */
        public String getTls13() {
            return this.tls13;
        }

        public static final class Builder {
            private String ciphersuite; 
            private String ciphersuiteGroup; 
            private Long configId; 
            private String http2; 
            private String http3; 
            private String https; 
            private String ocspStapling; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 
            private String tls10; 
            private String tls11; 
            private String tls12; 
            private String tls13; 

            /**
             * Ciphersuite.
             */
            public Builder ciphersuite(String ciphersuite) {
                this.ciphersuite = ciphersuite;
                return this;
            }

            /**
             * CiphersuiteGroup.
             */
            public Builder ciphersuiteGroup(String ciphersuiteGroup) {
                this.ciphersuiteGroup = ciphersuiteGroup;
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
             * Http2.
             */
            public Builder http2(String http2) {
                this.http2 = http2;
                return this;
            }

            /**
             * Http3.
             */
            public Builder http3(String http3) {
                this.http3 = http3;
                return this;
            }

            /**
             * Https.
             */
            public Builder https(String https) {
                this.https = https;
                return this;
            }

            /**
             * OcspStapling.
             */
            public Builder ocspStapling(String ocspStapling) {
                this.ocspStapling = ocspStapling;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * Tls10.
             */
            public Builder tls10(String tls10) {
                this.tls10 = tls10;
                return this;
            }

            /**
             * Tls11.
             */
            public Builder tls11(String tls11) {
                this.tls11 = tls11;
                return this;
            }

            /**
             * Tls12.
             */
            public Builder tls12(String tls12) {
                this.tls12 = tls12;
                return this;
            }

            /**
             * Tls13.
             */
            public Builder tls13(String tls13) {
                this.tls13 = tls13;
                return this;
            }

            public HttpsBasicConfiguration build() {
                return new HttpsBasicConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class ImageTransform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private ImageTransform(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTransform create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private String enable; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public ImageTransform build() {
                return new ImageTransform(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class Ipv6 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private Ipv6(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6 create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private String enable; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public Ipv6 build() {
                return new Ipv6(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class ManagedTransforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddClientGeolocationHeaders")
        private String addClientGeolocationHeaders;

        @com.aliyun.core.annotation.NameInMap("AddRealClientIpHeader")
        private String addRealClientIpHeader;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private ManagedTransforms(Builder builder) {
            this.addClientGeolocationHeaders = builder.addClientGeolocationHeaders;
            this.addRealClientIpHeader = builder.addRealClientIpHeader;
            this.configId = builder.configId;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedTransforms create() {
            return builder().build();
        }

        /**
         * @return addClientGeolocationHeaders
         */
        public String getAddClientGeolocationHeaders() {
            return this.addClientGeolocationHeaders;
        }

        /**
         * @return addRealClientIpHeader
         */
        public String getAddRealClientIpHeader() {
            return this.addRealClientIpHeader;
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private String addClientGeolocationHeaders; 
            private String addRealClientIpHeader; 
            private Long configId; 
            private String sequence; 

            /**
             * AddClientGeolocationHeaders.
             */
            public Builder addClientGeolocationHeaders(String addClientGeolocationHeaders) {
                this.addClientGeolocationHeaders = addClientGeolocationHeaders;
                return this;
            }

            /**
             * AddRealClientIpHeader.
             */
            public Builder addRealClientIpHeader(String addRealClientIpHeader) {
                this.addRealClientIpHeader = addRealClientIpHeader;
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
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public ManagedTransforms build() {
                return new ManagedTransforms(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class NetworkOptimization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Grpc")
        private String grpc;

        @com.aliyun.core.annotation.NameInMap("Http2Origin")
        private String http2Origin;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("SmartRouting")
        private String smartRouting;

        @com.aliyun.core.annotation.NameInMap("UploadMaxFilesize")
        private String uploadMaxFilesize;

        @com.aliyun.core.annotation.NameInMap("Websocket")
        private String websocket;

        private NetworkOptimization(Builder builder) {
            this.configId = builder.configId;
            this.grpc = builder.grpc;
            this.http2Origin = builder.http2Origin;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.smartRouting = builder.smartRouting;
            this.uploadMaxFilesize = builder.uploadMaxFilesize;
            this.websocket = builder.websocket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkOptimization create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return grpc
         */
        public String getGrpc() {
            return this.grpc;
        }

        /**
         * @return http2Origin
         */
        public String getHttp2Origin() {
            return this.http2Origin;
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
        public String getSequence() {
            return this.sequence;
        }

        /**
         * @return smartRouting
         */
        public String getSmartRouting() {
            return this.smartRouting;
        }

        /**
         * @return uploadMaxFilesize
         */
        public String getUploadMaxFilesize() {
            return this.uploadMaxFilesize;
        }

        /**
         * @return websocket
         */
        public String getWebsocket() {
            return this.websocket;
        }

        public static final class Builder {
            private Long configId; 
            private String grpc; 
            private String http2Origin; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 
            private String smartRouting; 
            private String uploadMaxFilesize; 
            private String websocket; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Grpc.
             */
            public Builder grpc(String grpc) {
                this.grpc = grpc;
                return this;
            }

            /**
             * Http2Origin.
             */
            public Builder http2Origin(String http2Origin) {
                this.http2Origin = http2Origin;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * SmartRouting.
             */
            public Builder smartRouting(String smartRouting) {
                this.smartRouting = smartRouting;
                return this;
            }

            /**
             * UploadMaxFilesize.
             */
            public Builder uploadMaxFilesize(String uploadMaxFilesize) {
                this.uploadMaxFilesize = uploadMaxFilesize;
                return this;
            }

            /**
             * Websocket.
             */
            public Builder websocket(String websocket) {
                this.websocket = websocket;
                return this;
            }

            public NetworkOptimization build() {
                return new NetworkOptimization(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class OriginRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("DnsRecord")
        private String dnsRecord;

        @com.aliyun.core.annotation.NameInMap("OriginHost")
        private String originHost;

        @com.aliyun.core.annotation.NameInMap("OriginHttpPort")
        private String originHttpPort;

        @com.aliyun.core.annotation.NameInMap("OriginHttpsPort")
        private String originHttpsPort;

        @com.aliyun.core.annotation.NameInMap("OriginScheme")
        private String originScheme;

        @com.aliyun.core.annotation.NameInMap("OriginSni")
        private String originSni;

        @com.aliyun.core.annotation.NameInMap("Range")
        private String range;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private OriginRules(Builder builder) {
            this.configId = builder.configId;
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
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginRules create() {
            return builder().build();
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
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
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
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * DnsRecord.
             */
            public Builder dnsRecord(String dnsRecord) {
                this.dnsRecord = dnsRecord;
                return this;
            }

            /**
             * OriginHost.
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * OriginHttpPort.
             */
            public Builder originHttpPort(String originHttpPort) {
                this.originHttpPort = originHttpPort;
                return this;
            }

            /**
             * OriginHttpsPort.
             */
            public Builder originHttpsPort(String originHttpsPort) {
                this.originHttpsPort = originHttpsPort;
                return this;
            }

            /**
             * OriginScheme.
             */
            public Builder originScheme(String originScheme) {
                this.originScheme = originScheme;
                return this;
            }

            /**
             * OriginSni.
             */
            public Builder originSni(String originSni) {
                this.originSni = originSni;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(String range) {
                this.range = range;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public OriginRules build() {
                return new OriginRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class RedirectRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ReserveQueryString")
        private String reserveQueryString;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RedirectRules(Builder builder) {
            this.configId = builder.configId;
            this.reserveQueryString = builder.reserveQueryString;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.statusCode = builder.statusCode;
            this.targetUrl = builder.targetUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedirectRules create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return reserveQueryString
         */
        public String getReserveQueryString() {
            return this.reserveQueryString;
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
        public String getSequence() {
            return this.sequence;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long configId; 
            private String reserveQueryString; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 
            private String statusCode; 
            private String targetUrl; 
            private String type; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * ReserveQueryString.
             */
            public Builder reserveQueryString(String reserveQueryString) {
                this.reserveQueryString = reserveQueryString;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RedirectRules build() {
                return new RedirectRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class RewriteUrlRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("QueryString")
        private String queryString;

        @com.aliyun.core.annotation.NameInMap("RewriteQueryStringType")
        private String rewriteQueryStringType;

        @com.aliyun.core.annotation.NameInMap("RewriteUriType")
        private String rewriteUriType;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private RewriteUrlRules(Builder builder) {
            this.configId = builder.configId;
            this.queryString = builder.queryString;
            this.rewriteQueryStringType = builder.rewriteQueryStringType;
            this.rewriteUriType = builder.rewriteUriType;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RewriteUrlRules create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return queryString
         */
        public String getQueryString() {
            return this.queryString;
        }

        /**
         * @return rewriteQueryStringType
         */
        public String getRewriteQueryStringType() {
            return this.rewriteQueryStringType;
        }

        /**
         * @return rewriteUriType
         */
        public String getRewriteUriType() {
            return this.rewriteUriType;
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
        public String getSequence() {
            return this.sequence;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private Long configId; 
            private String queryString; 
            private String rewriteQueryStringType; 
            private String rewriteUriType; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 
            private String uri; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * QueryString.
             */
            public Builder queryString(String queryString) {
                this.queryString = queryString;
                return this;
            }

            /**
             * RewriteQueryStringType.
             */
            public Builder rewriteQueryStringType(String rewriteQueryStringType) {
                this.rewriteQueryStringType = rewriteQueryStringType;
                return this;
            }

            /**
             * RewriteUriType.
             */
            public Builder rewriteUriType(String rewriteUriType) {
                this.rewriteUriType = rewriteUriType;
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
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public RewriteUrlRules build() {
                return new RewriteUrlRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class SeoBypass extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private SeoBypass(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeoBypass create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private String enable; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public SeoBypass build() {
                return new SeoBypass(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class SiteNameExclusive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private SiteNameExclusive(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteNameExclusive create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private String enable; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public SiteNameExclusive build() {
                return new SiteNameExclusive(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class SitePause extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Paused")
        private String paused;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private SitePause(Builder builder) {
            this.configId = builder.configId;
            this.paused = builder.paused;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SitePause create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return paused
         */
        public String getPaused() {
            return this.paused;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private String paused; 
            private String sequence; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Paused.
             */
            public Builder paused(String paused) {
                this.paused = paused;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public SitePause build() {
                return new SitePause(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class TieredCache extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheArchitectureMode")
        private String cacheArchitectureMode;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private TieredCache(Builder builder) {
            this.cacheArchitectureMode = builder.cacheArchitectureMode;
            this.configId = builder.configId;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TieredCache create() {
            return builder().build();
        }

        /**
         * @return cacheArchitectureMode
         */
        public String getCacheArchitectureMode() {
            return this.cacheArchitectureMode;
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return sequence
         */
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private String cacheArchitectureMode; 
            private Long configId; 
            private String sequence; 

            /**
             * CacheArchitectureMode.
             */
            public Builder cacheArchitectureMode(String cacheArchitectureMode) {
                this.cacheArchitectureMode = cacheArchitectureMode;
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
             * Sequence.
             */
            public Builder sequence(String sequence) {
                this.sequence = sequence;
                return this;
            }

            public TieredCache build() {
                return new TieredCache(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheReserve")
        private java.util.List < CacheReserve> cacheReserve;

        @com.aliyun.core.annotation.NameInMap("CacheRules")
        private java.util.List < CacheRules> cacheRules;

        @com.aliyun.core.annotation.NameInMap("CacheTags")
        private java.util.List < CacheTags> cacheTags;

        @com.aliyun.core.annotation.NameInMap("CnameFlattening")
        private java.util.List < CnameFlattening> cnameFlattening;

        @com.aliyun.core.annotation.NameInMap("CompressionRules")
        private java.util.List < CompressionRules> compressionRules;

        @com.aliyun.core.annotation.NameInMap("CrossBorderOptimization")
        private java.util.List < CrossBorderOptimization> crossBorderOptimization;

        @com.aliyun.core.annotation.NameInMap("DevelopmentMode")
        private java.util.List < DevelopmentMode> developmentMode;

        @com.aliyun.core.annotation.NameInMap("HttpRequestHeaderModificationRules")
        private java.util.List < HttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

        @com.aliyun.core.annotation.NameInMap("HttpResponseHeaderModificationRules")
        private java.util.List < HttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

        @com.aliyun.core.annotation.NameInMap("HttpsApplicationConfiguration")
        private java.util.List < HttpsApplicationConfiguration> httpsApplicationConfiguration;

        @com.aliyun.core.annotation.NameInMap("HttpsBasicConfiguration")
        private java.util.List < HttpsBasicConfiguration> httpsBasicConfiguration;

        @com.aliyun.core.annotation.NameInMap("ImageTransform")
        private java.util.List < ImageTransform> imageTransform;

        @com.aliyun.core.annotation.NameInMap("Ipv6")
        private java.util.List < Ipv6> ipv6;

        @com.aliyun.core.annotation.NameInMap("ManagedTransforms")
        private java.util.List < ManagedTransforms> managedTransforms;

        @com.aliyun.core.annotation.NameInMap("NetworkOptimization")
        private java.util.List < NetworkOptimization> networkOptimization;

        @com.aliyun.core.annotation.NameInMap("OriginRules")
        private java.util.List < OriginRules> originRules;

        @com.aliyun.core.annotation.NameInMap("RedirectRules")
        private java.util.List < RedirectRules> redirectRules;

        @com.aliyun.core.annotation.NameInMap("RewriteUrlRules")
        private java.util.List < RewriteUrlRules> rewriteUrlRules;

        @com.aliyun.core.annotation.NameInMap("SeoBypass")
        private java.util.List < SeoBypass> seoBypass;

        @com.aliyun.core.annotation.NameInMap("SiteNameExclusive")
        private java.util.List < SiteNameExclusive> siteNameExclusive;

        @com.aliyun.core.annotation.NameInMap("SitePause")
        private java.util.List < SitePause> sitePause;

        @com.aliyun.core.annotation.NameInMap("TieredCache")
        private java.util.List < TieredCache> tieredCache;

        private Configs(Builder builder) {
            this.cacheReserve = builder.cacheReserve;
            this.cacheRules = builder.cacheRules;
            this.cacheTags = builder.cacheTags;
            this.cnameFlattening = builder.cnameFlattening;
            this.compressionRules = builder.compressionRules;
            this.crossBorderOptimization = builder.crossBorderOptimization;
            this.developmentMode = builder.developmentMode;
            this.httpRequestHeaderModificationRules = builder.httpRequestHeaderModificationRules;
            this.httpResponseHeaderModificationRules = builder.httpResponseHeaderModificationRules;
            this.httpsApplicationConfiguration = builder.httpsApplicationConfiguration;
            this.httpsBasicConfiguration = builder.httpsBasicConfiguration;
            this.imageTransform = builder.imageTransform;
            this.ipv6 = builder.ipv6;
            this.managedTransforms = builder.managedTransforms;
            this.networkOptimization = builder.networkOptimization;
            this.originRules = builder.originRules;
            this.redirectRules = builder.redirectRules;
            this.rewriteUrlRules = builder.rewriteUrlRules;
            this.seoBypass = builder.seoBypass;
            this.siteNameExclusive = builder.siteNameExclusive;
            this.sitePause = builder.sitePause;
            this.tieredCache = builder.tieredCache;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return cacheReserve
         */
        public java.util.List < CacheReserve> getCacheReserve() {
            return this.cacheReserve;
        }

        /**
         * @return cacheRules
         */
        public java.util.List < CacheRules> getCacheRules() {
            return this.cacheRules;
        }

        /**
         * @return cacheTags
         */
        public java.util.List < CacheTags> getCacheTags() {
            return this.cacheTags;
        }

        /**
         * @return cnameFlattening
         */
        public java.util.List < CnameFlattening> getCnameFlattening() {
            return this.cnameFlattening;
        }

        /**
         * @return compressionRules
         */
        public java.util.List < CompressionRules> getCompressionRules() {
            return this.compressionRules;
        }

        /**
         * @return crossBorderOptimization
         */
        public java.util.List < CrossBorderOptimization> getCrossBorderOptimization() {
            return this.crossBorderOptimization;
        }

        /**
         * @return developmentMode
         */
        public java.util.List < DevelopmentMode> getDevelopmentMode() {
            return this.developmentMode;
        }

        /**
         * @return httpRequestHeaderModificationRules
         */
        public java.util.List < HttpRequestHeaderModificationRules> getHttpRequestHeaderModificationRules() {
            return this.httpRequestHeaderModificationRules;
        }

        /**
         * @return httpResponseHeaderModificationRules
         */
        public java.util.List < HttpResponseHeaderModificationRules> getHttpResponseHeaderModificationRules() {
            return this.httpResponseHeaderModificationRules;
        }

        /**
         * @return httpsApplicationConfiguration
         */
        public java.util.List < HttpsApplicationConfiguration> getHttpsApplicationConfiguration() {
            return this.httpsApplicationConfiguration;
        }

        /**
         * @return httpsBasicConfiguration
         */
        public java.util.List < HttpsBasicConfiguration> getHttpsBasicConfiguration() {
            return this.httpsBasicConfiguration;
        }

        /**
         * @return imageTransform
         */
        public java.util.List < ImageTransform> getImageTransform() {
            return this.imageTransform;
        }

        /**
         * @return ipv6
         */
        public java.util.List < Ipv6> getIpv6() {
            return this.ipv6;
        }

        /**
         * @return managedTransforms
         */
        public java.util.List < ManagedTransforms> getManagedTransforms() {
            return this.managedTransforms;
        }

        /**
         * @return networkOptimization
         */
        public java.util.List < NetworkOptimization> getNetworkOptimization() {
            return this.networkOptimization;
        }

        /**
         * @return originRules
         */
        public java.util.List < OriginRules> getOriginRules() {
            return this.originRules;
        }

        /**
         * @return redirectRules
         */
        public java.util.List < RedirectRules> getRedirectRules() {
            return this.redirectRules;
        }

        /**
         * @return rewriteUrlRules
         */
        public java.util.List < RewriteUrlRules> getRewriteUrlRules() {
            return this.rewriteUrlRules;
        }

        /**
         * @return seoBypass
         */
        public java.util.List < SeoBypass> getSeoBypass() {
            return this.seoBypass;
        }

        /**
         * @return siteNameExclusive
         */
        public java.util.List < SiteNameExclusive> getSiteNameExclusive() {
            return this.siteNameExclusive;
        }

        /**
         * @return sitePause
         */
        public java.util.List < SitePause> getSitePause() {
            return this.sitePause;
        }

        /**
         * @return tieredCache
         */
        public java.util.List < TieredCache> getTieredCache() {
            return this.tieredCache;
        }

        public static final class Builder {
            private java.util.List < CacheReserve> cacheReserve; 
            private java.util.List < CacheRules> cacheRules; 
            private java.util.List < CacheTags> cacheTags; 
            private java.util.List < CnameFlattening> cnameFlattening; 
            private java.util.List < CompressionRules> compressionRules; 
            private java.util.List < CrossBorderOptimization> crossBorderOptimization; 
            private java.util.List < DevelopmentMode> developmentMode; 
            private java.util.List < HttpRequestHeaderModificationRules> httpRequestHeaderModificationRules; 
            private java.util.List < HttpResponseHeaderModificationRules> httpResponseHeaderModificationRules; 
            private java.util.List < HttpsApplicationConfiguration> httpsApplicationConfiguration; 
            private java.util.List < HttpsBasicConfiguration> httpsBasicConfiguration; 
            private java.util.List < ImageTransform> imageTransform; 
            private java.util.List < Ipv6> ipv6; 
            private java.util.List < ManagedTransforms> managedTransforms; 
            private java.util.List < NetworkOptimization> networkOptimization; 
            private java.util.List < OriginRules> originRules; 
            private java.util.List < RedirectRules> redirectRules; 
            private java.util.List < RewriteUrlRules> rewriteUrlRules; 
            private java.util.List < SeoBypass> seoBypass; 
            private java.util.List < SiteNameExclusive> siteNameExclusive; 
            private java.util.List < SitePause> sitePause; 
            private java.util.List < TieredCache> tieredCache; 

            /**
             * CacheReserve.
             */
            public Builder cacheReserve(java.util.List < CacheReserve> cacheReserve) {
                this.cacheReserve = cacheReserve;
                return this;
            }

            /**
             * CacheRules.
             */
            public Builder cacheRules(java.util.List < CacheRules> cacheRules) {
                this.cacheRules = cacheRules;
                return this;
            }

            /**
             * CacheTags.
             */
            public Builder cacheTags(java.util.List < CacheTags> cacheTags) {
                this.cacheTags = cacheTags;
                return this;
            }

            /**
             * CnameFlattening.
             */
            public Builder cnameFlattening(java.util.List < CnameFlattening> cnameFlattening) {
                this.cnameFlattening = cnameFlattening;
                return this;
            }

            /**
             * CompressionRules.
             */
            public Builder compressionRules(java.util.List < CompressionRules> compressionRules) {
                this.compressionRules = compressionRules;
                return this;
            }

            /**
             * CrossBorderOptimization.
             */
            public Builder crossBorderOptimization(java.util.List < CrossBorderOptimization> crossBorderOptimization) {
                this.crossBorderOptimization = crossBorderOptimization;
                return this;
            }

            /**
             * DevelopmentMode.
             */
            public Builder developmentMode(java.util.List < DevelopmentMode> developmentMode) {
                this.developmentMode = developmentMode;
                return this;
            }

            /**
             * HttpRequestHeaderModificationRules.
             */
            public Builder httpRequestHeaderModificationRules(java.util.List < HttpRequestHeaderModificationRules> httpRequestHeaderModificationRules) {
                this.httpRequestHeaderModificationRules = httpRequestHeaderModificationRules;
                return this;
            }

            /**
             * HttpResponseHeaderModificationRules.
             */
            public Builder httpResponseHeaderModificationRules(java.util.List < HttpResponseHeaderModificationRules> httpResponseHeaderModificationRules) {
                this.httpResponseHeaderModificationRules = httpResponseHeaderModificationRules;
                return this;
            }

            /**
             * HttpsApplicationConfiguration.
             */
            public Builder httpsApplicationConfiguration(java.util.List < HttpsApplicationConfiguration> httpsApplicationConfiguration) {
                this.httpsApplicationConfiguration = httpsApplicationConfiguration;
                return this;
            }

            /**
             * HttpsBasicConfiguration.
             */
            public Builder httpsBasicConfiguration(java.util.List < HttpsBasicConfiguration> httpsBasicConfiguration) {
                this.httpsBasicConfiguration = httpsBasicConfiguration;
                return this;
            }

            /**
             * ImageTransform.
             */
            public Builder imageTransform(java.util.List < ImageTransform> imageTransform) {
                this.imageTransform = imageTransform;
                return this;
            }

            /**
             * Ipv6.
             */
            public Builder ipv6(java.util.List < Ipv6> ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            /**
             * ManagedTransforms.
             */
            public Builder managedTransforms(java.util.List < ManagedTransforms> managedTransforms) {
                this.managedTransforms = managedTransforms;
                return this;
            }

            /**
             * NetworkOptimization.
             */
            public Builder networkOptimization(java.util.List < NetworkOptimization> networkOptimization) {
                this.networkOptimization = networkOptimization;
                return this;
            }

            /**
             * OriginRules.
             */
            public Builder originRules(java.util.List < OriginRules> originRules) {
                this.originRules = originRules;
                return this;
            }

            /**
             * RedirectRules.
             */
            public Builder redirectRules(java.util.List < RedirectRules> redirectRules) {
                this.redirectRules = redirectRules;
                return this;
            }

            /**
             * RewriteUrlRules.
             */
            public Builder rewriteUrlRules(java.util.List < RewriteUrlRules> rewriteUrlRules) {
                this.rewriteUrlRules = rewriteUrlRules;
                return this;
            }

            /**
             * SeoBypass.
             */
            public Builder seoBypass(java.util.List < SeoBypass> seoBypass) {
                this.seoBypass = seoBypass;
                return this;
            }

            /**
             * SiteNameExclusive.
             */
            public Builder siteNameExclusive(java.util.List < SiteNameExclusive> siteNameExclusive) {
                this.siteNameExclusive = siteNameExclusive;
                return this;
            }

            /**
             * SitePause.
             */
            public Builder sitePause(java.util.List < SitePause> sitePause) {
                this.sitePause = sitePause;
                return this;
            }

            /**
             * TieredCache.
             */
            public Builder tieredCache(java.util.List < TieredCache> tieredCache) {
                this.tieredCache = tieredCache;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
