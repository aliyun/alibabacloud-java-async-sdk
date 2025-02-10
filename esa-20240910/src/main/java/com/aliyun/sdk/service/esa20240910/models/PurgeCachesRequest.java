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
         * <p>The content to purge.</p>
         */
        public Builder content(Content content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * <p>Specifies whether to purge cached resources for edge computing. For example, purge the resources cached by the CacheAPI operation of Edge Routine.</p>
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
         * <p>Specifies whether to purge resources in a directory if the resources requested are different from the resources on the origin server. Default value: false.</p>
         * <ul>
         * <li><strong>true</strong>: purges all resources in the directory.</li>
         * <li><strong>false</strong>: purges only changed resources in the directory.</li>
         * </ul>
         * <blockquote>
         * <p> This configuration takes effect for the following purge task types: directory, cachetag, ignoreParams, hostname, and purgeall.</p>
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
         * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
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
         * <p>The type of the purge task. Valid values:</p>
         * <ul>
         * <li><strong>file</strong> (default): purges the cache by file.</li>
         * <li><strong>cachetag</strong>: purges the cache by cache tag.</li>
         * <li><strong>directory</strong>: purges the cache by directory.</li>
         * <li><strong>ignoreParams</strong>: purges the cache by URL with specific parameters ignored. This option ignores the question mark (?) and parameters after the question mark (?) in a request URL and purges the cache. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource without specified parameters. If the URLs match, the POPs purge the cached resources.</li>
         * <li><strong>hostname</strong>: purges the cache by hostname.</li>
         * <li><strong>purgeall</strong>: purges all cache.</li>
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

            /**
             * Headers.
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Url.
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

            /**
             * CacheKeys.
             */
            public Builder cacheKeys(java.util.List<CacheKeys> cacheKeys) {
                this.cacheKeys = cacheKeys;
                return this;
            }

            /**
             * <p>The cache tags that are used to purge the cache. This parameter is required if Type is set to cachetag.</p>
             */
            public Builder cacheTags(java.util.List<String> cacheTags) {
                this.cacheTags = cacheTags;
                return this;
            }

            /**
             * <p>The directories that are used to purge the cache. This parameter is required if Type is set to directory.</p>
             */
            public Builder directories(java.util.List<String> directories) {
                this.directories = directories;
                return this;
            }

            /**
             * <p>The files to purge. This parameter is required if Type is set to file.</p>
             */
            public Builder files(java.util.List<?> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The hostnames that are used to purge the cache. This parameter is required if Type is set to hostname.</p>
             */
            public Builder hostnames(java.util.List<String> hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * <p>The file URLs with parameters ignored that are used to purge the cache. This parameter is required if Type is set to ignoreParams.</p>
             */
            public Builder ignoreParams(java.util.List<String> ignoreParams) {
                this.ignoreParams = ignoreParams;
                return this;
            }

            /**
             * <p>Specifies whether to purge all cache of the website. Default value: false. The value is true when Type is set to purgeall.</p>
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
