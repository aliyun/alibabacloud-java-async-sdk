// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the media assets.</p>
         */
        public Builder mediaList(java.util.List < MediaList> mediaList) {
            this.mediaList = mediaList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3E0CEF83-FB09-4E34-BA1451814B03****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The pagination identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>24e0fba7188fae707e146esa54****</p>
         */
        public Builder scrollToken(String scrollToken) {
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * <p>The total number of data records that meet the specified filter criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaResponseBody build() {
            return new SearchMediaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The start time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4</p>
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>0.75287705</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The end time of the clip.</p>
             * 
             * <strong>example:</strong>
             * <p>2.5</p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The category.</p>
             * 
             * <strong>example:</strong>
             * <p>Transportation</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>10310250338</p>
             */
            public Builder labelId(String labelId) {
                this.labelId = labelId;
                return this;
            }

            /**
             * <p>The name of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Vehicles</p>
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            /**
             * <p>The clips.</p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The text content.</p>
             * 
             * <strong>example:</strong>
             * <p>I&quot;m Jane.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The start time of the subtitle.</p>
             * 
             * <strong>example:</strong>
             * <p>1.4</p>
             */
            public Builder from(Double from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The end time of the subtitle.</p>
             * 
             * <strong>example:</strong>
             * <p>2.5</p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The AI tags.</p>
             */
            public Builder aiLabelInfo(java.util.List < AiLabelInfo> aiLabelInfo) {
                this.aiLabelInfo = aiLabelInfo;
                return this;
            }

            /**
             * <p>The information about subtitles.</p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The AI category.</p>
             * 
             * <strong>example:</strong>
             * <p>TV series</p>
             */
            public Builder aiCategory(String aiCategory) {
                this.aiCategory = aiCategory;
                return this;
            }

            /**
             * <p>The ID of the AI task.</p>
             * 
             * <strong>example:</strong>
             * <p>cd35b0b0025f71edbfcb472190a9xxxx</p>
             */
            public Builder aiJobId(String aiJobId) {
                this.aiJobId = aiJobId;
                return this;
            }

            /**
             * <p>The save type.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder saveType(String saveType) {
                this.saveType = saveType;
                return this;
            }

            /**
             * <p>The data status.</p>
             * 
             * <strong>example:</strong>
             * <p>SaveSuccess</p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
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
             * <p>The category ID of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>10027394</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The level of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The ID of the parent node.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
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
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The type of the auxiliary media asset. Valid values:</p>
             * <ul>
             * <li><strong>watermark</strong></li>
             * <li><strong>subtitle</strong></li>
             * <li><strong>material</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>watermark</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The list of category IDs.</p>
             */
            public Builder categories(java.util.List < Categories> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The time when the auxiliary media asset was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:45:25Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>test3</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>a82a2cd7d4e147ba0ed6c1ee372****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The time when the auxiliary media asset was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:48:25Z</p>
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
             * <p>The region in which the auxiliary media asset is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>outin-bfefbb90a47c11*****7426.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The URL of the auxiliary media asset.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/****.png">https://example.com/****.png</a></p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>a82a2cd7d4e147bbed6c1ee372****</p>
             */
            public Builder audioId(String audioId) {
                this.audioId = audioId;
                return this;
            }

            /**
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>10000123</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>ceshi</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The URL of the thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/image04.jpg">http://example.com/image04.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the audio stream was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:45:25Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>audio description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The download switch. The audio file can be downloaded offline only when the download switch is turned on. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder downloadSwitch(String downloadSwitch) {
                this.downloadSwitch = downloadSwitch;
                return this;
            }

            /**
             * <p>The duration of the audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The source of the audio file. Valid values:</p>
             * <ul>
             * <li><strong>general</strong>: The audio file is uploaded by using ApsaraVideo VOD.</li>
             * <li><strong>short_video</strong>: The audio file is uploaded to ApsaraVideo VOD by using the short video SDK. For more information, see <a href="https://help.aliyun.com/document_detail/53407.html">Introduction</a>.</li>
             * <li><strong>editing</strong>: The audio file is uploaded to ApsaraVideo VOD after online editing and production. For more information, see <a href="https://help.aliyun.com/document_detail/68536.html">ProduceEditingProjectVideo</a>.</li>
             * <li><strong>live</strong>: The audio file is recorded and uploaded as a file to ApsaraVideo VOD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder mediaSource(String mediaSource) {
                this.mediaSource = mediaSource;
                return this;
            }

            /**
             * <p>The time when the audio file was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:48:25Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The preprocessing status. Only preprocessed videos can be used for live streaming in the production studio. Valid values:</p>
             * <ul>
             * <li><strong>UnPreprocess</strong></li>
             * <li><strong>Preprocessing</strong></li>
             * <li><strong>PreprocessSucceed</strong></li>
             * <li><strong>PreprocessFailed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UnPreprocess</p>
             */
            public Builder preprocessStatus(String preprocessStatus) {
                this.preprocessStatus = preprocessStatus;
                return this;
            }

            /**
             * <p>The period of time in which the audio file remains in the restored state.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-30T10:14:14Z</p>
             */
            public Builder restoreExpiration(String restoreExpiration) {
                this.restoreExpiration = restoreExpiration;
                return this;
            }

            /**
             * <p>The restoration status of the audio file. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong></li>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
                return this;
            }

            /**
             * <p>The size of the audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The automatic snapshots.</p>
             */
            public Builder snapshots(java.util.List < String > snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The sprite snapshots.</p>
             */
            public Builder spriteSnapshots(java.util.List < String > spriteSnapshots) {
                this.spriteSnapshots = spriteSnapshots;
                return this;
            }

            /**
             * <p>The status of the audio file. Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong></li>
             * <li><strong>Normal</strong></li>
             * <li><strong>UploadFail</strong></li>
             * <li><strong>Deleted</strong></li>
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
             * <p>The storage class of the audio file. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: All media resources are stored as Standard objects.</li>
             * <li><strong>IA</strong>: All media resources are stored as IA objects.</li>
             * <li><strong>Archive</strong>: All media resources are stored as Archive objects.</li>
             * <li><strong>ColdArchive</strong>: All media resources are stored as Cold Archive objects.</li>
             * <li><strong>SourceIA</strong>: Only the source file is stored as an IA object.</li>
             * <li><strong>SourceArchive</strong>: Only the source file is stored as an Archive object.</li>
             * <li><strong>SourceColdArchive</strong>: Only the source file is stored as a Cold Archive object.</li>
             * <li><strong>Changing</strong>: The storage class is being modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The region in which the audio is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>outin-aaa*****aa.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1,tag2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the audio file</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The transcoding mode. Valid values:</p>
             * <ul>
             * <li><strong>FastTranscode</strong>: The audio file is immediately transcoded after it is uploaded. You cannot play the file before it is transcoded.</li>
             * <li><strong>NoTranscode</strong>: The audio file can be played without being transcoded. You can immediately play the file after it is uploaded.</li>
             * <li><strong>AsyncTranscode</strong>: The audio file can be immediately played and asynchronously transcoded after it is uploaded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FastTranscode</p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>1000123</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>beauty</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The time when the image was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:45:25Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the image file.</p>
             * 
             * <strong>example:</strong>
             * <p>image test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the image file.</p>
             * 
             * <strong>example:</strong>
             * <p>11130843741se99wqmoes****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The time when the image file was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:48:25Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The status of the image file.</p>
             * <ul>
             * <li><strong>Uploading</strong></li>
             * <li><strong>Normal</strong></li>
             * <li><strong>UploadFail</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Uploading</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The region in which the image is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>outin-bfefbb90a47c******163e1c7426.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the image file.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the image file.</p>
             * 
             * <strong>example:</strong>
             * <p>image1</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The URL of the image file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/****.png">https://example.com/****.png</a></p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>10000123</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>video1</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The URL of the thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com/image01.png">https://example.aliyundoc.com/image01.png</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the video file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:45:25Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the video file.</p>
             * 
             * <strong>example:</strong>
             * <p>Video test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The download switch. The video file can be downloaded offline only when the download switch is turned on. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder downloadSwitch(String downloadSwitch) {
                this.downloadSwitch = downloadSwitch;
                return this;
            }

            /**
             * <p>The duration of the video file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The source of the video file. Valid values:</p>
             * <ul>
             * <li><strong>general</strong>: The video file is uploaded by using ApsaraVideo VOD.</li>
             * <li><strong>short_video</strong>: The video file is uploaded by using the short video SDK.</li>
             * <li><strong>editing</strong>: The video file is produced after online editing.</li>
             * <li><strong>live</strong>: The video stream is recorded and uploaded as a file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder mediaSource(String mediaSource) {
                this.mediaSource = mediaSource;
                return this;
            }

            /**
             * <p>The time when the video file was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:48:25Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The preprocessing status. Valid values:</p>
             * <ul>
             * <li><strong>UnPreprocess</strong></li>
             * <li><strong>Preprocessing</strong></li>
             * <li><strong>PreprocessSucceed</strong></li>
             * <li><strong>PreprocessFailed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Preprocessing</p>
             */
            public Builder preprocessStatus(String preprocessStatus) {
                this.preprocessStatus = preprocessStatus;
                return this;
            }

            /**
             * <p>The period of time in which the video file remains in the restored state.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-30T10:14:14Z</p>
             */
            public Builder restoreExpiration(String restoreExpiration) {
                this.restoreExpiration = restoreExpiration;
                return this;
            }

            /**
             * <p>The restoration status of the video file. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong></li>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
                return this;
            }

            /**
             * <p>The size of the video file.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The automatic snapshots.</p>
             */
            public Builder snapshots(java.util.List < String > snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The sprite snapshots.</p>
             */
            public Builder spriteSnapshots(java.util.List < String > spriteSnapshots) {
                this.spriteSnapshots = spriteSnapshots;
                return this;
            }

            /**
             * <p>The status of the file. Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong></li>
             * <li><strong>UploadFail</strong></li>
             * <li><strong>UploadSucc</strong></li>
             * <li><strong>Transcoding</strong></li>
             * <li><strong>TranscodeFail</strong></li>
             * <li><strong>Blocked</strong></li>
             * <li><strong>Normal</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UploadSucc</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage class of the video file. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: All media resources are stored as Standard objects.</li>
             * <li><strong>IA</strong>: All media resources are stored as IA objects.</li>
             * <li><strong>Archive</strong>: All media resources are stored as Archive objects.</li>
             * <li><strong>ColdArchive</strong>: All media resources are stored as Cold Archive objects.</li>
             * <li><strong>SourceIA</strong>: Only the source file is stored as an IA object.</li>
             * <li><strong>SourceArchive</strong>: Only the source file is stored as an Archive object.</li>
             * <li><strong>SourceColdArchive</strong>: Only the source file is stored as a Cold Archive object.</li>
             * <li><strong>Changing</strong>: The storage class of the video file is being changed.</li>
             * <li><strong>SourceChanging</strong>: The storage class of the source file is being changed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The region in which the video is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>outin-bfefbb90a47c******163e1c7426.oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the video file.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>ceshi</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The transcoding mode. Valid values:</p>
             * <ul>
             * <li><strong>FastTranscode</strong>: The video file is immediately transcoded after it is uploaded. You cannot play the file before it is transcoded.</li>
             * <li><strong>NoTranscode</strong>: The video file can be played without being transcoded. You can immediately play the file after it is uploaded.</li>
             * <li><strong>AsyncTranscode</strong>: The video file can be immediately played and asynchronously transcoded after it is uploaded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FastTranscode</p>
             */
            public Builder transcodeMode(String transcodeMode) {
                this.transcodeMode = transcodeMode;
                return this;
            }

            /**
             * <p>The ID of the video file.</p>
             * 
             * <strong>example:</strong>
             * <p>a82a2asdasqadaf3faa0ed6c1ee372****</p>
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
    /**
     * 
     * {@link SearchMediaResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMediaResponseBody</p>
     */
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
             * <p>Details about AI data.</p>
             */
            public Builder aiData(AiData aiData) {
                this.aiData = aiData;
                return this;
            }

            /**
             * <p>The basic information about AI data.</p>
             */
            public Builder aiRoughData(AiRoughData aiRoughData) {
                this.aiRoughData = aiRoughData;
                return this;
            }

            /**
             * <p><a href="https://help.aliyun.com/document_detail/86991.html">The information about the auxiliary media asset</a>.</p>
             */
            public Builder attachedMedia(AttachedMedia attachedMedia) {
                this.attachedMedia = attachedMedia;
                return this;
            }

            /**
             * <p><a href="https://help.aliyun.com/document_detail/86991.html">The information about the audio</a>.</p>
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The time when the media asset was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>hh:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-19T03:45:25Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p><a href="https://help.aliyun.com/document_detail/86991.html">The information about the image</a>.</p>
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>a82a2cd7d4e147bbed6c1ee372****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The type of the media asset. Valid values:</p>
             * <ul>
             * <li><strong>video</strong></li>
             * <li><strong>audio</strong></li>
             * <li><strong>image</strong></li>
             * <li><strong>attached</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p><a href="https://help.aliyun.com/document_detail/86991.html">The information about the video</a>.</p>
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
