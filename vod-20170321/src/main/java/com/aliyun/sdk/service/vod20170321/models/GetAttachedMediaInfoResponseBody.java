// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the media assets.</p>
         */
        public Builder attachedMediaList(java.util.List < AttachedMediaList> attachedMediaList) {
            this.attachedMediaList = attachedMediaList;
            return this;
        }

        /**
         * <p>The IDs of the auxiliary media assets that do not exist.</p>
         */
        public Builder nonExistMediaIds(java.util.List < String > nonExistMediaIds) {
            this.nonExistMediaIds = nonExistMediaIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>221BCB57-B217-42BF-619BD13378F9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAttachedMediaInfoResponseBody build() {
            return new GetAttachedMediaInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAttachedMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAttachedMediaInfoResponseBody</p>
     */
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
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>1000224338</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>category test</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The level of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The ID of the parent category.</p>
             * 
             * <strong>example:</strong>
             * <p>1000224336</p>
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
    /**
     * 
     * {@link GetAttachedMediaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAttachedMediaInfoResponseBody</p>
     */
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-*****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The categories.</p>
             */
            public Builder categories(java.util.List < Categories> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The time when the auxiliary media asset was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T10:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the auxiliary media asset.</p>
             * <blockquote>
             * <p> This parameter is returned only when a description is specified for the auxiliary media asset.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>description test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>0222e203cf80f9c22870a4d2c****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The time when the auxiliary media asset was last updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-31T11:42:20Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The status of the auxiliary media asset. Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong></li>
             * <li><strong>Normal</strong></li>
             * <li><strong>UploadFail</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage address of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>outin-bfefbb9*****c7426.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the auxiliary media asset.</p>
             * <blockquote>
             * <p> This parameter is returned only when tags are specified for the auxiliary media asset.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tag1,tag2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>subtitle test</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The type of the auxiliary media asset.</p>
             * <ul>
             * <li><strong>watermark</strong></li>
             * <li><strong>subtitle</strong></li>
             * <li><strong>material</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>subtitle</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the auxiliary media asset.</p>
             * <blockquote>
             * <p> If a CDN domain name is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://al*****.cn/subtitle/9843C2*****4E186F19B6.vtt?auth_key=159099f60e0b7fd59">https://al*****.cn/subtitle/9843C2*****4E186F19B6.vtt?auth_key=159099f60e0b7fd59</a>****</p>
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
