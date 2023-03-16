// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableFullInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableFullInfoResponseBody</p>
 */
public class GetMetaTableFullInfoResponseBody extends TeaModel {
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

    private GetMetaTableFullInfoResponseBody(Builder builder) {
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

    public static GetMetaTableFullInfoResponseBody create() {
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
         * The business data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableFullInfoResponseBody build() {
            return new GetMetaTableFullInfoResponseBody(this);
        } 

    } 

    public static class ColumnList extends TeaModel {
        @NameInMap("Caption")
        private String caption;

        @NameInMap("ColumnGuid")
        private String columnGuid;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ColumnType")
        private String columnType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("IsForeignKey")
        private Boolean isForeignKey;

        @NameInMap("IsPartitionColumn")
        private Boolean isPartitionColumn;

        @NameInMap("IsPrimaryKey")
        private Boolean isPrimaryKey;

        @NameInMap("Position")
        private Integer position;

        private ColumnList(Builder builder) {
            this.caption = builder.caption;
            this.columnGuid = builder.columnGuid;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.comment = builder.comment;
            this.isForeignKey = builder.isForeignKey;
            this.isPartitionColumn = builder.isPartitionColumn;
            this.isPrimaryKey = builder.isPrimaryKey;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnList create() {
            return builder().build();
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return columnGuid
         */
        public String getColumnGuid() {
            return this.columnGuid;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return isForeignKey
         */
        public Boolean getIsForeignKey() {
            return this.isForeignKey;
        }

        /**
         * @return isPartitionColumn
         */
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        /**
         * @return isPrimaryKey
         */
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        public static final class Builder {
            private String caption; 
            private String columnGuid; 
            private String columnName; 
            private String columnType; 
            private String comment; 
            private Boolean isForeignKey; 
            private Boolean isPartitionColumn; 
            private Boolean isPrimaryKey; 
            private Integer position; 

            /**
             * The description of the field.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * The GUID of the field.
             */
            public Builder columnGuid(String columnGuid) {
                this.columnGuid = columnGuid;
                return this;
            }

            /**
             * The name of the field.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The data type of the field.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * The remarks of the field.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Indicates whether the field is a foreign key. Valid values:
             * <p>
             * 
             * *   true: The field is a foreign key.
             * *   false: The field is not a foreign key.
             */
            public Builder isForeignKey(Boolean isForeignKey) {
                this.isForeignKey = isForeignKey;
                return this;
            }

            /**
             * Indicates whether the field is a partition field. Valid values:
             * <p>
             * 
             * *   true: The field is a partition field.
             * *   false: The field is not a partition field.
             */
            public Builder isPartitionColumn(Boolean isPartitionColumn) {
                this.isPartitionColumn = isPartitionColumn;
                return this;
            }

            /**
             * Indicates whether the field is the primary key. Valid values:
             * <p>
             * 
             * *   true: The field is the primary key.
             * *   false: The field is not the primary key.
             */
            public Builder isPrimaryKey(Boolean isPrimaryKey) {
                this.isPrimaryKey = isPrimaryKey;
                return this;
            }

            /**
             * The ordinal number of the field.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ColumnList")
        private java.util.List < ColumnList> columnList;

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

        @NameInMap("Schema")
        private String schema;

        @NameInMap("TableGuid")
        private String tableGuid;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TenantId")
        private Long tenantId;

        @NameInMap("TotalColumnCount")
        private Long totalColumnCount;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.columnList = builder.columnList;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.dataSize = builder.dataSize;
            this.databaseName = builder.databaseName;
            this.envType = builder.envType;
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
            this.schema = builder.schema;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
            this.tenantId = builder.tenantId;
            this.totalColumnCount = builder.totalColumnCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return columnList
         */
        public java.util.List < ColumnList> getColumnList() {
            return this.columnList;
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
         * @return totalColumnCount
         */
        public Long getTotalColumnCount() {
            return this.totalColumnCount;
        }

        public static final class Builder {
            private String clusterId; 
            private java.util.List < ColumnList> columnList; 
            private String comment; 
            private Long createTime; 
            private Long dataSize; 
            private String databaseName; 
            private Integer envType; 
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
            private String schema; 
            private String tableGuid; 
            private String tableName; 
            private Long tenantId; 
            private Long totalColumnCount; 

            /**
             * The ID of the EMR cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The fields in the metatable.
             */
            public Builder columnList(java.util.List < ColumnList> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * The remarks of the metatable.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The time when the metatable was created. You can convert the timestamp to the related date based on the time zone that you use.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The amount of storage resources that are consumed by the metatable. Unit: bytes.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The type of the environment in which the metatable resides. Valid values:
             * <p>
             * 
             * *   0: indicates that the metatable resides in the development environment.
             * *   1: indicates that the metatable resides in the production environment.
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The scope in which the metatable is visible. Valid values:
             * <p>
             * 
             * *   0: indicates that the metatable is visible to workspace members.
             * *   1: indicates that the metatable is visible to users within a tenant.
             * *   2: indicates that the metatable is visible to all tenants.
             * *   3: indicates that the metatable is visible only to the metatable owner.
             */
            public Builder isVisible(Integer isVisible) {
                this.isVisible = isVisible;
                return this;
            }

            /**
             * The time when the metatable was last accessed. You can convert the timestamp to the related date based on the time zone that you use.
             */
            public Builder lastAccessTime(Long lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * The time when the schema of the metatable was last changed. You can convert the timestamp to the related date based on the time zone that you use.
             */
            public Builder lastDdlTime(Long lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * The time when the metatable was last updated. You can convert the timestamp to the related date based on the time zone that you use.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * The lifecycle of the metatable. Unit: days.
             */
            public Builder lifeCycle(Integer lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * The storage path of the Hive metatable.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The ID of the metatable owner.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The partition key.
             */
            public Builder partitionKeys(String partitionKeys) {
                this.partitionKeys = partitionKeys;
                return this;
            }

            /**
             * The ID of the workspace to which the metatable belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The name of the workspace to which the metatable belongs.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
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
             * The GUID of the metatable.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * The name of the metatable.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The total number of fields.
             */
            public Builder totalColumnCount(Long totalColumnCount) {
                this.totalColumnCount = totalColumnCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
