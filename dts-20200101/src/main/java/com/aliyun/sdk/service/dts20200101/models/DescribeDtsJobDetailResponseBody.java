// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsJobDetailResponseBody</p>
 */
public class DescribeDtsJobDetailResponseBody extends TeaModel {
    @NameInMap("AppName")
    private String appName;

    @NameInMap("BeginTimestamp")
    private String beginTimestamp;

    @NameInMap("Binlog")
    private String binlog;

    @NameInMap("BinlogSite")
    private String binlogSite;

    @NameInMap("BinlogTime")
    private String binlogTime;

    @NameInMap("BootTime")
    private String bootTime;

    @NameInMap("Checkpoint")
    private Long checkpoint;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("ConsumptionCheckpoint")
    private String consumptionCheckpoint;

    @NameInMap("ConsumptionClient")
    private String consumptionClient;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DataDeliveryChannelInfo")
    private DataDeliveryChannelInfo dataDeliveryChannelInfo;

    @NameInMap("DataSynchronizationStatus")
    private DataSynchronizationStatus dataSynchronizationStatus;

    @NameInMap("DatabaseCount")
    private Integer databaseCount;

    @NameInMap("DbObject")
    private String dbObject;

    @NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @NameInMap("Delay")
    private Long delay;

    @NameInMap("DemoJob")
    private Boolean demoJob;

    @NameInMap("DestNetType")
    private String destNetType;

    @NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @NameInMap("DtsBisLabel")
    private String dtsBisLabel;

    @NameInMap("DtsInstanceID")
    private String dtsInstanceID;

    @NameInMap("DtsJobClass")
    private String dtsJobClass;

    @NameInMap("DtsJobDirection")
    private String dtsJobDirection;

    @NameInMap("DtsJobId")
    private String dtsJobId;

    @NameInMap("DtsJobName")
    private String dtsJobName;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("EndTimestamp")
    private String endTimestamp;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("EtlCalculator")
    private String etlCalculator;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("FinishTime")
    private String finishTime;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("JobType")
    private String jobType;

    @NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @NameInMap("MigrationMode")
    private MigrationMode migrationMode;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Reserved")
    private String reserved;

    @NameInMap("ResourceGroupDisplayName")
    private String resourceGroupDisplayName;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("RetryState")
    private RetryState retryState;

    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubDistributedJob")
    private java.util.List < SubDistributedJob> subDistributedJob;

    @NameInMap("SubSyncJob")
    private java.util.List < SubSyncJob> subSyncJob;

    @NameInMap("SubscribeTopic")
    private String subscribeTopic;

    @NameInMap("SubscriptionDataType")
    private SubscriptionDataType subscriptionDataType;

    @NameInMap("SubscriptionHost")
    private SubscriptionHost subscriptionHost;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @NameInMap("TaskType")
    private String taskType;

