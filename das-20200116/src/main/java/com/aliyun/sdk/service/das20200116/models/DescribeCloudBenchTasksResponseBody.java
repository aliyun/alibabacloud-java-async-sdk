// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCloudBenchTasksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information list, including the total number of entries and error codes.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
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
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
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

            private Builder() {
            } 

            private Builder(CloudbenchTasks model) {
                this.archiveJobId = model.archiveJobId;
                this.archiveOssTableName = model.archiveOssTableName;
                this.archiveState = model.archiveState;
                this.backupId = model.backupId;
                this.backupType = model.backupType;
                this.benchStep = model.benchStep;
                this.benchStepStatus = model.benchStepStatus;
                this.clientGatewayId = model.clientGatewayId;
                this.clientType = model.clientType;
                this.description = model.description;
                this.dstInstanceUuid = model.dstInstanceUuid;
                this.dstIp = model.dstIp;
                this.dstPort = model.dstPort;
                this.dstType = model.dstType;
                this.dtsJobClass = model.dtsJobClass;
                this.dtsJobId = model.dtsJobId;
                this.dtsJobName = model.dtsJobName;
                this.dtsJobState = model.dtsJobState;
                this.dtsJobStatus = model.dtsJobStatus;
                this.ecsInstanceId = model.ecsInstanceId;
                this.endState = model.endState;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.external = model.external;
                this.rate = model.rate;
                this.requestDuration = model.requestDuration;
                this.smartPressureTime = model.smartPressureTime;
                this.source = model.source;
                this.sqlCompleteReuse = model.sqlCompleteReuse;
                this.srcInstanceArea = model.srcInstanceArea;
                this.srcInstanceUuid = model.srcInstanceUuid;
                this.srcPublicIp = model.srcPublicIp;
                this.state = model.state;
                this.status = model.status;
                this.tableSchema = model.tableSchema;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.topic = model.topic;
                this.userId = model.userId;
                this.version = model.version;
                this.workDir = model.workDir;
            } 

            /**
             * ArchiveJobId.
             */
            public Builder archiveJobId(String archiveJobId) {
                this.archiveJobId = archiveJobId;
                return this;
            }

            /**
             * ArchiveOssTableName.
             */
            public Builder archiveOssTableName(String archiveOssTableName) {
                this.archiveOssTableName = archiveOssTableName;
                return this;
            }

            /**
             * ArchiveState.
             */
            public Builder archiveState(Integer archiveState) {
                this.archiveState = archiveState;
                return this;
            }

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
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
             * BenchStep.
             */
            public Builder benchStep(String benchStep) {
                this.benchStep = benchStep;
                return this;
            }

            /**
             * BenchStepStatus.
             */
            public Builder benchStepStatus(String benchStepStatus) {
                this.benchStepStatus = benchStepStatus;
                return this;
            }

            /**
             * ClientGatewayId.
             */
            public Builder clientGatewayId(String clientGatewayId) {
                this.clientGatewayId = clientGatewayId;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DstInstanceUuid.
             */
            public Builder dstInstanceUuid(String dstInstanceUuid) {
                this.dstInstanceUuid = dstInstanceUuid;
                return this;
            }

            /**
             * DstIp.
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * DstPort.
             */
            public Builder dstPort(Integer dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * DstType.
             */
            public Builder dstType(String dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * DtsJobClass.
             */
            public Builder dtsJobClass(String dtsJobClass) {
                this.dtsJobClass = dtsJobClass;
                return this;
            }

            /**
             * DtsJobId.
             */
            public Builder dtsJobId(String dtsJobId) {
                this.dtsJobId = dtsJobId;
                return this;
            }

            /**
             * DtsJobName.
             */
            public Builder dtsJobName(String dtsJobName) {
                this.dtsJobName = dtsJobName;
                return this;
            }

            /**
             * DtsJobState.
             */
            public Builder dtsJobState(Integer dtsJobState) {
                this.dtsJobState = dtsJobState;
                return this;
            }

            /**
             * DtsJobStatus.
             */
            public Builder dtsJobStatus(String dtsJobStatus) {
                this.dtsJobStatus = dtsJobStatus;
                return this;
            }

            /**
             * EcsInstanceId.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * EndState.
             */
            public Builder endState(String endState) {
                this.endState = endState;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * External.
             */
            public Builder external(String external) {
                this.external = external;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * RequestDuration.
             */
            public Builder requestDuration(Long requestDuration) {
                this.requestDuration = requestDuration;
                return this;
            }

            /**
             * SmartPressureTime.
             */
            public Builder smartPressureTime(Integer smartPressureTime) {
                this.smartPressureTime = smartPressureTime;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SqlCompleteReuse.
             */
            public Builder sqlCompleteReuse(String sqlCompleteReuse) {
                this.sqlCompleteReuse = sqlCompleteReuse;
                return this;
            }

            /**
             * SrcInstanceArea.
             */
            public Builder srcInstanceArea(String srcInstanceArea) {
                this.srcInstanceArea = srcInstanceArea;
                return this;
            }

            /**
             * SrcInstanceUuid.
             */
            public Builder srcInstanceUuid(String srcInstanceUuid) {
                this.srcInstanceUuid = srcInstanceUuid;
                return this;
            }

            /**
             * SrcPublicIp.
             */
            public Builder srcPublicIp(String srcPublicIp) {
                this.srcPublicIp = srcPublicIp;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TableSchema.
             */
            public Builder tableSchema(String tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * WorkDir.
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
        private java.util.List<CloudbenchTasks> cloudbenchTasks;

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
        public java.util.List<CloudbenchTasks> getCloudbenchTasks() {
            return this.cloudbenchTasks;
        }

        public static final class Builder {
            private java.util.List<CloudbenchTasks> cloudbenchTasks; 

            private Builder() {
            } 

            private Builder(List model) {
                this.cloudbenchTasks = model.cloudbenchTasks;
            } 

            /**
             * cloudbenchTasks.
             */
            public Builder cloudbenchTasks(java.util.List<CloudbenchTasks> cloudbenchTasks) {
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.extra = model.extra;
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

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
             * List.
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
             * <p>The maximum number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of results.</p>
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
