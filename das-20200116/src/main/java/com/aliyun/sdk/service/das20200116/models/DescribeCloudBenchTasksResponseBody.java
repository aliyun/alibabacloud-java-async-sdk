// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCloudBenchTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudBenchTasksResponseBody</p>
 */
public class DescribeCloudBenchTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCloudBenchTasksResponseBody build() {
            return new DescribeCloudBenchTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudBenchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudBenchTasksResponseBody</p>
     */
    public static class CloudbenchTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveJobId")
        private String archiveJobId;

        @com.aliyun.core.annotation.NameInMap("ArchiveOssTableName")
        private String archiveOssTableName;

        @com.aliyun.core.annotation.NameInMap("ArchiveState")
        private Integer archiveState;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("BenchStep")
        private String benchStep;

        @com.aliyun.core.annotation.NameInMap("BenchStepStatus")
        private String benchStepStatus;

        @com.aliyun.core.annotation.NameInMap("ClientGatewayId")
        private String clientGatewayId;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DstInstanceUuid")
        private String dstInstanceUuid;

        @com.aliyun.core.annotation.NameInMap("DstIp")
        private String dstIp;

        @com.aliyun.core.annotation.NameInMap("DstPort")
        private Integer dstPort;

        @com.aliyun.core.annotation.NameInMap("DstType")
        private String dstType;

        @com.aliyun.core.annotation.NameInMap("DtsJobClass")
        private String dtsJobClass;

        @com.aliyun.core.annotation.NameInMap("DtsJobId")
        private String dtsJobId;

        @com.aliyun.core.annotation.NameInMap("DtsJobName")
        private String dtsJobName;

        @com.aliyun.core.annotation.NameInMap("DtsJobState")
        private Integer dtsJobState;

        @com.aliyun.core.annotation.NameInMap("DtsJobStatus")
        private String dtsJobStatus;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("EndState")
        private String endState;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("External")
        private String external;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("RequestDuration")
        private Long requestDuration;

        @com.aliyun.core.annotation.NameInMap("SmartPressureTime")
        private Integer smartPressureTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SqlCompleteReuse")
        private String sqlCompleteReuse;

        @com.aliyun.core.annotation.NameInMap("SrcInstanceArea")
        private String srcInstanceArea;

        @com.aliyun.core.annotation.NameInMap("SrcInstanceUuid")
        private String srcInstanceUuid;

        @com.aliyun.core.annotation.NameInMap("SrcPublicIp")
        private String srcPublicIp;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TableSchema")
        private String tableSchema;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("WorkDir")
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
             * <p>The archiving task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;202105211430070112231480820340758****</p>
             */
            public Builder archiveJobId(String archiveJobId) {
                this.archiveJobId = archiveJobId;
                return this;
            }

            /**
             * <p>The name of the table that was archived to Object Storage Service (OSS).</p>
             * 
             * <strong>example:</strong>
             * <p>custins15546355_161604665****</p>
             */
            public Builder archiveOssTableName(String archiveOssTableName) {
                this.archiveOssTableName = archiveOssTableName;
                return this;
            }

