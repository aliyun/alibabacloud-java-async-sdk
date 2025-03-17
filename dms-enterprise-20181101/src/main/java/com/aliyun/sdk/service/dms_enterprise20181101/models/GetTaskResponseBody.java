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
 * {@link GetTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskResponseBody</p>
 */
public class GetTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Task")
    private Task task;

    private GetTaskResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Task task; 

        private Builder() {
        } 

        private Builder(GetTaskResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.task = model.task;
        } 

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
         * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7838266C-E17B-58F4-B072-4DC356B58258</p>
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
         * <p>The task node.</p>
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetTaskResponseBody build() {
            return new GetTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("GraphParam")
        private String graphParam;

        @com.aliyun.core.annotation.NameInMap("NodeConfig")
        private String nodeConfig;

        @com.aliyun.core.annotation.NameInMap("NodeContent")
        private String nodeContent;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeOutput")
        private String nodeOutput;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("TimeVariables")
        private String timeVariables;

        private Task(Builder builder) {
            this.dagId = builder.dagId;
            this.graphParam = builder.graphParam;
            this.nodeConfig = builder.nodeConfig;
            this.nodeContent = builder.nodeContent;
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
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
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
            private Long dagId; 
            private String graphParam; 
            private String nodeConfig; 
            private String nodeContent; 
            private String nodeName; 
            private String nodeOutput; 
            private String nodeType; 
            private String timeVariables; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.dagId = model.dagId;
                this.graphParam = model.graphParam;
                this.nodeConfig = model.nodeConfig;
                this.nodeContent = model.nodeContent;
                this.nodeName = model.nodeName;
                this.nodeOutput = model.nodeOutput;
                this.nodeType = model.nodeType;
                this.timeVariables = model.timeVariables;
            } 

            /**
             * <p>The ID of the task flow to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>7321</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The position of the node on the Directed Acyclic Graph (DAG).</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;{&quot;x&quot;:0,&quot;y&quot;:0,&quot;layoutType&quot;:&quot;Horizontal&quot;}&quot;,  &quot;id&quot;: 51***}</p>
             */
            public Builder graphParam(String graphParam) {
                this.graphParam = graphParam;
                return this;
            }

            /**
             * <p>The advanced configuration for the node.</p>
             */
            public Builder nodeConfig(String nodeConfig) {
                this.nodeConfig = nodeConfig;
                return this;
            }

            /**
             * <p>The configuration for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dbList&quot;:[{&quot;instanceId&quot;:177****}&quot;   }</p>
             */
            public Builder nodeContent(String nodeContent) {
                this.nodeContent = nodeContent;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Cross-database Spark SQL-1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The output variables for the node. This parameter is available only for some types of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;outputs&quot;:[ &quot;extractMethod&quot;:&quot;json&quot; , &quot;variableName&quot;:&quot;var&quot;,   &quot;description&quot;:&quot;demo desc&quot; } ] }</p>
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
             * <p>{&quot;variables&quot;:[{&quot;name&quot;:&quot;Today&quot;,&quot;pattern&quot;:&quot;yyyy-MM-dd|+1d&quot;}]}</p>
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
}
