// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobStatusResponseBody</p>
 */
public class DescribeSynchronizationJobStatusResponseBody extends TeaModel {
    @NameInMap("Checkpoint")
    private String checkpoint;

    @NameInMap("DataInitialization")
    private String dataInitialization;

    @NameInMap("DataInitializationStatus")
    private DataInitializationStatus dataInitializationStatus;

    @NameInMap("DataSynchronizationStatus")
    private DataSynchronizationStatus dataSynchronizationStatus;

    @NameInMap("Delay")
    private String delay;

    @NameInMap("DelayMillis")
    private Long delayMillis;

    @NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("Performance")
    private Performance performance;

    @NameInMap("PrecheckStatus")
    private PrecheckStatus precheckStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @NameInMap("Status")
    private String status;

    @NameInMap("StructureInitialization")
    private String structureInitialization;

    @NameInMap("StructureInitializationStatus")
    private StructureInitializationStatus structureInitializationStatus;

    @NameInMap("Success")
    private String success;

    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @NameInMap("SynchronizationJobClass")
    private String synchronizationJobClass;

    @NameInMap("SynchronizationJobId")
    private String synchronizationJobId;

    @NameInMap("SynchronizationJobName")
    private String synchronizationJobName;

    @NameInMap("SynchronizationObjects")
    private java.util.List < SynchronizationObjects> synchronizationObjects;

    @NameInMap("TaskId")
    private String taskId;

