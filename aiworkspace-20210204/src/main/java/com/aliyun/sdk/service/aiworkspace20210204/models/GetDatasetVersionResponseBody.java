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
 * {@link GetDatasetVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetVersionResponseBody</p>
 */
public class GetDatasetVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCount")
    private Long dataCount;

    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("DatasetTaskRamRole")
    private String datasetTaskRamRole;

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

    @com.aliyun.core.annotation.NameInMap("MountAccess")
    private String mountAccess;

    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.NameInMap("Property")
    @com.aliyun.core.annotation.Validation(required = true)
    private String property;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("Uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    @com.aliyun.core.annotation.NameInMap("UserMetricsEndpoints")
    private java.util.List<UserMetricsEndpoint> userMetricsEndpoints;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private GetDatasetVersionResponseBody(Builder builder) {
        this.dataCount = builder.dataCount;
        this.dataSize = builder.dataSize;
        this.dataSourceType = builder.dataSourceType;
        this.datasetId = builder.datasetId;
        this.datasetTaskRamRole = builder.datasetTaskRamRole;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.importInfo = builder.importInfo;
        this.labels = builder.labels;
        this.mountAccess = builder.mountAccess;
        this.options = builder.options;
        this.property = builder.property;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.uri = builder.uri;
        this.userMetricsEndpoints = builder.userMetricsEndpoints;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
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
     * @return mountAccess
     */
    public String getMountAccess() {
        return this.mountAccess;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private Long dataCount; 
        private Long dataSize; 
        private String dataSourceType; 
        private String datasetId; 
        private String datasetTaskRamRole; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String importInfo; 
        private java.util.List<Label> labels; 
        private String mountAccess; 
        private String options; 
        private String property; 
        private String requestId; 
        private String sourceId; 
        private String sourceType; 
        private String uri; 
        private java.util.List<UserMetricsEndpoint> userMetricsEndpoints; 
        private String versionName; 

        private Builder() {
        } 

        private Builder(GetDatasetVersionResponseBody model) {
            this.dataCount = model.dataCount;
            this.dataSize = model.dataSize;
            this.dataSourceType = model.dataSourceType;
            this.datasetId = model.datasetId;
            this.datasetTaskRamRole = model.datasetTaskRamRole;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.importInfo = model.importInfo;
            this.labels = model.labels;
            this.mountAccess = model.mountAccess;
            this.options = model.options;
            this.property = model.property;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourceType = model.sourceType;
            this.uri = model.uri;
            this.userMetricsEndpoints = model.userMetricsEndpoints;
            this.versionName = model.versionName;
        } 

        /**
         * <p>The data count.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder dataCount(Long dataCount) {
            this.dataCount = dataCount;
            return this;
        }

        /**
         * <p>The dataset size.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li>NAS: File Storage NAS.</li>
         * <li>CPFS: Cloud Parallel File Storage.</li>
         * <li>OSS: Object Storage Service (OSS).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The primary ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>d-dkdbnnap0g7b6su4yg</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>DatasetTaskRamRole</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/role-name</p>
         */
        public Builder datasetTaskRamRole(String datasetTaskRamRole) {
            this.datasetTaskRamRole = datasetTaskRamRole;
            return this;
        }

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of the dataset version.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The creation time. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ss.sssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-13T10:22:05.694Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The last modification time. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ss.sssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-13T10:22:05.694Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The storage import configuration of the dataset. OSS, NAS, and CPFS are supported.</p>
         * <details>
         * <summary>OSS</summary>
         * {
         * "region": "${region}",// The region ID
         * "bucket": "${bucket}",// The bucket name
         * "path": "${path}" // The file path
         * }
         * </details>
         * 
         * <details>
         * <summary>NAS</summary>
         * 
         * </details>
         * 
         * <details>
         * <summary>CPFS</summary>
         * Block content
         * </details>
         * 
         * 
         * <details>
         * <summary>AI CPFS</summary>
         * Block content
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
         * <p>The resource tags.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The permissions when the dataset is mounted. Valid values:</p>
         * <ul>
         * <li>RO: Read-only mount.</li>
         * <li>RW: Read/write mount.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RO</p>
         */
        public Builder mountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }

        /**
         * <p>The extended fields.</p>
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
         * <p>The property of the dataset. Valid values:</p>
         * <ul>
         * <li>DIRECTORY: Directory.</li>
         * <li>FILE: File.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DIRECTORY</p>
         */
        public Builder property(String property) {
            this.property = property;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C55DF3DA-F120-5E37-A374-F49365531701</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source ID of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5wzljzjhc9ks92</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source type. Valid values:</p>
         * <ul>
         * <li>ENHANCE: Data augmentation.</li>
         * <li>ADDVERSION: Added version.</li>
         * <li>CLEANING: Data cleaning.</li>
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
         * <p>The URI configuration example.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://ai4d-br7hx9ngzelo2o6uip.oss-cn-shanghai.aliyuncs.com/365349/data-1157703270994901/datasets/aka108o/</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * <p>The list of user metric collection endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Port&quot;:0,&quot;Path&quot;:&quot;&quot;}]</p>
         */
        public Builder userMetricsEndpoints(java.util.List<UserMetricsEndpoint> userMetricsEndpoints) {
            this.userMetricsEndpoints = userMetricsEndpoints;
            return this;
        }

        /**
         * <p>The dataset version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public GetDatasetVersionResponseBody build() {
            return new GetDatasetVersionResponseBody(this);
        } 

    } 

}
