// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsJobDetailResponseBody</p>
 */
public class DescribeDtsJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("BeginTimestamp")
    private String beginTimestamp;

    @com.aliyun.core.annotation.NameInMap("Binlog")
    private String binlog;

    @com.aliyun.core.annotation.NameInMap("BinlogSite")
    private String binlogSite;

    @com.aliyun.core.annotation.NameInMap("BinlogTime")
    private String binlogTime;

    @com.aliyun.core.annotation.NameInMap("BootTime")
    private String bootTime;

    @com.aliyun.core.annotation.NameInMap("Checkpoint")
    private Long checkpoint;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("ConsumptionCheckpoint")
    private String consumptionCheckpoint;

    @com.aliyun.core.annotation.NameInMap("ConsumptionClient")
    private String consumptionClient;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DataDeliveryChannelInfo")
    private DataDeliveryChannelInfo dataDeliveryChannelInfo;

    @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
    private DataSynchronizationStatus dataSynchronizationStatus;

    @com.aliyun.core.annotation.NameInMap("DatabaseCount")
    private Integer databaseCount;

    @com.aliyun.core.annotation.NameInMap("DbObject")
    private String dbObject;

    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.NameInMap("Delay")
    private Long delay;

    @com.aliyun.core.annotation.NameInMap("DemoJob")
    private Boolean demoJob;

    @com.aliyun.core.annotation.NameInMap("DestNetType")
    private String destNetType;

    @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @com.aliyun.core.annotation.NameInMap("DtsBisLabel")
    private String dtsBisLabel;

    @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
    private String dtsInstanceID;

    @com.aliyun.core.annotation.NameInMap("DtsJobClass")
    private String dtsJobClass;

    @com.aliyun.core.annotation.NameInMap("DtsJobDirection")
    private String dtsJobDirection;

    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.NameInMap("DtsJobName")
    private String dtsJobName;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private String endTimestamp;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("EtlCalculator")
    private String etlCalculator;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @com.aliyun.core.annotation.NameInMap("MaxDu")
    private Double maxDu;

    @com.aliyun.core.annotation.NameInMap("MigrationMode")
    private MigrationMode migrationMode;

    @com.aliyun.core.annotation.NameInMap("MinDu")
    private Double minDu;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Reserved")
    private String reserved;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupDisplayName")
    private String resourceGroupDisplayName;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RetryState")
    private RetryState retryState;

    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubDistributedJob")
    private java.util.List<SubDistributedJob> subDistributedJob;

    @com.aliyun.core.annotation.NameInMap("SubSyncJob")
    private java.util.List<SubSyncJob> subSyncJob;

    @com.aliyun.core.annotation.NameInMap("SubscribeTopic")
    private String subscribeTopic;

    @com.aliyun.core.annotation.NameInMap("SubscriptionDataType")
    private SubscriptionDataType subscriptionDataType;

    @com.aliyun.core.annotation.NameInMap("SubscriptionHost")
    private SubscriptionHost subscriptionHost;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.NameInMap("TaskType")
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
        this.maxDu = builder.maxDu;
        this.migrationMode = builder.migrationMode;
        this.minDu = builder.minDu;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return maxDu
     */
    public Double getMaxDu() {
        return this.maxDu;
    }

    /**
     * @return migrationMode
     */
    public MigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    /**
     * @return minDu
     */
    public Double getMinDu() {
        return this.minDu;
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
    public java.util.List<SubDistributedJob> getSubDistributedJob() {
        return this.subDistributedJob;
    }

    /**
     * @return subSyncJob
     */
    public java.util.List<SubSyncJob> getSubSyncJob() {
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
        private Double maxDu; 
        private MigrationMode migrationMode; 
        private Double minDu; 
        private String payType; 
        private String requestId; 
        private String reserved; 
        private String resourceGroupDisplayName; 
        private String resourceGroupId; 
        private RetryState retryState; 
        private SourceEndpoint sourceEndpoint; 
        private String status; 
        private java.util.List<SubDistributedJob> subDistributedJob; 
        private java.util.List<SubSyncJob> subSyncJob; 
        private String subscribeTopic; 
        private SubscriptionDataType subscriptionDataType; 
        private SubscriptionHost subscriptionHost; 
        private Boolean success; 
        private String synchronizationDirection; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(DescribeDtsJobDetailResponseBody model) {
            this.appName = model.appName;
            this.beginTimestamp = model.beginTimestamp;
            this.binlog = model.binlog;
            this.binlogSite = model.binlogSite;
            this.binlogTime = model.binlogTime;
            this.bootTime = model.bootTime;
            this.checkpoint = model.checkpoint;
            this.code = model.code;
            this.consumptionCheckpoint = model.consumptionCheckpoint;
            this.consumptionClient = model.consumptionClient;
            this.createTime = model.createTime;
            this.dataDeliveryChannelInfo = model.dataDeliveryChannelInfo;
            this.dataSynchronizationStatus = model.dataSynchronizationStatus;
            this.databaseCount = model.databaseCount;
            this.dbObject = model.dbObject;
            this.dedicatedClusterId = model.dedicatedClusterId;
            this.delay = model.delay;
            this.demoJob = model.demoJob;
            this.destNetType = model.destNetType;
            this.destinationEndpoint = model.destinationEndpoint;
            this.dtsBisLabel = model.dtsBisLabel;
            this.dtsInstanceID = model.dtsInstanceID;
            this.dtsJobClass = model.dtsJobClass;
            this.dtsJobDirection = model.dtsJobDirection;
            this.dtsJobId = model.dtsJobId;
            this.dtsJobName = model.dtsJobName;
            this.dynamicMessage = model.dynamicMessage;
            this.endTimestamp = model.endTimestamp;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.errorMessage = model.errorMessage;
            this.etlCalculator = model.etlCalculator;
            this.expireTime = model.expireTime;
            this.finishTime = model.finishTime;
            this.groupId = model.groupId;
            this.httpStatusCode = model.httpStatusCode;
            this.jobType = model.jobType;
            this.lastUpdateTime = model.lastUpdateTime;
            this.maxDu = model.maxDu;
            this.migrationMode = model.migrationMode;
            this.minDu = model.minDu;
            this.payType = model.payType;
            this.requestId = model.requestId;
            this.reserved = model.reserved;
            this.resourceGroupDisplayName = model.resourceGroupDisplayName;
            this.resourceGroupId = model.resourceGroupId;
            this.retryState = model.retryState;
            this.sourceEndpoint = model.sourceEndpoint;
            this.status = model.status;
            this.subDistributedJob = model.subDistributedJob;
            this.subSyncJob = model.subSyncJob;
            this.subscribeTopic = model.subscribeTopic;
            this.subscriptionDataType = model.subscriptionDataType;
            this.subscriptionHost = model.subscriptionHost;
            this.success = model.success;
            this.synchronizationDirection = model.synchronizationDirection;
            this.taskType = model.taskType;
        } 

        /**
         * <p>Indicates whether the new change tracking feature is used.</p>
         * <blockquote>
         * <p>This parameter is returned only for change tracking instances of the new version.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>new</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-15T08:25:34Z</p>
         */
        public Builder beginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }

        /**
         * <p>The binary logs.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder binlog(String binlog) {
            this.binlog = binlog;
            return this;
        }

        /**
         * <p>The current offset.</p>
         * 
         * <strong>example:</strong>
         * <p>156629109****</p>
         */
        public Builder binlogSite(String binlogSite) {
            this.binlogSite = binlogSite;
            return this;
        }

        /**
         * <p>The offset range.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder binlogTime(String binlogTime) {
            this.binlogTime = binlogTime;
            return this;
        }

        /**
         * <p>The time when the task was started. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-30T03:36:11.000</p>
         */
        public Builder bootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }

        /**
         * <p>The start offset of incremental data migration or data synchronization. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1616405159</p>
         */
        public Builder checkpoint(Long checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * <p>The error code. This parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-23T07:30:31Z</p>
         */
        public Builder consumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }

        /**
         * <p>The downstream client information in the following format: &lt;IP address of the downstream client&gt;:&lt;Random ID generated by DTS&gt;.</p>
         * 
         * <strong>example:</strong>
         * <p>114.<em><strong>.</strong></em>.<strong>:dts</strong>******</p>
         */
        public Builder consumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-16T08:01:19Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The information about the data shipping channel.</p>
         */
        public Builder dataDeliveryChannelInfo(DataDeliveryChannelInfo dataDeliveryChannelInfo) {
            this.dataDeliveryChannelInfo = dataDeliveryChannelInfo;
            return this;
        }

        /**
         * <p>The state of incremental data migration or synchronization.</p>
         */
        public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }

        /**
         * <p>The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder databaseCount(Integer databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }

        /**
         * <p>The objects of the data migration, data synchronization, or change tracking task. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dtstestdata&quot;:{&quot;all&quot;:true,&quot;name&quot;:&quot;dtstestdata&quot;,&quot;state&quot;:&quot;normal&quot;}}</p>
         */
        public Builder dbObject(String dbObject) {
            this.dbObject = dbObject;
            return this;
        }

        /**
         * <p>The dedicated cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsxxxxx</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>The latency of incremental data migration or synchronization. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delay(Long delay) {
            this.delay = delay;
            return this;
        }

        /**
         * <p>Indicates whether the task is a subtask. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder demoJob(Boolean demoJob) {
            this.demoJob = demoJob;
            return this;
        }

        /**
         * <p>The network type of the consumer client. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC</strong>: classic network.</li>
         * <li><strong>VPC</strong>: virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder destNetType(String destNetType) {
            this.destNetType = destNetType;
            return this;
        }

        /**
         * <p>The connection settings of the destination instance.</p>
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * <p>The environment tag of the DTS instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>****</li>
         * <li><strong>online</strong>****</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder dtsBisLabel(String dtsBisLabel) {
            this.dtsBisLabel = dtsBisLabel;
            return this;
        }

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsi03e3zty16i****</p>
         */
        public Builder dtsInstanceID(String dtsInstanceID) {
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }

        /**
         * <p>The instance class.</p>
         * <blockquote>
         * <p>For more information about the description and test performance of each instance class, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration instances</a> and <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization instances</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        public Builder dtsJobClass(String dtsJobClass) {
            this.dtsJobClass = dtsJobClass;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong></li>
         * <li><strong>Reverse</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder dtsJobDirection(String dtsJobDirection) {
            this.dtsJobDirection = dtsJobDirection;
            return this;
        }

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>i03e3zty16i****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The name of the data migration, data synchronization, or change tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>api_test</p>
         */
        public Builder dtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. The value of this parameter is used to replace <strong>%s</strong> in the value of <strong>ErrMessage</strong>.</p>
         * <blockquote>
         * <p>For example, if the return value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsJobId</strong>, the specified value of <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DtsJobId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-26T14:03:21Z</p>
         */
        public Builder endTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error message returned if the task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The operator information of the ETL task.</p>
         * <blockquote>
         * <p>This parameter is returned only if you query the details of an ETL task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{ 	&quot;cells &quot;: [{&quot;shape&quot;:&quot;edge&quot;,&quot;attrs&quot;:{&quot;line&quot;:{&quot;stroke&quot;:&quot;#b1b1b1&quot;,&quot;strokeWidth&quot;:1,&quot;targetMarker&quot;:{&quot;name&quot;:&quot;block&quot;,&quot;args&quot;:{&quot;size&quot;:&quot;8&quot;}},&quot;strokeDasharray&quot;:&quot;&quot;}},&quot;id&quot;:&quot;cd1ec473-f9b9-4e9b-a742-ac23f442****&quot;,&quot;source&quot;:{&quot;cell&quot;:&quot;8b261182-bfab-4803-ad8e-6bb08e3e****&quot;,&quot;port&quot;:&quot;out1&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;b36770df-f48c-4d6b-9644-54c5e924****&quot;,&quot;port&quot;:&quot;in1&quot;},&quot;zIndex&quot;:7 	}] }</p>
         */
        public Builder etlCalculator(String etlCalculator) {
            this.etlCalculator = etlCalculator;
            return this;
        }

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p>This parameter is returned only if the return value of <strong>PayType</strong> is <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-06-16T08:01:19Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The time when the task was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-16T10:34:17Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The returned HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The type of the DTS task. Valid values:</p>
         * <ul>
         * <li><strong>sync</strong>: a data synchronization task.</li>
         * <li><strong>subSync</strong>: a subtask generated when the objects to be synchronized are modified.</li>
         * </ul>
         * <blockquote>
         * <p>In most cases, this parameter is returned together with <strong>TaskType</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sync</p>
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The timestamp when the task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>156629109****</p>
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * <p>The maximum number of DUs.</p>
         * <blockquote>
         * <p>This parameter is supported only for serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder maxDu(Double maxDu) {
            this.maxDu = maxDu;
            return this;
        }

        /**
         * <p>The migration types or initial synchronization types.</p>
         */
        public Builder migrationMode(MigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }

        /**
         * <p>The minimum number of DUs.</p>
         * <blockquote>
         * <p>This parameter is supported only for serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minDu(Double minDu) {
            this.minDu = minDu;
            return this;
        }

        /**
         * <p>The billing method of the DTS instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29207299-7C41-493A-BA4F-2FAC5DE4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, such as whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
         */
        public Builder reserved(String reserved) {
            this.reserved = reserved;
            return this;
        }

        /**
         * <p>The resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>default resource group</p>
         */
        public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The information about the retries performed by DTS due to an exception.</p>
         */
        public Builder retryState(RetryState retryState) {
            this.retryState = retryState;
            return this;
        }

        /**
         * <p>The connection settings of the source instance.</p>
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * <p>The state of the data migration or synchronization task. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>NotConfigured</strong>: The task is not configured.</li>
         * <li><strong>Prechecking</strong>: The task is in precheck.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
         * <li><strong>Initializing</strong>: Initial data synchronization is in progress.</li>
         * <li><strong>InitializeFailed</strong>: Initial data synchronization failed.</li>
         * <li><strong>synchronizing</strong>: Data synchronization is in progress.</li>
         * <li><strong>Migrating</strong>: Data migration is in progress.</li>
         * <li><strong>Failed</strong>: Data synchronization failed.</li>
         * <li><strong>MigrationFailed</strong>: Data migration failed.</li>
         * <li><strong>Suspending</strong>: The task is paused.</li>
         * <li><strong>Modifying</strong>: The objects of the task are being modified.</li>
         * <li><strong>Retrying</strong>: The task is being retried.</li>
         * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
         * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
         * <li><strong>Locked</strong>: The task is locked.</li>
         * <li><strong>Finished</strong>: The task is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Migrating</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The information about the subtasks in the current distributed task. If the DTS task is not a distributed task, the value of this parameter is null.</p>
         * <blockquote>
         * <p>This parameter is available only if the DTS task is a data synchronization task.</p>
         * </blockquote>
         */
        public Builder subDistributedJob(java.util.List<SubDistributedJob> subDistributedJob) {
            this.subDistributedJob = subDistributedJob;
            return this;
        }

        /**
         * <p>The information about the subtasks in the current data synchronization task.</p>
         */
        public Builder subSyncJob(java.util.List<SubSyncJob> subSyncJob) {
            this.subSyncJob = subSyncJob;
            return this;
        }

        /**
         * <p>The topic of the change tracking instance.</p>
         * <blockquote>
         * <p>This parameter is returned only if your change tracking instances are of the new version and you have called the <a href="https://help.aliyun.com/document_detail/122863.html">CreateConsumerGroup</a> operation to create a consumer group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn_hangzhou_rm_bp1162kryivb8****_dtstest_version2</p>
         */
        public Builder subscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }

        /**
         * <p>The type of data for change tracking.</p>
         */
        public Builder subscriptionDataType(SubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }

        /**
         * <p>The endpoint of the change tracking instance.</p>
         */
        public Builder subscriptionHost(SubscriptionHost subscriptionHost) {
            this.subscriptionHost = subscriptionHost;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong></li>
         * <li><strong>Reverse</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The default value is <strong>Forward</strong>.</li>
         * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * <p>The type of the task.</p>
         * <blockquote>
         * <p>In most cases, this parameter is returned together with <strong>JobType</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Distributed_xxx</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public DescribeDtsJobDetailResponseBody build() {
            return new DescribeDtsJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class DataDeliveryChannelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PartitionNum")
        private Integer partitionNum;

        @com.aliyun.core.annotation.NameInMap("PublicDproxyUrl")
        private String publicDproxyUrl;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("VpcDproxyUrl")
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

            private Builder() {
            } 

            private Builder(DataDeliveryChannelInfo model) {
                this.partitionNum = model.partitionNum;
                this.publicDproxyUrl = model.publicDproxyUrl;
                this.region = model.region;
                this.topic = model.topic;
                this.vpcDproxyUrl = model.vpcDproxyUrl;
            } 

            /**
             * <p>The number of partitions of the destination topic.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder partitionNum(Integer partitionNum) {
                this.partitionNum = partitionNum;
                return this;
            }

            /**
             * <p>The public endpoint of the data shipping channel.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-****.aliyuncs.com:18***</p>
             */
            public Builder publicDproxyUrl(String publicDproxyUrl) {
                this.publicDproxyUrl = publicDproxyUrl;
                return this;
            }

            /**
             * <p>The region in which the data shipping channel resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The destination topic of the data shipping instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn_hangzhou_******_data_delivery_version2</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The VPC endpoint of the data shipping channel.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-****.aliyuncs.com:18***</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class DataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(DataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if incremental data migration or synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of incremental data migration or synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of rows and size of data that is synchronized or migrated to the destination table per second during incremental data synchronization or migration.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00RPS/(0.000MB/s)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Suspending</strong>: The task is paused.</li>
             * <li><strong>Checking</strong>: The task is in precheck.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Catched</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class DestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CanModifyPassword")
        private Boolean canModifyPassword;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
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

        public static DestinationEndpoint create() {
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

            private Builder() {
            } 

            private Builder(DestinationEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.canModifyPassword = model.canModifyPassword;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>Indicates whether the password can be modified. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canModifyPassword(Boolean canModifyPassword) {
                this.canModifyPassword = canModifyPassword;
                return this;
            }

            /**
             * <p>The name of the database to which the objects are migrated in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The destination instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1imrtn6fq7h****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class MigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
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

            private Builder() {
            } 

            private Builder(MigrationMode model) {
                this.dataExtractTransformLoad = model.dataExtractTransformLoad;
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether data transformation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class RetryState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryTarget")
        private String retryTarget;

        @com.aliyun.core.annotation.NameInMap("RetryTime")
        private Integer retryTime;

        @com.aliyun.core.annotation.NameInMap("Retrying")
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

            private Builder() {
            } 

            private Builder(RetryState model) {
                this.errMessage = model.errMessage;
                this.jobId = model.jobId;
                this.maxRetryTime = model.maxRetryTime;
                this.module = model.module;
                this.retryCount = model.retryCount;
                this.retryTarget = model.retryTarget;
                this.retryTime = model.retryTime;
                this.retrying = model.retrying;
            } 

            /**
             * <p>The error message returned if these retries failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Unexpected error</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bi6e22ay243****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The maximum duration of a retry. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * <p>The progress of the instance when DTS performs retries.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The object on which the retries are performed. Valid values:</p>
             * <ul>
             * <li><strong>srcDB</strong>: the source database.</li>
             * <li><strong>destDB</strong>: the destination database.</li>
             * <li><strong>inner_module</strong>: an internal module of DTS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>srcDB</p>
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * <p>The time that has elapsed from the point in time when the first retry starts. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * <p>Indicates whether the task is being retried. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CanModifyPassword")
        private Boolean canModifyPassword;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.canModifyPassword = model.canModifyPassword;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>Indicates whether the password can be modified. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canModifyPassword(Boolean canModifyPassword) {
                this.canModifyPassword = canModifyPassword;
                return this;
            }

            /**
             * <p>The name of the database from which the objects are migrated in the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1162kryivb8****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The system ID (SID) of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the source instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-Real Application Cluster (RAC) architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the Resource Access Management (RAM) role configured for the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class DataEtlStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(DataEtlStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that are migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the ETL task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class DataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(DataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if full data migration or initial full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that are migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobDataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobDataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of rows and size of data that is synchronized or migrated to the destination table per second during incremental data synchronization or migration.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00RPS/(0.000MB/s)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Suspending</strong>: The task is paused.</li>
             * <li><strong>Checking</strong>: The task is in precheck.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Catched</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobDestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobDestinationEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The name of the database to which the objects are migrated in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The destination instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1f9guj5rhzq****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the RAM role configured for the Alibaba Cloud account to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobMigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobMigrationMode model) {
                this.dataExtractTransformLoad = model.dataExtractTransformLoad;
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether data transformation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class Performance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("Rps")
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

            private Builder() {
            } 

            private Builder(Performance model) {
                this.flow = model.flow;
                this.rps = model.rps;
            } 

            /**
             * <p>The size of data that is migrated or synchronized per second. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
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

            private Builder() {
            } 

            private Builder(Detail model) {
                this.checkItem = model.checkItem;
                this.checkItemDescription = model.checkItemDescription;
                this.checkResult = model.checkResult;
                this.failedReason = model.failedReason;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The name of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>The description of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC_DETAIL</p>
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * <p>The precheck result. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The error message returned if the task failed to pass the precheck.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The method used to fix the precheck failure.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class PrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<Detail> getDetail() {
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
            private java.util.List<Detail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(PrecheckStatus model) {
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck state. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Prechecking</strong>: The task is in precheck.</li>
             * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobRetryState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryTarget")
        private String retryTarget;

        @com.aliyun.core.annotation.NameInMap("RetryTime")
        private Integer retryTime;

        @com.aliyun.core.annotation.NameInMap("Retrying")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobRetryState model) {
                this.errMsg = model.errMsg;
                this.jobId = model.jobId;
                this.maxRetryTime = model.maxRetryTime;
                this.module = model.module;
                this.retryCount = model.retryCount;
                this.retryTarget = model.retryTarget;
                this.retryTime = model.retryTime;
                this.retrying = model.retrying;
            } 

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ta7w132u12h****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The maximum duration of a retry. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * <p>The progress of the instance when DTS performs retries.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The object on which the retries are performed. Valid values:</p>
             * <ul>
             * <li><strong>srcDB</strong>: the source database.</li>
             * <li><strong>destDB</strong>: the destination database.</li>
             * <li><strong>inner_module</strong>: an internal module of DTS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>srcDB</p>
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * <p>The time that has elapsed from the point in time when the first retry starts. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * <p>Indicates whether the task is being retried. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobDataEtlStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ReverseJobDataEtlStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that are migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the ETL task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobDataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ReverseJobDataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if full data migration or initial full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that are migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobDataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ReverseJobDataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of rows and size of data that is synchronized or migrated to the destination table per second during incremental data synchronization or migration.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00RPS/(0.000MB/s)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Suspending</strong>: The task is paused.</li>
             * <li><strong>Checking</strong>: The task is in precheck.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Catched</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobDestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(ReverseJobDestinationEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The name of the database to which the objects are migrated in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The destination instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1f9guj5rhzq****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the RAM role configured for the Alibaba Cloud account to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobMigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
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

            private Builder() {
            } 

            private Builder(ReverseJobMigrationMode model) {
                this.dataExtractTransformLoad = model.dataExtractTransformLoad;
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether data transformation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobPerformance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("Rps")
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

            private Builder() {
            } 

            private Builder(ReverseJobPerformance model) {
                this.flow = model.flow;
                this.rps = model.rps;
            } 

            /**
             * <p>The size of data that is migrated or synchronized per second. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class PrecheckStatusDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
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

            private Builder() {
            } 

            private Builder(PrecheckStatusDetail model) {
                this.checkItem = model.checkItem;
                this.checkItemDescription = model.checkItemDescription;
                this.checkResult = model.checkResult;
                this.failedReason = model.failedReason;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The name of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>The description of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC_DETAIL</p>
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * <p>The precheck result. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The error message returned if the task failed to pass the precheck.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The method used to fix the precheck failure.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobPrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<PrecheckStatusDetail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<PrecheckStatusDetail> getDetail() {
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
            private java.util.List<PrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(ReverseJobPrecheckStatus model) {
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<PrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck state. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Prechecking</strong>: The task is in precheck.</li>
             * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobRetryState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryTarget")
        private String retryTarget;

        @com.aliyun.core.annotation.NameInMap("RetryTime")
        private Integer retryTime;

        @com.aliyun.core.annotation.NameInMap("Retrying")
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

            private Builder() {
            } 

            private Builder(ReverseJobRetryState model) {
                this.errMsg = model.errMsg;
                this.jobId = model.jobId;
                this.maxRetryTime = model.maxRetryTime;
                this.module = model.module;
                this.retryCount = model.retryCount;
                this.retryTarget = model.retryTarget;
                this.retryTime = model.retryTime;
                this.retrying = model.retrying;
            } 

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ta7w132u12h****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The maximum duration of a retry. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * <p>The progress of the instance when DTS performs retries.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The object on which the retries are performed. Valid values:</p>
             * <ul>
             * <li><strong>srcDB</strong>: the source database.</li>
             * <li><strong>destDB</strong>: the destination database.</li>
             * <li><strong>inner_module</strong>: an internal module of DTS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>srcDB</p>
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * <p>The time that has elapsed from the point in time when the first retry starts. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * <p>Indicates whether the task is being retried. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobSourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(ReverseJobSourceEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The name of the database from which the objects are migrated in the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp2f3huj5rhzq****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the RAM role configured for the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class StructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(StructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>Error message indicating task failure.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Whether to display upgrade specifications, return value:</p>
             * <ul>
             * <li>True: Yes.</li>
             * <li>False: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>Initialization progress of library table structure, measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have completed library table structure initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The initialization status of the library table structure includes:</p>
             * <ul>
             * <li>NotStarted: Not started.</li>
             * <li>Migration: In the process of initialization.</li>
             * <li>Failed: Initialization failed.</li>
             * <li>Finished: Initialization completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobSubscriptionDataType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ddl")
        private Boolean ddl;

        @com.aliyun.core.annotation.NameInMap("Dml")
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

            private Builder() {
            } 

            private Builder(ReverseJobSubscriptionDataType model) {
                this.ddl = model.ddl;
                this.dml = model.dml;
            } 

            /**
             * <p>Indicates whether DDL statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * <p>Indicates whether DML statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobSubscriptionHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateHost")
        private String privateHost;

        @com.aliyun.core.annotation.NameInMap("PublicHost")
        private String publicHost;

        @com.aliyun.core.annotation.NameInMap("VpcHost")
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

            private Builder() {
            } 

            private Builder(ReverseJobSubscriptionHost model) {
                this.privateHost = model.privateHost;
                this.publicHost = model.publicHost;
                this.vpcHost = model.vpcHost;
            } 

            /**
             * <p>The private endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****-internal.aliyuncs.com:18002</p>
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * <p>The public endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * <p>The VPC endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Long creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("TagCategory")
        private String tagCategory;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(TagList model) {
                this.aliUid = model.aliUid;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.scope = model.scope;
                this.srcRegion = model.srcRegion;
                this.tagCategory = model.tagCategory;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>191448876515****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The operator of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>191448876515****</p>
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The primary key of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::DTS::INSTANCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Indicates whether the tag is visible. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The tag is public.</li>
             * <li><strong>1</strong>: The tag is private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The ID of the region in which the DTS task resides.</p>
             * <blockquote>
             * <p>In most cases, the ID of the region in which the destination instance resides is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the tag. Valid values:</p>
             * <ul>
             * <li><strong>System</strong>: The tag was created by the system.</li>
             * <li><strong>Custom</strong>: The tag was created by a user.</li>
             * </ul>
             * <blockquote>
             * <p>By default, if the parameter is left empty, custom tags and system tags are returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder tagCategory(String tagCategory) {
                this.tagCategory = tagCategory;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionClient")
        private String consumptionClient;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataEtlStatus")
        private ReverseJobDataEtlStatus dataEtlStatus;

        @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
        private ReverseJobDataInitializationStatus dataInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
        private ReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @com.aliyun.core.annotation.NameInMap("DatabaseCount")
        private Integer databaseCount;

        @com.aliyun.core.annotation.NameInMap("DbObject")
        private String dbObject;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestNetType")
        private String destNetType;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private ReverseJobDestinationEndpoint destinationEndpoint;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @com.aliyun.core.annotation.NameInMap("DtsJobClass")
        private String dtsJobClass;

        @com.aliyun.core.annotation.NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("DtsJobName")
        private String dtsJobName;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private String endTimestamp;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EtlCalculator")
        private String etlCalculator;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("IsDemoJob")
        private Boolean isDemoJob;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MaxDu")
        private Double maxDu;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private ReverseJobMigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("MinDu")
        private Double minDu;

        @com.aliyun.core.annotation.NameInMap("OriginType")
        private String originType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private ReverseJobPerformance performance;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private ReverseJobPrecheckStatus precheckStatus;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private String reserved;

        @com.aliyun.core.annotation.NameInMap("RetryState")
        private ReverseJobRetryState retryState;

        @com.aliyun.core.annotation.NameInMap("ReverseJob")
        private Object reverseJob;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private ReverseJobSourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
        private StructureInitializationStatus structureInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDataType")
        private ReverseJobSubscriptionDataType subscriptionDataType;

        @com.aliyun.core.annotation.NameInMap("SubscriptionHost")
        private ReverseJobSubscriptionHost subscriptionHost;

        @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
            this.maxDu = builder.maxDu;
            this.migrationMode = builder.migrationMode;
            this.minDu = builder.minDu;
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
         * @return maxDu
         */
        public Double getMaxDu() {
            return this.maxDu;
        }

        /**
         * @return migrationMode
         */
        public ReverseJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return minDu
         */
        public Double getMinDu() {
            return this.minDu;
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
        public java.util.List<TagList> getTagList() {
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
            private Double maxDu; 
            private ReverseJobMigrationMode migrationMode; 
            private Double minDu; 
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
            private java.util.List<TagList> tagList; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(ReverseJob model) {
                this.appName = model.appName;
                this.beginTimestamp = model.beginTimestamp;
                this.checkpoint = model.checkpoint;
                this.consumptionCheckpoint = model.consumptionCheckpoint;
                this.consumptionClient = model.consumptionClient;
                this.createTime = model.createTime;
                this.dataEtlStatus = model.dataEtlStatus;
                this.dataInitializationStatus = model.dataInitializationStatus;
                this.dataSynchronizationStatus = model.dataSynchronizationStatus;
                this.databaseCount = model.databaseCount;
                this.dbObject = model.dbObject;
                this.delay = model.delay;
                this.destNetType = model.destNetType;
                this.destinationEndpoint = model.destinationEndpoint;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobDirection = model.dtsJobDirection;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.endTimestamp = model.endTimestamp;
                this.errorMessage = model.errorMessage;
                this.etlCalculator = model.etlCalculator;
                this.expireTime = model.expireTime;
                this.finishTime = model.finishTime;
                this.groupId = model.groupId;
                this.isDemoJob = model.isDemoJob;
                this.jobType = model.jobType;
                this.maxDu = model.maxDu;
                this.migrationMode = model.migrationMode;
                this.minDu = model.minDu;
                this.originType = model.originType;
                this.payType = model.payType;
                this.performance = model.performance;
                this.precheckStatus = model.precheckStatus;
                this.reserved = model.reserved;
                this.retryState = model.retryState;
                this.reverseJob = model.reverseJob;
                this.sourceEndpoint = model.sourceEndpoint;
                this.status = model.status;
                this.structureInitializationStatus = model.structureInitializationStatus;
                this.subscribeTopic = model.subscribeTopic;
                this.subscriptionDataType = model.subscriptionDataType;
                this.subscriptionHost = model.subscriptionHost;
                this.synchronizationDirection = model.synchronizationDirection;
                this.tagList = model.tagList;
                this.taskType = model.taskType;
            } 

            /**
             * <p>Indicates whether the new change tracking feature is used.</p>
             * <blockquote>
             * <p>This parameter is returned only for change tracking instances of the new version.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-15T08:25:34Z</p>
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * <p>The start offset of incremental data migration or data synchronization. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616405159</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-23T07:30:31Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The downstream client information in the following format: &lt;IP address of the downstream client&gt;:&lt;Random ID generated by DTS&gt;.</p>
             * 
             * <strong>example:</strong>
             * <p>114.<em><strong>.</strong></em>.<strong>:dts</strong>******</p>
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-12T08:34:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The state of the ETL task.</p>
             * <blockquote>
             * <p>This parameter collection is returned only if an ETL task is configured.</p>
             * </blockquote>
             */
            public Builder dataEtlStatus(ReverseJobDataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization.</p>
             */
            public Builder dataInitializationStatus(ReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization.</p>
             */
            public Builder dataSynchronizationStatus(ReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
                return this;
            }

            /**
             * <p>The objects of the data migration, data synchronization, or change tracking task. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;:{&quot;all&quot;:true,&quot;name&quot;:&quot;dtstestdata&quot;,&quot;state&quot;:&quot;normal&quot;}}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The latency of incremental data migration or synchronization. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The network type of the consumer client. Valid values:</p>
             * <ul>
             * <li><strong>CLASSIC</strong>: classic network.</li>
             * <li><strong>VPC</strong>: VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder destNetType(String destNetType) {
                this.destNetType = destNetType;
                return this;
            }

            /**
             * <p>The connection settings of the destination instance.</p>
             */
            public Builder destinationEndpoint(ReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The DTS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The instance class.</p>
             * 
             * <strong>example:</strong>
             * <p>xlarge</p>
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * <p>The DTS task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m06j1g92124****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The DTS instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest****</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-26T14:03:21Z</p>
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The operator information of the ETL task.</p>
             * <blockquote>
             * <p>This parameter is returned only if you query the details of an ETL task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;cells &quot;: [{&quot;shape&quot;:&quot;edge&quot;,&quot;attrs&quot;:{&quot;line&quot;:{&quot;stroke&quot;:&quot;#b1b1b1&quot;,&quot;strokeWidth&quot;:1,&quot;targetMarker&quot;:{&quot;name&quot;:&quot;block&quot;,&quot;args&quot;:{&quot;size&quot;:&quot;8&quot;}},&quot;strokeDasharray&quot;:&quot;&quot;}},&quot;id&quot;:&quot;cd1ec473-f9b9-4e9b-a742-ac23f442****&quot;,&quot;source&quot;:{&quot;cell&quot;:&quot;8b261182-bfab-4803-ad8e-6bb08e3e****&quot;,&quot;port&quot;:&quot;out1&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;b36770df-f48c-4d6b-9644-54c5e924****&quot;,&quot;port&quot;:&quot;in1&quot;},&quot;zIndex&quot;:7 }] }</p>
             */
            public Builder etlCalculator(String etlCalculator) {
                this.etlCalculator = etlCalculator;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>PayType</strong> is <strong>PrePaid</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T08:01:19Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the task was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T10:34:17Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxc****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether the task is a subtask. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDemoJob(Boolean isDemoJob) {
                this.isDemoJob = isDemoJob;
                return this;
            }

            /**
             * <p>The type of the DTS task. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: data migration task.</li>
             * <li><strong>SYNC</strong>: data synchronization task.</li>
             * <li><strong>SUBSCRIBE</strong>: change tracking task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYNC</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The maximum number of DUs.</p>
             * <blockquote>
             * <p>This parameter is supported only for serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * <p>The migration types or initial synchronization types.</p>
             */
            public Builder migrationMode(ReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>The minimum number of DTS Units (DUs).</p>
             * <blockquote>
             * <p>This parameter is supported only for serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minDu(Double minDu) {
                this.minDu = minDu;
                return this;
            }

            /**
             * <p>The source of the task. Valid values:</p>
             * <ul>
             * <li><strong>PTS</strong></li>
             * <li><strong>DMS</strong></li>
             * <li><strong>DTS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DTS</p>
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription.</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The performance of the data migration or synchronization instance.</p>
             */
            public Builder performance(ReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck state.</p>
             */
            public Builder precheckStatus(ReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, such as whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * <p>The information about the retries performed by DTS due to an exception.</p>
             */
            public Builder retryState(ReverseJobRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * <p>The details of the data synchronization task in the reverse direction.</p>
             * <blockquote>
             * <p>This parameter is returned only for two-way data synchronization tasks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder reverseJob(Object reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(ReverseJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The state of initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Initialization status of library table structure.</p>
             */
            public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * <p>The topic of the change tracking instance.</p>
             * <blockquote>
             * <p>This parameter is returned only if your change tracking instances are of the new version and you have called the <a href="https://help.aliyun.com/document_detail/122863.html">CreateConsumerGroup</a> operation to create a consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn_hangzhou_rm_bp1162kryivb8****_dtstest_version2</p>
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * <p>The type of data for change tracking.</p>
             */
            public Builder subscriptionDataType(ReverseJobSubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * <p>The endpoint of the change tracking instance.</p>
             */
            public Builder subscriptionHost(ReverseJobSubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>The default value is <strong>Forward</strong>.</li>
             * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * <p>The tags of the task.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobSourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobSourceEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The name of the database from which the objects are migrated in the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the RAM role configured for the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobStructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobStructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Whether to display upgrade specifications, return value:</p>
             * <ul>
             * <li>True: Yes.</li>
             * <li>False: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>Initialization progress of library table structure, measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have completed library table structure initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The initialization status of the library table structure includes:</p>
             * <ul>
             * <li>NotStarted: Not started.</li>
             * <li>Migration: In the process of initialization.</li>
             * <li>Failed: Initialization failed.</li>
             * <li>Finished: Initialization completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobSubscriptionDataType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ddl")
        private Boolean ddl;

        @com.aliyun.core.annotation.NameInMap("Dml")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobSubscriptionDataType model) {
                this.ddl = model.ddl;
                this.dml = model.dml;
            } 

            /**
             * <p>Indicates whether DDL statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * <p>Indicates whether DML statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobSubscriptionHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateHost")
        private String privateHost;

        @com.aliyun.core.annotation.NameInMap("PublicHost")
        private String publicHost;

        @com.aliyun.core.annotation.NameInMap("VpcHost")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobSubscriptionHost model) {
                this.privateHost = model.privateHost;
                this.publicHost = model.publicHost;
                this.vpcHost = model.vpcHost;
            } 

            /**
             * <p>The private endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****-internal.aliyuncs.com:18002</p>
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * <p>The public endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * <p>The VPC endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJobTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Long creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("TagCategory")
        private String tagCategory;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(SubDistributedJobTagList model) {
                this.aliUid = model.aliUid;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.scope = model.scope;
                this.srcRegion = model.srcRegion;
                this.tagCategory = model.tagCategory;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>191448876515****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The operator of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>191448876515****</p>
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The primary key of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the region in which the DTS task resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::DTS::INSTANCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Indicates whether the tag is visible. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The tag is public.</li>
             * <li><strong>1</strong>: The tag is private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The ID of the region in which the DTS task resides.</p>
             * <blockquote>
             * <p>In most cases, the ID of the region in which the destination instance resides is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the tag. Valid values:</p>
             * <ul>
             * <li><strong>System</strong>: The tag was created by the system.</li>
             * <li><strong>Custom</strong>: The tag was created by a user.</li>
             * </ul>
             * <blockquote>
             * <p>By default, if the parameter is left empty, custom tags and system tags are returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder tagCategory(String tagCategory) {
                this.tagCategory = tagCategory;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubDistributedJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionClient")
        private String consumptionClient;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataEtlStatus")
        private DataEtlStatus dataEtlStatus;

        @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
        private DataInitializationStatus dataInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
        private SubDistributedJobDataSynchronizationStatus dataSynchronizationStatus;

        @com.aliyun.core.annotation.NameInMap("DatabaseCount")
        private Integer databaseCount;

        @com.aliyun.core.annotation.NameInMap("DbObject")
        private String dbObject;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestNetType")
        private String destNetType;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private SubDistributedJobDestinationEndpoint destinationEndpoint;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @com.aliyun.core.annotation.NameInMap("DtsJobClass")
        private String dtsJobClass;

        @com.aliyun.core.annotation.NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("DtsJobName")
        private String dtsJobName;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private String endTimestamp;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EtlCalculator")
        private String etlCalculator;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("IsDemoJob")
        private Boolean isDemoJob;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MaxDu")
        private Double maxDu;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private SubDistributedJobMigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("MinDu")
        private Double minDu;

        @com.aliyun.core.annotation.NameInMap("OriginType")
        private String originType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private Performance performance;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private PrecheckStatus precheckStatus;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private String reserved;

        @com.aliyun.core.annotation.NameInMap("RetryState")
        private SubDistributedJobRetryState retryState;

        @com.aliyun.core.annotation.NameInMap("ReverseJob")
        private ReverseJob reverseJob;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private SubDistributedJobSourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
        private SubDistributedJobStructureInitializationStatus structureInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("SubSyncJob")
        private java.util.List<?> subSyncJob;

        @com.aliyun.core.annotation.NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDataType")
        private SubDistributedJobSubscriptionDataType subscriptionDataType;

        @com.aliyun.core.annotation.NameInMap("SubscriptionHost")
        private SubDistributedJobSubscriptionHost subscriptionHost;

        @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<SubDistributedJobTagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
            this.maxDu = builder.maxDu;
            this.migrationMode = builder.migrationMode;
            this.minDu = builder.minDu;
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
         * @return maxDu
         */
        public Double getMaxDu() {
            return this.maxDu;
        }

        /**
         * @return migrationMode
         */
        public SubDistributedJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return minDu
         */
        public Double getMinDu() {
            return this.minDu;
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
        public java.util.List<?> getSubSyncJob() {
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
        public java.util.List<SubDistributedJobTagList> getTagList() {
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
            private Double maxDu; 
            private SubDistributedJobMigrationMode migrationMode; 
            private Double minDu; 
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
            private java.util.List<?> subSyncJob; 
            private String subscribeTopic; 
            private SubDistributedJobSubscriptionDataType subscriptionDataType; 
            private SubDistributedJobSubscriptionHost subscriptionHost; 
            private String synchronizationDirection; 
            private java.util.List<SubDistributedJobTagList> tagList; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(SubDistributedJob model) {
                this.appName = model.appName;
                this.beginTimestamp = model.beginTimestamp;
                this.checkpoint = model.checkpoint;
                this.consumptionCheckpoint = model.consumptionCheckpoint;
                this.consumptionClient = model.consumptionClient;
                this.createTime = model.createTime;
                this.dataEtlStatus = model.dataEtlStatus;
                this.dataInitializationStatus = model.dataInitializationStatus;
                this.dataSynchronizationStatus = model.dataSynchronizationStatus;
                this.databaseCount = model.databaseCount;
                this.dbObject = model.dbObject;
                this.delay = model.delay;
                this.destNetType = model.destNetType;
                this.destinationEndpoint = model.destinationEndpoint;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobDirection = model.dtsJobDirection;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.endTimestamp = model.endTimestamp;
                this.errorMessage = model.errorMessage;
                this.etlCalculator = model.etlCalculator;
                this.expireTime = model.expireTime;
                this.finishTime = model.finishTime;
                this.groupId = model.groupId;
                this.isDemoJob = model.isDemoJob;
                this.jobType = model.jobType;
                this.maxDu = model.maxDu;
                this.migrationMode = model.migrationMode;
                this.minDu = model.minDu;
                this.originType = model.originType;
                this.payType = model.payType;
                this.performance = model.performance;
                this.precheckStatus = model.precheckStatus;
                this.reserved = model.reserved;
                this.retryState = model.retryState;
                this.reverseJob = model.reverseJob;
                this.sourceEndpoint = model.sourceEndpoint;
                this.status = model.status;
                this.structureInitializationStatus = model.structureInitializationStatus;
                this.subSyncJob = model.subSyncJob;
                this.subscribeTopic = model.subscribeTopic;
                this.subscriptionDataType = model.subscriptionDataType;
                this.subscriptionHost = model.subscriptionHost;
                this.synchronizationDirection = model.synchronizationDirection;
                this.tagList = model.tagList;
                this.taskType = model.taskType;
            } 

            /**
             * <p>Indicates whether the new change tracking feature is used.</p>
             * <blockquote>
             * <p>This parameter is returned only for change tracking instances of the new version.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-15T08:25:34Z</p>
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * <p>The start offset of incremental data migration or data synchronization. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616405159</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-23T07:30:31Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The downstream client information in the following format: &lt;IP address of the downstream client&gt;:&lt;Random ID generated by DTS&gt;.</p>
             * 
             * <strong>example:</strong>
             * <p>114.<em><strong>.</strong></em>.<strong>:dts</strong>******</p>
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-12T08:34:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The state of the ETL task.</p>
             * <blockquote>
             * <p>This parameter collection is returned only if an ETL task is configured.</p>
             * </blockquote>
             */
            public Builder dataEtlStatus(DataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization.</p>
             */
            public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization.</p>
             */
            public Builder dataSynchronizationStatus(SubDistributedJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
                return this;
            }

            /**
             * <p>The objects of the data migration, data synchronization, or change tracking task. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;:{&quot;all&quot;:true,&quot;name&quot;:&quot;dtstestdata&quot;,&quot;state&quot;:&quot;normal&quot;}}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The latency of incremental data migration or synchronization. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The network type of the consumer client. Valid values:</p>
             * <ul>
             * <li><strong>CLASSIC</strong>: classic network.</li>
             * <li><strong>VPC</strong>: VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder destNetType(String destNetType) {
                this.destNetType = destNetType;
                return this;
            }

            /**
             * <p>The connection settings of the destination instance.</p>
             */
            public Builder destinationEndpoint(SubDistributedJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The DTS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The instance class.</p>
             * 
             * <strong>example:</strong>
             * <p>xlarge</p>
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * <p>The DTS task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m06j1g92124****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The DTS instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest****</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-26T14:03:21Z</p>
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The operator information of the ETL task.</p>
             * <blockquote>
             * <p>This parameter is returned only if you query the details of an ETL task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;cells &quot;: [{&quot;shape&quot;:&quot;edge&quot;,&quot;attrs&quot;:{&quot;line&quot;:{&quot;stroke&quot;:&quot;#b1b1b1&quot;,&quot;strokeWidth&quot;:1,&quot;targetMarker&quot;:{&quot;name&quot;:&quot;block&quot;,&quot;args&quot;:{&quot;size&quot;:&quot;8&quot;}},&quot;strokeDasharray&quot;:&quot;&quot;}},&quot;id&quot;:&quot;cd1ec473-f9b9-4e9b-a742-ac23f442****&quot;,&quot;source&quot;:{&quot;cell&quot;:&quot;8b261182-bfab-4803-ad8e-6bb08e3e****&quot;,&quot;port&quot;:&quot;out1&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;b36770df-f48c-4d6b-9644-54c5e924****&quot;,&quot;port&quot;:&quot;in1&quot;},&quot;zIndex&quot;:7 }] }</p>
             */
            public Builder etlCalculator(String etlCalculator) {
                this.etlCalculator = etlCalculator;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>PayType</strong> is <strong>PrePaid</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T08:01:19Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the task was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T10:34:17Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxc****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether the task is a subtask. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDemoJob(Boolean isDemoJob) {
                this.isDemoJob = isDemoJob;
                return this;
            }

            /**
             * <p>The type of the DTS task. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: data migration task.</li>
             * <li><strong>SYNC</strong>: data synchronization task.</li>
             * <li><strong>SUBSCRIBE</strong>: change tracking task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYNC</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The maximum number of DUs.</p>
             * <blockquote>
             * <p>This parameter is supported only for serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * <p>The migration types or initial synchronization types.</p>
             */
            public Builder migrationMode(SubDistributedJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>The minimum number of DUs.</p>
             * <blockquote>
             * <p>This parameter is supported only for serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minDu(Double minDu) {
                this.minDu = minDu;
                return this;
            }

            /**
             * <p>The source of the task. Valid values:</p>
             * <ul>
             * <li><strong>PTS</strong></li>
             * <li><strong>DMS</strong></li>
             * <li><strong>DTS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DTS</p>
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription.</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The performance of the data migration or synchronization instance.</p>
             */
            public Builder performance(Performance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck state.</p>
             */
            public Builder precheckStatus(PrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, such as whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * <p>The information about the retries performed by DTS due to an exception.</p>
             */
            public Builder retryState(SubDistributedJobRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * <p>The details of the data synchronization task in the reverse direction.</p>
             * <blockquote>
             * <p>This parameter is returned only for two-way data synchronization tasks.</p>
             * </blockquote>
             */
            public Builder reverseJob(ReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(SubDistributedJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The state of initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Initialization status of library table structure.</p>
             */
            public Builder structureInitializationStatus(SubDistributedJobStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * <p>The information about the subtasks in the current data synchronization task.</p>
             */
            public Builder subSyncJob(java.util.List<?> subSyncJob) {
                this.subSyncJob = subSyncJob;
                return this;
            }

            /**
             * <p>The topic of the change tracking instance.</p>
             * <blockquote>
             * <p>This parameter is returned only if your change tracking instances are of the new version and you have called the <a href="https://help.aliyun.com/document_detail/122863.html">CreateConsumerGroup</a> operation to create a consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn_hangzhou_rm_bp1162kryivb8****_dtstest_version2</p>
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * <p>The type of data for change tracking.</p>
             */
            public Builder subscriptionDataType(SubDistributedJobSubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * <p>The endpoint of the change tracking instance.</p>
             */
            public Builder subscriptionHost(SubDistributedJobSubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>The default value is <strong>Forward</strong>.</li>
             * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * <p>The tags of the task.</p>
             */
            public Builder tagList(java.util.List<SubDistributedJobTagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobDataEtlStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubSyncJobDataEtlStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that are migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the ETL task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobDataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubSyncJobDataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if full data migration or initial full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that are migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobDataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubSyncJobDataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of rows and size of data that is synchronized or migrated to the destination table per second during incremental data synchronization or migration.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00RPS/(0.000MB/s)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Suspending</strong>: The task is paused.</li>
             * <li><strong>Checking</strong>: The task is in precheck.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Catched</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobDestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(SubSyncJobDestinationEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The name of the database to which the objects are migrated in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The destination instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1f9guj5rhzq****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the RAM role configured for the Alibaba Cloud account to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobMigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
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

            private Builder() {
            } 

            private Builder(SubSyncJobMigrationMode model) {
                this.dataExtractTransformLoad = model.dataExtractTransformLoad;
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether data transformation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobPerformance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("Rps")
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

            private Builder() {
            } 

            private Builder(SubSyncJobPerformance model) {
                this.flow = model.flow;
                this.rps = model.rps;
            } 

            /**
             * <p>The size of data that is migrated or synchronized per second. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobPrecheckStatusDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
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

            private Builder() {
            } 

            private Builder(SubSyncJobPrecheckStatusDetail model) {
                this.checkItem = model.checkItem;
                this.checkItemDescription = model.checkItemDescription;
                this.checkResult = model.checkResult;
                this.failedReason = model.failedReason;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The name of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>The description of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC_DETAIL</p>
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * <p>The precheck result. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The error message returned if the task failed to pass the precheck.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The method used to fix the precheck failure.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobPrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<SubSyncJobPrecheckStatusDetail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<SubSyncJobPrecheckStatusDetail> getDetail() {
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
            private java.util.List<SubSyncJobPrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(SubSyncJobPrecheckStatus model) {
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<SubSyncJobPrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck state. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Prechecking</strong>: The task is in precheck.</li>
             * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobRetryState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryTarget")
        private String retryTarget;

        @com.aliyun.core.annotation.NameInMap("RetryTime")
        private Integer retryTime;

        @com.aliyun.core.annotation.NameInMap("Retrying")
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

            private Builder() {
            } 

            private Builder(SubSyncJobRetryState model) {
                this.errMsg = model.errMsg;
                this.jobId = model.jobId;
                this.maxRetryTime = model.maxRetryTime;
                this.module = model.module;
                this.retryCount = model.retryCount;
                this.retryTarget = model.retryTarget;
                this.retryTime = model.retryTime;
                this.retrying = model.retrying;
            } 

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ta7w132u12h****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The maximum duration of a retry. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * <p>The progress of the instance when DTS performs retries.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The object on which the retries are performed. Valid values:</p>
             * <ul>
             * <li><strong>srcDB</strong>: the source database.</li>
             * <li><strong>destDB</strong>: the destination database.</li>
             * <li><strong>inner_module</strong>: an internal module of DTS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>srcDB</p>
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * <p>The time that has elapsed from the point in time when the first retry starts. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * <p>Indicates whether the task is being retried. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobDataEtlStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobDataEtlStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that are migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of the ETL task. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobDataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobDataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if full data migration or initial full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of full data migration or initial full data synchronization. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of entries that are migrated or synchronized during full data migration or initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobDataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobDataSynchronizationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the instance class needs to be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The progress of incremental data migration or synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of rows and size of data that is synchronized or migrated to the destination table per second during incremental data synchronization or migration.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00RPS/(0.000MB/s)</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Suspending</strong>: The task is paused.</li>
             * <li><strong>Checking</strong>: The task is in precheck.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Catched</strong>: The task has no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobDestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobDestinationEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The name of the database to which the objects are migrated in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The destination instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1f9guj5rhzq****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX,XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the RAM role configured for the Alibaba Cloud account to which the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobMigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataExtractTransformLoad")
        private Boolean dataExtractTransformLoad;

        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobMigrationMode model) {
                this.dataExtractTransformLoad = model.dataExtractTransformLoad;
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureInitialization = model.structureInitialization;
            } 

            /**
             * <p>Indicates whether data transformation is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataExtractTransformLoad(Boolean dataExtractTransformLoad) {
                this.dataExtractTransformLoad = dataExtractTransformLoad;
                return this;
            }

            /**
             * <p>Indicates whether full data migration or initial full data synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * <p>Indicates whether incremental data migration or synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>Indicates whether schema migration or initial schema synchronization is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobPerformance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("Rps")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobPerformance model) {
                this.flow = model.flow;
                this.rps = model.rps;
            } 

            /**
             * <p>The size of data that is migrated or synchronized per second. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The number of times that SQL statements are migrated or synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobPrecheckStatusDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("CheckItemDescription")
        private String checkItemDescription;

        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
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

            private Builder() {
            } 

            private Builder(ReverseJobPrecheckStatusDetail model) {
                this.checkItem = model.checkItem;
                this.checkItemDescription = model.checkItemDescription;
                this.checkResult = model.checkResult;
                this.failedReason = model.failedReason;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The name of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>The description of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC_DETAIL</p>
             */
            public Builder checkItemDescription(String checkItemDescription) {
                this.checkItemDescription = checkItemDescription;
                return this;
            }

            /**
             * <p>The precheck result. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The error message returned if the task failed to pass the precheck.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The method used to fix the precheck failure.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>CheckResult</strong> is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobPrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<ReverseJobPrecheckStatusDetail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<ReverseJobPrecheckStatusDetail> getDetail() {
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
            private java.util.List<ReverseJobPrecheckStatusDetail> detail; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobPrecheckStatus model) {
                this.detail = model.detail;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<ReverseJobPrecheckStatusDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck state. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Prechecking</strong>: The task is in precheck.</li>
             * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobRetryState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MaxRetryTime")
        private Integer maxRetryTime;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryTarget")
        private String retryTarget;

        @com.aliyun.core.annotation.NameInMap("RetryTime")
        private Integer retryTime;

        @com.aliyun.core.annotation.NameInMap("Retrying")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobRetryState model) {
                this.errMsg = model.errMsg;
                this.jobId = model.jobId;
                this.maxRetryTime = model.maxRetryTime;
                this.module = model.module;
                this.retryCount = model.retryCount;
                this.retryTarget = model.retryTarget;
                this.retryTime = model.retryTime;
                this.retrying = model.retrying;
            } 

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK__ERROR_SAME_OBJ</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ta7w132u12h****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The maximum duration of a retry. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder maxRetryTime(Integer maxRetryTime) {
                this.maxRetryTime = maxRetryTime;
                return this;
            }

            /**
             * <p>The progress of the instance when DTS performs retries.</p>
             * 
             * <strong>example:</strong>
             * <p>03</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The object on which the retries are performed. Valid values:</p>
             * <ul>
             * <li><strong>srcDB</strong>: the source database.</li>
             * <li><strong>destDB</strong>: the destination database.</li>
             * <li><strong>inner_module</strong>: an internal module of DTS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>srcDB</p>
             */
            public Builder retryTarget(String retryTarget) {
                this.retryTarget = retryTarget;
                return this;
            }

            /**
             * <p>The time that has elapsed from the point in time when the first retry starts. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * <p>Indicates whether the task is being retried. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobSourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobSourceEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The name of the database from which the objects are migrated in the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The DTS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp2f3huj5rhzq****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the RAM role configured for the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobStructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ReverseJobStructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>Error message indicating task failure.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Whether to display upgrade specifications, return value:</p>
             * <ul>
             * <li>True: Yes.</li>
             * <li>False: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>Initialization progress of library table structure, measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have completed library table structure initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The initialization status of the library table structure includes:</p>
             * <ul>
             * <li>NotStarted: Not started.</li>
             * <li>Migration: In the process of initialization.</li>
             * <li>Failed: Initialization failed.</li>
             * <li>Finished: Initialization completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobSubscriptionDataType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ddl")
        private Boolean ddl;

        @com.aliyun.core.annotation.NameInMap("Dml")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobSubscriptionDataType model) {
                this.ddl = model.ddl;
                this.dml = model.dml;
            } 

            /**
             * <p>Indicates whether DDL statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * <p>Indicates whether DML statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJobSubscriptionHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateHost")
        private String privateHost;

        @com.aliyun.core.annotation.NameInMap("PublicHost")
        private String publicHost;

        @com.aliyun.core.annotation.NameInMap("VpcHost")
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

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJobSubscriptionHost model) {
                this.privateHost = model.privateHost;
                this.publicHost = model.publicHost;
                this.vpcHost = model.vpcHost;
            } 

            /**
             * <p>The private endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****-internal.aliyuncs.com:18002</p>
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * <p>The public endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * <p>The VPC endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class ReverseJobTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Long creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("TagCategory")
        private String tagCategory;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(ReverseJobTagList model) {
                this.aliUid = model.aliUid;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.scope = model.scope;
                this.srcRegion = model.srcRegion;
                this.tagCategory = model.tagCategory;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>191448876515****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The operator of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>191448876515****</p>
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The primary key of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::DTS::INSTANCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Indicates whether the tag is visible. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The tag is public.</li>
             * <li><strong>1</strong>: The tag is private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The ID of the region in which the DTS task resides.</p>
             * <blockquote>
             * <p>In most cases, the ID of the region in which the destination instance resides is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the tag. Valid values:</p>
             * <ul>
             * <li><strong>System</strong>: The tag was created by the system.</li>
             * <li><strong>Custom</strong>: The tag was created by a user.</li>
             * </ul>
             * <blockquote>
             * <p>By default, if the parameter is left empty, custom tags and system tags are returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder tagCategory(String tagCategory) {
                this.tagCategory = tagCategory;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobReverseJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionClient")
        private String consumptionClient;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataEtlStatus")
        private SubSyncJobReverseJobDataEtlStatus dataEtlStatus;

        @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
        private SubSyncJobReverseJobDataInitializationStatus dataInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
        private SubSyncJobReverseJobDataSynchronizationStatus dataSynchronizationStatus;

        @com.aliyun.core.annotation.NameInMap("DatabaseCount")
        private Integer databaseCount;

        @com.aliyun.core.annotation.NameInMap("DbObject")
        private String dbObject;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestNetType")
        private String destNetType;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private SubSyncJobReverseJobDestinationEndpoint destinationEndpoint;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @com.aliyun.core.annotation.NameInMap("DtsJobClass")
        private String dtsJobClass;

        @com.aliyun.core.annotation.NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("DtsJobName")
        private String dtsJobName;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private String endTimestamp;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EtlCalculator")
        private String etlCalculator;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("IsDemoJob")
        private Boolean isDemoJob;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private SubSyncJobReverseJobMigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("OriginType")
        private String originType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private SubSyncJobReverseJobPerformance performance;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private SubSyncJobReverseJobPrecheckStatus precheckStatus;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private String reserved;

        @com.aliyun.core.annotation.NameInMap("RetryState")
        private SubSyncJobReverseJobRetryState retryState;

        @com.aliyun.core.annotation.NameInMap("ReverseJob")
        private Object reverseJob;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private SubSyncJobReverseJobSourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
        private ReverseJobStructureInitializationStatus structureInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDataType")
        private SubSyncJobReverseJobSubscriptionDataType subscriptionDataType;

        @com.aliyun.core.annotation.NameInMap("SubscriptionHost")
        private SubSyncJobReverseJobSubscriptionHost subscriptionHost;

        @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<ReverseJobTagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
        public java.util.List<ReverseJobTagList> getTagList() {
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
            private java.util.List<ReverseJobTagList> tagList; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(SubSyncJobReverseJob model) {
                this.appName = model.appName;
                this.beginTimestamp = model.beginTimestamp;
                this.checkpoint = model.checkpoint;
                this.consumptionCheckpoint = model.consumptionCheckpoint;
                this.consumptionClient = model.consumptionClient;
                this.createTime = model.createTime;
                this.dataEtlStatus = model.dataEtlStatus;
                this.dataInitializationStatus = model.dataInitializationStatus;
                this.dataSynchronizationStatus = model.dataSynchronizationStatus;
                this.databaseCount = model.databaseCount;
                this.dbObject = model.dbObject;
                this.delay = model.delay;
                this.destNetType = model.destNetType;
                this.destinationEndpoint = model.destinationEndpoint;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobDirection = model.dtsJobDirection;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.endTimestamp = model.endTimestamp;
                this.errorMessage = model.errorMessage;
                this.etlCalculator = model.etlCalculator;
                this.expireTime = model.expireTime;
                this.finishTime = model.finishTime;
                this.groupId = model.groupId;
                this.isDemoJob = model.isDemoJob;
                this.jobType = model.jobType;
                this.migrationMode = model.migrationMode;
                this.originType = model.originType;
                this.payType = model.payType;
                this.performance = model.performance;
                this.precheckStatus = model.precheckStatus;
                this.reserved = model.reserved;
                this.retryState = model.retryState;
                this.reverseJob = model.reverseJob;
                this.sourceEndpoint = model.sourceEndpoint;
                this.status = model.status;
                this.structureInitializationStatus = model.structureInitializationStatus;
                this.subscribeTopic = model.subscribeTopic;
                this.subscriptionDataType = model.subscriptionDataType;
                this.subscriptionHost = model.subscriptionHost;
                this.synchronizationDirection = model.synchronizationDirection;
                this.tagList = model.tagList;
                this.taskType = model.taskType;
            } 

            /**
             * <p>Indicates whether the new change tracking feature is used.</p>
             * <blockquote>
             * <p>This parameter is returned only for change tracking instances of the new version.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-15T08:25:34Z</p>
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * <p>The start offset of incremental data migration or data synchronization. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616405159</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-23T07:30:31Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The downstream client information in the following format: &lt;IP address of the downstream client&gt;:&lt;Random ID generated by DTS&gt;.</p>
             * 
             * <strong>example:</strong>
             * <p>114.<em><strong>.</strong></em>.<strong>:dts</strong>******</p>
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-12T08:34:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The state of the ETL task.</p>
             * <blockquote>
             * <p>This parameter collection is returned only if an ETL task is configured.</p>
             * </blockquote>
             */
            public Builder dataEtlStatus(SubSyncJobReverseJobDataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization.</p>
             */
            public Builder dataInitializationStatus(SubSyncJobReverseJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization.</p>
             */
            public Builder dataSynchronizationStatus(SubSyncJobReverseJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
                return this;
            }

            /**
             * <p>The objects of the data migration, data synchronization, or change tracking task. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;:{&quot;all&quot;:true,&quot;name&quot;:&quot;dtstestdata&quot;,&quot;state&quot;:&quot;normal&quot;}}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The latency of incremental data migration or synchronization. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The network type of the consumer client. Valid values:</p>
             * <ul>
             * <li><strong>CLASSIC</strong>: classic network.</li>
             * <li><strong>VPC</strong>: VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder destNetType(String destNetType) {
                this.destNetType = destNetType;
                return this;
            }

            /**
             * <p>The connection settings of the destination instance.</p>
             */
            public Builder destinationEndpoint(SubSyncJobReverseJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The DTS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The instance class.</p>
             * 
             * <strong>example:</strong>
             * <p>xlarge</p>
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * <p>The DTS task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m06j1g92124****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The DTS instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest****</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-26T14:03:21Z</p>
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The operator information of the ETL task.</p>
             * <blockquote>
             * <p>This parameter is returned only if you query the details of an ETL task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;cells &quot;: [{&quot;shape&quot;:&quot;edge&quot;,&quot;attrs&quot;:{&quot;line&quot;:{&quot;stroke&quot;:&quot;#b1b1b1&quot;,&quot;strokeWidth&quot;:1,&quot;targetMarker&quot;:{&quot;name&quot;:&quot;block&quot;,&quot;args&quot;:{&quot;size&quot;:&quot;8&quot;}},&quot;strokeDasharray&quot;:&quot;&quot;}},&quot;id&quot;:&quot;cd1ec473-f9b9-4e9b-a742-ac23f442****&quot;,&quot;source&quot;:{&quot;cell&quot;:&quot;8b261182-bfab-4803-ad8e-6bb08e3e****&quot;,&quot;port&quot;:&quot;out1&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;b36770df-f48c-4d6b-9644-54c5e924****&quot;,&quot;port&quot;:&quot;in1&quot;},&quot;zIndex&quot;:7 }] }</p>
             */
            public Builder etlCalculator(String etlCalculator) {
                this.etlCalculator = etlCalculator;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>PayType</strong> is <strong>PrePaid</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T08:01:19Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the task was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T10:34:17Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxc****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether the task is a subtask. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDemoJob(Boolean isDemoJob) {
                this.isDemoJob = isDemoJob;
                return this;
            }

            /**
             * <p>The type of the DTS task. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: data migration task.</li>
             * <li><strong>SYNC</strong>: data synchronization task.</li>
             * <li><strong>SUBSCRIBE</strong>: change tracking task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYNC</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The migration types or initial synchronization types.</p>
             */
            public Builder migrationMode(SubSyncJobReverseJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>The source of the task. Valid values:</p>
             * <ul>
             * <li><strong>PTS</strong></li>
             * <li><strong>DMS</strong></li>
             * <li><strong>DTS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DTS</p>
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription.</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The performance of the data migration or synchronization instance.</p>
             */
            public Builder performance(SubSyncJobReverseJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck state.</p>
             */
            public Builder precheckStatus(SubSyncJobReverseJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, such as whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * <p>The information about the retries performed by DTS due to an exception.</p>
             */
            public Builder retryState(SubSyncJobReverseJobRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * <p>The details of the data synchronization task in the reverse direction.</p>
             * <blockquote>
             * <p>This parameter is returned only for two-way data synchronization tasks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder reverseJob(Object reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(SubSyncJobReverseJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The state of initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Initialization status of library table structure.</p>
             */
            public Builder structureInitializationStatus(ReverseJobStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * <p>The topic of the change tracking instance.</p>
             * <blockquote>
             * <p>This parameter is returned only if your change tracking instances are of the new version and you have called the <a href="https://help.aliyun.com/document_detail/122863.html">CreateConsumerGroup</a> operation to create a consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn_hangzhou_rm_bp1162kryivb8****_dtstest_version2</p>
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * <p>The type of data for change tracking.</p>
             */
            public Builder subscriptionDataType(SubSyncJobReverseJobSubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * <p>The endpoint of the change tracking instance.</p>
             */
            public Builder subscriptionHost(SubSyncJobReverseJobSubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>The default value is <strong>Forward</strong>.</li>
             * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * <p>The tags of the task.</p>
             */
            public Builder tagList(java.util.List<ReverseJobTagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobSourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("SslSolutionEnum")
        private String sslSolutionEnum;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(SubSyncJobSourceEndpoint model) {
                this.aliyunUid = model.aliyunUid;
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.region = model.region;
                this.roleName = model.roleName;
                this.sslSolutionEnum = model.sslSolutionEnum;
                this.userName = model.userName;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The name of the database from which the objects are migrated in the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database engine of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp2f3huj5rhzq****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The endpoint of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>EngineName</strong> of the destination instance is <strong>Oracle</strong> and the Oracle database is deployed in a non-RAC architecture.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * <p>The database service port of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the RAM role configured for the Alibaba Cloud account to which the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: SSL encryption is disabled.</li>
             * <li><strong>ENABLE_WITH_CERTIFICATE</strong>: SSL encryption is enabled and the CA certificate is uploaded.</li>
             * <li><strong>ENABLE_ONLY_4_MONGODB_ALTAS</strong>: SSL encryption is enabled for the connection to an AWS MongoDB Altas database.</li>
             * <li><strong>ENABLE_ONLY_4_KAFKA_SCRAM_SHA_256</strong>: SCRAM-SHA-256 is used to encrypt the connection to a Kafka cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder sslSolutionEnum(String sslSolutionEnum) {
                this.sslSolutionEnum = sslSolutionEnum;
                return this;
            }

            /**
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobStructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(SubSyncJobStructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.needUpgrade = model.needUpgrade;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>Error message indicating task failure.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Whether to display upgrade specifications, return value:</p>
             * <ul>
             * <li>True: Yes.</li>
             * <li>False: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>Initialization progress of library table structure, measured in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables that have completed library table structure initialization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The initialization status of the library table structure includes:</p>
             * <ul>
             * <li>NotStarted: Not started.</li>
             * <li>Migration: In the process of initialization.</li>
             * <li>Failed: Initialization failed.</li>
             * <li>Finished: Initialization completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobSubscriptionDataType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ddl")
        private Boolean ddl;

        @com.aliyun.core.annotation.NameInMap("Dml")
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

            private Builder() {
            } 

            private Builder(SubSyncJobSubscriptionDataType model) {
                this.ddl = model.ddl;
                this.dml = model.dml;
            } 

            /**
             * <p>Indicates whether DDL statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * <p>Indicates whether DML statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobSubscriptionHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateHost")
        private String privateHost;

        @com.aliyun.core.annotation.NameInMap("PublicHost")
        private String publicHost;

        @com.aliyun.core.annotation.NameInMap("VpcHost")
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

            private Builder() {
            } 

            private Builder(SubSyncJobSubscriptionHost model) {
                this.privateHost = model.privateHost;
                this.publicHost = model.publicHost;
                this.vpcHost = model.vpcHost;
            } 

            /**
             * <p>The private endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****-internal.aliyuncs.com:18002</p>
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * <p>The public endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * <p>The VPC endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJobTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Long creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("TagCategory")
        private String tagCategory;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(SubSyncJobTagList model) {
                this.aliUid = model.aliUid;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.scope = model.scope;
                this.srcRegion = model.srcRegion;
                this.tagCategory = model.tagCategory;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>191448876515****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The operator of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>191448876515****</p>
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-16T08:01:19Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The primary key of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::DTS::INSTANCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Indicates whether the tag is visible. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The tag is public.</li>
             * <li><strong>1</strong>: The tag is private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The ID of the region in which the DTS task resides.</p>
             * <blockquote>
             * <p>In most cases, the ID of the region in which the destination instance resides is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * <p>The type of the tag. Valid values:</p>
             * <ul>
             * <li><strong>System</strong>: The tag was created by the system.</li>
             * <li><strong>Custom</strong>: The tag was created by a user.</li>
             * </ul>
             * <blockquote>
             * <p>By default, if the parameter is left empty, custom tags and system tags are returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder tagCategory(String tagCategory) {
                this.tagCategory = tagCategory;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubSyncJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BeginTimestamp")
        private String beginTimestamp;

        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionCheckpoint")
        private String consumptionCheckpoint;

        @com.aliyun.core.annotation.NameInMap("ConsumptionClient")
        private String consumptionClient;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataEtlStatus")
        private SubSyncJobDataEtlStatus dataEtlStatus;

        @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
        private SubSyncJobDataInitializationStatus dataInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
        private SubSyncJobDataSynchronizationStatus dataSynchronizationStatus;

        @com.aliyun.core.annotation.NameInMap("DatabaseCount")
        private Integer databaseCount;

        @com.aliyun.core.annotation.NameInMap("DbObject")
        private String dbObject;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("DestNetType")
        private String destNetType;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private SubSyncJobDestinationEndpoint destinationEndpoint;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceID")
        private String dtsInstanceID;

        @com.aliyun.core.annotation.NameInMap("DtsJobClass")
        private String dtsJobClass;

        @com.aliyun.core.annotation.NameInMap("DtsJobDirection")
        private String dtsJobDirection;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("DtsJobName")
        private String dtsJobName;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private String endTimestamp;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EtlCalculator")
        private String etlCalculator;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("IsDemoJob")
        private Boolean isDemoJob;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MaxDu")
        private Double maxDu;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private SubSyncJobMigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("MinDu")
        private Double minDu;

        @com.aliyun.core.annotation.NameInMap("OriginType")
        private String originType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private SubSyncJobPerformance performance;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private SubSyncJobPrecheckStatus precheckStatus;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private String reserved;

        @com.aliyun.core.annotation.NameInMap("RetryState")
        private SubSyncJobRetryState retryState;

        @com.aliyun.core.annotation.NameInMap("ReverseJob")
        private SubSyncJobReverseJob reverseJob;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private SubSyncJobSourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
        private SubSyncJobStructureInitializationStatus structureInitializationStatus;

        @com.aliyun.core.annotation.NameInMap("SubSyncJob")
        private java.util.List<?> subSyncJob;

        @com.aliyun.core.annotation.NameInMap("SubscribeTopic")
        private String subscribeTopic;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDataType")
        private SubSyncJobSubscriptionDataType subscriptionDataType;

        @com.aliyun.core.annotation.NameInMap("SubscriptionHost")
        private SubSyncJobSubscriptionHost subscriptionHost;

        @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<SubSyncJobTagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
            this.maxDu = builder.maxDu;
            this.migrationMode = builder.migrationMode;
            this.minDu = builder.minDu;
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
         * @return maxDu
         */
        public Double getMaxDu() {
            return this.maxDu;
        }

        /**
         * @return migrationMode
         */
        public SubSyncJobMigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return minDu
         */
        public Double getMinDu() {
            return this.minDu;
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
        public java.util.List<?> getSubSyncJob() {
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
        public java.util.List<SubSyncJobTagList> getTagList() {
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
            private Double maxDu; 
            private SubSyncJobMigrationMode migrationMode; 
            private Double minDu; 
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
            private java.util.List<?> subSyncJob; 
            private String subscribeTopic; 
            private SubSyncJobSubscriptionDataType subscriptionDataType; 
            private SubSyncJobSubscriptionHost subscriptionHost; 
            private String synchronizationDirection; 
            private java.util.List<SubSyncJobTagList> tagList; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(SubSyncJob model) {
                this.appName = model.appName;
                this.beginTimestamp = model.beginTimestamp;
                this.checkpoint = model.checkpoint;
                this.consumptionCheckpoint = model.consumptionCheckpoint;
                this.consumptionClient = model.consumptionClient;
                this.createTime = model.createTime;
                this.dataEtlStatus = model.dataEtlStatus;
                this.dataInitializationStatus = model.dataInitializationStatus;
                this.dataSynchronizationStatus = model.dataSynchronizationStatus;
                this.databaseCount = model.databaseCount;
                this.dbObject = model.dbObject;
                this.delay = model.delay;
                this.destNetType = model.destNetType;
                this.destinationEndpoint = model.destinationEndpoint;
                this.dtsInstanceID = model.dtsInstanceID;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobDirection = model.dtsJobDirection;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.endTimestamp = model.endTimestamp;
                this.errorMessage = model.errorMessage;
                this.etlCalculator = model.etlCalculator;
                this.expireTime = model.expireTime;
                this.finishTime = model.finishTime;
                this.groupId = model.groupId;
                this.isDemoJob = model.isDemoJob;
                this.jobType = model.jobType;
                this.maxDu = model.maxDu;
                this.migrationMode = model.migrationMode;
                this.minDu = model.minDu;
                this.originType = model.originType;
                this.payType = model.payType;
                this.performance = model.performance;
                this.precheckStatus = model.precheckStatus;
                this.reserved = model.reserved;
                this.retryState = model.retryState;
                this.reverseJob = model.reverseJob;
                this.sourceEndpoint = model.sourceEndpoint;
                this.status = model.status;
                this.structureInitializationStatus = model.structureInitializationStatus;
                this.subSyncJob = model.subSyncJob;
                this.subscribeTopic = model.subscribeTopic;
                this.subscriptionDataType = model.subscriptionDataType;
                this.subscriptionHost = model.subscriptionHost;
                this.synchronizationDirection = model.synchronizationDirection;
                this.tagList = model.tagList;
                this.taskType = model.taskType;
            } 

            /**
             * <p>Indicates whether the new change tracking feature is used.</p>
             * <blockquote>
             * <p>This parameter is returned only for change tracking instances of the new version.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>new</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The start of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-15T08:25:34Z</p>
             */
            public Builder beginTimestamp(String beginTimestamp) {
                this.beginTimestamp = beginTimestamp;
                return this;
            }

            /**
             * <p>The start offset of incremental data migration or data synchronization. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616405159</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The consumption checkpoint of the change tracking instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-23T07:30:31Z</p>
             */
            public Builder consumptionCheckpoint(String consumptionCheckpoint) {
                this.consumptionCheckpoint = consumptionCheckpoint;
                return this;
            }

            /**
             * <p>The downstream client information in the following format: &lt;IP address of the downstream client&gt;:&lt;Random ID generated by DTS&gt;.</p>
             * 
             * <strong>example:</strong>
             * <p>114.<em><strong>.</strong></em>.<strong>:dts</strong>******</p>
             */
            public Builder consumptionClient(String consumptionClient) {
                this.consumptionClient = consumptionClient;
                return this;
            }

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-12T08:34:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The state of the ETL task.</p>
             * <blockquote>
             * <p>This parameter collection is returned only if an ETL task is configured.</p>
             * </blockquote>
             */
            public Builder dataEtlStatus(SubSyncJobDataEtlStatus dataEtlStatus) {
                this.dataEtlStatus = dataEtlStatus;
                return this;
            }

            /**
             * <p>The state of full data migration or initial full data synchronization.</p>
             */
            public Builder dataInitializationStatus(SubSyncJobDataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * <p>The state of incremental data migration or synchronization.</p>
             */
            public Builder dataSynchronizationStatus(SubSyncJobDataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * <p>The number of ApsaraDB RDS for MySQL instances that are attached to the source PolarDB-X 1.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder databaseCount(Integer databaseCount) {
                this.databaseCount = databaseCount;
                return this;
            }

            /**
             * <p>The objects of the data migration, data synchronization, or change tracking task. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dtstestdata&quot;:{&quot;all&quot;:true,&quot;name&quot;:&quot;dtstestdata&quot;,&quot;state&quot;:&quot;normal&quot;}}</p>
             */
            public Builder dbObject(String dbObject) {
                this.dbObject = dbObject;
                return this;
            }

            /**
             * <p>The latency of incremental data migration or synchronization. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The network type of the consumer client. Valid values:</p>
             * <ul>
             * <li><strong>CLASSIC</strong>: classic network.</li>
             * <li><strong>VPC</strong>: VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder destNetType(String destNetType) {
                this.destNetType = destNetType;
                return this;
            }

            /**
             * <p>The connection settings of the destination instance.</p>
             */
            public Builder destinationEndpoint(SubSyncJobDestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * <p>The DTS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsnjuc14kp12u****</p>
             */
            public Builder dtsInstanceID(String dtsInstanceID) {
                this.dtsInstanceID = dtsInstanceID;
                return this;
            }

            /**
             * <p>The instance class.</p>
             * 
             * <strong>example:</strong>
             * <p>xlarge</p>
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if the topology of the data synchronization instance is two-way synchronization.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder dtsJobDirection(String dtsJobDirection) {
                this.dtsJobDirection = dtsJobDirection;
                return this;
            }

            /**
             * <p>The DTS task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m06j1g92124****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The DTS instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest****</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The end of the time range for change tracking. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-26T14:03:21Z</p>
             */
            public Builder endTimestamp(String endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The error message returned if the task failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by ****</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The operator information of the ETL task.</p>
             * <blockquote>
             * <p>This parameter is returned only if you query the details of an ETL task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;cells &quot;: [{&quot;shape&quot;:&quot;edge&quot;,&quot;attrs&quot;:{&quot;line&quot;:{&quot;stroke&quot;:&quot;#b1b1b1&quot;,&quot;strokeWidth&quot;:1,&quot;targetMarker&quot;:{&quot;name&quot;:&quot;block&quot;,&quot;args&quot;:{&quot;size&quot;:&quot;8&quot;}},&quot;strokeDasharray&quot;:&quot;&quot;}},&quot;id&quot;:&quot;cd1ec473-f9b9-4e9b-a742-ac23f442****&quot;,&quot;source&quot;:{&quot;cell&quot;:&quot;8b261182-bfab-4803-ad8e-6bb08e3e****&quot;,&quot;port&quot;:&quot;out1&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;b36770df-f48c-4d6b-9644-54c5e924****&quot;,&quot;port&quot;:&quot;in1&quot;},&quot;zIndex&quot;:7 }] }</p>
             */
            public Builder etlCalculator(String etlCalculator) {
                this.etlCalculator = etlCalculator;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p>This parameter is returned only if the return value of <strong>PayType</strong> is <strong>PrePaid</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T08:01:19Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the task was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T10:34:17Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxc****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether the task is a subtask. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDemoJob(Boolean isDemoJob) {
                this.isDemoJob = isDemoJob;
                return this;
            }

            /**
             * <p>The type of the DTS task. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: data migration task.</li>
             * <li><strong>SYNC</strong>: data synchronization task.</li>
             * <li><strong>SUBSCRIBE</strong>: change tracking task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYNC</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The maximum number of DUs.</p>
             * <blockquote>
             * <p>This parameter is supported only for serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxDu(Double maxDu) {
                this.maxDu = maxDu;
                return this;
            }

            /**
             * <p>The migration types or initial synchronization types.</p>
             */
            public Builder migrationMode(SubSyncJobMigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * <p>The minimum number of DUs.</p>
             * <blockquote>
             * <p>This parameter is supported only for serverless instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minDu(Double minDu) {
                this.minDu = minDu;
                return this;
            }

            /**
             * <p>The source of the task. Valid values:</p>
             * <ul>
             * <li><strong>PTS</strong></li>
             * <li><strong>DMS</strong></li>
             * <li><strong>DTS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PTS</p>
             */
            public Builder originType(String originType) {
                this.originType = originType;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription.</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The performance of the data migration or synchronization instance.</p>
             */
            public Builder performance(SubSyncJobPerformance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * <p>The precheck state.</p>
             */
            public Builder precheckStatus(SubSyncJobPrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet specific requirements, such as whether to automatically start a precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;srcHostPorts&quot;:&quot;&quot;,&quot;whitelist.dms.online.ddl.enable&quot;:false,&quot;filterDDL&quot;:false,&quot;sqlparser.dms.original.ddl&quot;:true,&quot;srcOracleType&quot;:&quot;sid&quot;,&quot;maxRetryTime&quot;:43200,&quot;destSSL&quot;:&quot;0&quot;,&quot;destOracleType&quot;:&quot;sid&quot;,&quot;srcSSL&quot;:&quot;0&quot;,&quot;dbListCaseChangeMode&quot;:&quot;default&quot;,&quot;SourceEngineVersion&quot;:&quot;8.0.18&quot;,&quot;srcNetType&quot;:&quot;VPC&quot;,&quot;destNetType&quot;:&quot;VPC&quot;,&quot;srcVpcNetMappingInst&quot;:&quot;172.16.1**.<strong>:10803&quot;,&quot;destVpcNetMappingInst&quot;:&quot;172.16.1</strong>.**:11077&quot;,&quot;useJobTask&quot;:&quot;1&quot;}</p>
             */
            public Builder reserved(String reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * <p>The information about the retries performed by DTS due to an exception.</p>
             */
            public Builder retryState(SubSyncJobRetryState retryState) {
                this.retryState = retryState;
                return this;
            }

            /**
             * <p>The details of the data synchronization task in the reverse direction.</p>
             * <blockquote>
             * <p>This parameter is returned only for two-way data synchronization tasks.</p>
             * </blockquote>
             */
            public Builder reverseJob(SubSyncJobReverseJob reverseJob) {
                this.reverseJob = reverseJob;
                return this;
            }

            /**
             * <p>The connection settings of the source instance.</p>
             */
            public Builder sourceEndpoint(SubSyncJobSourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * <p>The state of initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Migrating</strong>: The task is in progress.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Initialization status of library table structure.</p>
             */
            public Builder structureInitializationStatus(SubSyncJobStructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * <p>The information about the subtasks in the current data synchronization task.</p>
             */
            public Builder subSyncJob(java.util.List<?> subSyncJob) {
                this.subSyncJob = subSyncJob;
                return this;
            }

            /**
             * <p>The topic of the change tracking instance.</p>
             * <blockquote>
             * <p>This parameter is returned only if your change tracking instances are of the new version and you have called the <a href="https://help.aliyun.com/document_detail/122863.html">CreateConsumerGroup</a> operation to create a consumer group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn_hangzhou_rm_bp1162kryivb8****_dtstest_version2</p>
             */
            public Builder subscribeTopic(String subscribeTopic) {
                this.subscribeTopic = subscribeTopic;
                return this;
            }

            /**
             * <p>The type of data for change tracking.</p>
             */
            public Builder subscriptionDataType(SubSyncJobSubscriptionDataType subscriptionDataType) {
                this.subscriptionDataType = subscriptionDataType;
                return this;
            }

            /**
             * <p>The endpoint of the change tracking instance.</p>
             */
            public Builder subscriptionHost(SubSyncJobSubscriptionHost subscriptionHost) {
                this.subscriptionHost = subscriptionHost;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>The default value is <strong>Forward</strong>.</li>
             * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * <p>The tags of the task.</p>
             */
            public Builder tagList(java.util.List<SubSyncJobTagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubscriptionDataType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ddl")
        private Boolean ddl;

        @com.aliyun.core.annotation.NameInMap("Dml")
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

            private Builder() {
            } 

            private Builder(SubscriptionDataType model) {
                this.ddl = model.ddl;
                this.dml = model.dml;
            } 

            /**
             * <p>Indicates whether DDL statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ddl(Boolean ddl) {
                this.ddl = ddl;
                return this;
            }

            /**
             * <p>Indicates whether DML statements are tracked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDtsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobDetailResponseBody</p>
     */
    public static class SubscriptionHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateHost")
        private String privateHost;

        @com.aliyun.core.annotation.NameInMap("PublicHost")
        private String publicHost;

        @com.aliyun.core.annotation.NameInMap("VpcHost")
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

            private Builder() {
            } 

            private Builder(SubscriptionHost model) {
                this.privateHost = model.privateHost;
                this.publicHost = model.publicHost;
                this.vpcHost = model.vpcHost;
            } 

            /**
             * <p>The private endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****-internal.aliyuncs.com:18002</p>
             */
            public Builder privateHost(String privateHost) {
                this.privateHost = privateHost;
                return this;
            }

            /**
             * <p>The public endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****.aliyuncs.com:18001</p>
             */
            public Builder publicHost(String publicHost) {
                this.publicHost = publicHost;
                return this;
            }

            /**
             * <p>The VPC endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-cn-****-vpc.aliyuncs.com:18003</p>
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
