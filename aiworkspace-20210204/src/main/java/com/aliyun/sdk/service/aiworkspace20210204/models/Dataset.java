// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("ImportInfo")
    private String importInfo;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private DatasetVersion latestVersion;

    @com.aliyun.core.annotation.NameInMap("MountAccess")
    private String mountAccess;

    @com.aliyun.core.annotation.NameInMap("MountAccessReadWriteRoleIdList")
    private java.util.List<String> mountAccessReadWriteRoleIdList;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("Property")
    private String property;

    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    @com.aliyun.core.annotation.NameInMap("SourceDatasetId")
    private String sourceDatasetId;

    @com.aliyun.core.annotation.NameInMap("SourceDatasetVersion")
    private String sourceDatasetVersion;

    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("TagTemplateType")
    private String tagTemplateType;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Dataset(Builder builder) {
        this.accessibility = builder.accessibility;
        this.dataSourceType = builder.dataSourceType;
        this.dataType = builder.dataType;
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.importInfo = builder.importInfo;
        this.labels = builder.labels;
        this.latestVersion = builder.latestVersion;
        this.mountAccess = builder.mountAccess;
        this.mountAccessReadWriteRoleIdList = builder.mountAccessReadWriteRoleIdList;
        this.name = builder.name;
        this.options = builder.options;
        this.ownerId = builder.ownerId;
        this.property = builder.property;
        this.providerType = builder.providerType;
        this.sourceDatasetId = builder.sourceDatasetId;
        this.sourceDatasetVersion = builder.sourceDatasetVersion;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.tagTemplateType = builder.tagTemplateType;
        this.uri = builder.uri;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Dataset create() {
        return builder().build();
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return importInfo
     */
    public String getImportInfo() {
        return this.importInfo;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return latestVersion
     */
    public DatasetVersion getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return mountAccess
     */
    public String getMountAccess() {
        return this.mountAccess;
    }

    /**
     * @return mountAccessReadWriteRoleIdList
     */
    public java.util.List<String> getMountAccessReadWriteRoleIdList() {
        return this.mountAccessReadWriteRoleIdList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return property
     */
    public String getProperty() {
        return this.property;
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
    }

    /**
     * @return sourceDatasetId
     */
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

    /**
     * @return sourceDatasetVersion
     */
    public String getSourceDatasetVersion() {
        return this.sourceDatasetVersion;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return tagTemplateType
     */
    public String getTagTemplateType() {
        return this.tagTemplateType;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String dataSourceType; 
        private String dataType; 
        private String datasetId; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String importInfo; 
        private java.util.List<Label> labels; 
        private DatasetVersion latestVersion; 
        private String mountAccess; 
        private java.util.List<String> mountAccessReadWriteRoleIdList; 
        private String name; 
        private String options; 
        private String ownerId; 
        private String property; 
        private String providerType; 
        private String sourceDatasetId; 
        private String sourceDatasetVersion; 
        private String sourceId; 
        private String sourceType; 
        private String tagTemplateType; 
        private String uri; 
        private String userId; 
        private String workspaceId; 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * ImportInfo.
         */
        public Builder importInfo(String importInfo) {
            this.importInfo = importInfo;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * LatestVersion.
         */
        public Builder latestVersion(DatasetVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * MountAccess.
         */
        public Builder mountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }

        /**
         * MountAccessReadWriteRoleIdList.
         */
        public Builder mountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
            this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
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
         * Options.
         */
        public Builder options(String options) {
            this.options = options;
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
         * Property.
         */
        public Builder property(String property) {
            this.property = property;
            return this;
        }

        /**
         * ProviderType.
         */
        public Builder providerType(String providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * SourceDatasetId.
         */
        public Builder sourceDatasetId(String sourceDatasetId) {
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }

        /**
         * SourceDatasetVersion.
         */
        public Builder sourceDatasetVersion(String sourceDatasetVersion) {
            this.sourceDatasetVersion = sourceDatasetVersion;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TagTemplateType.
         */
        public Builder tagTemplateType(String tagTemplateType) {
            this.tagTemplateType = tagTemplateType;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Dataset build() {
            return new Dataset(this);
        } 

    } 

}
