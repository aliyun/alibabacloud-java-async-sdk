// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSiteFunctionRequest} extends {@link RequestModel}
 *
 * <p>CreateSiteFunctionRequest</p>
 */
public class CreateSiteFunctionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheReserve")
    private java.util.List < CacheReserve> cacheReserve;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheRules")
    private java.util.List < CacheRules> cacheRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheTags")
    private java.util.List < CacheTags> cacheTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CnameFlattening")
    private java.util.List < CnameFlattening> cnameFlattening;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressionRules")
    private java.util.List < CompressionRules> compressionRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossBorderOptimization")
    private java.util.List < CrossBorderOptimization> crossBorderOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevelopmentMode")
    private java.util.List < DevelopmentMode> developmentMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpRequestHeaderModificationRules")
    private java.util.List < HttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpResponseHeaderModificationRules")
    private java.util.List < HttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsApplicationConfiguration")
    private java.util.List < HttpsApplicationConfiguration> httpsApplicationConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsBasicConfiguration")
    private java.util.List < HttpsBasicConfiguration> httpsBasicConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageTransform")
    private java.util.List < ImageTransform> imageTransform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6")
    private java.util.List < Ipv6> ipv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagedTransforms")
    private java.util.List < ManagedTransforms> managedTransforms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkOptimization")
    private java.util.List < NetworkOptimization> networkOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginProtection")
    private java.util.List < OriginProtection> originProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginRules")
    private java.util.List < OriginRules> originRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedirectRules")
    private java.util.List < RedirectRules> redirectRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RewriteUrlRules")
    private java.util.List < RewriteUrlRules> rewriteUrlRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeoBypass")
    private java.util.List < SeoBypass> seoBypass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteNameExclusive")
    private java.util.List < SiteNameExclusive> siteNameExclusive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SitePause")
    private java.util.List < SitePause> sitePause;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TieredCache")
    private java.util.List < TieredCache> tieredCache;

    private CreateSiteFunctionRequest(Builder builder) {
        super(builder);
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
        this.originProtection = builder.originProtection;
        this.originRules = builder.originRules;
        this.redirectRules = builder.redirectRules;
        this.rewriteUrlRules = builder.rewriteUrlRules;
        this.seoBypass = builder.seoBypass;
        this.siteId = builder.siteId;
        this.siteNameExclusive = builder.siteNameExclusive;
        this.sitePause = builder.sitePause;
        this.siteVersion = builder.siteVersion;
        this.tieredCache = builder.tieredCache;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return originProtection
     */
    public java.util.List < OriginProtection> getOriginProtection() {
        return this.originProtection;
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
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
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    /**
     * @return tieredCache
     */
    public java.util.List < TieredCache> getTieredCache() {
        return this.tieredCache;
    }

    public static final class Builder extends Request.Builder<CreateSiteFunctionRequest, Builder> {
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
        private java.util.List < OriginProtection> originProtection; 
        private java.util.List < OriginRules> originRules; 
        private java.util.List < RedirectRules> redirectRules; 
        private java.util.List < RewriteUrlRules> rewriteUrlRules; 
        private java.util.List < SeoBypass> seoBypass; 
        private Long siteId; 
        private java.util.List < SiteNameExclusive> siteNameExclusive; 
        private java.util.List < SitePause> sitePause; 
        private Integer siteVersion; 
        private java.util.List < TieredCache> tieredCache; 

        private Builder() {
            super();
        } 

        private Builder(CreateSiteFunctionRequest request) {
            super(request);
            this.cacheReserve = request.cacheReserve;
            this.cacheRules = request.cacheRules;
            this.cacheTags = request.cacheTags;
            this.cnameFlattening = request.cnameFlattening;
            this.compressionRules = request.compressionRules;
            this.crossBorderOptimization = request.crossBorderOptimization;
            this.developmentMode = request.developmentMode;
            this.httpRequestHeaderModificationRules = request.httpRequestHeaderModificationRules;
            this.httpResponseHeaderModificationRules = request.httpResponseHeaderModificationRules;
            this.httpsApplicationConfiguration = request.httpsApplicationConfiguration;
            this.httpsBasicConfiguration = request.httpsBasicConfiguration;
            this.imageTransform = request.imageTransform;
            this.ipv6 = request.ipv6;
            this.managedTransforms = request.managedTransforms;
            this.networkOptimization = request.networkOptimization;
            this.originProtection = request.originProtection;
            this.originRules = request.originRules;
            this.redirectRules = request.redirectRules;
            this.rewriteUrlRules = request.rewriteUrlRules;
            this.seoBypass = request.seoBypass;
            this.siteId = request.siteId;
            this.siteNameExclusive = request.siteNameExclusive;
            this.sitePause = request.sitePause;
            this.siteVersion = request.siteVersion;
            this.tieredCache = request.tieredCache;
        } 

        /**
         * CacheReserve.
         */
        public Builder cacheReserve(java.util.List < CacheReserve> cacheReserve) {
            String cacheReserveShrink = shrink(cacheReserve, "CacheReserve", "json");
            this.putQueryParameter("CacheReserve", cacheReserveShrink);
            this.cacheReserve = cacheReserve;
            return this;
        }

        /**
         * <p>The cache rules.</p>
         */
        public Builder cacheRules(java.util.List < CacheRules> cacheRules) {
            String cacheRulesShrink = shrink(cacheRules, "CacheRules", "json");
            this.putQueryParameter("CacheRules", cacheRulesShrink);
            this.cacheRules = cacheRules;
            return this;
        }

        /**
         * <p>The cache tags.</p>
         */
        public Builder cacheTags(java.util.List < CacheTags> cacheTags) {
            String cacheTagsShrink = shrink(cacheTags, "CacheTags", "json");
            this.putQueryParameter("CacheTags", cacheTagsShrink);
            this.cacheTags = cacheTags;
            return this;
        }

        /**
         * <p>The configuration of CNAME flattening.</p>
         */
        public Builder cnameFlattening(java.util.List < CnameFlattening> cnameFlattening) {
            String cnameFlatteningShrink = shrink(cnameFlattening, "CnameFlattening", "json");
            this.putQueryParameter("CnameFlattening", cnameFlatteningShrink);
            this.cnameFlattening = cnameFlattening;
            return this;
        }

        /**
         * <p>The configuration of a compression rule.</p>
         */
        public Builder compressionRules(java.util.List < CompressionRules> compressionRules) {
            String compressionRulesShrink = shrink(compressionRules, "CompressionRules", "json");
            this.putQueryParameter("CompressionRules", compressionRulesShrink);
            this.compressionRules = compressionRules;
            return this;
        }

        /**
         * CrossBorderOptimization.
         */
        public Builder crossBorderOptimization(java.util.List < CrossBorderOptimization> crossBorderOptimization) {
            String crossBorderOptimizationShrink = shrink(crossBorderOptimization, "CrossBorderOptimization", "json");
            this.putQueryParameter("CrossBorderOptimization", crossBorderOptimizationShrink);
            this.crossBorderOptimization = crossBorderOptimization;
            return this;
        }

        /**
         * <p>The configuration of development mode.</p>
         */
        public Builder developmentMode(java.util.List < DevelopmentMode> developmentMode) {
            String developmentModeShrink = shrink(developmentMode, "DevelopmentMode", "json");
            this.putQueryParameter("DevelopmentMode", developmentModeShrink);
            this.developmentMode = developmentMode;
            return this;
        }

        /**
         * <p>The configuration of a request header modification rule.</p>
         */
        public Builder httpRequestHeaderModificationRules(java.util.List < HttpRequestHeaderModificationRules> httpRequestHeaderModificationRules) {
            String httpRequestHeaderModificationRulesShrink = shrink(httpRequestHeaderModificationRules, "HttpRequestHeaderModificationRules", "json");
            this.putQueryParameter("HttpRequestHeaderModificationRules", httpRequestHeaderModificationRulesShrink);
            this.httpRequestHeaderModificationRules = httpRequestHeaderModificationRules;
            return this;
        }

        /**
         * <p>The configuration of a response header modification rule.</p>
         */
        public Builder httpResponseHeaderModificationRules(java.util.List < HttpResponseHeaderModificationRules> httpResponseHeaderModificationRules) {
            String httpResponseHeaderModificationRulesShrink = shrink(httpResponseHeaderModificationRules, "HttpResponseHeaderModificationRules", "json");
            this.putQueryParameter("HttpResponseHeaderModificationRules", httpResponseHeaderModificationRulesShrink);
            this.httpResponseHeaderModificationRules = httpResponseHeaderModificationRules;
            return this;
        }

        /**
         * HttpsApplicationConfiguration.
         */
        public Builder httpsApplicationConfiguration(java.util.List < HttpsApplicationConfiguration> httpsApplicationConfiguration) {
            String httpsApplicationConfigurationShrink = shrink(httpsApplicationConfiguration, "HttpsApplicationConfiguration", "json");
            this.putQueryParameter("HttpsApplicationConfiguration", httpsApplicationConfigurationShrink);
            this.httpsApplicationConfiguration = httpsApplicationConfiguration;
            return this;
        }

        /**
         * HttpsBasicConfiguration.
         */
        public Builder httpsBasicConfiguration(java.util.List < HttpsBasicConfiguration> httpsBasicConfiguration) {
            String httpsBasicConfigurationShrink = shrink(httpsBasicConfiguration, "HttpsBasicConfiguration", "json");
            this.putQueryParameter("HttpsBasicConfiguration", httpsBasicConfigurationShrink);
            this.httpsBasicConfiguration = httpsBasicConfiguration;
            return this;
        }

        /**
         * <p>The configuration of image transformations.</p>
         */
        public Builder imageTransform(java.util.List < ImageTransform> imageTransform) {
            String imageTransformShrink = shrink(imageTransform, "ImageTransform", "json");
            this.putQueryParameter("ImageTransform", imageTransformShrink);
            this.imageTransform = imageTransform;
            return this;
        }

        /**
         * <p>The IPv6 configuration.</p>
         */
        public Builder ipv6(java.util.List < Ipv6> ipv6) {
            String ipv6Shrink = shrink(ipv6, "Ipv6", "json");
            this.putQueryParameter("Ipv6", ipv6Shrink);
            this.ipv6 = ipv6;
            return this;
        }

        /**
         * <p>The configuration of managed transforms.</p>
         */
        public Builder managedTransforms(java.util.List < ManagedTransforms> managedTransforms) {
            String managedTransformsShrink = shrink(managedTransforms, "ManagedTransforms", "json");
            this.putQueryParameter("ManagedTransforms", managedTransformsShrink);
            this.managedTransforms = managedTransforms;
            return this;
        }

        /**
         * NetworkOptimization.
         */
        public Builder networkOptimization(java.util.List < NetworkOptimization> networkOptimization) {
            String networkOptimizationShrink = shrink(networkOptimization, "NetworkOptimization", "json");
            this.putQueryParameter("NetworkOptimization", networkOptimizationShrink);
            this.networkOptimization = networkOptimization;
            return this;
        }

        /**
         * <p>The configuration of origin protection.</p>
         */
        public Builder originProtection(java.util.List < OriginProtection> originProtection) {
            String originProtectionShrink = shrink(originProtection, "OriginProtection", "json");
            this.putQueryParameter("OriginProtection", originProtectionShrink);
            this.originProtection = originProtection;
            return this;
        }

        /**
         * <p>The configuration of an origin rule.</p>
         */
        public Builder originRules(java.util.List < OriginRules> originRules) {
            String originRulesShrink = shrink(originRules, "OriginRules", "json");
            this.putQueryParameter("OriginRules", originRulesShrink);
            this.originRules = originRules;
            return this;
        }

        /**
         * <p>The configuration of a redirect rule.</p>
         */
        public Builder redirectRules(java.util.List < RedirectRules> redirectRules) {
            String redirectRulesShrink = shrink(redirectRules, "RedirectRules", "json");
            this.putQueryParameter("RedirectRules", redirectRulesShrink);
            this.redirectRules = redirectRules;
            return this;
        }

        /**
         * <p>The configuration of a URL rewrite rule.</p>
         */
        public Builder rewriteUrlRules(java.util.List < RewriteUrlRules> rewriteUrlRules) {
            String rewriteUrlRulesShrink = shrink(rewriteUrlRules, "RewriteUrlRules", "json");
            this.putQueryParameter("RewriteUrlRules", rewriteUrlRulesShrink);
            this.rewriteUrlRules = rewriteUrlRules;
            return this;
        }

        /**
         * <p>The configuration of SEO crawler bypassing.</p>
         */
        public Builder seoBypass(java.util.List < SeoBypass> seoBypass) {
            String seoBypassShrink = shrink(seoBypass, "SeoBypass", "json");
            this.putQueryParameter("SeoBypass", seoBypassShrink);
            this.seoBypass = seoBypass;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateSiteFunction</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The configuration of site hold. After this feature is enabled, other accounts cannot add your website domain or its subdomains to ESA.</p>
         */
        public Builder siteNameExclusive(java.util.List < SiteNameExclusive> siteNameExclusive) {
            String siteNameExclusiveShrink = shrink(siteNameExclusive, "SiteNameExclusive", "json");
            this.putQueryParameter("SiteNameExclusive", siteNameExclusiveShrink);
            this.siteNameExclusive = siteNameExclusive;
            return this;
        }

        /**
         * <p>The configuration of temporarily pausing ESA proxy on the website. If you pause ESA proxy, all requests to the domains in your DNS records go directly to your origin server.</p>
         */
        public Builder sitePause(java.util.List < SitePause> sitePause) {
            String sitePauseShrink = shrink(sitePause, "SitePause", "json");
            this.putQueryParameter("SitePause", sitePauseShrink);
            this.sitePause = sitePause;
            return this;
        }

        /**
         * <p>The version number of the website. You can use this parameter to specify a version of your website to apply the new feature settings. By default, version 0 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * TieredCache.
         */
        public Builder tieredCache(java.util.List < TieredCache> tieredCache) {
            String tieredCacheShrink = shrink(tieredCache, "TieredCache", "json");
            this.putQueryParameter("TieredCache", tieredCacheShrink);
            this.tieredCache = tieredCache;
            return this;
        }

        @Override
        public CreateSiteFunctionRequest build() {
            return new CreateSiteFunctionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class CacheReserve extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private CacheReserve(Builder builder) {
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
            private String enable; 
            private String instanceId; 

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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
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
             * <p>The browser cache configuration. Valid values:</p>
             * <ul>
             * <li>no_cache: does not cache resources.</li>
             * <li>follow_origin: follows the origin&quot;s cache rule.</li>
             * <li>override_origin: uses a custom cache rule instead of the origin&quot;s.</li>
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
             * <p>The browser cache TTL. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder browserCacheTtl(String browserCacheTtl) {
                this.browserCacheTtl = browserCacheTtl;
                return this;
            }

            /**
             * <p>The configuration of bypass cache. Valid values:</p>
             * <ul>
             * <li>cache_all: Responses of all requests are cached.</li>
             * <li>default_cache (default): Resources are cached only based on supported file extensions.</li>
             * <li>bypass_all: All requests bypass the cache component.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default_cache</p>
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
             * <p>The edge cache configuration. Valid values:</p>
             * <ul>
             * <li>follow_origin: follows the origin&quot;s cache rule. If the origin does not have a cache rule, the default cache rule is used.</li>
             * <li>no-cache: does not cache resources.</li>
             * <li>override_origin: uses a custom cache rule instead of the origin&quot;s.</li>
             * <li>follow_origin_bypass: follows the origin&quot;s cache rule. If the origin does not have a cache rule, no resources are cached.</li>
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
             * <p>The edge cache TTL. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder edgeCacheTtl(String edgeCacheTtl) {
                this.edgeCacheTtl = edgeCacheTtl;
                return this;
            }

            /**
             * <p>The status code TTL. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder edgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
                this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
                return this;
            }

            /**
             * <p>The cookie names and values included in the cache key. Separate multiple combinations with spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>cookie_exapmle</p>
             */
            public Builder includeCookie(String includeCookie) {
                this.includeCookie = includeCookie;
                return this;
            }

            /**
             * <p>The header names and values included in the cache key. Separate multiple combinations with spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder includeHeader(String includeHeader) {
                this.includeHeader = includeHeader;
                return this;
            }

            /**
             * <p>The parameters to be retained or ignored in the query string. Separate multiple values with spaces.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder queryString(String queryString) {
                this.queryString = queryString;
                return this;
            }

            /**
             * <p>Specifies how to process the query string when cache keys are generated. Valid values:</p>
             * <ul>
             * <li>ignore_all: ignores the entire query string.</li>
             * <li>exclude_query_string: ignores specified parameters in the query string.</li>
             * <li>reserve_all (default): retains the entire query string.</li>
             * <li>include_query_string: retains specified parameters in the query string.</li>
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
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
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
             * <p>Specifies whether to sort query strings. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class CacheTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaseInsensitive")
        private String caseInsensitive;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private CacheTags(Builder builder) {
            this.caseInsensitive = builder.caseInsensitive;
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
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String caseInsensitive; 
            private String tagName; 

            /**
             * <p>Specifies whether the matching is not case-sensitive. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder caseInsensitive(String caseInsensitive) {
                this.caseInsensitive = caseInsensitive;
                return this;
            }

            /**
             * <p>The name of the custom cache tag.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class CnameFlattening extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlattenMode")
        private String flattenMode;

        private CnameFlattening(Builder builder) {
            this.flattenMode = builder.flattenMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CnameFlattening create() {
            return builder().build();
        }

        /**
         * @return flattenMode
         */
        public String getFlattenMode() {
            return this.flattenMode;
        }

        public static final class Builder {
            private String flattenMode; 

            /**
             * <p>The CNAME flattening mode. Valid values:</p>
             * <ul>
             * <li>flatten_all: flattens all CNAMEs.</li>
             * <li>flatten_all (default): flattens only the root domain.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder flattenMode(String flattenMode) {
                this.flattenMode = flattenMode;
                return this;
            }

            public CnameFlattening build() {
                return new CnameFlattening(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class CompressionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Brotli")
        private String brotli;

        @com.aliyun.core.annotation.NameInMap("Gzip")
        private String gzip;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private CompressionRules(Builder builder) {
            this.brotli = builder.brotli;
            this.gzip = builder.gzip;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
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

        public static final class Builder {
            private String brotli; 
            private String gzip; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 

            /**
             * <p>Specifies whether to enable Brotli compression. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder brotli(String brotli) {
                this.brotli = brotli;
                return this;
            }

            /**
             * <p>Specifies whether to enable Gzip compression. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder gzip(String gzip) {
                this.gzip = gzip;
                return this;
            }

            /**
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public CompressionRules build() {
                return new CompressionRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class CrossBorderOptimization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private CrossBorderOptimization(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossBorderOptimization create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String enable; 

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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class DevelopmentMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private DevelopmentMode(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevelopmentMode create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String enable; 

            /**
             * <p>Specifies whether to enable the development mode. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            public DevelopmentMode build() {
                return new DevelopmentMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class HttpRequestHeaderModificationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestHeaderModification")
        private java.util.List < RequestHeaderModification> requestHeaderModification;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private HttpRequestHeaderModificationRules(Builder builder) {
            this.requestHeaderModification = builder.requestHeaderModification;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpRequestHeaderModificationRules create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.List < RequestHeaderModification> requestHeaderModification; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 

            /**
             * <p>Modifies a request header. You can add, delete, or modify a response header.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;operation&quot;:&quot;add&quot;,&quot;name&quot;:&quot;header_example_add&quot;,&quot;value&quot;:&quot;value_exapme_add&quot;},{&quot;operation&quot;:&quot;del&quot;,&quot;name&quot;:&quot;header_example_delete&quot;,&quot;value&quot;:&quot;value_exapme_delete&quot;},{&quot;operation&quot;:&quot;modify&quot;,&quot;name&quot;:&quot;header_example_update&quot;,&quot;value&quot;:&quot;value_exapme_example&quot;}]</p>
             */
            public Builder requestHeaderModification(java.util.List < RequestHeaderModification> requestHeaderModification) {
                this.requestHeaderModification = requestHeaderModification;
                return this;
            }

            /**
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public HttpRequestHeaderModificationRules build() {
                return new HttpRequestHeaderModificationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class HttpResponseHeaderModificationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResponseHeaderModification")
        private java.util.List < ResponseHeaderModification> responseHeaderModification;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private HttpResponseHeaderModificationRules(Builder builder) {
            this.responseHeaderModification = builder.responseHeaderModification;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpResponseHeaderModificationRules create() {
            return builder().build();
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

        public static final class Builder {
            private java.util.List < ResponseHeaderModification> responseHeaderModification; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 

            /**
             * <p>Modifies a response header. You can add, delete, or modify a request header.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;operation&quot;:&quot;add&quot;,&quot;name&quot;:&quot;header_example_add&quot;,&quot;value&quot;:&quot;value_exapme_add&quot;},{&quot;operation&quot;:&quot;del&quot;,&quot;name&quot;:&quot;header_example_delete&quot;,&quot;value&quot;:&quot;value_exapme_delete&quot;},{&quot;operation&quot;:&quot;modify&quot;,&quot;name&quot;:&quot;header_example_update&quot;,&quot;value&quot;:&quot;value_exapme_example&quot;}]</p>
             */
            public Builder responseHeaderModification(java.util.List < ResponseHeaderModification> responseHeaderModification) {
                this.responseHeaderModification = responseHeaderModification;
                return this;
            }

            /**
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public HttpResponseHeaderModificationRules build() {
                return new HttpResponseHeaderModificationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
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

        private HttpsApplicationConfiguration(Builder builder) {
            this.altSvc = builder.altSvc;
            this.altSvcClear = builder.altSvcClear;
            this.altSvcMa = builder.altSvcMa;
            this.altSvcPersist = builder.altSvcPersist;
            this.hsts = builder.hsts;
            this.hstsIncludeSubdomains = builder.hstsIncludeSubdomains;
            this.hstsMaxAge = builder.hstsMaxAge;
            this.hstsPreload = builder.hstsPreload;
            this.httpsForce = builder.httpsForce;
            this.httpsForceCode = builder.httpsForceCode;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
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

        public static final class Builder {
            private String altSvc; 
            private String altSvcClear; 
            private String altSvcMa; 
            private String altSvcPersist; 
            private String hsts; 
            private String hstsIncludeSubdomains; 
            private String hstsMaxAge; 
            private String hstsPreload; 
            private String httpsForce; 
            private String httpsForceCode; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 

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
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public HttpsApplicationConfiguration build() {
                return new HttpsApplicationConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class HttpsBasicConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphersuite")
        private String ciphersuite;

        @com.aliyun.core.annotation.NameInMap("CiphersuiteGroup")
        private String ciphersuiteGroup;

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
            this.http2 = builder.http2;
            this.http3 = builder.http3;
            this.https = builder.https;
            this.ocspStapling = builder.ocspStapling;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
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
            private String http2; 
            private String http3; 
            private String https; 
            private String ocspStapling; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
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
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class ImageTransform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private ImageTransform(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTransform create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String enable; 

            /**
             * <p>Specifies whether to enable image transformations. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            public ImageTransform build() {
                return new ImageTransform(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class Ipv6 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private Ipv6(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6 create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String enable; 

            /**
             * <p>Specifies whether to enable IPv6. Valid values:</p>
             * <ul>
             * <li>on (default)</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            public Ipv6 build() {
                return new Ipv6(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class ManagedTransforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddClientGeolocationHeaders")
        private String addClientGeolocationHeaders;

        @com.aliyun.core.annotation.NameInMap("AddRealClientIpHeader")
        private String addRealClientIpHeader;

        private ManagedTransforms(Builder builder) {
            this.addClientGeolocationHeaders = builder.addClientGeolocationHeaders;
            this.addRealClientIpHeader = builder.addRealClientIpHeader;
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

        public static final class Builder {
            private String addClientGeolocationHeaders; 
            private String addRealClientIpHeader; 

            /**
             * <p>Specifies whether to include the header that indicates the geographical location of a client in an origin request. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder addClientGeolocationHeaders(String addClientGeolocationHeaders) {
                this.addClientGeolocationHeaders = addClientGeolocationHeaders;
                return this;
            }

            /**
             * <p>Specifies whether to include the &quot;ali-real-client-ip&quot; header that contains the client&quot;s real IP address in an origin request. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder addRealClientIpHeader(String addRealClientIpHeader) {
                this.addRealClientIpHeader = addRealClientIpHeader;
                return this;
            }

            public ManagedTransforms build() {
                return new ManagedTransforms(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class NetworkOptimization extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("SmartRouting")
        private String smartRouting;

        @com.aliyun.core.annotation.NameInMap("UploadMaxFilesize")
        private String uploadMaxFilesize;

        @com.aliyun.core.annotation.NameInMap("Websocket")
        private String websocket;

        private NetworkOptimization(Builder builder) {
            this.grpc = builder.grpc;
            this.http2Origin = builder.http2Origin;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
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
            private String grpc; 
            private String http2Origin; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String smartRouting; 
            private String uploadMaxFilesize; 
            private String websocket; 

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
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class OriginProtection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private OriginProtection(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginProtection create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String enable; 

            /**
             * <p>Specifies whether to enable origin protection. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            public OriginProtection build() {
                return new OriginProtection(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class OriginRules extends TeaModel {
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

        private OriginRules(Builder builder) {
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
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginRules create() {
            return builder().build();
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

        public static final class Builder {
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

            /**
             * <p>The hostname that overrides the resolved hostname of an incoming request.</p>
             * 
             * <strong>example:</strong>
             * <p>test.example.com</p>
             */
            public Builder dnsRecord(String dnsRecord) {
                this.dnsRecord = dnsRecord;
                return this;
            }

            /**
             * <p>The Host header in origin requests.</p>
             * 
             * <strong>example:</strong>
             * <p>origin.example.com</p>
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
             * <p>The protocol used for origin requests. Valid values:</p>
             * <ul>
             * <li>http: HTTP.</li>
             * <li>https: HTTPS.</li>
             * <li>follow: follows the protocol used by the client.</li>
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
             * <p>The SNI in origin requests.</p>
             * 
             * <strong>example:</strong>
             * <p>origin.example.com</p>
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
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public OriginRules build() {
                return new OriginRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class RedirectRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReserveQueryString")
        private String reserveQueryString;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RedirectRules(Builder builder) {
            this.reserveQueryString = builder.reserveQueryString;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
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
            private String reserveQueryString; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String statusCode; 
            private String targetUrl; 
            private String type; 

            /**
             * <p>Specifies whether to retain the query string. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder reserveQueryString(String reserveQueryString) {
                this.reserveQueryString = reserveQueryString;
                return this;
            }

            /**
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The response code that you want to use to indicate URL redirection. Valid value:</p>
             * <ul>
             * <li>301</li>
             * <li>302</li>
             * <li>303</li>
             * <li>307</li>
             * <li>308</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>301</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The destination URL to which requests are redirected.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.exapmle.com/index.html">http://www.exapmle.com/index.html</a></p>
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * <p>The redirect type. Valid value:</p>
             * <ul>
             * <li>static</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class RewriteUrlRules extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private RewriteUrlRules(Builder builder) {
            this.queryString = builder.queryString;
            this.rewriteQueryStringType = builder.rewriteQueryStringType;
            this.rewriteUriType = builder.rewriteUriType;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RewriteUrlRules create() {
            return builder().build();
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
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String queryString; 
            private String rewriteQueryStringType; 
            private String rewriteUriType; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private String uri; 

            /**
             * <p>The desired query string to which you want to rewrite the query string in the original request.</p>
             * 
             * <strong>example:</strong>
             * <p>?example=123</p>
             */
            public Builder queryString(String queryString) {
                this.queryString = queryString;
                return this;
            }

            /**
             * <p>The query string rewrite method. Valid values:</p>
             * <ul>
             * <li>static</li>
             * <li>dynamic</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder rewriteQueryStringType(String rewriteQueryStringType) {
                this.rewriteQueryStringType = rewriteQueryStringType;
                return this;
            }

            /**
             * <p>The path rewrite method. Valid values:</p>
             * <ul>
             * <li>static</li>
             * <li>dynamic</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder rewriteUriType(String rewriteUriType) {
                this.rewriteUriType = rewriteUriType;
                return this;
            }

            /**
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
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
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The desired URI to which you want to rewrite the path in the original request.</p>
             * 
             * <strong>example:</strong>
             * <p>/image.example.com/index.html</p>
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
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class SeoBypass extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private SeoBypass(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeoBypass create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String enable; 

            /**
             * <p>Specifies whether to enable SEO crawler bypassing. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            public SeoBypass build() {
                return new SeoBypass(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class SiteNameExclusive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        private SiteNameExclusive(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteNameExclusive create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String enable; 

            /**
             * <p>Specifies whether to enable site hold. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            public SiteNameExclusive build() {
                return new SiteNameExclusive(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class SitePause extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Paused")
        private String paused;

        private SitePause(Builder builder) {
            this.paused = builder.paused;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SitePause create() {
            return builder().build();
        }

        /**
         * @return paused
         */
        public String getPaused() {
            return this.paused;
        }

        public static final class Builder {
            private String paused; 

            /**
             * <p>Specifies whether ESA is paused on the website. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder paused(String paused) {
                this.paused = paused;
                return this;
            }

            public SitePause build() {
                return new SitePause(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSiteFunctionRequest} extends {@link TeaModel}
     *
     * <p>CreateSiteFunctionRequest</p>
     */
    public static class TieredCache extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheArchitectureMode")
        private String cacheArchitectureMode;

        private TieredCache(Builder builder) {
            this.cacheArchitectureMode = builder.cacheArchitectureMode;
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

        public static final class Builder {
            private String cacheArchitectureMode; 

            /**
             * CacheArchitectureMode.
             */
            public Builder cacheArchitectureMode(String cacheArchitectureMode) {
                this.cacheArchitectureMode = cacheArchitectureMode;
                return this;
            }

            public TieredCache build() {
                return new TieredCache(this);
            } 

        } 

    }
}
