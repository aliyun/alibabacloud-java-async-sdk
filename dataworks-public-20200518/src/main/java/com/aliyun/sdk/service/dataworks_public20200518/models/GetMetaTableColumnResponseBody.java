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

        private Builder(GetMetaTableColumnResponseBody model) {
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
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
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
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376</p>
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

        public GetMetaTableColumnResponseBody build() {
            return new GetMetaTableColumnResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaTableColumnResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableColumnResponseBody</p>
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
                this.relationCount = model.relationCount;
            } 

            /**
             * <p>The description of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>data column</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The GUID of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.engine_name.table_name.name</p>
             */
            public Builder columnGuid(String columnGuid) {
                this.columnGuid = columnGuid;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
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
             * <p>false</p>
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

            /**
             * <p>The number of times the field is read.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link GetMetaTableColumnResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableColumnResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List<ColumnList> columnList;

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
        public java.util.List<ColumnList> getColumnList() {
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
            private java.util.List<ColumnList> columnList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.columnList = model.columnList;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The information about fields.</p>
             */
            public Builder columnList(java.util.List<ColumnList> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of fields.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
