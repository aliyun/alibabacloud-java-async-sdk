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
 * {@link GetCacheRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetCacheRuleResponseBody</p>
 */
public class GetCacheRuleResponseBody extends TeaModel {
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

    private GetCacheRuleResponseBody(Builder builder) {
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
        this.requestId = builder.requestId;
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

    public static GetCacheRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
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

        private Builder(GetCacheRuleResponseBody model) {
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
            this.requestId = model.requestId;
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
         * <li><p>Additional ports on which caching is enabled.</p>
         * </li>
         * <li><p>Valid values: <code>8880</code>, <code>2052</code>, <code>2082</code>, <code>2086</code>, <code>2095</code>, <code>2053</code>, <code>2083</code>, <code>2087</code>, <code>2096</code>.</p>
         * </li>
         * <li><p>Separate multiple ports with commas.</p>
         * </li>
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
         * <li><p><code>no_cache</code>: Does not cache content.</p>
         * </li>
         * <li><p><code>follow_origin</code>: Follows the origin cache policy.</p>
         * </li>
         * <li><p><code>override_origin</code>: Overrides the origin cache policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin</p>
         */
        public Builder browserCacheMode(String browserCacheMode) {
            this.browserCacheMode = browserCacheMode;
            return this;
        }

        /**
         * <p>The browser cache TTL, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder browserCacheTtl(String browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }

        /**
         * <p>Specifies whether to cache requests or bypass the cache. Valid values:</p>
         * <ul>
         * <li><p><code>cache_all</code>: Caches all requests.</p>
         * </li>
         * <li><p><code>bypass_all</code>: Bypasses the cache for all requests.</p>
         * </li>
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
         * <p>Specifies whether to enable Cache Deception Armor. This feature helps mitigate web cache deception attacks by ensuring that only validated content is cached. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
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
         * <p>The eligibility for cache reserve. This controls whether a request bypasses the cache reserve node during an origin fetch. Valid values:</p>
         * <ul>
         * <li><p><code>bypass_cache_reserve</code>: The request bypasses the cache reserve.</p>
         * </li>
         * <li><p><code>eligible_for_cache_reserve</code>: The request is eligible for cache reserve.</p>
         * </li>
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
         * <p>Specifies cookies whose presence is checked when generating a cache key. If a specified cookie exists in the request, its name (case-insensitive) is added to the cache key. Separate multiple cookie names with spaces. Cookie names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Letters: lowercase English letters a-z</p>
         * </li>
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
         * <p>Specifies headers whose presence is checked when generating a cache key. If a specified header exists in the request, its name (case-insensitive) is added to the cache key. Separate multiple header names with spaces. Header names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Letters: lowercase English letters a-z</p>
         * </li>
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
         * <p>352816096987136</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>Indicates whether the response contains a global or a rule configuration. Valid values:</p>
         * <ul>
         * <li><p><code>global</code>: A global configuration.</p>
         * </li>
         * <li><p><code>rule</code>: A rule configuration.</p>
         * </li>
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
         * <li><p><code>follow_origin</code>: Uses the origin server\&quot;s cache policy. If none is provided, the default policy applies.</p>
         * </li>
         * <li><p><code>no_cache</code>: Does not cache content.</p>
         * </li>
         * <li><p><code>override_origin</code>: Overrides the origin cache policy.</p>
         * </li>
         * <li><p><code>follow_origin_bypass</code>: Uses the origin server\&quot;s cache policy. If none is provided, content is not cached.</p>
         * </li>
         * <li><p><code>follow_origin_override</code>: Uses the origin server\&quot;s cache policy. If none is provided, a custom cache TTL applies.</p>
         * </li>
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
         * <p>The edge cache TTL, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder edgeCacheTtl(String edgeCacheTtl) {
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }

        /**
         * <p>The status code cache TTL, in seconds.</p>
         * <ul>
         * <li><p>Set the cache TTL for a specific status code. For example, <code>404=10</code> specifies that responses with a 404 status code are cached for 10 seconds.</p>
         * </li>
         * <li><p>Set the cache TTL for status code classes, such as 4xx and 5xx. For example, <code>4xx=10</code> specifies that all responses with a 4xx status code are cached for 10 seconds.</p>
         * </li>
         * <li><p>Separate multiple entries with commas.</p>
         * </li>
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
         * <p>Specifies the cookies to include in the cache key. Both the cookie names (case-insensitive) and their values are added to the key. Separate multiple cookie names with spaces. Cookie names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Letters: lowercase English letters a-z</p>
         * </li>
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
         * <p>Specifies the headers to include in the cache key. Both the header names (case-insensitive) and their values are added to the key. Separate multiple header names with spaces. Header names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Letters: lowercase English letters a-z</p>
         * </li>
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
         * <p>The mode for handling the body content when generating a cache key for POST requests. Valid values:</p>
         * <ul>
         * <li><p><code>md5</code>: Calculates the MD5 hash of the body content and adds the hash to the cache key.</p>
         * </li>
         * <li><p><code>ignore</code>: Ignores the body content in the cache key.</p>
         * </li>
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
         * <p>The size limit (in KB) of the body content for POST caching. The value is an integer from 1 to 8. A null or empty value defaults to 8 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder postBodySizeLimit(String postBodySizeLimit) {
            this.postBodySizeLimit = postBodySizeLimit;
            return this;
        }

        /**
         * <p>Specifies whether to enable the POST cache feature.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder postCache(String postCache) {
            this.postCache = postCache;
            return this;
        }

        /**
         * <p>Specifies the query strings to include in or exclude from the cache key. Separate multiple query strings with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * <p>The mode for handling query strings when generating a cache key. Valid values:</p>
         * <ul>
         * <li><p><code>ignore_all</code>: Ignores all query strings.</p>
         * </li>
         * <li><p><code>exclude_query_string</code>: Excludes specified query strings.</p>
         * </li>
         * <li><p><code>reserve_all</code>: Retains all query strings. This is the default value.</p>
         * </li>
         * <li><p><code>include_query_string</code>: Includes specified query strings.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>reserve_all</p>
         */
        public Builder queryStringMode(String queryStringMode) {
            this.queryStringMode = queryStringMode;
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
         * <p>The rule content, which is a conditional expression used to match user requests. This parameter applies only to rule configurations.</p>
         * <ul>
         * <li><p>To match all incoming requests, use <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, use a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
         * </li>
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
         * <p>Specifies whether the rule is enabled. This parameter applies only to rule configurations. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
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
         * <p>The name of the rule. This parameter applies only to rule configurations.</p>
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
         * <p>Specifies whether to serve stale content. If enabled, edge nodes serve stale (expired) content from the cache when the origin server is unavailable. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
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
         * <p>The version number of the site configuration. For sites with version management enabled, this indicates the configuration version. The default is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>Specifies whether to sort query strings before generating the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
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
         * <p>Specifies whether to include the client\&quot;s device type in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
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
         * <p>Specifies whether to include the client\&quot;s geographic location in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
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
         * <p>Specifies whether to include the client\&quot;s language in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder userLanguage(String userLanguage) {
            this.userLanguage = userLanguage;
            return this;
        }

        public GetCacheRuleResponseBody build() {
            return new GetCacheRuleResponseBody(this);
        } 

    } 

}
