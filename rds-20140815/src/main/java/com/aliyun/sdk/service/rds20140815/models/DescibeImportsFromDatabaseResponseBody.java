// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescibeImportsFromDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>DescibeImportsFromDatabaseResponseBody</p>
 */
public class DescibeImportsFromDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
         * <p>The migration tasks.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B000AA91-393D-46F9-8D9B-098E28931A3A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescibeImportsFromDatabaseResponseBody build() {
            return new DescibeImportsFromDatabaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescibeImportsFromDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>DescibeImportsFromDatabaseResponseBody</p>
     */
    public static class ImportResultFromDB extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImportDataStatus")
        private String importDataStatus;

        @com.aliyun.core.annotation.NameInMap("ImportDataStatusDescription")
        private String importDataStatusDescription;

        @com.aliyun.core.annotation.NameInMap("ImportDataType")
        private String importDataType;

        @com.aliyun.core.annotation.NameInMap("ImportId")
        private Integer importId;

        @com.aliyun.core.annotation.NameInMap("IncrementalImportingTime")
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
             * <p>The status of the migration task. Valid values:</p>
             * <ul>
             * <li><strong>NotStart</strong>: The migration task has not started.</li>
             * <li><strong>FullExporting</strong>: The migration task is exporting full data.</li>
             * <li><strong>FullImporting</strong>: The migration task is importing full data.</li>
             * <li><strong>Success</strong>: The migration task is successful.</li>
             * <li><strong>Failed</strong>: The migration task failed.</li>
             * <li><strong>Canceled</strong>: The migration task is canceled.</li>
             * <li><strong>Canceling</strong>: The migration task is being canceled.</li>
             * <li><strong>IncrementalWaiting</strong>: The migration task is waiting to synchronize incremental data.</li>
             * <li><strong>IncrementalImporting</strong>: The migration task is synchronizing incremental data.</li>
             * <li><strong>StopSyncing</strong>: The migration task stops synchronizing data.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NotStart</p>
             */
            public Builder importDataStatus(String importDataStatus) {
                this.importDataStatus = importDataStatus;
                return this;
            }

            /**
             * <p>The description of the migration task.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder importDataStatusDescription(String importDataStatusDescription) {
                this.importDataStatusDescription = importDataStatusDescription;
                return this;
            }

            /**
             * <p>The type of the migration task. Valid values:</p>
             * <ul>
             * <li><strong>Full</strong>: full migration</li>
             * <li><strong>Incremental:</strong>: incremental migration</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Full</p>
             */
            public Builder importDataType(String importDataType) {
                this.importDataType = importDataType;
                return this;
            }

            /**
             * <p>The ID of the migration task.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder importId(Integer importId) {
                this.importId = importId;
                return this;
            }

            /**
             * <p>The time when the migration task synchronized incremental data. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-06-11T15:00Z</p>
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
    /**
     * 
     * {@link DescibeImportsFromDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>DescibeImportsFromDatabaseResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImportResultFromDB")
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
