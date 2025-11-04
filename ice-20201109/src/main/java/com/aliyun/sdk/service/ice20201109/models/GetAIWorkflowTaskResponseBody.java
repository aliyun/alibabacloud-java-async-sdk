// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetAIWorkflowTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIWorkflowTaskResponseBody</p>
 */
public class GetAIWorkflowTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkflowTask")
    private WorkflowTask workflowTask;

    private GetAIWorkflowTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workflowTask = builder.workflowTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIWorkflowTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workflowTask
     */
    public WorkflowTask getWorkflowTask() {
        return this.workflowTask;
    }

    public static final class Builder {
        private String requestId; 
        private WorkflowTask workflowTask; 

        private Builder() {
        } 

        private Builder(GetAIWorkflowTaskResponseBody model) {
            this.requestId = model.requestId;
            this.workflowTask = model.workflowTask;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the workflow task.</p>
         */
        public Builder workflowTask(WorkflowTask workflowTask) {
            this.workflowTask = workflowTask;
            return this;
        }

        public GetAIWorkflowTaskResponseBody build() {
            return new GetAIWorkflowTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAIWorkflowTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIWorkflowTaskResponseBody</p>
     */
    public static class Workflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Graph")
        private String graph;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private String workflowId;

        private Workflow(Builder builder) {
            this.createTime = builder.createTime;
            this.graph = builder.graph;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workflow create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return graph
         */
        public String getGraph() {
            return this.graph;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String createTime; 
            private String graph; 
            private String modifiedTime; 
            private String name; 
            private String status; 
            private String type; 
            private String version; 
            private String workflowId; 

            private Builder() {
            } 

            private Builder(Workflow model) {
                this.createTime = model.createTime;
                this.graph = model.graph;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.status = model.status;
                this.type = model.type;
                this.version = model.version;
                this.workflowId = model.workflowId;
            } 

            /**
             * <p>The time when the template was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-20T01:35:04Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The workflow&quot;s topological structure.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * &quot;nodes&quot;:[...],
             * &quot;edges&quot;:[...]
             * }</p>
             */
            public Builder graph(String graph) {
                this.graph = graph;
                return this;
            }

            /**
             * <p>The time when the template was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-20T01:35:04Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The name of the workflow template.</p>
             * 
             * <strong>example:</strong>
             * <p>RealtimeTranslation</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Workflow template status. Valid values:</p>
             * <ul>
             * <li>Draft</li>
             * <li>Published</li>
             * <li>Editing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Draft</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The scenario type of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Live</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The template version.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>ec0a-e3b9-40b1-abf2-6549d00e</strong></strong></p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The ID of the workflow template.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>3f44-f1f6-477e-9364-c5e6c49e</strong></strong></p>
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public Workflow build() {
                return new Workflow(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAIWorkflowTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIWorkflowTaskResponseBody</p>
     */
    public static class WorkflowTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("NodeResults")
        private String nodeResults;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("Workflow")
        private Workflow workflow;

        private WorkflowTask(Builder builder) {
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.inputs = builder.inputs;
            this.nodeResults = builder.nodeResults;
            this.outputs = builder.outputs;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.userData = builder.userData;
            this.version = builder.version;
            this.workflow = builder.workflow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkflowTask create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return nodeResults
         */
        public String getNodeResults() {
            return this.nodeResults;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workflow
         */
        public Workflow getWorkflow() {
            return this.workflow;
        }

        public static final class Builder {
            private String createTime; 
            private String finishTime; 
            private String inputs; 
            private String nodeResults; 
            private String outputs; 
            private String status; 
            private String taskId; 
            private String userData; 
            private String version; 
            private Workflow workflow; 

            private Builder() {
            } 

            private Builder(WorkflowTask model) {
                this.createTime = model.createTime;
                this.finishTime = model.finishTime;
                this.inputs = model.inputs;
                this.nodeResults = model.nodeResults;
                this.outputs = model.outputs;
                this.status = model.status;
                this.taskId = model.taskId;
                this.userData = model.userData;
                this.version = model.version;
                this.workflow = model.workflow;
            } 

            /**
             * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-28T02:17:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the task was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-19T02:28:22Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The input parameters of the workflow task.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;source_language_id&quot;:&quot;en&quot;,&quot;live_id&quot;:123,&quot;live_url&quot;:{&quot;url&quot;:&quot;rtmp://test.com.cn/video/638d9088fe4f15ce&quot;}}</p>
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * <p>The results of the workflow nodes. The structure of this JSON varies based on the workflow&quot;s configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{...}</p>
             */
            public Builder nodeResults(String nodeResults) {
                this.nodeResults = nodeResults;
                return this;
            }

            /**
             * <p>The node output.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             * &quot;result&quot;:&quot;test&quot;
             * }</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The task state.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>running</li>
             * <li>stopped</li>
             * <li>failed</li>
             * <li>partial-succeeded</li>
             * <li>succeeded</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the workflow task.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><strong><strong>-67fd-43aa-9cc1-3e7f</strong></strong></strong></strong></p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The user-defined data.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The version of the workflow template that was executed.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>ec0a-e3b9-40b1-abf2-6549d00e</strong></strong></p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The workflow template information.</p>
             */
            public Builder workflow(Workflow workflow) {
                this.workflow = workflow;
                return this;
            }

            public WorkflowTask build() {
                return new WorkflowTask(this);
            } 

        } 

    }
}
