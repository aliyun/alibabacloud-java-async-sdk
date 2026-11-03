// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePipelineResponseBody</p>
 */
public class DescribePipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribePipelineResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePipelineResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribePipelineResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The API status code or POP error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: Success.</li>
         * <li><strong>3xx</strong>: Redirect.</li>
         * <li><strong>4xx</strong>: Request error.</li>
         * <li><strong>5xx</strong>: Server error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The batch information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>Successful request: The <strong>ErrorCode</strong> field is not returned.</li>
         * <li>Failed request: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.NotEmpty</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information about the call result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>559B4247-C41C-4D9E-B866-B55D360B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the batch information was queried successfully. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The query was successful.</li>
         * <li><strong>false</strong>: The query failed.</li>
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
         * <p>The trace ID used to accurately query call information.</p>
         * 
         * <strong>example:</strong>
         * <p>0be3e0c316390414649128666e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribePipelineResponseBody build() {
            return new DescribePipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePipelineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePipelineResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorIgnore")
        private Integer errorIgnore;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ShowManualIgnore")
        private Boolean showManualIgnore;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private TaskList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorIgnore = builder.errorIgnore;
            this.errorMessage = builder.errorMessage;
            this.message = builder.message;
            this.showManualIgnore = builder.showManualIgnore;
            this.stageId = builder.stageId;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorIgnore
         */
        public Integer getErrorIgnore() {
            return this.errorIgnore;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return showManualIgnore
         */
        public Boolean getShowManualIgnore() {
            return this.showManualIgnore;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String errorCode; 
            private Integer errorIgnore; 
            private String errorMessage; 
            private String message; 
            private Boolean showManualIgnore; 
            private String stageId; 
            private Integer status; 
            private String taskId; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.errorCode = model.errorCode;
                this.errorIgnore = model.errorIgnore;
                this.errorMessage = model.errorMessage;
                this.message = model.message;
                this.showManualIgnore = model.showManualIgnore;
                this.stageId = model.stageId;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
            } 

            /**
             * <p>The error code for the task execution failure. This code is not returned if the task succeeds.</p>
             * 
             * <strong>example:</strong>
             * <p>EDAS-10022</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Specifies whether subsequent tasks can be executed after a failure. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Not supported.</li>
             * <li><strong>1</strong>: Supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorIgnore(Integer errorIgnore) {
                this.errorIgnore = errorIgnore;
                return this;
            }

            /**
             * <p>The error message for the task execution. This message is not returned if the task succeeds.</p>
             * 
             * <strong>example:</strong>
             * <p>EDAS-10022</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The task execution information.</p>
             * 
             * <strong>example:</strong>
             * <p>init Namespace success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Specifies whether a running task can be manually skipped. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Supported.</li>
             * <li><strong>false</strong>: Not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder showManualIgnore(Boolean showManualIgnore) {
                this.showManualIgnore = showManualIgnore;
                return this;
            }

            /**
             * <p>The stage ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Ready.</li>
             * <li><strong>1</strong>: Running.</li>
             * <li><strong>2</strong>: Succeeded.</li>
             * <li><strong>3</strong>: Failed.</li>
             * <li><strong>5</strong>: Waiting for retry.</li>
             * <li><strong>6</strong>: Aborted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bef0122f-de9a-4ab0-8223-b88bf8ad****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>Environment initialization</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePipelineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePipelineResponseBody</p>
     */
    public static class StageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutorType")
        private Integer executorType;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskList")
        private java.util.List<TaskList> taskList;

        private StageList(Builder builder) {
            this.executorType = builder.executorType;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
            this.status = builder.status;
            this.taskList = builder.taskList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageList create() {
            return builder().build();
        }

        /**
         * @return executorType
         */
        public Integer getExecutorType() {
            return this.executorType;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskList
         */
        public java.util.List<TaskList> getTaskList() {
            return this.taskList;
        }

        public static final class Builder {
            private Integer executorType; 
            private String stageId; 
            private String stageName; 
            private Integer status; 
            private java.util.List<TaskList> taskList; 

            private Builder() {
            } 

            private Builder(StageList model) {
                this.executorType = model.executorType;
                this.stageId = model.stageId;
                this.stageName = model.stageName;
                this.status = model.status;
                this.taskList = model.taskList;
            } 

            /**
             * <p>The stage type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Serial.</li>
             * <li><strong>1</strong>: Parallel.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder executorType(Integer executorType) {
                this.executorType = executorType;
                return this;
            }

            /**
             * <p>The stage ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The stage name.</p>
             * 
             * <strong>example:</strong>
             * <p>Application Deployment</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The stage status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Ready.</li>
             * <li><strong>1</strong>: Running.</li>
             * <li><strong>2</strong>: Succeeded.</li>
             * <li><strong>3</strong>: Failed.</li>
             * <li><strong>6</strong>: Aborted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of task status information.</p>
             */
            public Builder taskList(java.util.List<TaskList> taskList) {
                this.taskList = taskList;
                return this;
            }

            public StageList build() {
                return new StageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePipelineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePipelineResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoStatus")
        private String coStatus;

        @com.aliyun.core.annotation.NameInMap("CurrentStageId")
        private String currentStageId;

        @com.aliyun.core.annotation.NameInMap("NextPipelineId")
        private String nextPipelineId;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("PipelineName")
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("PipelineStatus")
        private Integer pipelineStatus;

        @com.aliyun.core.annotation.NameInMap("ShowBatch")
        private Boolean showBatch;

        @com.aliyun.core.annotation.NameInMap("StageList")
        private java.util.List<StageList> stageList;

        private Data(Builder builder) {
            this.coStatus = builder.coStatus;
            this.currentStageId = builder.currentStageId;
            this.nextPipelineId = builder.nextPipelineId;
            this.pipelineId = builder.pipelineId;
            this.pipelineName = builder.pipelineName;
            this.pipelineStatus = builder.pipelineStatus;
            this.showBatch = builder.showBatch;
            this.stageList = builder.stageList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coStatus
         */
        public String getCoStatus() {
            return this.coStatus;
        }

        /**
         * @return currentStageId
         */
        public String getCurrentStageId() {
            return this.currentStageId;
        }

        /**
         * @return nextPipelineId
         */
        public String getNextPipelineId() {
            return this.nextPipelineId;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
        }

        /**
         * @return pipelineStatus
         */
        public Integer getPipelineStatus() {
            return this.pipelineStatus;
        }

        /**
         * @return showBatch
         */
        public Boolean getShowBatch() {
            return this.showBatch;
        }

        /**
         * @return stageList
         */
        public java.util.List<StageList> getStageList() {
            return this.stageList;
        }

        public static final class Builder {
            private String coStatus; 
            private String currentStageId; 
            private String nextPipelineId; 
            private String pipelineId; 
            private String pipelineName; 
            private Integer pipelineStatus; 
            private Boolean showBatch; 
            private java.util.List<StageList> stageList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.coStatus = model.coStatus;
                this.currentStageId = model.currentStageId;
                this.nextPipelineId = model.nextPipelineId;
                this.pipelineId = model.pipelineId;
                this.pipelineName = model.pipelineName;
                this.pipelineStatus = model.pipelineStatus;
                this.showBatch = model.showBatch;
                this.stageList = model.stageList;
            } 

            /**
             * <p>The status of the change order associated with the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>Executed successfully</p>
             */
            public Builder coStatus(String coStatus) {
                this.coStatus = coStatus;
                return this;
            }

            /**
             * <p>The ID of the stage being executed in the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
             */
            public Builder currentStageId(String currentStageId) {
                this.currentStageId = currentStageId;
                return this;
            }

            /**
             * <p>The ID of the next batch.</p>
             * 
             * <strong>example:</strong>
             * <p>b77b1c98-5772-4f05-95fc-c7bee5fa****</p>
             */
            public Builder nextPipelineId(String nextPipelineId) {
                this.nextPipelineId = nextPipelineId;
                return this;
            }

            /**
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>917660ba-5092-44ca-b8e0-80012c96****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The batch name.</p>
             * 
             * <strong>example:</strong>
             * <p>First batch</p>
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * <p>The batch status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Ready.</li>
             * <li><strong>1</strong>: Running.</li>
             * <li><strong>2</strong>: Succeeded.</li>
             * <li><strong>3</strong>: Failed.</li>
             * <li><strong>6</strong>: Aborted.</li>
             * <li><strong>10</strong>: Failed due to a system exception.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pipelineStatus(Integer pipelineStatus) {
                this.pipelineStatus = pipelineStatus;
                return this;
            }

            /**
             * <p>Specifies whether the execution of the next batch can start. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: The execution of the next batch cannot start.</li>
             * <li><strong>true</strong>: The execution of the next batch can start.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder showBatch(Boolean showBatch) {
                this.showBatch = showBatch;
                return this;
            }

            /**
             * <p>The list of stages in the batch.</p>
             */
            public Builder stageList(java.util.List<StageList> stageList) {
                this.stageList = stageList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