            /**
             * <p>The archiving status of the file that stores the analysis result of full SQL statistics. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The file archiving is not started.</li>
             * <li><strong>1</strong>: The file is archived.</li>
             * <li><strong>2</strong>: An error occurred.</li>
             * <li><strong>3</strong>: The file is being archived.</li>
             * <li><strong>4</strong>: The archived file does not need to be downloaded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder archiveState(Integer archiveState) {
                this.archiveState = archiveState;
                return this;
            }

            /**
             * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>229132</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>TIMESTAMP</strong>: Data is restored to the state at a specific point in time.</li>
             * <li><strong>BACKUPID</strong>: Data is restored from a backup set that is identified by an ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TIMESTAMP</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The substep in the stress testing task. Valid values:</p>
             * <ul>
             * <li><strong>NEW</strong>: Initialize the stress testing task.</li>
             * <li><strong>WAIT_BUY_ECS</strong>: Purchase an ECS instance.</li>
             * <li><strong>WAIT_START_ECS</strong>: Start the ECS instance.</li>
             * <li><strong>WAIT_INSTALL_JDK</strong>: Install the Java Development Kit (JDK).</li>
             * <li><strong>WAIT_INSTALL_DBGATEWAY</strong>: Install the database gateway (DBGateway).</li>
             * <li><strong>ADD_SECURITY_IPS_STEP</strong>: Configure the whitelist of the security group.</li>
             * <li><strong>ARCHIVE</strong>: Archive the file that stores the analysis results of full SQL statistics.</li>
             * <li><strong>DOWNLOAD</strong>: Download the file that stores the analysis result of full SQL statistics.</li>
             * <li><strong>PROCEED</strong>: Preprocess the file that stores the analysis result of full SQL statistics.</li>
             * <li><strong>PRE_LOAD</strong>: Preload the file that stores the analysis result of full SQL statistics.</li>
             * <li><strong>VALIDATE</strong>: Verify the functionality of stress testing.</li>
             * <li><strong>PRESSURE</strong>: Start the stress testing task.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PROCEED</p>
             */
            public Builder benchStep(String benchStep) {
                this.benchStep = benchStep;
                return this;
            }

            /**
             * <p>The status that indicates the substep performed for the stress testing task. Valid values:</p>
             * <ul>
             * <li><strong>NEW</strong>: The task is being initialized.</li>
             * <li><strong>RUNNING</strong>: The task is running.</li>
             * <li><strong>FAILED</strong>: The task failed.</li>
             * <li><strong>FINISHED</strong>: The task is complete.</li>
             * <li><strong>Terminated</strong>: The task is terminated.</li>
             * <li><strong>Deleted</strong>: The task is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder benchStepStatus(String benchStepStatus) {
                this.benchStepStatus = benchStepStatus;
                return this;
            }

            /**
             * <p>The DBGateway ID of the stress testing client.</p>
             * 
             * <strong>example:</strong>
             * <p>58598b2af48a0193dfc16fc6964ef****</p>
             */
            public Builder clientGatewayId(String clientGatewayId) {
                this.clientGatewayId = clientGatewayId;
                return this;
            }