    private DescribeDtsJobDetailResponseBody(Builder builder) {
        this.appName = builder.appName;
        this.beginTimestamp = builder.beginTimestamp;
        this.binlog = builder.binlog;
        this.binlogSite = builder.binlogSite;
        this.binlogTime = builder.binlogTime;
        this.bootTime = builder.bootTime;
        this.checkpoint = builder.checkpoint;
        this.code = builder.code;
        this.consumptionCheckpoint = builder.consumptionCheckpoint;
        this.consumptionClient = builder.consumptionClient;
        this.createTime = builder.createTime;
        this.dataDeliveryChannelInfo = builder.dataDeliveryChannelInfo;
        this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
        this.databaseCount = builder.databaseCount;
        this.dbObject = builder.dbObject;
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.delay = builder.delay;
        this.demoJob = builder.demoJob;
        this.destNetType = builder.destNetType;
        this.destinationEndpoint = builder.destinationEndpoint;
        this.dtsBisLabel = builder.dtsBisLabel;
        this.dtsInstanceID = builder.dtsInstanceID;
        this.dtsJobClass = builder.dtsJobClass;
        this.dtsJobDirection = builder.dtsJobDirection;
        this.dtsJobId = builder.dtsJobId;
        this.dtsJobName = builder.dtsJobName;
        this.dynamicMessage = builder.dynamicMessage;
        this.endTimestamp = builder.endTimestamp;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.errorMessage = builder.errorMessage;
        this.etlCalculator = builder.etlCalculator;
        this.expireTime = builder.expireTime;
        this.finishTime = builder.finishTime;
        this.groupId = builder.groupId;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobType = builder.jobType;
        this.lastUpdateTime = builder.lastUpdateTime;
        this.migrationMode = builder.migrationMode;
        this.payType = builder.payType;
        this.requestId = builder.requestId;
        this.reserved = builder.reserved;
        this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
        this.resourceGroupId = builder.resourceGroupId;
        this.retryState = builder.retryState;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.status = builder.status;
        this.subDistributedJob = builder.subDistributedJob;
        this.subSyncJob = builder.subSyncJob;
        this.subscribeTopic = builder.subscribeTopic;
        this.subscriptionDataType = builder.subscriptionDataType;
        this.subscriptionHost = builder.subscriptionHost;
        this.success = builder.success;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return beginTimestamp
     */
    public String getBeginTimestamp() {
        return this.beginTimestamp;
    }

    /**
     * @return binlog
     */
    public String getBinlog() {
        return this.binlog;
    }

    /**
     * @return binlogSite
     */
    public String getBinlogSite() {
        return this.binlogSite;
    }

    /**
     * @return binlogTime
     */
    public String getBinlogTime() {
        return this.binlogTime;
    }

    /**
     * @return bootTime
     */
    public String getBootTime() {
        return this.bootTime;
    }

    /**
     * @return checkpoint
     */
    public Long getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return consumptionCheckpoint
     */
    public String getConsumptionCheckpoint() {
        return this.consumptionCheckpoint;
    }

    /**
     * @return consumptionClient
     */
    public String getConsumptionClient() {
        return this.consumptionClient;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataDeliveryChannelInfo
     */
    public DataDeliveryChannelInfo getDataDeliveryChannelInfo() {
        return this.dataDeliveryChannelInfo;
    }

    /**
     * @return dataSynchronizationStatus
     */
    public DataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    /**
     * @return databaseCount
     */
    public Integer getDatabaseCount() {
        return this.databaseCount;
    }

    /**
     * @return dbObject
     */
    public String getDbObject() {
        return this.dbObject;
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return delay
     */
    public Long getDelay() {
        return this.delay;
    }

    /**
     * @return demoJob
     */
    public Boolean getDemoJob() {
        return this.demoJob;
    }

    /**
     * @return destNetType
     */
    public String getDestNetType() {
        return this.destNetType;
    }

    /**
     * @return destinationEndpoint
     */
    public DestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    /**
     * @return dtsBisLabel
     */
    public String getDtsBisLabel() {
        return this.dtsBisLabel;
    }

    /**
     * @return dtsInstanceID
     */
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    /**
     * @return dtsJobClass
     */
    public String getDtsJobClass() {
        return this.dtsJobClass;
    }

    /**
     * @return dtsJobDirection
     */
    public String getDtsJobDirection() {
        return this.dtsJobDirection;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return dtsJobName
     */
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return endTimestamp
     */
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return etlCalculator
     */
    public String getEtlCalculator() {
        return this.etlCalculator;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * @return migrationMode
     */
    public MigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reserved
     */
    public String getReserved() {
        return this.reserved;
    }

    /**
     * @return resourceGroupDisplayName
     */
    public String getResourceGroupDisplayName() {
        return this.resourceGroupDisplayName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return retryState
     */
    public RetryState getRetryState() {
        return this.retryState;
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subDistributedJob
     */
    public java.util.List < SubDistributedJob> getSubDistributedJob() {
        return this.subDistributedJob;
    }

    /**
     * @return subSyncJob
     */
    public java.util.List < SubSyncJob> getSubSyncJob() {
        return this.subSyncJob;
    }

    /**
     * @return subscribeTopic
     */
    public String getSubscribeTopic() {
        return this.subscribeTopic;
    }

    /**
     * @return subscriptionDataType
     */
    public SubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    /**
     * @return subscriptionHost
     */
    public SubscriptionHost getSubscriptionHost() {
        return this.subscriptionHost;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String appName; 
        private String beginTimestamp; 
        private String binlog; 
        private String binlogSite; 
        private String binlogTime; 
        private String bootTime; 
        private Long checkpoint; 
        private Integer code; 
        private String consumptionCheckpoint; 
        private String consumptionClient; 
        private String createTime; 
        private DataDeliveryChannelInfo dataDeliveryChannelInfo; 
        private DataSynchronizationStatus dataSynchronizationStatus; 
        private Integer databaseCount; 
        private String dbObject; 
        private String dedicatedClusterId; 
        private Long delay; 
        private Boolean demoJob; 
        private String destNetType; 
        private DestinationEndpoint destinationEndpoint; 
        private String dtsBisLabel; 
        private String dtsInstanceID; 
        private String dtsJobClass; 
        private String dtsJobDirection; 
        private String dtsJobId; 
        private String dtsJobName; 
        private String dynamicMessage; 
        private String endTimestamp; 
        private String errCode; 
        private String errMessage; 
        private String errorMessage; 
        private String etlCalculator; 
        private String expireTime; 
        private String finishTime; 
        private String groupId; 
        private Integer httpStatusCode; 
        private String jobType; 
        private String lastUpdateTime; 
        private MigrationMode migrationMode; 
        private String payType; 
        private String requestId; 
        private String reserved; 
        private String resourceGroupDisplayName; 
        private String resourceGroupId; 
        private RetryState retryState; 
        private SourceEndpoint sourceEndpoint; 
        private String status; 
        private java.util.List < SubDistributedJob> subDistributedJob; 
        private java.util.List < SubSyncJob> subSyncJob; 
        private String subscribeTopic; 
        private SubscriptionDataType subscriptionDataType; 
        private SubscriptionHost subscriptionHost; 
        private Boolean success; 
        private String synchronizationDirection; 
        private String taskType; 

        /**
         * The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder beginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }

        /**
         * Binlog.
         */
        public Builder binlog(String binlog) {
            this.binlog = binlog;
            return this;
        }

        /**
         * BinlogSite.
         */
        public Builder binlogSite(String binlogSite) {
            this.binlogSite = binlogSite;
            return this;
        }

        /**
         * BinlogTime.
         */
        public Builder binlogTime(String binlogTime) {
            this.binlogTime = binlogTime;
            return this;
        }

        /**
         * BootTime.
         */
        public Builder bootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking instance.
         */
        public Builder checkpoint(Long checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * The topic of the change tracking instance.
         * <p>
         * 
         * >  This parameter is returned only if your change tracking instances are of the new version and you have called the [CreateConsumerGroup](~~122863~~) operation to create a consumer group.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The downstream client information in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.
         */
        public Builder consumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder consumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }

        /**
         * The end time of the task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataDeliveryChannelInfo.
         */
        public Builder dataDeliveryChannelInfo(DataDeliveryChannelInfo dataDeliveryChannelInfo) {
            this.dataDeliveryChannelInfo = dataDeliveryChannelInfo;
            return this;
        }

        /**
         * DataSynchronizationStatus.
         */
        public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }

        /**
         * The point in time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder databaseCount(Integer databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder dbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }

        /**
         * DedicatedClusterId.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder delay(Long delay) {
            this.delay = delay;
            return this;
        }

        /**
         * DemoJob.
         */
        public Builder demoJob(Boolean demoJob) {
            this.demoJob = demoJob;
            return this;
        }

        /**
         * The instance class.
         * <p>
         * 
         * >  For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).
         */
        public Builder destNetType(String destNetType) {
            this.destNetType = destNetType;
            return this;
        }

        /**
         * The name of the database that contains the objects to be migrated from the source instance.
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * DtsBisLabel.
         */
        public Builder dtsBisLabel(String dtsBisLabel) {
            this.dtsBisLabel = dtsBisLabel;
            return this;
        }

        /**
         * Indicates whether the new change tracking feature is used.
         * <p>
         * 
         * >  This parameter is returned only for change tracking instances of the new version.
         */
        public Builder dtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         */
        public Builder dtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }

        /**
         * The beginning of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder dtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }

        /**
         * API test
         */
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The synchronization direction. Valid values:
         * <p>
         * 
         * *   **Forward**: Data is synchronized from the source database to the destination database.
         * *   **Reverse**: Data is synchronized from the destination database to the source database.
         * 
         * > 
         * *   Default value: **Forward**.
         * *   The value **Reverse** takes effect only if the topology of the data synchronization instance is two-way synchronization.
         */
        public Builder dtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
         */
        public Builder endTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * The start offset of incremental data migration or synchronization. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The point in time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         * <p>
         * 
         * >  This parameter is returned only if the return value of the **PayType** parameter is **PrePaid**.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The name of the data migration, data synchronization, or change tracking task.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The objects of the data migration, data synchronization, or change tracking task. For more information, see [Objects of DTS tasks](~~209545~~).
         */
        public Builder etlCalculator(String etlCalculator) {
            this.etlCalculator = etlCalculator;
            return this;
        }

        /**
         * The error code. This parameter will be removed in the future.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The state of the data migration or data synchronization task.
         * <p>
         * 
         * Valid values for a data migration task:
         * 
         * *   **NotStarted**: The migration is not started.
         * *   **Migrating**: The migration is in progress.
         * *   **Failed**: The migration failed.
         * *   **Finished**: The migration is complete.
         * 
         * Valid values for a data synchronization task:
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is in precheck.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **Initializing**: The task is performing initial synchronization.
         * *   **InitializeFailed**: Initial synchronization failed.
         * *   **Synchronizing**: The task is in progress.
         * *   **Failed**: The task failed to synchronize data.
         * *   **Suspending**: The task is paused.
         * *   **Modifying**: The objects in the task are being modified.
         * *   **Finished**: The task is complete.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * The operator information of the extract, transform, and load (ETL) task.
         * <p>
         * 
         * >  This parameter is returned only if you query the details of an ETL task.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace the \*\*%s\*\* variable in the **ErrMessage** parameter.
         * <p>
         * 
         * >  If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * LastUpdateTime.
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * The type of the destination instance.
         */
        public Builder migrationMode(MigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }

        /**
         * The error message returned if the task failed.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * The network type of the consumer client. Valid values:
         * <p>
         * 
         * *   **CLASSIC**: classic network
         * *   **VPC**: Virtual Private Cloud (VPC)
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking task.
         */
        public Builder reserved(String reserved) {
            this.reserved = reserved;
            return this;
        }

        /**
         * ResourceGroupDisplayName.
         */
        public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RetryState.
         */
        public Builder retryState(RetryState retryState) {
            this.retryState = retryState;
            return this;
        }

        /**
         * The ID of the DTS task.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking instance.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubDistributedJob.
         */
        public Builder subDistributedJob(java.util.List < SubDistributedJob> subDistributedJob) {
            this.subDistributedJob = subDistributedJob;
            return this;
        }

        /**
         * SubSyncJob.
         */
        public Builder subSyncJob(java.util.List < SubSyncJob> subSyncJob) {
            this.subSyncJob = subSyncJob;
            return this;
        }

        /**
         * The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder subscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }

        /**
         * The VPC endpoint of the change tracking instance in the `<Address>:<Port number>` format.
         */
        public Builder subscriptionDataType(SubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }

        /**
         * Indicates whether full data migration or synchronization is performed. Valid values:
         * <p>
         * 
         * *   **true**: Full data migration or synchronization is performed.
         * *   **false**: Full data migration or synchronization is not performed.
         */
        public Builder subscriptionHost(SubscriptionHost subscriptionHost) {
            this.subscriptionHost = subscriptionHost;
            return this;
        }

        /**
         * The latency of incremental data migration or synchronization.
         * <p>
         * 
         * >  If you query data migration tasks, the unit of this parameter is milliseconds. If you query data synchronization tasks, the unit of this parameter is seconds.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The status code returned.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public DescribeDtsJobDetailResponseBody build() {
            return new DescribeDtsJobDetailResponseBody(this);
        } 

    } 

    public static class DataDeliveryChannelInfo extends TeaModel {
        @NameInMap("PartitionNum")
        private Integer partitionNum;

        @NameInMap("PublicDproxyUrl")
        private String publicDproxyUrl;

        @NameInMap("Region")
        private String region;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("VpcDproxyUrl")
        private String vpcDproxyUrl;

        private DataDeliveryChannelInfo(Builder builder) {
            this.partitionNum = builder.partitionNum;
            this.publicDproxyUrl = builder.publicDproxyUrl;
            this.region = builder.region;
            this.topic = builder.topic;
            this.vpcDproxyUrl = builder.vpcDproxyUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDeliveryChannelInfo create() {
            return builder().build();
        }

        /**
         * @return partitionNum
         */
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        /**
         * @return publicDproxyUrl
         */
        public String getPublicDproxyUrl() {
            return this.publicDproxyUrl;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return vpcDproxyUrl
         */
        public String getVpcDproxyUrl() {
            return this.vpcDproxyUrl;
        }

        public static final class Builder {
            private Integer partitionNum; 
            private String publicDproxyUrl; 
            private String region; 
            private String topic; 
            private String vpcDproxyUrl; 

            /**
             * PartitionNum.
             */
            public Builder partitionNum(Integer partitionNum) {
                this.partitionNum = partitionNum;
                return this;
            }

            /**
             * PublicDproxyUrl.
             */
            public Builder publicDproxyUrl(String publicDproxyUrl) {
                this.publicDproxyUrl = publicDproxyUrl;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * VpcDproxyUrl.
             */
            public Builder vpcDproxyUrl(String vpcDproxyUrl) {
                this.vpcDproxyUrl = vpcDproxyUrl;
                return this;
            }

            public DataDeliveryChannelInfo build() {
                return new DataDeliveryChannelInfo(this);
            } 

        } 

    }
    public static class DataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSynchronizationStatus build() {
                return new DataSynchronizationStatus(this);
            } 

        } 

    }
    public static class DestinationEndpoint extends TeaModel {
        @NameInMap("CanModifyPassword")
        private Boolean canModifyPassword;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.canModifyPassword = builder.canModifyPassword;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return canModifyPassword
         */
        public Boolean getCanModifyPassword() {
            return this.canModifyPassword;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Boolean canModifyPassword; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * CanModifyPassword.
             */
            public Builder canModifyPassword(Boolean canModifyPassword) {
                this.canModifyPassword = canModifyPassword;
                return this;
            }

            /**
             * The connection settings of the destination instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database service port of the destination instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The name of the database that contains the migrated objects in the destination instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the destination instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The SID of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the destination instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The username of the account that is used to connect to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the region in which the destination instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the source ApsaraDB RDS instance belongs.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    public static class MigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private MigrationMode(Builder builder) {
            this.dataExtractTransformLoad = builder.dataExtractTransformLoad;
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataExtractTransformLoad
         */
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataExtractTransformLoad; 
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * The database account of the destination instance.
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * The database engine of the destination instance.
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * The migration types or synchronization types.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether data transformation is performed. Valid values:
             * <p>
             * 
             * *   **true**: Data transformation is performed.
             * *   **false**: Data transformation is not performed.
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public MigrationMode build() {
                return new MigrationMode(this);
            } 

        } 

    }
    public static class RetryState extends TeaModel {
        @NameInMap("ErrMessage")
        private String errMessage;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @NameInMap("Module")
        private String module;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("RetryTarget")
        private String retryTarget;

        @NameInMap("RetryTime")
        private Integer retryTime;

        @NameInMap("Retrying")
        private Boolean retrying;

        private RetryState(Builder builder) {
            this.errMessage = builder.errMessage;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryState create() {
            return builder().build();
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryTarget
         */
        public String getRetryTarget() {
            return this.retryTarget;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return retrying
         */
        public Boolean getRetrying() {
            return this.retrying;
        }

        public static final class Builder {
            private String errMessage; 
            private String jobId; 
            private Integer maxRetryTime; 
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            /**
             * The point in time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **PayType** parameter is **PrePaid**.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MaxRetryTime.
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * RetryTarget.
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * RetryTime.
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * Retrying.
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public RetryState build() {
                return new RetryState(this);
            } 

        } 

    }
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("CanModifyPassword")
        private Boolean canModifyPassword;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.canModifyPassword = builder.canModifyPassword;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return canModifyPassword
         */
        public Boolean getCanModifyPassword() {
            return this.canModifyPassword;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private Boolean canModifyPassword; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * CanModifyPassword.
             */
            public Builder canModifyPassword(Boolean canModifyPassword) {
                this.canModifyPassword = canModifyPassword;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
    public static class DataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DataEtlStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEtlStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataEtlStatus build() {
                return new DataEtlStatus(this);
            } 

        } 

    }
    public static class DataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataInitializationStatus build() {
                return new DataInitializationStatus(this);
            } 

        } 

    }
    public static class SubDistributedJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubDistributedJobDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobDataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubDistributedJobDataSynchronizationStatus build() {
                return new SubDistributedJobDataSynchronizationStatus(this);
            } 

        } 

    }
    public static class SubDistributedJobDestinationEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private SubDistributedJobDestinationEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobDestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SubDistributedJobDestinationEndpoint build() {
                return new SubDistributedJobDestinationEndpoint(this);
            } 

        } 

    }
    public static class SubDistributedJobMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private SubDistributedJobMigrationMode(Builder builder) {
            this.dataExtractTransformLoad = builder.dataExtractTransformLoad;
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobMigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataExtractTransformLoad
         */
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataExtractTransformLoad; 
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * The database account of the destination instance.
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * The database engine of the destination instance.
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * The migration types or synchronization types.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether data transformation is performed. Valid values:
             * <p>
             * 
             * *   **true**: Data transformation is performed.
             * *   **false**: Data transformation is not performed.
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public SubDistributedJobMigrationMode build() {
                return new SubDistributedJobMigrationMode(this);
            } 

        } 

    }
    public static class Performance extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("Rps")
        private String rps;

        private Performance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * Rps.
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public Performance build() {
                return new Performance(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private Detail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            /**
             * CheckItem.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * CheckItemDescription.
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * CheckResult.
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * FailedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * RepairMethod.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class PrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < Detail> detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private PrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrecheckStatus build() {
                return new PrecheckStatus(this);
            } 

        } 

    }
    public static class SubDistributedJobRetryState extends TeaModel {
        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @NameInMap("Module")
        private String module;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("RetryTarget")
        private String retryTarget;

        @NameInMap("RetryTime")
        private Integer retryTime;

        @NameInMap("Retrying")
        private Boolean retrying;

        private SubDistributedJobRetryState(Builder builder) {
            this.errMsg = builder.errMsg;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobRetryState create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryTarget
         */
        public String getRetryTarget() {
            return this.retryTarget;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return retrying
         */
        public Boolean getRetrying() {
            return this.retrying;
        }

        public static final class Builder {
            private String errMsg; 
            private String jobId; 
            private Integer maxRetryTime; 
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MaxRetryTime.
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * srcDB/destDB/metaDB/dstore
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * RetryTime.
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * Retrying.
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public SubDistributedJobRetryState build() {
                return new SubDistributedJobRetryState(this);
            } 

        } 

    }
    public static class ReverseJobDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobDataEtlStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDataEtlStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobDataEtlStatus build() {
                return new ReverseJobDataEtlStatus(this);
            } 

        } 

    }
    public static class ReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobDataInitializationStatus build() {
                return new ReverseJobDataInitializationStatus(this);
            } 

        } 

    }
    public static class ReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobDataSynchronizationStatus build() {
                return new ReverseJobDataSynchronizationStatus(this);
            } 

        } 

    }
    public static class ReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private ReverseJobDestinationEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobDestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ReverseJobDestinationEndpoint build() {
                return new ReverseJobDestinationEndpoint(this);
            } 

        } 

    }
    public static class ReverseJobMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private ReverseJobMigrationMode(Builder builder) {
            this.dataExtractTransformLoad = builder.dataExtractTransformLoad;
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobMigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataExtractTransformLoad
         */
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataExtractTransformLoad; 
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * The database account of the destination instance.
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * The database engine of the destination instance.
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * The migration types or synchronization types.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether data transformation is performed. Valid values:
             * <p>
             * 
             * *   **true**: Data transformation is performed.
             * *   **false**: Data transformation is not performed.
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public ReverseJobMigrationMode build() {
                return new ReverseJobMigrationMode(this);
            } 

        } 

    }
    public static class ReverseJobPerformance extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("Rps")
        private String rps;

        private ReverseJobPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPerformance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * Rps.
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public ReverseJobPerformance build() {
                return new ReverseJobPerformance(this);
            } 

        } 

    }
    public static class PrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private PrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatusDetail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            /**
             * CheckItem.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * CheckItemDescription.
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * CheckResult.
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * FailedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * RepairMethod.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public PrecheckStatusDetail build() {
                return new PrecheckStatusDetail(this);
            } 

        } 

    }
    public static class ReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < PrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private ReverseJobPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < PrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < PrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < PrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobPrecheckStatus build() {
                return new ReverseJobPrecheckStatus(this);
            } 

        } 

    }
    public static class ReverseJobRetryState extends TeaModel {
        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @NameInMap("Module")
        private String module;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("RetryTarget")
        private String retryTarget;

        @NameInMap("RetryTime")
        private Integer retryTime;

        @NameInMap("Retrying")
        private Boolean retrying;

        private ReverseJobRetryState(Builder builder) {
            this.errMsg = builder.errMsg;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobRetryState create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryTarget
         */
        public String getRetryTarget() {
            return this.retryTarget;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return retrying
         */
        public Boolean getRetrying() {
            return this.retrying;
        }

        public static final class Builder {
            private String errMsg; 
            private String jobId; 
            private Integer maxRetryTime; 
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MaxRetryTime.
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * srcDB/destDB/metaDB/dstore
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * RetryTime.
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * Retrying.
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public ReverseJobRetryState build() {
                return new ReverseJobRetryState(this);
            } 

        } 

    }
    public static class ReverseJobSourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private ReverseJobSourceEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobSourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ReverseJobSourceEndpoint build() {
                return new ReverseJobSourceEndpoint(this);
            } 

        } 

    }
    public static class StructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private StructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureInitializationStatus build() {
                return new StructureInitializationStatus(this);
            } 

        } 

    }
    public static class ReverseJobSubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        private Boolean ddl;

        @NameInMap("Dml")
        private Boolean dml;

        private ReverseJobSubscriptionDataType(Builder builder) {
            this.ddl = builder.ddl;
            this.dml = builder.dml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobSubscriptionDataType create() {
            return builder().build();
        }

        /**
         * @return ddl
         */
        public Boolean getDdl() {
            return this.ddl;
        }

        /**
         * @return dml
         */
        public Boolean getDml() {
            return this.dml;
        }

        public static final class Builder {
            private Boolean ddl; 
            private Boolean dml; 

            /**
             * Ddl.
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * Dml.
             */
            public Builder dml(Boolean dml) {
                this.dml = dml;
                return this;
            }

            public ReverseJobSubscriptionDataType build() {
                return new ReverseJobSubscriptionDataType(this);
            } 

        } 

    }
    public static class ReverseJobSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        private String privateHost;

        @NameInMap("PublicHost")
        private String publicHost;

        @NameInMap("VpcHost")
        private String vpcHost;

        private ReverseJobSubscriptionHost(Builder builder) {
            this.privateHost = builder.privateHost;
            this.publicHost = builder.publicHost;
            this.vpcHost = builder.vpcHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobSubscriptionHost create() {
            return builder().build();
        }

        /**
         * @return privateHost
         */
        public String getPrivateHost() {
            return this.privateHost;
        }

        /**
         * @return publicHost
         */
        public String getPublicHost() {
            return this.publicHost;
        }

        /**
         * @return vpcHost
         */
        public String getVpcHost() {
            return this.vpcHost;
        }

        public static final class Builder {
            private String privateHost; 
            private String publicHost; 
            private String vpcHost; 

            /**
             * PrivateHost.
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * PublicHost.
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * VpcHost.
             */
            public Builder vpcHost(String vpcHost) {
                this.vpcHost = vpcHost;
                return this;
            }

            public ReverseJobSubscriptionHost build() {
                return new ReverseJobSubscriptionHost(this);
            } 

        } 

    }
    public static class TagList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("Creator")
        private Long creator;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("SrcRegion")
        private String srcRegion;

        @NameInMap("TagCategory")
        private String tagCategory;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private TagList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.scope = builder.scope;
            this.srcRegion = builder.srcRegion;
            this.tagCategory = builder.tagCategory;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return tagCategory
         */
        public String getTagCategory() {
            return this.tagCategory;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String regionId; 
            private String resourceId; 
            private String resourceType; 
            private String scope; 
            private String srcRegion; 
            private String tagCategory; 
            private String tagKey; 
            private String tagValue; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * region_id
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * dts instance id
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * TagCategory.
             */
            public Builder tagCategory(String tagCategory) {
                this.tagCategory = tagCategory;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    public static class ReverseJob extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        private String consumptionClient;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataEtlStatus")
        private ReverseJobDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        private ReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private ReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DatabaseCount")
        private Integer databaseCount;

        @NameInMap("DbObject")
        private String dbObject;

        @NameInMap("Delay")
        private Long delay;

        @NameInMap("DestNetType")
        private String destNetType;

        @NameInMap("DestinationEndpoint")
        private ReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("EndTimestamp")
        private String endTimestamp;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EtlCalculator")
        private String etlCalculator;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("IsDemoJob")
        private Boolean isDemoJob;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MigrationMode")
        private ReverseJobMigrationMode migrationMode;

        @NameInMap("OriginType")
        private String originType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private ReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        private ReverseJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        private String reserved;

        @NameInMap("RetryState")
        private ReverseJobRetryState retryState;

        @NameInMap("ReverseJob")
        private Object reverseJob;

        @NameInMap("SourceEndpoint")
        private ReverseJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitializationStatus")
        private StructureInitializationStatus structureInitializationStatus;

        @NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        private ReverseJobSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        private ReverseJobSubscriptionHost subscriptionHost;

        @NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @NameInMap("TagList")
        private java.util.List < TagList> tagList;

        @NameInMap("TaskType")
        private String taskType;

        private ReverseJob(Builder builder) {
            this.appName = builder.appName;
            this.beginTimestamp = builder.beginTimestamp;
            this.checkpoint = builder.checkpoint;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.createTime = builder.createTime;
            this.dataEtlStatus = builder.dataEtlStatus;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.databaseCount = builder.databaseCount;
            this.dbObject = builder.dbObject;
            this.delay = builder.delay;
            this.destNetType = builder.destNetType;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.endTimestamp = builder.endTimestamp;
            this.errorMessage = builder.errorMessage;
            this.etlCalculator = builder.etlCalculator;
            this.expireTime = builder.expireTime;
            this.finishTime = builder.finishTime;
            this.groupId = builder.groupId;
            this.isDemoJob = builder.isDemoJob;
            this.jobType = builder.jobType;
            this.migrationMode = builder.migrationMode;
            this.originType = builder.originType;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.retryState = builder.retryState;
            this.reverseJob = builder.reverseJob;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
            this.subscribeTopic = builder.subscribeTopic;
            this.subscriptionDataType = builder.subscriptionDataType;
            this.subscriptionHost = builder.subscriptionHost;
            this.synchronizationDirection = builder.synchronizationDirection;
            this.tagList = builder.tagList;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJob create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return beginTimestamp
         */
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return consumptionClient
         */
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataEtlStatus
         */
        public ReverseJobDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        /**
         * @return dataInitializationStatus
         */
        public ReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public ReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return databaseCount
         */
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destNetType
         */
        public String getDestNetType() {
            return this.destNetType;
        }

        /**
         * @return destinationEndpoint
         */
        public ReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlCalculator
         */
        public String getEtlCalculator() {
            return this.etlCalculator;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return isDemoJob
         */
        public Boolean getIsDemoJob() {
            return this.isDemoJob;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return migrationMode
         */
        public ReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return originType
         */
        public String getOriginType() {
            return this.originType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public ReverseJobPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public ReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return retryState
         */
        public ReverseJobRetryState getRetryState() {
            return this.retryState;
        }

        /**
         * @return reverseJob
         */
        public Object getReverseJob() {
            return this.reverseJob;
        }

        /**
         * @return sourceEndpoint
         */
        public ReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public StructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return subscribeTopic
         */
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        /**
         * @return subscriptionDataType
         */
        public ReverseJobSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        /**
         * @return subscriptionHost
         */
        public ReverseJobSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        /**
         * @return synchronizationDirection
         */
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        /**
         * @return tagList
         */
        public java.util.List < TagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String appName; 
            private String beginTimestamp; 
            private String checkpoint; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String createTime; 
            private ReverseJobDataEtlStatus dataEtlStatus; 
            private ReverseJobDataInitializationStatus dataInitializationStatus; 
            private ReverseJobDataSynchronizationStatus dataSynchronizationStatus; 
            private Integer databaseCount; 
            private String dbObject; 
            private Long delay; 
            private String destNetType; 
            private ReverseJobDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String endTimestamp; 
            private String errorMessage; 
            private String etlCalculator; 
            private String expireTime; 
            private String finishTime; 
            private String groupId; 
            private Boolean isDemoJob; 
            private String jobType; 
            private ReverseJobMigrationMode migrationMode; 
            private String originType; 
            private String payType; 
            private ReverseJobPerformance performance; 
            private ReverseJobPrecheckStatus precheckStatus; 
            private String reserved; 
            private ReverseJobRetryState retryState; 
            private Object reverseJob; 
            private ReverseJobSourceEndpoint sourceEndpoint; 
            private String status; 
            private StructureInitializationStatus structureInitializationStatus; 
            private String subscribeTopic; 
            private ReverseJobSubscriptionDataType subscriptionDataType; 
            private ReverseJobSubscriptionHost subscriptionHost; 
            private String synchronizationDirection; 
            private java.util.List < TagList> tagList; 
            private String taskType; 

            /**
             * The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The downstream client information in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The error code returned if the request failed.
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * The end time of the task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataEtlStatus.
             */
            public Builder dataEtlStatus(ReverseJobDataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * DataInitializationStatus.
             */
            public Builder dataInitializationStatus(ReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * DataSynchronizationStatus.
             */
            public Builder dataSynchronizationStatus(ReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The point in time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
                return this;
            }

            /**
             * Indicates whether the request was successful.
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The instance class.
             * <p>
             * 
             * >  For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).
             */
            public Builder destNetType(String destNetType) {
                this.destNetType = destNetType;
                return this;
            }

            /**
             * The name of the database that contains the objects to be migrated from the source instance.
             */
            public Builder destinationEndpoint(ReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * Indicates whether the new change tracking feature is used.
             * <p>
             * 
             * >  This parameter is returned only for change tracking instances of the new version.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The beginning of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * API test
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * > 
             * *   Default value: **Forward**.
             * *   The value **Reverse** takes effect only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The objects of the data migration, data synchronization, or change tracking task. For more information, see [Objects of DTS tasks](~~209545~~).
             */
            public Builder etlCalculator(String etlCalculator) {
                this.etlCalculator = etlCalculator;
                return this;
            }

            /**
             * The error code. This parameter will be removed in the future.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The state of the data migration or data synchronization task.
             * <p>
             * 
             * Valid values for a data migration task:
             * 
             * *   **NotStarted**: The migration is not started.
             * *   **Migrating**: The migration is in progress.
             * *   **Failed**: The migration failed.
             * *   **Finished**: The migration is complete.
             * 
             * Valid values for a data synchronization task:
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Prechecking**: The task is in precheck.
             * *   **PrecheckFailed**: The task failed to pass the precheck.
             * *   **Initializing**: The task is performing initial synchronization.
             * *   **InitializeFailed**: Initial synchronization failed.
             * *   **Synchronizing**: The task is in progress.
             * *   **Failed**: The task failed to synchronize data.
             * *   **Suspending**: The task is paused.
             * *   **Modifying**: The objects in the task are being modified.
             * *   **Finished**: The task is complete.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The operator information of the extract, transform, and load (ETL) task.
             * <p>
             * 
             * >  This parameter is returned only if you query the details of an ETL task.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * IsDemoJob.
             */
            public Builder isDemoJob(Boolean isDemoJob) {
                this.isDemoJob = isDemoJob;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder migrationMode(ReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * OriginType.
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Performance.
             */
            public Builder performance(ReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * PrecheckStatus.
             */
            public Builder precheckStatus(ReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking task.
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * RetryState.
             */
            public Builder retryState(ReverseJobRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * ReverseJob.
             */
            public Builder reverseJob(Object reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * The ID of the DTS task.
             */
            public Builder sourceEndpoint(ReverseJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StructureInitializationStatus.
             */
            public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * The VPC endpoint of the change tracking instance in the `<Address>:<Port number>` format.
             */
            public Builder subscriptionDataType(ReverseJobSubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * Indicates whether full data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: Full data migration or synchronization is performed.
             * *   **false**: Full data migration or synchronization is not performed.
             */
            public Builder subscriptionHost(ReverseJobSubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * The status code returned.
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List < TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public ReverseJob build() {
                return new ReverseJob(this);
            } 

        } 

    }
    public static class SubDistributedJobSourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private SubDistributedJobSourceEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobSourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SubDistributedJobSourceEndpoint build() {
                return new SubDistributedJobSourceEndpoint(this);
            } 

        } 

    }
    public static class SubDistributedJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubDistributedJobStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobStructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubDistributedJobStructureInitializationStatus build() {
                return new SubDistributedJobStructureInitializationStatus(this);
            } 

        } 

    }
    public static class SubDistributedJobSubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        private Boolean ddl;

        @NameInMap("Dml")
        private Boolean dml;

        private SubDistributedJobSubscriptionDataType(Builder builder) {
            this.ddl = builder.ddl;
            this.dml = builder.dml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobSubscriptionDataType create() {
            return builder().build();
        }

        /**
         * @return ddl
         */
        public Boolean getDdl() {
            return this.ddl;
        }

        /**
         * @return dml
         */
        public Boolean getDml() {
            return this.dml;
        }

        public static final class Builder {
            private Boolean ddl; 
            private Boolean dml; 

            /**
             * Ddl.
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * Dml.
             */
            public Builder dml(Boolean dml) {
                this.dml = dml;
                return this;
            }

            public SubDistributedJobSubscriptionDataType build() {
                return new SubDistributedJobSubscriptionDataType(this);
            } 

        } 

    }
    public static class SubDistributedJobSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        private String privateHost;

        @NameInMap("PublicHost")
        private String publicHost;

        @NameInMap("VpcHost")
        private String vpcHost;

        private SubDistributedJobSubscriptionHost(Builder builder) {
            this.privateHost = builder.privateHost;
            this.publicHost = builder.publicHost;
            this.vpcHost = builder.vpcHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobSubscriptionHost create() {
            return builder().build();
        }

        /**
         * @return privateHost
         */
        public String getPrivateHost() {
            return this.privateHost;
        }

        /**
         * @return publicHost
         */
        public String getPublicHost() {
            return this.publicHost;
        }

        /**
         * @return vpcHost
         */
        public String getVpcHost() {
            return this.vpcHost;
        }

        public static final class Builder {
            private String privateHost; 
            private String publicHost; 
            private String vpcHost; 

            /**
             * PrivateHost.
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * PublicHost.
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * VpcHost.
             */
            public Builder vpcHost(String vpcHost) {
                this.vpcHost = vpcHost;
                return this;
            }

            public SubDistributedJobSubscriptionHost build() {
                return new SubDistributedJobSubscriptionHost(this);
            } 

        } 

    }
    public static class SubDistributedJobTagList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("Creator")
        private Long creator;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("SrcRegion")
        private String srcRegion;

        @NameInMap("TagCategory")
        private String tagCategory;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private SubDistributedJobTagList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.scope = builder.scope;
            this.srcRegion = builder.srcRegion;
            this.tagCategory = builder.tagCategory;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJobTagList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return tagCategory
         */
        public String getTagCategory() {
            return this.tagCategory;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String regionId; 
            private String resourceId; 
            private String resourceType; 
            private String scope; 
            private String srcRegion; 
            private String tagCategory; 
            private String tagKey; 
            private String tagValue; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * region_id
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * dts instance id
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * TagCategory.
             */
            public Builder tagCategory(String tagCategory) {
                this.tagCategory = tagCategory;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public SubDistributedJobTagList build() {
                return new SubDistributedJobTagList(this);
            } 

        } 

    }
    public static class SubDistributedJob extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        private String consumptionClient;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataEtlStatus")
        private DataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        private DataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private SubDistributedJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DatabaseCount")
        private Integer databaseCount;

        @NameInMap("DbObject")
        private String dbObject;

        @NameInMap("Delay")
        private Long delay;

        @NameInMap("DestNetType")
        private String destNetType;

        @NameInMap("DestinationEndpoint")
        private SubDistributedJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("EndTimestamp")
        private String endTimestamp;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EtlCalculator")
        private String etlCalculator;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("IsDemoJob")
        private Boolean isDemoJob;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MigrationMode")
        private SubDistributedJobMigrationMode migrationMode;

        @NameInMap("OriginType")
        private String originType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private Performance performance;

        @NameInMap("PrecheckStatus")
        private PrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        private String reserved;

        @NameInMap("RetryState")
        private SubDistributedJobRetryState retryState;

        @NameInMap("ReverseJob")
        private ReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        private SubDistributedJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitializationStatus")
        private SubDistributedJobStructureInitializationStatus structureInitializationStatus;

        @NameInMap("SubSyncJob")
        private java.util.List < ? > subSyncJob;

        @NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        private SubDistributedJobSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        private SubDistributedJobSubscriptionHost subscriptionHost;

        @NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @NameInMap("TagList")
        private java.util.List < SubDistributedJobTagList> tagList;

        @NameInMap("TaskType")
        private String taskType;

        private SubDistributedJob(Builder builder) {
            this.appName = builder.appName;
            this.beginTimestamp = builder.beginTimestamp;
            this.checkpoint = builder.checkpoint;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.createTime = builder.createTime;
            this.dataEtlStatus = builder.dataEtlStatus;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.databaseCount = builder.databaseCount;
            this.dbObject = builder.dbObject;
            this.delay = builder.delay;
            this.destNetType = builder.destNetType;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.endTimestamp = builder.endTimestamp;
            this.errorMessage = builder.errorMessage;
            this.etlCalculator = builder.etlCalculator;
            this.expireTime = builder.expireTime;
            this.finishTime = builder.finishTime;
            this.groupId = builder.groupId;
            this.isDemoJob = builder.isDemoJob;
            this.jobType = builder.jobType;
            this.migrationMode = builder.migrationMode;
            this.originType = builder.originType;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.retryState = builder.retryState;
            this.reverseJob = builder.reverseJob;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
            this.subSyncJob = builder.subSyncJob;
            this.subscribeTopic = builder.subscribeTopic;
            this.subscriptionDataType = builder.subscriptionDataType;
            this.subscriptionHost = builder.subscriptionHost;
            this.synchronizationDirection = builder.synchronizationDirection;
            this.tagList = builder.tagList;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDistributedJob create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return beginTimestamp
         */
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return consumptionClient
         */
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataEtlStatus
         */
        public DataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        /**
         * @return dataInitializationStatus
         */
        public DataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public SubDistributedJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return databaseCount
         */
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destNetType
         */
        public String getDestNetType() {
            return this.destNetType;
        }

        /**
         * @return destinationEndpoint
         */
        public SubDistributedJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlCalculator
         */
        public String getEtlCalculator() {
            return this.etlCalculator;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return isDemoJob
         */
        public Boolean getIsDemoJob() {
            return this.isDemoJob;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return migrationMode
         */
        public SubDistributedJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return originType
         */
        public String getOriginType() {
            return this.originType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public Performance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public PrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return retryState
         */
        public SubDistributedJobRetryState getRetryState() {
            return this.retryState;
        }

        /**
         * @return reverseJob
         */
        public ReverseJob getReverseJob() {
            return this.reverseJob;
        }

        /**
         * @return sourceEndpoint
         */
        public SubDistributedJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public SubDistributedJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return subSyncJob
         */
        public java.util.List < ? > getSubSyncJob() {
            return this.subSyncJob;
        }

        /**
         * @return subscribeTopic
         */
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        /**
         * @return subscriptionDataType
         */
        public SubDistributedJobSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        /**
         * @return subscriptionHost
         */
        public SubDistributedJobSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        /**
         * @return synchronizationDirection
         */
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        /**
         * @return tagList
         */
        public java.util.List < SubDistributedJobTagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String appName; 
            private String beginTimestamp; 
            private String checkpoint; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String createTime; 
            private DataEtlStatus dataEtlStatus; 
            private DataInitializationStatus dataInitializationStatus; 
            private SubDistributedJobDataSynchronizationStatus dataSynchronizationStatus; 
            private Integer databaseCount; 
            private String dbObject; 
            private Long delay; 
            private String destNetType; 
            private SubDistributedJobDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String endTimestamp; 
            private String errorMessage; 
            private String etlCalculator; 
            private String expireTime; 
            private String finishTime; 
            private String groupId; 
            private Boolean isDemoJob; 
            private String jobType; 
            private SubDistributedJobMigrationMode migrationMode; 
            private String originType; 
            private String payType; 
            private Performance performance; 
            private PrecheckStatus precheckStatus; 
            private String reserved; 
            private SubDistributedJobRetryState retryState; 
            private ReverseJob reverseJob; 
            private SubDistributedJobSourceEndpoint sourceEndpoint; 
            private String status; 
            private SubDistributedJobStructureInitializationStatus structureInitializationStatus; 
            private java.util.List < ? > subSyncJob; 
            private String subscribeTopic; 
            private SubDistributedJobSubscriptionDataType subscriptionDataType; 
            private SubDistributedJobSubscriptionHost subscriptionHost; 
            private String synchronizationDirection; 
            private java.util.List < SubDistributedJobTagList> tagList; 
            private String taskType; 

            /**
             * The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The downstream client information in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The error code returned if the request failed.
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * The end time of the task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataEtlStatus.
             */
            public Builder dataEtlStatus(DataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * DataInitializationStatus.
             */
            public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * DataSynchronizationStatus.
             */
            public Builder dataSynchronizationStatus(SubDistributedJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The point in time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
                return this;
            }

            /**
             * Indicates whether the request was successful.
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The instance class.
             * <p>
             * 
             * >  For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).
             */
            public Builder destNetType(String destNetType) {
                this.destNetType = destNetType;
                return this;
            }

            /**
             * The name of the database that contains the objects to be migrated from the source instance.
             */
            public Builder destinationEndpoint(SubDistributedJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * Indicates whether the new change tracking feature is used.
             * <p>
             * 
             * >  This parameter is returned only for change tracking instances of the new version.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The beginning of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * API test
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * > 
             * *   Default value: **Forward**.
             * *   The value **Reverse** takes effect only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The objects of the data migration, data synchronization, or change tracking task. For more information, see [Objects of DTS tasks](~~209545~~).
             */
            public Builder etlCalculator(String etlCalculator) {
                this.etlCalculator = etlCalculator;
                return this;
            }

            /**
             * The error code. This parameter will be removed in the future.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The state of the data migration or data synchronization task.
             * <p>
             * 
             * Valid values for a data migration task:
             * 
             * *   **NotStarted**: The migration is not started.
             * *   **Migrating**: The migration is in progress.
             * *   **Failed**: The migration failed.
             * *   **Finished**: The migration is complete.
             * 
             * Valid values for a data synchronization task:
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Prechecking**: The task is in precheck.
             * *   **PrecheckFailed**: The task failed to pass the precheck.
             * *   **Initializing**: The task is performing initial synchronization.
             * *   **InitializeFailed**: Initial synchronization failed.
             * *   **Synchronizing**: The task is in progress.
             * *   **Failed**: The task failed to synchronize data.
             * *   **Suspending**: The task is paused.
             * *   **Modifying**: The objects in the task are being modified.
             * *   **Finished**: The task is complete.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The operator information of the extract, transform, and load (ETL) task.
             * <p>
             * 
             * >  This parameter is returned only if you query the details of an ETL task.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * IsDemoJob.
             */
            public Builder isDemoJob(Boolean isDemoJob) {
                this.isDemoJob = isDemoJob;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder migrationMode(SubDistributedJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * OriginType.
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Performance.
             */
            public Builder performance(Performance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * PrecheckStatus.
             */
            public Builder precheckStatus(PrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking task.
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * RetryState.
             */
            public Builder retryState(SubDistributedJobRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * ReverseJob.
             */
            public Builder reverseJob(ReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * The ID of the DTS task.
             */
            public Builder sourceEndpoint(SubDistributedJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StructureInitializationStatus.
             */
            public Builder structureInitializationStatus(SubDistributedJobStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * SubSyncJob.
             */
            public Builder subSyncJob(java.util.List < ? > subSyncJob) {
                this.subSyncJob = subSyncJob;
                return this;
            }

            /**
             * The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * The VPC endpoint of the change tracking instance in the `<Address>:<Port number>` format.
             */
            public Builder subscriptionDataType(SubDistributedJobSubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * Indicates whether full data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: Full data migration or synchronization is performed.
             * *   **false**: Full data migration or synchronization is not performed.
             */
            public Builder subscriptionHost(SubDistributedJobSubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * The status code returned.
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List < SubDistributedJobTagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public SubDistributedJob build() {
                return new SubDistributedJob(this);
            } 

        } 

    }
    public static class SubSyncJobDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubSyncJobDataEtlStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobDataEtlStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobDataEtlStatus build() {
                return new SubSyncJobDataEtlStatus(this);
            } 

        } 

    }
    public static class SubSyncJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubSyncJobDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobDataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobDataInitializationStatus build() {
                return new SubSyncJobDataInitializationStatus(this);
            } 

        } 

    }
    public static class SubSyncJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubSyncJobDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobDataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobDataSynchronizationStatus build() {
                return new SubSyncJobDataSynchronizationStatus(this);
            } 

        } 

    }
    public static class SubSyncJobDestinationEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private SubSyncJobDestinationEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobDestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SubSyncJobDestinationEndpoint build() {
                return new SubSyncJobDestinationEndpoint(this);
            } 

        } 

    }
    public static class SubSyncJobMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private SubSyncJobMigrationMode(Builder builder) {
            this.dataExtractTransformLoad = builder.dataExtractTransformLoad;
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobMigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataExtractTransformLoad
         */
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataExtractTransformLoad; 
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * The database account of the destination instance.
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * The database engine of the destination instance.
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * The migration types or synchronization types.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether data transformation is performed. Valid values:
             * <p>
             * 
             * *   **true**: Data transformation is performed.
             * *   **false**: Data transformation is not performed.
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public SubSyncJobMigrationMode build() {
                return new SubSyncJobMigrationMode(this);
            } 

        } 

    }
    public static class SubSyncJobPerformance extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("Rps")
        private String rps;

        private SubSyncJobPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobPerformance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * Rps.
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public SubSyncJobPerformance build() {
                return new SubSyncJobPerformance(this);
            } 

        } 

    }
    public static class SubSyncJobPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private SubSyncJobPrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobPrecheckStatusDetail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            /**
             * CheckItem.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * CheckItemDescription.
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * CheckResult.
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * FailedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * RepairMethod.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public SubSyncJobPrecheckStatusDetail build() {
                return new SubSyncJobPrecheckStatusDetail(this);
            } 

        } 

    }
    public static class SubSyncJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < SubSyncJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private SubSyncJobPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < SubSyncJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < SubSyncJobPrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < SubSyncJobPrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobPrecheckStatus build() {
                return new SubSyncJobPrecheckStatus(this);
            } 

        } 

    }
    public static class SubSyncJobRetryState extends TeaModel {
        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @NameInMap("Module")
        private String module;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("RetryTarget")
        private String retryTarget;

        @NameInMap("RetryTime")
        private Integer retryTime;

        @NameInMap("Retrying")
        private Boolean retrying;

        private SubSyncJobRetryState(Builder builder) {
            this.errMsg = builder.errMsg;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobRetryState create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryTarget
         */
        public String getRetryTarget() {
            return this.retryTarget;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return retrying
         */
        public Boolean getRetrying() {
            return this.retrying;
        }

        public static final class Builder {
            private String errMsg; 
            private String jobId; 
            private Integer maxRetryTime; 
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MaxRetryTime.
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * srcDB/destDB/metaDB/dstore
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * RetryTime.
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * Retrying.
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public SubSyncJobRetryState build() {
                return new SubSyncJobRetryState(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobDataEtlStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubSyncJobReverseJobDataEtlStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobDataEtlStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobReverseJobDataEtlStatus build() {
                return new SubSyncJobReverseJobDataEtlStatus(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubSyncJobReverseJobDataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobDataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobReverseJobDataInitializationStatus build() {
                return new SubSyncJobReverseJobDataInitializationStatus(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobDataSynchronizationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubSyncJobReverseJobDataSynchronizationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobDataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobReverseJobDataSynchronizationStatus build() {
                return new SubSyncJobReverseJobDataSynchronizationStatus(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobDestinationEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private SubSyncJobReverseJobDestinationEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobDestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SubSyncJobReverseJobDestinationEndpoint build() {
                return new SubSyncJobReverseJobDestinationEndpoint(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobMigrationMode extends TeaModel {
        @NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private SubSyncJobReverseJobMigrationMode(Builder builder) {
            this.dataExtractTransformLoad = builder.dataExtractTransformLoad;
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobMigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataExtractTransformLoad
         */
        public Boolean getDataExtractTransformLoad() {
            return this.dataExtractTransformLoad;
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataExtractTransformLoad; 
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * The database account of the destination instance.
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * The database engine of the destination instance.
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * The migration types or synchronization types.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether data transformation is performed. Valid values:
             * <p>
             * 
             * *   **true**: Data transformation is performed.
             * *   **false**: Data transformation is not performed.
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public SubSyncJobReverseJobMigrationMode build() {
                return new SubSyncJobReverseJobMigrationMode(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobPerformance extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("Rps")
        private String rps;

        private SubSyncJobReverseJobPerformance(Builder builder) {
            this.flow = builder.flow;
            this.rps = builder.rps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobPerformance create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return rps
         */
        public String getRps() {
            return this.rps;
        }

        public static final class Builder {
            private String flow; 
            private String rps; 

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * Rps.
             */
            public Builder rps(String rps) {
                this.rps = rps;
                return this;
            }

            public SubSyncJobReverseJobPerformance build() {
                return new SubSyncJobReverseJobPerformance(this);
            } 

        } 

    }
    public static class ReverseJobPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private ReverseJobPrecheckStatusDetail(Builder builder) {
            this.checkItem = builder.checkItem;
            this.checkItemDescription = builder.checkItemDescription;
            this.checkResult = builder.checkResult;
            this.failedReason = builder.failedReason;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobPrecheckStatusDetail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkItemDescription
         */
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkItem; 
            private String checkItemDescription; 
            private String checkResult; 
            private String failedReason; 
            private String repairMethod; 

            /**
             * CheckItem.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * CheckItemDescription.
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * CheckResult.
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * FailedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * RepairMethod.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public ReverseJobPrecheckStatusDetail build() {
                return new ReverseJobPrecheckStatusDetail(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < ReverseJobPrecheckStatusDetail> detail;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private SubSyncJobReverseJobPrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobPrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < ReverseJobPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < ReverseJobPrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < ReverseJobPrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobReverseJobPrecheckStatus build() {
                return new SubSyncJobReverseJobPrecheckStatus(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobRetryState extends TeaModel {
        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @NameInMap("Module")
        private String module;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("RetryTarget")
        private String retryTarget;

        @NameInMap("RetryTime")
        private Integer retryTime;

        @NameInMap("Retrying")
        private Boolean retrying;

        private SubSyncJobReverseJobRetryState(Builder builder) {
            this.errMsg = builder.errMsg;
            this.jobId = builder.jobId;
            this.maxRetryTime = builder.maxRetryTime;
            this.module = builder.module;
            this.retryCount = builder.retryCount;
            this.retryTarget = builder.retryTarget;
            this.retryTime = builder.retryTime;
            this.retrying = builder.retrying;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobRetryState create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return maxRetryTime
         */
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryTarget
         */
        public String getRetryTarget() {
            return this.retryTarget;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return retrying
         */
        public Boolean getRetrying() {
            return this.retrying;
        }

        public static final class Builder {
            private String errMsg; 
            private String jobId; 
            private Integer maxRetryTime; 
            private String module; 
            private Integer retryCount; 
            private String retryTarget; 
            private Integer retryTime; 
            private Boolean retrying; 

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MaxRetryTime.
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * srcDB/destDB/metaDB/dstore
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * RetryTime.
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * Retrying.
             */
            public Builder retrying(Boolean retrying) {
                this.retrying = retrying;
                return this;
            }

            public SubSyncJobReverseJobRetryState build() {
                return new SubSyncJobReverseJobRetryState(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobSourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private SubSyncJobReverseJobSourceEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobSourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SubSyncJobReverseJobSourceEndpoint build() {
                return new SubSyncJobReverseJobSourceEndpoint(this);
            } 

        } 

    }
    public static class ReverseJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ReverseJobStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobStructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReverseJobStructureInitializationStatus build() {
                return new ReverseJobStructureInitializationStatus(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobSubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        private Boolean ddl;

        @NameInMap("Dml")
        private Boolean dml;

        private SubSyncJobReverseJobSubscriptionDataType(Builder builder) {
            this.ddl = builder.ddl;
            this.dml = builder.dml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobSubscriptionDataType create() {
            return builder().build();
        }

        /**
         * @return ddl
         */
        public Boolean getDdl() {
            return this.ddl;
        }

        /**
         * @return dml
         */
        public Boolean getDml() {
            return this.dml;
        }

        public static final class Builder {
            private Boolean ddl; 
            private Boolean dml; 

            /**
             * Ddl.
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * Dml.
             */
            public Builder dml(Boolean dml) {
                this.dml = dml;
                return this;
            }

            public SubSyncJobReverseJobSubscriptionDataType build() {
                return new SubSyncJobReverseJobSubscriptionDataType(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJobSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        private String privateHost;

        @NameInMap("PublicHost")
        private String publicHost;

        @NameInMap("VpcHost")
        private String vpcHost;

        private SubSyncJobReverseJobSubscriptionHost(Builder builder) {
            this.privateHost = builder.privateHost;
            this.publicHost = builder.publicHost;
            this.vpcHost = builder.vpcHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJobSubscriptionHost create() {
            return builder().build();
        }

        /**
         * @return privateHost
         */
        public String getPrivateHost() {
            return this.privateHost;
        }

        /**
         * @return publicHost
         */
        public String getPublicHost() {
            return this.publicHost;
        }

        /**
         * @return vpcHost
         */
        public String getVpcHost() {
            return this.vpcHost;
        }

        public static final class Builder {
            private String privateHost; 
            private String publicHost; 
            private String vpcHost; 

            /**
             * PrivateHost.
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * PublicHost.
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * VpcHost.
             */
            public Builder vpcHost(String vpcHost) {
                this.vpcHost = vpcHost;
                return this;
            }

            public SubSyncJobReverseJobSubscriptionHost build() {
                return new SubSyncJobReverseJobSubscriptionHost(this);
            } 

        } 

    }
    public static class ReverseJobTagList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("Creator")
        private Long creator;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("SrcRegion")
        private String srcRegion;

        @NameInMap("TagCategory")
        private String tagCategory;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private ReverseJobTagList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.scope = builder.scope;
            this.srcRegion = builder.srcRegion;
            this.tagCategory = builder.tagCategory;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReverseJobTagList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return tagCategory
         */
        public String getTagCategory() {
            return this.tagCategory;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String regionId; 
            private String resourceId; 
            private String resourceType; 
            private String scope; 
            private String srcRegion; 
            private String tagCategory; 
            private String tagKey; 
            private String tagValue; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * region_id
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * dts instance id
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * TagCategory.
             */
            public Builder tagCategory(String tagCategory) {
                this.tagCategory = tagCategory;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public ReverseJobTagList build() {
                return new ReverseJobTagList(this);
            } 

        } 

    }
    public static class SubSyncJobReverseJob extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        private String consumptionClient;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataEtlStatus")
        private SubSyncJobReverseJobDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        private SubSyncJobReverseJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private SubSyncJobReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DatabaseCount")
        private Integer databaseCount;

        @NameInMap("DbObject")
        private String dbObject;

        @NameInMap("Delay")
        private Long delay;

        @NameInMap("DestNetType")
        private String destNetType;

        @NameInMap("DestinationEndpoint")
        private SubSyncJobReverseJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("EndTimestamp")
        private String endTimestamp;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EtlCalculator")
        private String etlCalculator;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("IsDemoJob")
        private Boolean isDemoJob;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MigrationMode")
        private SubSyncJobReverseJobMigrationMode migrationMode;

        @NameInMap("OriginType")
        private String originType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private SubSyncJobReverseJobPerformance performance;

        @NameInMap("PrecheckStatus")
        private SubSyncJobReverseJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        private String reserved;

        @NameInMap("RetryState")
        private SubSyncJobReverseJobRetryState retryState;

        @NameInMap("ReverseJob")
        private Object reverseJob;

        @NameInMap("SourceEndpoint")
        private SubSyncJobReverseJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitializationStatus")
        private ReverseJobStructureInitializationStatus structureInitializationStatus;

        @NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        private SubSyncJobReverseJobSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        private SubSyncJobReverseJobSubscriptionHost subscriptionHost;

        @NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @NameInMap("TagList")
        private java.util.List < ReverseJobTagList> tagList;

        @NameInMap("TaskType")
        private String taskType;

        private SubSyncJobReverseJob(Builder builder) {
            this.appName = builder.appName;
            this.beginTimestamp = builder.beginTimestamp;
            this.checkpoint = builder.checkpoint;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.createTime = builder.createTime;
            this.dataEtlStatus = builder.dataEtlStatus;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.databaseCount = builder.databaseCount;
            this.dbObject = builder.dbObject;
            this.delay = builder.delay;
            this.destNetType = builder.destNetType;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.endTimestamp = builder.endTimestamp;
            this.errorMessage = builder.errorMessage;
            this.etlCalculator = builder.etlCalculator;
            this.expireTime = builder.expireTime;
            this.finishTime = builder.finishTime;
            this.groupId = builder.groupId;
            this.isDemoJob = builder.isDemoJob;
            this.jobType = builder.jobType;
            this.migrationMode = builder.migrationMode;
            this.originType = builder.originType;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.retryState = builder.retryState;
            this.reverseJob = builder.reverseJob;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
            this.subscribeTopic = builder.subscribeTopic;
            this.subscriptionDataType = builder.subscriptionDataType;
            this.subscriptionHost = builder.subscriptionHost;
            this.synchronizationDirection = builder.synchronizationDirection;
            this.tagList = builder.tagList;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobReverseJob create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return beginTimestamp
         */
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return consumptionClient
         */
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataEtlStatus
         */
        public SubSyncJobReverseJobDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        /**
         * @return dataInitializationStatus
         */
        public SubSyncJobReverseJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public SubSyncJobReverseJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return databaseCount
         */
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destNetType
         */
        public String getDestNetType() {
            return this.destNetType;
        }

        /**
         * @return destinationEndpoint
         */
        public SubSyncJobReverseJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlCalculator
         */
        public String getEtlCalculator() {
            return this.etlCalculator;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return isDemoJob
         */
        public Boolean getIsDemoJob() {
            return this.isDemoJob;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return migrationMode
         */
        public SubSyncJobReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return originType
         */
        public String getOriginType() {
            return this.originType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public SubSyncJobReverseJobPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public SubSyncJobReverseJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return retryState
         */
        public SubSyncJobReverseJobRetryState getRetryState() {
            return this.retryState;
        }

        /**
         * @return reverseJob
         */
        public Object getReverseJob() {
            return this.reverseJob;
        }

        /**
         * @return sourceEndpoint
         */
        public SubSyncJobReverseJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public ReverseJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return subscribeTopic
         */
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        /**
         * @return subscriptionDataType
         */
        public SubSyncJobReverseJobSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        /**
         * @return subscriptionHost
         */
        public SubSyncJobReverseJobSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        /**
         * @return synchronizationDirection
         */
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        /**
         * @return tagList
         */
        public java.util.List < ReverseJobTagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String appName; 
            private String beginTimestamp; 
            private String checkpoint; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String createTime; 
            private SubSyncJobReverseJobDataEtlStatus dataEtlStatus; 
            private SubSyncJobReverseJobDataInitializationStatus dataInitializationStatus; 
            private SubSyncJobReverseJobDataSynchronizationStatus dataSynchronizationStatus; 
            private Integer databaseCount; 
            private String dbObject; 
            private Long delay; 
            private String destNetType; 
            private SubSyncJobReverseJobDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String endTimestamp; 
            private String errorMessage; 
            private String etlCalculator; 
            private String expireTime; 
            private String finishTime; 
            private String groupId; 
            private Boolean isDemoJob; 
            private String jobType; 
            private SubSyncJobReverseJobMigrationMode migrationMode; 
            private String originType; 
            private String payType; 
            private SubSyncJobReverseJobPerformance performance; 
            private SubSyncJobReverseJobPrecheckStatus precheckStatus; 
            private String reserved; 
            private SubSyncJobReverseJobRetryState retryState; 
            private Object reverseJob; 
            private SubSyncJobReverseJobSourceEndpoint sourceEndpoint; 
            private String status; 
            private ReverseJobStructureInitializationStatus structureInitializationStatus; 
            private String subscribeTopic; 
            private SubSyncJobReverseJobSubscriptionDataType subscriptionDataType; 
            private SubSyncJobReverseJobSubscriptionHost subscriptionHost; 
            private String synchronizationDirection; 
            private java.util.List < ReverseJobTagList> tagList; 
            private String taskType; 

            /**
             * The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The downstream client information in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The error code returned if the request failed.
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * The end time of the task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataEtlStatus.
             */
            public Builder dataEtlStatus(SubSyncJobReverseJobDataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * DataInitializationStatus.
             */
            public Builder dataInitializationStatus(SubSyncJobReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * DataSynchronizationStatus.
             */
            public Builder dataSynchronizationStatus(SubSyncJobReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The point in time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
                return this;
            }

            /**
             * Indicates whether the request was successful.
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The instance class.
             * <p>
             * 
             * >  For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).
             */
            public Builder destNetType(String destNetType) {
                this.destNetType = destNetType;
                return this;
            }

            /**
             * The name of the database that contains the objects to be migrated from the source instance.
             */
            public Builder destinationEndpoint(SubSyncJobReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * Indicates whether the new change tracking feature is used.
             * <p>
             * 
             * >  This parameter is returned only for change tracking instances of the new version.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The beginning of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * API test
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * > 
             * *   Default value: **Forward**.
             * *   The value **Reverse** takes effect only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The objects of the data migration, data synchronization, or change tracking task. For more information, see [Objects of DTS tasks](~~209545~~).
             */
            public Builder etlCalculator(String etlCalculator) {
                this.etlCalculator = etlCalculator;
                return this;
            }

            /**
             * The error code. This parameter will be removed in the future.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The state of the data migration or data synchronization task.
             * <p>
             * 
             * Valid values for a data migration task:
             * 
             * *   **NotStarted**: The migration is not started.
             * *   **Migrating**: The migration is in progress.
             * *   **Failed**: The migration failed.
             * *   **Finished**: The migration is complete.
             * 
             * Valid values for a data synchronization task:
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Prechecking**: The task is in precheck.
             * *   **PrecheckFailed**: The task failed to pass the precheck.
             * *   **Initializing**: The task is performing initial synchronization.
             * *   **InitializeFailed**: Initial synchronization failed.
             * *   **Synchronizing**: The task is in progress.
             * *   **Failed**: The task failed to synchronize data.
             * *   **Suspending**: The task is paused.
             * *   **Modifying**: The objects in the task are being modified.
             * *   **Finished**: The task is complete.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The operator information of the extract, transform, and load (ETL) task.
             * <p>
             * 
             * >  This parameter is returned only if you query the details of an ETL task.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * IsDemoJob.
             */
            public Builder isDemoJob(Boolean isDemoJob) {
                this.isDemoJob = isDemoJob;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder migrationMode(SubSyncJobReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * OriginType.
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Performance.
             */
            public Builder performance(SubSyncJobReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * PrecheckStatus.
             */
            public Builder precheckStatus(SubSyncJobReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking task.
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * RetryState.
             */
            public Builder retryState(SubSyncJobReverseJobRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * ReverseJob.
             */
            public Builder reverseJob(Object reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * The ID of the DTS task.
             */
            public Builder sourceEndpoint(SubSyncJobReverseJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StructureInitializationStatus.
             */
            public Builder structureInitializationStatus(ReverseJobStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * The VPC endpoint of the change tracking instance in the `<Address>:<Port number>` format.
             */
            public Builder subscriptionDataType(SubSyncJobReverseJobSubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * Indicates whether full data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: Full data migration or synchronization is performed.
             * *   **false**: Full data migration or synchronization is not performed.
             */
            public Builder subscriptionHost(SubSyncJobReverseJobSubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * The status code returned.
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List < ReverseJobTagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public SubSyncJobReverseJob build() {
                return new SubSyncJobReverseJob(this);
            } 

        } 

    }
    public static class SubSyncJobSourceEndpoint extends TeaModel {
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @NameInMap("UserName")
        private String userName;

        private SubSyncJobSourceEndpoint(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.region = builder.region;
            this.roleName = builder.roleName;
            this.sslSolutionEnum = builder.sslSolutionEnum;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobSourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return sslSolutionEnum
         */
        public String getSslSolutionEnum() {
            return this.sslSolutionEnum;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String databaseName; 
            private String engineName; 
            private String instanceID; 
            private String instanceType; 
            private String ip; 
            private String oracleSID; 
            private String port; 
            private String region; 
            private String roleName; 
            private String sslSolutionEnum; 
            private String userName; 

            /**
             * The database engine of the source instance.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The system ID (SID) of the Oracle database.
             * <p>
             * 
             * >  This parameter is returned only if the **EngineName** parameter of the source instance is set to **Oracle** and the Oracle database is deployed in a non-RAC architecture.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The IP address of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **DISABLE**: SSL encryption is disabled.
             * *   **ENABLE_WITH_CERTIFICATE**: SSL encryption is enabled, and the CA certificate is uploaded.
             * *   **ENABLE_ONLY\_4\_MONGODB_ALTAS**: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.
             * *   **ENABLE_ONLY\_4\_KAFKA_SCRAM_SHA\_256**: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * >  This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SubSyncJobSourceEndpoint build() {
                return new SubSyncJobSourceEndpoint(this);
            } 

        } 

    }
    public static class SubSyncJobStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private SubSyncJobStructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.needUpgrade = builder.needUpgrade;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobStructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean needUpgrade; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NeedUpgrade.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubSyncJobStructureInitializationStatus build() {
                return new SubSyncJobStructureInitializationStatus(this);
            } 

        } 

    }
    public static class SubSyncJobSubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        private Boolean ddl;

        @NameInMap("Dml")
        private Boolean dml;

        private SubSyncJobSubscriptionDataType(Builder builder) {
            this.ddl = builder.ddl;
            this.dml = builder.dml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobSubscriptionDataType create() {
            return builder().build();
        }

        /**
         * @return ddl
         */
        public Boolean getDdl() {
            return this.ddl;
        }

        /**
         * @return dml
         */
        public Boolean getDml() {
            return this.dml;
        }

        public static final class Builder {
            private Boolean ddl; 
            private Boolean dml; 

            /**
             * Ddl.
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * Dml.
             */
            public Builder dml(Boolean dml) {
                this.dml = dml;
                return this;
            }

            public SubSyncJobSubscriptionDataType build() {
                return new SubSyncJobSubscriptionDataType(this);
            } 

        } 

    }
    public static class SubSyncJobSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        private String privateHost;

        @NameInMap("PublicHost")
        private String publicHost;

        @NameInMap("VpcHost")
        private String vpcHost;

        private SubSyncJobSubscriptionHost(Builder builder) {
            this.privateHost = builder.privateHost;
            this.publicHost = builder.publicHost;
            this.vpcHost = builder.vpcHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobSubscriptionHost create() {
            return builder().build();
        }

        /**
         * @return privateHost
         */
        public String getPrivateHost() {
            return this.privateHost;
        }

        /**
         * @return publicHost
         */
        public String getPublicHost() {
            return this.publicHost;
        }

        /**
         * @return vpcHost
         */
        public String getVpcHost() {
            return this.vpcHost;
        }

        public static final class Builder {
            private String privateHost; 
            private String publicHost; 
            private String vpcHost; 

            /**
             * PrivateHost.
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * PublicHost.
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * VpcHost.
             */
            public Builder vpcHost(String vpcHost) {
                this.vpcHost = vpcHost;
                return this;
            }

            public SubSyncJobSubscriptionHost build() {
                return new SubSyncJobSubscriptionHost(this);
            } 

        } 

    }
    public static class SubSyncJobTagList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("Creator")
        private Long creator;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("SrcRegion")
        private String srcRegion;

        @NameInMap("TagCategory")
        private String tagCategory;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private SubSyncJobTagList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.scope = builder.scope;
            this.srcRegion = builder.srcRegion;
            this.tagCategory = builder.tagCategory;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJobTagList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return tagCategory
         */
        public String getTagCategory() {
            return this.tagCategory;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String regionId; 
            private String resourceId; 
            private String resourceType; 
            private String scope; 
            private String srcRegion; 
            private String tagCategory; 
            private String tagKey; 
            private String tagValue; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * region_id
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * dts instance id
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * TagCategory.
             */
            public Builder tagCategory(String tagCategory) {
                this.tagCategory = tagCategory;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public SubSyncJobTagList build() {
                return new SubSyncJobTagList(this);
            } 

        } 

    }
    public static class SubSyncJob extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @NameInMap("ConsumptionClient")
        private String consumptionClient;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataEtlStatus")
        private SubSyncJobDataEtlStatus dataEtlStatus;

        @NameInMap("DataInitializationStatus")
        private SubSyncJobDataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private SubSyncJobDataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("DatabaseCount")
        private Integer databaseCount;

        @NameInMap("DbObject")
        private String dbObject;

        @NameInMap("Delay")
        private Long delay;

        @NameInMap("DestNetType")
        private String destNetType;

        @NameInMap("DestinationEndpoint")
        private SubSyncJobDestinationEndpoint destinationEndpoint;

        @NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("EndTimestamp")
        private String endTimestamp;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EtlCalculator")
        private String etlCalculator;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("IsDemoJob")
        private Boolean isDemoJob;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MigrationMode")
        private SubSyncJobMigrationMode migrationMode;

        @NameInMap("OriginType")
        private String originType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private SubSyncJobPerformance performance;

        @NameInMap("PrecheckStatus")
        private SubSyncJobPrecheckStatus precheckStatus;

        @NameInMap("Reserved")
        private String reserved;

        @NameInMap("RetryState")
        private SubSyncJobRetryState retryState;

        @NameInMap("ReverseJob")
        private SubSyncJobReverseJob reverseJob;

        @NameInMap("SourceEndpoint")
        private SubSyncJobSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitializationStatus")
        private SubSyncJobStructureInitializationStatus structureInitializationStatus;

        @NameInMap("SubSyncJob")
        private java.util.List < ? > subSyncJob;

        @NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @NameInMap("SubscriptionDataType")
        private SubSyncJobSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionHost")
        private SubSyncJobSubscriptionHost subscriptionHost;

        @NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @NameInMap("TagList")
        private java.util.List < SubSyncJobTagList> tagList;

        @NameInMap("TaskType")
        private String taskType;

        private SubSyncJob(Builder builder) {
            this.appName = builder.appName;
            this.beginTimestamp = builder.beginTimestamp;
            this.checkpoint = builder.checkpoint;
            this.consumptionCheckpoint = builder.consumptionCheckpoint;
            this.consumptionClient = builder.consumptionClient;
            this.createTime = builder.createTime;
            this.dataEtlStatus = builder.dataEtlStatus;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.databaseCount = builder.databaseCount;
            this.dbObject = builder.dbObject;
            this.delay = builder.delay;
            this.destNetType = builder.destNetType;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.dtsInstanceID = builder.dtsInstanceID;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobDirection = builder.dtsJobDirection;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.endTimestamp = builder.endTimestamp;
            this.errorMessage = builder.errorMessage;
            this.etlCalculator = builder.etlCalculator;
            this.expireTime = builder.expireTime;
            this.finishTime = builder.finishTime;
            this.groupId = builder.groupId;
            this.isDemoJob = builder.isDemoJob;
            this.jobType = builder.jobType;
            this.migrationMode = builder.migrationMode;
            this.originType = builder.originType;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.reserved = builder.reserved;
            this.retryState = builder.retryState;
            this.reverseJob = builder.reverseJob;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitializationStatus = builder.structureInitializationStatus;
            this.subSyncJob = builder.subSyncJob;
            this.subscribeTopic = builder.subscribeTopic;
            this.subscriptionDataType = builder.subscriptionDataType;
            this.subscriptionHost = builder.subscriptionHost;
            this.synchronizationDirection = builder.synchronizationDirection;
            this.tagList = builder.tagList;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubSyncJob create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return beginTimestamp
         */
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return consumptionCheckpoint
         */
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        /**
         * @return consumptionClient
         */
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataEtlStatus
         */
        public SubSyncJobDataEtlStatus getDataEtlStatus() {
            return this.dataEtlStatus;
        }

        /**
         * @return dataInitializationStatus
         */
        public SubSyncJobDataInitializationStatus getDataInitializationStatus() {
            return this.dataInitializationStatus;
        }

        /**
         * @return dataSynchronizationStatus
         */
        public SubSyncJobDataSynchronizationStatus getDataSynchronizationStatus() {
            return this.dataSynchronizationStatus;
        }

        /**
         * @return databaseCount
         */
        public Integer getDatabaseCount() {
            return this.databaseCount;
        }

        /**
         * @return dbObject
         */
        public String getDbObject() {
            return this.dbObject;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return destNetType
         */
        public String getDestNetType() {
            return this.destNetType;
        }

        /**
         * @return destinationEndpoint
         */
        public SubSyncJobDestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return dtsInstanceID
         */
        public String getDtsInstanceID() {
            return this.dtsInstanceID;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
        }

        /**
         * @return dtsJobDirection
         */
        public String getDtsJobDirection() {
            return this.dtsJobDirection;
        }

        /**
         * @return dtsJobId
         */
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        /**
         * @return dtsJobName
         */
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        /**
         * @return endTimestamp
         */
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return etlCalculator
         */
        public String getEtlCalculator() {
            return this.etlCalculator;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return isDemoJob
         */
        public Boolean getIsDemoJob() {
            return this.isDemoJob;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return migrationMode
         */
        public SubSyncJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return originType
         */
        public String getOriginType() {
            return this.originType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public SubSyncJobPerformance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public SubSyncJobPrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return reserved
         */
        public String getReserved() {
            return this.reserved;
        }

        /**
         * @return retryState
         */
        public SubSyncJobRetryState getRetryState() {
            return this.retryState;
        }

        /**
         * @return reverseJob
         */
        public SubSyncJobReverseJob getReverseJob() {
            return this.reverseJob;
        }

        /**
         * @return sourceEndpoint
         */
        public SubSyncJobSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitializationStatus
         */
        public SubSyncJobStructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return subSyncJob
         */
        public java.util.List < ? > getSubSyncJob() {
            return this.subSyncJob;
        }

        /**
         * @return subscribeTopic
         */
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        /**
         * @return subscriptionDataType
         */
        public SubSyncJobSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        /**
         * @return subscriptionHost
         */
        public SubSyncJobSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        /**
         * @return synchronizationDirection
         */
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        /**
         * @return tagList
         */
        public java.util.List < SubSyncJobTagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String appName; 
            private String beginTimestamp; 
            private String checkpoint; 
            private String consumptionCheckpoint; 
            private String consumptionClient; 
            private String createTime; 
            private SubSyncJobDataEtlStatus dataEtlStatus; 
            private SubSyncJobDataInitializationStatus dataInitializationStatus; 
            private SubSyncJobDataSynchronizationStatus dataSynchronizationStatus; 
            private Integer databaseCount; 
            private String dbObject; 
            private Long delay; 
            private String destNetType; 
            private SubSyncJobDestinationEndpoint destinationEndpoint; 
            private String dtsInstanceID; 
            private String dtsJobClass; 
            private String dtsJobDirection; 
            private String dtsJobId; 
            private String dtsJobName; 
            private String endTimestamp; 
            private String errorMessage; 
            private String etlCalculator; 
            private String expireTime; 
            private String finishTime; 
            private String groupId; 
            private Boolean isDemoJob; 
            private String jobType; 
            private SubSyncJobMigrationMode migrationMode; 
            private String originType; 
            private String payType; 
            private SubSyncJobPerformance performance; 
            private SubSyncJobPrecheckStatus precheckStatus; 
            private String reserved; 
            private SubSyncJobRetryState retryState; 
            private SubSyncJobReverseJob reverseJob; 
            private SubSyncJobSourceEndpoint sourceEndpoint; 
            private String status; 
            private SubSyncJobStructureInitializationStatus structureInitializationStatus; 
            private java.util.List < ? > subSyncJob; 
            private String subscribeTopic; 
            private SubSyncJobSubscriptionDataType subscriptionDataType; 
            private SubSyncJobSubscriptionHost subscriptionHost; 
            private String synchronizationDirection; 
            private java.util.List < SubSyncJobTagList> tagList; 
            private String taskType; 

            /**
             * The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The downstream client information in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * The error code returned if the request failed.
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * The end time of the task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataEtlStatus.
             */
            public Builder dataEtlStatus(SubSyncJobDataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * DataInitializationStatus.
             */
            public Builder dataInitializationStatus(SubSyncJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * DataSynchronizationStatus.
             */
            public Builder dataSynchronizationStatus(SubSyncJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The point in time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
                return this;
            }

            /**
             * Indicates whether the request was successful.
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The instance class.
             * <p>
             * 
             * >  For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).
             */
            public Builder destNetType(String destNetType) {
                this.destNetType = destNetType;
                return this;
            }

            /**
             * The name of the database that contains the objects to be migrated from the source instance.
             */
            public Builder destinationEndpoint(SubSyncJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * Indicates whether the new change tracking feature is used.
             * <p>
             * 
             * >  This parameter is returned only for change tracking instances of the new version.
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The beginning of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * API test
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**: Data is synchronized from the source database to the destination database.
             * *   **Reverse**: Data is synchronized from the destination database to the source database.
             * 
             * > 
             * *   Default value: **Forward**.
             * *   The value **Reverse** takes effect only if the topology of the data synchronization instance is two-way synchronization.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, for example, whether to automatically start a precheck. For more information, see [MigrationReserved](~~176470~~).
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * The name of the data migration, data synchronization, or change tracking task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The objects of the data migration, data synchronization, or change tracking task. For more information, see [Objects of DTS tasks](~~209545~~).
             */
            public Builder etlCalculator(String etlCalculator) {
                this.etlCalculator = etlCalculator;
                return this;
            }

            /**
             * The error code. This parameter will be removed in the future.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The state of the data migration or data synchronization task.
             * <p>
             * 
             * Valid values for a data migration task:
             * 
             * *   **NotStarted**: The migration is not started.
             * *   **Migrating**: The migration is in progress.
             * *   **Failed**: The migration failed.
             * *   **Finished**: The migration is complete.
             * 
             * Valid values for a data synchronization task:
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Prechecking**: The task is in precheck.
             * *   **PrecheckFailed**: The task failed to pass the precheck.
             * *   **Initializing**: The task is performing initial synchronization.
             * *   **InitializeFailed**: Initial synchronization failed.
             * *   **Synchronizing**: The task is in progress.
             * *   **Failed**: The task failed to synchronize data.
             * *   **Suspending**: The task is paused.
             * *   **Modifying**: The objects in the task are being modified.
             * *   **Finished**: The task is complete.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The operator information of the extract, transform, and load (ETL) task.
             * <p>
             * 
             * >  This parameter is returned only if you query the details of an ETL task.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * IsDemoJob.
             */
            public Builder isDemoJob(Boolean isDemoJob) {
                this.isDemoJob = isDemoJob;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder migrationMode(SubSyncJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * OriginType.
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Performance.
             */
            public Builder performance(SubSyncJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * PrecheckStatus.
             */
            public Builder precheckStatus(SubSyncJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking task.
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * RetryState.
             */
            public Builder retryState(SubSyncJobRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * ReverseJob.
             */
            public Builder reverseJob(SubSyncJobReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * The ID of the DTS task.
             */
            public Builder sourceEndpoint(SubSyncJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The ID of the data migration, data synchronization, or change tracking instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StructureInitializationStatus.
             */
            public Builder structureInitializationStatus(SubSyncJobStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * SubSyncJob.
             */
            public Builder subSyncJob(java.util.List < ? > subSyncJob) {
                this.subSyncJob = subSyncJob;
                return this;
            }

            /**
             * The end of the time range for change tracking. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * The VPC endpoint of the change tracking instance in the `<Address>:<Port number>` format.
             */
            public Builder subscriptionDataType(SubSyncJobSubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * Indicates whether full data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: Full data migration or synchronization is performed.
             * *   **false**: Full data migration or synchronization is not performed.
             */
            public Builder subscriptionHost(SubSyncJobSubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * The status code returned.
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List < SubSyncJobTagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public SubSyncJob build() {
                return new SubSyncJob(this);
            } 

        } 

    }
    public static class SubscriptionDataType extends TeaModel {
        @NameInMap("Ddl")
        private Boolean ddl;

        @NameInMap("Dml")
        private Boolean dml;

        private SubscriptionDataType(Builder builder) {
            this.ddl = builder.ddl;
            this.dml = builder.dml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionDataType create() {
            return builder().build();
        }

        /**
         * @return ddl
         */
        public Boolean getDdl() {
            return this.ddl;
        }

        /**
         * @return dml
         */
        public Boolean getDml() {
            return this.dml;
        }

        public static final class Builder {
            private Boolean ddl; 
            private Boolean dml; 

            /**
             * The private endpoint of the change tracking instance in the `<Address>:<Port number>` format.
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * The public endpoint of the change tracking instance in the `<Address>:<Port number>` format.
             */
            public Builder dml(Boolean dml) {
                this.dml = dml;
                return this;
            }

            public SubscriptionDataType build() {
                return new SubscriptionDataType(this);
            } 

        } 

    }
    public static class SubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        private String privateHost;

        @NameInMap("PublicHost")
        private String publicHost;

        @NameInMap("VpcHost")
        private String vpcHost;

        private SubscriptionHost(Builder builder) {
            this.privateHost = builder.privateHost;
            this.publicHost = builder.publicHost;
            this.vpcHost = builder.vpcHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionHost create() {
            return builder().build();
        }

        /**
         * @return privateHost
         */
        public String getPrivateHost() {
            return this.privateHost;
        }

        /**
         * @return publicHost
         */
        public String getPublicHost() {
            return this.publicHost;
        }

        /**
         * @return vpcHost
         */
        public String getVpcHost() {
            return this.vpcHost;
        }

        public static final class Builder {
            private String privateHost; 
            private String publicHost; 
            private String vpcHost; 

            /**
             * The endpoint of the change tracking instance.
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * Indicates whether schema migration or schema synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: Schema migration or schema synchronization is performed.
             * *   **false**: Schema migration or schema synchronization is not performed.
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * Indicates whether incremental data migration or synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: Incremental data migration or synchronization is performed.
             * *   **false**: Incremental data migration or synchronization is not performed.
             */
            public Builder vpcHost(String vpcHost) {
                this.vpcHost = vpcHost;
                return this;
            }

            public SubscriptionHost build() {
                return new SubscriptionHost(this);
            } 

        } 

    }
}
