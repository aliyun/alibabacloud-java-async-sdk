// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataFlowsResponseBody</p>
 */
public class DescribeDataFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataFlowInfo")
    private DataFlowInfo dataFlowInfo;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDataFlowsResponseBody(Builder builder) {
        this.dataFlowInfo = builder.dataFlowInfo;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataFlowsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataFlowInfo
     */
    public DataFlowInfo getDataFlowInfo() {
        return this.dataFlowInfo;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataFlowInfo dataFlowInfo; 
        private String nextToken; 
        private String requestId; 

        /**
         * The details about dataflows.
         */
        public Builder dataFlowInfo(DataFlowInfo dataFlowInfo) {
            this.dataFlowInfo = dataFlowInfo;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataFlowsResponseBody build() {
            return new DescribeDataFlowsResponseBody(this);
        } 

    } 

    public static class AutoRefresh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefreshPath")
        private String refreshPath;

        private AutoRefresh(Builder builder) {
            this.refreshPath = builder.refreshPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRefresh create() {
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
             * The automatic update directory. CPFS automatically checks whether the source data only in the directory is updated and imports the updated data.
             * <p>
             * 
             * Limits:
             * 
             * *   The directory must be 2 to 1,024 characters in length.
             * *   The directory must be encoded in UTF-8.
             * *   The directory must start and end with a forward slash (/).
             * 
             * >  The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.
             */
            public Builder refreshPath(String refreshPath) {
                this.refreshPath = refreshPath;
                return this;
            }

            public AutoRefresh build() {
                return new AutoRefresh(this);
            } 

        } 

    }
    public static class DataFlowAutoRefresh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRefresh")
        private java.util.List < AutoRefresh> autoRefresh;

        private DataFlowAutoRefresh(Builder builder) {
            this.autoRefresh = builder.autoRefresh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataFlowAutoRefresh create() {
            return builder().build();
        }

        /**
         * @return autoRefresh
         */
        public java.util.List < AutoRefresh> getAutoRefresh() {
            return this.autoRefresh;
        }

        public static final class Builder {
            private java.util.List < AutoRefresh> autoRefresh; 

            /**
             * AutoRefresh.
             */
            public Builder autoRefresh(java.util.List < AutoRefresh> autoRefresh) {
                this.autoRefresh = autoRefresh;
                return this;
            }

            public DataFlowAutoRefresh build() {
                return new DataFlowAutoRefresh(this);
            } 

        } 

    }
    public static class DataFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRefresh")
        private DataFlowAutoRefresh autoRefresh;

        @com.aliyun.core.annotation.NameInMap("AutoRefreshInterval")
        private Long autoRefreshInterval;

        @com.aliyun.core.annotation.NameInMap("AutoRefreshPolicy")
        private String autoRefreshPolicy;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataFlowId")
        private String dataFlowId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemPath")
        private String fileSystemPath;

        @com.aliyun.core.annotation.NameInMap("FsetDescription")
        private String fsetDescription;

        @com.aliyun.core.annotation.NameInMap("FsetId")
        private String fsetId;

        @com.aliyun.core.annotation.NameInMap("SourceSecurityType")
        private String sourceSecurityType;

        @com.aliyun.core.annotation.NameInMap("SourceStorage")
        private String sourceStorage;

        @com.aliyun.core.annotation.NameInMap("SourceStoragePath")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String sourceStoragePath;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Throughput")
        private Long throughput;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private DataFlow(Builder builder) {
            this.autoRefresh = builder.autoRefresh;
            this.autoRefreshInterval = builder.autoRefreshInterval;
            this.autoRefreshPolicy = builder.autoRefreshPolicy;
            this.createTime = builder.createTime;
            this.dataFlowId = builder.dataFlowId;
            this.description = builder.description;
            this.errorMessage = builder.errorMessage;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemPath = builder.fileSystemPath;
            this.fsetDescription = builder.fsetDescription;
            this.fsetId = builder.fsetId;
            this.sourceSecurityType = builder.sourceSecurityType;
            this.sourceStorage = builder.sourceStorage;
            this.sourceStoragePath = builder.sourceStoragePath;
            this.status = builder.status;
            this.throughput = builder.throughput;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataFlow create() {
            return builder().build();
        }

        /**
         * @return autoRefresh
         */
        public DataFlowAutoRefresh getAutoRefresh() {
            return this.autoRefresh;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataFlowId
         */
        public String getDataFlowId() {
            return this.dataFlowId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
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
         * @return fsetDescription
         */
        public String getFsetDescription() {
            return this.fsetDescription;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return throughput
         */
        public Long getThroughput() {
            return this.throughput;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private DataFlowAutoRefresh autoRefresh; 
            private Long autoRefreshInterval; 
            private String autoRefreshPolicy; 
            private String createTime; 
            private String dataFlowId; 
            private String description; 
            private String errorMessage; 
            private String fileSystemId; 
            private String fileSystemPath; 
            private String fsetDescription; 
            private String fsetId; 
            private String sourceSecurityType; 
            private String sourceStorage; 
            private String sourceStoragePath; 
            private String status; 
            private Long throughput; 
            private String updateTime; 

            /**
             * The details about automatic update policies.
             */
            public Builder autoRefresh(DataFlowAutoRefresh autoRefresh) {
                this.autoRefresh = autoRefresh;
                return this;
            }

            /**
             * The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minutes.
             * <p>
             * 
             * Valid values: 5 to 526600. Default value: 10.
             */
            public Builder autoRefreshInterval(Long autoRefreshInterval) {
                this.autoRefreshInterval = autoRefreshInterval;
                return this;
            }

            /**
             * The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy. Valid values:
             * <p>
             * 
             * *   None: Updated data in the source storage is not automatically imported to the CPFS file system. You can run a dataflow task to import the updated data from the source storage.
             * *   ImportChanged: Updated data in the source storage is automatically imported to the CPFS file system.
             */
            public Builder autoRefreshPolicy(String autoRefreshPolicy) {
                this.autoRefreshPolicy = autoRefreshPolicy;
                return this;
            }

            /**
             * The time when the fileset was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The dataflow ID.
             */
            public Builder dataFlowId(String dataFlowId) {
                this.dataFlowId = dataFlowId;
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
                this.description = description;
                return this;
            }

            /**
             * The error message returned. Valid values:
             * <p>
             * 
             * *   None (default): The dataflow status is normal.
             * *   SourceStorageUnreachable: The access path of the source storage is not found.
             * *   ThroughputTooLow: The dataflow throughput is low.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The directory of the fileset in the CPFS file system.
             * <p>
             * 
             * Limits:
             * 
             * *   The directory must be 2 to 1,024 characters in length.
             * *   The directory must be encoded in UTF-8.
             * *   The directory must start and end with a forward slash (/).
             * *   The directory must be a fileset directory in the CPFS file system.
             */
            public Builder fileSystemPath(String fileSystemPath) {
                this.fileSystemPath = fileSystemPath;
                return this;
            }

            /**
             * The description of the automatic update.
             */
            public Builder fsetDescription(String fsetDescription) {
                this.fsetDescription = fsetDescription;
                return this;
            }

            /**
             * The fileset ID.
             */
            public Builder fsetId(String fsetId) {
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
                this.sourceSecurityType = sourceSecurityType;
                return this;
            }

            /**
             * The access path of the source storage. Format:://.
             * <p>
             * 
             * Parameters:
             * 
             * *   storage type: Only OSS is supported.
             * 
             * *   path: the name of the OSS bucket.
             * 
             *     *   The name can contain only lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.
             *     *   The name must be 8 to 128 characters in length.
             *     *   The name must be encoded in UTF-8.
             *     *   The name cannot start with http:// or https://.
             * 
             * >  The OSS bucket must be an existing bucket in the region.
             */
            public Builder sourceStorage(String sourceStorage) {
                this.sourceStorage = sourceStorage;
                return this;
            }

            /**
             * 源端存储内的访问路径。
             */
            public Builder sourceStoragePath(String sourceStoragePath) {
                this.sourceStoragePath = sourceStoragePath;
                return this;
            }

            /**
             * The dataflow status. Valid values:
             * <p>
             * 
             * *   Starting: The dataflow is being created or enabled.
             * *   Running: The dataflow has been created and is running properly.
             * *   Updating: The dataflow is being modified. For example, the dataflow throughput is increased and the automatic update interval is modified.
             * *   Deleting: The dataflow is being deleted.
             * *   Stopping: The dataflow is being disabled.
             * *   Stopped: The dataflow has been disabled.
             * *   Misconfigured: The dataflow configuration is abnormal. For example, the source storage is inaccessible, and the automatic update cannot be completed due to low dataflow throughput.
             */
            public Builder status(String status) {
                this.status = status;
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
             * >  The dataflow throughput must be less than the I/O throughput of the file system.
             */
            public Builder throughput(Long throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * The time when the fileset was last updated.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataFlow build() {
                return new DataFlow(this);
            } 

        } 

    }
    public static class DataFlowInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataFlow")
        private java.util.List < DataFlow> dataFlow;

        private DataFlowInfo(Builder builder) {
            this.dataFlow = builder.dataFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataFlowInfo create() {
            return builder().build();
        }

        /**
         * @return dataFlow
         */
        public java.util.List < DataFlow> getDataFlow() {
            return this.dataFlow;
        }

        public static final class Builder {
            private java.util.List < DataFlow> dataFlow; 

            /**
             * DataFlow.
             */
            public Builder dataFlow(java.util.List < DataFlow> dataFlow) {
                this.dataFlow = dataFlow;
                return this;
            }

            public DataFlowInfo build() {
                return new DataFlowInfo(this);
            } 

        } 

    }
}
