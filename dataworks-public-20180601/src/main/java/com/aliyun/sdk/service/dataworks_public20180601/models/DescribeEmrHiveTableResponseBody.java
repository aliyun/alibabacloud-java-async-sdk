// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmrHiveTableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEmrHiveTableResponseBody</p>
 */
public class DescribeEmrHiveTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEmrHiveTableResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEmrHiveTableResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEmrHiveTableResponseBody build() {
            return new DescribeEmrHiveTableResponseBody(this);
        } 

    } 

    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnComment")
        private String columnComment;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnPosition")
        private Integer columnPosition;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        private Columns(Builder builder) {
            this.columnComment = builder.columnComment;
            this.columnName = builder.columnName;
            this.columnPosition = builder.columnPosition;
            this.columnType = builder.columnType;
            this.comment = builder.comment;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return columnComment
         */
        public String getColumnComment() {
            return this.columnComment;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnPosition
         */
        public Integer getColumnPosition() {
            return this.columnPosition;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        public static final class Builder {
            private String columnComment; 
            private String columnName; 
            private Integer columnPosition; 
            private String columnType; 
            private String comment; 
            private String gmtCreate; 
            private String gmtModified; 

            /**
             * ColumnComment.
             */
            public Builder columnComment(String columnComment) {
                this.columnComment = columnComment;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * ColumnPosition.
             */
            public Builder columnPosition(Integer columnPosition) {
                this.columnPosition = columnPosition;
                return this;
            }

            /**
             * ColumnType.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterBizId")
        private String clusterBizId;

        @com.aliyun.core.annotation.NameInMap("ClusterBizName")
        private String clusterBizName;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < Columns> columns;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InputFormat")
        private String inputFormat;

        @com.aliyun.core.annotation.NameInMap("IsCompressed")
        private Boolean isCompressed;

        @com.aliyun.core.annotation.NameInMap("IsTemporary")
        private Boolean isTemporary;

        @com.aliyun.core.annotation.NameInMap("LastAccessTime")
        private String lastAccessTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OutputFormat")
        private String outputFormat;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("PartitionKeys")
        private String partitionKeys;

        @com.aliyun.core.annotation.NameInMap("SerializationLib")
        private String serializationLib;

        @com.aliyun.core.annotation.NameInMap("TableComment")
        private String tableComment;

        @com.aliyun.core.annotation.NameInMap("TableDesc")
        private String tableDesc;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableParameters")
        private String tableParameters;

        @com.aliyun.core.annotation.NameInMap("TableSize")
        private Long tableSize;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        private Data(Builder builder) {
            this.clusterBizId = builder.clusterBizId;
            this.clusterBizName = builder.clusterBizName;
            this.columns = builder.columns;
            this.databaseName = builder.databaseName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.inputFormat = builder.inputFormat;
            this.isCompressed = builder.isCompressed;
            this.isTemporary = builder.isTemporary;
            this.lastAccessTime = builder.lastAccessTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.location = builder.location;
            this.outputFormat = builder.outputFormat;
            this.owner = builder.owner;
            this.ownerId = builder.ownerId;
            this.ownerType = builder.ownerType;
            this.partitionKeys = builder.partitionKeys;
            this.serializationLib = builder.serializationLib;
            this.tableComment = builder.tableComment;
            this.tableDesc = builder.tableDesc;
            this.tableName = builder.tableName;
            this.tableParameters = builder.tableParameters;
            this.tableSize = builder.tableSize;
            this.tableType = builder.tableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterBizId
         */
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        /**
         * @return clusterBizName
         */
        public String getClusterBizName() {
            return this.clusterBizName;
        }

        /**
         * @return columns
         */
        public java.util.List < Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return inputFormat
         */
        public String getInputFormat() {
            return this.inputFormat;
        }

        /**
         * @return isCompressed
         */
        public Boolean getIsCompressed() {
            return this.isCompressed;
        }

        /**
         * @return isTemporary
         */
        public Boolean getIsTemporary() {
            return this.isTemporary;
        }

        /**
         * @return lastAccessTime
         */
        public String getLastAccessTime() {
            return this.lastAccessTime;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return outputFormat
         */
        public String getOutputFormat() {
            return this.outputFormat;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return partitionKeys
         */
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        /**
         * @return serializationLib
         */
        public String getSerializationLib() {
            return this.serializationLib;
        }

        /**
         * @return tableComment
         */
        public String getTableComment() {
            return this.tableComment;
        }

        /**
         * @return tableDesc
         */
        public String getTableDesc() {
            return this.tableDesc;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableParameters
         */
        public String getTableParameters() {
            return this.tableParameters;
        }

        /**
         * @return tableSize
         */
        public Long getTableSize() {
            return this.tableSize;
        }

        /**
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        public static final class Builder {
            private String clusterBizId; 
            private String clusterBizName; 
            private java.util.List < Columns> columns; 
            private String databaseName; 
            private String gmtCreate; 
            private String gmtModified; 
            private String inputFormat; 
            private Boolean isCompressed; 
            private Boolean isTemporary; 
            private String lastAccessTime; 
            private String lastModifyTime; 
            private String location; 
            private String outputFormat; 
            private String owner; 
            private String ownerId; 
            private String ownerType; 
            private String partitionKeys; 
            private String serializationLib; 
            private String tableComment; 
            private String tableDesc; 
            private String tableName; 
            private String tableParameters; 
            private Long tableSize; 
            private String tableType; 

            /**
             * ClusterBizId.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * ClusterBizName.
             */
            public Builder clusterBizName(String clusterBizName) {
                this.clusterBizName = clusterBizName;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InputFormat.
             */
            public Builder inputFormat(String inputFormat) {
                this.inputFormat = inputFormat;
                return this;
            }

            /**
             * IsCompressed.
             */
            public Builder isCompressed(Boolean isCompressed) {
                this.isCompressed = isCompressed;
                return this;
            }

            /**
             * IsTemporary.
             */
            public Builder isTemporary(Boolean isTemporary) {
                this.isTemporary = isTemporary;
                return this;
            }

            /**
             * LastAccessTime.
             */
            public Builder lastAccessTime(String lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
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
             * OutputFormat.
             */
            public Builder outputFormat(String outputFormat) {
                this.outputFormat = outputFormat;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
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
             * OwnerType.
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
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
             * SerializationLib.
             */
            public Builder serializationLib(String serializationLib) {
                this.serializationLib = serializationLib;
                return this;
            }

            /**
             * TableComment.
             */
            public Builder tableComment(String tableComment) {
                this.tableComment = tableComment;
                return this;
            }

            /**
             * TableDesc.
             */
            public Builder tableDesc(String tableDesc) {
                this.tableDesc = tableDesc;
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
             * TableParameters.
             */
            public Builder tableParameters(String tableParameters) {
                this.tableParameters = tableParameters;
                return this;
            }

            /**
             * TableSize.
             */
            public Builder tableSize(Long tableSize) {
                this.tableSize = tableSize;
                return this;
            }

            /**
             * TableType.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
