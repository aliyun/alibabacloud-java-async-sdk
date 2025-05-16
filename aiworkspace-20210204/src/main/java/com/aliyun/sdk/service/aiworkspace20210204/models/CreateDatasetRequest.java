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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
        this.dataCount = builder.dataCount;
        this.dataSize = builder.dataSize;
        this.dataSourceType = builder.dataSourceType;
        this.dataType = builder.dataType;
        this.description = builder.description;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private Long dataCount; 
        private Long dataSize; 
        private String dataSourceType; 
        private String dataType; 
        private String description; 
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
        private String versionDescription; 
        private java.util.List<Label> versionLabels; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.dataCount = request.dataCount;
            this.dataSize = request.dataSize;
            this.dataSourceType = request.dataSourceType;
            this.dataType = request.dataType;
            this.description = request.description;
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
            this.versionDescription = request.versionDescription;
            this.versionLabels = request.versionLabels;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The workspace accessibility. Valid values:</p>
         * <ul>
         * <li>PRIVATE: The workspace is accessible only to you and the administrator of the workspace. This is the default value.</li>
         * <li>PUBLIC: The workspace is accessible to all users.</li>
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
         * <p>The number of dataset files.</p>
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
         * <p>The size of the dataset file. Unit: bytes.</p>
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
         * <li>OSS: Object Storage Service (OSS).</li>
         * <li>NAS: File Storage NAS (NAS).</li>
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
         * <p>The type of the dataset. Default value: COMMON. Valid values:</p>
         * <ul>
         * <li>COMMON: common</li>
         * <li>PIC: picture</li>
         * <li>TEXT: text</li>
         * <li>Video: video</li>
         * <li>AUDIO: audio</li>
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
         * <p>The description of the dataset. Descriptions are used to differentiate datasets.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The dataset configurations to be imported to a storage, such as OSS, NAS, or Cloud Parallel File Storage (CPFS).</p>
         * <p><strong>OSS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID.<br>&quot;bucket&quot;: &quot;${bucket}&quot;,//The bucket name.<br>&quot;path&quot;: &quot;${path}&quot; // The file path.<br>}\</p>
         * <p><strong>NAS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID.<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.<br>&quot;path&quot;: &quot;${path}&quot;, // The file system path.<br>&quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system.<br>}\</p>
         * <p><strong>CPFS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID.<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.<br>&quot;protocolServiceId&quot;:&quot;${protocol_service_id}&quot;, // The file system protocol service.<br>&quot;exportId&quot;: &quot;${export_id}&quot;, // The file system export directory.<br>&quot;path&quot;: &quot;${path}&quot;, // The file system path.<br>}\</p>
         * <p><strong>CPFS for Lingjun</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID.<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID.<br>&quot;path&quot;: &quot;${path}&quot;, // The file system path.<br>&quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system, CPFS for Lingjun only.<br>&quot;isVpcMount&quot;: boolean, // Whether the mount point is a virtual private cloud (VPC) mount point, CPFS for Lingjun only.<br>}\</p>
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
         * <p>The tags.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The list of role names in the workspace that have read and write permissions on the mounted database. The names start with PAI are basic role names and the names start with role- are custom role names. If the list contains asterisks (*), all roles have read and write permissions.</p>
         * <ul>
         * <li>If you set the value to [&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;], the account of the specified role is granted the read and write permissions.</li>
         * <li>If you set the value to [&quot;*&quot;], all accounts are granted the read and write permissions.</li>
         * <li>If you set the value to [], only the creator of the dataset has the read and write permissions.</li>
         * </ul>
         */
        public Builder mountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
            this.putBodyParameter("MountAccessReadWriteRoleIdList", mountAccessReadWriteRoleIdList);
            this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
            return this;
        }

        /**
         * <p>The dataset name. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must start with a letter, digit, or Chinese character.</li>
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
         * <p>The extended field, which is a JSON string. When you use the dataset in Deep Learning Containers (DLC), you can configure the mountPath field to specify the default mount path of the dataset.</p>
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
         * <li>FILE</li>
         * <li>DIRECTORY</li>
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
         * <p>The dataset provider. The value cannot be set to pai.</p>
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
         * <p>The source type of the dataset. Valid values:</p>
         * <ul>
         * <li>Ecs (default)</li>
         * <li>Lingjun</li>
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
         * <p>The ID of the source dataset for the labeled dataset.</p>
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
         * <p>The version of the source dataset for the labeled dataset.</p>
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
         * <p>The data source ID.</p>
         * <ul>
         * <li>If SourceType is set to USER, the value of SourceId is a custom string.</li>
         * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
         * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
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
         * <p>The type of the data source. Default value: USER.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PAI_PUBLIC_DATASET: a public dataset of PAI.</li>
         * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
         * <li>USER: a dataset registered by a user.</li>
         * </ul>
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
         * <p>The URI of the data source.</p>
         * <ul>
         * <li>Value format if DataSourceType is set to OSS: <code>oss://bucket.endpoint/object</code>.</li>
         * <li>Value formats if DataSourceType is set to NAS: General-purpose NAS: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>. CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>. CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>. You can distinguish CPFS 1.0 and CPFS 2.0 file systems based on the format of the file system ID: The ID for CPFS 1.0 is in the cpfs-&lt;8-bit ASCII characters&gt; format. The ID for CPFS 2.0 is in the cpfs-&lt;16-bit ASCII characters&gt; format.</li>
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
         * <p>The ID of the Alibaba Cloud account to which the dataset belongs. The workspace owner and administrator have permissions to create datasets for specified members in the workspace.</p>
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
         * <p>The description of the dataset of the initial version.</p>
         * 
         * <strong>example:</strong>
         * <p>The initial version</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("VersionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The list of tags to be added to the dataset of the initial version.</p>
         */
        public Builder versionLabels(java.util.List<Label> versionLabels) {
            this.putBodyParameter("VersionLabels", versionLabels);
            this.versionLabels = versionLabels;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the dataset belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID. If you do not specify this parameter, the default workspace is used. If the default workspace does not exist, an error is reported.</p>
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
