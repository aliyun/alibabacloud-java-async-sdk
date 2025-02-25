// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetaListResponseBody</p>
 */
public class DescribeMetaListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPageCount")
    private String totalPageCount;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeMetaListResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalPageCount = builder.totalPageCount;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetaListResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalPageCount
     */
    public String getTotalPageCount() {
        return this.totalPageCount;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalPageCount; 
        private String totalRecordCount; 

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1s826a1up******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The details of databases and tables that can be restored.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AA815DE7-B576-4B22-B33C-3FB31A******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPageCount(String totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMetaListResponseBody build() {
            return new DescribeMetaListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetaListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<String> tables;

        private Items(Builder builder) {
            this.database = builder.database;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String database; 
            private java.util.List<String> tables; 

            /**
             * <p>The name of the database that can be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The name of the table that can be restored.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
