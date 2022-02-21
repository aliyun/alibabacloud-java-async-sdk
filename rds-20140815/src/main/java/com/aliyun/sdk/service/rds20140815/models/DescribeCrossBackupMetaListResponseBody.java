// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossBackupMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossBackupMetaListResponseBody</p>
 */
public class DescribeCrossBackupMetaListResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalPageCount")
    private Integer totalPageCount;

    @NameInMap("TotalRecordCount")
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
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalPageCount.
         */
        public Builder totalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCrossBackupMetaListResponseBody build() {
            return new DescribeCrossBackupMetaListResponseBody(this);
        } 

    } 

    public static class Meta extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Size")
        private String size;

        @NameInMap("Tables")
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
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Tables.
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
        @NameInMap("Meta")
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
