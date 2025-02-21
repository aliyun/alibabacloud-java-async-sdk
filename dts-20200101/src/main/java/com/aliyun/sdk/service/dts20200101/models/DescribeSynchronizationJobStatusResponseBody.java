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
 * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobStatusResponseBody</p>
 */
public class DescribeSynchronizationJobStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Checkpoint")
    private String checkpoint;

    @com.aliyun.core.annotation.NameInMap("DataInitialization")
    private String dataInitialization;

    @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
    private DataInitializationStatus dataInitializationStatus;

    @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
    private DataSynchronizationStatus dataSynchronizationStatus;

    @com.aliyun.core.annotation.NameInMap("Delay")
    private String delay;

    @com.aliyun.core.annotation.NameInMap("DelayMillis")
    private Long delayMillis;

    @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("Performance")
    private Performance performance;

    @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
    private PrecheckStatus precheckStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StructureInitialization")
    private String structureInitialization;

    @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
    private StructureInitializationStatus structureInitializationStatus;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobClass")
    private String synchronizationJobClass;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
    private String synchronizationJobId;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobName")
    private String synchronizationJobName;

    @com.aliyun.core.annotation.NameInMap("SynchronizationObjects")
    private java.util.List<SynchronizationObjects> synchronizationObjects;

    @com.aliyun.core.annotation.NameInMap("TaskId")
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
    public java.util.List<SynchronizationObjects> getSynchronizationObjects() {
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
        private java.util.List<SynchronizationObjects> synchronizationObjects; 
        private String taskId; 

        /**
         * <p>The UNIX timestamp generated when the latest data record was synchronized.</p>
         * <blockquote>
         * <p> You can use a search engine to obtain a UNIX timestamp converter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1610616144</p>
         */
        public Builder checkpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * <p>Indicates whether full data synchronization is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dataInitialization(String dataInitialization) {
            this.dataInitialization = dataInitialization;
            return this;
        }

        /**
         * <p>The status of full data synchronization.</p>
         */
        public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }

        /**
         * <p>The status of incremental data synchronization.</p>
         */
        public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }

        /**
         * <p>The synchronization latency, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delay(String delay) {
            this.delay = delay;
            return this;
        }

        /**
         * <p>The synchronization delay, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>506</p>
         */
        public Builder delayMillis(Long delayMillis) {
            this.delayMillis = delayMillis;
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
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error message returned if data synchronization failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The time when the data synchronization instance expires. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
         * <blockquote>
         * <p> This parameter is returned only if the return value of the <strong>PayType</strong> parameter is <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-03-07T16:00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The billing method of the data synchronization instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
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
         * <p>The performance of the data synchronization instance.</p>
         */
        public Builder performance(Performance performance) {
            this.performance = performance;
            return this;
        }

        /**
         * <p>The precheck status.</p>
         */
        public Builder precheckStatus(PrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DACDF659-AFC6-4DC8-ADB8-4569419A4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <p>The status of the data synchronization task. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>Initializing</strong>: The task is performing initial synchronization.</li>
         * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
         * <li><strong>Synchronizing</strong>: The task is synchronizing data.</li>
         * <li><strong>Failed</strong>: The task failed to synchronize data.</li>
         * <li><strong>Suspending</strong>: The task is paused.</li>
         * <li><strong>Modifying</strong>: The objects in the task are being modified.</li>
         * <li><strong>Finished</strong>: The task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>synchronizing</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether schema synchronization is performed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder structureInitialization(String structureInitialization) {
            this.structureInitialization = structureInitialization;
            return this;
        }

        /**
         * <p>The status of schema synchronization.</p>
         */
        public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong></li>
         * <li><strong>Reverse</strong></li>
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
         * <p>The specification of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>large</p>
         */
        public Builder synchronizationJobClass(String synchronizationJobClass) {
            this.synchronizationJobClass = synchronizationJobClass;
            return this;
        }

        /**
         * <p>The ID of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsexjk1alb116****</p>
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * <p>The name of the data synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder synchronizationJobName(String synchronizationJobName) {
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }

        /**
         * <p>The objects that are synchronized by the task.</p>
         */
        public Builder synchronizationObjects(java.util.List<SynchronizationObjects> synchronizationObjects) {
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

    /**
     * 
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class DataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The error message returned if full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of full data synchronization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records that have been synchronized during full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>200001</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Full data synchronization is not started.</li>
             * <li><strong>Migrating</strong>: Full data synchronization is in progress.</li>
             * <li><strong>Failed</strong>: Full data synchronization failed.</li>
             * <li><strong>Finished</strong>: Full data synchronization is completed.</li>
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
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class DataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private String delay;

        @com.aliyun.core.annotation.NameInMap("DelayMillis")
        private Long delayMillis;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The UNIX timestamp generated when the latest data record was synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>1610709865</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The synchronization latency, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The synchronization latency, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>856</p>
             */
            public Builder delayMillis(Long delayMillis) {
                this.delayMillis = delayMillis;
                return this;
            }

            /**
             * <p>The error message returned if incremental data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of incremental data synchronization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of incremental data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Incremental data synchronization is not started.</li>
             * <li><strong>Migrating</strong>: Incremental data synchronization is in progress.</li>
             * <li><strong>Failed</strong>: Incremental data synchronization failed.</li>
             * <li><strong>Finished</strong>: Incremental data synchronization is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class DestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("UserName")
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
             * <p>The database type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp162d4tp0500****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class Performance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FLOW")
        private String FLOW;

        @com.aliyun.core.annotation.NameInMap("RPS")
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
             * <p>The data traffic that is synchronized per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder FLOW(String FLOW) {
                this.FLOW = FLOW;
                return this;
            }

            /**
             * <p>The number of times SQL statements are synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
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
             * <p>The precheck result. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: The task passed the precheck.</li>
             * <li><strong>Failed</strong>: The task failed to pass the precheck.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The error message returned if the task failed to pass the precheck.</p>
             * <blockquote>
             * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.***.**&quot; (using password: YES)</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The name of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The method to fix the precheck failure.</p>
             * <blockquote>
             * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
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
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class PrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<Detail> getDetail() {
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
            private java.util.List<Detail> detail; 
            private String percent; 
            private String status; 

            /**
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck result. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: The task passed the precheck.</li>
             * <li><strong>Failed</strong>: The task failed to pass the precheck.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("UserName")
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
             * <p>The database type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
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
             * <p>The ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1i99e8l7913****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class StructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The error message returned if schema synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of schema synchronization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables whose schemas have been synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Schema synchronization is not started.</li>
             * <li><strong>Migrating</strong>: Schema synchronization is in progress.</li>
             * <li><strong>Failed</strong>: Schema synchronization failed.</li>
             * <li><strong>Finished</strong>: Schema synchronization is completed.</li>
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
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class TableExcludes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
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
             * <p>The name of the excluded table.</p>
             * 
             * <strong>example:</strong>
             * <p>order</p>
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
    /**
     * 
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class TableIncludes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
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
             * <p>The name of the synchronized table.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
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
    /**
     * 
     * {@link DescribeSynchronizationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusResponseBody</p>
     */
    public static class SynchronizationObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewSchemaName")
        private String newSchemaName;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableExcludes")
        private java.util.List<TableExcludes> tableExcludes;

        @com.aliyun.core.annotation.NameInMap("TableIncludes")
        private java.util.List<TableIncludes> tableIncludes;

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
        public java.util.List<TableExcludes> getTableExcludes() {
            return this.tableExcludes;
        }

        /**
         * @return tableIncludes
         */
        public java.util.List<TableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        public static final class Builder {
            private String newSchemaName; 
            private String schemaName; 
            private java.util.List<TableExcludes> tableExcludes; 
            private java.util.List<TableIncludes> tableIncludes; 

            /**
             * <p>The database name that is used in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>newdtstestdatabase</p>
             */
            public Builder newSchemaName(String newSchemaName) {
                this.newSchemaName = newSchemaName;
                return this;
            }

            /**
             * <p>The name of the synchronized database.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdatabase</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The source tables that are excluded from the data synchronization task.</p>
             */
            public Builder tableExcludes(java.util.List<TableExcludes> tableExcludes) {
                this.tableExcludes = tableExcludes;
                return this;
            }

            /**
             * <p>The tables that are synchronized by the task.</p>
             */
            public Builder tableIncludes(java.util.List<TableIncludes> tableIncludes) {
                this.tableIncludes = tableIncludes;
                return this;
            }

            public SynchronizationObjects build() {
                return new SynchronizationObjects(this);
            } 

        } 

    }
}
