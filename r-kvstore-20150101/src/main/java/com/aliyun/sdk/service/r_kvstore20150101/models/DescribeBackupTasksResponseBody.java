// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupTasksResponseBody</p>
 */
public class DescribeBackupTasksResponseBody extends TeaModel {
    @NameInMap("BackupJobs")
    private java.util.List < BackupJobs> backupJobs;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupTasksResponseBody(Builder builder) {
        this.backupJobs = builder.backupJobs;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupJobs
     */
    public java.util.List < BackupJobs> getBackupJobs() {
        return this.backupJobs;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BackupJobs> backupJobs; 
        private String instanceId; 
        private String requestId; 

        /**
         * BackupJobs.
         */
        public Builder backupJobs(java.util.List < BackupJobs> backupJobs) {
            this.backupJobs = backupJobs;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupTasksResponseBody build() {
            return new DescribeBackupTasksResponseBody(this);
        } 

    } 

    public static class BackupJobs extends TeaModel {
        @NameInMap("BackupJobID")
        private Integer backupJobID;

        @NameInMap("BackupProgressStatus")
        private String backupProgressStatus;

        @NameInMap("JobMode")
        private String jobMode;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Process")
        private String process;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("TaskAction")
        private String taskAction;

        private BackupJobs(Builder builder) {
            this.backupJobID = builder.backupJobID;
            this.backupProgressStatus = builder.backupProgressStatus;
            this.jobMode = builder.jobMode;
            this.nodeId = builder.nodeId;
            this.process = builder.process;
            this.startTime = builder.startTime;
            this.taskAction = builder.taskAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupJobs create() {
            return builder().build();
        }

        /**
         * @return backupJobID
         */
        public Integer getBackupJobID() {
            return this.backupJobID;
        }

        /**
         * @return backupProgressStatus
         */
        public String getBackupProgressStatus() {
            return this.backupProgressStatus;
        }

        /**
         * @return jobMode
         */
        public String getJobMode() {
            return this.jobMode;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskAction
         */
        public String getTaskAction() {
            return this.taskAction;
        }

        public static final class Builder {
            private Integer backupJobID; 
            private String backupProgressStatus; 
            private String jobMode; 
            private String nodeId; 
            private String process; 
            private String startTime; 
            private String taskAction; 

            /**
             * BackupJobID.
             */
            public Builder backupJobID(Integer backupJobID) {
                this.backupJobID = backupJobID;
                return this;
            }

            /**
             * BackupProgressStatus.
             */
            public Builder backupProgressStatus(String backupProgressStatus) {
                this.backupProgressStatus = backupProgressStatus;
                return this;
            }

            /**
             * JobMode.
             */
            public Builder jobMode(String jobMode) {
                this.jobMode = jobMode;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TaskAction.
             */
            public Builder taskAction(String taskAction) {
                this.taskAction = taskAction;
                return this;
            }

            public BackupJobs build() {
                return new BackupJobs(this);
            } 

        } 

    }
}