    private DescribeSynchronizationJobStatusResponseBody(Builder builder) {
        this.checkpoint = builder.checkpoint;
        this.dataInitialization = builder.dataInitialization;
        this.dataInitializationStatus = builder.dataInitializationStatus;
        this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
        this.delay = builder.delay;
        this.delayMillis = builder.delayMillis;
        this.destinationEndpoint = builder.destinationEndpoint;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.errorMessage = builder.errorMessage;
        this.expireTime = builder.expireTime;
        this.payType = builder.payType;
        this.performance = builder.performance;
        this.precheckStatus = builder.precheckStatus;
        this.requestId = builder.requestId;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.status = builder.status;
        this.structureInitialization = builder.structureInitialization;
        this.structureInitializationStatus = builder.structureInitializationStatus;
        this.success = builder.success;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobClass = builder.synchronizationJobClass;
        this.synchronizationJobId = builder.synchronizationJobId;
        this.synchronizationJobName = builder.synchronizationJobName;
        this.synchronizationObjects = builder.synchronizationObjects;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkpoint
     */
    public String getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return dataInitialization
     */
    public String getDataInitialization() {
        return this.dataInitialization;
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
    public DataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    /**
     * @return delay
     */
    public String getDelay() {
        return this.delay;
    }

    /**
     * @return delayMillis
     */
    public Long getDelayMillis() {
        return this.delayMillis;
    }

    /**
     * @return destinationEndpoint
     */
    public DestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
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
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return structureInitialization
     */
    public String getStructureInitialization() {
        return this.structureInitialization;
    }

    /**
     * @return structureInitializationStatus
     */
    public StructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobClass
     */
    public String getSynchronizationJobClass() {
        return this.synchronizationJobClass;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    /**
     * @return synchronizationJobName
     */
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    /**
     * @return synchronizationObjects
     */
    public java.util.List < SynchronizationObjects> getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String checkpoint; 
        private String dataInitialization; 
        private DataInitializationStatus dataInitializationStatus; 
        private DataSynchronizationStatus dataSynchronizationStatus; 
        private String delay; 
        private Long delayMillis; 
        private DestinationEndpoint destinationEndpoint; 
        private String errCode; 
        private String errMessage; 
        private String errorMessage; 
        private String expireTime; 
        private String payType; 
        private Performance performance; 
        private PrecheckStatus precheckStatus; 
        private String requestId; 
        private SourceEndpoint sourceEndpoint; 
        private String status; 
        private String structureInitialization; 
        private StructureInitializationStatus structureInitializationStatus; 
        private String success; 
        private String synchronizationDirection; 
        private String synchronizationJobClass; 
        private String synchronizationJobId; 
        private String synchronizationJobName; 
        private java.util.List < SynchronizationObjects> synchronizationObjects; 
        private String taskId; 

        /**
         * The UNIX timestamp generated when the latest data record was synchronized.
         * <p>
         * 
         * >  You can use a search engine to obtain a UNIX timestamp converter.
         */
        public Builder checkpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * Indicates whether full data synchronization is performed. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder dataInitialization(String dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }

        /**
         * The status of full data synchronization.
         */
        public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }

        /**
         * The status of incremental data synchronization.
         */
        public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }

        /**
         * The synchronization latency, in seconds.
         */
        public Builder delay(String delay) {
            this.delay = delay;
            return this;
        }

        /**
         * The synchronization delay, in milliseconds.
         */
        public Builder delayMillis(Long delayMillis) {
            this.delayMillis = delayMillis;
            return this;
        }

        /**
         * The connection settings of the destination instance.
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The error message returned if data synchronization failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The time when the data synchronization instance expires. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
         * <p>
         * 
         * >  This parameter is returned only if the return value of the **PayType** parameter is **PrePaid**.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The billing method of the data synchronization instance. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * The performance of the data synchronization instance.
         */
        public Builder performance(Performance performance) {
            this.performance = performance;
            return this;
        }

        /**
         * The precheck status.
         */
        public Builder precheckStatus(PrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
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
         * The connection settings of the source instance.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * The status of the data synchronization task. Valid values:
         * <p>
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is being prechecked.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **Initializing**: The task is performing initial synchronization.
         * *   **InitializeFailed**: Initial synchronization failed.
         * *   **Synchronizing**: The task is synchronizing data.
         * *   **Failed**: The task failed to synchronize data.
         * *   **Suspending**: The task is paused.
         * *   **Modifying**: The objects in the task are being modified.
         * *   **Finished**: The task is completed.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Indicates whether schema synchronization is performed. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder structureInitialization(String structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }

        /**
         * The status of schema synchronization.
         */
        public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The synchronization direction. Valid values:
         * <p>
         * 
         * *   **Forward**
         * *   **Reverse**
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * The specification of the data synchronization instance.
         */
        public Builder synchronizationJobClass(String synchronizationJobClass) {
            this.synchronizationJobClass = synchronizationJobClass;
            return this;
        }

        /**
         * The ID of the data synchronization instance.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * The name of the data synchronization task.
         */
        public Builder synchronizationJobName(String synchronizationJobName) {
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }

        /**
         * The objects that are synchronized by the task.
         */
        public Builder synchronizationObjects(java.util.List < SynchronizationObjects> synchronizationObjects) {
            this.synchronizationObjects = synchronizationObjects;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DescribeSynchronizationJobStatusResponseBody build() {
            return new DescribeSynchronizationJobStatusResponseBody(this);
        } 

    } 

    public static class DataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private DataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
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
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if full data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of full data synchronization. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of records that have been synchronized during full data synchronization.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of full data synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Full data synchronization is not started.
             * *   **Migrating**: Full data synchronization is in progress.
             * *   **Failed**: Full data synchronization failed.
             * *   **Finished**: Full data synchronization is completed.
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
    public static class DataSynchronizationStatus extends TeaModel {
        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("Delay")
        private String delay;

        @NameInMap("DelayMillis")
        private Long delayMillis;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private DataSynchronizationStatus(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.delay = builder.delay;
            this.delayMillis = builder.delayMillis;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return delay
         */
        public String getDelay() {
            return this.delay;
        }

        /**
         * @return delayMillis
         */
        public Long getDelayMillis() {
            return this.delayMillis;
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
            private String checkpoint; 
            private String delay; 
            private Long delayMillis; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * The UNIX timestamp generated when the latest data record was synchronized.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The synchronization latency, in seconds.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The synchronization latency, in milliseconds.
             */
            public Builder delayMillis(Long delayMillis) {
                this.delayMillis = delayMillis;
                return this;
            }

            /**
             * The error message returned if incremental data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of incremental data synchronization. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The status of incremental data synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Incremental data synchronization is not started.
             * *   **Migrating**: Incremental data synchronization is in progress.
             * *   **Failed**: Incremental data synchronization failed.
             * *   **Finished**: Incremental data synchronization is completed.
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
        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Port")
        private String port;

        @NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.port = builder.port;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String engineName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String port; 
            private String userName; 

            /**
             * The database type of the destination instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The endpoint of the destination instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The database service port of the destination instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The database account of the destination instance.
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
    public static class Performance extends TeaModel {
        @NameInMap("FLOW")
        private String FLOW;

        @NameInMap("RPS")
        private String RPS;

        private Performance(Builder builder) {
            this.FLOW = builder.FLOW;
            this.RPS = builder.RPS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performance create() {
            return builder().build();
        }

        /**
         * @return FLOW
         */
        public String getFLOW() {
            return this.FLOW;
        }

        /**
         * @return RPS
         */
        public String getRPS() {
            return this.RPS;
        }

        public static final class Builder {
            private String FLOW; 
            private String RPS; 

            /**
             * The data traffic that is synchronized per second. Unit: MB/s.
             */
            public Builder FLOW(String FLOW) {
                this.FLOW = FLOW;
                return this;
            }

            /**
             * The number of times SQL statements are synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.
             */
            public Builder RPS(String RPS) {
                this.RPS = RPS;
                return this;
            }

            public Performance build() {
                return new Performance(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private Detail(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.errorMessage = builder.errorMessage;
            this.itemName = builder.itemName;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkStatus; 
            private String errorMessage; 
            private String itemName; 
            private String repairMethod; 

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * *   **Success**: The task passed the precheck.
             * *   **Failed**: The task failed to pass the precheck.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * The error message returned if the task failed to pass the precheck.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **CheckStatus** parameter is **Failed**.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The name of the precheck item.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * The method to fix the precheck failure.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **CheckStatus** parameter is **Failed**.
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

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private PrecheckStatus(Builder builder) {
            this.detail = builder.detail;
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
            private String percent; 
            private String status; 

            /**
             * The result of each precheck item.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The precheck progress. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * *   **Success**: The task passed the precheck.
             * *   **Failed**: The task failed to pass the precheck.
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
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Port")
        private String port;

        @NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.port = builder.port;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String engineName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String port; 
            private String userName; 

            /**
             * The database type of the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The endpoint of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The database account of the source instance.
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
    public static class StructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private StructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
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
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if schema synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of schema synchronization. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of tables whose schemas have been synchronized.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of schema synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Schema synchronization is not started.
             * *   **Migrating**: Schema synchronization is in progress.
             * *   **Failed**: Schema synchronization failed.
             * *   **Finished**: Schema synchronization is completed.
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
    public static class TableExcludes extends TeaModel {
        @NameInMap("TableName")
        private String tableName;

        private TableExcludes(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableExcludes create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String tableName; 

            /**
             * The name of the excluded table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableExcludes build() {
                return new TableExcludes(this);
            } 

        } 

    }
    public static class TableIncludes extends TeaModel {
        @NameInMap("TableName")
        private String tableName;

        private TableIncludes(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableIncludes create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String tableName; 

            /**
             * The name of the synchronized table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableIncludes build() {
                return new TableIncludes(this);
            } 

        } 

    }
    public static class SynchronizationObjects extends TeaModel {
        @NameInMap("NewSchemaName")
        private String newSchemaName;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("TableExcludes")
        private java.util.List < TableExcludes> tableExcludes;

        @NameInMap("TableIncludes")
        private java.util.List < TableIncludes> tableIncludes;

        private SynchronizationObjects(Builder builder) {
            this.newSchemaName = builder.newSchemaName;
            this.schemaName = builder.schemaName;
            this.tableExcludes = builder.tableExcludes;
            this.tableIncludes = builder.tableIncludes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronizationObjects create() {
            return builder().build();
        }

        /**
         * @return newSchemaName
         */
        public String getNewSchemaName() {
            return this.newSchemaName;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableExcludes
         */
        public java.util.List < TableExcludes> getTableExcludes() {
            return this.tableExcludes;
        }

        /**
         * @return tableIncludes
         */
        public java.util.List < TableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        public static final class Builder {
            private String newSchemaName; 
            private String schemaName; 
            private java.util.List < TableExcludes> tableExcludes; 
            private java.util.List < TableIncludes> tableIncludes; 

            /**
             * The database name that is used in the destination instance.
             */
            public Builder newSchemaName(String newSchemaName) {
                this.newSchemaName = newSchemaName;
                return this;
            }

            /**
             * The name of the synchronized database.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The source tables that are excluded from the data synchronization task.
             */
            public Builder tableExcludes(java.util.List < TableExcludes> tableExcludes) {
                this.tableExcludes = tableExcludes;
                return this;
            }

            /**
             * The tables that are synchronized by the task.
             */
            public Builder tableIncludes(java.util.List < TableIncludes> tableIncludes) {
                this.tableIncludes = tableIncludes;
                return this;
            }

            public SynchronizationObjects build() {
                return new SynchronizationObjects(this);
            } 

        } 

    }
}
