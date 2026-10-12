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
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessibleRoleIdList")
    private java.util.List<String> accessibleRoleIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataCount")
    @com.aliyun.core.annotation.Validation(maximum = 999999999999D, minimum = 1)
    private Long dataCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSize")
    @com.aliyun.core.annotation.Validation(maximum = 999999999999D, minimum = 1)
    private Long dataSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetTaskRamRole")
    private String datasetTaskRamRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImportInfo")
    private String importInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MountAccessReadWriteRoleIdList")
    private java.util.List<String> mountAccessReadWriteRoleIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Property")
    @com.aliyun.core.annotation.Validation(required = true)
    private String property;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceDatasetId")
    private String sourceDatasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceDatasetVersion")
    private String sourceDatasetVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserMetricsEndpoints")
    private java.util.List<UserMetricsEndpoint> userMetricsEndpoints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionLabels")
    private java.util.List<Label> versionLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.accessibleRoleIdList = builder.accessibleRoleIdList;
        this.dataCount = builder.dataCount;
        this.dataSize = builder.dataSize;
        this.dataSourceType = builder.dataSourceType;
        this.dataType = builder.dataType;
        this.datasetTaskRamRole = builder.datasetTaskRamRole;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.edition = builder.edition;
        this.importInfo = builder.importInfo;
        this.labels = builder.labels;
        this.mountAccessReadWriteRoleIdList = builder.mountAccessReadWriteRoleIdList;
        this.name = builder.name;
        this.options = builder.options;
        this.property = builder.property;
        this.provider = builder.provider;
        this.providerType = builder.providerType;
        this.sourceDatasetId = builder.sourceDatasetId;
        this.sourceDatasetVersion = builder.sourceDatasetVersion;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.uri = builder.uri;
        this.userId = builder.userId;
        this.userMetricsEndpoints = builder.userMetricsEndpoints;
        this.versionDescription = builder.versionDescription;
        this.versionLabels = builder.versionLabels;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetRequest create() {
        return builder().build();
    }

