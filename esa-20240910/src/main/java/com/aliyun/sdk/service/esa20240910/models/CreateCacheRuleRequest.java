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
 * {@link CreateCacheRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateCacheRuleRequest</p>
 */
public class CreateCacheRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

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

    private CreateCacheRuleRequest(Builder builder) {
        super(builder);
        this.additionalCacheablePorts = builder.additionalCacheablePorts;
        this.browserCacheMode = builder.browserCacheMode;
        this.browserCacheTtl = builder.browserCacheTtl;
        this.bypassCache = builder.bypassCache;
        this.cacheDeceptionArmor = builder.cacheDeceptionArmor;
        this.cacheReserveEligibility = builder.cacheReserveEligibility;
        this.checkPresenceCookie = builder.checkPresenceCookie;
        this.checkPresenceHeader = builder.checkPresenceHeader;
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
        this.siteVersion = builder.siteVersion;
        this.sortQueryStringForCache = builder.sortQueryStringForCache;
        this.userDeviceType = builder.userDeviceType;
        this.userGeo = builder.userGeo;
        this.userLanguage = builder.userLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCacheRuleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCacheRuleRequest, Builder> {
        private String additionalCacheablePorts; 
        private String browserCacheMode; 
        private String browserCacheTtl; 
        private String bypassCache; 
        private String cacheDeceptionArmor; 
        private String cacheReserveEligibility; 
        private String checkPresenceCookie; 
        private String checkPresenceHeader; 
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
        private Integer siteVersion; 
        private String sortQueryStringForCache; 
        private String userDeviceType; 
        private String userGeo; 
        private String userLanguage; 

        private Builder() {
            super();
        } 

        private Builder(CreateCacheRuleRequest request) {
            super(request);
            this.additionalCacheablePorts = request.additionalCacheablePorts;
            this.browserCacheMode = request.browserCacheMode;
            this.browserCacheTtl = request.browserCacheTtl;
            this.bypassCache = request.bypassCache;
            this.cacheDeceptionArmor = request.cacheDeceptionArmor;
            this.cacheReserveEligibility = request.cacheReserveEligibility;
            this.checkPresenceCookie = request.checkPresenceCookie;
            this.checkPresenceHeader = request.checkPresenceHeader;
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
            this.siteVersion = request.siteVersion;
            this.sortQueryStringForCache = request.sortQueryStringForCache;
            this.userDeviceType = request.userDeviceType;
            this.userGeo = request.userGeo;
            this.userLanguage = request.userLanguage;
        } 

        /**
         * <ul>
         * <li><p>Specifies additional ports on which caching is enabled.</p>
         * </li>
         * <li><p>Valid values: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, and 2096.</p>
         * </li>
         * <li><p>You can specify multiple ports, separated by commas (,).</p>
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
         * <li><p><code>no_cache</code>: Disables browser caching.</p>
         * </li>
         * <li><p><code>follow_origin</code>: Follows the origin server cache policy.</p>
         * </li>
         * <li><p><code>override_origin</code>: Overrides the origin server cache policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin</p>
         */
        public Builder browserCacheMode(String browserCacheMode) {
            this.putQueryParameter("BrowserCacheMode", browserCacheMode);
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
            this.putQueryParameter("BrowserCacheTtl", browserCacheTtl);
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }

        /**
         * <p>The bypass cache mode. Valid values:</p>
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
         * <p>Specifies whether to enable cache deception defense. This feature helps defend against web cache deception attacks. When this feature is enabled, only content that passes validation is cached. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables the defense.</p>
         * </li>
         * <li><p><code>off</code>: Disables the defense.</p>
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
         * <p>Specifies whether requests bypass cache reservation nodes during an origin fetch. Valid values:</p>
         * <ul>
         * <li><p><code>bypass_cache_reserve</code>: The request bypasses cache reservation.</p>
         * </li>
         * <li><p><code>eligible_for_cache_reserve</code>: The request is eligible for cache reservation.</p>
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
         * <p>Specifies the cookies to check for presence when generating a cache key. If a specified cookie is present in the request, its name (case-insensitive) is included in the cache key. To specify multiple cookies, separate their names with spaces. The cookie names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Letters: a-z (lowercase)</p>
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
         * <p>Specifies the headers to check for presence when generating a cache key. If a specified header is present in the request, its name (case-insensitive) is included in the cache key. To specify multiple headers, separate their names with spaces. The header names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Letters: a-z (lowercase)</p>
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
         * <p>The edge cache mode. Valid values:</p>
         * <ul>
         * <li><p><code>follow_origin</code>: Follows the origin server cache policy if one exists; otherwise, uses the default cache policy.</p>
         * </li>
         * <li><p><code>no_cache</code>: Disables caching on the edge node.</p>
         * </li>
         * <li><p><code>override_origin</code>: Overrides the origin server cache policy.</p>
         * </li>
         * <li><p><code>follow_origin_bypass</code>: Follows the origin server cache policy if one exists; otherwise, the content is not cached.</p>
         * </li>
         * <li><p><code>follow_origin_override</code>: Follows the origin server cache policy if one exists; otherwise, uses a custom edge cache TTL.</p>
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
         * <p>The edge cache TTL, in seconds.</p>
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
         * <p>The status code cache TTL, in seconds.</p>
         * <ul>
         * <li><p>You can set the cache TTL for a specific status code. For example, <code>404=10</code> caches responses with a 404 status code for 10 seconds.</p>
         * </li>
         * <li><p>You can set the cache TTL for a series of status codes, such as 4xx or 5xx. For example, <code>4xx=10</code> caches all responses that have a status code in the 4xx series for 10 seconds.</p>
         * </li>
         * <li><p>You can specify multiple status code TTLs, separated by commas (,).</p>
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
         * <p>The cookies to include in the cache key. Both the cookie names (case-insensitive) and their values are included. Separate multiple cookie names with spaces. The cookie names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Letters: a-z (lowercase)</p>
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
         * <p>The headers to include in the cache key. Both the header names (case-insensitive) and their values are included. Separate multiple header names with spaces. The header names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
         * </li>
         * <li><p>Digits: 0-9</p>
         * </li>
         * <li><p>Letters: a-z (lowercase)</p>
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
         * <p>Specifies how to process the request body when generating a cache key for POST requests. The following modes are supported:</p>
         * <ul>
         * <li><p><code>md5</code>: Calculates the MD5 hash of the request body and adds the hash value to the cache key.</p>
         * </li>
         * <li><p><code>ignore</code>: Ignores the request body when the cache key is generated.</p>
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
         * <p>The size limit for the request body when using POST request caching, in KB. Supported values range from 1 to 8. If unspecified, the default is 8 KB.</p>
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
         * <p>Specifies whether to enable POST request caching.</p>
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
         * <p>The query strings to include in or exclude from the cache key. Separate multiple query strings with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder queryString(String queryString) {
            this.putQueryParameter("QueryString", queryString);
            this.queryString = queryString;
            return this;
        }

        /**
         * <p>The mode for processing query strings when generating a cache key. Valid values:</p>
         * <ul>
         * <li><p><code>ignore_all</code>: Ignores all query strings.</p>
         * </li>
         * <li><p><code>exclude_query_string</code>: Excludes specified query strings.</p>
         * </li>
         * <li><p><code>reserve_all</code>: Includes all query strings (the default).</p>
         * </li>
         * <li><p><code>include_query_string</code>: Includes only specified query strings.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>reserve_all</p>
         */
        public Builder queryStringMode(String queryStringMode) {
            this.putQueryParameter("QueryStringMode", queryStringMode);
            this.queryStringMode = queryStringMode;
            return this;
        }

        /**
         * <p>The content of the rule, which is a conditional expression used to match user requests. This parameter is not required for a global configuration.</p>
         * <ul>
         * <li><p>To match all requests, set the value to <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, set the value to a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
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
         * <p>Specifies whether to enable the rule. This parameter is not required for a global configuration. Valid values:</p>
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
         * <p>The rule name. This parameter is not required for a global configuration.</p>
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
         * <p>The execution order of the rule. A smaller number indicates a higher priority.</p>
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
         * <p>Specifies whether to serve stale content. If enabled, an edge node can serve stale (expired) content when the origin server is unavailable. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enables serving stale content.</p>
         * </li>
         * <li><p><code>off</code>: Disables serving stale content.</p>
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
         * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to get this ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>340035003106221</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The site configuration version. For sites with version management enabled, this parameter specifies the site version to which the configuration applies.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>Specifies whether to sort query strings. This feature is disabled by default. Valid values:</p>
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
         * <p>Specifies whether to include the client device type in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Includes the client device type.</p>
         * </li>
         * <li><p><code>off</code>: Does not include the client device type.</p>
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
         * <p>Specifies whether to include the client\&quot;s geographic location in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Includes the geographic location.</p>
         * </li>
         * <li><p><code>off</code>: Does not include the geographic location.</p>
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
         * <p>Specifies whether to include the client\&quot;s language in the cache key. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Includes the language.</p>
         * </li>
         * <li><p><code>off</code>: Does not include the language.</p>
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
        public CreateCacheRuleRequest build() {
            return new CreateCacheRuleRequest(this);
        } 

    } 

}
