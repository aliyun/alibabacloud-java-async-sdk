// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Story} extends {@link TeaModel}
 *
 * <p>Story</p>
 */
public class Story extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cover_file_id")
    private String coverFileId;

    @com.aliyun.core.annotation.NameInMap("cover_file_thumbnail_url")
    private String coverFileThumbnailUrl;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("custom_labels")
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.NameInMap("face_group_ids")
    private java.util.List < String > faceGroupIds;

    @com.aliyun.core.annotation.NameInMap("story_end_time")
    private String storyEndTime;

    @com.aliyun.core.annotation.NameInMap("story_file_list")
    private java.util.List < File > storyFileList;

    @com.aliyun.core.annotation.NameInMap("story_id")
    private String storyId;

    @com.aliyun.core.annotation.NameInMap("story_name")
    private String storyName;

    @com.aliyun.core.annotation.NameInMap("story_start_time")
    private String storyStartTime;

    @com.aliyun.core.annotation.NameInMap("story_sub_type")
    private String storySubType;

    @com.aliyun.core.annotation.NameInMap("story_type")
    private String storyType;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    private Story(Builder builder) {
        this.coverFileId = builder.coverFileId;
        this.coverFileThumbnailUrl = builder.coverFileThumbnailUrl;
        this.createdAt = builder.createdAt;
        this.customLabels = builder.customLabels;
        this.faceGroupIds = builder.faceGroupIds;
        this.storyEndTime = builder.storyEndTime;
        this.storyFileList = builder.storyFileList;
        this.storyId = builder.storyId;
        this.storyName = builder.storyName;
        this.storyStartTime = builder.storyStartTime;
        this.storySubType = builder.storySubType;
        this.storyType = builder.storyType;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Story create() {
        return builder().build();
    }

    /**
     * @return coverFileId
     */
    public String getCoverFileId() {
        return this.coverFileId;
    }

    /**
     * @return coverFileThumbnailUrl
     */
    public String getCoverFileThumbnailUrl() {
        return this.coverFileThumbnailUrl;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return customLabels
     */
    public java.util.Map < String, ? > getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return faceGroupIds
     */
    public java.util.List < String > getFaceGroupIds() {
        return this.faceGroupIds;
    }

    /**
     * @return storyEndTime
     */
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    /**
     * @return storyFileList
     */
    public java.util.List < File > getStoryFileList() {
        return this.storyFileList;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
    }

    /**
     * @return storyName
     */
    public String getStoryName() {
        return this.storyName;
    }

    /**
     * @return storyStartTime
     */
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    /**
     * @return storySubType
     */
    public String getStorySubType() {
        return this.storySubType;
    }

    /**
     * @return storyType
     */
    public String getStoryType() {
        return this.storyType;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String coverFileId; 
        private String coverFileThumbnailUrl; 
        private String createdAt; 
        private java.util.Map < String, ? > customLabels; 
        private java.util.List < String > faceGroupIds; 
        private String storyEndTime; 
        private java.util.List < File > storyFileList; 
        private String storyId; 
        private String storyName; 
        private String storyStartTime; 
        private String storySubType; 
        private String storyType; 
        private String updatedAt; 

        /**
         * cover_file_id.
         */
        public Builder coverFileId(String coverFileId) {
            this.coverFileId = coverFileId;
            return this;
        }

        /**
         * cover_file_thumbnail_url.
         */
        public Builder coverFileThumbnailUrl(String coverFileThumbnailUrl) {
            this.coverFileThumbnailUrl = coverFileThumbnailUrl;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * custom_labels.
         */
        public Builder customLabels(java.util.Map < String, ? > customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * face_group_ids.
         */
        public Builder faceGroupIds(java.util.List < String > faceGroupIds) {
            this.faceGroupIds = faceGroupIds;
            return this;
        }

        /**
         * story_end_time.
         */
        public Builder storyEndTime(String storyEndTime) {
            this.storyEndTime = storyEndTime;
            return this;
        }

        /**
         * story_file_list.
         */
        public Builder storyFileList(java.util.List < File > storyFileList) {
            this.storyFileList = storyFileList;
            return this;
        }

        /**
         * story_id.
         */
        public Builder storyId(String storyId) {
            this.storyId = storyId;
            return this;
        }

        /**
         * story_name.
         */
        public Builder storyName(String storyName) {
            this.storyName = storyName;
            return this;
        }

        /**
         * story_start_time.
         */
        public Builder storyStartTime(String storyStartTime) {
            this.storyStartTime = storyStartTime;
            return this;
        }

        /**
         * story_sub_type.
         */
        public Builder storySubType(String storySubType) {
            this.storySubType = storySubType;
            return this;
        }

        /**
         * story_type.
         */
        public Builder storyType(String storyType) {
            this.storyType = storyType;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Story build() {
            return new Story(this);
        } 

    } 

}
