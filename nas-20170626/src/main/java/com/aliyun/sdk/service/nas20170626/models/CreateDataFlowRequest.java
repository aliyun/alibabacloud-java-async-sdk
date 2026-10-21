// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
    private java.util.List<AutoRefreshs> autoRefreshs;

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
    public java.util.List<AutoRefreshs> getAutoRefreshs() {
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
        private java.util.List<AutoRefreshs> autoRefreshs; 
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
         * <p>The auto-refresh interval. General-purpose CPFS checks whether data updates exist in the directory at this interval. If data updates exist, an auto-refresh task is started. Unit: minutes.</p>
         * <p>Valid values: 10 to 525600. Default value: 10.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the file system type is General-purpose CPFS.</p>
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
         * <p>The auto-refresh policy. This policy determines how data updates from the source storage are imported to General-purpose CPFS.</p>
         * <ul>
         * <li>None: Data updates from the source storage are not automatically imported to General-purpose CPFS. You can use a data flow task to import the updates. This is the default value.</li>
         * <li>ImportChanged: Data updates from the source storage are automatically imported to General-purpose CPFS.<blockquote>
         * <p>This parameter takes effect only when the file system type is General-purpose CPFS.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The auto-refresh configurations.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the file system type is General-purpose CPFS.</p>
         * </blockquote>
         */
        public Builder autoRefreshs(java.util.List<AutoRefreshs> autoRefreshs) {
            this.putQueryParameter("AutoRefreshs", autoRefreshs);
            this.autoRefreshs = autoRefreshs;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can generate the token on your client to ensure that the token is unique across different requests.</p>
         * <p>The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
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
         * <p>The description of the data flow. </p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), and hyphens (-).</li>
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
         * <p>Specifies whether to perform a dry run on the creation request.</p>
         * <p>A dry run helps you check parameter validity and resource availability without actually creating the instance or incurring fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: A dry run is performed and no instance is created. The system checks whether required parameters are specified, the request format, business limits, and NAS resource availability. If the request fails the dry run, an error is returned. If the request passes the dry run, the HTTP status code 200 is returned, but the FileSystemId parameter is empty.</li>
         * <li>false: A regular request is sent. If the request passes the dry run, the instance is created. This is the default value.</li>
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
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>General-purpose CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * </ul>
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
         * <p>The directory in the CPFS for Lingjun file system. Limits:</p>
         * <ul>
         * <li><p>The directory must start and end with a forward slash (/).</p>
         * </li>
         * <li><p>The directory must already exist in the CPFS for Lingjun file system.</p>
         * </li>
         * <li><p>The directory must be 1 to 1,023 characters in length.</p>
         * </li>
         * <li><p>The directory must be encoded in UTF-8.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when the file system type is CPFS for Lingjun.</p>
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
         * <p>This parameter is required when the file system type is General-purpose CPFS.</p>
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
         * <p>The security protection type of the source storage. If the source storage must be accessed through security protection, specify the security protection type. Valid values:</p>
         * <ul>
         * <li>None: The source storage does not require security protection for access. This is the default value.</li>
         * <li>SSL: Access is protected by an SSL certificate.</li>
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
         * <p>The access address of the source storage. Format: <code>&lt;storage type&gt;://[&lt;account id&gt;:]&lt;path&gt;</code>.</p>
         * <p>Where:</p>
         * <ul>
         * <li><p>storage type: Only oss is supported.</p>
         * </li>
         * <li><p>account id: Optional. The UID of the account to which the source storage belongs. This parameter is required when you use a cross-account OSS bucket.</p>
         * </li>
         * <li><p>path: The name of the OSS bucket. Limits:</p>
         * <ul>
         * <li><p>The name can contain only lowercase letters, digits, and hyphens (-), and must start and end with a lowercase letter or a digit.</p>
         * </li>
         * <li><p>The name can be up to 128 characters in length.</p>
         * </li>
         * <li><p>The name must be encoded in UTF-8.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The OSS bucket must already exist in the region.</li>
         * <li>The account id parameter is supported only in CPFS for Lingjun 2.6.0 and later.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://178321033379****:bucket-01</p>
         */
        public Builder sourceStorage(String sourceStorage) {
            this.putQueryParameter("SourceStorage", sourceStorage);
            this.sourceStorage = sourceStorage;
            return this;
        }

        /**
         * <p>The access path in the source storage bucket. Limits:</p>
         * <ul>
         * <li><p>The path must start and end with a forward slash (/).</p>
         * </li>
         * <li><p>The path is case-sensitive.</p>
         * </li>
         * <li><p>The path must be 1 to 1,023 characters in length.</p>
         * </li>
         * <li><p>The path must be encoded in UTF-8.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when the file system type is CPFS for Lingjun.</p>
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
         * <p>The maximum transmission bandwidth of the data flow. Unit: MB/s. Valid values: </p>
         * <ul>
         * <li>600</li>
         * <li>1200</li>
         * <li>1500</li>
         * </ul>
         * <blockquote>
         * <p>The transmission bandwidth of the data flow must be less than the I/O bandwidth of the file system.
         * This parameter is required when the file system type is General-purpose CPFS.</p>
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

            private Builder() {
            } 

            private Builder(AutoRefreshs model) {
                this.refreshPath = model.refreshPath;
            } 

            /**
             * <p>The auto-refresh directory. General-purpose CPFS registers data modification events of the source storage, checks whether the source data in this directory is updated, and automatically imports the updated data.</p>
             * <p>By default, this parameter is empty. Data updates in the source storage are not automatically imported to General-purpose CPFS. You must create a manual task to import the updates.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>The directory must be 2 to 1,024 characters in length.</li>
             * <li>The directory must be encoded in UTF-8.</li>
             * <li>The directory must start and end with a forward slash (/).</li>
             * <li>The directory must already exist in General-purpose CPFS and must be located in the fileset directory of the data flow.</li>
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
