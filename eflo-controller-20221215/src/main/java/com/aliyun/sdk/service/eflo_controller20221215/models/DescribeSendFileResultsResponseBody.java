// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSendFileResultsResponseBody</p>
 */
public class DescribeSendFileResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Invocations")
    private Invocations invocations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeSendFileResultsResponseBody(Builder builder) {
        this.invocations = builder.invocations;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSendFileResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return invocations
     */
    public Invocations getInvocations() {
        return this.invocations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Invocations invocations; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSendFileResultsResponseBody model) {
            this.invocations = model.invocations;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Record of file distribution.</p>
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of commands.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSendFileResultsResponseBody build() {
            return new DescribeSendFileResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
     */
    public static class InvokeNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private InvokeNode(Builder builder) {
            this.creationTime = builder.creationTime;
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.finishTime = builder.finishTime;
            this.invocationStatus = builder.invocationStatus;
            this.nodeId = builder.nodeId;
            this.startTime = builder.startTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeNode create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String creationTime; 
            private String errorCode; 
            private String errorInfo; 
            private String finishTime; 
            private String invocationStatus; 
            private String nodeId; 
            private String startTime; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(InvokeNode model) {
                this.creationTime = model.creationTime;
                this.errorCode = model.errorCode;
                this.errorInfo = model.errorInfo;
                this.finishTime = model.finishTime;
                this.invocationStatus = model.invocationStatus;
                this.nodeId = model.nodeId;
                this.startTime = model.startTime;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time of the file distribution task.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The failure reason code for file distribution. Possible values:</p>
             * <ul>
             * <li>Empty: The file was distributed normally. </li>
             * <li>NodeNotExists: The specified instance does not exist or has been released. </li>
             * <li>NodeReleased: The instance was released during the file distribution process. </li>
             * <li>NodeNotRunning: The instance was not running when the file distribution task was created. </li>
             * <li>AccountNotExists: The specified account does not exist. </li>
             * <li>ClientNotRunning: The Cloud Assistant Agent is not running. </li>
             * <li>ClientNotResponse: The Cloud Assistant Agent is not responding. </li>
             * <li>ClientIsUpgrading: The Cloud Assistant Agent is currently being upgraded. </li>
             * <li>ClientNeedUpgrade: The Cloud Assistant Agent needs to be upgraded. </li>
             * <li>DeliveryTimeout: File delivery timed out. </li>
             * <li>FileCreateFail: Failed to create the file. </li>
             * <li>FileAlreadyExists: A file with the same name already exists at the specified path. </li>
             * <li>FileContentInvalid: The file content is invalid. </li>
             * <li>FileNameInvalid: The file name is invalid. </li>
             * <li>FilePathInvalid: The file path is invalid. </li>
             * <li>FileAuthorityInvalid: The file permissions are invalid. </li>
             * <li>UserGroupNotExists: The user group specified for file delivery does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AccountNotExists</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Details of the reason for command delivery failure or execution failure, possible values: </p>
             * <ul>
             * <li>Empty: The command executed normally. </li>
             * <li>the specified instance does not exist: The specified instance does not exist or has been released. </li>
             * <li>the node has been released when creating task: The instance was released during the command execution. </li>
             * <li>the node is not running when creating task: The instance was not in a running state when the command was executed. </li>
             * <li>the command is not applicable: The command is not applicable to the specified instance. </li>
             * <li>the specified account does not exist: The specified account does not exist. </li>
             * <li>the specified directory does not exist: The specified directory does not exist. </li>
             * <li>the cron job expression is invalid: The specified execution time expression is invalid. </li>
             * <li>the aliyun service is not running on the instance: The Cloud Assistant Agent is not running. </li>
             * <li>the aliyun service in the instance does not respond: The Cloud Assistant Agent is not responding. </li>
             * <li>the aliyun service in the node is upgrading now: The Cloud Assistant Agent is currently being upgraded. </li>
             * <li>the aliyun service in the node needs upgrade: The Cloud Assistant Agent needs an upgrade. </li>
             * <li>the command delivery has timed out: Command delivery has timed out. </li>
             * <li>the command execution has timed out: Command execution has timed out. </li>
             * <li>the command execution got an exception: An exception occurred during command execution. </li>
             * <li>the command execution has been interrupted: The command execution was interrupted. </li>
             * <li>the command execution exit code is not zero: The command execution completed with a non-zero exit code. </li>
             * <li>the specified instance has been released: The instance was released during file delivery.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>the specified instance does not exists</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>Completion time, format: &quot;2020-05-22T17:04:18&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10T10:53:46.156+08:00</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>Status of the task on a single instance. Possible values:</p>
             * <ul>
             * <li>Pending: The system is validating or distributing the file.</li>
             * <li>Invalid: The specified file parameters are incorrect, and validation failed.</li>
             * <li>Running: The file is being distributed to the instance.</li>
             * <li>Aborted: Failed to distribute the file to the instance.</li>
             * <li>Success: The file distribution is complete.</li>
             * <li>Failed: The file creation failed within the instance.</li>
             * <li>Error: An exception occurred during file distribution and could not continue.</li>
             * <li>Timeout: The file distribution timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>Node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-9lb3c15m81j</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Start Time</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-30T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Update Time</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-30T16:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InvokeNode build() {
                return new InvokeNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
     */
    public static class InvokeNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvokeNode")
        private java.util.List<InvokeNode> invokeNode;

        private InvokeNodes(Builder builder) {
            this.invokeNode = builder.invokeNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeNodes create() {
            return builder().build();
        }

        /**
         * @return invokeNode
         */
        public java.util.List<InvokeNode> getInvokeNode() {
            return this.invokeNode;
        }

        public static final class Builder {
            private java.util.List<InvokeNode> invokeNode; 

            private Builder() {
            } 

            private Builder(InvokeNodes model) {
                this.invokeNode = model.invokeNode;
            } 

            /**
             * <p>Record of file distribution for the node.</p>
             */
            public Builder invokeNode(java.util.List<InvokeNode> invokeNode) {
                this.invokeNode = invokeNode;
                return this;
            }

            public InvokeNodes build() {
                return new InvokeNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
     */
    public static class Invocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileGroup")
        private String fileGroup;

        @com.aliyun.core.annotation.NameInMap("FileMode")
        private String fileMode;

        @com.aliyun.core.annotation.NameInMap("FileOwner")
        private String fileOwner;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeNodes")
        private InvokeNodes invokeNodes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("Overwrite")
        private Boolean overwrite;

        @com.aliyun.core.annotation.NameInMap("TargetDir")
        private String targetDir;

        private Invocation(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.fileGroup = builder.fileGroup;
            this.fileMode = builder.fileMode;
            this.fileOwner = builder.fileOwner;
            this.invocationStatus = builder.invocationStatus;
            this.invokeNodes = builder.invokeNodes;
            this.name = builder.name;
            this.nodeCount = builder.nodeCount;
            this.overwrite = builder.overwrite;
            this.targetDir = builder.targetDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocation create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileGroup
         */
        public String getFileGroup() {
            return this.fileGroup;
        }

        /**
         * @return fileMode
         */
        public String getFileMode() {
            return this.fileMode;
        }

        /**
         * @return fileOwner
         */
        public String getFileOwner() {
            return this.fileOwner;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return invokeNodes
         */
        public InvokeNodes getInvokeNodes() {
            return this.invokeNodes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return overwrite
         */
        public Boolean getOverwrite() {
            return this.overwrite;
        }

        /**
         * @return targetDir
         */
        public String getTargetDir() {
            return this.targetDir;
        }

        public static final class Builder {
            private String content; 
            private String contentType; 
            private String creationTime; 
            private String description; 
            private String fileGroup; 
            private String fileMode; 
            private String fileOwner; 
            private String invocationStatus; 
            private InvokeNodes invokeNodes; 
            private String name; 
            private Integer nodeCount; 
            private Boolean overwrite; 
            private String targetDir; 

            private Builder() {
            } 

            private Builder(Invocation model) {
                this.content = model.content;
                this.contentType = model.contentType;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.fileGroup = model.fileGroup;
                this.fileMode = model.fileMode;
                this.fileOwner = model.fileOwner;
                this.invocationStatus = model.invocationStatus;
                this.invokeNodes = model.invokeNodes;
                this.name = model.name;
                this.nodeCount = model.nodeCount;
                this.overwrite = model.overwrite;
                this.targetDir = model.targetDir;
            } 

            /**
             * <p>Output information after command execution.</p>
             * <p>If ContentEncoding is specified as PlainText, the original output information is returned.
             * If ContentEncoding is specified as Base64, the Base64 encoded output information is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Base64</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>File content type.</p>
             * <p>PlainText: Plain text.
             * Base64: Base64 encoding.
             * The default value is PlainText.</p>
             * 
             * <strong>example:</strong>
             * <p>PlainText</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>Creation time of the distribution.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10T10:53:46.156+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Command description.</p>
             * 
             * <strong>example:</strong>
             * <p>描述信息。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The user group of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder fileGroup(String fileGroup) {
                this.fileGroup = fileGroup;
                return this;
            }

            /**
             * <p>File permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>0644</p>
             */
            public Builder fileMode(String fileMode) {
                this.fileMode = fileMode;
                return this;
            }

            /**
             * <p>The owner of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder fileOwner(String fileOwner) {
                this.fileOwner = fileOwner;
                return this;
            }

            /**
             * <p>Overall status of the file distribution. The overall status depends on the common execution status of all instances involved in this distribution, possible values are:</p>
             * <ul>
             * <li>Pending: The system is verifying or distributing the file. If at least one instance has a file distribution status of Pending, the overall execution status will be Pending.</li>
             * <li>Running: The file is being distributed on the instance. If at least one instance has a file distribution status of Running, the overall execution status will be Running.</li>
             * <li>Success: All instances have a file distribution status of Success, then the overall execution status will be Success.</li>
             * <li>Failed: All instances have a file distribution status of Failed, then the overall execution status will be Failed. If any of the following conditions occur for the file distribution status on an instance, the return value will be Failed:<ul>
             * <li>The specified file parameters are incorrect, verification failed (Invalid).</li>
             * <li>Failed to distribute the file to the instance (Aborted).</li>
             * <li>The file creation failed within the instance (Failed).</li>
             * <li>The file distribution timed out (Timeout).</li>
             * <li>An exception occurred during file distribution and could not continue (Error).</li>
             * </ul>
             * </li>
             * <li>PartialFailed: Some instances successfully received the file while others failed. If the file distribution status of all instances is either Success or Failed, the overall execution status will be PartialFailed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>Record of file distribution.</p>
             */
            public Builder invokeNodes(InvokeNodes invokeNodes) {
                this.invokeNodes = invokeNodes;
                return this;
            }

            /**
             * <p>Name of the file distribution.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Number of nodes</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>Whether to overwrite the file if a file with the same name already exists in the target directory.</p>
             * <ul>
             * <li>true: Overwrite.</li>
             * <li>false: Do not overwrite.</li>
             * </ul>
             * <p>The default value is false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder overwrite(Boolean overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            /**
             * <p>Target path.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/user</p>
             */
            public Builder targetDir(String targetDir) {
                this.targetDir = targetDir;
                return this;
            }

            public Invocation build() {
                return new Invocation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSendFileResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSendFileResultsResponseBody</p>
     */
    public static class Invocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Invocation")
        private java.util.List<Invocation> invocation;

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
        public java.util.List<Invocation> getInvocation() {
            return this.invocation;
        }

        public static final class Builder {
            private java.util.List<Invocation> invocation; 

            private Builder() {
            } 

            private Builder(Invocations model) {
                this.invocation = model.invocation;
            } 

            /**
             * <p>Command execution ID.</p>
             */
            public Builder invocation(java.util.List<Invocation> invocation) {
                this.invocation = invocation;
                return this;
            }

            public Invocations build() {
                return new Invocations(this);
            } 

        } 

    }
}
