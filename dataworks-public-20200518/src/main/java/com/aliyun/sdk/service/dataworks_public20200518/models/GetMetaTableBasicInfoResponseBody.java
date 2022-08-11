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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
             * Caption.
             */
            public Builder caption(String caption) {
                this.caption = caption;
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
             * ColumnCount.
             */
            public Builder columnCount(Integer columnCount) {
                this.columnCount = columnCount;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
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
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
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
             * EnvType.
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * FavoriteCount.
             */
            public Builder favoriteCount(Long favoriteCount) {
                this.favoriteCount = favoriteCount;
                return this;
            }

            /**
             * IsPartitionTable.
             */
            public Builder isPartitionTable(Boolean isPartitionTable) {
                this.isPartitionTable = isPartitionTable;
                return this;
            }

            /**
             * IsView.
             */
            public Builder isView(Boolean isView) {
                this.isView = isView;
                return this;
            }

            /**
             * IsVisible.
             */
            public Builder isVisible(Integer isVisible) {
                this.isVisible = isVisible;
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
             * LastDdlTime.
             */
            public Builder lastDdlTime(Long lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * LifeCycle.
             */
            public Builder lifeCycle(Integer lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * PartitionKeys.
             */
            public Builder partitionKeys(String partitionKeys) {
                this.partitionKeys = partitionKeys;
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
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * ReadCount.
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
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * ViewCount.
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
