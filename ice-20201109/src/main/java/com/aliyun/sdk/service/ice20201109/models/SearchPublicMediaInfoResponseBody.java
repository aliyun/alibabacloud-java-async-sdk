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
 * {@link SearchPublicMediaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>SearchPublicMediaInfoResponseBody</p>
 */
public class SearchPublicMediaInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PublicMediaInfos")
    private java.util.List<PublicMediaInfos> publicMediaInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private SearchPublicMediaInfoResponseBody(Builder builder) {
        this.publicMediaInfos = builder.publicMediaInfos;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPublicMediaInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return publicMediaInfos
     */
    public java.util.List<PublicMediaInfos> getPublicMediaInfos() {
        return this.publicMediaInfos;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<PublicMediaInfos> publicMediaInfos; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(SearchPublicMediaInfoResponseBody model) {
            this.publicMediaInfos = model.publicMediaInfos;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The public copyright media asset information.</p>
         */
        public Builder publicMediaInfos(java.util.List<PublicMediaInfos> publicMediaInfos) {
            this.publicMediaInfos = publicMediaInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>3CFB-2767-54FD-B311-BD15A4C1</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that match the request conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchPublicMediaInfoResponseBody build() {
            return new SearchPublicMediaInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchPublicMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>SearchPublicMediaInfoResponseBody</p>
     */
    public static class DynamicMetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DynamicMetaData(Builder builder) {
            this.data = builder.data;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicMetaData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String data; 
            private String type; 

            private Builder() {
            } 

            private Builder(DynamicMetaData model) {
                this.data = model.data;
                this.type = model.type;
            } 

            /**
             * <p>The metadata JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;AuditionUrl\&quot;: \&quot;<a href="http://xxx%5C%5C">http://xxx\\</a>&quot;, \&quot;AuditionCount\&quot;: 3...}&quot;</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The type. Valid values:</p>
             * <ul>
             * <li>ai: AI data processed from original AI results.</li>
             * <li>user-defined: user-defined metadata.</li>
             * <li>system: system-provided metadata.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DynamicMetaData build() {
                return new DynamicMetaData(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchPublicMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>SearchPublicMediaInfoResponseBody</p>
     */
    public static class MediaBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeletedTime")
        private String deletedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaTags")
        private String mediaTags;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SpriteImages")
        private String spriteImages;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private MediaBasicInfo(Builder builder) {
            this.businessType = builder.businessType;
            this.category = builder.category;
            this.coverURL = builder.coverURL;
            this.createTime = builder.createTime;
            this.deletedTime = builder.deletedTime;
            this.description = builder.description;
            this.mediaId = builder.mediaId;
            this.mediaTags = builder.mediaTags;
            this.mediaType = builder.mediaType;
            this.modifiedTime = builder.modifiedTime;
            this.source = builder.source;
            this.spriteImages = builder.spriteImages;
            this.status = builder.status;
            this.title = builder.title;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaBasicInfo create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deletedTime
         */
        public String getDeletedTime() {
            return this.deletedTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaTags
         */
        public String getMediaTags() {
            return this.mediaTags;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return spriteImages
         */
        public String getSpriteImages() {
            return this.spriteImages;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String businessType; 
            private String category; 
            private String coverURL; 
            private String createTime; 
            private String deletedTime; 
            private String description; 
            private String mediaId; 
            private String mediaTags; 
            private String mediaType; 
            private String modifiedTime; 
            private String source; 
            private String spriteImages; 
            private String status; 
            private String title; 
            private String userData; 

            private Builder() {
            } 

            private Builder(MediaBasicInfo model) {
                this.businessType = model.businessType;
                this.category = model.category;
                this.coverURL = model.coverURL;
                this.createTime = model.createTime;
                this.deletedTime = model.deletedTime;
                this.description = model.description;
                this.mediaId = model.mediaId;
                this.mediaTags = model.mediaTags;
                this.mediaType = model.mediaType;
                this.modifiedTime = model.modifiedTime;
                this.source = model.source;
                this.spriteImages = model.spriteImages;
                this.status = model.status;
                this.title = model.title;
                this.userData = model.userData;
            } 

            /**
             * <p>The business type of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The category.</p>
             * 
             * <strong>example:</strong>
             * <p>category</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The cover URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The creation time of the media asset. The time is in the ISO 8601 format and in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T06:04:49Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The deletion time of the media asset. The time is in the ISO 8601 format and in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-29T06:04:49Z</p>
             */
            public Builder deletedTime(String deletedTime) {
                this.deletedTime = deletedTime;
                return this;
            }

            /**
             * <p>The content description.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>MediaId</p>
             * 
             * <strong>example:</strong>
             * <p>icepublic-<strong><strong>87b921bb4a55908a72a0537e</strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>tag,tag1</p>
             */
            public Builder mediaTags(String mediaTags) {
                this.mediaTags = mediaTags;
                return this;
            }

            /**
             * <p>The media type of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The modification time of the media asset. The time is in the ISO 8601 format and in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-26T06:04:50Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The sprite images.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;bucket&quot;:&quot;example-bucket&quot;,&quot;count&quot;:&quot;32&quot;,&quot;iceJobId&quot;:&quot;<strong><strong><strong>83ec44d58b2069def2e</strong></strong></strong>&quot;,&quot;location&quot;:&quot;oss-cn-shanghai&quot;,&quot;snapshotRegular&quot;:&quot;example/example-{Count}.jpg&quot;,&quot;spriteRegular&quot;:&quot;example/example-{TileCount}.jpg&quot;,&quot;templateId&quot;:&quot;<strong><strong><strong>e438b14ff39293eaec25</strong></strong></strong>&quot;,&quot;tileCount&quot;:&quot;1&quot;}]</p>
             */
            public Builder spriteImages(String spriteImages) {
                this.spriteImages = spriteImages;
                return this;
            }

            /**
             * <p>The resource status.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The user data.</p>
             * 
             * <strong>example:</strong>
             * <p>userDataTest</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public MediaBasicInfo build() {
                return new MediaBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchPublicMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>SearchPublicMediaInfoResponseBody</p>
     */
    public static class MediaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DynamicMetaData")
        private DynamicMetaData dynamicMetaData;

        @com.aliyun.core.annotation.NameInMap("MediaBasicInfo")
        private MediaBasicInfo mediaBasicInfo;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        private MediaInfo(Builder builder) {
            this.dynamicMetaData = builder.dynamicMetaData;
            this.mediaBasicInfo = builder.mediaBasicInfo;
            this.mediaId = builder.mediaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaInfo create() {
            return builder().build();
        }

        /**
         * @return dynamicMetaData
         */
        public DynamicMetaData getDynamicMetaData() {
            return this.dynamicMetaData;
        }

        /**
         * @return mediaBasicInfo
         */
        public MediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        public static final class Builder {
            private DynamicMetaData dynamicMetaData; 
            private MediaBasicInfo mediaBasicInfo; 
            private String mediaId; 

            private Builder() {
            } 

            private Builder(MediaInfo model) {
                this.dynamicMetaData = model.dynamicMetaData;
                this.mediaBasicInfo = model.mediaBasicInfo;
                this.mediaId = model.mediaId;
            } 

            /**
             * <p>The dynamic metadata.</p>
             */
            public Builder dynamicMetaData(DynamicMetaData dynamicMetaData) {
                this.dynamicMetaData = dynamicMetaData;
                return this;
            }

            /**
             * <p>BasicInfo</p>
             */
            public Builder mediaBasicInfo(MediaBasicInfo mediaBasicInfo) {
                this.mediaBasicInfo = mediaBasicInfo;
                return this;
            }

            /**
             * <p>The media asset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>icepublic-<strong><strong>87b921bb4a55908a72a0537e</strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            public MediaInfo build() {
                return new MediaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchPublicMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>SearchPublicMediaInfoResponseBody</p>
     */
    public static class PublicMediaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authorized")
        private Boolean authorized;

        @com.aliyun.core.annotation.NameInMap("Favorite")
        private Boolean favorite;

        @com.aliyun.core.annotation.NameInMap("MediaInfo")
        private MediaInfo mediaInfo;

        @com.aliyun.core.annotation.NameInMap("RemainingAuthTime")
        private String remainingAuthTime;

        private PublicMediaInfos(Builder builder) {
            this.authorized = builder.authorized;
            this.favorite = builder.favorite;
            this.mediaInfo = builder.mediaInfo;
            this.remainingAuthTime = builder.remainingAuthTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicMediaInfos create() {
            return builder().build();
        }

        /**
         * @return authorized
         */
        public Boolean getAuthorized() {
            return this.authorized;
        }

        /**
         * @return favorite
         */
        public Boolean getFavorite() {
            return this.favorite;
        }

        /**
         * @return mediaInfo
         */
        public MediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        /**
         * @return remainingAuthTime
         */
        public String getRemainingAuthTime() {
            return this.remainingAuthTime;
        }

        public static final class Builder {
            private Boolean authorized; 
            private Boolean favorite; 
            private MediaInfo mediaInfo; 
            private String remainingAuthTime; 

            private Builder() {
            } 

            private Builder(PublicMediaInfos model) {
                this.authorized = model.authorized;
                this.favorite = model.favorite;
                this.mediaInfo = model.mediaInfo;
                this.remainingAuthTime = model.remainingAuthTime;
            } 

            /**
             * <p>Indicates whether the user has purchased a resource plan that includes the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authorized(Boolean authorized) {
                this.authorized = authorized;
                return this;
            }

            /**
             * <p>Indicates whether the media asset has been added to favorites.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder favorite(Boolean favorite) {
                this.favorite = favorite;
                return this;
            }

            /**
             * <p>The media asset information.</p>
             */
            public Builder mediaInfo(MediaInfo mediaInfo) {
                this.mediaInfo = mediaInfo;
                return this;
            }

            /**
             * <p>The remaining validity period of the resource plan, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder remainingAuthTime(String remainingAuthTime) {
                this.remainingAuthTime = remainingAuthTime;
                return this;
            }

            public PublicMediaInfos build() {
                return new PublicMediaInfos(this);
            } 

        } 

    }
}
