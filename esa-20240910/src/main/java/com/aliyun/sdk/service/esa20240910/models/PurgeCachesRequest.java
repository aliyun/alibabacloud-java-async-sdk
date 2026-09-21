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
 * {@link PurgeCachesRequest} extends {@link RequestModel}
 *
 * <p>PurgeCachesRequest</p>
 */
public class PurgeCachesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeComputePurge")
    private Boolean edgeComputePurge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private PurgeCachesRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.edgeComputePurge = builder.edgeComputePurge;
        this.force = builder.force;
        this.siteId = builder.siteId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurgeCachesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return edgeComputePurge
     */
    public Boolean getEdgeComputePurge() {
        return this.edgeComputePurge;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<PurgeCachesRequest, Builder> {
        private Content content; 
        private Boolean edgeComputePurge; 
        private Boolean force; 
        private Long siteId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(PurgeCachesRequest request) {
            super(request);
            this.content = request.content;
            this.edgeComputePurge = request.edgeComputePurge;
            this.force = request.force;
            this.siteId = request.siteId;
            this.type = request.type;
        } 

        /**
         * <p>The refresh content.</p>
         */
        public Builder content(Content content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * <p>Specifies whether to refresh edge computing cached resources. For example, this allows refreshing content cached by the Edge Routine CacheAPI API operation using edge functions.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder edgeComputePurge(Boolean edgeComputePurge) {
            this.putQueryParameter("EdgeComputePurge", edgeComputePurge);
            this.edgeComputePurge = edgeComputePurge;
            return this;
        }

        /**
         * <p>Specifies whether to refresh resources under the corresponding directory when the back-to-origin content is inconsistent with the origin server resources. Default value: false.</p>
         * <ul>
         * <li><strong>true</strong>: Refreshes all resources under the corresponding directory.</li>
         * <li><strong>false</strong>: Refreshes only the changed resources under the corresponding directory.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter applies to directory refresh, cache tag refresh, parameter-ignored refresh, hostname refresh, and entire site cache refresh.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The type of the refresh node. Valid values:</p>
         * <ul>
         * <li><strong>file</strong> (default): file refresh.</li>
         * <li><strong>cachekey</strong>: cache key refresh.</li>
         * <li><strong>cachetag</strong>: cache label refresh.</li>
         * <li><strong>directory</strong>: folder refresh.</li>
         * <li><strong>ignoreParams</strong>: parameter-ignored refresh. This refers to removing the question mark (?) and all parameters after it from the request URL. When you commit a parameter-stripped URL through this API operation, the committed URL is matched against cached resource URLs after their parameters are stripped. If a cached resource URL matches the committed URL after parameter stripping, the point of presence executes the refresh on the cached resource.</li>
         * <li><strong>hostname</strong>: hostname refresh.</li>
         * <li><strong>purgeall</strong>: refreshes all cached content under the site.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public PurgeCachesRequest build() {
            return new PurgeCachesRequest(this);
        } 

    } 

    /**
     * 
     * {@link PurgeCachesRequest} extends {@link TeaModel}
     *
     * <p>PurgeCachesRequest</p>
     */
    public static class CacheKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CacheKeys(Builder builder) {
            this.headers = builder.headers;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CacheKeys create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.Map<String, String> headers; 
            private String url; 

            private Builder() {
            } 

            private Builder(CacheKeys model) {
                this.headers = model.headers;
                this.url = model.url;
            } 

            /**
             * <p>The header information corresponding to the cache key specified during the refresh. When the custom cache key feature is enabled, the cache key is generated based on the specified headers for the refresh.</p>
             * <p><strong>UserGeo: country/region</strong></p>
             * <ul>
             * <li>Country/region codes follow the ISO 3166-2 standard.</li>
             * </ul>
             * <p><strong>UserDeviceType: device type. Valid values:</strong></p>
             * <ul>
             * <li><p>desktop</p>
             * </li>
             * <li><p>tablet</p>
             * </li>
             * <li><p>mobile</p>
             * </li>
             * </ul>
             * <p><strong>UserLanguage: language</strong></p>
             * <ul>
             * <li>Language codes follow the ISO 639-1 or BCP 47 standard. For example, set this to zh to refresh content in Chinese.</li>
             * </ul>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The URL to refresh.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://a.com/1.jpg?b=1">http://a.com/1.jpg?b=1</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CacheKeys build() {
                return new CacheKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link PurgeCachesRequest} extends {@link TeaModel}
     *
     * <p>PurgeCachesRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheKeys")
        private java.util.List<CacheKeys> cacheKeys;

        @com.aliyun.core.annotation.NameInMap("CacheTags")
        private java.util.List<String> cacheTags;

        @com.aliyun.core.annotation.NameInMap("Directories")
        private java.util.List<String> directories;

        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List<?> files;

        @com.aliyun.core.annotation.NameInMap("Hostnames")
        private java.util.List<String> hostnames;

        @com.aliyun.core.annotation.NameInMap("IgnoreParams")
        private java.util.List<String> ignoreParams;

        @com.aliyun.core.annotation.NameInMap("PurgeAll")
        private Boolean purgeAll;

        private Content(Builder builder) {
            this.cacheKeys = builder.cacheKeys;
            this.cacheTags = builder.cacheTags;
            this.directories = builder.directories;
            this.files = builder.files;
            this.hostnames = builder.hostnames;
            this.ignoreParams = builder.ignoreParams;
            this.purgeAll = builder.purgeAll;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cacheKeys
         */
        public java.util.List<CacheKeys> getCacheKeys() {
            return this.cacheKeys;
        }

        /**
         * @return cacheTags
         */
        public java.util.List<String> getCacheTags() {
            return this.cacheTags;
        }

        /**
         * @return directories
         */
        public java.util.List<String> getDirectories() {
            return this.directories;
        }

        /**
         * @return files
         */
        public java.util.List<?> getFiles() {
            return this.files;
        }

        /**
         * @return hostnames
         */
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        /**
         * @return ignoreParams
         */
        public java.util.List<String> getIgnoreParams() {
            return this.ignoreParams;
        }

        /**
         * @return purgeAll
         */
        public Boolean getPurgeAll() {
            return this.purgeAll;
        }

        public static final class Builder {
            private java.util.List<CacheKeys> cacheKeys; 
            private java.util.List<String> cacheTags; 
            private java.util.List<String> directories; 
            private java.util.List<?> files; 
            private java.util.List<String> hostnames; 
            private java.util.List<String> ignoreParams; 
            private Boolean purgeAll; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.cacheKeys = model.cacheKeys;
                this.cacheTags = model.cacheTags;
                this.directories = model.directories;
                this.files = model.files;
                this.hostnames = model.hostnames;
                this.ignoreParams = model.ignoreParams;
                this.purgeAll = model.purgeAll;
            } 

            /**
             * <p>The list of cache keys to refresh. This parameter is required when Type is set to cachekey.</p>
             */
            public Builder cacheKeys(java.util.List<CacheKeys> cacheKeys) {
                this.cacheKeys = cacheKeys;
                return this;
            }

            /**
             * <p>The list of cache tags to refresh. This parameter is required when Type is set to cachetag.</p>
             */
            public Builder cacheTags(java.util.List<String> cacheTags) {
                this.cacheTags = cacheTags;
                return this;
            }

            /**
             * <p>The list of directories to refresh. This parameter is required when Type is set to directory.</p>
             */
            public Builder directories(java.util.List<String> directories) {
                this.directories = directories;
                return this;
            }

            /**
             * <p>The list of files to refresh. This parameter is required when Type is set to file.</p>
             */
            public Builder files(java.util.List<?> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The list of hostnames to refresh. This parameter is required when Type is set to hostname.</p>
             */
            public Builder hostnames(java.util.List<String> hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * <p>The list of files with parameters ignored. This parameter is required when Type is set to ignoreParams.</p>
             */
            public Builder ignoreParams(java.util.List<String> ignoreParams) {
                this.ignoreParams = ignoreParams;
                return this;
            }

            /**
             * <p>The entire site refresh flag. Default value: false. Set this parameter to true when Type is set to purgeall.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder purgeAll(Boolean purgeAll) {
                this.purgeAll = purgeAll;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
