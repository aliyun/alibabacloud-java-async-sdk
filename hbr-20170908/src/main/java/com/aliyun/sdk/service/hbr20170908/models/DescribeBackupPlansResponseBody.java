// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlansResponseBody</p>
 */
public class DescribeBackupPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupPlans")
    private BackupPlans backupPlans;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The queried backup plans.</p>
         */
        public Builder backupPlans(BackupPlans backupPlans) {
            this.backupPlans = backupPlans;
            return this;
        }

        /**
         * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned backup plans that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBackupPlansResponseBody build() {
            return new DescribeBackupPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class TableNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class OtsDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableNames")
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
             * <p>The names of the tables in the Tablestore instance.</p>
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class Paths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
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
             * <p>Additional information about the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;doBackup&quot;:false,&quot;diskName&quot;:&quot;data_disk&quot;,&quot;size&quot;:100,&quot;type&quot;:&quot;data&quot;,&quot;category&quot;:&quot;cloud_essd&quot;,&quot;imageId&quot;:&quot;&quot;,&quot;device&quot;:&quot;/dev/xvdb&quot;,&quot;encrypted&quot;:false}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>d-j6cgioir6m******lu4</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the data source. Valid value: <strong>UDM_DISK</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>UDMDISK</p>
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
        private String destinationRegionId;

        @com.aliyun.core.annotation.NameInMap("DestinationRetention")
        private Long destinationRetention;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("DoCopy")
        private Boolean doCopy;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Schedule")
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
             * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The ID of the region in which the remote backup vault resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * <p>The retention period of the backup data in remote backup mode. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * <p>Indicates whether the policy is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>Indicates whether the snapshot data is backed up to the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * <p>The retention period of the backup data. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-0008i52rf0ulpni6kn6m</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>Disk Golden Rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified by <code>{startTime}</code> and the subsequent backup jobs at an interval that is specified by <code>{interval}</code>. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
             * <ul>
             * <li><code>startTime</code>: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
             * <li><code>interval</code>: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>I|1631685600|P1D</p>
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class TrialInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeepAfterTrialExpiration")
        private Boolean keepAfterTrialExpiration;

        @com.aliyun.core.annotation.NameInMap("TrialExpireTime")
        private Long trialExpireTime;

        @com.aliyun.core.annotation.NameInMap("TrialStartTime")
        private Long trialStartTime;

        @com.aliyun.core.annotation.NameInMap("TrialVaultReleaseTime")
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
             * <p>Indicates whether you are billed based on the pay-as-you-go method after the free trial ends.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder keepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
                this.keepAfterTrialExpiration = keepAfterTrialExpiration;
                return this;
            }

            /**
             * <p>The expiration time of the free trial.</p>
             * 
             * <strong>example:</strong>
             * <p>1584597600</p>
             */
            public Builder trialExpireTime(Long trialExpireTime) {
                this.trialExpireTime = trialExpireTime;
                return this;
            }

            /**
             * <p>The start time of the free trial.</p>
             * 
             * <strong>example:</strong>
             * <p>1579413159</p>
             */
            public Builder trialStartTime(Long trialStartTime) {
                this.trialStartTime = trialStartTime;
                return this;
            }

            /**
             * <p>The time when the free-trial backup vault is released.</p>
             * 
             * <strong>example:</strong>
             * <p>1594965600</p>
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class BackupPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSourceGroupId")
        private String backupSourceGroupId;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("ChangeListPath")
        private String changeListPath;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DestDataSourceDetail")
        private String destDataSourceDetail;

        @com.aliyun.core.annotation.NameInMap("DestDataSourceId")
        private String destDataSourceId;

        @com.aliyun.core.annotation.NameInMap("DestSourceType")
        private String destSourceType;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("Include")
        private String include;

        @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
        private String instanceGroupId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("KeepLatestSnapshots")
        private Long keepLatestSnapshots;

        @com.aliyun.core.annotation.NameInMap("LatestExecuteJobId")
        private String latestExecuteJobId;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("OtsDetail")
        private OtsDetail otsDetail;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private Paths paths;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("Prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private Resources resources;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Long retention;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private Rules rules;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SpeedLimit")
        private String speedLimit;

        @com.aliyun.core.annotation.NameInMap("TrialInfo")
        private TrialInfo trialInfo;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("VaultId")
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
             * <p>The ID of the data source group.</p>
             * 
             * <strong>example:</strong>
             * <p>System-Database</p>
             */
            public Builder backupSourceGroupId(String backupSourceGroupId) {
                this.backupSourceGroupId = backupSourceGroupId;
                return this;
            }

            /**
             * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>OSS</strong>. This parameter indicates the name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>hbr-backup-oss</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The configurations of the incremental file synchronization. This parameter is returned only for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dataSourceId&quot;: &quot;ds-123456789&quot;, &quot;path&quot;: &quot;/changelist&quot;}</p>
             */
            public Builder changeListPath(String changeListPath) {
                this.changeListPath = changeListPath;
                return this;
            }

            /**
             * <p>The ID of the backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>c-000ge4w*****1qb</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The ID of the client group.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-000ht6o9******h</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>NAS</strong>. This parameter indicates the time when the file system was created. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the backup plan was created. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>BackupRole</p>
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * <p>Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
             * <ul>
             * <li>SELF_ACCOUNT</li>
             * <li>CROSS_ACCOUNT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CROSS_ACCOUNT</p>
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>1841642xxxxx9795</p>
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * <p>The ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-000ht6o9*****w61</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>The data source details at the destination. This parameter is returned only for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;prefix&quot;:&quot;/&quot;}</p>
             */
            public Builder destDataSourceDetail(String destDataSourceDetail) {
                this.destDataSourceDetail = destDataSourceDetail;
                return this;
            }

            /**
             * <p>The data source ID at the destination. This parameter is returned only for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-*********************</p>
             */
            public Builder destDataSourceId(String destDataSourceId) {
                this.destDataSourceId = destDataSourceId;
                return this;
            }

            /**
             * <p>The data source type at the destination. This parameter is returned only for data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder destSourceType(String destSourceType) {
                this.destSourceType = destSourceType;
                return this;
            }

            /**
             * <p>The details about ECS instance backup.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;doCopy&quot;:true,&quot;doBackup&quot;:false,&quot;instanceName&quot;:&quot;instance example&quot;,&quot;appConsistent&quot;:false,&quot;destinationRegionId&quot;:&quot;cn-shanghai&quot;,&quot;enableFsFreeze&quot;:true,&quot;osNameEn&quot;:&quot;Windows Server  2019 Data Center Edition 64bit Chinese Edition&quot;,&quot;osName&quot;:&quot;Windows Server  2019 Data Center Edition 64bit Chinese Edition&quot;,&quot;diskIdList&quot;:[],&quot;backupVaultId&quot;:&quot;&quot;,&quot;snapshotGroup&quot;:true,&quot;destinationRetention&quot;:35,&quot;platform&quot;:&quot;Windows Server 2012&quot;,&quot;timeoutInSeconds&quot;:60,&quot;backupRetention&quot;:1,&quot;osType&quot;:&quot;windows&quot;,&quot;preScriptPath&quot;:&quot;&quot;,&quot;postScriptPath&quot;:&quot;&quot;,&quot;enableWriters&quot;:true,&quot;ecsDeleted&quot;:false}</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>Indicates whether the backup plan is disabled. Valid values:</p>
             * <ul>
             * <li>true: The backup plan is disabled.</li>
             * <li>false: The backup plan is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter indicates the paths to the files that are excluded from the backup job.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>NAS</strong>. This parameter indicates the ID of the NAS file system.</p>
             * 
             * <strong>example:</strong>
             * <p>00594</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter indicates the paths to the files that are backed up.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>The ID of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>i-**</p>
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter indicates the ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-*********************</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the Tablestore instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instancename</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Indicates whether the feature of keeping at least one backup version is enabled. Valid values:</p>
             * <ul>
             * <li>0: The feature is disabled.</li>
             * <li>1: The feature is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder keepLatestSnapshots(Long keepLatestSnapshots) {
                this.keepLatestSnapshots = keepLatestSnapshots;
                return this;
            }

            /**
             * <p>The latest execution job id of plan.</p>
             * 
             * <strong>example:</strong>
             * <p>job-12345678</p>
             */
            public Builder latestExecuteJobId(String latestExecuteJobId) {
                this.latestExecuteJobId = latestExecuteJobId;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a source path.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;UseVSS&quot;:false}</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The details about the Tablestore instance.</p>
             */
            public Builder otsDetail(OtsDetail otsDetail) {
                this.otsDetail = otsDetail;
                return this;
            }

            /**
             * <p>The source paths. This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>.</p>
             */
            public Builder paths(Paths paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The ID of the backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-*********************</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The name of the backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planname</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>OSS</strong>. This parameter indicates the prefix of the objects that are backed up.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-prefix</p>
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * <p>The backup resources. This parameter is valid only for disk backup.</p>
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The retention period of the backup data. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The backup policies. This parameter is valid only for disk backup.</p>
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified by <code>{startTime}</code> and the subsequent backup jobs at an interval that is specified by <code>{interval}</code>. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
             * <ul>
             * <li><strong>startTime</strong>: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
             * <li><strong>interval</strong>: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>I|1602673264|P1D</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><strong>ECS_FILE</strong>: ECS files</li>
             * <li><strong>OSS</strong>: OSS buckets</li>
             * <li><strong>NAS</strong>: NAS file systems</li>
             * <li><strong>OTS</strong>: Tablestore instances</li>
             * <li><strong>UDM_ECS</strong>: ECS instances</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS_FILE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>. This parameter indicates the throttling rules. Format: <code>{start}|{end}|{bandwidth}</code>. Multiple throttling rules are separated with vertical bars (<code>|</code>). A time range cannot overlap with another one.</p>
             * <ul>
             * <li>start: the start hour.</li>
             * <li>end: the end hour.</li>
             * <li>bandwidth: the bandwidth. Unit: KB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0:24:5120</p>
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            /**
             * <p>The free trial information.</p>
             */
            public Builder trialInfo(TrialInfo trialInfo) {
                this.trialInfo = trialInfo;
                return this;
            }

            /**
             * <p>The time when the backup plan was updated. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>The ID of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>v-*********************</p>
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
    /**
     * 
     * {@link DescribeBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPlansResponseBody</p>
     */
    public static class BackupPlans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupPlan")
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
