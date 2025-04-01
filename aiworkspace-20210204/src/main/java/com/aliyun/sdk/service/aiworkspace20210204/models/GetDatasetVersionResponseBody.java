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

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private GetDatasetVersionResponseBody(Builder builder) {
        this.dataCount = builder.dataCount;
        this.dataSize = builder.dataSize;
        this.dataSourceType = builder.dataSourceType;
        this.datasetId = builder.datasetId;
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
        private String versionName; 

        private Builder() {
        } 

        private Builder(GetDatasetVersionResponseBody model) {
            this.dataCount = model.dataCount;
            this.dataSize = model.dataSize;
            this.dataSourceType = model.dataSourceType;
            this.datasetId = model.datasetId;
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
            this.versionName = model.versionName;
        } 

        /**
         * <p>数据集的数据量</p>
         */
        public Builder dataCount(Long dataCount) {
            this.dataCount = dataCount;
            return this;
        }

        /**
         * <p>数据集版本的数据大小。</p>
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>数据源类型。支持以下取值：</p>
         * <ul>
         * <li>OSS：阿里云对象存储（OSS）。</li>
         * <li>NAS：阿里云文件存储（NAS）。</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>数据集版本的描述信息。</p>
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
         * <p>创建时间。</p>
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
         * <p>代表资源标签的资源属性字段</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
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
         * <p>扩展字段，JsonString类型。
         * 当DLC使用数据集时，可通过配置mountPath字段指定数据集默认挂载路径。</p>
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * <p>数据集的属性。支持以下取值：</p>
         * <ul>
         * <li>FILE：文件。</li>
         * <li>DIRECTORY：文件夹。</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder property(String property) {
            this.property = property;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>数据来源ID。</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>数据来源类型，默认为USER。支持以下取值：</p>
         * <ul>
         * <li>PAI-PUBLIC-DATASET：PAI公共数据集。</li>
         * <li>ITAG：iTAG模块标注结果生成的数据集。</li>
         * <li>USER：用户注册的数据集。</li>
         * </ul>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>Uri配置样例如下：</p>
         * <ul>
         * <li>数据源类型为OSS：<code>oss://bucket.endpoint/object</code></li>
         * <li>数据源类型为NAS：
         * 通用型NAS格式为：<code>nas://&lt;nasfisid&gt;.region/subpath/to/dir/</code>；
         * CPFS1.0：<code>nas://&lt;cpfs-fsid&gt;.region/subpath/to/dir/</code>；
         * CPFS2.0：<code>nas://&lt;cpfs-fsid&gt;.region/&lt;protocolserviceid&gt;/</code>。
         * CPFS1.0和CPFS2.0根据fsid的格式来区分：CPFS1.0 格式为cpfs-&lt;8位ascii字符&gt;；CPFS2.0 格式为cpfs-&lt;16为ascii字符&gt;。</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * <p>代表资源名称的资源属性字段</p>
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
