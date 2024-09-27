// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The queried jobs.</p>
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

    /**
     * 
     * {@link ListStreamingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStreamingJobsResponseBody</p>
     */
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
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test-account</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The delivery guarantee setting.</p>
             * 
             * <strong>example:</strong>
             * <p>ATLEAST / EXACTLY</p>
             */
            public Builder consistency(String consistency) {
                this.consistency = consistency;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T16:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test-kafka</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The mapped fields in the destination table.</p>
             */
            public Builder destColumns(java.util.List < String > destColumns) {
                this.destColumns = destColumns;
                return this;
            }

            /**
             * <p>The name of the destination database.</p>
             * 
             * <strong>example:</strong>
             * <p>dest-db</p>
             */
            public Builder destDatabase(String destDatabase) {
                this.destDatabase = destDatabase;
                return this;
            }

            /**
             * <p>The name of the destination namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>dest-schema</p>
             */
            public Builder destSchema(String destSchema) {
                this.destSchema = destSchema;
                return this;
            }

            /**
             * <p>The name of the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>dest-table</p>
             */
            public Builder destTable(String destTable) {
                this.destTable = destTable;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * <p>This parameter is returned only when the return value of <strong>Status</strong> is <strong>false</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The fallback offset for data consumption.</p>
             * <ul>
             * <li>This parameter indicates the starting offset from which data consumption resumes when a consumer does not request a consumption offset or requests a consumption offset that is beyond the range of the offset information recorded in the current Kafka cluster. Valid values: EARLIEST and LATEST.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EARLIEST /  LATEST</p>
             */
            public Builder fallbackOffset(String fallbackOffset) {
                this.fallbackOffset = fallbackOffset;
                return this;
            }

            /**
             * <p>The description of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>test job</p>
             */
            public Builder jobDescription(String jobDescription) {
                this.jobDescription = jobDescription;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>test-job</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The update condition columns that are used to join the source data and the destination table. Typically, the columns are all the primary key columns of the destination table. If the values of all columns specified by this parameter in different rows are the same, the rows are considered duplicates.</p>
             */
            public Builder matchColumns(java.util.List < String > matchColumns) {
                this.matchColumns = matchColumns;
                return this;
            }

            /**
             * <p>The configuration mode. Valid values:</p>
             * <ol>
             * <li>basic: In basic mode, you must configure the configuration parameters.</li>
             * <li>professional: In professional mode, you can submit a YAML configuration file.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>Basic / Professional</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The time when the job was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-08T17:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The password of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>pwd123</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The source fields.</p>
             */
            public Builder srcColumns(java.util.List < String > srcColumns) {
                this.srcColumns = srcColumns;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li>Init</li>
             * <li>Running</li>
             * <li>Exception</li>
             * <li>Paused</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The columns to be updated if a row of data meets the update condition. Typically, the columns are all non-primary key columns of the destination table. When the columns specified by the MatchColumns parameter are used as conditions to join the source data and the destination table, data in columns of the UpdateColumns type is updated if data is matched.</p>
             */
            public Builder updateColumns(java.util.List < String > updateColumns) {
                this.updateColumns = updateColumns;
                return this;
            }

            /**
             * <p>The write mode.</p>
             * 
             * <strong>example:</strong>
             * <p>INSERT/UPDATE/MERGE</p>
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
