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

        /**
         * Invocations.
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * ErrorInfo.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * InvocationStatus.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UpdateTime.
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

            /**
             * InvokeNode.
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

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * FileGroup.
             */
            public Builder fileGroup(String fileGroup) {
                this.fileGroup = fileGroup;
                return this;
            }

            /**
             * FileMode.
             */
            public Builder fileMode(String fileMode) {
                this.fileMode = fileMode;
                return this;
            }

            /**
             * FileOwner.
             */
            public Builder fileOwner(String fileOwner) {
                this.fileOwner = fileOwner;
                return this;
            }

            /**
             * InvocationStatus.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * InvokeNodes.
             */
            public Builder invokeNodes(InvokeNodes invokeNodes) {
                this.invokeNodes = invokeNodes;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * Overwrite.
             */
            public Builder overwrite(Boolean overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            /**
             * TargetDir.
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

            /**
             * Invocation.
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
