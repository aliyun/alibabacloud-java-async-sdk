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
         * <p>Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096.</p>
         * 
         * <strong>example:</strong>
         * <p>8880</p>
         */
        public Builder additionalCacheablePorts(String additionalCacheablePorts) {
            this.putQueryParameter("AdditionalCacheablePorts", additionalCacheablePorts);
            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }

        /**
         * <p>Browser cache mode. Value range:</p>
         * <ul>
         * <li>no_cache: Do not cache.</li>
         * <li>follow_origin: Follow origin cache policy.</li>
         * <li>override_origin: Override origin cache policy.</li>
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
         * <p>Browser cache expiration time, in seconds.</p>
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
         * <p>Set bypass cache mode. Value range:</p>
         * <ul>
         * <li>cache_all: Cache all requests.</li>
         * <li>bypass_all: Bypass cache for all requests.</li>
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
         * <p>Cache deception defense. Used to defend against web cache deception attacks; only the cache content that passes the validation will be cached. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * <p>Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Value range:</p>
         * <ul>
         * <li>bypass_cache_reserve: Requests bypass cache retention.</li>
         * <li>eligible_for_cache_reserve: Eligible for cache retention.</li>
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
         * <p>Check if the cookie exists when generating cache keys, and if it does, add the cookie name (case-insensitive) to the cache key. Supports multiple cookie names, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookiename</p>
         */
        public Builder checkPresenceCookie(String checkPresenceCookie) {
            this.putQueryParameter("CheckPresenceCookie", checkPresenceCookie);
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }

        /**
         * <p>Check if the header exists when generating cache keys, and if it does, add the header name (case-insensitive) to the cache key. Supports multiple header names, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        public Builder checkPresenceHeader(String checkPresenceHeader) {
            this.putQueryParameter("CheckPresenceHeader", checkPresenceHeader);
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }

        /**
         * <p>Configuration ID.</p>
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
         * <p>Edge cache mode. Value range:</p>
         * <ul>
         * <li>follow_origin: Follow origin cache policy (if exists), otherwise use the default cache policy.</li>
         * <li>no_cache: Do not cache.</li>
         * <li>override_origin: Override origin cache policy.</li>
         * <li>follow_origin_bypass: Follow origin cache policy (if exists), otherwise do not cache.</li>
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
         * <p>Edge cache expiration time, in seconds.</p>
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
         * <p>Status code cache expiration time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder edgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            this.putQueryParameter("EdgeStatusCodeCacheTtl", edgeStatusCodeCacheTtl);
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }

        /**
         * <p>Include the specified cookie names and their values when generating cache keys, supporting multiple values separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookiename</p>
         */
        public Builder includeCookie(String includeCookie) {
            this.putQueryParameter("IncludeCookie", includeCookie);
            this.includeCookie = includeCookie;
            return this;
        }

        /**
         * <p>Include the specified header names and their values when generating cache keys, supporting multiple values separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        public Builder includeHeader(String includeHeader) {
            this.putQueryParameter("IncludeHeader", includeHeader);
            this.includeHeader = includeHeader;
            return this;
        }

        /**
         * <p>Query strings to be retained or excluded, supporting multiple values separated by spaces.</p>
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
         * <p>The processing mode of query strings when generating cache keys. Values:</p>
         * <ul>
         * <li>ignore_all: Ignore all.</li>
         * <li>exclude_query_string: Exclude specified query strings.</li>
         * <li>reserve_all: Default, reserve all.</li>
         * <li>include_query_string: Include specified query strings.</li>
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true</li>
         * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>Rule switch. This parameter is not required when adding a global configuration. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * <p>Rule name. This parameter is not required when adding a global configuration.</p>
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
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>Serve stale cache. When enabled, the node can still use the expired cached files to respond to user requests even if the origin server is unavailable. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
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
         * <p>Query string sorting. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * <p>When generating cache keys, include the client device type. Value range: </p>
         * <ul>
         * <li>on: enabled. </li>
         * <li>off: disabled.</li>
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
         * <p>Include the client&quot;s geographical location when generating the cache key. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
         * <p>Include the client&quot;s language type when generating the cache key. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
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
