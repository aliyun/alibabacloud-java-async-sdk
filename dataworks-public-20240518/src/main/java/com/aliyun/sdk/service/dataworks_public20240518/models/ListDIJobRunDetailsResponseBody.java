// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDIJobRunDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIJobRunDetailsResponseBody</p>
 */
public class ListDIJobRunDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDIJobRunDetailsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobRunDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDIJobRunDetailsResponseBody build() {
            return new ListDIJobRunDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDIJobRunDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobRunDetailsResponseBody</p>
     */
    public static class JobRunInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationDatabaseName")
        private String destinationDatabaseName;

        @com.aliyun.core.annotation.NameInMap("DestinationDatasourceName")
        private String destinationDatasourceName;

        @com.aliyun.core.annotation.NameInMap("DestinationSchemaName")
        private String destinationSchemaName;

        @com.aliyun.core.annotation.NameInMap("DestinationTableName")
        private String destinationTableName;

        @com.aliyun.core.annotation.NameInMap("FullMigrationErrorMessage")
        private String fullMigrationErrorMessage;

        @com.aliyun.core.annotation.NameInMap("FullMigrationStatus")
        private String fullMigrationStatus;

        @com.aliyun.core.annotation.NameInMap("OfflineErrorRecords")
        private Long offlineErrorRecords;

        @com.aliyun.core.annotation.NameInMap("OfflineTotalBytes")
        private Long offlineTotalBytes;

        @com.aliyun.core.annotation.NameInMap("OfflineTotalRecords")
        private Long offlineTotalRecords;

        @com.aliyun.core.annotation.NameInMap("RealtimeMigrationErrorMessage")
        private String realtimeMigrationErrorMessage;

        @com.aliyun.core.annotation.NameInMap("RealtimeMigrationStatus")
        private String realtimeMigrationStatus;

        @com.aliyun.core.annotation.NameInMap("SourceDatabaseName")
        private String sourceDatabaseName;

        @com.aliyun.core.annotation.NameInMap("SourceDatasourceName")
        private String sourceDatasourceName;

        @com.aliyun.core.annotation.NameInMap("SourceSchemaName")
        private String sourceSchemaName;

        @com.aliyun.core.annotation.NameInMap("SourceTableName")
        private String sourceTableName;

        @com.aliyun.core.annotation.NameInMap("StructureMigrationErrorMessage")
        private String structureMigrationErrorMessage;

        @com.aliyun.core.annotation.NameInMap("StructureMigrationStatus")
        private String structureMigrationStatus;

