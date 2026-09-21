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
 * {@link UpdateCacheRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateCacheRuleRequest</p>
 */
public class UpdateCacheRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalCacheablePorts")
    private String additionalCacheablePorts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserCacheMode")
    private String browserCacheMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserCacheTtl")
    private String browserCacheTtl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BypassCache")
    private String bypassCache;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheDeceptionArmor")
    private String cacheDeceptionArmor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheReserveEligibility")
    private String cacheReserveEligibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckPresenceCookie")
    private String checkPresenceCookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckPresenceHeader")
    private String checkPresenceHeader;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeCacheMode")
    private String edgeCacheMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeCacheTtl")
    private String edgeCacheTtl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeStatusCodeCacheTtl")
    private String edgeStatusCodeCacheTtl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeCookie")
    private String includeCookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeHeader")
    private String includeHeader;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostBodyCacheKey")
    private String postBodyCacheKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostBodySizeLimit")
    private String postBodySizeLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostCache")
    private String postCache;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryString")
    private String queryString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryStringMode")
    private String queryStringMode;

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
    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServeStale")
    private String serveStale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortQueryStringForCache")
    private String sortQueryStringForCache;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDeviceType")
    private String userDeviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGeo")
    private String userGeo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserLanguage")
    private String userLanguage;

    private UpdateCacheRuleRequest(Builder builder) {
        super(builder);
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
        this.siteId = builder.siteId;
        this.sortQueryStringForCache = builder.sortQueryStringForCache;
        this.userDeviceType = builder.userDeviceType;
        this.userGeo = builder.userGeo;
        this.userLanguage = builder.userLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCacheRuleRequest create() {
        return builder().build();
    }

@Override
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
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

    public static final class Builder extends Request.Builder<UpdateCacheRuleRequest, Builder> {
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
        private Long siteId; 
        private String sortQueryStringForCache; 
        private String userDeviceType; 
        private String userGeo; 
        private String userLanguage; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCacheRuleRequest request) {
            super(request);
            this.additionalCacheablePorts = request.additionalCacheablePorts;
            this.browserCacheMode = request.browserCacheMode;
            this.browserCacheTtl = request.browserCacheTtl;
            this.bypassCache = request.bypassCache;
            this.cacheDeceptionArmor = request.cacheDeceptionArmor;
            this.cacheReserveEligibility = request.cacheReserveEligibility;
            this.checkPresenceCookie = request.checkPresenceCookie;
            this.checkPresenceHeader = request.checkPresenceHeader;
            this.configId = request.configId;
            this.edgeCacheMode = request.edgeCacheMode;
            this.edgeCacheTtl = request.edgeCacheTtl;
            this.edgeStatusCodeCacheTtl = request.edgeStatusCodeCacheTtl;
            this.includeCookie = request.includeCookie;
            this.includeHeader = request.includeHeader;
            this.postBodyCacheKey = request.postBodyCacheKey;
            this.postBodySizeLimit = request.postBodySizeLimit;
            this.postCache = request.postCache;
            this.queryString = request.queryString;
            this.queryStringMode = request.queryStringMode;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.sequence = request.sequence;
            this.serveStale = request.serveStale;
            this.siteId = request.siteId;
            this.sortQueryStringForCache = request.sortQueryStringForCache;
            this.userDeviceType = request.userDeviceType;
            this.userGeo = request.userGeo;
            this.userLanguage = request.userLanguage;
        } 

        /**
         * <ul>
         * <li><p>Enables caching on the specified ports.</p>
         * </li>
         * <li><p>Valid values: <code>8880</code>, <code>2052</code>, <code>2082</code>, <code>2086</code>, <code>2095</code>, <code>2053</code>, <code>2083</code>, <code>2087</code>, <code>2096</code></p>
         * </li>
         * <li><p>Separate multiple ports with commas.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8880,2052,2086</p>
         */
        public Builder additionalCacheablePorts(String additionalCacheablePorts) {
            this.putQueryParameter("AdditionalCacheablePorts", additionalCacheablePorts);
            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }

        /**
         * <p>The browser cache mode. Valid values:</p>
         * <ul>
         * <li><p><code>no_cache</code>: Does not cache content in the browser.</p>
         * </li>
         * <li><p><code>follow_origin</code>: Follows the caching policy of the origin server.</p>
         * </li>
         * <li><p><code>override_origin</code>: Overrides the caching policy of the origin server.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no_cache</p>
         */
        public Builder browserCacheMode(String browserCacheMode) {
            this.putQueryParameter("BrowserCacheMode", browserCacheMode);
            this.browserCacheMode = browserCacheMode;
            return this;
        }

        /**
         * <p>The browser cache TTL (Time to Live), in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder browserCacheTtl(String browserCacheTtl) {
            this.putQueryParameter("BrowserCacheTtl", browserCacheTtl);
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }

        /**
         * <p>The cache bypass mode. Valid values:</p>
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
            this.putQueryParameter("BypassCache", bypassCache);
            this.bypassCache = bypassCache;
            return this;
        }

        /**
         * <p>Defends against Web Cache Deception attacks by caching only validated content. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables the feature.</p>
         * </li>
         * <li><p><code>off</code>: Disables the feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder cacheDeceptionArmor(String cacheDeceptionArmor) {
            this.putQueryParameter("CacheDeceptionArmor", cacheDeceptionArmor);
            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }

        /**
         * <p>Controls whether requests bypass the cache reserve node during an origin-pull. Valid values:</p>
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
            this.putQueryParameter("CacheReserveEligibility", cacheReserveEligibility);
            this.cacheReserveEligibility = cacheReserveEligibility;
            return this;
        }

        /**
         * <p>The cookies to check for. If a specified cookie is present in the request, its name (case-insensitive) is added to the cache key. Separate multiple cookies with spaces. Cookie names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Lowercase letters: a-z</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookiename1 cookiename2</p>
         */
        public Builder checkPresenceCookie(String checkPresenceCookie) {
            this.putQueryParameter("CheckPresenceCookie", checkPresenceCookie);
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }

        /**
         * <p>The headers to check for. If a specified header is present in the request, its name (case-insensitive) is added to the cache key. Separate multiple headers with spaces. Header names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Lowercase letters: a-z</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>headername1 headername2</p>
         */
        public Builder checkPresenceHeader(String checkPresenceHeader) {
            this.putQueryParameter("CheckPresenceHeader", checkPresenceHeader);
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }

        /**
         * <p>The configuration ID.</p>
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
         * <p>The cache mode for the edge node. Valid values:</p>
         * <ul>
         * <li><p><code>follow_origin</code>: Follows the origin server\&quot;s caching policy. If the origin server has no policy, the default policy is used.</p>
         * </li>
         * <li><p><code>no_cache</code>: Does not cache content.</p>
         * </li>
         * <li><p><code>override_origin</code>: Overrides the caching policy of the origin server.</p>
         * </li>
         * <li><p><code>follow_origin_bypass</code>: Follows the caching policy of the origin server, if one exists. Otherwise, content is not cached.</p>
         * </li>
         * <li><p><code>follow_origin_override</code>: Follows the caching policy of the origin server, if one exists. Otherwise, a custom cache TTL is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin</p>
         */
        public Builder edgeCacheMode(String edgeCacheMode) {
            this.putQueryParameter("EdgeCacheMode", edgeCacheMode);
            this.edgeCacheMode = edgeCacheMode;
            return this;
        }

        /**
         * <p>The edge node cache TTL (Time to Live), in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder edgeCacheTtl(String edgeCacheTtl) {
            this.putQueryParameter("EdgeCacheTtl", edgeCacheTtl);
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }

        /**
         * <p>The cache TTL for specific status codes, in seconds.</p>
         * <ul>
         * <li><p>You can set the cache TTL for a specific status code. For example, <code>404=10</code> caches responses with a 404 status code for 10 seconds.</p>
         * </li>
         * <li><p>You can set the cache TTL for <code>4xx</code> and <code>5xx</code> status code ranges. For example, <code>4xx=10</code> caches all responses with a <code>4xx</code> status code for 10 seconds.</p>
         * </li>
         * <li><p>Separate multiple status code settings with commas.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5xx=0,404=10</p>
         */
        public Builder edgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            this.putQueryParameter("EdgeStatusCodeCacheTtl", edgeStatusCodeCacheTtl);
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }

        /**
         * <p>The cookies to include in the cache key. Both the cookie names (case-insensitive) and their values are used. Separate multiple cookies with spaces. Cookie names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Lowercase letters: a-z</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookiename1 cookiename2</p>
         */
        public Builder includeCookie(String includeCookie) {
            this.putQueryParameter("IncludeCookie", includeCookie);
            this.includeCookie = includeCookie;
            return this;
        }

        /**
         * <p>The headers to include in the cache key. Both the header names (case-insensitive) and their values are used. Separate multiple headers with spaces. Header names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Lowercase letters: a-z</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>headername1 headername2</p>
         */
        public Builder includeHeader(String includeHeader) {
            this.putQueryParameter("IncludeHeader", includeHeader);
            this.includeHeader = includeHeader;
            return this;
        }

        /**
         * <p>Controls how the request body is used to generate the cache key for POST requests. Valid values:</p>
         * <ul>
         * <li><p><code>md5</code>: Calculates the MD5 hash of the request body and includes the hash in the cache key.</p>
         * </li>
         * <li><p><code>ignore</code>: Ignores the request body when generating the cache key.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder postBodyCacheKey(String postBodyCacheKey) {
            this.putQueryParameter("PostBodyCacheKey", postBodyCacheKey);
            this.postBodyCacheKey = postBodyCacheKey;
            return this;
        }

        /**
         * <p>The maximum size of a request body for POST caching, in KB. The value must be an integer from 1 to 8. If you leave this parameter empty, the default value of 8 KB is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder postBodySizeLimit(String postBodySizeLimit) {
            this.putQueryParameter("PostBodySizeLimit", postBodySizeLimit);
            this.postBodySizeLimit = postBodySizeLimit;
            return this;
        }

        /**
         * <p>Controls whether to cache responses to POST requests.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder postCache(String postCache) {
            this.putQueryParameter("PostCache", postCache);
            this.postCache = postCache;
            return this;
        }

        /**
         * <p>The query string parameters to include in or exclude from the cache key. Separate multiple parameters with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example1 example2</p>
         */
        public Builder queryString(String queryString) {
            this.putQueryParameter("QueryString", queryString);
            this.queryString = queryString;
            return this;
        }

        /**
         * <p>Controls how query strings are used to generate a cache key. Valid values:</p>
         * <ul>
         * <li><p><code>ignore_all</code>: Ignores all query strings.</p>
         * </li>
         * <li><p><code>exclude_query_string</code>: Removes specified query strings.</p>
         * </li>
         * <li><p><code>reserve_all</code>: Retains all query strings. This is the default value.</p>
         * </li>
         * <li><p><code>include_query_string</code>: Retains only specified query strings.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ignore_all</p>
         */
        public Builder queryStringMode(String queryStringMode) {
            this.putQueryParameter("QueryStringMode", queryStringMode);
            this.queryStringMode = queryStringMode;
            return this;
        }

        /**
         * <p>A conditional expression that matches user requests. This parameter is optional for a global configuration. Two scenarios are supported:</p>
         * <ul>
         * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, set the value to a custom expression, for example, <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>Controls whether the rule is enabled. This parameter is optional for a global configuration. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables the rule.</p>
         * </li>
         * <li><p><code>off</code>: Disables the rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * <p>The name of the rule. This parameter is optional for a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The execution priority of the rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>Controls whether to serve stale content. If enabled, an edge node can serve expired content from its cache if the origin server is unavailable. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables this feature.</p>
         * </li>
         * <li><p><code>off</code>: Disables this feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder serveStale(String serveStale) {
            this.putQueryParameter("ServeStale", serveStale);
            this.serveStale = serveStale;
            return this;
        }

        /**
         * <p>The ID of the site. To get this ID, call the <a href="~~ListSites~~">ListSites</a> operation.</p>
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

        /**
         * <p>Controls whether to sort query string parameters when generating a cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables sorting.</p>
         * </li>
         * <li><p><code>off</code>: Disables sorting.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder sortQueryStringForCache(String sortQueryStringForCache) {
            this.putQueryParameter("SortQueryStringForCache", sortQueryStringForCache);
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }

        /**
         * <p>Controls whether to include the client device type in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables this feature.</p>
         * </li>
         * <li><p><code>off</code>: Disables this feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder userDeviceType(String userDeviceType) {
            this.putQueryParameter("UserDeviceType", userDeviceType);
            this.userDeviceType = userDeviceType;
            return this;
        }

        /**
         * <p>Controls whether to include the client\&quot;s geographic location in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables this feature.</p>
         * </li>
         * <li><p><code>off</code>: Disables this feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder userGeo(String userGeo) {
            this.putQueryParameter("UserGeo", userGeo);
            this.userGeo = userGeo;
            return this;
        }

        /**
         * <p>Controls whether to include the client\&quot;s language in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables this feature.</p>
         * </li>
         * <li><p><code>off</code>: Disables this feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder userLanguage(String userLanguage) {
            this.putQueryParameter("UserLanguage", userLanguage);
            this.userLanguage = userLanguage;
            return this;
        }

        @Override
        public UpdateCacheRuleRequest build() {
            return new UpdateCacheRuleRequest(this);
        } 

    } 

}
