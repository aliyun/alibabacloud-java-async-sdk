// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescibeImportsFromDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>DescibeImportsFromDatabaseResponseBody</p>
 */
public class DescibeImportsFromDatabaseResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescibeImportsFromDatabaseResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescibeImportsFromDatabaseResponseBody create() {
        return builder().build();
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * An array that consists of migration tasks.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescibeImportsFromDatabaseResponseBody build() {
            return new DescibeImportsFromDatabaseResponseBody(this);
        } 

    } 

    public static class ImportResultFromDB extends TeaModel {
        @NameInMap("ImportDataStatus")
        private String importDataStatus;

        @NameInMap("ImportDataStatusDescription")
        private String importDataStatusDescription;

        @NameInMap("ImportDataType")
        private String importDataType;

        @NameInMap("ImportId")
        private Integer importId;

        @NameInMap("IncrementalImportingTime")
        private String incrementalImportingTime;

        private ImportResultFromDB(Builder builder) {
            this.importDataStatus = builder.importDataStatus;
            this.importDataStatusDescription = builder.importDataStatusDescription;
            this.importDataType = builder.importDataType;
            this.importId = builder.importId;
            this.incrementalImportingTime = builder.incrementalImportingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportResultFromDB create() {
            return builder().build();
        }

        /**
         * @return importDataStatus
         */
        public String getImportDataStatus() {
            return this.importDataStatus;
        }

        /**
         * @return importDataStatusDescription
         */
        public String getImportDataStatusDescription() {
            return this.importDataStatusDescription;
        }

        /**
         * @return importDataType
         */
        public String getImportDataType() {
            return this.importDataType;
        }

        /**
         * @return importId
         */
        public Integer getImportId() {
            return this.importId;
        }

        /**
         * @return incrementalImportingTime
         */
        public String getIncrementalImportingTime() {
            return this.incrementalImportingTime;
        }

        public static final class Builder {
            private String importDataStatus; 
            private String importDataStatusDescription; 
            private String importDataType; 
            private Integer importId; 
            private String incrementalImportingTime; 

            /**
             * The status of the migration task. Valid values:
             * <p>
             * 
             * *   **NotStart**: The migration task has not started.
             * *   **FullExporting**: The migration task is exporting full data.
             * *   **FullImporting**: The migration task is importing full data.
             * *   **Success**: The migration task is successful.
             * *   **Failed**: The migration task fails.
             * *   **Canceled**: The migration task is canceled.
             * *   **Canceling**: The migration task is being canceled.
             * *   **IncrementalWaiting**: The migration task is waiting to synchronize incremental data.
             * *   **IncrementalImporting**: The migration task is synchronizing incremental data.
             * *   **StopSyncing**: The migration task stops synchronizing data.
             */
            public Builder importDataStatus(String importDataStatus) {
                this.importDataStatus = importDataStatus;
                return this;
            }

            /**
             * The description of the migration task.
             */
            public Builder importDataStatusDescription(String importDataStatusDescription) {
                this.importDataStatusDescription = importDataStatusDescription;
                return this;
            }

            /**
             * The type of the migration task. Valid values:
             * <p>
             * 
             * *   **Full**: full migration
             * *   **Incremental**: incremental migration
             */
            public Builder importDataType(String importDataType) {
                this.importDataType = importDataType;
                return this;
            }

            /**
             * The ID of the migration task.
             */
            public Builder importId(Integer importId) {
                this.importId = importId;
                return this;
            }

            /**
             * The time when the migration task synchronized incremental data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder incrementalImportingTime(String incrementalImportingTime) {
                this.incrementalImportingTime = incrementalImportingTime;
                return this;
            }

            public ImportResultFromDB build() {
                return new ImportResultFromDB(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("ImportResultFromDB")
        private java.util.List < ImportResultFromDB> importResultFromDB;

        private Items(Builder builder) {
            this.importResultFromDB = builder.importResultFromDB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return importResultFromDB
         */
        public java.util.List < ImportResultFromDB> getImportResultFromDB() {
            return this.importResultFromDB;
        }

        public static final class Builder {
            private java.util.List < ImportResultFromDB> importResultFromDB; 

            /**
             * ImportResultFromDB.
             */
            public Builder importResultFromDB(java.util.List < ImportResultFromDB> importResultFromDB) {
                this.importResultFromDB = importResultFromDB;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
