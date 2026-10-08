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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescibeImportsFromDatabaseResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
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
         * <p>The total number of entries.</p>
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

            private Builder() {
            } 

            private Builder(ImportResultFromDB model) {
                this.importDataStatus = model.importDataStatus;
                this.importDataStatusDescription = model.importDataStatusDescription;
                this.importDataType = model.importDataType;
                this.importId = model.importId;
                this.incrementalImportingTime = model.incrementalImportingTime;
            } 

            /**
             * ImportDataStatus.
             */
            public Builder importDataStatus(String importDataStatus) {
                this.importDataStatus = importDataStatus;
                return this;
            }

            /**
             * ImportDataStatusDescription.
             */
            public Builder importDataStatusDescription(String importDataStatusDescription) {
                this.importDataStatusDescription = importDataStatusDescription;
                return this;
            }

            /**
             * ImportDataType.
             */
            public Builder importDataType(String importDataType) {
                this.importDataType = importDataType;
                return this;
            }

            /**
             * ImportId.
             */
            public Builder importId(Integer importId) {
                this.importId = importId;
                return this;
            }

            /**
             * IncrementalImportingTime.
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
        private java.util.List<ImportResultFromDB> importResultFromDB;

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
        public java.util.List<ImportResultFromDB> getImportResultFromDB() {
            return this.importResultFromDB;
        }

        public static final class Builder {
            private java.util.List<ImportResultFromDB> importResultFromDB; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.importResultFromDB = model.importResultFromDB;
            } 

            /**
             * ImportResultFromDB.
             */
            public Builder importResultFromDB(java.util.List<ImportResultFromDB> importResultFromDB) {
                this.importResultFromDB = importResultFromDB;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
