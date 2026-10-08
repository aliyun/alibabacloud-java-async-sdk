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
         * <p>The average age.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        public Builder averageAge(Float averageAge) {
            this.averageAge = averageAge;
            return this;
        }

        /**
         * <p>The cover image.</p>
         */
        public Builder cover(File cover) {
            this.cover = cover;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-14T10:10:52.83948013+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The custom ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * <p>The custom labels. You can search for clusters by label.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
         */
        public Builder customLabels(java.util.Map<String, ?> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset001</p>
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The number of faces.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder faceCount(Long faceCount) {
            this.faceCount = faceCount;
            return this;
        }

        /**
         * <p>The gender.</p>
         * 
         * <strong>example:</strong>
         * <p>female</p>
         */
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * <p>The number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder imageCount(Long imageCount) {
            this.imageCount = imageCount;
            return this;
        }

        /**
         * <p>The maximum age.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        public Builder maxAge(Float maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        /**
         * <p>The version of the metadata lock. A metadata lock version can be obtained by using a get or list operation. If you include the MetaLockVersion parameter in a request to update the cluster, the server checks consistency between the MetaLockVersion parameter value sent in the request and the one on the server side and updates the cluster only when they are consistent. This parameter prevents update conflicts in concurrent scenarios. The initial version is 0. The version is automatically increased by 1 after each successful update.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder metaLockVersion(Long metaLockVersion) {
            this.metaLockVersion = metaLockVersion;
            return this;
        }

        /**
         * <p>The minimum age.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder minAge(Float minAge) {
            this.minAge = minAge;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster-ae6e3472-999e-410b-b54e-cd5dba****</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The type of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>figure-cluster</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102321002****</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-14T10:10:52.83948013+08:00</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The number of videos.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