            /**
             * <p>The type of the stress testing client. Valid values:</p>
             * <ul>
             * <li><strong>ECS</strong>: indicates that you must prepare the DBGateway.</li>
             * <li><strong>DAS_ECS</strong>: indicates that DAS automatically purchases and deploys an ECS instance for stress testing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The description of the stress testing task.</p>
             * 
             * <strong>example:</strong>
             * <p>test-das-bench-0501</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The UUID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hdm_d887b5ccf99fa0dc9a1e5aaac368****</p>
             */
            public Builder dstInstanceUuid(String dstInstanceUuid) {
                this.dstInstanceUuid = dstInstanceUuid;
                return this;
            }

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * <p>The port number of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder dstPort(Integer dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * <p>The type of the identifier that is used to indicate the destination instance. Valid values:</p>
             * <ul>
             * <li><strong>Instance</strong> (default): the instance ID.</li>
             * <li><strong>ConnectionString</strong>: the endpoint of the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder dstType(String dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * <p>The specification of the DTS instance.</p>
             * <blockquote>
             * <p>For more information about the specifications of DTS instances and the test performance of each instance, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration instances</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * <p>The ID of the DTS migration task.</p>
             * 
             * <strong>example:</strong>
             * <p>i03e3zty16i****</p>
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * <p>The name of the Data Transmission Service (DTS) migration task.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS_TO_RDS_MIGRATION</p>
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * <p>The status of the DTS migration task. Valid values:</p>
             * <ul>
             * <li><strong>NOT_STARTED</strong>: The task is not started.</li>
             * <li><strong>PRE_CHECKING</strong>: The task is in precheck.</li>
             * <li><strong>PRE_CHECK_FAILED</strong>: The precheck failed.</li>
             * <li><strong>CHECKING</strong>: The task is being checked.</li>
             * <li><strong>MIGRATING</strong>: The data is being migrated.</li>
             * <li><strong>CATCHED</strong>: The data is migrated from the source instance to the destination instance.</li>
             * <li><strong>SUSPENDING</strong>: The task is suspended.</li>
             * <li><strong>MIGRATION_FAILED</strong>: The data failed to be migrated.</li>
             * <li><strong>FINISHED</strong>: The task is complete.</li>
             * <li><strong>INITIALIZING</strong>: The synchronization is being initialized.</li>
             * <li><strong>INITIALIZE_FAILED</strong>: The synchronization failed to be initialized.</li>
             * <li><strong>SYNCHRONIZING</strong>: The data is being synchronized.</li>
             * <li><strong>MODIFYING</strong>: The roles of the instances are being changed.</li>
             * <li><strong>SWITCHING</strong>: The roles of the instances are being switched.</li>
             * <li><strong>FAILED</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHECKING</p>
             */
            public Builder dtsJobState(Integer dtsJobState) {
                this.dtsJobState = dtsJobState;
                return this;
            }

            /**
             * <p>The status of the DTS migration task. Valid values:</p>
             * <ul>
             * <li><strong>NOT_STARTED</strong>: The task is not started.</li>
             * <li><strong>PRE_CHECKING</strong>: The task is in precheck.</li>
             * <li><strong>PRE_CHECK_FAILED</strong>: The precheck failed.</li>
             * <li><strong>CHECKING</strong>: The task is being checked.</li>
             * <li><strong>MIGRATING</strong>: The data is being migrated.</li>
             * <li><strong>CATCHED</strong>: The data is migrated from the source instance to the destination instance.</li>
             * <li><strong>SUSPENDING</strong>: The task is suspended.</li>
             * <li><strong>MIGRATION_FAILED</strong>: The data failed to be migrated.</li>
             * <li><strong>FINISHED</strong>: The task is complete.</li>
             * <li><strong>INITIALIZING</strong>: The synchronization is being initialized.</li>
             * <li><strong>INITIALIZE_FAILED</strong>: The synchronization failed to be initialized.</li>
             * <li><strong>SYNCHRONIZING</strong>: The data is being synchronized.</li>
             * <li><strong>MODIFYING</strong>: The roles of the instances are being changed.</li>
             * <li><strong>SWITCHING</strong>: The roles of the instances are being switched.</li>
             * <li><strong>FAILED</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRE_CHECK_FAILED</p>
             */
            public Builder dtsJobStatus(String dtsJobStatus) {
                this.dtsJobStatus = dtsJobStatus;
                return this;
            }

            /**
             * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1ecr5go2go1****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The state that indicates the last operation performed for the stress testing task. Valid values:</p>
             * <ul>
             * <li><strong>WAIT_TARGET</strong>: prepares the destination instance.</li>
             * <li><strong>WAIT_DBGATEWAY</strong>: prepares the DBGateway.</li>
             * <li><strong>WAIT_SQL</strong>: prepares the full SQL statistics.</li>
             * <li><strong>WAIT_LOGIC</strong>: prepares to replay the traffic.</li>
             * </ul>
             * <blockquote>
             * <p>When the state of a stress testing task changes to the state that is specified by the EndState parameter, the stress testing task is complete.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>WAIT_TARGET</p>
             */
            public Builder endState(String endState) {
                this.endState = endState;
                return this;
            }

            /**
             * <p>The error code returned for the substep of the stress testing task.</p>
             * 
             * <strong>example:</strong>
             * <p>10109</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>Null</p>
             */
            public Builder external(String external) {
                this.external = external;
                return this;
            }

            /**
             * <p>The rate at which the stress testing task replayed the traffic. This value is a positive integer. Valid values: <strong>0</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The duration of the stress testing task. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>86400000</p>
             */
            public Builder requestDuration(Long requestDuration) {
                this.requestDuration = requestDuration;
                return this;
            }

            /**
             * <p>The duration of the stress testing task of the smart pressure test type. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>86400000</p>
             */
            public Builder smartPressureTime(Integer smartPressureTime) {
                this.smartPressureTime = smartPressureTime;
                return this;
            }

            /**
             * <p>The source of the task. Valid values:</p>
             * <ul>
             * <li><strong>DAS</strong></li>
             * <li><strong>OPEN_API</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DAS</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The reused information about the analysis result of full SQL statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;sqlUuid&quot;:&quot;task_a37d2f07-45cb-4413-a2a6-c66c68****&quot;,&quot;metaUuid&quot;:&quot;task_211e2561-5c0c-486b-864c-56b511****&quot;,&quot;sqlFile&quot;:&quot;cl-1620057600000-1800626.sc&quot;,&quot;metaFile&quot;:&quot;cl-1620057600000-1800626.meta&quot;}</p>
             */
            public Builder sqlCompleteReuse(String sqlCompleteReuse) {
                this.sqlCompleteReuse = sqlCompleteReuse;
                return this;
            }

            /**
             * <p>The database engine of the source instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder srcInstanceArea(String srcInstanceArea) {
                this.srcInstanceArea = srcInstanceArea;
                return this;
            }

            /**
             * <p>The UUID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hdm_3063db6792965c080a4bcb6e6304****</p>
             */
            public Builder srcInstanceUuid(String srcInstanceUuid) {
                this.srcInstanceUuid = srcInstanceUuid;
                return this;
            }

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder srcPublicIp(String srcPublicIp) {
                this.srcPublicIp = srcPublicIp;
                return this;
            }

            /**
             * <p>The state that indicates the operation performed for the stress testing task. Valid values:</p>
             * <ul>
             * <li><strong>WAIT_TARGET</strong>: prepares the destination instance.</li>
             * <li><strong>WAIT_DBGATEWAY</strong>: prepares the DBGateway.</li>
             * <li><strong>WAIT_SQL</strong>: prepares the full SQL statistics.</li>
             * <li><strong>WAIT_LOGIC</strong>: prepares to replay the traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WAIT_TARGET</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The status of the stress testing task. Valid values:</p>
             * <ul>
             * <li><strong>SUCCESS</strong>: The task was successful.</li>
             * <li><strong>IGNORED</strong>: The task was ignored.</li>
             * <li><strong>RUNNING</strong>: The task is running.</li>
             * <li><strong>EXCEPTION</strong>: The task is abnormal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the table that is used for stress testing.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;TABLE_NAME&quot;:&quot;customer1&quot;,&quot;TABLE_SCHEMA&quot;:&quot;tpcc&quot;}]</p>
             */
            public Builder tableSchema(String tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e5cec704-0518-430f-8263-76f4dcds****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The type of the stress testing task. Valid values:</p>
             * <ul>
             * <li><strong>pressure test</strong> (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.</li>
             * <li><strong>smart pressure test</strong>: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pressure test</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The topic that contains the consumed data. This topic is a topic in Message Queue for Apache Kafka.</p>
             * 
             * <strong>example:</strong>
             * <p>das</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1091411816252****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The version of the stress testing task. Valid values:</p>
             * <ul>
             * <li><strong>V2.0</strong></li>
             * <li><strong>V3.0</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>V3.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The path of the temporary directory that is generated for stress testing.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/bench/</p>
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
    /**
     * 
     * {@link DescribeCloudBenchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudBenchTasksResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cloudbenchTasks")
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
    /**
     * 
     * {@link DescribeCloudBenchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudBenchTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
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
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The detailed information of the stress testing task.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
