// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeStreamingJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStreamingJobResponseBody</p>
 */
public class DescribeStreamingJobResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("ErrorLimitCount")
    private Integer errorLimitCount;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FallbackOffset")
    private String fallbackOffset;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("JobConfig")
    private String jobConfig;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SrcColumns")
    private java.util.List < String > srcColumns;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateColumns")
    private java.util.List < String > updateColumns;

    @com.aliyun.core.annotation.NameInMap("WriteMode")
    private String writeMode;

    private DescribeStreamingJobResponseBody(Builder builder) {
        this.account = builder.account;
        this.consistency = builder.consistency;
        this.createTime = builder.createTime;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceName = builder.dataSourceName;
        this.destColumns = builder.destColumns;
        this.destDatabase = builder.destDatabase;
        this.destSchema = builder.destSchema;
        this.destTable = builder.destTable;
        this.errorLimitCount = builder.errorLimitCount;
        this.errorMessage = builder.errorMessage;
        this.fallbackOffset = builder.fallbackOffset;
        this.groupName = builder.groupName;
        this.jobConfig = builder.jobConfig;
        this.jobDescription = builder.jobDescription;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.matchColumns = builder.matchColumns;
        this.mode = builder.mode;
        this.modifyTime = builder.modifyTime;
        this.password = builder.password;
        this.requestId = builder.requestId;
        this.srcColumns = builder.srcColumns;
        this.status = builder.status;
        this.updateColumns = builder.updateColumns;
        this.writeMode = builder.writeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamingJobResponseBody create() {
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
     * @return errorLimitCount
     */
    public Integer getErrorLimitCount() {
        return this.errorLimitCount;
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return jobConfig
     */
    public String getJobConfig() {
        return this.jobConfig;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Integer errorLimitCount; 
        private String errorMessage; 
        private String fallbackOffset; 
        private String groupName; 
        private String jobConfig; 
        private String jobDescription; 
        private String jobId; 
        private String jobName; 
        private java.util.List < String > matchColumns; 
        private String mode; 
        private String modifyTime; 
        private String password; 
        private String requestId; 
        private java.util.List < String > srcColumns; 
        private String status; 
        private java.util.List < String > updateColumns; 
        private String writeMode; 

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        public Builder account(String account) {
            this.account = account;
            return this;
        }

        /**
         * Consistency.
         */
        public Builder consistency(String consistency) {
            this.consistency = consistency;
            return this;
        }

        /**
         * <p>The time when the job was created.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test-kafka</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The destination fields.</p>
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
         * DestSchema.
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
         * ErrorLimitCount.
         */
        public Builder errorLimitCount(Integer errorLimitCount) {
            this.errorLimitCount = errorLimitCount;
            return this;
        }

        /**
         * <p>The information about the job status. For example, if the job is in the Exception state, the cause of the exception is displayed. If the job is in the Running state, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * FallbackOffset.
         */
        public Builder fallbackOffset(String fallbackOffset) {
            this.fallbackOffset = fallbackOffset;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * JobConfig.
         */
        public Builder jobConfig(String jobConfig) {
            this.jobConfig = jobConfig;
            return this;
        }

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test_job</p>
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
         * MatchColumns.
         */
        public Builder matchColumns(java.util.List < String > matchColumns) {
            this.matchColumns = matchColumns;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The time when the job was last modified.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T17:00:00Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The password of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd123</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <li>Init: The job is being initialized.</li>
         * <li>Running: The job is running.</li>
         * <li>Exception: The job encounters an exception.</li>
         * <li>Paused: The job is paused.</li>
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
         * UpdateColumns.
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

        public DescribeStreamingJobResponseBody build() {
            return new DescribeStreamingJobResponseBody(this);
        } 

    } 

}
