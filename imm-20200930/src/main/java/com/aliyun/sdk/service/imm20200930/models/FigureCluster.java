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
 * {@link FigureCluster} extends {@link TeaModel}
 *
 * <p>FigureCluster</p>
 */
public class FigureCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AverageAge")
    private Float averageAge;

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

    @com.aliyun.core.annotation.NameInMap("FaceCount")
    private Long faceCount;

    @com.aliyun.core.annotation.NameInMap("Gender")
    private String gender;

    @com.aliyun.core.annotation.NameInMap("ImageCount")
    private Long imageCount;

    @com.aliyun.core.annotation.NameInMap("MaxAge")
    private Float maxAge;

    @com.aliyun.core.annotation.NameInMap("MetaLockVersion")
    private Long metaLockVersion;

    @com.aliyun.core.annotation.NameInMap("MinAge")
    private Float minAge;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("VideoCount")
    private Long videoCount;

    private FigureCluster(Builder builder) {
        this.averageAge = builder.averageAge;
        this.cover = builder.cover;
        this.createTime = builder.createTime;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.faceCount = builder.faceCount;
        this.gender = builder.gender;
        this.imageCount = builder.imageCount;
        this.maxAge = builder.maxAge;
        this.metaLockVersion = builder.metaLockVersion;
        this.minAge = builder.minAge;
        this.name = builder.name;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
        this.updateTime = builder.updateTime;
        this.videoCount = builder.videoCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FigureCluster create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return averageAge
     */
    public Float getAverageAge() {
        return this.averageAge;
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
     * @return faceCount
     */
    public Long getFaceCount() {
        return this.faceCount;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return imageCount
     */
    public Long getImageCount() {
        return this.imageCount;
    }

    /**
     * @return maxAge
     */
    public Float getMaxAge() {
        return this.maxAge;
    }

    /**
     * @return metaLockVersion
     */
    public Long getMetaLockVersion() {
        return this.metaLockVersion;
    }

    /**
     * @return minAge
     */
    public Float getMinAge() {
        return this.minAge;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return videoCount
     */
    public Long getVideoCount() {
        return this.videoCount;
    }

    public static final class Builder {
        private Float averageAge; 
        private File cover; 
        private String createTime; 
        private String customId; 
        private java.util.Map<String, ?> customLabels; 
        private String datasetName; 
        private Long faceCount; 
        private String gender; 
        private Long imageCount; 
        private Float maxAge; 
        private Long metaLockVersion; 
        private Float minAge; 
        private String name; 
        private String objectId; 
        private String objectType; 
        private String ownerId; 
        private String projectName; 
        private String updateTime; 
        private Long videoCount; 

        private Builder() {
        } 

        private Builder(FigureCluster model) {
            this.averageAge = model.averageAge;
            this.cover = model.cover;
            this.createTime = model.createTime;
            this.customId = model.customId;
            this.customLabels = model.customLabels;
            this.datasetName = model.datasetName;
            this.faceCount = model.faceCount;
            this.gender = model.gender;
            this.imageCount = model.imageCount;
            this.maxAge = model.maxAge;
            this.metaLockVersion = model.metaLockVersion;
            this.minAge = model.minAge;
            this.name = model.name;
            this.objectId = model.objectId;
            this.objectType = model.objectType;
            this.ownerId = model.ownerId;
            this.projectName = model.projectName;
            this.updateTime = model.updateTime;
            this.videoCount = model.videoCount;
        } 

        /**
         * AverageAge.
         */
        public Builder averageAge(Float averageAge) {
            this.averageAge = averageAge;
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
         * FaceCount.
         */
        public Builder faceCount(Long faceCount) {
            this.faceCount = faceCount;
            return this;
        }

        /**
         * Gender.
         */
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * ImageCount.
         */
        public Builder imageCount(Long imageCount) {
            this.imageCount = imageCount;
            return this;
        }

        /**
         * MaxAge.
         */
        public Builder maxAge(Float maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        /**
         * MetaLockVersion.
         */
        public Builder metaLockVersion(Long metaLockVersion) {
            this.metaLockVersion = metaLockVersion;
            return this;
        }

        /**
         * MinAge.
         */
        public Builder minAge(Float minAge) {
            this.minAge = minAge;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * VideoCount.
         */
        public Builder videoCount(Long videoCount) {
            this.videoCount = videoCount;
            return this;
        }

        public FigureCluster build() {
            return new FigureCluster(this);
        } 

    } 

}
