// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountPrivilegeObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountPrivilegeObjectsResponseBody</p>
 */
public class DescribeAccountPrivilegeObjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAccountPrivilegeObjectsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountPrivilegeObjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The permissions.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccountPrivilegeObjectsResponseBody build() {
            return new DescribeAccountPrivilegeObjectsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Column")
        private String column;

        @NameInMap("Database")
        private String database;

        @NameInMap("Description")
        private String description;

        @NameInMap("Table")
        private String table;

        private Data(Builder builder) {
            this.column = builder.column;
            this.database = builder.database;
            this.description = builder.description;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String column; 
            private String database; 
            private String description; 
            private String table; 

            /**
             * The name of the column. This parameter is returned when PrivilegeType is set to Column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * The name of the database. This parameter is returned when PrivilegeType is set to Database, Table, or Column.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The description that is specified when you create a table or column. This parameter is returned only when PrivilegeType is set to Database or Table, indicating the database description or table description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the table. This parameter is returned when PrivilegeType is set to Table or Column.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
