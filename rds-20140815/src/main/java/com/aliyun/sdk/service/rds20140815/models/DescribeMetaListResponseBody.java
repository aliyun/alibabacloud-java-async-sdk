// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetaListResponseBody</p>
 */
public class DescribeMetaListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPageCount")
    private Integer totalPageCount;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeMetaListResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
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
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
    public Integer getTotalPageCount() {
        return this.totalPageCount;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalPageCount; 
        private Integer totalRecordCount; 

        /**
         * The instance name.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * The information about the databases and tables whose data is included in the backup set.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder totalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMetaListResponseBody build() {
            return new DescribeMetaListResponseBody(this);
        } 

    } 

    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private String tables;

        private Meta(Builder builder) {
            this.database = builder.database;
            this.size = builder.size;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return tables
         */
        public String getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String database; 
            private String size; 
            private String tables; 

            /**
             * The database name.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The table size. Unit: KB.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * The table name.
             */
            public Builder tables(String tables) {
                this.tables = tables;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.List < Meta> meta;

        private Items(Builder builder) {
            this.meta = builder.meta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public java.util.List < Meta> getMeta() {
            return this.meta;
        }

        public static final class Builder {
            private java.util.List < Meta> meta; 

            /**
             * Meta.
             */
            public Builder meta(java.util.List < Meta> meta) {
                this.meta = meta;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
