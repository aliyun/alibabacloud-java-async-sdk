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
 * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSiteFunctionsResponseBody</p>
 */
public class ListSiteFunctionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private Configs configs;

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

    private ListSiteFunctionsResponseBody(Builder builder) {
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

    public static ListSiteFunctionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public Configs getConfigs() {
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
        private Configs configs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListSiteFunctionsResponseBody model) {
            this.configs = model.configs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * Configs.
         */
        public Builder configs(Configs configs) {
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
         * <p>Id of the request</p>
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

        public ListSiteFunctionsResponseBody build() {
            return new ListSiteFunctionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CacheReserve model) {
                this.configId = model.configId;
                this.enable = model.enable;
                this.instanceId = model.instanceId;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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
            private String postBodyCacheKey; 
            private String postBodySizeLimit; 
            private String postCache; 
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

            private Builder() {
            } 

            private Builder(CacheRules model) {
                this.additionalCacheablePorts = model.additionalCacheablePorts;
                this.browserCacheMode = model.browserCacheMode;
                this.browserCacheTtl = model.browserCacheTtl;
                this.bypassCache = model.bypassCache;
                this.cacheDeceptionArmor = model.cacheDeceptionArmor;
                this.cacheReserveEligibility = model.cacheReserveEligibility;
                this.checkPresenceCookie = model.checkPresenceCookie;
                this.checkPresenceHeader = model.checkPresenceHeader;
                this.configId = model.configId;
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
                this.sortQueryStringForCache = model.sortQueryStringForCache;
                this.userDeviceType = model.userDeviceType;
                this.userGeo = model.userGeo;
                this.userLanguage = model.userLanguage;
            } 

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
             * PostBodyCacheKey.
             */
            public Builder postBodyCacheKey(String postBodyCacheKey) {
                this.postBodyCacheKey = postBodyCacheKey;
                return this;
            }

            /**
             * PostBodySizeLimit.
             */
            public Builder postBodySizeLimit(String postBodySizeLimit) {
                this.postBodySizeLimit = postBodySizeLimit;
                return this;
            }

            /**
             * PostCache.
             */
            public Builder postCache(String postCache) {
                this.postCache = postCache;
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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CacheTags model) {
                this.caseInsensitive = model.caseInsensitive;
                this.configId = model.configId;
                this.sequence = model.sequence;
                this.tagName = model.tagName;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CnameFlattening model) {
                this.configId = model.configId;
                this.flattenMode = model.flattenMode;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Zstd")
        private String zstd;

        private CompressionRules(Builder builder) {
            this.brotli = builder.brotli;
            this.configId = builder.configId;
            this.gzip = builder.gzip;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.zstd = builder.zstd;
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

        /**
         * @return zstd
         */
        public String getZstd() {
            return this.zstd;
        }

        public static final class Builder {
            private String brotli; 
            private Long configId; 
            private String gzip; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 
            private String zstd; 

            private Builder() {
            } 

            private Builder(CompressionRules model) {
                this.brotli = model.brotli;
                this.configId = model.configId;
                this.gzip = model.gzip;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.zstd = model.zstd;
            } 

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

            /**
             * Zstd.
             */
            public Builder zstd(String zstd) {
                this.zstd = zstd;
                return this;
            }

            public CompressionRules build() {
                return new CompressionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class CrossBorderOptimization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private CrossBorderOptimization(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.sequence = builder.sequence;
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

            private Builder() {
            } 

            private Builder(CrossBorderOptimization model) {
                this.configId = model.configId;
                this.enable = model.enable;
                this.sequence = model.sequence;
            } 

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

            public CrossBorderOptimization build() {
                return new CrossBorderOptimization(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class CustomResponseCode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private String pageId;

        @com.aliyun.core.annotation.NameInMap("ReturnCode")
        private String returnCode;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private CustomResponseCode(Builder builder) {
            this.configId = builder.configId;
            this.pageId = builder.pageId;
            this.returnCode = builder.returnCode;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomResponseCode create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        /**
         * @return returnCode
         */
        public String getReturnCode() {
            return this.returnCode;
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
            private String pageId; 
            private String returnCode; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            private Builder() {
            } 

            private Builder(CustomResponseCode model) {
                this.configId = model.configId;
                this.pageId = model.pageId;
                this.returnCode = model.returnCode;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * ReturnCode.
             */
            public Builder returnCode(String returnCode) {
                this.returnCode = returnCode;
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

            public CustomResponseCode build() {
                return new CustomResponseCode(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DevelopmentMode model) {
                this.configId = model.configId;
                this.enable = model.enable;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class ErrorPagesRedirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TargetURL")
        private String targetURL;

        private ErrorPagesRedirect(Builder builder) {
            this.statusCode = builder.statusCode;
            this.targetURL = builder.targetURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorPagesRedirect create() {
            return builder().build();
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return targetURL
         */
        public String getTargetURL() {
            return this.targetURL;
        }

        public static final class Builder {
            private String statusCode; 
            private String targetURL; 

            private Builder() {
            } 

            private Builder(ErrorPagesRedirect model) {
                this.statusCode = model.statusCode;
                this.targetURL = model.targetURL;
            } 

            /**
             * StatusCode.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * TargetURL.
             */
            public Builder targetURL(String targetURL) {
                this.targetURL = targetURL;
                return this;
            }

            public ErrorPagesRedirect build() {
                return new ErrorPagesRedirect(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class ErrorPagesRedirects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ErrorPagesRedirect")
        private java.util.List<ErrorPagesRedirect> errorPagesRedirect;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private ErrorPagesRedirects(Builder builder) {
            this.configId = builder.configId;
            this.errorPagesRedirect = builder.errorPagesRedirect;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorPagesRedirects create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return errorPagesRedirect
         */
        public java.util.List<ErrorPagesRedirect> getErrorPagesRedirect() {
            return this.errorPagesRedirect;
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
            private java.util.List<ErrorPagesRedirect> errorPagesRedirect; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            private Builder() {
            } 

            private Builder(ErrorPagesRedirects model) {
                this.configId = model.configId;
                this.errorPagesRedirect = model.errorPagesRedirect;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * ErrorPagesRedirect.
             */
            public Builder errorPagesRedirect(java.util.List<ErrorPagesRedirect> errorPagesRedirect) {
                this.errorPagesRedirect = errorPagesRedirect;
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

            public ErrorPagesRedirects build() {
                return new ErrorPagesRedirects(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RequestHeaderModification model) {
                this.name = model.name;
                this.operation = model.operation;
                this.value = model.value;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class HttpIncomingRequestHeaderModificationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("RequestHeaderModification")
        private java.util.List<RequestHeaderModification> requestHeaderModification;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private HttpIncomingRequestHeaderModificationRules(Builder builder) {
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

        public static HttpIncomingRequestHeaderModificationRules create() {
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
        public java.util.List<RequestHeaderModification> getRequestHeaderModification() {
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
            private java.util.List<RequestHeaderModification> requestHeaderModification; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            private Builder() {
            } 

            private Builder(HttpIncomingRequestHeaderModificationRules model) {
                this.configId = model.configId;
                this.requestHeaderModification = model.requestHeaderModification;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

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
            public Builder requestHeaderModification(java.util.List<RequestHeaderModification> requestHeaderModification) {
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

            public HttpIncomingRequestHeaderModificationRules build() {
                return new HttpIncomingRequestHeaderModificationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ResponseHeaderModification model) {
                this.name = model.name;
                this.operation = model.operation;
                this.value = model.value;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class HttpIncomingResponseHeaderModificationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ResponseHeaderModification")
        private java.util.List<ResponseHeaderModification> responseHeaderModification;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private HttpIncomingResponseHeaderModificationRules(Builder builder) {
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

        public static HttpIncomingResponseHeaderModificationRules create() {
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
        public java.util.List<ResponseHeaderModification> getResponseHeaderModification() {
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
            private java.util.List<ResponseHeaderModification> responseHeaderModification; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            private Builder() {
            } 

            private Builder(HttpIncomingResponseHeaderModificationRules model) {
                this.configId = model.configId;
                this.responseHeaderModification = model.responseHeaderModification;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

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
            public Builder responseHeaderModification(java.util.List<ResponseHeaderModification> responseHeaderModification) {
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

            public HttpIncomingResponseHeaderModificationRules build() {
                return new HttpIncomingResponseHeaderModificationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class HttpRequestHeaderModificationRulesRequestHeaderModification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HttpRequestHeaderModificationRulesRequestHeaderModification(Builder builder) {
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpRequestHeaderModificationRulesRequestHeaderModification create() {
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

            private Builder() {
            } 

            private Builder(HttpRequestHeaderModificationRulesRequestHeaderModification model) {
                this.name = model.name;
                this.operation = model.operation;
                this.value = model.value;
            } 

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

            public HttpRequestHeaderModificationRulesRequestHeaderModification build() {
                return new HttpRequestHeaderModificationRulesRequestHeaderModification(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class HttpRequestHeaderModificationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("RequestHeaderModification")
        private java.util.List<HttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification;

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
        public java.util.List<HttpRequestHeaderModificationRulesRequestHeaderModification> getRequestHeaderModification() {
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
            private java.util.List<HttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            private Builder() {
            } 

            private Builder(HttpRequestHeaderModificationRules model) {
                this.configId = model.configId;
                this.requestHeaderModification = model.requestHeaderModification;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

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
            public Builder requestHeaderModification(java.util.List<HttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification) {
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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class HttpResponseHeaderModificationRulesResponseHeaderModification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HttpResponseHeaderModificationRulesResponseHeaderModification(Builder builder) {
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpResponseHeaderModificationRulesResponseHeaderModification create() {
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

            private Builder() {
            } 

            private Builder(HttpResponseHeaderModificationRulesResponseHeaderModification model) {
                this.name = model.name;
                this.operation = model.operation;
                this.value = model.value;
            } 

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

            public HttpResponseHeaderModificationRulesResponseHeaderModification build() {
                return new HttpResponseHeaderModificationRulesResponseHeaderModification(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class HttpResponseHeaderModificationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ResponseHeaderModification")
        private java.util.List<HttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification;

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
        public java.util.List<HttpResponseHeaderModificationRulesResponseHeaderModification> getResponseHeaderModification() {
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
            private java.util.List<HttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            private Builder() {
            } 

            private Builder(HttpResponseHeaderModificationRules model) {
                this.configId = model.configId;
                this.responseHeaderModification = model.responseHeaderModification;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

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
            public Builder responseHeaderModification(java.util.List<HttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification) {
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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(HttpsApplicationConfiguration model) {
                this.altSvc = model.altSvc;
                this.altSvcClear = model.altSvcClear;
                this.altSvcMa = model.altSvcMa;
                this.altSvcPersist = model.altSvcPersist;
                this.configId = model.configId;
                this.hsts = model.hsts;
                this.hstsIncludeSubdomains = model.hstsIncludeSubdomains;
                this.hstsMaxAge = model.hstsMaxAge;
                this.hstsPreload = model.hstsPreload;
                this.httpsForce = model.httpsForce;
                this.httpsForceCode = model.httpsForceCode;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(HttpsBasicConfiguration model) {
                this.ciphersuite = model.ciphersuite;
                this.ciphersuiteGroup = model.ciphersuiteGroup;
                this.configId = model.configId;
                this.http2 = model.http2;
                this.http3 = model.http3;
                this.https = model.https;
                this.ocspStapling = model.ocspStapling;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.tls10 = model.tls10;
                this.tls11 = model.tls11;
                this.tls12 = model.tls12;
                this.tls13 = model.tls13;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class ImageTransform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoAvif")
        private String autoAvif;

        @com.aliyun.core.annotation.NameInMap("AutoWebp")
        private String autoWebp;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private ImageTransform(Builder builder) {
            this.autoAvif = builder.autoAvif;
            this.autoWebp = builder.autoWebp;
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTransform create() {
            return builder().build();
        }

        /**
         * @return autoAvif
         */
        public String getAutoAvif() {
            return this.autoAvif;
        }

        /**
         * @return autoWebp
         */
        public String getAutoWebp() {
            return this.autoWebp;
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
            private String autoAvif; 
            private String autoWebp; 
            private Long configId; 
            private String enable; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            private Builder() {
            } 

            private Builder(ImageTransform model) {
                this.autoAvif = model.autoAvif;
                this.autoWebp = model.autoWebp;
                this.configId = model.configId;
                this.enable = model.enable;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

            /**
             * AutoAvif.
             */
            public Builder autoAvif(String autoAvif) {
                this.autoAvif = autoAvif;
                return this;
            }

            /**
             * AutoWebp.
             */
            public Builder autoWebp(String autoWebp) {
                this.autoWebp = autoWebp;
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
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
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

            public ImageTransform build() {
                return new ImageTransform(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Ipv6 model) {
                this.configId = model.configId;
                this.enable = model.enable;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ManagedTransforms model) {
                this.addClientGeolocationHeaders = model.addClientGeolocationHeaders;
                this.addRealClientIpHeader = model.addRealClientIpHeader;
                this.configId = model.configId;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class MarkdownForAgent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        private MarkdownForAgent(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarkdownForAgent create() {
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
            private String enable; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 

            private Builder() {
            } 

            private Builder(MarkdownForAgent model) {
                this.configId = model.configId;
                this.enable = model.enable;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
            } 

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

            public MarkdownForAgent build() {
                return new MarkdownForAgent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(NetworkOptimization model) {
                this.configId = model.configId;
                this.grpc = model.grpc;
                this.http2Origin = model.http2Origin;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.smartRouting = model.smartRouting;
                this.uploadMaxFilesize = model.uploadMaxFilesize;
                this.websocket = model.websocket;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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
        private String sequence;

        private OriginRules(Builder builder) {
            this.configId = builder.configId;
            this.dnsRecord = builder.dnsRecord;
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
        public String getSequence() {
            return this.sequence;
        }

        public static final class Builder {
            private Long configId; 
            private String dnsRecord; 
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
            private String sequence; 

            private Builder() {
            } 

            private Builder(OriginRules model) {
                this.configId = model.configId;
                this.dnsRecord = model.dnsRecord;
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
            } 

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
             * OriginMtls.
             */
            public Builder originMtls(String originMtls) {
                this.originMtls = originMtls;
                return this;
            }

            /**
             * OriginReadTimeout.
             */
            public Builder originReadTimeout(String originReadTimeout) {
                this.originReadTimeout = originReadTimeout;
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
             * OriginVerify.
             */
            public Builder originVerify(String originVerify) {
                this.originVerify = originVerify;
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
             * RangeChunkSize.
             */
            public Builder rangeChunkSize(String rangeChunkSize) {
                this.rangeChunkSize = rangeChunkSize;
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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RedirectRules model) {
                this.configId = model.configId;
                this.reserveQueryString = model.reserveQueryString;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.statusCode = model.statusCode;
                this.targetUrl = model.targetUrl;
                this.type = model.type;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RewriteUrlRules model) {
                this.configId = model.configId;
                this.queryString = model.queryString;
                this.rewriteQueryStringType = model.rewriteQueryStringType;
                this.rewriteUriType = model.rewriteUriType;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.uri = model.uri;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SeoBypass model) {
                this.configId = model.configId;
                this.enable = model.enable;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SiteNameExclusive model) {
                this.configId = model.configId;
                this.enable = model.enable;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SitePause model) {
                this.configId = model.configId;
                this.paused = model.paused;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TieredCache model) {
                this.cacheArchitectureMode = model.cacheArchitectureMode;
                this.configId = model.configId;
                this.sequence = model.sequence;
            } 

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
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class VideoProcessing extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("FlvSeekEnd")
        private String flvSeekEnd;

        @com.aliyun.core.annotation.NameInMap("FlvSeekStart")
        private String flvSeekStart;

        @com.aliyun.core.annotation.NameInMap("FlvVideoSeekMode")
        private String flvVideoSeekMode;

        @com.aliyun.core.annotation.NameInMap("Mp4SeekEnd")
        private String mp4SeekEnd;

        @com.aliyun.core.annotation.NameInMap("Mp4SeekStart")
        private String mp4SeekStart;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private String sequence;

        @com.aliyun.core.annotation.NameInMap("VideoSeekEnable")
        private String videoSeekEnable;

        private VideoProcessing(Builder builder) {
            this.configId = builder.configId;
            this.flvSeekEnd = builder.flvSeekEnd;
            this.flvSeekStart = builder.flvSeekStart;
            this.flvVideoSeekMode = builder.flvVideoSeekMode;
            this.mp4SeekEnd = builder.mp4SeekEnd;
            this.mp4SeekStart = builder.mp4SeekStart;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.videoSeekEnable = builder.videoSeekEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoProcessing create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return flvSeekEnd
         */
        public String getFlvSeekEnd() {
            return this.flvSeekEnd;
        }

        /**
         * @return flvSeekStart
         */
        public String getFlvSeekStart() {
            return this.flvSeekStart;
        }

        /**
         * @return flvVideoSeekMode
         */
        public String getFlvVideoSeekMode() {
            return this.flvVideoSeekMode;
        }

        /**
         * @return mp4SeekEnd
         */
        public String getMp4SeekEnd() {
            return this.mp4SeekEnd;
        }

        /**
         * @return mp4SeekStart
         */
        public String getMp4SeekStart() {
            return this.mp4SeekStart;
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
         * @return videoSeekEnable
         */
        public String getVideoSeekEnable() {
            return this.videoSeekEnable;
        }

        public static final class Builder {
            private Long configId; 
            private String flvSeekEnd; 
            private String flvSeekStart; 
            private String flvVideoSeekMode; 
            private String mp4SeekEnd; 
            private String mp4SeekStart; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String sequence; 
            private String videoSeekEnable; 

            private Builder() {
            } 

            private Builder(VideoProcessing model) {
                this.configId = model.configId;
                this.flvSeekEnd = model.flvSeekEnd;
                this.flvSeekStart = model.flvSeekStart;
                this.flvVideoSeekMode = model.flvVideoSeekMode;
                this.mp4SeekEnd = model.mp4SeekEnd;
                this.mp4SeekStart = model.mp4SeekStart;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.videoSeekEnable = model.videoSeekEnable;
            } 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * FlvSeekEnd.
             */
            public Builder flvSeekEnd(String flvSeekEnd) {
                this.flvSeekEnd = flvSeekEnd;
                return this;
            }

            /**
             * FlvSeekStart.
             */
            public Builder flvSeekStart(String flvSeekStart) {
                this.flvSeekStart = flvSeekStart;
                return this;
            }

            /**
             * FlvVideoSeekMode.
             */
            public Builder flvVideoSeekMode(String flvVideoSeekMode) {
                this.flvVideoSeekMode = flvVideoSeekMode;
                return this;
            }

            /**
             * Mp4SeekEnd.
             */
            public Builder mp4SeekEnd(String mp4SeekEnd) {
                this.mp4SeekEnd = mp4SeekEnd;
                return this;
            }

            /**
             * Mp4SeekStart.
             */
            public Builder mp4SeekStart(String mp4SeekStart) {
                this.mp4SeekStart = mp4SeekStart;
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
             * VideoSeekEnable.
             */
            public Builder videoSeekEnable(String videoSeekEnable) {
                this.videoSeekEnable = videoSeekEnable;
                return this;
            }

            public VideoProcessing build() {
                return new VideoProcessing(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSiteFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSiteFunctionsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheReserve")
        private java.util.List<CacheReserve> cacheReserve;

        @com.aliyun.core.annotation.NameInMap("CacheRules")
        private java.util.List<CacheRules> cacheRules;

        @com.aliyun.core.annotation.NameInMap("CacheTags")
        private java.util.List<CacheTags> cacheTags;

        @com.aliyun.core.annotation.NameInMap("CnameFlattening")
        private java.util.List<CnameFlattening> cnameFlattening;

        @com.aliyun.core.annotation.NameInMap("CompressionRules")
        private java.util.List<CompressionRules> compressionRules;

        @com.aliyun.core.annotation.NameInMap("CrossBorderOptimization")
        private java.util.List<CrossBorderOptimization> crossBorderOptimization;

        @com.aliyun.core.annotation.NameInMap("CustomResponseCode")
        private java.util.List<CustomResponseCode> customResponseCode;

        @com.aliyun.core.annotation.NameInMap("DevelopmentMode")
        private java.util.List<DevelopmentMode> developmentMode;

        @com.aliyun.core.annotation.NameInMap("ErrorPagesRedirects")
        private java.util.List<ErrorPagesRedirects> errorPagesRedirects;

        @com.aliyun.core.annotation.NameInMap("HttpIncomingRequestHeaderModificationRules")
        private java.util.List<HttpIncomingRequestHeaderModificationRules> httpIncomingRequestHeaderModificationRules;

        @com.aliyun.core.annotation.NameInMap("HttpIncomingResponseHeaderModificationRules")
        private java.util.List<HttpIncomingResponseHeaderModificationRules> httpIncomingResponseHeaderModificationRules;

        @com.aliyun.core.annotation.NameInMap("HttpRequestHeaderModificationRules")
        private java.util.List<HttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

        @com.aliyun.core.annotation.NameInMap("HttpResponseHeaderModificationRules")
        private java.util.List<HttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

        @com.aliyun.core.annotation.NameInMap("HttpsApplicationConfiguration")
        private java.util.List<HttpsApplicationConfiguration> httpsApplicationConfiguration;

        @com.aliyun.core.annotation.NameInMap("HttpsBasicConfiguration")
        private java.util.List<HttpsBasicConfiguration> httpsBasicConfiguration;

        @com.aliyun.core.annotation.NameInMap("ImageTransform")
        private java.util.List<ImageTransform> imageTransform;

        @com.aliyun.core.annotation.NameInMap("Ipv6")
        private java.util.List<Ipv6> ipv6;

        @com.aliyun.core.annotation.NameInMap("ManagedTransforms")
        private java.util.List<ManagedTransforms> managedTransforms;

        @com.aliyun.core.annotation.NameInMap("MarkdownForAgent")
        private java.util.List<MarkdownForAgent> markdownForAgent;

        @com.aliyun.core.annotation.NameInMap("NetworkOptimization")
        private java.util.List<NetworkOptimization> networkOptimization;

        @com.aliyun.core.annotation.NameInMap("OriginRules")
        private java.util.List<OriginRules> originRules;

        @com.aliyun.core.annotation.NameInMap("RedirectRules")
        private java.util.List<RedirectRules> redirectRules;

        @com.aliyun.core.annotation.NameInMap("RewriteUrlRules")
        private java.util.List<RewriteUrlRules> rewriteUrlRules;

        @com.aliyun.core.annotation.NameInMap("SeoBypass")
        private java.util.List<SeoBypass> seoBypass;

        @com.aliyun.core.annotation.NameInMap("SiteNameExclusive")
        private java.util.List<SiteNameExclusive> siteNameExclusive;

        @com.aliyun.core.annotation.NameInMap("SitePause")
        private java.util.List<SitePause> sitePause;

        @com.aliyun.core.annotation.NameInMap("TieredCache")
        private java.util.List<TieredCache> tieredCache;

        @com.aliyun.core.annotation.NameInMap("VideoProcessing")
        private java.util.List<VideoProcessing> videoProcessing;

        private Configs(Builder builder) {
            this.cacheReserve = builder.cacheReserve;
            this.cacheRules = builder.cacheRules;
            this.cacheTags = builder.cacheTags;
            this.cnameFlattening = builder.cnameFlattening;
            this.compressionRules = builder.compressionRules;
            this.crossBorderOptimization = builder.crossBorderOptimization;
            this.customResponseCode = builder.customResponseCode;
            this.developmentMode = builder.developmentMode;
            this.errorPagesRedirects = builder.errorPagesRedirects;
            this.httpIncomingRequestHeaderModificationRules = builder.httpIncomingRequestHeaderModificationRules;
            this.httpIncomingResponseHeaderModificationRules = builder.httpIncomingResponseHeaderModificationRules;
            this.httpRequestHeaderModificationRules = builder.httpRequestHeaderModificationRules;
            this.httpResponseHeaderModificationRules = builder.httpResponseHeaderModificationRules;
            this.httpsApplicationConfiguration = builder.httpsApplicationConfiguration;
            this.httpsBasicConfiguration = builder.httpsBasicConfiguration;
            this.imageTransform = builder.imageTransform;
            this.ipv6 = builder.ipv6;
            this.managedTransforms = builder.managedTransforms;
            this.markdownForAgent = builder.markdownForAgent;
            this.networkOptimization = builder.networkOptimization;
            this.originRules = builder.originRules;
            this.redirectRules = builder.redirectRules;
            this.rewriteUrlRules = builder.rewriteUrlRules;
            this.seoBypass = builder.seoBypass;
            this.siteNameExclusive = builder.siteNameExclusive;
            this.sitePause = builder.sitePause;
            this.tieredCache = builder.tieredCache;
            this.videoProcessing = builder.videoProcessing;
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
        public java.util.List<CacheReserve> getCacheReserve() {
            return this.cacheReserve;
        }

        /**
         * @return cacheRules
         */
        public java.util.List<CacheRules> getCacheRules() {
            return this.cacheRules;
        }

        /**
         * @return cacheTags
         */
        public java.util.List<CacheTags> getCacheTags() {
            return this.cacheTags;
        }

        /**
         * @return cnameFlattening
         */
        public java.util.List<CnameFlattening> getCnameFlattening() {
            return this.cnameFlattening;
        }

        /**
         * @return compressionRules
         */
        public java.util.List<CompressionRules> getCompressionRules() {
            return this.compressionRules;
        }

        /**
         * @return crossBorderOptimization
         */
        public java.util.List<CrossBorderOptimization> getCrossBorderOptimization() {
            return this.crossBorderOptimization;
        }

        /**
         * @return customResponseCode
         */
        public java.util.List<CustomResponseCode> getCustomResponseCode() {
            return this.customResponseCode;
        }

        /**
         * @return developmentMode
         */
        public java.util.List<DevelopmentMode> getDevelopmentMode() {
            return this.developmentMode;
        }

        /**
         * @return errorPagesRedirects
         */
        public java.util.List<ErrorPagesRedirects> getErrorPagesRedirects() {
            return this.errorPagesRedirects;
        }

        /**
         * @return httpIncomingRequestHeaderModificationRules
         */
        public java.util.List<HttpIncomingRequestHeaderModificationRules> getHttpIncomingRequestHeaderModificationRules() {
            return this.httpIncomingRequestHeaderModificationRules;
        }

        /**
         * @return httpIncomingResponseHeaderModificationRules
         */
        public java.util.List<HttpIncomingResponseHeaderModificationRules> getHttpIncomingResponseHeaderModificationRules() {
            return this.httpIncomingResponseHeaderModificationRules;
        }

        /**
         * @return httpRequestHeaderModificationRules
         */
        public java.util.List<HttpRequestHeaderModificationRules> getHttpRequestHeaderModificationRules() {
            return this.httpRequestHeaderModificationRules;
        }

        /**
         * @return httpResponseHeaderModificationRules
         */
        public java.util.List<HttpResponseHeaderModificationRules> getHttpResponseHeaderModificationRules() {
            return this.httpResponseHeaderModificationRules;
        }

        /**
         * @return httpsApplicationConfiguration
         */
        public java.util.List<HttpsApplicationConfiguration> getHttpsApplicationConfiguration() {
            return this.httpsApplicationConfiguration;
        }

        /**
         * @return httpsBasicConfiguration
         */
        public java.util.List<HttpsBasicConfiguration> getHttpsBasicConfiguration() {
            return this.httpsBasicConfiguration;
        }

        /**
         * @return imageTransform
         */
        public java.util.List<ImageTransform> getImageTransform() {
            return this.imageTransform;
        }

        /**
         * @return ipv6
         */
        public java.util.List<Ipv6> getIpv6() {
            return this.ipv6;
        }

        /**
         * @return managedTransforms
         */
        public java.util.List<ManagedTransforms> getManagedTransforms() {
            return this.managedTransforms;
        }

        /**
         * @return markdownForAgent
         */
        public java.util.List<MarkdownForAgent> getMarkdownForAgent() {
            return this.markdownForAgent;
        }

        /**
         * @return networkOptimization
         */
        public java.util.List<NetworkOptimization> getNetworkOptimization() {
            return this.networkOptimization;
        }

        /**
         * @return originRules
         */
        public java.util.List<OriginRules> getOriginRules() {
            return this.originRules;
        }

        /**
         * @return redirectRules
         */
        public java.util.List<RedirectRules> getRedirectRules() {
            return this.redirectRules;
        }

        /**
         * @return rewriteUrlRules
         */
        public java.util.List<RewriteUrlRules> getRewriteUrlRules() {
            return this.rewriteUrlRules;
        }

        /**
         * @return seoBypass
         */
        public java.util.List<SeoBypass> getSeoBypass() {
            return this.seoBypass;
        }

        /**
         * @return siteNameExclusive
         */
        public java.util.List<SiteNameExclusive> getSiteNameExclusive() {
            return this.siteNameExclusive;
        }

        /**
         * @return sitePause
         */
        public java.util.List<SitePause> getSitePause() {
            return this.sitePause;
        }

        /**
         * @return tieredCache
         */
        public java.util.List<TieredCache> getTieredCache() {
            return this.tieredCache;
        }

        /**
         * @return videoProcessing
         */
        public java.util.List<VideoProcessing> getVideoProcessing() {
            return this.videoProcessing;
        }

        public static final class Builder {
            private java.util.List<CacheReserve> cacheReserve; 
            private java.util.List<CacheRules> cacheRules; 
            private java.util.List<CacheTags> cacheTags; 
            private java.util.List<CnameFlattening> cnameFlattening; 
            private java.util.List<CompressionRules> compressionRules; 
            private java.util.List<CrossBorderOptimization> crossBorderOptimization; 
            private java.util.List<CustomResponseCode> customResponseCode; 
            private java.util.List<DevelopmentMode> developmentMode; 
            private java.util.List<ErrorPagesRedirects> errorPagesRedirects; 
            private java.util.List<HttpIncomingRequestHeaderModificationRules> httpIncomingRequestHeaderModificationRules; 
            private java.util.List<HttpIncomingResponseHeaderModificationRules> httpIncomingResponseHeaderModificationRules; 
            private java.util.List<HttpRequestHeaderModificationRules> httpRequestHeaderModificationRules; 
            private java.util.List<HttpResponseHeaderModificationRules> httpResponseHeaderModificationRules; 
            private java.util.List<HttpsApplicationConfiguration> httpsApplicationConfiguration; 
            private java.util.List<HttpsBasicConfiguration> httpsBasicConfiguration; 
            private java.util.List<ImageTransform> imageTransform; 
            private java.util.List<Ipv6> ipv6; 
            private java.util.List<ManagedTransforms> managedTransforms; 
            private java.util.List<MarkdownForAgent> markdownForAgent; 
            private java.util.List<NetworkOptimization> networkOptimization; 
            private java.util.List<OriginRules> originRules; 
            private java.util.List<RedirectRules> redirectRules; 
            private java.util.List<RewriteUrlRules> rewriteUrlRules; 
            private java.util.List<SeoBypass> seoBypass; 
            private java.util.List<SiteNameExclusive> siteNameExclusive; 
            private java.util.List<SitePause> sitePause; 
            private java.util.List<TieredCache> tieredCache; 
            private java.util.List<VideoProcessing> videoProcessing; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.cacheReserve = model.cacheReserve;
                this.cacheRules = model.cacheRules;
                this.cacheTags = model.cacheTags;
                this.cnameFlattening = model.cnameFlattening;
                this.compressionRules = model.compressionRules;
                this.crossBorderOptimization = model.crossBorderOptimization;
                this.customResponseCode = model.customResponseCode;
                this.developmentMode = model.developmentMode;
                this.errorPagesRedirects = model.errorPagesRedirects;
                this.httpIncomingRequestHeaderModificationRules = model.httpIncomingRequestHeaderModificationRules;
                this.httpIncomingResponseHeaderModificationRules = model.httpIncomingResponseHeaderModificationRules;
                this.httpRequestHeaderModificationRules = model.httpRequestHeaderModificationRules;
                this.httpResponseHeaderModificationRules = model.httpResponseHeaderModificationRules;
                this.httpsApplicationConfiguration = model.httpsApplicationConfiguration;
                this.httpsBasicConfiguration = model.httpsBasicConfiguration;
                this.imageTransform = model.imageTransform;
                this.ipv6 = model.ipv6;
                this.managedTransforms = model.managedTransforms;
                this.markdownForAgent = model.markdownForAgent;
                this.networkOptimization = model.networkOptimization;
                this.originRules = model.originRules;
                this.redirectRules = model.redirectRules;
                this.rewriteUrlRules = model.rewriteUrlRules;
                this.seoBypass = model.seoBypass;
                this.siteNameExclusive = model.siteNameExclusive;
                this.sitePause = model.sitePause;
                this.tieredCache = model.tieredCache;
                this.videoProcessing = model.videoProcessing;
            } 

            /**
             * CacheReserve.
             */
            public Builder cacheReserve(java.util.List<CacheReserve> cacheReserve) {
                this.cacheReserve = cacheReserve;
                return this;
            }

            /**
             * CacheRules.
             */
            public Builder cacheRules(java.util.List<CacheRules> cacheRules) {
                this.cacheRules = cacheRules;
                return this;
            }

            /**
             * CacheTags.
             */
            public Builder cacheTags(java.util.List<CacheTags> cacheTags) {
                this.cacheTags = cacheTags;
                return this;
            }

            /**
             * CnameFlattening.
             */
            public Builder cnameFlattening(java.util.List<CnameFlattening> cnameFlattening) {
                this.cnameFlattening = cnameFlattening;
                return this;
            }

            /**
             * CompressionRules.
             */
            public Builder compressionRules(java.util.List<CompressionRules> compressionRules) {
                this.compressionRules = compressionRules;
                return this;
            }

            /**
             * CrossBorderOptimization.
             */
            public Builder crossBorderOptimization(java.util.List<CrossBorderOptimization> crossBorderOptimization) {
                this.crossBorderOptimization = crossBorderOptimization;
                return this;
            }

            /**
             * CustomResponseCode.
             */
            public Builder customResponseCode(java.util.List<CustomResponseCode> customResponseCode) {
                this.customResponseCode = customResponseCode;
                return this;
            }

            /**
             * DevelopmentMode.
             */
            public Builder developmentMode(java.util.List<DevelopmentMode> developmentMode) {
                this.developmentMode = developmentMode;
                return this;
            }

            /**
             * ErrorPagesRedirects.
             */
            public Builder errorPagesRedirects(java.util.List<ErrorPagesRedirects> errorPagesRedirects) {
                this.errorPagesRedirects = errorPagesRedirects;
                return this;
            }

            /**
             * HttpIncomingRequestHeaderModificationRules.
             */
            public Builder httpIncomingRequestHeaderModificationRules(java.util.List<HttpIncomingRequestHeaderModificationRules> httpIncomingRequestHeaderModificationRules) {
                this.httpIncomingRequestHeaderModificationRules = httpIncomingRequestHeaderModificationRules;
                return this;
            }

            /**
             * HttpIncomingResponseHeaderModificationRules.
             */
            public Builder httpIncomingResponseHeaderModificationRules(java.util.List<HttpIncomingResponseHeaderModificationRules> httpIncomingResponseHeaderModificationRules) {
                this.httpIncomingResponseHeaderModificationRules = httpIncomingResponseHeaderModificationRules;
                return this;
            }

            /**
             * HttpRequestHeaderModificationRules.
             */
            public Builder httpRequestHeaderModificationRules(java.util.List<HttpRequestHeaderModificationRules> httpRequestHeaderModificationRules) {
                this.httpRequestHeaderModificationRules = httpRequestHeaderModificationRules;
                return this;
            }

            /**
             * HttpResponseHeaderModificationRules.
             */
            public Builder httpResponseHeaderModificationRules(java.util.List<HttpResponseHeaderModificationRules> httpResponseHeaderModificationRules) {
                this.httpResponseHeaderModificationRules = httpResponseHeaderModificationRules;
                return this;
            }

            /**
             * HttpsApplicationConfiguration.
             */
            public Builder httpsApplicationConfiguration(java.util.List<HttpsApplicationConfiguration> httpsApplicationConfiguration) {
                this.httpsApplicationConfiguration = httpsApplicationConfiguration;
                return this;
            }

            /**
             * HttpsBasicConfiguration.
             */
            public Builder httpsBasicConfiguration(java.util.List<HttpsBasicConfiguration> httpsBasicConfiguration) {
                this.httpsBasicConfiguration = httpsBasicConfiguration;
                return this;
            }

            /**
             * ImageTransform.
             */
            public Builder imageTransform(java.util.List<ImageTransform> imageTransform) {
                this.imageTransform = imageTransform;
                return this;
            }

            /**
             * Ipv6.
             */
            public Builder ipv6(java.util.List<Ipv6> ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            /**
             * ManagedTransforms.
             */
            public Builder managedTransforms(java.util.List<ManagedTransforms> managedTransforms) {
                this.managedTransforms = managedTransforms;
                return this;
            }

            /**
             * MarkdownForAgent.
             */
            public Builder markdownForAgent(java.util.List<MarkdownForAgent> markdownForAgent) {
                this.markdownForAgent = markdownForAgent;
                return this;
            }

            /**
             * NetworkOptimization.
             */
            public Builder networkOptimization(java.util.List<NetworkOptimization> networkOptimization) {
                this.networkOptimization = networkOptimization;
                return this;
            }

            /**
             * OriginRules.
             */
            public Builder originRules(java.util.List<OriginRules> originRules) {
                this.originRules = originRules;
                return this;
            }

            /**
             * RedirectRules.
             */
            public Builder redirectRules(java.util.List<RedirectRules> redirectRules) {
                this.redirectRules = redirectRules;
                return this;
            }

            /**
             * RewriteUrlRules.
             */
            public Builder rewriteUrlRules(java.util.List<RewriteUrlRules> rewriteUrlRules) {
                this.rewriteUrlRules = rewriteUrlRules;
                return this;
            }

            /**
             * SeoBypass.
             */
            public Builder seoBypass(java.util.List<SeoBypass> seoBypass) {
                this.seoBypass = seoBypass;
                return this;
            }

            /**
             * SiteNameExclusive.
             */
            public Builder siteNameExclusive(java.util.List<SiteNameExclusive> siteNameExclusive) {
                this.siteNameExclusive = siteNameExclusive;
                return this;
            }

            /**
             * SitePause.
             */
            public Builder sitePause(java.util.List<SitePause> sitePause) {
                this.sitePause = sitePause;
                return this;
            }

            /**
             * TieredCache.
             */
            public Builder tieredCache(java.util.List<TieredCache> tieredCache) {
                this.tieredCache = tieredCache;
                return this;
            }

            /**
             * VideoProcessing.
             */
            public Builder videoProcessing(java.util.List<VideoProcessing> videoProcessing) {
                this.videoProcessing = videoProcessing;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