        private JobRunInfos(Builder builder) {
            this.destinationDatabaseName = builder.destinationDatabaseName;
            this.destinationDatasourceName = builder.destinationDatasourceName;
            this.destinationSchemaName = builder.destinationSchemaName;
            this.destinationTableName = builder.destinationTableName;
            this.fullMigrationErrorMessage = builder.fullMigrationErrorMessage;
            this.fullMigrationStatus = builder.fullMigrationStatus;
            this.offlineErrorRecords = builder.offlineErrorRecords;
            this.offlineTotalBytes = builder.offlineTotalBytes;
            this.offlineTotalRecords = builder.offlineTotalRecords;
            this.realtimeMigrationErrorMessage = builder.realtimeMigrationErrorMessage;
            this.realtimeMigrationStatus = builder.realtimeMigrationStatus;
            this.sourceDatabaseName = builder.sourceDatabaseName;
            this.sourceDatasourceName = builder.sourceDatasourceName;
            this.sourceSchemaName = builder.sourceSchemaName;
            this.sourceTableName = builder.sourceTableName;
            this.structureMigrationErrorMessage = builder.structureMigrationErrorMessage;
            this.structureMigrationStatus = builder.structureMigrationStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobRunInfos create() {
            return builder().build();
        }

        /**
         * @return destinationDatabaseName
         */
        public String getDestinationDatabaseName() {
            return this.destinationDatabaseName;
        }

        /**
         * @return destinationDatasourceName
         */
        public String getDestinationDatasourceName() {
            return this.destinationDatasourceName;
        }

        /**
         * @return destinationSchemaName
         */
        public String getDestinationSchemaName() {
            return this.destinationSchemaName;
        }

        /**
         * @return destinationTableName
         */
        public String getDestinationTableName() {
            return this.destinationTableName;
        }

        /**
         * @return fullMigrationErrorMessage
         */
        public String getFullMigrationErrorMessage() {
            return this.fullMigrationErrorMessage;
        }

        /**
         * @return fullMigrationStatus
         */
        public String getFullMigrationStatus() {
            return this.fullMigrationStatus;
        }

        /**
         * @return offlineErrorRecords
         */
        public Long getOfflineErrorRecords() {
            return this.offlineErrorRecords;
        }

        /**
         * @return offlineTotalBytes
         */
        public Long getOfflineTotalBytes() {
            return this.offlineTotalBytes;
        }

        /**
         * @return offlineTotalRecords
         */
        public Long getOfflineTotalRecords() {
            return this.offlineTotalRecords;
        }

        /**
         * @return realtimeMigrationErrorMessage
         */
        public String getRealtimeMigrationErrorMessage() {
            return this.realtimeMigrationErrorMessage;
        }

        /**
         * @return realtimeMigrationStatus
         */
        public String getRealtimeMigrationStatus() {
            return this.realtimeMigrationStatus;
        }

        /**
         * @return sourceDatabaseName
         */
        public String getSourceDatabaseName() {
            return this.sourceDatabaseName;
        }

        /**
         * @return sourceDatasourceName
         */
        public String getSourceDatasourceName() {
            return this.sourceDatasourceName;
        }

        /**
         * @return sourceSchemaName
         */
        public String getSourceSchemaName() {
            return this.sourceSchemaName;
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        /**
         * @return structureMigrationErrorMessage
         */
        public String getStructureMigrationErrorMessage() {
            return this.structureMigrationErrorMessage;
        }

        /**
         * @return structureMigrationStatus
         */
        public String getStructureMigrationStatus() {
            return this.structureMigrationStatus;
        }

        public static final class Builder {
            private String destinationDatabaseName; 
            private String destinationDatasourceName; 
            private String destinationSchemaName; 
            private String destinationTableName; 
            private String fullMigrationErrorMessage; 
            private String fullMigrationStatus; 
            private Long offlineErrorRecords; 
            private Long offlineTotalBytes; 
            private Long offlineTotalRecords; 
            private String realtimeMigrationErrorMessage; 
            private String realtimeMigrationStatus; 
            private String sourceDatabaseName; 
            private String sourceDatasourceName; 
            private String sourceSchemaName; 
            private String sourceTableName; 
            private String structureMigrationErrorMessage; 
            private String structureMigrationStatus; 

            /**
             * DestinationDatabaseName.
             */
            public Builder destinationDatabaseName(String destinationDatabaseName) {
                this.destinationDatabaseName = destinationDatabaseName;
                return this;
            }

            /**
             * DestinationDatasourceName.
             */
            public Builder destinationDatasourceName(String destinationDatasourceName) {
                this.destinationDatasourceName = destinationDatasourceName;
                return this;
            }

            /**
             * DestinationSchemaName.
             */
            public Builder destinationSchemaName(String destinationSchemaName) {
                this.destinationSchemaName = destinationSchemaName;
                return this;
            }

            /**
             * DestinationTableName.
             */
            public Builder destinationTableName(String destinationTableName) {
                this.destinationTableName = destinationTableName;
                return this;
            }

            /**
             * FullMigrationErrorMessage.
             */
            public Builder fullMigrationErrorMessage(String fullMigrationErrorMessage) {
                this.fullMigrationErrorMessage = fullMigrationErrorMessage;
                return this;
            }

            /**
             * FullMigrationStatus.
             */
            public Builder fullMigrationStatus(String fullMigrationStatus) {
                this.fullMigrationStatus = fullMigrationStatus;
                return this;
            }

            /**
             * OfflineErrorRecords.
             */
            public Builder offlineErrorRecords(Long offlineErrorRecords) {
                this.offlineErrorRecords = offlineErrorRecords;
                return this;
            }

            /**
             * OfflineTotalBytes.
             */
            public Builder offlineTotalBytes(Long offlineTotalBytes) {
                this.offlineTotalBytes = offlineTotalBytes;
                return this;
            }

            /**
             * OfflineTotalRecords.
             */
            public Builder offlineTotalRecords(Long offlineTotalRecords) {
                this.offlineTotalRecords = offlineTotalRecords;
                return this;
            }

            /**
             * RealtimeMigrationErrorMessage.
             */
            public Builder realtimeMigrationErrorMessage(String realtimeMigrationErrorMessage) {
                this.realtimeMigrationErrorMessage = realtimeMigrationErrorMessage;
                return this;
            }

            /**
             * RealtimeMigrationStatus.
             */
            public Builder realtimeMigrationStatus(String realtimeMigrationStatus) {
                this.realtimeMigrationStatus = realtimeMigrationStatus;
                return this;
            }

            /**
             * SourceDatabaseName.
             */
            public Builder sourceDatabaseName(String sourceDatabaseName) {
                this.sourceDatabaseName = sourceDatabaseName;
                return this;
            }

            /**
             * SourceDatasourceName.
             */
            public Builder sourceDatasourceName(String sourceDatasourceName) {
                this.sourceDatasourceName = sourceDatasourceName;
                return this;
            }

            /**
             * SourceSchemaName.
             */
            public Builder sourceSchemaName(String sourceSchemaName) {
                this.sourceSchemaName = sourceSchemaName;
                return this;
            }

            /**
             * SourceTableName.
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * StructureMigrationErrorMessage.
             */
            public Builder structureMigrationErrorMessage(String structureMigrationErrorMessage) {
                this.structureMigrationErrorMessage = structureMigrationErrorMessage;
                return this;
            }

            /**
             * StructureMigrationStatus.
             */
            public Builder structureMigrationStatus(String structureMigrationStatus) {
                this.structureMigrationStatus = structureMigrationStatus;
                return this;
            }

            public JobRunInfos build() {
                return new JobRunInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDIJobRunDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobRunDetailsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobRunInfos")
        private java.util.List < JobRunInfos> jobRunInfos;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        private PagingInfo(Builder builder) {
            this.jobRunInfos = builder.jobRunInfos;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return jobRunInfos
         */
        public java.util.List < JobRunInfos> getJobRunInfos() {
            return this.jobRunInfos;
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
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < JobRunInfos> jobRunInfos; 
            private String pageNumber; 
            private String pageSize; 
            private String totalCount; 

            /**
             * JobRunInfos.
             */
            public Builder jobRunInfos(java.util.List < JobRunInfos> jobRunInfos) {
                this.jobRunInfos = jobRunInfos;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
