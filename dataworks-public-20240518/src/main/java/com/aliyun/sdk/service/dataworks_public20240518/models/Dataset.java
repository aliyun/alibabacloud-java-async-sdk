// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link Dataset} extends {@link TeaModel}
 *
 * <p>Dataset</p>
 */
public class Dataset extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<DatasetLabel> labels;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private DatasetVersion latestVersion;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.NameInMap("Readme")
    private String readme;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private Dataset(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
        this.dataType = builder.dataType;
        this.id = builder.id;
        this.labels = builder.labels;
        this.latestVersion = builder.latestVersion;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.origin = builder.origin;
        this.projectId = builder.projectId;
        this.readme = builder.readme;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Dataset create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return labels
     */
    public java.util.List<DatasetLabel> getLabels() {
        return this.labels;
    }

    /**
     * @return latestVersion
     */
    public DatasetVersion getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return readme
     */
    public String getReadme() {
        return this.readme;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder {
        private String comment; 
        private Long createTime; 
        private String creatorId; 
        private String dataType; 
        private String id; 
        private java.util.List<DatasetLabel> labels; 
        private DatasetVersion latestVersion; 
        private Long modifyTime; 
        private String name; 
        private String origin; 
        private Long projectId; 
        private String readme; 
        private String storageType; 

        private Builder() {
        } 

        private Builder(Dataset model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.creatorId = model.creatorId;
            this.dataType = model.dataType;
            this.id = model.id;
            this.labels = model.labels;
            this.latestVersion = model.latestVersion;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.origin = model.origin;
            this.projectId = model.projectId;
            this.readme = model.readme;
            this.storageType = model.storageType;
        } 

        /**
         * <p>The description of the dataset. The length cannot exceed 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>测试数据集</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1736756055000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>210484359</p>
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The data type. Valid values:</p>
         * <ul>
         * <li>COMMON</li>
         * <li>PIC</li>
         * <li>TEXT</li>
         * <li>TABLE</li>
         * <li>VIDEO</li>
         * <li>AUDIO</li>
         * <li>INDEX</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-dataset:1gxxxqjx155usz3hrv</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Dataset tags. Supported only for PAI datasets.</p>
         */
        public Builder labels(java.util.List<DatasetLabel> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The latest dataset version object.</p>
         */
        public Builder latestVersion(DatasetVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The modification time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1736756055000</p>
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The dataset name. It must be a non-empty string and cannot exceed 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>test_dataset</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The source of the dataset. Currently supported sources:</p>
         * <ul>
         * <li>DataWorks</li>
         * <li>PAI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataWorks</p>
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Instructions for using the dataset. Markdown rich text is supported.</p>
         * 
         * <strong>example:</strong>
         * <h2>introduction</h2>
         */
        public Builder readme(String readme) {
            this.readme = readme;
            return this;
        }

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>OSS: Object Storage Service</li>
         * <li>NAS: General-purpose NAS file systems</li>
         * <li>EXTREM_NAS: Extreme NAS file systems</li>
         * <li>DLF_LANCE: Data Lake Formation</li>
         * <li>CPFS: Cloud Paralleled File System</li>
         * <li>BMCPFS: CPFS for Lingjun</li>
         * <li>MAXCOMPUTE: MaxCompute table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        public Dataset build() {
            return new Dataset(this);
        } 

    } 

}
