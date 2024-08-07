// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStreamingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStreamingJobsResponseBody</p>
 */
public class ListStreamingJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobItems")
    private java.util.List < JobItems> jobItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListStreamingJobsResponseBody(Builder builder) {
        this.jobItems = builder.jobItems;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStreamingJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobItems
     */
    public java.util.List < JobItems> getJobItems() {
        return this.jobItems;
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
        private java.util.List < JobItems> jobItems; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The queried jobs.
         */
        public Builder jobItems(java.util.List < JobItems> jobItems) {
            this.jobItems = jobItems;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListStreamingJobsResponseBody build() {
            return new ListStreamingJobsResponseBody(this);
        } 

    } 

    public static class JobItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Consistency")
        private String consistency;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DestColumns")
        private java.util.List < String > destColumns;

        @com.aliyun.core.annotation.NameInMap("DestDatabase")
        private String destDatabase;

        @com.aliyun.core.annotation.NameInMap("DestSchema")
        private String destSchema;

        @com.aliyun.core.annotation.NameInMap("DestTable")
        private String destTable;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FallbackOffset")
        private String fallbackOffset;

        @com.aliyun.core.annotation.NameInMap("JobDescription")
        private String jobDescription;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("MatchColumns")
        private java.util.List < String > matchColumns;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("SrcColumns")
        private java.util.List < String > srcColumns;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateColumns")
        private java.util.List < String > updateColumns;

        @com.aliyun.core.annotation.NameInMap("WriteMode")
        private String writeMode;

        private JobItems(Builder builder) {
            this.account = builder.account;
            this.consistency = builder.consistency;
            this.createTime = builder.createTime;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.destColumns = builder.destColumns;
            this.destDatabase = builder.destDatabase;
            this.destSchema = builder.destSchema;
            this.destTable = builder.destTable;
            this.errorMessage = builder.errorMessage;
            this.fallbackOffset = builder.fallbackOffset;
            this.jobDescription = builder.jobDescription;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.matchColumns = builder.matchColumns;
            this.mode = builder.mode;
            this.modifyTime = builder.modifyTime;
            this.password = builder.password;
            this.srcColumns = builder.srcColumns;
            this.status = builder.status;
            this.updateColumns = builder.updateColumns;
            this.writeMode = builder.writeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobItems create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return consistency
         */
        public String getConsistency() {
            return this.consistency;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return destColumns
         */
        public java.util.List < String > getDestColumns() {
            return this.destColumns;
        }

        /**
         * @return destDatabase
         */
        public String getDestDatabase() {
            return this.destDatabase;
        }

        /**
         * @return destSchema
         */
        public String getDestSchema() {
            return this.destSchema;
        }

        /**
         * @return destTable
         */
        public String getDestTable() {
            return this.destTable;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fallbackOffset
         */
        public String getFallbackOffset() {
            return this.fallbackOffset;
        }

        /**
         * @return jobDescription
         */
        public String getJobDescription() {
            return this.jobDescription;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return matchColumns
         */
        public java.util.List < String > getMatchColumns() {
            return this.matchColumns;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return srcColumns
         */
        public java.util.List < String > getSrcColumns() {
            return this.srcColumns;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateColumns
         */
        public java.util.List < String > getUpdateColumns() {
            return this.updateColumns;
        }

        /**
         * @return writeMode
         */
        public String getWriteMode() {
            return this.writeMode;
        }

        public static final class Builder {
            private String account; 
            private String consistency; 
            private String createTime; 
            private String dataSourceId; 
            private String dataSourceName; 
            private java.util.List < String > destColumns; 
            private String destDatabase; 
            private String destSchema; 
            private String destTable; 
            private String errorMessage; 
            private String fallbackOffset; 
            private String jobDescription; 
            private String jobId; 
            private String jobName; 
            private java.util.List < String > matchColumns; 
            private String mode; 
            private String modifyTime; 
            private String password; 
            private java.util.List < String > srcColumns; 
            private String status; 
            private java.util.List < String > updateColumns; 
            private String writeMode; 

            /**
             * The name of the database account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * The delivery guarantee setting.
             */
            public Builder consistency(String consistency) {
                this.consistency = consistency;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The data source ID.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * The mapped fields in the destination table.
             */
            public Builder destColumns(java.util.List < String > destColumns) {
                this.destColumns = destColumns;
                return this;
            }

            /**
             * The name of the destination database.
             */
            public Builder destDatabase(String destDatabase) {
                this.destDatabase = destDatabase;
                return this;
            }

            /**
             * The name of the destination namespace.
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * The name of the destination table.
             */
            public Builder destTable(String destTable) {
                this.destTable = destTable;
                return this;
            }

            /**
             * The error message returned.
             * <p>
             * 
             * This parameter is returned only when the return value of **Status** is **false**.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The fallback offset for data consumption.
             * <p>
             * 
             * *   This parameter indicates the starting offset from which data consumption resumes when a consumer does not request a consumption offset or requests a consumption offset that is beyond the range of the offset information recorded in the current Kafka cluster. Valid values: EARLIEST and LATEST.
             */
            public Builder fallbackOffset(String fallbackOffset) {
                this.fallbackOffset = fallbackOffset;
                return this;
            }

            /**
             * The description of the job.
             */
            public Builder jobDescription(String jobDescription) {
                this.jobDescription = jobDescription;
                return this;
            }

            /**
             * The job ID.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The name of the job.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * The update condition columns that are used to join the source data and the destination table. Typically, the columns are all the primary key columns of the destination table. If the values of all columns specified by this parameter in different rows are the same, the rows are considered duplicates.
             */
            public Builder matchColumns(java.util.List < String > matchColumns) {
                this.matchColumns = matchColumns;
                return this;
            }

            /**
             * The configuration mode. Valid values:
             * <p>
             * 
             * 1.  basic: In basic mode, you must configure the configuration parameters.
             * 2.  professional: In professional mode, you can submit a YAML configuration file.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The time when the job was last modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The password of the database account.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The source fields.
             */
            public Builder srcColumns(java.util.List < String > srcColumns) {
                this.srcColumns = srcColumns;
                return this;
            }

            /**
             * The status of the job. Valid values:
             * <p>
             * 
             * *   Init
             * *   Running
             * *   Exception
             * *   Paused
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The columns to be updated if a row of data meets the update condition. Typically, the columns are all non-primary key columns of the destination table. When the columns specified by the MatchColumns parameter are used as conditions to join the source data and the destination table, data in columns of the UpdateColumns type is updated if data is matched.
             */
            public Builder updateColumns(java.util.List < String > updateColumns) {
                this.updateColumns = updateColumns;
                return this;
            }

            /**
             * The write mode.
             */
            public Builder writeMode(String writeMode) {
                this.writeMode = writeMode;
                return this;
            }

            public JobItems build() {
                return new JobItems(this);
            } 

        } 

    }
}
