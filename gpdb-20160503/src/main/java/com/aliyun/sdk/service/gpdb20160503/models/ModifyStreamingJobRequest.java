// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStreamingJobRequest} extends {@link RequestModel}
 *
 * <p>ModifyStreamingJobRequest</p>
 */
public class ModifyStreamingJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Consistency")
    private String consistency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestColumns")
    private java.util.List < String > destColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDatabase")
    private String destDatabase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestSchema")
    private String destSchema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestTable")
    private String destTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorLimitCount")
    private Long errorLimitCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallbackOffset")
    private String fallbackOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobConfig")
    private String jobConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobDescription")
    private String jobDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchColumns")
    private java.util.List < String > matchColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcColumns")
    private java.util.List < String > srcColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TryRun")
    private Boolean tryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateColumns")
    private java.util.List < String > updateColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WriteMode")
    private String writeMode;

    private ModifyStreamingJobRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.consistency = builder.consistency;
        this.DBInstanceId = builder.DBInstanceId;
        this.destColumns = builder.destColumns;
        this.destDatabase = builder.destDatabase;
        this.destSchema = builder.destSchema;
        this.destTable = builder.destTable;
        this.errorLimitCount = builder.errorLimitCount;
        this.fallbackOffset = builder.fallbackOffset;
        this.groupName = builder.groupName;
        this.jobConfig = builder.jobConfig;
        this.jobDescription = builder.jobDescription;
        this.jobId = builder.jobId;
        this.matchColumns = builder.matchColumns;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.srcColumns = builder.srcColumns;
        this.tryRun = builder.tryRun;
        this.updateColumns = builder.updateColumns;
        this.writeMode = builder.writeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStreamingJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
    public Long getErrorLimitCount() {
        return this.errorLimitCount;
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
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return matchColumns
     */
    public java.util.List < String > getMatchColumns() {
        return this.matchColumns;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return srcColumns
     */
    public java.util.List < String > getSrcColumns() {
        return this.srcColumns;
    }

    /**
     * @return tryRun
     */
    public Boolean getTryRun() {
        return this.tryRun;
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

    public static final class Builder extends Request.Builder<ModifyStreamingJobRequest, Builder> {
        private String account; 
        private String consistency; 
        private String DBInstanceId; 
        private java.util.List < String > destColumns; 
        private String destDatabase; 
        private String destSchema; 
        private String destTable; 
        private Long errorLimitCount; 
        private String fallbackOffset; 
        private String groupName; 
        private String jobConfig; 
        private String jobDescription; 
        private Long jobId; 
        private java.util.List < String > matchColumns; 
        private String password; 
        private String regionId; 
        private java.util.List < String > srcColumns; 
        private Boolean tryRun; 
        private java.util.List < String > updateColumns; 
        private String writeMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStreamingJobRequest request) {
            super(request);
            this.account = request.account;
            this.consistency = request.consistency;
            this.DBInstanceId = request.DBInstanceId;
            this.destColumns = request.destColumns;
            this.destDatabase = request.destDatabase;
            this.destSchema = request.destSchema;
            this.destTable = request.destTable;
            this.errorLimitCount = request.errorLimitCount;
            this.fallbackOffset = request.fallbackOffset;
            this.groupName = request.groupName;
            this.jobConfig = request.jobConfig;
            this.jobDescription = request.jobDescription;
            this.jobId = request.jobId;
            this.matchColumns = request.matchColumns;
            this.password = request.password;
            this.regionId = request.regionId;
            this.srcColumns = request.srcColumns;
            this.tryRun = request.tryRun;
            this.updateColumns = request.updateColumns;
            this.writeMode = request.writeMode;
        } 

        /**
         * The name of the database account.
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * The delivery guarantee setting.
         * <p>
         * 
         * Valid values:
         * 
         * *   ATLEAST
         * *   EXACTLY
         */
        public Builder consistency(String consistency) {
            this.putQueryParameter("Consistency", consistency);
            this.consistency = consistency;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The destination fields.
         */
        public Builder destColumns(java.util.List < String > destColumns) {
            String destColumnsShrink = shrink(destColumns, "DestColumns", "json");
            this.putQueryParameter("DestColumns", destColumnsShrink);
            this.destColumns = destColumns;
            return this;
        }

        /**
         * The name of the destination database.
         */
        public Builder destDatabase(String destDatabase) {
            this.putQueryParameter("DestDatabase", destDatabase);
            this.destDatabase = destDatabase;
            return this;
        }

        /**
         * DestSchema.
         */
        public Builder destSchema(String destSchema) {
            this.putQueryParameter("DestSchema", destSchema);
            this.destSchema = destSchema;
            return this;
        }

        /**
         * The name of the destination table.
         */
        public Builder destTable(String destTable) {
            this.putQueryParameter("DestTable", destTable);
            this.destTable = destTable;
            return this;
        }

        /**
         * ErrorLimitCount.
         */
        public Builder errorLimitCount(Long errorLimitCount) {
            this.putQueryParameter("ErrorLimitCount", errorLimitCount);
            this.errorLimitCount = errorLimitCount;
            return this;
        }

        /**
         * FallbackOffset.
         */
        public Builder fallbackOffset(String fallbackOffset) {
            this.putQueryParameter("FallbackOffset", fallbackOffset);
            this.fallbackOffset = fallbackOffset;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The YAML configuration file of the job. This parameter must be specified when Mode is set to professional.
         */
        public Builder jobConfig(String jobConfig) {
            this.putQueryParameter("JobConfig", jobConfig);
            this.jobConfig = jobConfig;
            return this;
        }

        /**
         * The description of the job.
         */
        public Builder jobDescription(String jobDescription) {
            this.putQueryParameter("JobDescription", jobDescription);
            this.jobDescription = jobDescription;
            return this;
        }

        /**
         * The job ID.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * MatchColumns.
         */
        public Builder matchColumns(java.util.List < String > matchColumns) {
            String matchColumnsShrink = shrink(matchColumns, "MatchColumns", "json");
            this.putQueryParameter("MatchColumns", matchColumnsShrink);
            this.matchColumns = matchColumns;
            return this;
        }

        /**
         * The password of the database account.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The source fields.
         */
        public Builder srcColumns(java.util.List < String > srcColumns) {
            String srcColumnsShrink = shrink(srcColumns, "SrcColumns", "json");
            this.putQueryParameter("SrcColumns", srcColumnsShrink);
            this.srcColumns = srcColumns;
            return this;
        }

        /**
         * Specifies whether to test the real-time job. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder tryRun(Boolean tryRun) {
            this.putQueryParameter("TryRun", tryRun);
            this.tryRun = tryRun;
            return this;
        }

        /**
         * UpdateColumns.
         */
        public Builder updateColumns(java.util.List < String > updateColumns) {
            String updateColumnsShrink = shrink(updateColumns, "UpdateColumns", "json");
            this.putQueryParameter("UpdateColumns", updateColumnsShrink);
            this.updateColumns = updateColumns;
            return this;
        }

        /**
         * The write mode.
         * <p>
         * 
         * Valid values:
         * 
         * *   insert
         * *   update
         * *   merge
         */
        public Builder writeMode(String writeMode) {
            this.putQueryParameter("WriteMode", writeMode);
            this.writeMode = writeMode;
            return this;
        }

        @Override
        public ModifyStreamingJobRequest build() {
            return new ModifyStreamingJobRequest(this);
        } 

    } 

}
