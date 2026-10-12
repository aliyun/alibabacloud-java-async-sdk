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

    @com.aliyun.core.annotation.NameInMap("AccessibleRoleIdList")
    private java.util.List<String> accessibleRoleIdList;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("ImportInfo")
    private String importInfo;

    @com.aliyun.core.annotation.NameInMap("IsShared")
    private Boolean isShared;

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

    @com.aliyun.core.annotation.NameInMap("SharedFrom")
    private DatasetShareRelationship sharedFrom;

    @com.aliyun.core.annotation.NameInMap("SharingConfig")
    private SharingConfig sharingConfig;

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
        this.accessibleRoleIdList = builder.accessibleRoleIdList;
        this.dataSourceType = builder.dataSourceType;
        this.dataType = builder.dataType;
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.edition = builder.edition;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.importInfo = builder.importInfo;
        this.isShared = builder.isShared;
        this.labels = builder.labels;
        this.latestVersion = builder.latestVersion;
        this.mountAccess = builder.mountAccess;
        this.mountAccessReadWriteRoleIdList = builder.mountAccessReadWriteRoleIdList;
        this.name = builder.name;
        this.options = builder.options;
        this.ownerId = builder.ownerId;
        this.property = builder.property;
        this.providerType = builder.providerType;
        this.sharedFrom = builder.sharedFrom;
        this.sharingConfig = builder.sharingConfig;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return accessibleRoleIdList
     */
    public java.util.List<String> getAccessibleRoleIdList() {
        return this.accessibleRoleIdList;
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
     * @return edition
     */
    public String getEdition() {
        return this.edition;
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
     * @return isShared
     */
    public Boolean getIsShared() {
        return this.isShared;
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
     * @return sharedFrom
     */
    public DatasetShareRelationship getSharedFrom() {
        return this.sharedFrom;
    }

    /**
     * @return sharingConfig
     */
    public SharingConfig getSharingConfig() {
        return this.sharingConfig;
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
        private java.util.List<String> accessibleRoleIdList; 
        private String dataSourceType; 
        private String dataType; 
        private String datasetId; 
        private String description; 
        private String edition; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String importInfo; 
        private Boolean isShared; 
        private java.util.List<Label> labels; 
        private DatasetVersion latestVersion; 
        private String mountAccess; 
        private java.util.List<String> mountAccessReadWriteRoleIdList; 
        private String name; 
        private String options; 
        private String ownerId; 
        private String property; 
        private String providerType; 
        private DatasetShareRelationship sharedFrom; 
        private SharingConfig sharingConfig; 
        private String sourceDatasetId; 
        private String sourceDatasetVersion; 
        private String sourceId; 
        private String sourceType; 
        private String tagTemplateType; 
        private String uri; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Dataset model) {
            this.accessibility = model.accessibility;
            this.accessibleRoleIdList = model.accessibleRoleIdList;
            this.dataSourceType = model.dataSourceType;
            this.dataType = model.dataType;
            this.datasetId = model.datasetId;
            this.description = model.description;
            this.edition = model.edition;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.importInfo = model.importInfo;
            this.isShared = model.isShared;
            this.labels = model.labels;
            this.latestVersion = model.latestVersion;
            this.mountAccess = model.mountAccess;
            this.mountAccessReadWriteRoleIdList = model.mountAccessReadWriteRoleIdList;
            this.name = model.name;
            this.options = model.options;
            this.ownerId = model.ownerId;
            this.property = model.property;
            this.providerType = model.providerType;
            this.sharedFrom = model.sharedFrom;
            this.sharingConfig = model.sharingConfig;
            this.sourceDatasetId = model.sourceDatasetId;
            this.sourceDatasetVersion = model.sourceDatasetVersion;
            this.sourceId = model.sourceId;
            this.sourceType = model.sourceType;
            this.tagTemplateType = model.tagTemplateType;
            this.uri = model.uri;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The visibility of the dataset in the workspace. Valid values:</p>
         * <ul>
         * <li><p><code>PRIVATE</code>: Visible only to the dataset\&quot;s owner and administrators.</p>
         * </li>
         * <li><p><code>PUBLIC</code>: The dataset is visible to all users in the workspace.</p>
         * </li>
         * <li><p><code>ROLE_PUBLIC</code>: Visible to specified workspace roles (see <code>AccessibleRoleIdList</code>). The owner and administrators also have visibility.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>If <code>Accessibility</code> is <code>ROLE_PUBLIC</code>, this parameter lists the IDs of workspace roles that can view the dataset. Role IDs that start with <code>PAI</code> are built-in roles, and those that start with <code>role-</code> are custom roles.</p>
         */
        public Builder accessibleRoleIdList(java.util.List<String> accessibleRoleIdList) {
            this.accessibleRoleIdList = accessibleRoleIdList;
            return this;
        }

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The data type of the dataset. Valid values:</p>
         * <ul>
         * <li><p><code>COMMON</code>: (Default) Common data.</p>
         * </li>
         * <li><p><code>PIC</code>: Images.</p>
         * </li>
         * <li><p><code>TEXT</code>: Text.</p>
         * </li>
         * <li><p><code>VIDEO</code>: Videos.</p>
         * </li>
         * <li><p><code>AUDIO</code>: Audio.</p>
         * </li>
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
         * <p>The ID of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>d-c0h44g3****j8o4348</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of a dataset.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The edition of the dataset. Valid values:</p>
         * <p><code>BASIC</code>: The basic edition. This edition does not support file metadata management.
         * <code>ADVANCED</code>: The advanced edition. This edition is supported only for OSS datasets and allows metadata management for up to 1 million files per version.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35.232Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The configuration for importing data from a storage source. Supported sources include OSS, NAS, and CPFS.</p>
         * <details>
         * 
         * <summary>
         * 
         * <p>OSS</p>
         * </summary>
         * 
         * <p>{
         * &quot;region&quot;: &quot;${region}&quot;,// The region ID.
         * &quot;bucket&quot;: &quot;${bucket}&quot;,// The bucket name.
         * &quot;path&quot;: &quot;${path}&quot; // The file path.
         * }</p>
         * </details>
         * 
         * <details>
         * 
         * <summary>
         * 
         * <p>NAS</p>
         * </summary>
         * 
         * </details>
         * 
         * <details>
         * 
         * <summary>
         * 
         * <p>CPFS</p>
         * </summary>
         * 
         * <p>Content</p>
         * </details>
         * 
         * <details>
         * 
         * <summary>
         * 
         * <p>Intelligent Computing CPFS</p>
         * </summary>
         * 
         * <p>Content</p>
         * </details>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;region&quot;: &quot;cn-wulanchabu&quot;,
         *     &quot;fileSystemId&quot;: &quot;bmcpfs-xxxxxxxxxxx&quot;,
         *     &quot;path&quot;: &quot;/mnt&quot;,
         *     &quot;mountTarget&quot;: &quot;cpfs-xxxxxxxxxxxx-vpc-gacs9f.cn-wulanchabu.cpfs.aliyuncs.com&quot;,
         *     &quot;isVpcMount&quot;: true
         * }</p>
         */
        public Builder importInfo(String importInfo) {
            this.importInfo = importInfo;
            return this;
        }

        /**
         * <p>Indicates whether the dataset is shared.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isShared(Boolean isShared) {
            this.isShared = isShared;
            return this;
        }

        /**
         * <p>A list of labels.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>Details of the latest dataset version.</p>
         */
        public Builder latestVersion(DatasetVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The mount access permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>RO RW</p>
         */
        public Builder mountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }

        /**
         * <p>A list of IDs for workspace roles with read and write permissions on the dataset. Role IDs that start with <code>PAI</code> are built-in roles, and role IDs that start with <code>role-</code> are custom roles. An asterisk (<code>*</code>) indicates that all roles have read and write permissions.</p>
         */
        public Builder mountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
            this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
            return this;
        }

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>A JSON string of extended options. When you use the dataset in a Data Lake Compute job, you can configure the <code>mountPath</code> field to specify the default mount path for the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
         * }</p>
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1631044****3440</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Indicates whether the dataset corresponds to a single file or a directory. Valid values:</p>
         * <ul>
         * <li><p><code>FILE</code>: The dataset is a file.</p>
         * </li>
         * <li><p><code>DIRECTORY</code>: The dataset is a directory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DIRECTORY</p>
         */
        public Builder property(String property) {
            this.property = property;
            return this;
        }

        /**
         * <p>The type of the data source provider. Valid values:</p>
         * <ul>
         * <li><p><code>ECS</code> (Default)</p>
         * </li>
         * <li><p><code>Lingjun</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder providerType(String providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * <p>The source of the shared dataset. This parameter is valid only when <code>IsShared</code> is <code>true</code>.</p>
         */
        public Builder sharedFrom(DatasetShareRelationship sharedFrom) {
            this.sharedFrom = sharedFrom;
            return this;
        }

        /**
         * <p>The sharing configuration for the dataset.</p>
         */
        public Builder sharingConfig(SharingConfig sharingConfig) {
            this.sharingConfig = sharingConfig;
            return this;
        }

        /**
         * <p>The ID of the source dataset for the annotated dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bvfasdfxxxxj8o411</p>
         */
        public Builder sourceDatasetId(String sourceDatasetId) {
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }

        /**
         * <p>The version of the source dataset for the annotated dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder sourceDatasetVersion(String sourceDatasetVersion) {
            this.sourceDatasetVersion = sourceDatasetVersion;
            return this;
        }

        /**
         * <p>The source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jdnhf***fnrimv</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The annotation template for the iTAG annotated dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>text-classification</p>
         */
        public Builder tagTemplateType(String tagTemplateType) {
            this.tagTemplateType = tagTemplateType;
            return this;
        }

        /**
         * <p>URI examples:</p>
         * <ul>
         * <li><p>OSS data source:
         * <code>oss://bucket.endpoint/object</code></p>
         * </li>
         * <li><p>General-purpose NAS data source:
         * <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code></p>
         * </li>
         * <li><p>CPFS 1.0 data source:
         * <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code></p>
         * </li>
         * <li><p>CPFS 2.0 data source:
         * <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The format of the <code>fsid</code> distinguishes CPFS 1.0 from CPFS 2.0. A CPFS 1.0 <code>fsid</code> has the format <code>cpfs-&lt;8-character ASCII string&gt;</code>, and a CPFS 2.0 <code>fsid</code> has the format <code>cpfs-&lt;16-character ASCII string&gt;</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>nas://09f****f2.cn-hangzhou/</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2485765****023475</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The ID of the workspace where the dataset is located.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Dataset build() {
            return new Dataset(this);
        } 

    } 

    /**
     * 
     * {@link Dataset} extends {@link TeaModel}
     *
     * <p>Dataset</p>
     */
    public static class SharingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SharedTo")
        private java.util.List<DatasetShareRelationship> sharedTo;

        private SharingConfig(Builder builder) {
            this.sharedTo = builder.sharedTo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharingConfig create() {
            return builder().build();
        }

        /**
         * @return sharedTo
         */
        public java.util.List<DatasetShareRelationship> getSharedTo() {
            return this.sharedTo;
        }

        public static final class Builder {
            private java.util.List<DatasetShareRelationship> sharedTo; 

            private Builder() {
            } 

            private Builder(SharingConfig model) {
                this.sharedTo = model.sharedTo;
            } 

            /**
             * <p>A list of sharing relationships.</p>
             */
            public Builder sharedTo(java.util.List<DatasetShareRelationship> sharedTo) {
                this.sharedTo = sharedTo;
                return this;
            }

            public SharingConfig build() {
                return new SharingConfig(this);
            } 

        } 

    }
}
