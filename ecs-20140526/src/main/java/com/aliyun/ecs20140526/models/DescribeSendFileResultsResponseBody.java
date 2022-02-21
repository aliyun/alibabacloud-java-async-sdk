// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSendFileResultsResponseBody</p>
 */
public class DescribeSendFileResultsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Invocations")
    private Invocations invocations;

    private DescribeSendFileResultsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.invocations = builder.invocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSendFileResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return invocations
     */
    public Invocations getInvocations() {
        return this.invocations;
    }

    public static final class Builder {
        private Long pageSize; 
        private String requestId; 
        private Long pageNumber; 
        private Long totalCount; 
        private Invocations invocations; 

        /**
         * The number of rows per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The current page number of the query result.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of scripts.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * File Distribution records.
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        public DescribeSendFileResultsResponseBody build() {
            return new DescribeSendFileResultsResponseBody(this);
        } 

    } 

    public static class InvokeInstance extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("ErrorInfo")
        private String errorInfo;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("InstanceId")
        private String instanceId;

        private InvokeInstance(Builder builder) {
            this.creationTime = builder.creationTime;
            this.startTime = builder.startTime;
            this.invocationStatus = builder.invocationStatus;
            this.finishTime = builder.finishTime;
            this.updateTime = builder.updateTime;
            this.errorInfo = builder.errorInfo;
            this.errorCode = builder.errorCode;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstance create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String creationTime; 
            private String startTime; 
            private String invocationStatus; 
            private String finishTime; 
            private String updateTime; 
            private String errorInfo; 
            private String errorCode; 
            private String instanceId; 

            /**
             * The creation time of the file delivery task.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The time when the task starts to run in the instance.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the task.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The end time of the task.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The time when the task status was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The error message returned because the file failed to be delivered or failed to be executed. Possible values:
             * <p>
             * 
             * -Null: The file is delivered normally.
             * -the specified instance does not exists: the specified instance does not exist or has been released.
             * -the instance has released when create task: issued during file, the instance is release.
             * -the instance is not running when create task: create issued file task when the instance is not running.
             * -the specified account does not exists: the specified account does not exist.
             * -the aliyun service is not running on the instance: Cloud assistant client is not running.
             * -the aliyun service in the instance does not response: the cloud assistant client does not respond.
             * -the aliyun service in the instance is upgrading now: the cloud assistant client is being upgraded.
             * -the aliyun service in the instance need upgrade: the cloud assistant client needs to be upgraded.
             * -the command delivery has been timeout.
             * -Unexpected error during creating: file creation failed.
             * -File already exists: files with the same name exist in the same path.
             * -File content error: File content is not legal.
             * -File name is invalid: File name not legal.
             * -File path is invalid: File path not legal.
             * -Owner not exists: user does not exist.
             * -Group not exists: User Group does not exist.
             * -Mode is invalid: file permission settings do not legal.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * Document issued by the failure reason code. Possible values:
             * <p>
             * 
             * -Null: The file is delivered normally.
             * -InstanceNotExists: the specified instance does not exist or has been released.
             * -InstanceReleased: issued during file, the instance is release.
             * -InstanceNotRunning: create issued file task when the instance is not running.
             * -AccountNotExists: the specified account does not exist.
             * -ClientNotRunning: The cloud assistant client is not running.
             * -ClientNotResponse: The cloud assistant client does not respond.
             * -ClientIsUpgrading: The cloud assistant client is being upgraded.
             * -ClientNeedUpgrade: The cloud assistant client needs to be upgraded.
             * -DeliveryTimeout: sending file timeout.
             * -FileCreateFail: file creation failed.
             * -FileAlreadyExists: Same path lower file with the same name exists.
             * -FileContentInvalid: file content is not legal.
             * -FileNameInvalid: file name not legal.
             * -FilePathInvalid: file path not legal.
             * -FileAuthorityInvalid: file permissions not legal.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InvokeInstance build() {
                return new InvokeInstance(this);
            } 

        } 

    }
    public static class InvokeInstances extends TeaModel {
        @NameInMap("InvokeInstance")
        private java.util.List < InvokeInstance> invokeInstance;

        private InvokeInstances(Builder builder) {
            this.invokeInstance = builder.invokeInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstances create() {
            return builder().build();
        }

        /**
         * @return invokeInstance
         */
        public java.util.List < InvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

        public static final class Builder {
            private java.util.List < InvokeInstance> invokeInstance; 

            /**
             * InvokeInstance.
             */
            public Builder invokeInstance(java.util.List < InvokeInstance> invokeInstance) {
                this.invokeInstance = invokeInstance;
                return this;
            }

            public InvokeInstances build() {
                return new InvokeInstances(this);
            } 

        } 

    }
    public static class Invocation extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("TargetDir")
        private String targetDir;

        @NameInMap("FileOwner")
        private String fileOwner;

        @NameInMap("Description")
        private String description;

        @NameInMap("VmCount")
        private Integer vmCount;

        @NameInMap("FileMode")
        private String fileMode;

        @NameInMap("FileGroup")
        private String fileGroup;

        @NameInMap("InvokeId")
        private String invokeId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Content")
        private String content;

        @NameInMap("Overwrite")
        private String overwrite;

        @NameInMap("InvokeInstances")
        private InvokeInstances invokeInstances;

        private Invocation(Builder builder) {
            this.creationTime = builder.creationTime;
            this.invocationStatus = builder.invocationStatus;
            this.contentType = builder.contentType;
            this.targetDir = builder.targetDir;
            this.fileOwner = builder.fileOwner;
            this.description = builder.description;
            this.vmCount = builder.vmCount;
            this.fileMode = builder.fileMode;
            this.fileGroup = builder.fileGroup;
            this.invokeId = builder.invokeId;
            this.name = builder.name;
            this.content = builder.content;
            this.overwrite = builder.overwrite;
            this.invokeInstances = builder.invokeInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocation create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return targetDir
         */
        public String getTargetDir() {
            return this.targetDir;
        }

        /**
         * @return fileOwner
         */
        public String getFileOwner() {
            return this.fileOwner;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return vmCount
         */
        public Integer getVmCount() {
            return this.vmCount;
        }

        /**
         * @return fileMode
         */
        public String getFileMode() {
            return this.fileMode;
        }

        /**
         * @return fileGroup
         */
        public String getFileGroup() {
            return this.fileGroup;
        }

        /**
         * @return invokeId
         */
        public String getInvokeId() {
            return this.invokeId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return overwrite
         */
        public String getOverwrite() {
            return this.overwrite;
        }

        /**
         * @return invokeInstances
         */
        public InvokeInstances getInvokeInstances() {
            return this.invokeInstances;
        }

        public static final class Builder {
            private String creationTime; 
            private String invocationStatus; 
            private String contentType; 
            private String targetDir; 
            private String fileOwner; 
            private String description; 
            private Integer vmCount; 
            private String fileMode; 
            private String fileGroup; 
            private String invokeId; 
            private String name; 
            private String content; 
            private String overwrite; 
            private InvokeInstances invokeInstances; 

            /**
             * Files allot task creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * File total issued state. Total status depends on the issued all instances of the common execution status, possible values:
             * <p>
             * 
             * -Pending: The system is validation or issued file. There at least one instance issued status is Pending, the total status for Pending.
             * -Running: file create task is instance Running on. There at least one state of the instance for Running, the total status for Running.
             * -Success: on each instance File issued status Success, the total execution status for Success.
             * -Failed: on each instance File issued status Failed, the total execution status to Failed. On the instance of files allot state one or more for the following state, return value are Failed Status:
             * -Validation failed (Invalid)
             * -File sending failed (Aborted)
             * -File create Failed (Failed)
             * -Files allot Timeout (Timeout)
             * -Files allot exception (Error)
             * -PartialFailed: part instance issued successful and part instance execution failed. Exist and only exists instance issued status is Success and Failed when the total execution status for PartialFailed.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The content type of the file. Possible values:
             * <p>
             * -PlainText: Plain text
             * -Base64:Base64 encoding
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * The destination path.
             */
            public Builder targetDir(String targetDir) {
                this.targetDir = targetDir;
                return this;
            }

            /**
             * The user of the file.
             */
            public Builder fileOwner(String fileOwner) {
                this.fileOwner = fileOwner;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The number of instances to be delivered.
             */
            public Builder vmCount(Integer vmCount) {
                this.vmCount = vmCount;
                return this;
            }

            /**
             * The permissions of the file.
             */
            public Builder fileMode(String fileMode) {
                this.fileMode = fileMode;
                return this;
            }

            /**
             * The user group of the file.
             */
            public Builder fileGroup(String fileGroup) {
                this.fileGroup = fileGroup;
                return this;
            }

            /**
             * The ID of the execution.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The content of the file.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Whether to allow coverage.
             */
            public Builder overwrite(String overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            /**
             * A document issued to target instance set type.
             */
            public Builder invokeInstances(InvokeInstances invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            public Invocation build() {
                return new Invocation(this);
            } 

        } 

    }
    public static class Invocations extends TeaModel {
        @NameInMap("Invocation")
        private java.util.List < Invocation> invocation;

        private Invocations(Builder builder) {
            this.invocation = builder.invocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocations create() {
            return builder().build();
        }

        /**
         * @return invocation
         */
        public java.util.List < Invocation> getInvocation() {
            return this.invocation;
        }

        public static final class Builder {
            private java.util.List < Invocation> invocation; 

            /**
             * Invocation.
             */
            public Builder invocation(java.util.List < Invocation> invocation) {
                this.invocation = invocation;
                return this;
            }

            public Invocations build() {
                return new Invocations(this);
            } 

        } 

    }
}
