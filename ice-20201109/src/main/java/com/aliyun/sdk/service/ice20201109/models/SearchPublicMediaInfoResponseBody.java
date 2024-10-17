// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    private java.util.List < PublicMediaInfos> publicMediaInfos;

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

    /**
     * @return publicMediaInfos
     */
    public java.util.List < PublicMediaInfos> getPublicMediaInfos() {
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
        private java.util.List < PublicMediaInfos> publicMediaInfos; 
        private String requestId; 
        private Long totalCount; 

        /**
         * PublicMediaInfos.
         */
        public Builder publicMediaInfos(java.util.List < PublicMediaInfos> publicMediaInfos) {
            this.publicMediaInfos = publicMediaInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * Type.
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

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CoverURL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeletedTime.
             */
            public Builder deletedTime(String deletedTime) {
                this.deletedTime = deletedTime;
                return this;
            }

            /**
             * Description.
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
             * MediaTags.
             */
            public Builder mediaTags(String mediaTags) {
                this.mediaTags = mediaTags;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SpriteImages.
             */
            public Builder spriteImages(String spriteImages) {
                this.spriteImages = spriteImages;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UserData.
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

            /**
             * DynamicMetaData.
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
             * <p>MediaId</p>
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

            /**
             * Authorized.
             */
            public Builder authorized(Boolean authorized) {
                this.authorized = authorized;
                return this;
            }

            /**
             * Favorite.
             */
            public Builder favorite(Boolean favorite) {
                this.favorite = favorite;
                return this;
            }

            /**
             * MediaInfo.
             */
            public Builder mediaInfo(MediaInfo mediaInfo) {
                this.mediaInfo = mediaInfo;
                return this;
            }

            /**
             * RemainingAuthTime.
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
