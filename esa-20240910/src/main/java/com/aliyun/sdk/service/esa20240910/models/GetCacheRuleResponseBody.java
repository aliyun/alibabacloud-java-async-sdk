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
         * <p>Enable caching on the specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096.</p>
         * 
         * <strong>example:</strong>
         * <p>2095</p>
         */
        public Builder additionalCacheablePorts(String additionalCacheablePorts) {
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
         * <p>follow_origin</p>
         */
        public Builder browserCacheMode(String browserCacheMode) {
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
            this.bypassCache = bypassCache;
            return this;
        }

        /**
         * <p>Cache deception defense. Used to defend against web cache deception attacks. Only the verified cache content will be cached. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>Cache reserve eligibility. Used to control whether user requests bypass the cache reserve node when returning to the origin. Value range:</p>
         * <ul>
         * <li>bypass_cache_reserve: Requests bypass the cache reserve.</li>
         * <li>eligible_for_cache_reserve: Eligible for cache reserve.</li>
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
         * <p>When generating the cache key, check if the cookie exists. If it does, add the cookie name (cookie names are case-insensitive) to the cache key. Supports multiple cookie names, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookiename</p>
         */
        public Builder checkPresenceCookie(String checkPresenceCookie) {
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }

        /**
         * <p>When generating the cache key, check if the header exists. If it does, add the header name (header names are case-insensitive) to the cache key. Supports multiple header names, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        public Builder checkPresenceHeader(String checkPresenceHeader) {
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }

        /**
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>Configuration type, which can be used to query global or rule configurations. Value range:</p>
         * <ul>
         * <li>global: Query global configuration;</li>
         * <li>rule: Query rule configuration;</li>
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
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }

        /**
         * <p>When generating the cache key, include the specified cookie names and their values. Supports multiple values, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookie_exapmle</p>
         */
        public Builder includeCookie(String includeCookie) {
            this.includeCookie = includeCookie;
            return this;
        }

        /**
         * <p>When generating the cache key, include the specified header names and their values. Supports multiple values, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder includeHeader(String includeHeader) {
            this.includeHeader = includeHeader;
            return this;
        }

        /**
         * <p>The query strings to be retained or deleted, supporting multiple values separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * <p>The processing mode for query strings when generating cache keys. Value range:</p>
         * <ul>
         * <li>ignore_all: Ignore all.</li>
         * <li>exclude_query_string: Exclude specified query strings.</li>
         * <li>reserve_all: Default, reserve all.</li>
         * <li>include_query_string: Include specified query strings.</li>
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
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true</li>
         * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
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
         * <p>Rule switch. This parameter does not need to be set when adding a global configuration. Value range:</p>
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
         * <p>Rule name. This parameter does not need to be set when adding a global configuration.</p>
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
         * <p>Serve stale cache. When enabled, the node can still use the cached expired files to respond to user requests even if the origin server is unavailable. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the configuration, defaulting to version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
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
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }

        /**
         * <p>When generating the cache key, include the client device type. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>When generating the cache key, include the client&quot;s geographic location. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
         * <p>When generating the cache key, include the client&quot;s language type. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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
