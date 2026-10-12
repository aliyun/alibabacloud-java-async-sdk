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
 * {@link CreateDatasetVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetVersionRequest</p>
 */
public class CreateDatasetVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataCount")
    private Long dataCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

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
    @com.aliyun.core.annotation.NameInMap("ImportInfo")
    private String importInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Property")
    @com.aliyun.core.annotation.Validation(required = true)
    private String property;

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
    @com.aliyun.core.annotation.NameInMap("UserMetricsEndpoints")
    private java.util.List<UserMetricsEndpoint> userMetricsEndpoints;

    private CreateDatasetVersionRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.dataCount = builder.dataCount;
        this.dataSize = builder.dataSize;
        this.dataSourceType = builder.dataSourceType;
        this.datasetTaskRamRole = builder.datasetTaskRamRole;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.importInfo = builder.importInfo;
        this.labels = builder.labels;
        this.options = builder.options;
        this.property = builder.property;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.uri = builder.uri;
        this.userMetricsEndpoints = builder.userMetricsEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
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
     * @return userMetricsEndpoints
     */
    public java.util.List<UserMetricsEndpoint> getUserMetricsEndpoints() {
        return this.userMetricsEndpoints;
    }

    public static final class Builder extends Request.Builder<CreateDatasetVersionRequest, Builder> {
        private String datasetId; 
        private Long dataCount; 
        private Long dataSize; 
        private String dataSourceType; 
        private String datasetTaskRamRole; 
        private String description; 
        private Boolean dryRun; 
        private String importInfo; 
        private java.util.List<Label> labels; 
        private String options; 
        private String property; 
        private String sourceId; 
        private String sourceType; 
        private String uri; 
        private java.util.List<UserMetricsEndpoint> userMetricsEndpoints; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetVersionRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.dataCount = request.dataCount;
            this.dataSize = request.dataSize;
            this.dataSourceType = request.dataSourceType;
            this.datasetTaskRamRole = request.datasetTaskRamRole;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.importInfo = request.importInfo;
            this.labels = request.labels;
            this.options = request.options;
            this.property = request.property;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.uri = request.uri;
            this.userMetricsEndpoints = request.userMetricsEndpoints;
        } 

        /**
         * <p>The dataset ID. For more information about how to obtain the dataset ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5*****jhc9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The number of files in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataCount(Long dataCount) {
            this.putBodyParameter("DataCount", dataCount);
            this.dataCount = dataCount;
            return this;
        }

        /**
         * <p>The size of the space occupied by the dataset files. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>19000</p>
         */
        public Builder dataSize(Long dataSize) {
            this.putBodyParameter("DataSize", dataSize);
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>The data source type. Separate multiple values with commas. Valid values:</p>
         * <ul>
         * <li><p>NAS: Alibaba Cloud File Storage NAS.</p>
         * </li>
         * <li><p>OSS: Alibaba Cloud Object Storage Service (OSS).</p>
         * </li>
         * <li><p>CPFS</p>
         * </li>
         * </ul>
         * <p>Note: The DataSourceType of the version must be the same as the DataSourceType of the dataset. The system validates this when you create the version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>UserMetricsEndpoints</p>
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
         * <p>The custom description of the dataset version. You can use this description to distinguish between different dataset versions.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of the dataset version.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run without actually creating the dataset version.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The storage import configuration of the dataset. OSS, NAS, and CPFS are supported.</p>
         * <details>
         * <summary>OSS</summary>
         * {<BR>
         *   "region": "${region}",// The region ID.<BR>
         *   "bucket": "${bucket}",// The bucket name.<BR>
         *   "path": "${path}" // The file path.<BR>
         * }<BR>
         * </details>
         * 
         * <details>
         * <summary>NAS</summary>
         * {<BR>
         *   "region": "${region}",// The region ID.<BR>
         *   "fileSystemId": "${file_system_id}", // The file system ID.<BR>
         *   "path": "${path}", // The file system path.<BR>
         *   "mountTarget": "${mount_target}" // The mount target of the file system.<BR>
         * }<BR>
         * </details>
         * 
         * 
         * <details>
         * <summary>CPFS</summary>
         * {<BR>
         *   "region": "${region}",// The region ID.<BR>
         *   "fileSystemId": "${file_system_id}", // The file system ID.<BR>
         *   "protocolServiceId":"${protocol_service_id}", // The protocol service of the file system.<BR>
         *   "exportId": "${export_id}", // The export directory of the file system.<BR>
         *   "path": "${path}",  // The file system path.<BR>
         * }<BR>
         * </details>
         * 
         * <details>
         * <summary>CPFS for AI computing</summary>
         * {<BR>
         *   "region": "${region}",// The region ID.<BR>
         *   "fileSystemId": "${file_system_id}", // The file system ID.<BR>
         *   "path": "${path}",  // The file system path.<BR>
         *   "mountTarget": "${mount_target}" // The mount target of the file system. This parameter is specific to the AI computing edition.<BR>
         *   "isVpcMount": boolean, // Specifies whether the mount target is a VPC mount target. This parameter is specific to the AI computing edition.<BR>
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
         * <p>The list of labels for the dataset version.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The extended field. The value is a JSON string. When DLC uses the dataset, you can configure the mountPath field to specify the default mount path for the dataset.</p>
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
         * <li>FILE: file</li>
         * <li>DIRECTORY: directory</li>
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
         * <p>The source ID.</p>
         * <ul>
         * <li>If SourceType is set to USER, you can specify a custom SourceId.</li>
         * <li>If SourceType is set to ITAG, the dataset is generated from the labeling results of the iTAG module, and SourceId is the task ID in iTAG.</li>
         * <li>If SourceType is set to PAI_PUBLIC_DATASET, the dataset is created from a PAI public dataset, and SourceId is empty by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>d-a0xbe5n03bhqof46ce</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source type. Default value: USER. Valid values:</p>
         * <ul>
         * <li>PAI-PUBLIC-DATASET: PAI public dataset.</li>
         * <li>ITAG: dataset generated from the labeling results of the iTAG module.</li>
         * <li>USER: user-registered dataset.</li>
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
         * <p>The URI. Configuration examples:</p>
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
         * <p>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</p>
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        /**
         * <p>The list of user metric collection endpoints.</p>
         */
        public Builder userMetricsEndpoints(java.util.List<UserMetricsEndpoint> userMetricsEndpoints) {
            this.putBodyParameter("UserMetricsEndpoints", userMetricsEndpoints);
            this.userMetricsEndpoints = userMetricsEndpoints;
            return this;
        }

        @Override
        public CreateDatasetVersionRequest build() {
            return new CreateDatasetVersionRequest(this);
        } 

    } 

}
