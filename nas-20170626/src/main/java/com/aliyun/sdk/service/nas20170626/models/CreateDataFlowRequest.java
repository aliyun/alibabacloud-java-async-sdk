// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minutes.
         * <p>
         * 
         * Valid values: 5 to 525600. Default value: 10.
         */
        public Builder autoRefreshInterval(Long autoRefreshInterval) {
            this.putQueryParameter("AutoRefreshInterval", autoRefreshInterval);
            this.autoRefreshInterval = autoRefreshInterval;
            return this;
        }

        /**
         * The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy.
         * <p>
         * 
         * *   None (default): Updated data in the source storage is not automatically imported into the CPFS file system. You can run a dataflow task to import the updated data from the source storage.
         * *   ImportChanged: Updated data in the source storage is automatically imported into the CPFS file system.
         */
        public Builder autoRefreshPolicy(String autoRefreshPolicy) {
            this.putQueryParameter("AutoRefreshPolicy", autoRefreshPolicy);
            this.autoRefreshPolicy = autoRefreshPolicy;
            return this;
        }

        /**
         * The automatic update configurations.
         */
        public Builder autoRefreshs(java.util.List < AutoRefreshs> autoRefreshs) {
            this.putQueryParameter("AutoRefreshs", autoRefreshs);
            this.autoRefreshs = autoRefreshs;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)
         * 
         * >  If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the dataflow.
         * <p>
         * 
         * Limits:
         * 
         * *   The description must be 2 to 128 characters in length.
         * *   The description must start with a letter but cannot start with `http://` or `https://`.
         * *   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to perform a dry run.
         * <p>
         * 
         * During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.
         * 
         * Valid values:
         * 
         * *   true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.
         * *   false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * FileSystemPath.
         */
        public Builder fileSystemPath(String fileSystemPath) {
            this.putQueryParameter("FileSystemPath", fileSystemPath);
            this.fileSystemPath = fileSystemPath;
            return this;
        }

        /**
         * The fileset ID.
         */
        public Builder fsetId(String fsetId) {
            this.putQueryParameter("FsetId", fsetId);
            this.fsetId = fsetId;
            return this;
        }

        /**
         * The type of security mechanism for the source storage. This parameter must be specified if the source storage is accessed with a security mechanism. Valid values:
         * <p>
         * 
         * *   None (default): The source storage can be accessed without a security mechanism.
         * *   SSL: The source storage must be accessed with an SSL certificate.
         */
        public Builder sourceSecurityType(String sourceSecurityType) {
            this.putQueryParameter("SourceSecurityType", sourceSecurityType);
            this.sourceSecurityType = sourceSecurityType;
            return this;
        }

        /**
         * The access path of the source storage. Format: `<storage type>://<path>`.
         * <p>
         * 
         * Parameters:
         * 
         * *   storage type: Only OSS is supported.
         * 
         * *   path: the name of the OSS bucket. Limits:
         * 
         *     *   The name can contain only lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.
         *     *   The name must be 8 to 128 characters in length.
         *     *   The name must be encoded in UTF-8.
         *     *   The name cannot start with `http://` or `https://`.
         * 
         * >  The OSS bucket must be an existing bucket in the region.
         */
        public Builder sourceStorage(String sourceStorage) {
            this.putQueryParameter("SourceStorage", sourceStorage);
            this.sourceStorage = sourceStorage;
            return this;
        }

        /**
         * SourceStoragePath.
         */
        public Builder sourceStoragePath(String sourceStoragePath) {
            this.putQueryParameter("SourceStoragePath", sourceStoragePath);
            this.sourceStoragePath = sourceStoragePath;
            return this;
        }

        /**
         * The maximum dataflow throughput. Unit: MB/s. Valid values:
         * <p>
         * 
         * *   600
         * *   1,200
         * *   1,500
         * 
         * >  The dataflow throughput must be less than the I/O throughput of the file system
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
             * The automatic update directory. CPFS registers the data update event in the source storage, and automatically checks whether the source data in the directory is updated and imports the updated data.
             * <p>
             * 
             * This parameter is empty by default. Updated data in the source storage is not automatically imported into the CPFS file system. You must import the updated data by running a manual task.
             * 
             * Limits:
             * 
             * *   The directory must be 2 to 1,024 characters in length.
             * *   The directory must be encoded in UTF-8.
             * *   The directory must start and end with a forward slash (/).
             * *   The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.
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
