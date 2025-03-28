// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetMetaTableFullInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableFullInfoResponseBody</p>
 */
public class GetMetaTableFullInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMetaTableFullInfoResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1411515937****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableFullInfoResponseBody build() {
            return new GetMetaTableFullInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaTableFullInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableFullInfoResponseBody</p>
     */
    public static class ColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("ColumnGuid")
        private String columnGuid;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("IsForeignKey")
        private Boolean isForeignKey;

        @com.aliyun.core.annotation.NameInMap("IsPartitionColumn")
        private Boolean isPartitionColumn;

        @com.aliyun.core.annotation.NameInMap("IsPrimaryKey")
        private Boolean isPrimaryKey;

        @com.aliyun.core.annotation.NameInMap("Position")
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

            private Builder() {
            } 

            private Builder(ColumnList model) {
                this.caption = model.caption;
                this.columnGuid = model.columnGuid;
                this.columnName = model.columnName;
                this.columnType = model.columnType;
                this.comment = model.comment;
                this.isForeignKey = model.isForeignKey;
                this.isPartitionColumn = model.isPartitionColumn;
                this.isPrimaryKey = model.isPrimaryKey;
                this.position = model.position;
            } 

            /**
             * <p>The description of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>data comment</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The unique identifier of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.engine_name.table_name.1</p>
             */
            public Builder columnGuid(String columnGuid) {
                this.columnGuid = columnGuid;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The data type of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>The remarks of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Indicates whether the field is a foreign key. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isForeignKey(Boolean isForeignKey) {
                this.isForeignKey = isForeignKey;
                return this;
            }

            /**
             * <p>Indicates whether the field is a partition field. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPartitionColumn(Boolean isPartitionColumn) {
                this.isPartitionColumn = isPartitionColumn;
                return this;
            }

            /**
             * <p>Indicates whether the field is a primary key. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isPrimaryKey(Boolean isPrimaryKey) {
                this.isPrimaryKey = isPrimaryKey;
                return this;
            }

            /**
             * <p>The sequence number of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetMetaTableFullInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableFullInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List<ColumnList> columnList;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private Integer envType;

        @com.aliyun.core.annotation.NameInMap("IsVisible")
        private Integer isVisible;

        @com.aliyun.core.annotation.NameInMap("LastAccessTime")
        private Long lastAccessTime;

        @com.aliyun.core.annotation.NameInMap("LastDdlTime")
        private Long lastDdlTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("LifeCycle")
        private Integer lifeCycle;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("PartitionKeys")
        private String partitionKeys;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("TotalColumnCount")
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
        public java.util.List<ColumnList> getColumnList() {
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
            private java.util.List<ColumnList> columnList; 
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.columnList = model.columnList;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.dataSize = model.dataSize;
                this.databaseName = model.databaseName;
                this.envType = model.envType;
                this.isVisible = model.isVisible;
                this.lastAccessTime = model.lastAccessTime;
                this.lastDdlTime = model.lastDdlTime;
                this.lastModifyTime = model.lastModifyTime;
                this.lifeCycle = model.lifeCycle;
                this.location = model.location;
                this.ownerId = model.ownerId;
                this.partitionKeys = model.partitionKeys;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.schema = model.schema;
                this.tableGuid = model.tableGuid;
                this.tableName = model.tableName;
                this.tenantId = model.tenantId;
                this.totalColumnCount = model.totalColumnCount;
            } 

            /**
             * <p>The EMR cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>C-010A704DA760****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The fields in the table.</p>
             */
            public Builder columnList(java.util.List<ColumnList> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * <p>The comment on the table.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the table was created. A timestamp is returned for this parameter. You can convert the timestamp to the related date based on the time zone that you use.</p>
             * 
             * <strong>example:</strong>
             * <p>1589870293000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The size of the storage space that is consumed by the table. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The type of the environment. Valid values:</p>
             * <ul>
             * <li>0: indicates that the table resides in the development environment.</li>
             * <li>1: indicates that the table resides in the production environment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The scope in which the table is visible. Valid values:</p>
             * <ul>
             * <li>0: indicates that the table is visible to workspace members.</li>
             * <li>1: indicates that the table is visible to users within a tenant.</li>
             * <li>2: indicates that the table is visible to all tenants.</li>
             * <li>3: indicates that the table is visible only to the table owner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isVisible(Integer isVisible) {
                this.isVisible = isVisible;
                return this;
            }

            /**
             * <p>The time when the table was last accessed. A timestamp is returned for this parameter. You can convert the timestamp to the related date based on the time zone that you use.</p>
             * 
             * <strong>example:</strong>
             * <p>1589870294000</p>
             */
            public Builder lastAccessTime(Long lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * <p>The time when the schema of the table was last changed. A timestamp is returned for this parameter. You can convert the timestamp to the related date based on the time zone that you use.</p>
             * 
             * <strong>example:</strong>
             * <p>1589870294000</p>
             */
            public Builder lastDdlTime(Long lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * <p>The time when the table was last updated. A timestamp is returned for this parameter. You can convert the timestamp to the related date based on the time zone that you use.</p>
             * 
             * <strong>example:</strong>
             * <p>1589870294000</p>
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The lifecycle of the table. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder lifeCycle(Integer lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * <p>The storage path of the Hive table.</p>
             * 
             * <strong>example:</strong>
             * <p>hdfs://localhost:777/user/hadoop/test.txt</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The ID of the table owner.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The partition key column.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder partitionKeys(String partitionKeys) {
                this.partitionKeys = partitionKeys;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the workspace to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The schema information of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The unique identifier of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.engine_name.table_name</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>table_name</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The total number of fields.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
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
