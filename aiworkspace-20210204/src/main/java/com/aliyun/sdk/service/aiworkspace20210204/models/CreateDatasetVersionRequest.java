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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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

    private CreateDatasetVersionRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.dataCount = builder.dataCount;
        this.dataSize = builder.dataSize;
        this.dataSourceType = builder.dataSourceType;
        this.description = builder.description;
        this.importInfo = builder.importInfo;
        this.labels = builder.labels;
        this.options = builder.options;
        this.property = builder.property;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.uri = builder.uri;
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

    public static final class Builder extends Request.Builder<CreateDatasetVersionRequest, Builder> {
        private String datasetId; 
        private Long dataCount; 
        private Long dataSize; 
        private String dataSourceType; 
        private String description; 
        private String importInfo; 
        private java.util.List<Label> labels; 
        private String options; 
        private String property; 
        private String sourceId; 
        private String sourceType; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetVersionRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.dataCount = request.dataCount;
            this.dataSize = request.dataSize;
            this.dataSourceType = request.dataSourceType;
            this.description = request.description;
            this.importInfo = request.importInfo;
            this.labels = request.labels;
            this.options = request.options;
            this.property = request.property;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.uri = request.uri;
        } 

        /**
         * <p>The dataset ID. You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID.</p>
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
         * <p>The number of dataset files.</p>
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
         * <p>The size of the dataset file. Unit: bytes.</p>
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
         * <p>The type of the data source. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li>NAS: File Storage NAS (NAS).</li>
         * <li>OSS: Object Storage Service (OSS).</li>
         * <li>CPFS</li>
         * </ul>
         * <p>Note: The DataSourceType value of a dataset version must be the same as that of the dataset. When you create a dataset version, the system checks whether the values are the same.</p>
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
         * <p>The description of the dataset. Descriptions are used to differentiate datasets.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The dataset storage import configurations, such as OSS, NAS, and CPFS.</p>
         * <p><strong>OSS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID<br>&quot;bucket&quot;: &quot;${bucket}&quot;,//The bucket name<br>&quot;path&quot;: &quot;${path}&quot; // The file path<br>}\</p>
         * <p><strong>NAS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID<br>&quot;path&quot;: &quot;${path}&quot;, // The file system path<br>&quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system<br>}\</p>
         * <p><strong>CPFS</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID<br>&quot;protocolServiceId&quot;:&quot;${protocol_service_id}&quot;, // The file system protocol service<br>&quot;exportId&quot;: &quot;${export_id}&quot;, // The file system export directory<br>&quot;path&quot;: &quot;${path}&quot;, // The file system path<br>}\</p>
         * <p><strong>CPFS for Lingjun</strong></p>
         * <p>{<br>&quot;region&quot;: &quot;${region}&quot;,// The region ID<br>&quot;fileSystemId&quot;: &quot;${file_system_id}&quot;, // The file system ID<br>&quot;path&quot;: &quot;${path}&quot;, // The ile system path<br>&quot;mountTarget&quot;: &quot;${mount_target}&quot; // The mount point of the file system, CPFS for Lingjun only<br>&quot;isVpcMount&quot;: boolean, // Whether the mount point is a VPC mount point, CPFS for Lingjun only<br>}\</p>
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
         * <p>The tags of the dataset version.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The extended field, which is of the JsonString type. When you use the dataset in Deep Learning Containers (DLC), you can use the mountPath field to specify the default mount path of the dataset.</p>
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
         * <p>The ID of the data source.</p>
         * <ul>
         * <li>If SourceType is set to USER, the value of SourceId can be a custom string.</li>
         * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
         * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
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
         * <p>The type of the data source. Default value: USER. Valid values:</p>
         * <ul>
         * <li>PAI-PUBLIC-DATASET: a public dataset of Platform for AI (PAI).</li>
         * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
         * <li>USER: a dataset registered by a user.</li>
         * </ul>
         * <p>For each job type:</p>
         * <ul>
         * <li>PAI_PUBLIC_DATASET: PAI_PUBLIC_DATASET.</li>
         * <li>ITAG: ITAG.</li>
         * <li>USER: USER.</li>
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
         * <p>Example format:</p>
         * <ul>
         * <li>Value format when DataSourceType is set to OSS: <code>oss://bucket.endpoint/object</code>.</li>
         * <li>Value formats when DataSourceType is set to NAS: General-purpose NAS: <code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>. CPFS 1.0: <code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>. CPFS 2.0: <code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>. You can distinguish CPFS 1.0 and CPFS 2.0 file systems based on the format of the file system ID: The ID for CPFS 1.0 is in the cpfs-&lt;8-bit ASCII characters&gt; format. The ID for CPFS 2.0 is in the cpfs-&lt;16-bit ASCII characters&gt; format.</li>
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

        @Override
        public CreateDatasetVersionRequest build() {
            return new CreateDatasetVersionRequest(this);
        } 

    } 

}
