// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListTasksInTaskFlowResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksInTaskFlowResponseBody</p>
 */
public class ListTasksInTaskFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private Tasks tasks;

    private ListTasksInTaskFlowResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksInTaskFlowResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Tasks tasks; 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8B36B063-6B7D-5595-9FCF-3844B7B7ACD4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The tasks in the task flow.</p>
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListTasksInTaskFlowResponseBody build() {
            return new ListTasksInTaskFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTasksInTaskFlowResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksInTaskFlowResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GraphParam")
        private String graphParam;

        @com.aliyun.core.annotation.NameInMap("NodeConfig")
        private String nodeConfig;

        @com.aliyun.core.annotation.NameInMap("NodeContent")
        private String nodeContent;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeOutput")
        private String nodeOutput;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("TimeVariables")
        private String timeVariables;

        private Task(Builder builder) {
            this.graphParam = builder.graphParam;
            this.nodeConfig = builder.nodeConfig;
            this.nodeContent = builder.nodeContent;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeOutput = builder.nodeOutput;
            this.nodeType = builder.nodeType;
            this.timeVariables = builder.timeVariables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return graphParam
         */
        public String getGraphParam() {
            return this.graphParam;
        }

        /**
         * @return nodeConfig
         */
        public String getNodeConfig() {
            return this.nodeConfig;
        }

        /**
         * @return nodeContent
         */
        public String getNodeContent() {
            return this.nodeContent;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeOutput
         */
        public String getNodeOutput() {
            return this.nodeOutput;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return timeVariables
         */
        public String getTimeVariables() {
            return this.timeVariables;
        }

        public static final class Builder {
            private String graphParam; 
            private String nodeConfig; 
            private String nodeContent; 
            private String nodeId; 
            private String nodeName; 
            private String nodeOutput; 
            private String nodeType; 
            private String timeVariables; 

            /**
             * <p>The position of the node on the Directed Acyclic Graph (DAG).</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;x&quot;:435,&quot;y&quot;:192,&quot;layoutType&quot;:&quot;Horizontal&quot;}</p>
             */
            public Builder graphParam(String graphParam) {
                this.graphParam = graphParam;
                return this;
            }

            /**
             * <p>The advanced configuration for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>{     &quot;rerun&quot;:{    &quot;rerunEnable&quot;:true,      &quot;rerunCount&quot;:1,   &quot;rerunInterval&quot;:10 //  }}</p>
             */
            public Builder nodeConfig(String nodeConfig) {
                this.nodeConfig = nodeConfig;
                return this;
            }

            /**
             * <p>The configuration for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>{     &quot;dbId&quot;:123***,  &quot;sql&quot;:&quot;&quot;,    &quot;dbType&quot;:&quot;polardb&quot; }</p>
             */
            public Builder nodeContent(String nodeContent) {
                this.nodeContent = nodeContent;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>92***</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Cross-Database Spark SQL-1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The output variables for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>{  &quot;outputs&quot;:[{ { &quot;row&quot;:0, &quot;column&quot;:-1,                  &quot;combiner&quot;:&quot;,&quot; }            &quot;extractMethod&quot;:&quot;{&quot;row&quot;:0,&quot;column&quot;:-1,&quot;combiner&quot;:&quot;,&quot;}&quot;,         &quot;variableName&quot;:&quot;var&quot;,    &quot;description&quot;:&quot;For demo&quot;} ] }</p>
             */
            public Builder nodeOutput(String nodeOutput) {
                this.nodeOutput = nodeOutput;
                return this;
            }

            /**
             * <p>The type of the node. For more information about the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/424705.html">NodeType parameter</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>SPARK_SQL</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The time variables configured for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;variables&quot;:[{&quot;name&quot;:&quot;test1&quot;,&quot;pattern&quot;:&quot;yyyy-MM-dd</p>
             */
            public Builder timeVariables(String timeVariables) {
                this.timeVariables = timeVariables;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTasksInTaskFlowResponseBody} extends {@link TeaModel}
     *
     * <p>ListTasksInTaskFlowResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Task")
        private java.util.List<Task> task;

        private Tasks(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return task
         */
        public java.util.List<Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List<Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List<Task> task) {
                this.task = task;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
