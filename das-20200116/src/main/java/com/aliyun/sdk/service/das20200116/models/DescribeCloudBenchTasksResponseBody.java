// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudBenchTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudBenchTasksResponseBody</p>
 */
public class DescribeCloudBenchTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeCloudBenchTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudBenchTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information, including the error codes and the number of entries that are returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCloudBenchTasksResponseBody build() {
            return new DescribeCloudBenchTasksResponseBody(this);
        } 

    } 

    public static class CloudbenchTasks extends TeaModel {
        @NameInMap("ArchiveJobId")
        private String archiveJobId;

        @NameInMap("ArchiveOssTableName")
        private String archiveOssTableName;

        @NameInMap("ArchiveState")
        private Integer archiveState;

        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("BenchStep")
        private String benchStep;

        @NameInMap("BenchStepStatus")
        private String benchStepStatus;

        @NameInMap("ClientGatewayId")
        private String clientGatewayId;

        @NameInMap("ClientType")
        private String clientType;

        @NameInMap("Description")
        private String description;

        @NameInMap("DstInstanceUuid")
        private String dstInstanceUuid;

        @NameInMap("DstIp")
        private String dstIp;

        @NameInMap("DstPort")
        private Integer dstPort;

        @NameInMap("DstType")
        private String dstType;

        @NameInMap("DtsJobClass")
        private String dtsJobClass;

        @NameInMap("DtsJobId")
        private String dtsJobId;

        @NameInMap("DtsJobName")
        private String dtsJobName;

        @NameInMap("DtsJobState")
        private Integer dtsJobState;

        @NameInMap("DtsJobStatus")
        private String dtsJobStatus;

        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("EndState")
        private String endState;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("External")
        private String external;

        @NameInMap("Rate")
        private Integer rate;

        @NameInMap("RequestDuration")
        private Long requestDuration;

        @NameInMap("SmartPressureTime")
        private Integer smartPressureTime;

        @NameInMap("Source")
        private String source;

        @NameInMap("SqlCompleteReuse")
        private String sqlCompleteReuse;

        @NameInMap("SrcInstanceArea")
        private String srcInstanceArea;

        @NameInMap("SrcInstanceUuid")
        private String srcInstanceUuid;

        @NameInMap("SrcPublicIp")
        private String srcPublicIp;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        @NameInMap("TableSchema")
        private String tableSchema;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Version")
        private String version;

        @NameInMap("WorkDir")
        private String workDir;

        private CloudbenchTasks(Builder builder) {
            this.archiveJobId = builder.archiveJobId;
            this.archiveOssTableName = builder.archiveOssTableName;
            this.archiveState = builder.archiveState;
            this.backupId = builder.backupId;
            this.backupType = builder.backupType;
            this.benchStep = builder.benchStep;
            this.benchStepStatus = builder.benchStepStatus;
            this.clientGatewayId = builder.clientGatewayId;
            this.clientType = builder.clientType;
            this.description = builder.description;
            this.dstInstanceUuid = builder.dstInstanceUuid;
            this.dstIp = builder.dstIp;
            this.dstPort = builder.dstPort;
            this.dstType = builder.dstType;
            this.dtsJobClass = builder.dtsJobClass;
            this.dtsJobId = builder.dtsJobId;
            this.dtsJobName = builder.dtsJobName;
            this.dtsJobState = builder.dtsJobState;
            this.dtsJobStatus = builder.dtsJobStatus;
            this.ecsInstanceId = builder.ecsInstanceId;
            this.endState = builder.endState;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.external = builder.external;
            this.rate = builder.rate;
            this.requestDuration = builder.requestDuration;
            this.smartPressureTime = builder.smartPressureTime;
            this.source = builder.source;
            this.sqlCompleteReuse = builder.sqlCompleteReuse;
            this.srcInstanceArea = builder.srcInstanceArea;
            this.srcInstanceUuid = builder.srcInstanceUuid;
            this.srcPublicIp = builder.srcPublicIp;
            this.state = builder.state;
            this.status = builder.status;
            this.tableSchema = builder.tableSchema;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.topic = builder.topic;
            this.userId = builder.userId;
            this.version = builder.version;
            this.workDir = builder.workDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudbenchTasks create() {
            return builder().build();
        }

        /**
         * @return archiveJobId
         */
        public String getArchiveJobId() {
            return this.archiveJobId;
        }

        /**
         * @return archiveOssTableName
         */
        public String getArchiveOssTableName() {
            return this.archiveOssTableName;
        }

        /**
         * @return archiveState
         */
        public Integer getArchiveState() {
            return this.archiveState;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return benchStep
         */
        public String getBenchStep() {
            return this.benchStep;
        }

        /**
         * @return benchStepStatus
         */
        public String getBenchStepStatus() {
            return this.benchStepStatus;
        }

        /**
         * @return clientGatewayId
         */
        public String getClientGatewayId() {
            return this.clientGatewayId;
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dstInstanceUuid
         */
        public String getDstInstanceUuid() {
            return this.dstInstanceUuid;
        }

        /**
         * @return dstIp
         */
        public String getDstIp() {
            return this.dstIp;
        }

        /**
         * @return dstPort
         */
        public Integer getDstPort() {
            return this.dstPort;
        }

        /**
         * @return dstType
         */
        public String getDstType() {
            return this.dstType;
        }

        /**
         * @return dtsJobClass
         */
        public String getDtsJobClass() {
            return this.dtsJobClass;
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
         * @return dtsJobState
         */
        public Integer getDtsJobState() {
            return this.dtsJobState;
        }

        /**
         * @return dtsJobStatus
         */
        public String getDtsJobStatus() {
            return this.dtsJobStatus;
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return endState
         */
        public String getEndState() {
            return this.endState;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return external
         */
        public String getExternal() {
            return this.external;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return requestDuration
         */
        public Long getRequestDuration() {
            return this.requestDuration;
        }

        /**
         * @return smartPressureTime
         */
        public Integer getSmartPressureTime() {
            return this.smartPressureTime;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sqlCompleteReuse
         */
        public String getSqlCompleteReuse() {
            return this.sqlCompleteReuse;
        }

        /**
         * @return srcInstanceArea
         */
        public String getSrcInstanceArea() {
            return this.srcInstanceArea;
        }

        /**
         * @return srcInstanceUuid
         */
        public String getSrcInstanceUuid() {
            return this.srcInstanceUuid;
        }

        /**
         * @return srcPublicIp
         */
        public String getSrcPublicIp() {
            return this.srcPublicIp;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableSchema
         */
        public String getTableSchema() {
            return this.tableSchema;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workDir
         */
        public String getWorkDir() {
            return this.workDir;
        }

        public static final class Builder {
            private String archiveJobId; 
            private String archiveOssTableName; 
            private Integer archiveState; 
            private String backupId; 
            private String backupType; 
            private String benchStep; 
            private String benchStepStatus; 
            private String clientGatewayId; 
            private String clientType; 
            private String description; 
            private String dstInstanceUuid; 
            private String dstIp; 
            private Integer dstPort; 
            private String dstType; 
            private String dtsJobClass; 
            private String dtsJobId; 
            private String dtsJobName; 
            private Integer dtsJobState; 
            private String dtsJobStatus; 
            private String ecsInstanceId; 
            private String endState; 
            private String errorCode; 
            private String errorMessage; 
            private String external; 
            private Integer rate; 
            private Long requestDuration; 
            private Integer smartPressureTime; 
            private String source; 
            private String sqlCompleteReuse; 
            private String srcInstanceArea; 
            private String srcInstanceUuid; 
            private String srcPublicIp; 
            private String state; 
            private String status; 
            private String tableSchema; 
            private String taskId; 
            private String taskType; 
            private String topic; 
            private String userId; 
            private String version; 
            private String workDir; 

            /**
             * The archiving task ID.
             */
            public Builder archiveJobId(String archiveJobId) {
                this.archiveJobId = archiveJobId;
                return this;
            }

            /**
             * The name of the table that was archived to Object Storage Service (OSS).
             */
            public Builder archiveOssTableName(String archiveOssTableName) {
                this.archiveOssTableName = archiveOssTableName;
                return this;
            }

            /**
             * The archiving status of the file that stores the analysis result of full SQL statistics. Valid values:
             * <p>
             * 
             * * **0**: The file archiving is not started.
             * * **1**: The file is archived.
             * * **2**: An error occurred.
             * * **3**: The file is being archived.
             * * **4**: The archived file does not need to be downloaded.
             */
            public Builder archiveState(Integer archiveState) {
                this.archiveState = archiveState;
                return this;
            }

            /**
             * The ID of the backup set. You can call the [DescribeBackups](~~26273~~) operation to query the ID of the backup set.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * The backup type. Valid values:
             * <p>
             * 
             * * **TIMESTAMP**: Data is restored to the state at a specific point in time.
             * * **BACKUPID**: Data is restored from a backup set that is identified by an ID.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The substep in the stress testing task. Valid values:
             * <p>
             * 
             * * **NEW**: Initialize the stress testing task.
             * * **WAIT_BUY_ECS**: Purchase an ECS instance.
             * * **WAIT_START_ECS**: Start the ECS instance.
             * * **WAIT_INSTALL_JDK**: Install the Java Development Kit (JDK).
             * * **WAIT_INSTALL_DBGATEWAY**: Install the database gateway (DBGateway).
             * * **ADD_SECURITY_IPS_STEP**: Configure the whitelist of the security group.
             * * **ARCHIVIE**: Archive the file that stores the analysis results of full SQL statistics.
             * * **DOWNLOAD**: Download the file that stores the analysis result of full SQL statistics.
             * * **PROCEED**: Preprocess the file that stores the analysis result of full SQL statistics.
             * * **PRE_LOAD**: Preload the file that stores the analysis result of full SQL statistics.
             * * **VALIDATE**: Verify the functionality of stress testing.
             * * **PRESSURE**: Start the stress testing task.
             */
            public Builder benchStep(String benchStep) {
                this.benchStep = benchStep;
                return this;
            }

            /**
             * The status that indicates the substep performed for the stress testing task. Valid values:
             * <p>
             * 
             * * **NEW**: The task is being initialized.
             * * **RUNNING**: The task is running.
             * * **FAILED**: The task failed.
             * * **FINISHED**: The task is complete.
             * * **Terminated**: The task is terminated.
             * * **Deleted**: The task is deleted.
             */
            public Builder benchStepStatus(String benchStepStatus) {
                this.benchStepStatus = benchStepStatus;
                return this;
            }

            /**
             * The DBGateway ID of the stress testing client.
             */
            public Builder clientGatewayId(String clientGatewayId) {
                this.clientGatewayId = clientGatewayId;
                return this;
            }

            /**
             * The type of the stress testing client. Valid values:
             * <p>
             * 
             * * **ECS**: indicates that you must prepare the DBGateway.
             * * **DAS_ECS**: indicates that DAS automatically purchases and deploys an ECS instance for stress testing.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * The description of the stress testing task.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The UUID of the destination instance.
             */
            public Builder dstInstanceUuid(String dstInstanceUuid) {
                this.dstInstanceUuid = dstInstanceUuid;
                return this;
            }

            /**
             * The reserved parameter.
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * The port number of the destination instance.
             */
            public Builder dstPort(Integer dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * The type of the identifier that is used to indicate the destination instance. Valid values:
             * <p>
             * 
             * * **Instance** (default): the instance ID.
             * * **ConnectionString**: the endpoint of the instance.
             */
            public Builder dstType(String dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * The specification of the DTS instance.
             * <p>
             * 
             * > For more information about the specifications of DTS instances and the test performance of each instance, see [Specifications of data migration instances](~~26606~~).
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * The ID of the DTS migration task.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * The name of the Data Transmission Service (DTS) migration task.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * The status of the DTS migration task. Valid values:
             * <p>
             * 
             * * **NOT_STARTED**: The task is not started.
             * * **PRE_CHECKING**: The task is in precheck.
             * * **PRE_CHECK_FAILED**: The precheck failed.
             * * **CHECKING**: The task is being checked.
             * * **MIGRATING**: The data is being migrated.
             * * **CATCHED**: The data is migrated from the source instance to the destination instance.
             * * **SUSPENDING**: The task is suspended.
             * * **MIGRATION_FAILED**: The data failed to be migrated.
             * * **FINISHED**: The task is complete.
             * * **INITIALIZING**: The synchronization is being initialized.
             * * **INITIALIZE_FAILED**: The synchronization failed to be initialized.
             * * **SYNCHRONIZING**: The data is being synchronized.
             * * **MODIFYING**: The roles of the instances are being changed.
             * * **SWITCHING**: The roles of the instances are being switched.
             * * **FAILED**: The task failed.
             */
            public Builder dtsJobState(Integer dtsJobState) {
                this.dtsJobState = dtsJobState;
                return this;
            }

            /**
             * The status of the DTS migration task. Valid values:
             * <p>
             * 
             * * **NOT_STARTED**: The task is not started.
             * * **PRE_CHECKING**: The task is in precheck.
             * * **PRE_CHECK_FAILED**: The precheck failed.
             * * **CHECKING**: The task is being checked.
             * * **MIGRATING**: The data is being migrated.
             * * **CATCHED**: The data is migrated from the source instance to the destination instance.
             * * **SUSPENDING**: The task is suspended.
             * * **MIGRATION_FAILED**: The data failed to be migrated.
             * * **FINISHED**: The task is complete.
             * * **INITIALIZING**: The synchronization is being initialized.
             * * **INITIALIZE_FAILED**: The synchronization failed to be initialized.
             * * **SYNCHRONIZING**: The data is being synchronized.
             * * **MODIFYING**: The roles of the instances are being changed.
             * * **SWITCHING**: The roles of the instances are being switched.
             * * **FAILED**: The task failed.
             */
            public Builder dtsJobStatus(String dtsJobStatus) {
                this.dtsJobStatus = dtsJobStatus;
                return this;
            }

            /**
             * The ID of the Elastic Compute Service (ECS) instance.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * The state that indicates the last operation performed for the stress testing task. Valid values:
             * <p>
             * 
             * * **WAIT_TARGET**: prepares the destination instance.
             * * **WAIT_DBGATEWAY**: prepares the DBGateway.
             * * **WAIT_SQL**: prepares the full SQL statistics.
             * * **WAIT_LOGIC**: prepares to replay the traffic.
             * 
             * > When the state of a stress testing task changes to the state that is specified by the EndState parameter, the stress testing task is complete.
             */
            public Builder endState(String endState) {
                this.endState = endState;
                return this;
            }

            /**
             * The error code returned for the substep of the stress testing task.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned if the task failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The additional information.
             */
            public Builder external(String external) {
                this.external = external;
                return this;
            }

            /**
             * The rate at which the stress testing task replayed the traffic. This value is a positive integer. Valid values: **0** to **30**. Default value: **1**.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The duration of the stress testing task. Unit: millisecond.
             */
            public Builder requestDuration(Long requestDuration) {
                this.requestDuration = requestDuration;
                return this;
            }

            /**
             * The duration of the stress testing task of the smart pressure test type. Unit: millisecond.
             */
            public Builder smartPressureTime(Integer smartPressureTime) {
                this.smartPressureTime = smartPressureTime;
                return this;
            }

            /**
             * The source of the task. Valid values:
             * <p>
             * 
             * * **DAS**
             * * **OPEN_API**
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The reused information about the analysis result of full SQL statistics.
             */
            public Builder sqlCompleteReuse(String sqlCompleteReuse) {
                this.sqlCompleteReuse = sqlCompleteReuse;
                return this;
            }

            /**
             * The database engine of the source instance. Valid values:
             */
            public Builder srcInstanceArea(String srcInstanceArea) {
                this.srcInstanceArea = srcInstanceArea;
                return this;
            }

            /**
             * The UUID of the source instance.
             */
            public Builder srcInstanceUuid(String srcInstanceUuid) {
                this.srcInstanceUuid = srcInstanceUuid;
                return this;
            }

            /**
             * The reserved parameter.
             */
            public Builder srcPublicIp(String srcPublicIp) {
                this.srcPublicIp = srcPublicIp;
                return this;
            }

            /**
             * The state that indicates the operation performed for the stress testing task. Valid values:
             * <p>
             * 
             * * **WAIT_TARGET**: prepares the destination instance.
             * * **WAIT_DBGATEWAY**: prepares the DBGateway.
             * * **WAIT_SQL**: prepares the full SQL statistics.
             * * **WAIT_LOGIC**: prepares to replay the traffic.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The status of the stress testing task. Valid values:
             * <p>
             * 
             * * **SUCCESS**: The task was successful.
             * * **IGNORED**: The task was ignored.
             * * **RUNNING**: The task is running.
             * * **EXCEPTION**: The task is abnormal.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the table that is used for stress testing.
             */
            public Builder tableSchema(String tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The type of the stress testing task. Valid values:
             * <p>
             * 
             * * **pressure test** (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.
             * * **smart pressure test**: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The topic that contains the consumed data. This topic is a topic in Message Queue for Apache Kafka.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The Alibaba Cloud account ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The version of the stress testing task. Valid values:
             * <p>
             * 
             * * **V2.0**
             * * **V3.0**
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The path of the temporary directory that is generated for stress testing.
             */
            public Builder workDir(String workDir) {
                this.workDir = workDir;
                return this;
            }

            public CloudbenchTasks build() {
                return new CloudbenchTasks(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("cloudbenchTasks")
        private java.util.List < CloudbenchTasks> cloudbenchTasks;

        private List(Builder builder) {
            this.cloudbenchTasks = builder.cloudbenchTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return cloudbenchTasks
         */
        public java.util.List < CloudbenchTasks> getCloudbenchTasks() {
            return this.cloudbenchTasks;
        }

        public static final class Builder {
            private java.util.List < CloudbenchTasks> cloudbenchTasks; 

            /**
             * cloudbenchTasks.
             */
            public Builder cloudbenchTasks(java.util.List < CloudbenchTasks> cloudbenchTasks) {
                this.cloudbenchTasks = cloudbenchTasks;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Extra")
        private String extra;

        @NameInMap("List")
        private List list;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String extra; 
            private List list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long total; 

            /**
             * The reserved parameter.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The detailed information of the stress testing task.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
