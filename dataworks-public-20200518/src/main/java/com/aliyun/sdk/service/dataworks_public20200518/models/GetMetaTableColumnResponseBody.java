// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableColumnResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableColumnResponseBody</p>
 */
public class GetMetaTableColumnResponseBody extends TeaModel {
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

    private GetMetaTableColumnResponseBody(Builder builder) {
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

    public static GetMetaTableColumnResponseBody create() {
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
         * The business data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID. You can locate logs and troubleshoot issues based on the ID.
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

        public GetMetaTableColumnResponseBody build() {
            return new GetMetaTableColumnResponseBody(this);
        } 

    } 

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

        @com.aliyun.core.annotation.NameInMap("RelationCount")
        private Long relationCount;

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
            this.relationCount = builder.relationCount;
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

        /**
         * @return relationCount
         */
        public Long getRelationCount() {
            return this.relationCount;
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
            private Long relationCount; 

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
             * *   true
             * *   false
             */
            public Builder isForeignKey(Boolean isForeignKey) {
                this.isForeignKey = isForeignKey;
                return this;
            }

            /**
             * Indicates whether the field is a partition field. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder isPartitionColumn(Boolean isPartitionColumn) {
                this.isPartitionColumn = isPartitionColumn;
                return this;
            }

            /**
             * Indicates whether the field is a primary key. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder isPrimaryKey(Boolean isPrimaryKey) {
                this.isPrimaryKey = isPrimaryKey;
                return this;
            }

            /**
             * The sequence number of the field.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            /**
             * The number of times the field is read.
             */
            public Builder relationCount(Long relationCount) {
                this.relationCount = relationCount;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List < ColumnList> columnList;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.columnList = builder.columnList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return columnList
         */
        public java.util.List < ColumnList> getColumnList() {
            return this.columnList;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < ColumnList> columnList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The information about fields.
             */
            public Builder columnList(java.util.List < ColumnList> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * The number of entries per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of fields.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
