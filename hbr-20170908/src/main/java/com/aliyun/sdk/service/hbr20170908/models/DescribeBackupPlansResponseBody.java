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
         * BackupPlans.
         */
        public Builder backupPlans(BackupPlans backupPlans) {
            this.backupPlans = backupPlans;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
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
             * TableNames.
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
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * SourceType.
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
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * DestinationRegionId.
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * DestinationRetention.
             */
            public Builder destinationRetention(Long destinationRetention) {
                this.destinationRetention = destinationRetention;
                return this;
            }

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * DoCopy.
             */
            public Builder doCopy(Boolean doCopy) {
                this.doCopy = doCopy;
                return this;
            }

            /**
             * Retention.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Schedule.
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
             * KeepAfterTrialExpiration.
             */
            public Builder keepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
                this.keepAfterTrialExpiration = keepAfterTrialExpiration;
                return this;
            }

            /**
             * TrialExpireTime.
             */
            public Builder trialExpireTime(Long trialExpireTime) {
                this.trialExpireTime = trialExpireTime;
                return this;
            }

            /**
             * TrialStartTime.
             */
            public Builder trialStartTime(Long trialStartTime) {
                this.trialStartTime = trialStartTime;
                return this;
            }

            /**
             * TrialVaultReleaseTime.
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

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("DataSourceId")
        private String dataSourceId;

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
            this.clientId = builder.clientId;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.createdTime = builder.createdTime;
            this.dataSourceId = builder.dataSourceId;
            this.detail = builder.detail;
            this.disabled = builder.disabled;
            this.exclude = builder.exclude;
            this.fileSystemId = builder.fileSystemId;
            this.include = builder.include;
            this.instanceGroupId = builder.instanceGroupId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
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
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
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
            private String clientId; 
            private String clusterId; 
            private Long createTime; 
            private Long createdTime; 
            private String dataSourceId; 
            private String detail; 
            private Boolean disabled; 
            private String exclude; 
            private String fileSystemId; 
            private String include; 
            private String instanceGroupId; 
            private String instanceId; 
            private String instanceName; 
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
             * BackupSourceGroupId.
             */
            public Builder backupSourceGroupId(String backupSourceGroupId) {
                this.backupSourceGroupId = backupSourceGroupId;
                return this;
            }

            /**
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * Exclude.
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * Include.
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * InstanceGroupId.
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * OtsDetail.
             */
            public Builder otsDetail(OtsDetail otsDetail) {
                this.otsDetail = otsDetail;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(Paths paths) {
                this.paths = paths;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * PlanName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * Prefix.
             */
            public Builder prefix(String prefix) {
                this.prefix = prefix;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * Retention.
             */
            public Builder retention(Long retention) {
                this.retention = retention;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * Schedule.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SpeedLimit.
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            /**
             * TrialInfo.
             */
            public Builder trialInfo(TrialInfo trialInfo) {
                this.trialInfo = trialInfo;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * VaultId.
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
