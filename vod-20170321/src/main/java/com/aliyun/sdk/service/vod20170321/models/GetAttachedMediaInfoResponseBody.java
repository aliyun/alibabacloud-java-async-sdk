// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAttachedMediaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttachedMediaInfoResponseBody</p>
 */
public class GetAttachedMediaInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttachedMediaList")
    private java.util.List < AttachedMediaList> attachedMediaList;

    @com.aliyun.core.annotation.NameInMap("NonExistMediaIds")
    private java.util.List < String > nonExistMediaIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAttachedMediaInfoResponseBody(Builder builder) {
        this.attachedMediaList = builder.attachedMediaList;
        this.nonExistMediaIds = builder.nonExistMediaIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttachedMediaInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return attachedMediaList
     */
    public java.util.List < AttachedMediaList> getAttachedMediaList() {
        return this.attachedMediaList;
    }

    /**
     * @return nonExistMediaIds
     */
    public java.util.List < String > getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AttachedMediaList> attachedMediaList; 
        private java.util.List < String > nonExistMediaIds; 
        private String requestId; 

        /**
         * The information about the media asset.
         */
        public Builder attachedMediaList(java.util.List < AttachedMediaList> attachedMediaList) {
            this.attachedMediaList = attachedMediaList;
            return this;
        }

        /**
         * The IDs of the auxiliary media assets that do not exist.
         */
        public Builder nonExistMediaIds(java.util.List < String > nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAttachedMediaInfoResponseBody build() {
            return new GetAttachedMediaInfoResponseBody(this);
        } 

    } 

    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        private Categories(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.level = builder.level;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Long cateId; 
            private String cateName; 
            private Long level; 
            private Long parentId; 

            /**
             * The ID of the video category.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             * <p>
             * - The value can be up to 64 bytes in length.
             * - The string must be encoded in the UTF-8 format.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The level of the category. A value of 0 indicates a level 1 category.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * The ID of the parent category. The parent category ID of a level 1 category is -1.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    public static class AttachedMediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List < Categories> categories;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private AttachedMediaList(Builder builder) {
            this.appId = builder.appId;
            this.categories = builder.categories;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.mediaId = builder.mediaId;
            this.modificationTime = builder.modificationTime;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.type = builder.type;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachedMediaList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return categories
         */
        public java.util.List < Categories> getCategories() {
            return this.categories;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List < Categories> categories; 
            private String creationTime; 
            private String description; 
            private String mediaId; 
            private String modificationTime; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String type; 
            private String URL; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The list of categories.
             */
            public Builder categories(java.util.List < Categories> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * The time when the auxiliary media asset was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the auxiliary media asset.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the auxiliary media asset.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The time when the auxiliary media asset was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The status of the auxiliary media asset. Valid values:
             * <p>
             * - **Uploading**: The auxiliary media asset is being uploaded. This is the initial status.
             * - **Normal**: The auxiliary media asset is uploaded.
             * - **UploadFail**: The auxiliary media asset fails to be uploaded.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The OSS bucket where the auxiliary media asset is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the auxiliary media asset.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the auxiliary media asset.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The type of the auxiliary media asset. Valid values:
             * <p>
             * - **watermark**
             * - **subtitle**
             * - **material**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL of the auxiliary media asset.
             * <p>
             * > If a CDN domain name is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public AttachedMediaList build() {
                return new AttachedMediaList(this);
            } 

        } 

    }
}
