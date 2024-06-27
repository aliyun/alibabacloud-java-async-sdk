// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The username of the account.
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
         * The time when the job was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The name of the data source.
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
         * The destination fields.
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
         * DestSchema.
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
         * ErrorLimitCount.
         */
        public Builder errorLimitCount(Integer errorLimitCount) {
            this.errorLimitCount = errorLimitCount;
            return this;
        }

        /**
         * The information about the job status. For example, if the job is in the Exception state, the cause of the exception is displayed. If the job is in the Running state, this parameter is left empty.
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
         * The time when the job was last modified.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * The password of the account.
         */
        public Builder password(String password) {
            this.password = password;
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
         * *   Init: The job is being initialized.
         * *   Running: The job is running.
         * *   Exception: The job encounters an exception.
         * *   Paused: The job is paused.
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
         * The write mode.
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
