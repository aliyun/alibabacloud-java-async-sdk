// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link DatasetVersion} extends {@link TeaModel}
 *
 * <p>DatasetVersion</p>
 */
public class DatasetVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("ImportInfo")
    private java.util.Map<String, String> importInfo;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<DatasetLabel> labels;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("MountPath")
    private String mountPath;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("VersionNumber")
    private Integer versionNumber;

    private DatasetVersion(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.creatorId = builder.creatorId;
        this.datasetId = builder.datasetId;
        this.id = builder.id;
        this.importInfo = builder.importInfo;
        this.labels = builder.labels;
        this.modifyTime = builder.modifyTime;
        this.mountPath = builder.mountPath;
        this.storageType = builder.storageType;
        this.url = builder.url;
        this.versionNumber = builder.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetVersion create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return importInfo
     */
    public java.util.Map<String, String> getImportInfo() {
        return this.importInfo;
    }

    /**
     * @return labels
     */
    public java.util.List<DatasetLabel> getLabels() {
        return this.labels;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return versionNumber
     */
    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    public static final class Builder {
        private String comment; 
        private Long createTime; 
        private String creatorId; 
        private String datasetId; 
        private String id; 
        private java.util.Map<String, String> importInfo; 
        private java.util.List<DatasetLabel> labels; 
        private Long modifyTime; 
        private String mountPath; 
        private String storageType; 
        private String url; 
        private Integer versionNumber; 

        private Builder() {
        } 

        private Builder(DatasetVersion model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.creatorId = model.creatorId;
            this.datasetId = model.datasetId;
            this.id = model.id;
            this.importInfo = model.importInfo;
            this.labels = model.labels;
            this.modifyTime = model.modifyTime;
            this.mountPath = model.mountPath;
            this.storageType = model.storageType;
            this.url = model.url;
            this.versionNumber = model.versionNumber;
        } 

        /**
         * <p>The dataset version description.</p>
         * 
         * <strong>example:</strong>
         * <p>初始版本</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>Creation time (milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1736756055000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17815XXX61016173</p>
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The corresponding dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-datasetVersion:0gfxxxjx155usz3hrv</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The dataset version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-datasetVersion:0gfxxxjx155usz3hrv:1</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The storage import configuration for the dataset; required configuration varies by storage type.</p>
         * <p><strong>NAS</strong></p>
         * <p>Refer to the return values from the file storage API DescribeFileSystems.</p>
         * <pre><code class="language-JSON">{
         * &quot;fileSystemId&quot;: &quot;3b6XXX89c9&quot;, // The file system ID.
         * &quot;fileSystemStorageType&quot;:  &quot;Performance&quot; // The file system storage type.
         * &quot;vpcId&quot;: &quot;vpc-uf66oxxxrqge1t2gson7s&quot; // The VPC ID of the mount point.
         * }
         * </code></pre>
         */
        public Builder importInfo(java.util.Map<String, String> importInfo) {
            this.importInfo = importInfo;
            return this;
        }

        /**
         * <p>The PAI dataset label.</p>
         */
        public Builder labels(java.util.List<DatasetLabel> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>Modification time (milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1736756055000</p>
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The mount path. Defaults to /mnt/data.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * <p>Storage type (read-only); consistent with the corresponding property of the parent dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>URL</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-oss-bucket/test_dir/</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * <p>The dataset version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder versionNumber(Integer versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        public DatasetVersion build() {
            return new DatasetVersion(this);
        } 

    } 

}
