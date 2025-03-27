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
         * <p>Content to be refreshed.</p>
         */
        public Builder content(Content content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * <p>Used for refreshing cached resources in edge computing, such as allowing the refresh of content cached using the CacheAPI interface of an edge function.</p>
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
         * <p>Indicates whether to refresh all resources under the directory when the content from the origin and the source resource are inconsistent. The default is false.</p>
         * <ul>
         * <li><strong>true</strong>: Refreshes all resources under the specified directory.</li>
         * <li><strong>false</strong>: Refreshes only the changed resources under the specified directory.</li>
         * </ul>
         * <blockquote>
         * <p> Applies to: Directory refresh, cachetag refresh, ignoreParams refresh, hostname refresh, and purge all cache of the site.</p>
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
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
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
         * <p>The type of refresh task. Possible values:</p>
         * <ul>
         * <li><strong>file</strong> (default): File refresh.</li>
         * <li><strong>cachekey</strong>: Cachekey refresh.</li>
         * <li><strong>cachetag</strong>: Cachetag refresh.</li>
         * <li><strong>directory</strong>: Directory refresh.</li>
         * <li><strong>ignoreParams</strong>: Ignore parameters refresh. Ignoring parameters means removing the ? and everything after it in the request URL. When performing an ignore parameters refresh, the user first submits the URL without parameters through the interface. The submitted URLs to be refreshed will then be matched against the cached resource URLs with the parameters removed. If the cached resource URL, after removing the parameters, matches the URL to be refreshed, the CDN node will refresh the cached resources.</li>
         * <li><strong>hostname</strong>: Hostname refresh.</li>
         * <li><strong>purgeall</strong>: Purge all cache under the site.</li>
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
             * <p>When refreshing, specify the header information corresponding to the cache key. When the custom cache key feature switch is enabled, the cache key will be generated based on the specified header for refreshing.</p>
             * <p><strong>UserGeo: Country/Region</strong></p>
             * <ul>
             * <li>Country/region codes follow the ISO 3166-2 standard.</li>
             * </ul>
             * <p><strong>UserDeviceType: Device Type, currently there are three enum values</strong></p>
             * <ul>
             * <li>desktop</li>
             * <li>tablet</li>
             * <li>mobile</li>
             * </ul>
             * <p><strong>UserLanguage: Language</strong></p>
             * <ul>
             * <li>Language codes follow the ISO 639-1 or BCP47 standards. For example, input &quot;zh&quot; to refresh content in Chinese.</li>
             * </ul>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>URL address to be refreshed.</p>
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
             * <p>List of cachekeys to be refreshed, required when the type is cachekey.</p>
             */
            public Builder cacheKeys(java.util.List<CacheKeys> cacheKeys) {
                this.cacheKeys = cacheKeys;
                return this;
            }

            /**
             * <p>List of cachetags to be refreshed, required when the type is cachetag.</p>
             */
            public Builder cacheTags(java.util.List<String> cacheTags) {
                this.cacheTags = cacheTags;
                return this;
            }

            /**
             * <p>List of directories to be refreshed, required when the type is directory.</p>
             */
            public Builder directories(java.util.List<String> directories) {
                this.directories = directories;
                return this;
            }

            /**
             * <p>List of files to be refreshed, required when the type is file.</p>
             */
            public Builder files(java.util.List<?> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>List of hostnames to be refreshed, required when the type is hostname.</p>
             */
            public Builder hostnames(java.util.List<String> hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * <p>List of files with ignored parameters, required when the type is ignoreParams.</p>
             */
            public Builder ignoreParams(java.util.List<String> ignoreParams) {
                this.ignoreParams = ignoreParams;
                return this;
            }

            /**
             * <p>Flag for purging all content. Default is false, set to true when the type is purgeall.</p>
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