@Override
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
     * @return dataCount
     */
    public Long getDataCount() {
        return this.dataCount;
    }

    /**
     * @return dataSize
     */
    public Long getDataSize() {
        return this.dataSize;
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
     * @return datasetTaskRamRole
     */
    public String getDatasetTaskRamRole() {
        return this.datasetTaskRamRole;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
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
     * @return property
     */
    public String getProperty() {
        return this.property;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
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
     * @return userMetricsEndpoints
     */
    public java.util.List<UserMetricsEndpoint> getUserMetricsEndpoints() {
        return this.userMetricsEndpoints;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return versionLabels
     */
    public java.util.List<Label> getVersionLabels() {
        return this.versionLabels;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String accessibility; 
        private java.util.List<String> accessibleRoleIdList; 
        private Long dataCount; 
        private Long dataSize; 
        private String dataSourceType; 
        private String dataType; 
        private String datasetTaskRamRole; 
        private String description; 
        private Boolean dryRun; 
        private String edition; 
        private String importInfo; 
        private java.util.List<Label> labels; 
        private java.util.List<String> mountAccessReadWriteRoleIdList; 
        private String name; 
        private String options; 
        private String property; 
        private String provider; 
        private String providerType; 
        private String sourceDatasetId; 
        private String sourceDatasetVersion; 
        private String sourceId; 
        private String sourceType; 
        private String uri; 
        private String userId; 
        private java.util.List<UserMetricsEndpoint> userMetricsEndpoints; 
        private String versionDescription; 
        private java.util.List<Label> versionLabels; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.accessibleRoleIdList = request.accessibleRoleIdList;
            this.dataCount = request.dataCount;
            this.dataSize = request.dataSize;
            this.dataSourceType = request.dataSourceType;
            this.dataType = request.dataType;
            this.datasetTaskRamRole = request.datasetTaskRamRole;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.edition = request.edition;
            this.importInfo = request.importInfo;
            this.labels = request.labels;
            this.mountAccessReadWriteRoleIdList = request.mountAccessReadWriteRoleIdList;
            this.name = request.name;
            this.options = request.options;
            this.property = request.property;
            this.provider = request.provider;
            this.providerType = request.providerType;
            this.sourceDatasetId = request.sourceDatasetId;
            this.sourceDatasetVersion = request.sourceDatasetVersion;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.uri = request.uri;
            this.userId = request.userId;
            this.userMetricsEndpoints = request.userMetricsEndpoints;
            this.versionDescription = request.versionDescription;
            this.versionLabels = request.versionLabels;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The workspace visibility. Valid values:</p>
         * <ul>
         * <li>PRIVATE: Visible only to the creator and administrators in the workspace. This is the default value.</li>
         * <li>PUBLIC: Visible to all users in the workspace.</li>
         * <li>ROLE_PUBLIC: Visible to specified workspace roles. For the role list, refer to AccessibleRoleIdList. The dataset owner and administrators always have visibility regardless of the specified roles.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>Takes effect only when Accessibility is set to ROLE_PUBLIC. The list of workspace role names that have visibility to the dataset. Role IDs starting with PAI are basic role IDs, and those starting with role- are custom role IDs.</p>
         */
        public Builder accessibleRoleIdList(java.util.List<String> accessibleRoleIdList) {
            this.putBodyParameter("AccessibleRoleIdList", accessibleRoleIdList);
            this.accessibleRoleIdList = accessibleRoleIdList;
            return this;
        }

        /**
         * <p>The number of files in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder dataCount(Long dataCount) {
            this.putBodyParameter("DataCount", dataCount);
            this.dataCount = dataCount;
            return this;
        }

        /**
         * <p>The storage space occupied by the dataset files. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder dataSize(Long dataSize) {
            this.putBodyParameter("DataSize", dataSize);
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li>OSS: Alibaba Cloud Object Storage Service (OSS).</li>
         * <li>NAS: Alibaba Cloud File Storage NAS (General-purpose).</li>
         * <li>EXTREMENAS: Alibaba Cloud File Storage NAS (Extreme).</li>
         * <li>CPFS: Alibaba Cloud Cloud Paralleled File System (CPFS) (General-purpose).</li>
         * <li>BMCPFS: Alibaba Cloud Cloud Paralleled File System (CPFS) (AI-optimized). </li>
         * <li>MAXCOMPUTE: Alibaba Cloud MaxCompute.</li>
         * <li>URL: A public HTTP or HTTPS URL.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The data type of the dataset. Default value: COMMON. Valid values:</p>
         * <ul>
         * <li>COMMON: Common data.</li>
         * <li>PIC: Image data.</li>
         * <li>TEXT: Text data.</li>
         * <li>VIDEO: Video data.</li>
         * <li>AUDIO: Audio data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>DatasetTaskRamRole</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/role-name</p>
         */
        public Builder datasetTaskRamRole(String datasetTaskRamRole) {
            this.putBodyParameter("DatasetTaskRamRole", datasetTaskRamRole);
            this.datasetTaskRamRole = datasetTaskRamRole;
            return this;
        }

        /**
         * <p>The custom description of the dataset, which is used to distinguish it from other datasets.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of the dataset.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run without actually creating the dataset.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The dataset edition. Default value: BASIC. Valid values:</p>
         * <ul>
         * <li>BASIC: Basic edition. Does not support file metadata management for the dataset.</li>
         * <li>ADVANCED: Advanced edition. Only OSS datasets are supported. Each version supports metadata management for up to 1 million files.</li>
         * <li>LOGICAL: Logical edition. Only OSS datasets are supported. Each version supports metadata management for up to 3 million files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADVANCED</p>
         */
        public Builder edition(String edition) {
            this.putBodyParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The storage import configuration of the dataset. OSS, NAS, and CPFS are supported.</p>
         * <details>
         * <summary>OSS</summary>
         * {<BR>
         * "region": "${region}",// The region ID.<BR>
         * "bucket": "${bucket}",// The bucket name.<BR>
         * "path": "${path}" // The file path.<BR>
         * }<BR>
         * </details>
         * 
         * <details>
         * <summary>NAS</summary>
         * {<BR>
         * "region": "${region}",// The region ID.<BR>
         * "fileSystemId": "${file_system_id}", // The file system ID.<BR>
         * "path": "${path}", // The file system path.<BR>
         * "mountTarget": "${mount_target}" // The mount target of the file system.<BR>
         * }<BR>
         * </details>
         * 
         * <details>
         * <summary>CPFS</summary>
         * {<BR>
         * "region": "${region}",// The region ID.<BR>
         * "fileSystemId": "${file_system_id}", // The file system ID.<BR>
         * "protocolServiceId":"${protocol_service_id}", // The protocol service of the file system.<BR>
         * "exportId": "${export_id}", // The export directory of the file system.<BR>
         * "path": "${path}", // The file system path.<BR>
         * }<BR>
         * </details>
         * 
         * <details>
         * <summary>AI-optimized CPFS</summary>
         * {<BR>
         * "region": "${region}",// The region ID.<BR>
         * "fileSystemId": "${file_system_id}", // The file system ID.<BR>
         * "path": "${path}", // The file system path.<BR>
         * "mountTarget": "${mount_target}", // The mount target of the file system. Specific to the AI-optimized edition.<BR>
         * "isVpcMount": boolean, // Specifies whether the mount target is a VPC mount target. Specific to the AI-optimized edition.<BR>
         * }<BR>
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
            this.putBodyParameter("ImportInfo", importInfo);
            this.importInfo = importInfo;
            return this;
        }

        /**
         * <p>The list of labels.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The list of workspace role names that have read and write permissions when the dataset is mounted. Role IDs starting with PAI are basic role IDs, and those starting with role- are custom role IDs. If the list contains an asterisk (*), all roles have read and write permissions.</p>
         * <ul>
         * <li>Specified roles: [&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;]</li>
         * <li>All roles: [&quot;*&quot;]</li>
         * <li>Dataset creator only: []</li>
         * </ul>
         */
        public Builder mountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
            this.putBodyParameter("MountAccessReadWriteRoleIdList", mountAccessReadWriteRoleIdList);
            this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
            return this;
        }

        /**
         * <p>The name of the dataset. The naming rules are as follows:</p>
         * <ul>
         * <li>The name must start with a lowercase letter, an uppercase letter, a digit, or a Chinese character.</li>
         * <li>The name can contain underscores (_) and hyphens (-).</li>
         * <li>The name must be 1 to 127 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The extended fields in JSON string format. When DLC uses the dataset, you can configure the mountPath field to specify the default mount path of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
         * }</p>
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The property of the dataset. Valid values:</p>
         * <ul>
         * <li>FILE: File.</li>
         * <li>DIRECTORY: Directory.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DIRECTORY</p>
         */
        public Builder property(String property) {
            this.putBodyParameter("Property", property);
            this.property = property;
            return this;
        }

        /**
         * <p>The provider of the dataset. You cannot set this parameter to pai.</p>
         * 
         * <strong>example:</strong>
         * <p>Github</p>
         */
        public Builder provider(String provider) {
            this.putBodyParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The data source type of the dataset. Valid values:</p>
         * <ul>
         * <li>Ecs: Elastic Compute Service (ECS). This is the default value.</li>
         * <li>Lingjun: Lingjun.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder providerType(String providerType) {
            this.putBodyParameter("ProviderType", providerType);
            this.providerType = providerType;
            return this;
        }

        /**
         * <p>The ID of the source dataset from which the labeled dataset is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bvfasdfxxxxj8o411</p>
         */
        public Builder sourceDatasetId(String sourceDatasetId) {
            this.putBodyParameter("SourceDatasetId", sourceDatasetId);
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }

        /**
         * <p>The version of the source dataset from which the labeled dataset is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder sourceDatasetVersion(String sourceDatasetVersion) {
            this.putBodyParameter("SourceDatasetVersion", sourceDatasetVersion);
            this.sourceDatasetVersion = sourceDatasetVersion;
            return this;
        }

        /**
         * <p>The ID of the data source.</p>
         * <ul>
         * <li>When SourceType is set to USER, SourceId can be customized.</li>
         * <li>When SourceType is set to ITAG, which indicates that the dataset is generated from the labeling results of the iTAG module, SourceId is the iTAG task ID.</li>
         * <li>When SourceType is set to PAI_PUBLIC_DATASET, which indicates that the dataset is created from a PAI public dataset, SourceId is empty by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>jdnhf***fnrimv</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The data source type. Default value: USER.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The URI configuration examples are as follows:</p>
         * <ul>
         * <li>If the data source type is OSS: <code>oss://bucket.endpoint/object</code></li>
         * <li>If the data source type is NAS:
         * For general-purpose NAS, the format is <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>.
         * For CPFS 1.0, the format is <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>.
         * For CPFS 2.0, the format is <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>.
         * CPFS 1.0 and CPFS 2.0 are distinguished by the format of the fsid: the format for CPFS 1.0 is cpfs-&lt;8 ASCII characters&gt;, and the format for CPFS 2.0 is cpfs-&lt;16 ASCII characters&gt;.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nas://09f****f2.cn-hangzhou/</p>
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the dataset owner. The workspace owner and administrators have the permissions to create datasets for specified workspace members.</p>
         * 
         * <strong>example:</strong>
         * <p>2485765****023475</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>UserMetricsEndpoints</p>
         */
        public Builder userMetricsEndpoints(java.util.List<UserMetricsEndpoint> userMetricsEndpoints) {
            this.putBodyParameter("UserMetricsEndpoints", userMetricsEndpoints);
            this.userMetricsEndpoints = userMetricsEndpoints;
            return this;
        }

        /**
         * <p>The description of the initial version of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of the first dataset version.</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("VersionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The list of labels for the initial version.</p>
         */
        public Builder versionLabels(java.util.List<Label> versionLabels) {
            this.putBodyParameter("VersionLabels", versionLabels);
            this.versionLabels = versionLabels;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the dataset belongs. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.
         * If you do not configure this parameter, the default workspace is used. If the default workspace does not exist, an error is reported.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

}
