// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaResponseBody</p>
 */
public class SearchMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaList")
    private java.util.List < MediaList> mediaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScrollToken")
    private String scrollToken;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private SearchMediaResponseBody(Builder builder) {
        this.mediaList = builder.mediaList;
        this.requestId = builder.requestId;
        this.scrollToken = builder.scrollToken;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaList
     */
    public java.util.List < MediaList> getMediaList() {
        return this.mediaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scrollToken
     */
    public String getScrollToken() {
        return this.scrollToken;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < MediaList> mediaList; 
        private String requestId; 
        private String scrollToken; 
        private Long total; 

        /**
         * The information about the media assets.
         */
        public Builder mediaList(java.util.List < MediaList> mediaList) {
            this.mediaList = mediaList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The pagination identifier.
         */
        public Builder scrollToken(String scrollToken) {
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * The total number of data records that meet the specified filter criteria.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaResponseBody build() {
            return new SearchMediaResponseBody(this);
        } 

    } 

    public static class Occurrences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        private Occurrences(Builder builder) {
            this.from = builder.from;
            this.score = builder.score;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Occurrences create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        public static final class Builder {
            private Double from; 
            private Double score; 
            private Double to; 

            /**
             * The start time of the clip.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * The score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * The end time of the clip.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            public Occurrences build() {
                return new Occurrences(this);
            } 

        } 

    }
    public static class AiLabelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("LabelId")
        private String labelId;

        @com.aliyun.core.annotation.NameInMap("LabelName")
        private String labelName;

        @com.aliyun.core.annotation.NameInMap("Occurrences")
        private java.util.List < Occurrences> occurrences;

        private AiLabelInfo(Builder builder) {
            this.category = builder.category;
            this.labelId = builder.labelId;
            this.labelName = builder.labelName;
            this.occurrences = builder.occurrences;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiLabelInfo create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return labelId
         */
        public String getLabelId() {
            return this.labelId;
        }

        /**
         * @return labelName
         */
        public String getLabelName() {
            return this.labelName;
        }

        /**
         * @return occurrences
         */
        public java.util.List < Occurrences> getOccurrences() {
            return this.occurrences;
        }

        public static final class Builder {
            private String category; 
            private String labelId; 
            private String labelName; 
            private java.util.List < Occurrences> occurrences; 

            /**
             * The category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The ID of the tag.
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * The name of the tag.
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            /**
             * The clips.
             */
            public Builder occurrences(java.util.List < Occurrences> occurrences) {
                this.occurrences = occurrences;
                return this;
            }

            public AiLabelInfo build() {
                return new AiLabelInfo(this);
            } 

        } 

    }
    public static class OcrInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("From")
        private Double from;

        @com.aliyun.core.annotation.NameInMap("To")
        private Double to;

        private OcrInfo(Builder builder) {
            this.content = builder.content;
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OcrInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return from
         */
        public Double getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Double getTo() {
            return this.to;
        }

        public static final class Builder {
            private String content; 
            private Double from; 
            private Double to; 

            /**
             * The text content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The start time of the subtitle.
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * The end time of the subtitle.
             */
            public Builder to(Double to) {
                this.to = to;
                return this;
            }

            public OcrInfo build() {
                return new OcrInfo(this);
            } 

        } 

    }
    public static class AiData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiLabelInfo")
        private java.util.List < AiLabelInfo> aiLabelInfo;

        @com.aliyun.core.annotation.NameInMap("OcrInfo")
        private java.util.List < OcrInfo> ocrInfo;

        private AiData(Builder builder) {
            this.aiLabelInfo = builder.aiLabelInfo;
            this.ocrInfo = builder.ocrInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiData create() {
            return builder().build();
        }

        /**
         * @return aiLabelInfo
         */
        public java.util.List < AiLabelInfo> getAiLabelInfo() {
            return this.aiLabelInfo;
        }

        /**
         * @return ocrInfo
         */
        public java.util.List < OcrInfo> getOcrInfo() {
            return this.ocrInfo;
        }

        public static final class Builder {
            private java.util.List < AiLabelInfo> aiLabelInfo; 
            private java.util.List < OcrInfo> ocrInfo; 

            /**
             * The AI tags.
             */
            public Builder aiLabelInfo(java.util.List < AiLabelInfo> aiLabelInfo) {
                this.aiLabelInfo = aiLabelInfo;
                return this;
            }

            /**
             * The information about subtitles.
             */
            public Builder ocrInfo(java.util.List < OcrInfo> ocrInfo) {
                this.ocrInfo = ocrInfo;
                return this;
            }

            public AiData build() {
                return new AiData(this);
            } 

        } 

    }
    public static class AiRoughData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiCategory")
        private String aiCategory;

        @com.aliyun.core.annotation.NameInMap("AiJobId")
        private String aiJobId;

        @com.aliyun.core.annotation.NameInMap("SaveType")
        private String saveType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AiRoughData(Builder builder) {
            this.aiCategory = builder.aiCategory;
            this.aiJobId = builder.aiJobId;
            this.saveType = builder.saveType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiRoughData create() {
            return builder().build();
        }

        /**
         * @return aiCategory
         */
        public String getAiCategory() {
            return this.aiCategory;
        }

        /**
         * @return aiJobId
         */
        public String getAiJobId() {
            return this.aiJobId;
        }

        /**
         * @return saveType
         */
        public String getSaveType() {
            return this.saveType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aiCategory; 
            private String aiJobId; 
            private String saveType; 
            private String status; 

            /**
             * The AI category.
             */
            public Builder aiCategory(String aiCategory) {
                this.aiCategory = aiCategory;
                return this;
            }

            /**
             * The ID of the AI task.
             */
            public Builder aiJobId(String aiJobId) {
                this.aiJobId = aiJobId;
                return this;
            }

            /**
             * The save type.
             */
            public Builder saveType(String saveType) {
                this.saveType = saveType;
                return this;
            }

            /**
             * The data status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AiRoughData build() {
                return new AiRoughData(this);
            } 

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
             * The category ID of the auxiliary media asset.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The level of the category.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * The ID of the parent node.
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
    public static class AttachedMedia extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

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

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private AttachedMedia(Builder builder) {
            this.appId = builder.appId;
            this.businessType = builder.businessType;
            this.categories = builder.categories;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.mediaId = builder.mediaId;
            this.modificationTime = builder.modificationTime;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachedMedia create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
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
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String appId; 
            private String businessType; 
            private java.util.List < Categories> categories; 
            private String creationTime; 
            private String description; 
            private String mediaId; 
            private String modificationTime; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String URL; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The type of the auxiliary media asset. Valid values:
             * <p>
             * 
             * *   **watermark**
             * *   **subtitle**
             * *   **material**
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * The list of category IDs.
             */
            public Builder categories(java.util.List < Categories> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * The time when the auxiliary media asset was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
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
             * The time when the auxiliary media asset was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The status of the auxiliary media asset. Valid values:
             * <p>
             * 
             * *   **Uploading**
             * *   **Normal**
             * *   **UploadFail**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The region in which the auxiliary media asset is stored.
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
             * The URL of the auxiliary media asset.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public AttachedMedia build() {
                return new AttachedMedia(this);
            } 

        } 

    }
    public static class Audio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AudioId")
        private String audioId;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadSwitch")
        private String downloadSwitch;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("MediaSource")
        private String mediaSource;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("PreprocessStatus")
        private String preprocessStatus;

        @com.aliyun.core.annotation.NameInMap("RestoreExpiration")
        private String restoreExpiration;

        @com.aliyun.core.annotation.NameInMap("RestoreStatus")
        private String restoreStatus;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private java.util.List < String > snapshots;

        @com.aliyun.core.annotation.NameInMap("SpriteSnapshots")
        private java.util.List < String > spriteSnapshots;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TranscodeMode")
        private String transcodeMode;

        private Audio(Builder builder) {
            this.appId = builder.appId;
            this.audioId = builder.audioId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.downloadSwitch = builder.downloadSwitch;
            this.duration = builder.duration;
            this.mediaSource = builder.mediaSource;
            this.modificationTime = builder.modificationTime;
            this.preprocessStatus = builder.preprocessStatus;
            this.restoreExpiration = builder.restoreExpiration;
            this.restoreStatus = builder.restoreStatus;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.spriteSnapshots = builder.spriteSnapshots;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.transcodeMode = builder.transcodeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audio create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return audioId
         */
        public String getAudioId() {
            return this.audioId;
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
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
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
         * @return downloadSwitch
         */
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return mediaSource
         */
        public String getMediaSource() {
            return this.mediaSource;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return preprocessStatus
         */
        public String getPreprocessStatus() {
            return this.preprocessStatus;
        }

        /**
         * @return restoreExpiration
         */
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        /**
         * @return restoreStatus
         */
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return snapshots
         */
        public java.util.List < String > getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return spriteSnapshots
         */
        public java.util.List < String > getSpriteSnapshots() {
            return this.spriteSnapshots;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
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
         * @return transcodeMode
         */
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        public static final class Builder {
            private String appId; 
            private String audioId; 
            private Long cateId; 
            private String cateName; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String downloadSwitch; 
            private Float duration; 
            private String mediaSource; 
            private String modificationTime; 
            private String preprocessStatus; 
            private String restoreExpiration; 
            private String restoreStatus; 
            private Long size; 
            private java.util.List < String > snapshots; 
            private java.util.List < String > spriteSnapshots; 
            private String status; 
            private String storageClass; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String transcodeMode; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the audio file.
             */
            public Builder audioId(String audioId) {
                this.audioId = audioId;
                return this;
            }

            /**
             * The ID of the category.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The URL of the thumbnail.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the audio stream was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the audio file.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The download switch. The audio file can be downloaded offline only when the download switch is turned on. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
             */
            public Builder downloadSwitch(String downloadSwitch) {
                this.downloadSwitch = downloadSwitch;
                return this;
            }

            /**
             * The duration of the audio file.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The source of the audio file. Valid values:
             * <p>
             * 
             * *   **general**: The audio file is uploaded by using ApsaraVideo VOD.
             * *   **short_video**: The audio file is uploaded to ApsaraVideo VOD by using the short video SDK. For more information, see [Introduction](~~53407~~).
             * *   **editing**: The audio file is uploaded to ApsaraVideo VOD after online editing and production. For more information, see [ProduceEditingProjectVideo](~~68536~~).
             * *   **live**: The audio file is recorded and uploaded as a file to ApsaraVideo VOD.
             */
            public Builder mediaSource(String mediaSource) {
                this.mediaSource = mediaSource;
                return this;
            }

            /**
             * The time when the audio file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The preprocessing status. Only preprocessed videos can be used for live streaming in the production studio. Valid values:
             * <p>
             * 
             * *   **UnPreprocess**
             * *   **Preprocessing**
             * *   **PreprocessSucceed**
             * *   **PreprocessFailed**
             */
            public Builder preprocessStatus(String preprocessStatus) {
                this.preprocessStatus = preprocessStatus;
                return this;
            }

            /**
             * The period of time in which the audio file remains in the restored state.
             */
            public Builder restoreExpiration(String restoreExpiration) {
                this.restoreExpiration = restoreExpiration;
                return this;
            }

            /**
             * The restoration status of the audio file. Valid values:
             * <p>
             * 
             * *   **Processing**
             * *   **Success**
             * *   **Failed**
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
                return this;
            }

            /**
             * The size of the audio file.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The automatic snapshots.
             */
            public Builder snapshots(java.util.List < String > snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The sprite snapshots.
             */
            public Builder spriteSnapshots(java.util.List < String > spriteSnapshots) {
                this.spriteSnapshots = spriteSnapshots;
                return this;
            }

            /**
             * The status of the audio file. Valid values:
             * <p>
             * 
             * *   **Uploading**
             * *   **Normal**
             * *   **UploadFail**
             * *   **Deleted**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage class of the audio file. Valid values:
             * <p>
             * 
             * *   **Standard**: All media resources are stored as Standard objects.
             * *   **IA**: All media resources are stored as IA objects.
             * *   **Archive**: All media resources are stored as Archive objects.
             * *   **ColdArchive**: All media resources are stored as Cold Archive objects.
             * *   **SourceIA**: Only the source file is stored as an IA object.
             * *   **SourceArchive**: Only the source file is stored as an Archive object.
             * *   **SourceColdArchive**: Only the source file is stored as a Cold Archive object.
             * *   **Changing**: The storage class is being modified.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * The region in which the audio is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the audio file.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the audio file
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The transcoding mode. Valid values:
             * <p>
             * 
             * *   **FastTranscode**: The audio file is immediately transcoded after it is uploaded. You cannot play the file before it is transcoded.
             * *   **NoTranscode**: The audio file can be played without being transcoded. You can immediately play the file after it is uploaded.
             * *   **AsyncTranscode**: The audio file can be immediately played and asynchronously transcoded after it is uploaded.
             */
            public Builder transcodeMode(String transcodeMode) {
                this.transcodeMode = transcodeMode;
                return this;
            }

            public Audio build() {
                return new Audio(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

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

        @com.aliyun.core.annotation.NameInMap("URL")
        private String URL;

        private Image(Builder builder) {
            this.appId = builder.appId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.imageId = builder.imageId;
            this.modificationTime = builder.modificationTime;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String appId; 
            private Long cateId; 
            private String cateName; 
            private String creationTime; 
            private String description; 
            private String imageId; 
            private String modificationTime; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String URL; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the category.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The time when the image was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the image file.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the image file.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The time when the image file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The status of the image file.
             * <p>
             * 
             * *   **Uploading**
             * *   **Normal**
             * *   **UploadFail**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The region in which the image is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the image file.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the image file.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The URL of the image file.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class Video extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadSwitch")
        private String downloadSwitch;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("MediaSource")
        private String mediaSource;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("PreprocessStatus")
        private String preprocessStatus;

        @com.aliyun.core.annotation.NameInMap("RestoreExpiration")
        private String restoreExpiration;

        @com.aliyun.core.annotation.NameInMap("RestoreStatus")
        private String restoreStatus;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private java.util.List < String > snapshots;

        @com.aliyun.core.annotation.NameInMap("SpriteSnapshots")
        private java.util.List < String > spriteSnapshots;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TranscodeMode")
        private String transcodeMode;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private Video(Builder builder) {
            this.appId = builder.appId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.downloadSwitch = builder.downloadSwitch;
            this.duration = builder.duration;
            this.mediaSource = builder.mediaSource;
            this.modificationTime = builder.modificationTime;
            this.preprocessStatus = builder.preprocessStatus;
            this.restoreExpiration = builder.restoreExpiration;
            this.restoreStatus = builder.restoreStatus;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.spriteSnapshots = builder.spriteSnapshots;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.transcodeMode = builder.transcodeMode;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
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
         * @return downloadSwitch
         */
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return mediaSource
         */
        public String getMediaSource() {
            return this.mediaSource;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return preprocessStatus
         */
        public String getPreprocessStatus() {
            return this.preprocessStatus;
        }

        /**
         * @return restoreExpiration
         */
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        /**
         * @return restoreStatus
         */
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return snapshots
         */
        public java.util.List < String > getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return spriteSnapshots
         */
        public java.util.List < String > getSpriteSnapshots() {
            return this.spriteSnapshots;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
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
         * @return transcodeMode
         */
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String appId; 
            private Long cateId; 
            private String cateName; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String downloadSwitch; 
            private Float duration; 
            private String mediaSource; 
            private String modificationTime; 
            private String preprocessStatus; 
            private String restoreExpiration; 
            private String restoreStatus; 
            private Long size; 
            private java.util.List < String > snapshots; 
            private java.util.List < String > spriteSnapshots; 
            private String status; 
            private String storageClass; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String transcodeMode; 
            private String videoId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the category.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The URL of the thumbnail.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the video file.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The download switch. The video file can be downloaded offline only when the download switch is turned on. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
             */
            public Builder downloadSwitch(String downloadSwitch) {
                this.downloadSwitch = downloadSwitch;
                return this;
            }

            /**
             * The duration of the video file. Unit: seconds.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The source of the video file. Valid values:
             * <p>
             * 
             * *   **general**: The video file is uploaded by using ApsaraVideo VOD.
             * *   **short_video**: The video file is uploaded by using the short video SDK.
             * *   **editing**: The video file is produced after online editing.
             * *   **live**: The video stream is recorded and uploaded as a file.
             */
            public Builder mediaSource(String mediaSource) {
                this.mediaSource = mediaSource;
                return this;
            }

            /**
             * The time when the video file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The preprocessing status. Valid values:
             * <p>
             * 
             * *   **UnPreprocess**
             * *   **Preprocessing**
             * *   **PreprocessSucceed**
             * *   **PreprocessFailed**
             */
            public Builder preprocessStatus(String preprocessStatus) {
                this.preprocessStatus = preprocessStatus;
                return this;
            }

            /**
             * The period of time in which the video file remains in the restored state.
             */
            public Builder restoreExpiration(String restoreExpiration) {
                this.restoreExpiration = restoreExpiration;
                return this;
            }

            /**
             * The restoration status of the video file. Valid values:
             * <p>
             * 
             * *   **Processing**
             * *   **Success**
             * *   **Failed**
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
                return this;
            }

            /**
             * The size of the video file.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The automatic snapshots.
             */
            public Builder snapshots(java.util.List < String > snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The sprite snapshots.
             */
            public Builder spriteSnapshots(java.util.List < String > spriteSnapshots) {
                this.spriteSnapshots = spriteSnapshots;
                return this;
            }

            /**
             * The status of the file. Valid values:
             * <p>
             * 
             * *   **Uploading**
             * *   **UploadFail**
             * *   **UploadSucc**
             * *   **Transcoding**
             * *   **TranscodeFail**
             * *   **Blocked**
             * *   **Normal**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage class of the video file. Valid values:
             * <p>
             * 
             * *   **Standard**: All media resources are stored as Standard objects.
             * *   **IA**: All media resources are stored as IA objects.
             * *   **Archive**: All media resources are stored as Archive objects.
             * *   **ColdArchive**: All media resources are stored as Cold Archive objects.
             * *   **SourceIA**: Only the source file is stored as an IA object.
             * *   **SourceArchive**: Only the source file is stored as an Archive object.
             * *   **SourceColdArchive**: Only the source file is stored as a Cold Archive object.
             * *   **Changing**: The storage class of the video file is being changed.
             * *   **SourceChanging**: The storage class of the source file is being changed.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * The region in which the video is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the video file.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the video.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The transcoding mode. Valid values:
             * <p>
             * 
             * *   **FastTranscode**: The video file is immediately transcoded after it is uploaded. You cannot play the file before it is transcoded.
             * *   **NoTranscode**: The video file can be played without being transcoded. You can immediately play the file after it is uploaded.
             * *   **AsyncTranscode**: The video file can be immediately played and asynchronously transcoded after it is uploaded.
             */
            public Builder transcodeMode(String transcodeMode) {
                this.transcodeMode = transcodeMode;
                return this;
            }

            /**
             * The ID of the video file.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
    public static class MediaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiData")
        private AiData aiData;

        @com.aliyun.core.annotation.NameInMap("AiRoughData")
        private AiRoughData aiRoughData;

        @com.aliyun.core.annotation.NameInMap("AttachedMedia")
        private AttachedMedia attachedMedia;

        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Image")
        private Image image;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Video")
        private Video video;

        private MediaList(Builder builder) {
            this.aiData = builder.aiData;
            this.aiRoughData = builder.aiRoughData;
            this.attachedMedia = builder.attachedMedia;
            this.audio = builder.audio;
            this.creationTime = builder.creationTime;
            this.image = builder.image;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaList create() {
            return builder().build();
        }

        /**
         * @return aiData
         */
        public AiData getAiData() {
            return this.aiData;
        }

        /**
         * @return aiRoughData
         */
        public AiRoughData getAiRoughData() {
            return this.aiRoughData;
        }

        /**
         * @return attachedMedia
         */
        public AttachedMedia getAttachedMedia() {
            return this.attachedMedia;
        }

        /**
         * @return audio
         */
        public Audio getAudio() {
            return this.audio;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return image
         */
        public Image getImage() {
            return this.image;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        public static final class Builder {
            private AiData aiData; 
            private AiRoughData aiRoughData; 
            private AttachedMedia attachedMedia; 
            private Audio audio; 
            private String creationTime; 
            private Image image; 
            private String mediaId; 
            private String mediaType; 
            private Video video; 

            /**
             * Details about AI data.
             */
            public Builder aiData(AiData aiData) {
                this.aiData = aiData;
                return this;
            }

            /**
             * The basic information about AI data.
             */
            public Builder aiRoughData(AiRoughData aiRoughData) {
                this.aiRoughData = aiRoughData;
                return this;
            }

            /**
             * [The information about the auxiliary media asset](~~86991~~).
             */
            public Builder attachedMedia(AttachedMedia attachedMedia) {
                this.attachedMedia = attachedMedia;
                return this;
            }

            /**
             * [The information about the audio](~~86991~~).
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * The time when the media asset was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * [The information about the image](~~86991~~).
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            /**
             * The ID of the file.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The type of the media asset. Valid values:
             * <p>
             * 
             * *   **video**
             * *   **audio**
             * *   **image**
             * *   **attached**
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * [The information about the video](~~86991~~).
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            public MediaList build() {
                return new MediaList(this);
            } 

        } 

    }
}
