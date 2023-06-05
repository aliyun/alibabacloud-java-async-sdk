// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableBasicInfoResponseBody</p>
 */
public class GetMetaTableBasicInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMetaTableBasicInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableBasicInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The number of times the metatable was added to a favorite list. This parameter is returned only if you set the Extension parameter to true and takes effect only if you set the DataSourceType parameter to odps.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The name of the metatable.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The business data returned.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableBasicInfoResponseBody build() {
            return new GetMetaTableBasicInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Caption")
        private String caption;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ColumnCount")
        private Integer columnCount;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DataSize")
        private Long dataSize;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EnvType")
        private Integer envType;

        @NameInMap("FavoriteCount")
        private Long favoriteCount;

        @NameInMap("IsPartitionTable")
        private Boolean isPartitionTable;

        @NameInMap("IsView")
        private Boolean isView;

        @NameInMap("IsVisible")
        private Integer isVisible;

        @NameInMap("LastAccessTime")
        private Long lastAccessTime;

        @NameInMap("LastDdlTime")
        private Long lastDdlTime;

        @NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @NameInMap("LifeCycle")
        private Integer lifeCycle;

        @NameInMap("Location")
        private String location;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("PartitionKeys")
        private String partitionKeys;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("ReadCount")
        private Long readCount;

        @NameInMap("Schema")
        private String schema;

        @NameInMap("TableGuid")
        private String tableGuid;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TenantId")
        private Long tenantId;

        @NameInMap("ViewCount")
        private Long viewCount;

        private Data(Builder builder) {
            this.caption = builder.caption;
            this.clusterId = builder.clusterId;
            this.columnCount = builder.columnCount;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.dataSize = builder.dataSize;
            this.databaseName = builder.databaseName;
            this.envType = builder.envType;
            this.favoriteCount = builder.favoriteCount;
            this.isPartitionTable = builder.isPartitionTable;
            this.isView = builder.isView;
            this.isVisible = builder.isVisible;
            this.lastAccessTime = builder.lastAccessTime;
            this.lastDdlTime = builder.lastDdlTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.lifeCycle = builder.lifeCycle;
            this.location = builder.location;
            this.ownerId = builder.ownerId;
            this.partitionKeys = builder.partitionKeys;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.readCount = builder.readCount;
            this.schema = builder.schema;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
            this.tenantId = builder.tenantId;
            this.viewCount = builder.viewCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return columnCount
         */
        public Integer getColumnCount() {
            return this.columnCount;
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
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return envType
         */
        public Integer getEnvType() {
            return this.envType;
        }

        /**
         * @return favoriteCount
         */
        public Long getFavoriteCount() {
            return this.favoriteCount;
        }

        /**
         * @return isPartitionTable
         */
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        /**
         * @return isView
         */
        public Boolean getIsView() {
            return this.isView;
        }

        /**
         * @return isVisible
         */
        public Integer getIsVisible() {
            return this.isVisible;
        }

        /**
         * @return lastAccessTime
         */
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        /**
         * @return lastDdlTime
         */
        public Long getLastDdlTime() {
            return this.lastDdlTime;
        }

        /**
         * @return lastModifyTime
         */
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return lifeCycle
         */
        public Integer getLifeCycle() {
            return this.lifeCycle;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return partitionKeys
         */
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return readCount
         */
        public Long getReadCount() {
            return this.readCount;
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
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return viewCount
         */
        public Long getViewCount() {
            return this.viewCount;
        }

        public static final class Builder {
            private String caption; 
            private String clusterId; 
            private Integer columnCount; 
            private String comment; 
            private Long createTime; 
            private Long dataSize; 
            private String databaseName; 
            private Integer envType; 
            private Long favoriteCount; 
            private Boolean isPartitionTable; 
            private Boolean isView; 
            private Integer isVisible; 
            private Long lastAccessTime; 
            private Long lastDdlTime; 
            private Long lastModifyTime; 
            private Integer lifeCycle; 
            private String location; 
            private String ownerId; 
            private String partitionKeys; 
            private Long projectId; 
            private String projectName; 
            private Long readCount; 
            private String schema; 
            private String tableGuid; 
            private String tableName; 
            private Long tenantId; 
            private Long viewCount; 

            /**
             * The schema information of the metatable. This parameter is returned only if you enable the table schema in MaxCompute.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * Indicates whether the metatable is a view. Valid values:
             * <p>
             * 
             * *   true: The metatable is a view.
             * *   false: The metatable is not a view.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder columnCount(Integer columnCount) {
                this.columnCount = columnCount;
                return this;
            }

            /**
             * The time when the metatable was created.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The ID of the metatable owner.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the schema of the metatable was last changed.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * The GUID of the metatable.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The scope in which the metatable is visible. Valid values:
             * <p>
             * 
             * *   0: The metatable is visible to workspace members.
             * *   1: The metatable is visible to users within the tenant.
             * *   2: The metatable is visible to all tenants.
             * *   3: The metatable is visible only to the metatable owner.
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The number of fields.
             */
            public Builder favoriteCount(Long favoriteCount) {
                this.favoriteCount = favoriteCount;
                return this;
            }

            /**
             * The lifecycle of the metatable. Unit: days.
             */
            public Builder isPartitionTable(Boolean isPartitionTable) {
                this.isPartitionTable = isPartitionTable;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder isView(Boolean isView) {
                this.isView = isView;
                return this;
            }

            /**
             * The number of times the metatable was read. This parameter is returned only if you set the Extension parameter to true and takes effect only if you set the DataSourceType parameter to odps.
             */
            public Builder isVisible(Integer isVisible) {
                this.isVisible = isVisible;
                return this;
            }

            /**
             * The time when the metatable was last updated.
             */
            public Builder lastAccessTime(Long lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * The storage path of the Hive metadatabase.
             */
            public Builder lastDdlTime(Long lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * The partition key of the Hive metatable.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * The number of times the metatable was viewed. This parameter is returned only if you set the Extension parameter to true and takes effect only if you set the DataSourceType parameter to odps.
             */
            public Builder lifeCycle(Integer lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the metadatabase.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The display name of the metatable.
             */
            public Builder partitionKeys(String partitionKeys) {
                this.partitionKeys = partitionKeys;
                return this;
            }

            /**
             * The type of the environment. Valid values:
             * <p>
             * 
             * *   0: development environment
             * *   1: production environment
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The time when the metatable was last accessed.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * Indicates whether the metatable is a partitioned table. Valid values:
             * <p>
             * 
             * *   true: The metatable is a partitioned table.
             * *   false: The metatable is a non-partitioned table.
             */
            public Builder readCount(Long readCount) {
                this.readCount = readCount;
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
             * The ID of the EMR cluster.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * The comment of the metatable.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The size of storage space that is occupied by the metatable. Unit: bytes.
             */
            public Builder viewCount(Long viewCount) {
                this.viewCount = viewCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
