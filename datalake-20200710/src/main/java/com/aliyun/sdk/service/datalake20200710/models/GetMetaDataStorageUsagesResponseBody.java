// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaDataStorageUsagesResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaDataStorageUsagesResponseBody</p>
 */
public class GetMetaDataStorageUsagesResponseBody extends TeaModel {
    @NameInMap("MetaDataStorageUsages")
    private java.util.List < MetaDataStorageUsages> metaDataStorageUsages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private String totalCount;

    private GetMetaDataStorageUsagesResponseBody(Builder builder) {
        this.metaDataStorageUsages = builder.metaDataStorageUsages;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaDataStorageUsagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return metaDataStorageUsages
     */
    public java.util.List < MetaDataStorageUsages> getMetaDataStorageUsages() {
        return this.metaDataStorageUsages;
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

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < MetaDataStorageUsages> metaDataStorageUsages; 
        private String requestId; 
        private Boolean success; 
        private String totalCount; 

        /**
         * MetaDataStorageUsages.
         */
        public Builder metaDataStorageUsages(java.util.List < MetaDataStorageUsages> metaDataStorageUsages) {
            this.metaDataStorageUsages = metaDataStorageUsages;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetMetaDataStorageUsagesResponseBody build() {
            return new GetMetaDataStorageUsagesResponseBody(this);
        } 

    } 

    public static class MetaDataStorageUsages extends TeaModel {
        @NameInMap("Catalog")
        private Long catalog;

        @NameInMap("Database")
        private Long database;

        @NameInMap("Function")
        private Long function;

        @NameInMap("Month")
        private String month;

        @NameInMap("Partition")
        private Long partition;

        @NameInMap("QueryTime")
        private String queryTime;

        @NameInMap("StorageUsage")
        private Long storageUsage;

        @NameInMap("Table")
        private Long table;

        private MetaDataStorageUsages(Builder builder) {
            this.catalog = builder.catalog;
            this.database = builder.database;
            this.function = builder.function;
            this.month = builder.month;
            this.partition = builder.partition;
            this.queryTime = builder.queryTime;
            this.storageUsage = builder.storageUsage;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaDataStorageUsages create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public Long getCatalog() {
            return this.catalog;
        }

        /**
         * @return database
         */
        public Long getDatabase() {
            return this.database;
        }

        /**
         * @return function
         */
        public Long getFunction() {
            return this.function;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        /**
         * @return partition
         */
        public Long getPartition() {
            return this.partition;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return storageUsage
         */
        public Long getStorageUsage() {
            return this.storageUsage;
        }

        /**
         * @return table
         */
        public Long getTable() {
            return this.table;
        }

        public static final class Builder {
            private Long catalog; 
            private Long database; 
            private Long function; 
            private String month; 
            private Long partition; 
            private String queryTime; 
            private Long storageUsage; 
            private Long table; 

            /**
             * Catalog.
             */
            public Builder catalog(Long catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(Long database) {
                this.database = database;
                return this;
            }

            /**
             * Function.
             */
            public Builder function(Long function) {
                this.function = function;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(String month) {
                this.month = month;
                return this;
            }

            /**
             * Partition.
             */
            public Builder partition(Long partition) {
                this.partition = partition;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * StorageUsage.
             */
            public Builder storageUsage(Long storageUsage) {
                this.storageUsage = storageUsage;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(Long table) {
                this.table = table;
                return this;
            }

            public MetaDataStorageUsages build() {
                return new MetaDataStorageUsages(this);
            } 

        } 

    }
}
