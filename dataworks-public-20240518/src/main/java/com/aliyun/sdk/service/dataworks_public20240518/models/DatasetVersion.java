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
 * {@link DatasetVersion} extends {@link TeaModel}
 *
 * <p>DatasetVersion</p>
 */
public class DatasetVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("ImportInfo")
    private java.util.Map<String, String> importInfo;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<DatasetLabel> labels;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("MountPath")
    private String mountPath;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("VersionNumber")
    private Integer versionNumber;

    private DatasetVersion(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
        this.datasetId = builder.datasetId;
        this.id = builder.id;
        this.importInfo = builder.importInfo;
        this.labels = builder.labels;
        this.modifyTime = builder.modifyTime;
        this.mountPath = builder.mountPath;
        this.storageType = builder.storageType;
        this.url = builder.url;
        this.versionNumber = builder.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetVersion create() {
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
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return importInfo
     */
    public java.util.Map<String, String> getImportInfo() {
        return this.importInfo;
    }

    /**
     * @return labels
     */
    public java.util.List<DatasetLabel> getLabels() {
        return this.labels;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return versionNumber
     */
    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    public static final class Builder {
        private String comment; 
        private Long createTime; 
        private String creatorId; 
        private String datasetId; 
        private String id; 
        private java.util.Map<String, String> importInfo; 
        private java.util.List<DatasetLabel> labels; 
        private Long modifyTime; 
        private String mountPath; 
        private String storageType; 
        private String url; 
        private Integer versionNumber; 

        private Builder() {
        } 

        private Builder(DatasetVersion model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.creatorId = model.creatorId;
            this.datasetId = model.datasetId;
            this.id = model.id;
            this.importInfo = model.importInfo;
            this.labels = model.labels;
            this.modifyTime = model.modifyTime;
            this.mountPath = model.mountPath;
            this.storageType = model.storageType;
            this.url = model.url;
            this.versionNumber = model.versionNumber;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * ImportInfo.
         */
        public Builder importInfo(java.util.Map<String, String> importInfo) {
            this.importInfo = importInfo;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<DatasetLabel> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * MountPath.
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * VersionNumber.
         */
        public Builder versionNumber(Integer versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        public DatasetVersion build() {
            return new DatasetVersion(this);
        } 

    } 

}
