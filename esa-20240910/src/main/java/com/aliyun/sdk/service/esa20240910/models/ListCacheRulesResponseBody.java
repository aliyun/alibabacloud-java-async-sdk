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

        private Builder(ListCacheRulesResponseBody model) {
            this.configs = model.configs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The configuration list in the response body.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The current page number, which is the same as the PageNumber request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

        @com.aliyun.core.annotation.NameInMap("PostBodyCacheKey")
        private String postBodyCacheKey;

        @com.aliyun.core.annotation.NameInMap("PostBodySizeLimit")
        private String postBodySizeLimit;

        @com.aliyun.core.annotation.NameInMap("PostCache")
        private String postCache;

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
            this.postBodyCacheKey = builder.postBodyCacheKey;
            this.postBodySizeLimit = builder.postBodySizeLimit;
            this.postCache = builder.postCache;
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
         * @return postBodyCacheKey
         */
        public String getPostBodyCacheKey() {
            return this.postBodyCacheKey;
        }

        /**
         * @return postBodySizeLimit
         */
        public String getPostBodySizeLimit() {
            return this.postBodySizeLimit;
        }

        /**
         * @return postCache
         */
        public String getPostCache() {
            return this.postCache;
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
            private String postBodyCacheKey; 
            private String postBodySizeLimit; 
            private String postCache; 
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

            private Builder() {
            } 

            private Builder(Configs model) {
                this.additionalCacheablePorts = model.additionalCacheablePorts;
                this.browserCacheMode = model.browserCacheMode;
                this.browserCacheTtl = model.browserCacheTtl;
                this.bypassCache = model.bypassCache;
                this.cacheDeceptionArmor = model.cacheDeceptionArmor;
                this.cacheReserveEligibility = model.cacheReserveEligibility;
                this.checkPresenceCookie = model.checkPresenceCookie;
                this.checkPresenceHeader = model.checkPresenceHeader;
                this.configId = model.configId;
                this.configType = model.configType;
                this.edgeCacheMode = model.edgeCacheMode;
                this.edgeCacheTtl = model.edgeCacheTtl;
                this.edgeStatusCodeCacheTtl = model.edgeStatusCodeCacheTtl;
                this.includeCookie = model.includeCookie;
                this.includeHeader = model.includeHeader;
                this.postBodyCacheKey = model.postBodyCacheKey;
                this.postBodySizeLimit = model.postBodySizeLimit;
                this.postCache = model.postCache;
                this.queryString = model.queryString;
                this.queryStringMode = model.queryStringMode;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.serveStale = model.serveStale;
                this.siteVersion = model.siteVersion;
                this.sortQueryStringForCache = model.sortQueryStringForCache;
                this.userDeviceType = model.userDeviceType;
                this.userGeo = model.userGeo;
                this.userLanguage = model.userLanguage;
            } 

            /**
             * <ul>
             * <li>Enables caching on specified ports.</li>
             * <li>Valid values: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, and 2096.</li>
             * <li>Multiple ports are separated by commas (,).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8880,2052,2086</p>
             */
            public Builder additionalCacheablePorts(String additionalCacheablePorts) {
                this.additionalCacheablePorts = additionalCacheablePorts;
                return this;
            }

            /**
             * <p>The browser cache mode. Valid values:</p>
             * <ul>
             * <li>no_cache: does not cache.</li>
             * <li>follow_origin: follows the origin cache policy.</li>
             * <li>override_origin: overrides the origin cache policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no_cache</p>
             */
            public Builder browserCacheMode(String browserCacheMode) {
                this.browserCacheMode = browserCacheMode;
                return this;
            }

            /**
             * <p>The browser cache expiration time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder browserCacheTtl(String browserCacheTtl) {
                this.browserCacheTtl = browserCacheTtl;
                return this;
            }

            /**
             * <p>The bypass cache mode. Valid values:</p>
             * <ul>
             * <li>cache_all: caches all requests.</li>
             * <li>bypass_all: bypasses cache for all requests.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cache_all</p>
             */
            public Builder bypassCache(String bypassCache) {
                this.bypassCache = bypassCache;
                return this;
            }

            /**
             * <p>The cache deception armor. Protects against web cache deception attacks by caching only content that passes validation. Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder cacheDeceptionArmor(String cacheDeceptionArmor) {
                this.cacheDeceptionArmor = cacheDeceptionArmor;
                return this;
            }

            /**
             * <p>The cache reserve eligibility. Controls whether user requests bypass the cache reserve node during back-to-origin. Valid values:</p>
             * <ul>
             * <li>bypass_cache_reserve: requests bypass cache reserve.</li>
             * <li>eligible_for_cache_reserve: requests are eligible for cache reserve.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bypass_cache_reserve</p>
             */
            public Builder cacheReserveEligibility(String cacheReserveEligibility) {
                this.cacheReserveEligibility = cacheReserveEligibility;
                return this;
            }

            /**
             * <p>When generating cache keys, checks whether the specified cookies exist. If a cookie exists, its name (case-insensitive) is added to the cache key. Multiple cookie names are separated by spaces. Cookie names support the following character types:</p>
             * <ul>
             * <li>Symbols: ! # $ % &amp; \&quot; * + - . ^ _ ` | ~</li>
             * <li>Digits: 0-9</li>
             * <li>Letters: lowercase a-z.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cookiename1 cookiename2</p>
             */
            public Builder checkPresenceCookie(String checkPresenceCookie) {
                this.checkPresenceCookie = checkPresenceCookie;
                return this;
            }

            /**
             * <p>When generating cache keys, checks whether the specified headers exist. If a header exists, its name (case-insensitive) is added to the cache key. Multiple header names are separated by spaces. Header names support the following character types:</p>
             * <ul>
             * <li>Symbols: ! # $ % &amp; \&quot; * + - . ^ _ ` | ~</li>
             * <li>Digits: 0-9</li>
             * <li>Letters: lowercase a-z.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>headername1 headername2</p>
             */
            public Builder checkPresenceHeader(String checkPresenceHeader) {
                this.checkPresenceHeader = checkPresenceHeader;
                return this;
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
             * <p>The configuration type. You can use this parameter to query global or rule configurations. Valid values:</p>
             * <ul>
             * <li>global: global configuration.</li>
             * <li>rule: rule configuration.</li>
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
             * <p>The edge cache mode. Valid values:</p>
             * <ul>
             * <li>follow_origin: follows the origin cache policy if present. Otherwise, uses the default cache policy.</li>
             * <li>no_cache: does not cache.</li>
             * <li>override_origin: overrides the origin cache policy.</li>
             * <li>follow_origin_bypass: follows the origin cache policy if present. Otherwise, does not cache.</li>
             * <li>follow_origin_override: follows the origin cache policy if present. Otherwise, uses a custom cache TTL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>follow_origin</p>
             */
            public Builder edgeCacheMode(String edgeCacheMode) {
                this.edgeCacheMode = edgeCacheMode;
                return this;
            }

            /**
             * <p>The edge cache expiration time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder edgeCacheTtl(String edgeCacheTtl) {
                this.edgeCacheTtl = edgeCacheTtl;
                return this;
            }

            /**
             * <p>The status code cache expiration time, in seconds.</p>
             * <ul>
             * <li>You can set the cache expiration time for specific status codes. For example, 404=10 indicates that the 404 status code is cached for 10 seconds.</li>
             * <li>You can set the cache expiration time for 4xx or 5xx series status codes. For example, 4xx=10 indicates that all 4xx status codes are cached for 10 seconds.</li>
             * <li>You can set the cache expiration time for multiple status codes. Separate multiple status codes with commas (,).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5xx=0,404=10</p>
             */
            public Builder edgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
                this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
                return this;
            }

            /**
             * <p>The specified cookie names (case-insensitive) and their values to include when generating cache keys. Multiple values are separated by spaces. Cookie names support the following character types:</p>
             * <ul>
             * <li>Symbols: ! # $ % &amp; \&quot; * + - . ^ _ ` | ~</li>
             * <li>Digits: 0-9</li>
             * <li>Letters: lowercase a-z.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cookiename1 cookiename2</p>
             */
            public Builder includeCookie(String includeCookie) {
                this.includeCookie = includeCookie;
                return this;
            }

            /**
             * <p>The specified header names (case-insensitive) and their values to include when generating cache keys. Multiple values are separated by spaces. Header names support the following character types:</p>
             * <ul>
             * <li>Symbols: ! # $ % &amp; \&quot; * + - . ^ _ ` | ~</li>
             * <li>Digits: 0-9</li>
             * <li>Letters: lowercase a-z.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>headername1 headername2</p>
             */
            public Builder includeHeader(String includeHeader) {
                this.includeHeader = includeHeader;
                return this;
            }

            /**
             * <p>The cache key handling mode for POST caching. The following two modes are supported:</p>
             * <ul>
             * <li>md5: calculates the MD5 hash of the body content and adds the MD5 value to the cache key.</li>
             * <li>ignore: ignores the body content in the cache key.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder postBodyCacheKey(String postBodyCacheKey) {
                this.postBodyCacheKey = postBodyCacheKey;
                return this;
            }

            /**
             * <p>The body size limit for POST caching. The value is a number in KB. Valid values: 1 to 8. If this parameter is left empty, the default value of 8 KB takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder postBodySizeLimit(String postBodySizeLimit) {
                this.postBodySizeLimit = postBodySizeLimit;
                return this;
            }

            /**
             * <p>Specifies whether to enable POST caching.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder postCache(String postCache) {
                this.postCache = postCache;
                return this;
            }

            /**
             * <p>The query strings to retain or remove when generating cache keys. Multiple values are separated by spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder queryString(String queryString) {
                this.queryString = queryString;
                return this;
            }

            /**
             * <p>The query string handling mode when generating cache keys. Valid values:</p>
             * <ul>
             * <li>ignore_all: ignores all query strings.</li>
             * <li>exclude_query_string: removes specified query strings.</li>
             * <li>reserve_all: retains all query strings. This is the default value.</li>
             * <li>include_query_string: retains specified query strings.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ignore_all</p>
             */
            public Builder queryStringMode(String queryStringMode) {
                this.queryStringMode = queryStringMode;
                return this;
            }

            /**
             * <p>The rule content, which uses conditional expressions to match user requests. You do not need to set this parameter when you add a global configuration. Two scenarios are supported:</p>
             * <ul>
             * <li>Match all incoming requests: set the value to true.</li>
             * <li>Match specified requests: set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
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
             * <p>The rule switch. You do not need to set this parameter when you add a global configuration. Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
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
             * <p>The rule name. You do not need to set this parameter when you add a global configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The rule execution order. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Specifies whether to serve stale cache. When enabled, edge nodes can respond to user requests with cached expired files when the origin server is unavailable. Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder serveStale(String serveStale) {
                this.serveStale = serveStale;
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

            /**
             * <p>Specifies whether to sort query strings. Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder sortQueryStringForCache(String sortQueryStringForCache) {
                this.sortQueryStringForCache = sortQueryStringForCache;
                return this;
            }

            /**
             * <p>Specifies whether to include the type of the client when generating cache keys. Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: shutdown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder userDeviceType(String userDeviceType) {
                this.userDeviceType = userDeviceType;
                return this;
            }

            /**
             * <p>Specifies whether to include the client geographic location when generating cache keys. Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder userGeo(String userGeo) {
                this.userGeo = userGeo;
                return this;
            }

            /**
             * <p>Specifies whether to include the client language type when generating cache keys. Valid values:</p>
             * <ul>
             * <li>on: enabled.</li>
             * <li>off: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
