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

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private GetDatasetResponseBody(Builder builder) {
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
        this.provider = builder.provider;
        this.providerType = builder.providerType;
        this.requestId = builder.requestId;
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
        private String provider; 
        private String providerType; 
        private String requestId; 
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

        private Builder(GetDatasetResponseBody model) {
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
            this.provider = model.provider;
            this.providerType = model.providerType;
            this.requestId = model.requestId;
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
         * <p>The workspace visibility. Valid values:</p>
         * <ul>
         * <li>PRIVATE: Only the dataset owner and administrators within the workspace can access the dataset.</li>
         * <li>PUBLIC: All members of the workspace can access the dataset.</li>
         * <li>ROLE_PUBLIC: Only specified workspace roles can access the dataset. For the role list, see AccessibleRoleIdList. The dataset owner and administrators always have access under this condition.</li>
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
         * <p>The list of workspace role names that can access the dataset. This parameter takes effect only when Accessibility is set to ROLE_PUBLIC. Role IDs starting with PAI are basic role IDs, and role IDs starting with role- are custom role IDs.</p>
         */
        public Builder accessibleRoleIdList(java.util.List<String> accessibleRoleIdList) {
            this.accessibleRoleIdList = accessibleRoleIdList;
            return this;
        }

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li>OSS: Object Storage Service (OSS).</li>
         * <li>NAS: Apsara File Storage NAS (NAS).</li>
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
         * <p>The data type of the dataset. Valid values:</p>
         * <ul>
         * <li>COMMON: common.</li>
         * <li>PIC: image.</li>
         * <li>TEXT: text.</li>
         * <li>VIDEO: video.</li>
         * <li>AUDIO: audio.</li>
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
         * 
         * <strong>example:</strong>
         * <p>Data for annotation</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The dataset type. Valid values:</p>
         * <ul>
         * <li><p>BASIC: Basic. Does not support dataset file metadata management.</p>
         * </li>
         * <li><p>ADVANCED: Advanced. Only supported for OSS type. Each version supports metadata management for up to 1 million files.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * <p>The creation time, in UTC, in the ISO 8601 format of YYYY-MM-DDTHH:mm:ss.sssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The update time, in UTC, in the ISO 8601 format of YYYY-MM-DDTHH:mm:ss.sssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The storage import configuration of the dataset. OSS, NAS, and CPFS are supported.</p>
         * <details>
         * <summary>OSS</summary>
         * {<BR>
         * "region": "${region}",//Region ID<BR>
         * "bucket": "${bucket}",//Bucket name<BR>
         * "path": "${path}" //File path<BR>
         * }<BR>
         * </details>
         * 
         * <details>
         * <summary>NAS</summary>
         * {<BR>
         * "region": "${region}",//Region ID<BR>
         * "fileSystemId": "${file_system_id}", //File system ID<BR>
         * "path": "${path}", //File system path<BR>
         * "mountTarget": "${mount_target}" //File system mount target<BR>
         * }<BR>
         * </details>
         * 
         * <details>
         * <summary>CPFS</summary>
         * {<BR>
         * "region": "${region}",//Region ID<BR>
         * "fileSystemId": "${file_system_id}", //File system ID<BR>
         * "protocolServiceId":"${protocol_service_id}", //File system protocol service<BR>
         * "exportId": "${export_id}", //File system export directory<BR>
         * "path": "${path}", //File system path<BR>
         * }<BR>
         * </details>
         * 
         * <details>
         * <summary>Lingjun CPFS</summary>
         * {<BR>
         * "region": "${region}",//Region ID<BR>
         * "fileSystemId": "${file_system_id}", //File system ID<BR>
         * "path": "${path}", //File system path<BR>
         * "mountTarget": "${mount_target}" //File system mount target, specific to Lingjun<BR>
         * "isVpcMount": boolean, //Specifies whether the mount target is a VPC mount target, specific to Lingjun<BR>
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
            this.importInfo = importInfo;
            return this;
        }

        /**
         * <p>Indicates whether the dataset is a shared dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isShared(Boolean isShared) {
            this.isShared = isShared;
            return this;
        }

        /**
         * <p>The list of labels.</p>
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
         * <p>The permission when the dataset is mounted.</p>
         * <ul>
         * <li>RO: read-only mount.</li>
         * <li>RW: read/write mount.</li>
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
         * <p>The list of workspace role names that have read and write permission on the dataset. Role IDs starting with PAI are basic role IDs, and role IDs starting with role- are custom role IDs. If the list contains &quot;*&quot;, all roles have read and write permission.</p>
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
         * <p>The extension field of the initial version v1, in JsonString format.
         * When DLC uses the dataset, you can specify the default mount path of the dataset by configuring the mountPath field.</p>
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
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1631044****3440</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The property of the initial dataset version v1. Valid values:</p>
         * <ul>
         * <li>FILE: file.</li>
         * <li>DIRECTORY: folder.</li>
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
         * <p>The dataset provider. If the value is &quot;pai&quot;, the dataset is a PAI platform public dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>The data source provider type of the dataset. Valid values:</p>
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
         * <p>The source relationship of the shared dataset. This parameter is valid only when IsShared is true.</p>
         */
        public Builder sharedFrom(DatasetShareRelationship sharedFrom) {
            this.sharedFrom = sharedFrom;
            return this;
        }

        /**
         * <p>The sharing configuration of the current dataset.</p>
         */
        public Builder sharingConfig(SharingConfig sharingConfig) {
            this.sharingConfig = sharingConfig;
            return this;
        }

        /**
         * <p>The source dataset ID of the iTAG annotation dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rcdg3wxxxxxhc5jk87</p>
         */
        public Builder sourceDatasetId(String sourceDatasetId) {
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }

        /**
         * <p>The source dataset version of the annotation dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder sourceDatasetVersion(String sourceDatasetVersion) {
            this.sourceDatasetVersion = sourceDatasetVersion;
            return this;
        }

        /**
         * <p>The source ID of the initial version v1. Valid values:</p>
         * <ul>
         * <li>If SourceType is USER, SourceId can be customized.</li>
         * <li>If SourceType is ITAG, which indicates a dataset generated from iTAG annotation results, SourceId is the iTAG task ID.</li>
         * <li>If SourceType is PAI_PUBLIC_DATASET, which indicates a dataset created from a PAI public dataset, SourceId is empty by default.</li>
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
         * <p>The source type of the initial version v1.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The annotation template of the iTAG annotation dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>TextClassification</p>
         */
        public Builder tagTemplateType(String tagTemplateType) {
            this.tagTemplateType = tagTemplateType;
            return this;
        }

        /**
         * <p>The URI of the initial version v1. Example formats:</p>
         * <ul>
         * <li>If the data source type is OSS: <code>oss://bucket.endpoint/object</code>.</li>
         * <li>If the data source type is NAS:
         * General-purpose NAS format: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>.
         * CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>.
         * CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>.
         * CPFS 1.0 and CPFS 2.0 are distinguished by the format of the fsid:
         * CPFS 1.0 format: cpfs-&lt;8 ASCII characters&gt;.
         * CPFS 2.0 format: cpfs-&lt;16 ASCII characters&gt;.</li>
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
         * <p>The ID of the user to whom the dataset belongs.</p>
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

    /**
     * 
     * {@link GetDatasetResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatasetResponseBody</p>
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
             * <p>The list of sharing configurations.</p>
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
