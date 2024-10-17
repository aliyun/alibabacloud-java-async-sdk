// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDataFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateDataFlowRequest</p>
 */
public class CreateDataFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefreshInterval")
    @com.aliyun.core.annotation.Validation(maximum = 525600, minimum = 5)
    private Long autoRefreshInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefreshPolicy")
    private String autoRefreshPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefreshs")
    private java.util.List < AutoRefreshs> autoRefreshs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemPath")
    @com.aliyun.core.annotation.Validation(maxLength = 1023, minLength = 1)
    private String fileSystemPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsetId")
    private String fsetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceSecurityType")
    private String sourceSecurityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceStorage")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String sourceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceStoragePath")
    @com.aliyun.core.annotation.Validation(maxLength = 1023, minLength = 1)
    private String sourceStoragePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Throughput")
    private Long throughput;

    private CreateDataFlowRequest(Builder builder) {
        super(builder);
        this.autoRefreshInterval = builder.autoRefreshInterval;
        this.autoRefreshPolicy = builder.autoRefreshPolicy;
        this.autoRefreshs = builder.autoRefreshs;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.fileSystemPath = builder.fileSystemPath;
        this.fsetId = builder.fsetId;
        this.sourceSecurityType = builder.sourceSecurityType;
        this.sourceStorage = builder.sourceStorage;
        this.sourceStoragePath = builder.sourceStoragePath;
        this.throughput = builder.throughput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRefreshInterval
     */
    public Long getAutoRefreshInterval() {
        return this.autoRefreshInterval;
    }

    /**
     * @return autoRefreshPolicy
     */
    public String getAutoRefreshPolicy() {
        return this.autoRefreshPolicy;
    }

    /**
     * @return autoRefreshs
     */
    public java.util.List < AutoRefreshs> getAutoRefreshs() {
        return this.autoRefreshs;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return fileSystemPath
     */
    public String getFileSystemPath() {
        return this.fileSystemPath;
    }

    /**
     * @return fsetId
     */
    public String getFsetId() {
        return this.fsetId;
    }

    /**
     * @return sourceSecurityType
     */
    public String getSourceSecurityType() {
        return this.sourceSecurityType;
    }

    /**
     * @return sourceStorage
     */
    public String getSourceStorage() {
        return this.sourceStorage;
    }

    /**
     * @return sourceStoragePath
     */
    public String getSourceStoragePath() {
        return this.sourceStoragePath;
    }

    /**
     * @return throughput
     */
    public Long getThroughput() {
        return this.throughput;
    }

    public static final class Builder extends Request.Builder<CreateDataFlowRequest, Builder> {
        private Long autoRefreshInterval; 
        private String autoRefreshPolicy; 
        private java.util.List < AutoRefreshs> autoRefreshs; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String fileSystemPath; 
        private String fsetId; 
        private String sourceSecurityType; 
        private String sourceStorage; 
        private String sourceStoragePath; 
        private Long throughput; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataFlowRequest request) {
            super(request);
            this.autoRefreshInterval = request.autoRefreshInterval;
            this.autoRefreshPolicy = request.autoRefreshPolicy;
            this.autoRefreshs = request.autoRefreshs;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.fileSystemPath = request.fileSystemPath;
            this.fsetId = request.fsetId;
            this.sourceSecurityType = request.sourceSecurityType;
            this.sourceStorage = request.sourceStorage;
            this.sourceStoragePath = request.sourceStoragePath;
            this.throughput = request.throughput;
        } 

        /**
         * <p>The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minutes.</p>
         * <p>Valid values: 10 to 525600. Default value: 10.</p>
         * <blockquote>
         * <p> This parameter takes effect only for CPFS file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder autoRefreshInterval(Long autoRefreshInterval) {
            this.putQueryParameter("AutoRefreshInterval", autoRefreshInterval);
            this.autoRefreshInterval = autoRefreshInterval;
            return this;
        }

        /**
         * <p>The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy.</p>
         * <ul>
         * <li>None (default): Updated data in the source storage is not automatically imported into the CPFS file system. You can run a data flow task to import the updated data from the source storage.</li>
         * <li>ImportChanged: Updated data in the source storage is automatically imported into the CPFS file system.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only for CPFS file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder autoRefreshPolicy(String autoRefreshPolicy) {
            this.putQueryParameter("AutoRefreshPolicy", autoRefreshPolicy);
            this.autoRefreshPolicy = autoRefreshPolicy;
            return this;
        }

        /**
         * <p>The automatic update configurations.</p>
         * <blockquote>
         * <p> This parameter takes effect only for CPFS file systems.</p>
         * </blockquote>
         */
        public Builder autoRefreshs(java.util.List < AutoRefreshs> autoRefreshs) {
            this.putQueryParameter("AutoRefreshs", autoRefreshs);
            this.autoRefreshs = autoRefreshs;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the dataflow.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Bucket01 DataFlow</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run.</p>
         * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</li>
         * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-125487****.</li>
         * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-0015****.</li>
         * </ul>
         * <blockquote>
         * <p> CPFS file systems are available only on the China site (aliyun.com).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The directory in the CPFS for LINGJUN file system. Limits:</p>
         * <ul>
         * <li>The directory must start and end with a forward slash (/).</li>
         * <li>The directory must be an existing directory in the CPFS for LINGJUN file system.</li>
         * <li>The directory must be 1 to 1023 characters in length.</li>
         * <li>The directory must be encoded in UTF-8.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required for CPFS for LINGJUN file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/path/</p>
         */
        public Builder fileSystemPath(String fileSystemPath) {
            this.putQueryParameter("FileSystemPath", fileSystemPath);
            this.fileSystemPath = fileSystemPath;
            return this;
        }

        /**
         * <p>The fileset ID.</p>
         * <blockquote>
         * <p> This parameter is required for CPFS file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        public Builder fsetId(String fsetId) {
            this.putQueryParameter("FsetId", fsetId);
            this.fsetId = fsetId;
            return this;
        }

        /**
         * <p>The type of security mechanism for the source storage. This parameter must be specified if the source storage is accessed with a security mechanism. Valid values:</p>
         * <ul>
         * <li>None (default): The source storage can be accessed without a security mechanism.</li>
         * <li>SSL: The source storage must be accessed with an SSL certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSL</p>
         */
        public Builder sourceSecurityType(String sourceSecurityType) {
            this.putQueryParameter("SourceSecurityType", sourceSecurityType);
            this.sourceSecurityType = sourceSecurityType;
            return this;
        }

        /**
         * <p>The access path of the source storage. Format: <code>&lt;storage type&gt;://&lt;path&gt;</code>.</p>
         * <p>Parameters:</p>
         * <ul>
         * <li><p>storage type: Only OSS is supported.</p>
         * </li>
         * <li><p>path: the name of the OSS bucket. Limits:</p>
         * <ul>
         * <li>The path can contain only lowercase letters, digits, and hyphens (-). The path must start and end with a lowercase letter or digit.</li>
         * <li>The path can be up to 128 characters in length.</li>
         * <li>The path must be encoded in UTF-8.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> The OSS bucket must be an existing bucket in the region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket1</p>
         */
        public Builder sourceStorage(String sourceStorage) {
            this.putQueryParameter("SourceStorage", sourceStorage);
            this.sourceStorage = sourceStorage;
            return this;
        }

        /**
         * <p>The access path in the bucket of the source storage. Limits:</p>
         * <ul>
         * <li>The path must start and end with a forward slash (/).</li>
         * <li>The path is case-sensitive.</li>
         * <li>The path must be 1 to 1023 characters in length.</li>
         * <li>The path must be encoded in UTF-8.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required for CPFS for LINGJUN file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/prefix/</p>
         */
        public Builder sourceStoragePath(String sourceStoragePath) {
            this.putQueryParameter("SourceStoragePath", sourceStoragePath);
            this.sourceStoragePath = sourceStoragePath;
            return this;
        }

        /**
         * <p>The maximum data flow throughput. Unit: MB/s. Valid values:</p>
         * <ul>
         * <li>600</li>
         * <li>1200</li>
         * <li>1500</li>
         * </ul>
         * <blockquote>
         * <p> The data flow throughput must be less than the I/O throughput of the file system. This parameter is required for CPFS file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder throughput(Long throughput) {
            this.putQueryParameter("Throughput", throughput);
            this.throughput = throughput;
            return this;
        }

        @Override
        public CreateDataFlowRequest build() {
            return new CreateDataFlowRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataFlowRequest} extends {@link TeaModel}
     *
     * <p>CreateDataFlowRequest</p>
     */
    public static class AutoRefreshs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefreshPath")
        @com.aliyun.core.annotation.Validation(maxLength = 1024, minLength = 2)
        private String refreshPath;

        private AutoRefreshs(Builder builder) {
            this.refreshPath = builder.refreshPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRefreshs create() {
            return builder().build();
        }

        /**
         * @return refreshPath
         */
        public String getRefreshPath() {
            return this.refreshPath;
        }

        public static final class Builder {
            private String refreshPath; 

            /**
             * <p>The automatic update directory. CPFS registers the data update event in the source storage, and automatically checks whether the source data in the directory is updated and imports the updated data.</p>
             * <p>This parameter is empty by default. Updated data in the source storage is not automatically imported into the CPFS file system. You must import the updated data by running a manual task.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>The directory must be 2 to 1,024 characters in length.</li>
             * <li>The directory must be encoded in UTF-8.</li>
             * <li>The directory must start and end with a forward slash (/).</li>
             * <li>The directory must be an existing directory in the CPFS file system and must be in a fileset where the data flow is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/prefix1/prefix2/</p>
             */
            public Builder refreshPath(String refreshPath) {
                this.refreshPath = refreshPath;
                return this;
            }

            public AutoRefreshs build() {
                return new AutoRefreshs(this);
            } 

        } 

    }
}
