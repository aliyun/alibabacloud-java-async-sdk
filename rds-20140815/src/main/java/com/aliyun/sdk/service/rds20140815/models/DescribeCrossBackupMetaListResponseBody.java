// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeCrossBackupMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossBackupMetaListResponseBody</p>
 */
public class DescribeCrossBackupMetaListResponseBody extends TeaModel {
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

    private DescribeCrossBackupMetaListResponseBody(Builder builder) {
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

    public static DescribeCrossBackupMetaListResponseBody create() {
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
         * <p>The instance to which the cross-region backup file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>An array that consists of the information about the databases and tables whose data is included in the cross-region backup file.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>60F9A12A-16B8-4728-B099-4CA38D32C31C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCrossBackupMetaListResponseBody build() {
            return new DescribeCrossBackupMetaListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrossBackupMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossBackupMetaListResponseBody</p>
     */
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
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb1</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The size of the table. Unit: KB. If the database contains more than one table, the names of these tables are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>An array that consists of the names of the tables that the database contains. If the database contains more than one table, the names of these tables are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>test1,test2</p>
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
    /**
     * 
     * {@link DescribeCrossBackupMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossBackupMetaListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.List<Meta> meta;

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
        public java.util.List<Meta> getMeta() {
            return this.meta;
        }

        public static final class Builder {
            private java.util.List<Meta> meta; 

            /**
             * Meta.
             */
            public Builder meta(java.util.List<Meta> meta) {
                this.meta = meta;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
