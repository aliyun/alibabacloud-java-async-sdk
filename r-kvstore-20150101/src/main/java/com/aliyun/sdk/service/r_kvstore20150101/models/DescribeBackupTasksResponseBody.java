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
    @NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @NameInMap("BackupJobs")
    private java.util.List < BackupJobs> backupJobs;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupTasksResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private AccessDeniedDetail accessDeniedDetail; 
        private java.util.List < BackupJobs> backupJobs; 
        private String instanceId; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The details of the backup tasks.
         */
        public Builder backupJobs(java.util.List < BackupJobs> backupJobs) {
            this.backupJobs = backupJobs;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The status of the backup task. Valid values:
         * <p>
         * 
         * *   **NoStart**: The backup task is not started.
         * *   **Preparing**: The backup task is being prepared.
         * *   **Waiting**: The backup task is pending.
         * *   **Uploading:** The system is uploading the backup file.
         * *   **Checking:** The system is checking the uploaded backup file.
         * *   **Finished**: The backup task is complete.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupTasksResponseBody build() {
            return new DescribeBackupTasksResponseBody(this);
        } 

    } 

    public static class AccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        private String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        private String noPermissionType;

        @NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

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
             * The ID of the backup task.
             */
            public Builder backupJobID(Integer backupJobID) {
                this.backupJobID = backupJobID;
                return this;
            }

            /**
             * The state of the backup task. Valid values:
             * <p>
             * 
             * *   **NoStart**: The backup task is not started.
             * *   **Preparing**: The backup task is being prepared.
             * *   **Waiting**: The backup task is pending.
             * *   **Uploading**: The system is uploading the backup file.
             * *   **Checking**: The system is checking the uploaded backup file.
             * *   **Finished**: The backup task is completed.
             */
            public Builder backupProgressStatus(String backupProgressStatus) {
                this.backupProgressStatus = backupProgressStatus;
                return this;
            }

            /**
             * The backup mode. Valid values:
             * <p>
             * 
             * *   **Automated**: automatic backup
             * *   **Manual**: manual backup
             */
            public Builder jobMode(String jobMode) {
                this.jobMode = jobMode;
                return this;
            }

            /**
             * The ID of the data node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The progress of the backup task in percentage.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * The start time of the backup task. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The type of the backup task. Valid values:
             * <p>
             * 
             * *   **TempBackupTask**: The backup task was manually performed.
             * *   **NormalBackupTask**: The backup task was automatically performed.
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
