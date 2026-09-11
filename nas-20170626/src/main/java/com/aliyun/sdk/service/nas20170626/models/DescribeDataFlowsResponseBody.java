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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDataFlowsResponseBody model) {
            this.dataFlowInfo = model.dataFlowInfo;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * DataFlowInfo.
         */
        public Builder dataFlowInfo(DataFlowInfo dataFlowInfo) {
            this.dataFlowInfo = dataFlowInfo;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return results are truncated, use NextToken to obtain content starting from the truncation point.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataFlowsResponseBody build() {
            return new DescribeDataFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AutoRefresh model) {
                this.refreshPath = model.refreshPath;
            } 

            /**
             * RefreshPath.
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
    /**
     * 
     * {@link DescribeDataFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowsResponseBody</p>
     */
    public static class DataFlowAutoRefresh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRefresh")
        private java.util.List<AutoRefresh> autoRefresh;

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
        public java.util.List<AutoRefresh> getAutoRefresh() {
            return this.autoRefresh;
        }

        public static final class Builder {
            private java.util.List<AutoRefresh> autoRefresh; 

            private Builder() {
            } 

            private Builder(DataFlowAutoRefresh model) {
                this.autoRefresh = model.autoRefresh;
            } 

            /**
             * AutoRefresh.
             */
            public Builder autoRefresh(java.util.List<AutoRefresh> autoRefresh) {
                this.autoRefresh = autoRefresh;
                return this;
            }

            public DataFlowAutoRefresh build() {
                return new DataFlowAutoRefresh(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DataFlow model) {
                this.autoRefresh = model.autoRefresh;
                this.autoRefreshInterval = model.autoRefreshInterval;
                this.autoRefreshPolicy = model.autoRefreshPolicy;
                this.createTime = model.createTime;
                this.dataFlowId = model.dataFlowId;
                this.description = model.description;
                this.errorMessage = model.errorMessage;
                this.fileSystemId = model.fileSystemId;
                this.fileSystemPath = model.fileSystemPath;
                this.fsetDescription = model.fsetDescription;
                this.fsetId = model.fsetId;
                this.sourceSecurityType = model.sourceSecurityType;
                this.sourceStorage = model.sourceStorage;
                this.sourceStoragePath = model.sourceStoragePath;
                this.status = model.status;
                this.throughput = model.throughput;
                this.updateTime = model.updateTime;
            } 

            /**
             * AutoRefresh.
             */
            public Builder autoRefresh(DataFlowAutoRefresh autoRefresh) {
                this.autoRefresh = autoRefresh;
                return this;
            }

            /**
             * AutoRefreshInterval.
             */
            public Builder autoRefreshInterval(Long autoRefreshInterval) {
                this.autoRefreshInterval = autoRefreshInterval;
                return this;
            }

            /**
             * AutoRefreshPolicy.
             */
            public Builder autoRefreshPolicy(String autoRefreshPolicy) {
                this.autoRefreshPolicy = autoRefreshPolicy;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataFlowId.
             */
            public Builder dataFlowId(String dataFlowId) {
                this.dataFlowId = dataFlowId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * FileSystemPath.
             */
            public Builder fileSystemPath(String fileSystemPath) {
                this.fileSystemPath = fileSystemPath;
                return this;
            }

            /**
             * FsetDescription.
             */
            public Builder fsetDescription(String fsetDescription) {
                this.fsetDescription = fsetDescription;
                return this;
            }

            /**
             * FsetId.
             */
            public Builder fsetId(String fsetId) {
                this.fsetId = fsetId;
                return this;
            }

            /**
             * SourceSecurityType.
             */
            public Builder sourceSecurityType(String sourceSecurityType) {
                this.sourceSecurityType = sourceSecurityType;
                return this;
            }

            /**
             * SourceStorage.
             */
            public Builder sourceStorage(String sourceStorage) {
                this.sourceStorage = sourceStorage;
                return this;
            }

            /**
             * <p>源端存储内的访问路径。</p>
             */
            public Builder sourceStoragePath(String sourceStoragePath) {
                this.sourceStoragePath = sourceStoragePath;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Throughput.
             */
            public Builder throughput(Long throughput) {
                this.throughput = throughput;
                return this;
            }

            /**
             * UpdateTime.
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
    /**
     * 
     * {@link DescribeDataFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowsResponseBody</p>
     */
    public static class DataFlowInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataFlow")
        private java.util.List<DataFlow> dataFlow;

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
        public java.util.List<DataFlow> getDataFlow() {
            return this.dataFlow;
        }

        public static final class Builder {
            private java.util.List<DataFlow> dataFlow; 

            private Builder() {
            } 

            private Builder(DataFlowInfo model) {
                this.dataFlow = model.dataFlow;
            } 

            /**
             * DataFlow.
             */
            public Builder dataFlow(java.util.List<DataFlow> dataFlow) {
                this.dataFlow = dataFlow;
                return this;
            }

            public DataFlowInfo build() {
                return new DataFlowInfo(this);
            } 

        } 

    }
}
