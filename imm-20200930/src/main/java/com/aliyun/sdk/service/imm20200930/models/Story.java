// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Story} extends {@link TeaModel}
 *
 * <p>Story</p>
 */
public class Story extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<Address> addresses;

    @com.aliyun.core.annotation.NameInMap("Cover")
    private File cover;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map<String, ?> customLabels;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("FigureClusterIds")
    private java.util.List<String> figureClusterIds;

    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<File> files;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("StoryEndTime")
    private String storyEndTime;

    @com.aliyun.core.annotation.NameInMap("StoryName")
    private String storyName;

    @com.aliyun.core.annotation.NameInMap("StoryStartTime")
    private String storyStartTime;

    @com.aliyun.core.annotation.NameInMap("StorySubType")
    private String storySubType;

    @com.aliyun.core.annotation.NameInMap("StoryType")
    private String storyType;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private Story(Builder builder) {
        this.addresses = builder.addresses;
        this.cover = builder.cover;
        this.createTime = builder.createTime;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.figureClusterIds = builder.figureClusterIds;
        this.files = builder.files;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
        this.storyEndTime = builder.storyEndTime;
        this.storyName = builder.storyName;
        this.storyStartTime = builder.storyStartTime;
        this.storySubType = builder.storySubType;
        this.storyType = builder.storyType;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Story create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addresses
     */
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    /**
     * @return cover
     */
    public File getCover() {
        return this.cover;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * @return customLabels
     */
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return figureClusterIds
     */
    public java.util.List<String> getFigureClusterIds() {
        return this.figureClusterIds;
    }

    /**
     * @return files
     */
    public java.util.List<File> getFiles() {
        return this.files;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return storyEndTime
     */
    public String getStoryEndTime() {
        return this.storyEndTime;
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
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.List<Address> addresses; 
        private File cover; 
        private String createTime; 
        private String customId; 
        private java.util.Map<String, ?> customLabels; 
        private String datasetName; 
        private java.util.List<String> figureClusterIds; 
        private java.util.List<File> files; 
        private String objectId; 
        private String objectType; 
        private String ownerId; 
        private String projectName; 
        private String storyEndTime; 
        private String storyName; 
        private String storyStartTime; 
        private String storySubType; 
        private String storyType; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(Story model) {
            this.addresses = model.addresses;
            this.cover = model.cover;
            this.createTime = model.createTime;
            this.customId = model.customId;
            this.customLabels = model.customLabels;
            this.datasetName = model.datasetName;
            this.figureClusterIds = model.figureClusterIds;
            this.files = model.files;
            this.objectId = model.objectId;
            this.objectType = model.objectType;
            this.ownerId = model.ownerId;
            this.projectName = model.projectName;
            this.storyEndTime = model.storyEndTime;
            this.storyName = model.storyName;
            this.storyStartTime = model.storyStartTime;
            this.storySubType = model.storySubType;
            this.storyType = model.storyType;
            this.updateTime = model.updateTime;
        } 

        /**
         * Addresses.
         */
        public Builder addresses(java.util.List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * Cover.
         */
        public Builder cover(File cover) {
            this.cover = cover;
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
         * CustomId.
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map<String, ?> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * FigureClusterIds.
         */
        public Builder figureClusterIds(java.util.List<String> figureClusterIds) {
            this.figureClusterIds = figureClusterIds;
            return this;
        }

        /**
         * Files.
         */
        public Builder files(java.util.List<File> files) {
            this.files = files;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * StoryEndTime.
         */
        public Builder storyEndTime(String storyEndTime) {
            this.storyEndTime = storyEndTime;
            return this;
        }

        /**
         * StoryName.
         */
        public Builder storyName(String storyName) {
            this.storyName = storyName;
            return this;
        }

        /**
         * StoryStartTime.
         */
        public Builder storyStartTime(String storyStartTime) {
            this.storyStartTime = storyStartTime;
            return this;
        }

        /**
         * StorySubType.
         */
        public Builder storySubType(String storySubType) {
            this.storySubType = storySubType;
            return this;
        }

        /**
         * StoryType.
         */
        public Builder storyType(String storyType) {
            this.storyType = storyType;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Story build() {
            return new Story(this);
        } 

    } 

}
