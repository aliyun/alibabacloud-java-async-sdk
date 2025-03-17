// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListAdInsertionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAdInsertionsResponseBody</p>
 */
public class ListAdInsertionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAdInsertionsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdInsertionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private Integer maxResults; 
        private String nextToken; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAdInsertionsResponseBody model) {
            this.configs = model.configs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sortBy = model.sortBy;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Array</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The maximum number of entries to retrieve in a subsequent request. If this parameter is used, the pagination parameters become invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used in the next request to retrieve a new page of results. If this parameter is used, the pagination parameters become invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>*<em><strong><strong>8EqYpQbZ6Eh7+Zz8DxVYoQ</strong></strong></em></p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sorting order of the configurations by creation time. asc: ascending. desc: descending.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAdInsertionsResponseBody build() {
            return new ListAdInsertionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAdInsertionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAdInsertionsResponseBody</p>
     */
    public static class CdnConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdSegmentUrlPrefix")
        private String adSegmentUrlPrefix;

        @com.aliyun.core.annotation.NameInMap("ContentSegmentUrlPrefix")
        private String contentSegmentUrlPrefix;

        private CdnConfig(Builder builder) {
            this.adSegmentUrlPrefix = builder.adSegmentUrlPrefix;
            this.contentSegmentUrlPrefix = builder.contentSegmentUrlPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdnConfig create() {
            return builder().build();
        }

        /**
         * @return adSegmentUrlPrefix
         */
        public String getAdSegmentUrlPrefix() {
            return this.adSegmentUrlPrefix;
        }

        /**
         * @return contentSegmentUrlPrefix
         */
        public String getContentSegmentUrlPrefix() {
            return this.contentSegmentUrlPrefix;
        }

        public static final class Builder {
            private String adSegmentUrlPrefix; 
            private String contentSegmentUrlPrefix; 

            private Builder() {
            } 

            private Builder(CdnConfig model) {
                this.adSegmentUrlPrefix = model.adSegmentUrlPrefix;
                this.contentSegmentUrlPrefix = model.contentSegmentUrlPrefix;
            } 

            /**
             * <p>The CDN prefix for ad segments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
             */
            public Builder adSegmentUrlPrefix(String adSegmentUrlPrefix) {
                this.adSegmentUrlPrefix = adSegmentUrlPrefix;
                return this;
            }

            /**
             * <p>The CDN prefix for content segments.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
             */
            public Builder contentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
                this.contentSegmentUrlPrefix = contentSegmentUrlPrefix;
                return this;
            }

            public CdnConfig build() {
                return new CdnConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAdInsertionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAdInsertionsResponseBody</p>
     */
    public static class ManifestEndpointConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HlsPrefix")
        private String hlsPrefix;

        private ManifestEndpointConfig(Builder builder) {
            this.hlsPrefix = builder.hlsPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManifestEndpointConfig create() {
            return builder().build();
        }

        /**
         * @return hlsPrefix
         */
        public String getHlsPrefix() {
            return this.hlsPrefix;
        }

        public static final class Builder {
            private String hlsPrefix; 

            private Builder() {
            } 

            private Builder(ManifestEndpointConfig model) {
                this.hlsPrefix = model.hlsPrefix;
            } 

            /**
             * <p>The prefix of the playback endpoint for HLS manifests.</p>
             */
            public Builder hlsPrefix(String hlsPrefix) {
                this.hlsPrefix = hlsPrefix;
                return this;
            }

            public ManifestEndpointConfig build() {
                return new ManifestEndpointConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAdInsertionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAdInsertionsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdMarkerPassthrough")
        private String adMarkerPassthrough;

        @com.aliyun.core.annotation.NameInMap("AdsUrl")
        private String adsUrl;

        @com.aliyun.core.annotation.NameInMap("CdnConfig")
        private CdnConfig cdnConfig;

        @com.aliyun.core.annotation.NameInMap("ConfigAliases")
        private String configAliases;

        @com.aliyun.core.annotation.NameInMap("ContentUrlPrefix")
        private String contentUrlPrefix;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("ManifestEndpointConfig")
        private ManifestEndpointConfig manifestEndpointConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PersonalizationThreshold")
        private Integer personalizationThreshold;

        @com.aliyun.core.annotation.NameInMap("SlateAdUrl")
        private String slateAdUrl;

        private Configs(Builder builder) {
            this.adMarkerPassthrough = builder.adMarkerPassthrough;
            this.adsUrl = builder.adsUrl;
            this.cdnConfig = builder.cdnConfig;
            this.configAliases = builder.configAliases;
            this.contentUrlPrefix = builder.contentUrlPrefix;
            this.createTime = builder.createTime;
            this.lastModified = builder.lastModified;
            this.manifestEndpointConfig = builder.manifestEndpointConfig;
            this.name = builder.name;
            this.personalizationThreshold = builder.personalizationThreshold;
            this.slateAdUrl = builder.slateAdUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return adMarkerPassthrough
         */
        public String getAdMarkerPassthrough() {
            return this.adMarkerPassthrough;
        }

        /**
         * @return adsUrl
         */
        public String getAdsUrl() {
            return this.adsUrl;
        }

        /**
         * @return cdnConfig
         */
        public CdnConfig getCdnConfig() {
            return this.cdnConfig;
        }

        /**
         * @return configAliases
         */
        public String getConfigAliases() {
            return this.configAliases;
        }

        /**
         * @return contentUrlPrefix
         */
        public String getContentUrlPrefix() {
            return this.contentUrlPrefix;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return manifestEndpointConfig
         */
        public ManifestEndpointConfig getManifestEndpointConfig() {
            return this.manifestEndpointConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return personalizationThreshold
         */
        public Integer getPersonalizationThreshold() {
            return this.personalizationThreshold;
        }

        /**
         * @return slateAdUrl
         */
        public String getSlateAdUrl() {
            return this.slateAdUrl;
        }

        public static final class Builder {
            private String adMarkerPassthrough; 
            private String adsUrl; 
            private CdnConfig cdnConfig; 
            private String configAliases; 
            private String contentUrlPrefix; 
            private String createTime; 
            private String lastModified; 
            private ManifestEndpointConfig manifestEndpointConfig; 
            private String name; 
            private Integer personalizationThreshold; 
            private String slateAdUrl; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.adMarkerPassthrough = model.adMarkerPassthrough;
                this.adsUrl = model.adsUrl;
                this.cdnConfig = model.cdnConfig;
                this.configAliases = model.configAliases;
                this.contentUrlPrefix = model.contentUrlPrefix;
                this.createTime = model.createTime;
                this.lastModified = model.lastModified;
                this.manifestEndpointConfig = model.manifestEndpointConfig;
                this.name = model.name;
                this.personalizationThreshold = model.personalizationThreshold;
                this.slateAdUrl = model.slateAdUrl;
            } 

            /**
             * <p>Indicates whether ad marker passthrough is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder adMarkerPassthrough(String adMarkerPassthrough) {
                this.adMarkerPassthrough = adMarkerPassthrough;
                return this;
            }

            /**
             * <p>The request URL of the ad decision server (ADS).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ads.com/ad1?param1=%5Bpalyer_params.p1%5D">http://ads.com/ad1?param1=[palyer_params.p1]</a></p>
             */
            public Builder adsUrl(String adsUrl) {
                this.adsUrl = adsUrl;
                return this;
            }

            /**
             * <p>The CDN configurations.</p>
             */
            public Builder cdnConfig(CdnConfig cdnConfig) {
                this.cdnConfig = cdnConfig;
                return this;
            }

            /**
             * <p>The player parameter variables and aliases.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;player_params.p1&quot;: {
             *             &quot;1&quot;: &quot;abc&quot;
             *       }
             * }</p>
             */
            public Builder configAliases(String configAliases) {
                this.configAliases = configAliases;
                return this;
            }

            /**
             * <p>The URL prefix for the source content.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://source.com/">https://source.com/</a></p>
             */
            public Builder contentUrlPrefix(String contentUrlPrefix) {
                this.contentUrlPrefix = contentUrlPrefix;
                return this;
            }

            /**
             * <p>The time when the configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:26:09Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the configuration was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:26:09Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The playback endpoint configuration.</p>
             */
            public Builder manifestEndpointConfig(ManifestEndpointConfig manifestEndpointConfig) {
                this.manifestEndpointConfig = manifestEndpointConfig;
                return this;
            }

            /**
             * <p>The name of the ad insertion configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>my_ad</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The personalization threshold that defines the maximum duration of underfilled time allowed in an ad break.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder personalizationThreshold(Integer personalizationThreshold) {
                this.personalizationThreshold = personalizationThreshold;
                return this;
            }

            /**
             * <p>The URL of the slate ad.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://storage.com/slate1.mp4">http://storage.com/slate1.mp4</a></p>
             */
            public Builder slateAdUrl(String slateAdUrl) {
                this.slateAdUrl = slateAdUrl;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
