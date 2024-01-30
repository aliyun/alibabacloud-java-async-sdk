// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlansResponseBody</p>
 */
public class DescribeBackupPlansResponseBody extends TeaModel {
    @NameInMap("BackupPlans")
    private BackupPlans backupPlans;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeBackupPlansResponseBody(Builder builder) {
        this.backupPlans = builder.backupPlans;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupPlans
     */
    public BackupPlans getBackupPlans() {
        return this.backupPlans;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private BackupPlans backupPlans; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The returned backup plans that meet the specified conditions.
         */
        public Builder backupPlans(BackupPlans backupPlans) {
            this.backupPlans = backupPlans;
            return this;
        }

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned backup plans that meet the specified conditions.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBackupPlansResponseBody build() {
            return new DescribeBackupPlansResponseBody(this);
        } 

    } 

    public static class TableNames extends TeaModel {
        @NameInMap("TableName")
        private java.util.List < String > tableName;

        private TableNames(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableNames create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public java.util.List < String > getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List < String > tableName; 

            /**
             * TableName.
             */
            public Builder tableName(java.util.List < String > tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableNames build() {
                return new TableNames(this);
            } 

        } 

    }
    public static class OtsDetail extends TeaModel {
        @NameInMap("TableNames")
        private TableNames tableNames;

        private OtsDetail(Builder builder) {
            this.tableNames = builder.tableNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtsDetail create() {
            return builder().build();
        }

        /**
         * @return tableNames
         */
        public TableNames getTableNames() {
            return this.tableNames;
        }

        public static final class Builder {
            private TableNames tableNames; 

            /**
             * The names of the tables in the Tablestore instance.
             */
            public Builder tableNames(TableNames tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            public OtsDetail build() {
                return new OtsDetail(this);
            } 

        } 

    }
    public static class Paths extends TeaModel {
        @NameInMap("Path")
        private java.util.List < String > path;

        private Paths(Builder builder) {
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paths create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public java.util.List < String > getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List < String > path; 

            /**
             * Path.
             */
            public Builder path(java.util.List < String > path) {
                this.path = path;
                return this;
            }

            public Paths build() {
                return new Paths(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @NameInMap("Extra")
        private String extra;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("SourceType")
        private String sourceType;

        private Resource(Builder builder) {
            this.extra = builder.extra;
            this.resourceId = builder.resourceId;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String extra; 
            private String resourceId; 
            private String sourceType; 

            /**
             * Additional information about the data source.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The ID of the data source.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the data source. Only **UDM_DISK** may be returned.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < Resource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class Rule extends TeaModel {
        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("DestinationRegionId")
        private String destinationRegionId;

        @NameInMap("DestinationRetention")
        private Long destinationRetention;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("DoCopy")
        private Boolean doCopy;

        @NameInMap("Retention")
        private Long retention;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Schedule")
        private String schedule;

        private Rule(Builder builder) {
            this.backupType = builder.backupType;
            this.destinationRegionId = builder.destinationRegionId;
            this.destinationRetention = builder.destinationRetention;
            this.disabled = builder.disabled;
            this.doCopy = builder.doCopy;
            this.retention = builder.retention;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.schedule = builder.schedule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return destinationRegionId
         */
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        /**
         * @return destinationRetention
         */
        public Long getDestinationRetention() {
            return this.destinationRetention;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return doCopy
         */
        public Boolean getDoCopy() {
            return this.doCopy;
        }

        /**
         * @return retention
         */
        public Long getRetention() {
            return this.retention;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        public static final class Builder {
            private String backupType; 
            private String destinationRegionId; 
            private Long destinationRetention; 
            private Boolean disabled; 
            private Boolean doCopy; 
            private Long retention; 
            private String ruleId; 
            private String ruleName; 
            private String schedule; 

            /**
             * The backup type. Only **COMPLETE** may be returned, which indicates full backup.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The ID of the region in which the remote backup vault resides.
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * The retention period of the backup data in remote backup mode. Unit: day.
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * Indicates whether the policy is disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * Indicates whether the snapshot data is backed up to the backup vault.
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * The retention period of the backup data. Unit: day.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * The ID of the policy.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified by `{startTime}` and the subsequent backup jobs at an interval that is specified by `{interval}`. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, `I|1631685600|P1D` indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
             * <p>
             * 
             * *   `startTime`: the time at which the system starts to run a backup job. The value is a UNIX timestamp. Unit: seconds.
             * *   `interval`: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Rule")
        private java.util.List < Rule> rule;

        private Rules(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public java.util.List < Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List < Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class TrialInfo extends TeaModel {
        @NameInMap("KeepAfterTrialExpiration")
        private Boolean keepAfterTrialExpiration;

        @NameInMap("TrialExpireTime")
        private Long trialExpireTime;

        @NameInMap("TrialStartTime")
        private Long trialStartTime;

        @NameInMap("TrialVaultReleaseTime")
        private Long trialVaultReleaseTime;

        private TrialInfo(Builder builder) {
            this.keepAfterTrialExpiration = builder.keepAfterTrialExpiration;
            this.trialExpireTime = builder.trialExpireTime;
            this.trialStartTime = builder.trialStartTime;
            this.trialVaultReleaseTime = builder.trialVaultReleaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrialInfo create() {
            return builder().build();
        }

        /**
         * @return keepAfterTrialExpiration
         */
        public Boolean getKeepAfterTrialExpiration() {
            return this.keepAfterTrialExpiration;
        }

        /**
         * @return trialExpireTime
         */
        public Long getTrialExpireTime() {
            return this.trialExpireTime;
        }

        /**
         * @return trialStartTime
         */
        public Long getTrialStartTime() {
            return this.trialStartTime;
        }

        /**
         * @return trialVaultReleaseTime
         */
        public Long getTrialVaultReleaseTime() {
            return this.trialVaultReleaseTime;
        }

        public static final class Builder {
            private Boolean keepAfterTrialExpiration; 
            private Long trialExpireTime; 
            private Long trialStartTime; 
            private Long trialVaultReleaseTime; 

            /**
             * Indicates whether you are billed based on the pay-as-you-go method after the free trial ends.
             */
            public Builder keepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
                this.keepAfterTrialExpiration = keepAfterTrialExpiration;
                return this;
            }

            /**
             * The expiration time of the free trial.
             */
            public Builder trialExpireTime(Long trialExpireTime) {
                this.trialExpireTime = trialExpireTime;
                return this;
            }

            /**
             * The start time of the free trial.
             */
            public Builder trialStartTime(Long trialStartTime) {
                this.trialStartTime = trialStartTime;
                return this;
            }

            /**
             * The time when the free-trial backup vault was released.
             */
            public Builder trialVaultReleaseTime(Long trialVaultReleaseTime) {
                this.trialVaultReleaseTime = trialVaultReleaseTime;
                return this;
            }

            public TrialInfo build() {
                return new TrialInfo(this);
            } 

        } 

    }
    public static class BackupPlan extends TeaModel {
        @NameInMap("BackupSourceGroupId")
        private String backupSourceGroupId;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("ChangeListPath")
        private String changeListPath;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        private String crossAccountType;

        @NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("DestDataSourceDetail")
        private String destDataSourceDetail;

        @NameInMap("DestDataSourceId")
        private String destDataSourceId;

        @NameInMap("DestSourceType")
        private String destSourceType;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("Exclude")
        private String exclude;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("Include")
        private String include;

        @NameInMap("InstanceGroupId")
        private String instanceGroupId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("KeepLatestSnapshots")
        private Long keepLatestSnapshots;

        @NameInMap("LatestExecuteJobId")
        private String latestExecuteJobId;

        @NameInMap("Options")
        private String options;

        @NameInMap("OtsDetail")
        private OtsDetail otsDetail;

        @NameInMap("Paths")
        private Paths paths;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("PlanName")
        private String planName;

        @NameInMap("Prefix")
        private String prefix;

        @NameInMap("Resources")
        private Resources resources;

        @NameInMap("Retention")
        private Long retention;

        @NameInMap("Rules")
        private Rules rules;

        @NameInMap("Schedule")
        private String schedule;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("SpeedLimit")
        private String speedLimit;

        @NameInMap("TrialInfo")
        private TrialInfo trialInfo;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("VaultId")
        private String vaultId;

        private BackupPlan(Builder builder) {
            this.backupSourceGroupId = builder.backupSourceGroupId;
            this.backupType = builder.backupType;
            this.bucket = builder.bucket;
            this.changeListPath = builder.changeListPath;
            this.clientId = builder.clientId;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.createdTime = builder.createdTime;
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
            this.dataSourceId = builder.dataSourceId;
            this.destDataSourceDetail = builder.destDataSourceDetail;
            this.destDataSourceId = builder.destDataSourceId;
            this.destSourceType = builder.destSourceType;
            this.detail = builder.detail;
            this.disabled = builder.disabled;
            this.exclude = builder.exclude;
            this.fileSystemId = builder.fileSystemId;
            this.include = builder.include;
            this.instanceGroupId = builder.instanceGroupId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.keepLatestSnapshots = builder.keepLatestSnapshots;
            this.latestExecuteJobId = builder.latestExecuteJobId;
            this.options = builder.options;
            this.otsDetail = builder.otsDetail;
            this.paths = builder.paths;
            this.planId = builder.planId;
            this.planName = builder.planName;
            this.prefix = builder.prefix;
            this.resources = builder.resources;
            this.retention = builder.retention;
            this.rules = builder.rules;
            this.schedule = builder.schedule;
            this.sourceType = builder.sourceType;
            this.speedLimit = builder.speedLimit;
            this.trialInfo = builder.trialInfo;
            this.updatedTime = builder.updatedTime;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPlan create() {
            return builder().build();
        }

        /**
         * @return backupSourceGroupId
         */
        public String getBackupSourceGroupId() {
            return this.backupSourceGroupId;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return changeListPath
         */
        public String getChangeListPath() {
            return this.changeListPath;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return crossAccountRoleName
         */
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        /**
         * @return crossAccountType
         */
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        /**
         * @return crossAccountUserId
         */
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return destDataSourceDetail
         */
        public String getDestDataSourceDetail() {
            return this.destDataSourceDetail;
        }

        /**
         * @return destDataSourceId
         */
        public String getDestDataSourceId() {
            return this.destDataSourceId;
        }

        /**
         * @return destSourceType
         */
        public String getDestSourceType() {
            return this.destSourceType;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return exclude
         */
        public String getExclude() {
            return this.exclude;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return include
         */
        public String getInclude() {
            return this.include;
        }

        /**
         * @return instanceGroupId
         */
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return keepLatestSnapshots
         */
        public Long getKeepLatestSnapshots() {
            return this.keepLatestSnapshots;
        }

        /**
         * @return latestExecuteJobId
         */
        public String getLatestExecuteJobId() {
            return this.latestExecuteJobId;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return otsDetail
         */
        public OtsDetail getOtsDetail() {
            return this.otsDetail;
        }

        /**
         * @return paths
         */
        public Paths getPaths() {
            return this.paths;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return resources
         */
        public Resources getResources() {
            return this.resources;
        }

        /**
         * @return retention
         */
        public Long getRetention() {
            return this.retention;
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return speedLimit
         */
        public String getSpeedLimit() {
            return this.speedLimit;
        }

        /**
         * @return trialInfo
         */
        public TrialInfo getTrialInfo() {
            return this.trialInfo;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private String backupSourceGroupId; 
            private String backupType; 
            private String bucket; 
            private String changeListPath; 
            private String clientId; 
            private String clusterId; 
            private Long createTime; 
            private Long createdTime; 
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 
            private String dataSourceId; 
            private String destDataSourceDetail; 
            private String destDataSourceId; 
            private String destSourceType; 
            private String detail; 
            private Boolean disabled; 
            private String exclude; 
            private String fileSystemId; 
            private String include; 
            private String instanceGroupId; 
            private String instanceId; 
            private String instanceName; 
            private Long keepLatestSnapshots; 
            private String latestExecuteJobId; 
            private String options; 
            private OtsDetail otsDetail; 
            private Paths paths; 
            private String planId; 
            private String planName; 
            private String prefix; 
            private Resources resources; 
            private Long retention; 
            private Rules rules; 
            private String schedule; 
            private String sourceType; 
            private String speedLimit; 
            private TrialInfo trialInfo; 
            private Long updatedTime; 
            private String vaultId; 

            /**
             * The ID of the data source group for backup.
             */
            public Builder backupSourceGroupId(String backupSourceGroupId) {
                this.backupSourceGroupId = backupSourceGroupId;
                return this;
            }

            /**
             * The backup type. Only **COMPLETE** may be returned, which indicates full backup.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **OSS**. This parameter indicates the name of the OSS bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * ChangeListPath.
             */
            public Builder changeListPath(String changeListPath) {
                this.changeListPath = changeListPath;
                return this;
            }

            /**
             * The ID of a backup client.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The ID of the client group.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **NAS**. This parameter indicates the time when the file system was created. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the backup plan was created. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:
             * <p>
             * 
             * *   SELF_ACCOUNT
             * *   CROSS_ACCOUNT
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * The ID of the data source.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * The data source details at the destination. This parameter is required only for data synchronization.
             */
            public Builder destDataSourceDetail(String destDataSourceDetail) {
                this.destDataSourceDetail = destDataSourceDetail;
                return this;
            }

            /**
             * The data source ID at the destination. This parameter is required only for data synchronization.
             */
            public Builder destDataSourceId(String destDataSourceId) {
                this.destDataSourceId = destDataSourceId;
                return this;
            }

            /**
             * The data source type at the destination. This parameter is required only for data synchronization.
             */
            public Builder destSourceType(String destSourceType) {
                this.destSourceType = destSourceType;
                return this;
            }

            /**
             * The details about ECS instance backup.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Indicates whether the backup plan is disabled. Valid values:
             * <p>
             * 
             * *   true: The backup plan is disabled.
             * *   false: The backup plan is enabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **ECS_FILE**. This parameter indicates the paths to the files that are excluded from the backup job.
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **NAS**. This parameter indicates the ID of the NAS file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **ECS_FILE**. This parameter indicates the paths to the files that are backed up.
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * The ID of the group to which the instance belongs.
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **ECS_FILE**. This parameter indicates the ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the Tablestore instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Indicates whether the feature of keeping at least one backup version is enabled. Valid values:
             * <p>
             * 
             * *   0: The feature is disabled.
             * *   1: The feature is enabled.
             */
            public Builder keepLatestSnapshots(Long keepLatestSnapshots) {
                this.keepLatestSnapshots = keepLatestSnapshots;
                return this;
            }

            /**
             * LatestExecuteJobId.
             */
            public Builder latestExecuteJobId(String latestExecuteJobId) {
                this.latestExecuteJobId = latestExecuteJobId;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **ECS_FILE**. This parameter indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a source path.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * The details about the Tablestore instance.
             */
            public Builder otsDetail(OtsDetail otsDetail) {
                this.otsDetail = otsDetail;
                return this;
            }

            /**
             * The source paths. This parameter is valid only if **SourceType** is set to **ECS_FILE**.
             */
            public Builder paths(Paths paths) {
                this.paths = paths;
                return this;
            }

            /**
             * The ID of the backup plan.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * The name of the backup plan.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **OSS**. This parameter indicates the prefix of objects that are backed up.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * The backup resources. This parameter is valid only for disk backup.
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The retention period of the backup data. Unit: day.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * The backup policies. This parameter is valid only for disk backup.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified by `{startTime}` and the subsequent backup jobs at an interval that is specified by `{interval}`. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is complete. For example, `I|1631685600|P1D` indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
             * <p>
             * 
             * *   **startTime**: the time at which the system starts to run a backup job. The value is a UNIX timestamp. Unit: seconds.
             * *   **interval**: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   **ECS_FILE**: ECS files
             * *   **OSS**: OSS buckets
             * *   **NAS**: NAS file systems
             * *   **OTS**: Tablestore instances
             * *   **UDM_ECS**: ECS instances
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * This parameter is valid only if **SourceType** is set to **ECS_FILE**. This parameter indicates the throttling rules. Format: `{start}|{end}|{bandwidth}`. Multiple throttling rules are separated with vertical bars (`|`). A time range cannot overlap with another one.
             * <p>
             * 
             * *   start: the start hour.
             * *   end: the end hour.
             * *   bandwidth: the bandwidth. Unit: KB/s.
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            /**
             * The free trial information.
             */
            public Builder trialInfo(TrialInfo trialInfo) {
                this.trialInfo = trialInfo;
                return this;
            }

            /**
             * The time when the backup plan was updated. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * The ID of the backup vault.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public BackupPlan build() {
                return new BackupPlan(this);
            } 

        } 

    }
    public static class BackupPlans extends TeaModel {
        @NameInMap("BackupPlan")
        private java.util.List < BackupPlan> backupPlan;

        private BackupPlans(Builder builder) {
            this.backupPlan = builder.backupPlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPlans create() {
            return builder().build();
        }

        /**
         * @return backupPlan
         */
        public java.util.List < BackupPlan> getBackupPlan() {
            return this.backupPlan;
        }

        public static final class Builder {
            private java.util.List < BackupPlan> backupPlan; 

            /**
             * BackupPlan.
             */
            public Builder backupPlan(java.util.List < BackupPlan> backupPlan) {
                this.backupPlan = backupPlan;
                return this;
            }

            public BackupPlans build() {
                return new BackupPlans(this);
            } 

        } 

    }
}
