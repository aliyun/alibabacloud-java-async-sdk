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
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InitVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private InitVersion initVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StorageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageType;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.dataType = builder.dataType;
        this.initVersion = builder.initVersion;
        this.name = builder.name;
        this.origin = builder.origin;
        this.projectId = builder.projectId;
        this.storageType = builder.storageType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return initVersion
     */
    public InitVersion getInitVersion() {
        return this.initVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String regionId; 
        private String comment; 
        private String dataType; 
        private InitVersion initVersion; 
        private String name; 
        private String origin; 
        private Long projectId; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.dataType = request.dataType;
            this.initVersion = request.initVersion;
            this.name = request.name;
            this.origin = request.origin;
            this.projectId = request.projectId;
            this.storageType = request.storageType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the dataset. It must not exceed 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a comment</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The data type. Valid values:</p>
         * <ul>
         * <li>COMMON: Common (Default)</li>
         * <li>PIC</li>
         * <li>TEXT</li>
         * <li>TABLE</li>
         * <li>VIDEO</li>
         * <li>AUDIO</li>
         * <li>INDEX</li>
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
         * <p>The initial version of the dataset.</p>
         * <p>This parameter is required.</p>
         */
        public Builder initVersion(InitVersion initVersion) {
            String initVersionShrink = shrink(initVersion, "InitVersion", "json");
            this.putBodyParameter("InitVersion", initVersionShrink);
            this.initVersion = initVersion;
            return this;
        }

        /**
         * <p>The name of the dataset. It cannot be an empty string and must not exceed 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_oss_dataset</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The source of the dataset. Currently, only DataWorks is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DataWorks</p>
         */
        public Builder origin(String origin) {
            this.putBodyParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The storage type. Currently supported values:</p>
         * <ul>
         * <li>OSS</li>
         * <li>NAS: General-purpose NAS file systems</li>
         * <li>EXTREMENAS: Extreme NAS file systems</li>
         * <li>DLF_LANCE: Data Lake Formation</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>NAS: General-purpose NAS file systems</li>
         * <li>MAXCOMPUTE: MaxCompute table</li>
         * <li>CPFS: Cloud Parallel File Storage</li>
         * <li>BMCPFS: CPFS for Lingjun</li>
         * <li>EXTREMENAS: Extreme NAS file systems</li>
         * <li>OSS: Object Storage Service</li>
         * <li>DLF_LANCE: Data Lake Formation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder storageType(String storageType) {
            this.putBodyParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class InitVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ImportInfo")
        private java.util.Map<String, String> importInfo;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true)
        private String url;

        private InitVersion(Builder builder) {
            this.comment = builder.comment;
            this.importInfo = builder.importInfo;
            this.mountPath = builder.mountPath;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitVersion create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return importInfo
         */
        public java.util.Map<String, String> getImportInfo() {
            return this.importInfo;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String comment; 
            private java.util.Map<String, String> importInfo; 
            private String mountPath; 
            private String url; 

            private Builder() {
            } 

            private Builder(InitVersion model) {
                this.comment = model.comment;
                this.importInfo = model.importInfo;
                this.mountPath = model.mountPath;
                this.url = model.url;
            } 

            /**
             * <p>The description. It must not exceed 1,024 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>Initial Version</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The storage import configuration for the dataset. The required configuration information varies by storage type.</p>
             * <p><strong>NAS</strong></p>
             * <p>For valid values, refer to the response of the file storage API DescribeFileSystems.</p>
             * <pre><code class="language-JSON">{
             * &quot;fileSystemId&quot;: &quot;3b6XXX89c9&quot;, // The file system ID.
             * &quot;fileSystemStorageType&quot;:  &quot;Performance&quot; // The storage specification of the file system.
             * &quot;vpcId&quot;: &quot;vpc-uf66oxxxrqge1t2gson7s&quot; // The VPC ID of the mount point.
             * }
             * </code></pre>
             */
            public Builder importInfo(java.util.Map<String, String> importInfo) {
                this.importInfo = importInfo;
                return this;
            }

            /**
             * <p>The mount path. It must start with /mnt/. Default value: /mnt/data.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>URL</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-oss-bucket/test_dir/</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public InitVersion build() {
                return new InitVersion(this);
            } 

        } 

    }
}
