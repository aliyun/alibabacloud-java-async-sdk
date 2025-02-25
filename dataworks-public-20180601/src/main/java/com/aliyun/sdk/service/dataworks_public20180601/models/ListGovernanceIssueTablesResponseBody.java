// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link ListGovernanceIssueTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGovernanceIssueTablesResponseBody</p>
 */
public class ListGovernanceIssueTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicErrorCode")
    private String dynamicErrorCode;

    @com.aliyun.core.annotation.NameInMap("DynamicErrorMessage")
    private String dynamicErrorMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListGovernanceIssueTablesResponseBody(Builder builder) {
        this.data = builder.data;
        this.dynamicErrorCode = builder.dynamicErrorCode;
        this.dynamicErrorMessage = builder.dynamicErrorMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGovernanceIssueTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicErrorCode
     */
    public String getDynamicErrorCode() {
        return this.dynamicErrorCode;
    }

    /**
     * @return dynamicErrorMessage
     */
    public String getDynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String dynamicErrorCode; 
        private String dynamicErrorMessage; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * DynamicErrorCode.
         */
        public Builder dynamicErrorCode(String dynamicErrorCode) {
            this.dynamicErrorCode = dynamicErrorCode;
            return this;
        }

        /**
         * DynamicErrorMessage.
         */
        public Builder dynamicErrorMessage(String dynamicErrorMessage) {
            this.dynamicErrorMessage = dynamicErrorMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGovernanceIssueTablesResponseBody build() {
            return new ListGovernanceIssueTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGovernanceIssueTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGovernanceIssueTablesResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        private String datasourceType;

        @com.aliyun.core.annotation.NameInMap("DownstreamDependencyCount")
        private Integer downstreamDependencyCount;

        @com.aliyun.core.annotation.NameInMap("LastAccessTime")
        private Long lastAccessTime;

        @com.aliyun.core.annotation.NameInMap("LifeCycle")
        private Long lifeCycle;

        @com.aliyun.core.annotation.NameInMap("McProjectName")
        private String mcProjectName;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("RuleCategory")
        private String ruleCategory;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableSize")
        private Long tableSize;

        private Tables(Builder builder) {
            this.bizDate = builder.bizDate;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.databaseName = builder.databaseName;
            this.datasourceType = builder.datasourceType;
            this.downstreamDependencyCount = builder.downstreamDependencyCount;
            this.lastAccessTime = builder.lastAccessTime;
            this.lifeCycle = builder.lifeCycle;
            this.mcProjectName = builder.mcProjectName;
            this.ownerId = builder.ownerId;
            this.projectId = builder.projectId;
            this.properties = builder.properties;
            this.ruleCategory = builder.ruleCategory;
            this.ruleId = builder.ruleId;
            this.schema = builder.schema;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
            this.tableSize = builder.tableSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return downstreamDependencyCount
         */
        public Integer getDownstreamDependencyCount() {
            return this.downstreamDependencyCount;
        }

        /**
         * @return lastAccessTime
         */
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        /**
         * @return lifeCycle
         */
        public Long getLifeCycle() {
            return this.lifeCycle;
        }

        /**
         * @return mcProjectName
         */
        public String getMcProjectName() {
            return this.mcProjectName;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return ruleCategory
         */
        public String getRuleCategory() {
            return this.ruleCategory;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableSize
         */
        public Long getTableSize() {
            return this.tableSize;
        }

        public static final class Builder {
            private String bizDate; 
            private String clusterId; 
            private Long createTime; 
            private String databaseName; 
            private String datasourceType; 
            private Integer downstreamDependencyCount; 
            private Long lastAccessTime; 
            private Long lifeCycle; 
            private String mcProjectName; 
            private String ownerId; 
            private Long projectId; 
            private String properties; 
            private String ruleCategory; 
            private String ruleId; 
            private String schema; 
            private String tableGuid; 
            private String tableName; 
            private Long tableSize; 

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * DatasourceType.
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * DownstreamDependencyCount.
             */
            public Builder downstreamDependencyCount(Integer downstreamDependencyCount) {
                this.downstreamDependencyCount = downstreamDependencyCount;
                return this;
            }

            /**
             * LastAccessTime.
             */
            public Builder lastAccessTime(Long lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * LifeCycle.
             */
            public Builder lifeCycle(Long lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * McProjectName.
             */
            public Builder mcProjectName(String mcProjectName) {
                this.mcProjectName = mcProjectName;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * RuleCategory.
             */
            public Builder ruleCategory(String ruleCategory) {
                this.ruleCategory = ruleCategory;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * TableGuid.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TableSize.
             */
            public Builder tableSize(Long tableSize) {
                this.tableSize = tableSize;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGovernanceIssueTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGovernanceIssueTablesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.tables = builder.tables;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Tables> tables; 
            private Integer totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
