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
 * {@link ListCacheRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCacheRulesResponseBody</p>
 */
public class ListCacheRulesResponseBody extends TeaModel {
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

    private ListCacheRulesResponseBody(Builder builder) {
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

    public static ListCacheRulesResponseBody create() {
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
         * Configs.
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListCacheRulesResponseBody build() {
            return new ListCacheRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCacheRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCacheRulesResponseBody</p>
     */
    public static class Configs extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

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
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("ServeStale")
        private String serveStale;

        @com.aliyun.core.annotation.NameInMap("SiteVersion")
        private Integer siteVersion;

        @com.aliyun.core.annotation.NameInMap("SortQueryStringForCache")
        private String sortQueryStringForCache;

        @com.aliyun.core.annotation.NameInMap("UserDeviceType")
        private String userDeviceType;

        @com.aliyun.core.annotation.NameInMap("UserGeo")
        private String userGeo;

        @com.aliyun.core.annotation.NameInMap("UserLanguage")
        private String userLanguage;

        private Configs(Builder builder) {
            this.additionalCacheablePorts = builder.additionalCacheablePorts;
            this.browserCacheMode = builder.browserCacheMode;
            this.browserCacheTtl = builder.browserCacheTtl;
            this.bypassCache = builder.bypassCache;
            this.cacheDeceptionArmor = builder.cacheDeceptionArmor;
            this.cacheReserveEligibility = builder.cacheReserveEligibility;
            this.checkPresenceCookie = builder.checkPresenceCookie;
            this.checkPresenceHeader = builder.checkPresenceHeader;
            this.configId = builder.configId;
            this.configType = builder.configType;
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
            this.siteVersion = builder.siteVersion;
            this.sortQueryStringForCache = builder.sortQueryStringForCache;
            this.userDeviceType = builder.userDeviceType;
            this.userGeo = builder.userGeo;
            this.userLanguage = builder.userLanguage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
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
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
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
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return serveStale
         */
        public String getServeStale() {
            return this.serveStale;
        }

        /**
         * @return siteVersion
         */
        public Integer getSiteVersion() {
            return this.siteVersion;
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
            private String configType; 
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
            private Integer sequence; 
            private String serveStale; 
            private Integer siteVersion; 
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
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
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
            public Builder sequence(Integer sequence) {
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
             * SiteVersion.
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
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

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
