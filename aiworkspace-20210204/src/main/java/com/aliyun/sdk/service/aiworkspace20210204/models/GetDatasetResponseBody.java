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
 * {@link GetDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetResponseBody</p>
 */
public class GetDatasetResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private GetDatasetResponseBody(Builder builder) {
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
        this.provider = builder.provider;
        this.providerType = builder.providerType;
        this.requestId = builder.requestId;
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

    public static GetDatasetResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String provider; 
        private String providerType; 
        private String requestId; 
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

        private Builder(GetDatasetResponseBody model) {
            this.accessibility = model.accessibility;
            this.dataSourceType = model.dataSourceType;
            this.dataType = model.dataType;
            this.datasetId = model.datasetId;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.importInfo = model.importInfo;
            this.labels = model.labels;
            this.latestVersion = model.latestVersion;
            this.mountAccess = model.mountAccess;
            this.mountAccessReadWriteRoleIdList = model.mountAccessReadWriteRoleIdList;
            this.name = model.name;
            this.options = model.options;
            this.ownerId = model.ownerId;
            this.property = model.property;
            this.provider = model.provider;
            this.providerType = model.providerType;
            this.requestId = model.requestId;
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
         * <p>The visibility of the workspace. Valid values:</p>
         * <ul>
         * <li>PRIVATE: The workspace is visible only to you and the administrator of the workspace.</li>
         * <li>PUBLIC: The workspace is visible to all users.</li>
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
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>OSS: Object Storage Service (OSS)</li>
         * <li>NAS: File Storage NAS (NAS)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The data type. Valid values:</p>
         * <ul>
         * <li>COMMON: common</li>
         * <li>PIC: picture</li>
         * <li>TEXT: text</li>
         * <li>VIDEO: video</li>
         * <li>AUDIO: audio</li>
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
         * <p>d-rbvg5wz****c9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The dataset configurations to be imported to a storage, such as OSS, NAS, or CPFS.</p>
         * <p><strong>OSS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID<br>&quot;bucket&quot;: &quot;${bucket}&quot;,// The bucket name<br>&quot;path&quot;: &quot;${path}&quot; // The file path<br>}\</p>
         * <p><strong>NAS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID<br>&quot;path&quot;: &quot;${path}&quot;, // The file system path<br>&quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system<br>}\</p>
         * <p><strong>CPFS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID<br>&quot;protocolServiceId&quot;:&quot;${protocol_service_id}&quot;, // The file system protocol service<br>&quot;exportId&quot;: &quot;${export_id}&quot;, // The file system export directory<br>&quot;path&quot;: &quot;${path}&quot;, // The file system path<br>}\</p>
         * <p><strong>CPFS for Lingjun</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID<br>&quot;path&quot;: &quot;${path}&quot;, // The file system path<br>&quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system, CPFS for Lingjun only<br>&quot;isVpcMount&quot;: boolean, // Whether the mount point is a VPC mount point, CPFS for Lingjun only<br>}\</p>
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
         * <p>The tags.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The latest version of the dataset.</p>
         */
        public Builder latestVersion(DatasetVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The access permission on the dataset when the dataset is mounted. Valid values:</p>
         * <ul>
         * <li>RO: read-only permissions</li>
         * <li>RW: read and write permissions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RW</p>
         */
        public Builder mountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }

        /**
         * <p>The list of role names in the workspace that have read and write permissions on the mounted database. The names start with PAI are basic role names and the names start with role- are custom role names. If the list contains asterisks (*), all roles have read and write permissions.</p>
         */
        public Builder mountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
            this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
            return this;
        }

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The extended fields of the dataset v1 (initial version). The value is a JSON string. When you use the dataset in Deep Learning Containers (DLC), you can use the mountPath field to specify the default mount path of the dataset.</p>
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
         * <p>The ID of the Alibaba Could account.</p>
         * 
         * <strong>example:</strong>
         * <p>1631044****3440</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The property of the dataset of the initial version v1. Valid values:</p>
         * <ul>
         * <li>FILE</li>
         * <li>DIRECTORY</li>
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
         * <p>The dataset provider. If the value pai is returned, the dataset is a public dataset in PAI.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>The type of the data source for the dataset. Valid values:</p>
         * <ul>
         * <li>Ecs (default)</li>
         * <li>Lingjun</li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the source dataset generated from a labeling job of iTAG.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rcdg3wxxxxxhc5jk87</p>
         */
        public Builder sourceDatasetId(String sourceDatasetId) {
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }

        /**
         * <p>The version of the source dataset generated from a labeling job of iTAG.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder sourceDatasetVersion(String sourceDatasetVersion) {
            this.sourceDatasetVersion = sourceDatasetVersion;
            return this;
        }

        /**
         * <p>The ID of the source for the dataset v1 (initial version). Valid values:</p>
         * <ul>
         * <li>If SourceType is set to USER, the value of SourceId can be a custom string.</li>
         * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
         * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>jdnhf***fnrimv</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The type of the source for the dataset v1 (initial version). Valid values:</p>
         * <ul>
         * <li>PAI-PUBLIC-DATASET: a public dataset of Platform for AI (PAI).</li>
         * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
         * <li>USER: a dataset registered by a user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The labeling template for the source dataset generated from a labeling job of iTAG.</p>
         * 
         * <strong>example:</strong>
         * <p>TextClassification</p>
         */
        public Builder tagTemplateType(String tagTemplateType) {
            this.tagTemplateType = tagTemplateType;
            return this;
        }

        /**
         * <p>The URI of the initial version v1.</p>
         * <ul>
         * <li>Sample format for the OSS data source: <code>oss://bucket.endpoint/object</code></li>
         * <li>Sample formats for the NAS data source: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>: General-purpose NAS. <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>: Cloud Parallel File Storage (CPFS) 1.0. <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>: CPFS 2.0. You can distinguish CPFS 1.0 and CPFS 2.0 file systems based on the format of the file system ID. The ID for CPFS 1.0 is in the cpfs-&lt;8-bit ASCII characters&gt; format. The ID for CPFS 2.0 is in the cpfs-&lt;16-bit ASCII characters&gt; format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nas://09f****f2.cn-hangzhou/</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * <p>The ID of the user to which the dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2485765****023475</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetDatasetResponseBody build() {
            return new GetDatasetResponseBody(this);
        } 

    } 

}
