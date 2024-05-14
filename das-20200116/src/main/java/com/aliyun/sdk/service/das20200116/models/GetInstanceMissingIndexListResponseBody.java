// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceMissingIndexListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceMissingIndexListResponseBody</p>
 */
public class GetInstanceMissingIndexListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetInstanceMissingIndexListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceMissingIndexListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetInstanceMissingIndexListResponseBody build() {
            return new GetInstanceMissingIndexListResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgTotalUserCost")
        private Double avgTotalUserCost;

        @com.aliyun.core.annotation.NameInMap("AvgUserImpact")
        private Double avgUserImpact;

        @com.aliyun.core.annotation.NameInMap("CreateIndex")
        private String createIndex;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EqualityColumns")
        private String equalityColumns;

        @com.aliyun.core.annotation.NameInMap("IncludedColumns")
        private String includedColumns;

        @com.aliyun.core.annotation.NameInMap("IndexCount")
        private Long indexCount;

        @com.aliyun.core.annotation.NameInMap("InequalityColumns")
        private String inequalityColumns;

        @com.aliyun.core.annotation.NameInMap("LastUserSeek")
        private Long lastUserSeek;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ReservedPages")
        private Long reservedPages;

        @com.aliyun.core.annotation.NameInMap("ReservedSize")
        private Double reservedSize;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Long rowCount;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SystemScans")
        private Long systemScans;

        @com.aliyun.core.annotation.NameInMap("SystemSeeks")
        private Long systemSeeks;

        @com.aliyun.core.annotation.NameInMap("UniqueCompiles")
        private Long uniqueCompiles;

        @com.aliyun.core.annotation.NameInMap("UserScans")
        private Long userScans;

        @com.aliyun.core.annotation.NameInMap("UserSeeks")
        private Long userSeeks;

        private List(Builder builder) {
            this.avgTotalUserCost = builder.avgTotalUserCost;
            this.avgUserImpact = builder.avgUserImpact;
            this.createIndex = builder.createIndex;
            this.databaseName = builder.databaseName;
            this.equalityColumns = builder.equalityColumns;
            this.includedColumns = builder.includedColumns;
            this.indexCount = builder.indexCount;
            this.inequalityColumns = builder.inequalityColumns;
            this.lastUserSeek = builder.lastUserSeek;
            this.objectName = builder.objectName;
            this.reservedPages = builder.reservedPages;
            this.reservedSize = builder.reservedSize;
            this.rowCount = builder.rowCount;
            this.schemaName = builder.schemaName;
            this.systemScans = builder.systemScans;
            this.systemSeeks = builder.systemSeeks;
            this.uniqueCompiles = builder.uniqueCompiles;
            this.userScans = builder.userScans;
            this.userSeeks = builder.userSeeks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return avgTotalUserCost
         */
        public Double getAvgTotalUserCost() {
            return this.avgTotalUserCost;
        }

        /**
         * @return avgUserImpact
         */
        public Double getAvgUserImpact() {
            return this.avgUserImpact;
        }

        /**
         * @return createIndex
         */
        public String getCreateIndex() {
            return this.createIndex;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return equalityColumns
         */
        public String getEqualityColumns() {
            return this.equalityColumns;
        }

        /**
         * @return includedColumns
         */
        public String getIncludedColumns() {
            return this.includedColumns;
        }

        /**
         * @return indexCount
         */
        public Long getIndexCount() {
            return this.indexCount;
        }

        /**
         * @return inequalityColumns
         */
        public String getInequalityColumns() {
            return this.inequalityColumns;
        }

        /**
         * @return lastUserSeek
         */
        public Long getLastUserSeek() {
            return this.lastUserSeek;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return reservedPages
         */
        public Long getReservedPages() {
            return this.reservedPages;
        }

        /**
         * @return reservedSize
         */
        public Double getReservedSize() {
            return this.reservedSize;
        }

        /**
         * @return rowCount
         */
        public Long getRowCount() {
            return this.rowCount;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return systemScans
         */
        public Long getSystemScans() {
            return this.systemScans;
        }

        /**
         * @return systemSeeks
         */
        public Long getSystemSeeks() {
            return this.systemSeeks;
        }

        /**
         * @return uniqueCompiles
         */
        public Long getUniqueCompiles() {
            return this.uniqueCompiles;
        }

        /**
         * @return userScans
         */
        public Long getUserScans() {
            return this.userScans;
        }

        /**
         * @return userSeeks
         */
        public Long getUserSeeks() {
            return this.userSeeks;
        }

        public static final class Builder {
            private Double avgTotalUserCost; 
            private Double avgUserImpact; 
            private String createIndex; 
            private String databaseName; 
            private String equalityColumns; 
            private String includedColumns; 
            private Long indexCount; 
            private String inequalityColumns; 
            private Long lastUserSeek; 
            private String objectName; 
            private Long reservedPages; 
            private Double reservedSize; 
            private Long rowCount; 
            private String schemaName; 
            private Long systemScans; 
            private Long systemSeeks; 
            private Long uniqueCompiles; 
            private Long userScans; 
            private Long userSeeks; 

            /**
             * The average cost savings.
             */
            public Builder avgTotalUserCost(Double avgTotalUserCost) {
                this.avgTotalUserCost = avgTotalUserCost;
                return this;
            }

            /**
             * The performance improvement, in percentage.
             */
            public Builder avgUserImpact(Double avgUserImpact) {
                this.avgUserImpact = avgUserImpact;
                return this;
            }

            /**
             * The statement used to create the missing indexes.
             */
            public Builder createIndex(String createIndex) {
                this.createIndex = createIndex;
                return this;
            }

            /**
             * The database name.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The index columns included in the equal operation.
             */
            public Builder equalityColumns(String equalityColumns) {
                this.equalityColumns = equalityColumns;
                return this;
            }

            /**
             * The columns on which indexes are missing.
             */
            public Builder includedColumns(String includedColumns) {
                this.includedColumns = includedColumns;
                return this;
            }

            /**
             * The number of indexes.
             */
            public Builder indexCount(Long indexCount) {
                this.indexCount = indexCount;
                return this;
            }

            /**
             * The index columns included in the not equal operation.
             */
            public Builder inequalityColumns(String inequalityColumns) {
                this.inequalityColumns = inequalityColumns;
                return this;
            }

            /**
             * The last seek time of a user.
             */
            public Builder lastUserSeek(Long lastUserSeek) {
                this.lastUserSeek = lastUserSeek;
                return this;
            }

            /**
             * The object name.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * The total number of returned pages.
             */
            public Builder reservedPages(Long reservedPages) {
                this.reservedPages = reservedPages;
                return this;
            }

            /**
             * The table size.
             */
            public Builder reservedSize(Double reservedSize) {
                this.reservedSize = reservedSize;
                return this;
            }

            /**
             * The number of table rows.
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * The schema name.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The number of scans.
             */
            public Builder systemScans(Long systemScans) {
                this.systemScans = systemScans;
                return this;
            }

            /**
             * The number of seeks.
             */
            public Builder systemSeeks(Long systemSeeks) {
                this.systemSeeks = systemSeeks;
                return this;
            }

            /**
             * The number of compilations.
             */
            public Builder uniqueCompiles(Long uniqueCompiles) {
                this.uniqueCompiles = uniqueCompiles;
                return this;
            }

            /**
             * The number of scans performed by users.
             */
            public Builder userScans(Long userScans) {
                this.userScans = userScans;
                return this;
            }

            /**
             * The number of seeks performed by users.
             */
            public Builder userSeeks(Long userSeeks) {
                this.userSeeks = userSeeks;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * The returned data.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * The page number of the page returned.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
