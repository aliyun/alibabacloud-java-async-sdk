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
         * <p>The file sending records.</p>
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the commands.</p>
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
             * <p>The time when the file sending task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The error code returned when the file failed to be sent to the instance. Valid values:</p>
             * <p>Null: The file is sent to the instance. NodeNotExists: The specified instance does not exist or has been released. NodeReleased: The instance was released while the file was being sent. NodeNotRunning: The instance was not running while the file sending task was being created. AccountNotExists: The specified account does not exist. ClientNotRunning: Cloud Assistant Agent is not running. ClientNotResponse: Cloud Assistant Agent did not respond. ClientIsUpgrading: Cloud Assistant Agent was being upgraded. ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded. DeliveryTimeout: The file sending task timed out. FileCreateFail: The file failed to be created. FileAlreadyExists: A file with the same name exists in the specified directory. FileContentInvalid: The file content is invalid. FileNameInvalid: The file name is invalid. FilePathInvalid: The specified directory is invalid. FileAuthorityInvalid: The specified permissions on the file are invalid. UserGroupNotExists: The specified user group does not exist.</p>
             * 
             * <strong>example:</strong>
             * <p>AccountNotExists</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned if the command failed to be sent or run. Valid values:</p>
             * <ul>
             * <li>null: The command is run as expected.</li>
             * <li>the specified instance does not exists: The specified instance does not exist or is released.</li>
             * <li>the node has released when create task: The instance is released when the command is being run.</li>
             * <li>the node is not running when create task: The instance is not in the Running state while the command is being run.</li>
             * <li>the command is not applicable: The command is not applicable to the specified instance.</li>
             * <li>the specified account does not exists: The specified account does not exist.</li>
             * <li>the specified directory does not exists: The specified directory does not exist.</li>
             * <li>the cron job expression is invalid: The cron expression that specifies the execution time is invalid.</li>
             * <li>the aliyun service is not running on the instance: Cloud Assistant Agent is not running.</li>
             * <li>the aliyun service in the instance does not response: Cloud Assistant Agent does not respond.</li>
             * <li>the aliyun service in the node is upgrading now: Cloud Assistant Agent is being upgraded.</li>
             * <li>the aliyun service in the node need upgrade: Cloud Assistant Agent needs to be upgraded.</li>
             * <li>the command delivery has been timeout: The request to send the command timed out.</li>
             * <li>the command execution has been timeout: The command execution timed out.</li>
             * <li>the command execution got an exception: An exception occurred when the command is being run.</li>
             * <li>the command execution has been interrupted: The command execution is interrupted.</li>
             * <li>the command execution exit code is not zero: The command execution completes, but the exit code is not 0.</li>
             * <li>the specified instance has been released: The instance is released while the file is being sent.</li>
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
             * <p>The time when the file sending task ends. The time is in the 2020-05-22T17:04:18 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10T10:53:46.156+08:00</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The status of the file sending task on an instance. Valid values:</p>
             * <ul>
             * <li>Pending: The file is being verified or sent.</li>
             * <li>Invalid: The file is invalid.</li>
             * <li>Running: The file is being sent to the instance.</li>
             * <li>Aborted: The file failed to be sent to the instance.</li>
             * <li>Success: The file is sent.</li>
             * <li>Failed: The file failed to be created on the instance.</li>
             * <li>Error: An error occurred and interrupted the file sending task.</li>
             * <li>Timeout: The file sending task timed out.</li>
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
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-9lb3c15m81j</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-30T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The update time.</p>
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
             * <p>The file sending records on a node.</p>
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
             * <p>The command output.</p>
             * <p>If ContentEncoding is set to PlainText in the request, the original command output is returned. If ContentEncoding is set to Base64 in the request, the Base64-encoded command output is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Base64</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The content type of the file.</p>
             * <p>PlainText: The file content is not encoded. Base64: The file content is encoded in Base64. Default value: PlainText.</p>
             * 
             * <strong>example:</strong>
             * <p>PlainText</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The time when the file sending task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10T10:53:46.156+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The command description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
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
             * <p>The permissions on the file.</p>
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
             * <p>The overall sending status of the file. The overall sending status of the file varies based on the sending status of the file on all destination instances. Valid values:</p>
             * <ul>
             * <li><p>Pending: The file is being verified or sent. If the sending state of the file on at least one instance is Pending, the overall sending state of the file is Pending.</p>
             * </li>
             * <li><p>Running: The file is being sent to the instance. If the sending state of the file on at least one instance is Running, the overall sending state of the file is Running.</p>
             * </li>
             * <li><p>Success: If the sending state of the file on all instances is Success, the overall sending state of the file is Success.</p>
             * </li>
             * <li><p>Failed: If the sending state of the file on all instances is Failed, the overall sending state of the file is Failed. If the sending state of the file on one or more instances is one of the following values, the overall sending state of the file is Failed:</p>
             * <ul>
             * <li>Invalid: The file is invalid.</li>
             * <li>Aborted: The file failed to be sent to the instances.</li>
             * <li>Failed: The file failed to be created on the instances.</li>
             * <li>Timeout: The file sending task timed out.</li>
             * <li>Error: An error occurred and interrupted the file sending task.</li>
             * </ul>
             * </li>
             * <li><p>PartialFailed: The file sending task was completed on some instances but failed on other instances. If the sending state of the file is Success on some instances and is Failed on other instances, the overall sending state of the file is PartialFailed.</p>
             * </li>
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
             * <p>The file sending records.</p>
             */
            public Builder invokeNodes(InvokeNodes invokeNodes) {
                this.invokeNodes = invokeNodes;
                return this;
            }

            /**
             * <p>The name of the file sending task.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>Indicates whether a file was overwritten in the destination directory if the file has the same name as the sent file.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder overwrite(Boolean overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            /**
             * <p>The destination directory.</p>
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
             * <p>The command execution ID.</p>
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
