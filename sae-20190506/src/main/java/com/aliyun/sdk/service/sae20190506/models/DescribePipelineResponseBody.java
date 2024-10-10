// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
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
         * <p>The error code returned if the request failed. Take note of the following rules:</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned if the request succeeds.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned for the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>559B4247-C41C-4D9E-B866-B55D360B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the batch information was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The information was queried.</li>
         * <li><strong>false</strong>: The image failed to be found.</li>
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
         * <p>The trace ID that is used to query the details of the request.</p>
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

            /**
             * <p>The error code returned when the task could not be executed. If the task is successfully executed, this parameter is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>EDAS-10022</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Indicates whether to execute the subsequent tasks when the task failed. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The subsequent tasks cannot be executed.</li>
             * <li><strong>1</strong>: The subsequent tasks can be executed.</li>
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
             * <p>The error message returned when the task could not be executed. If the task is successfully executed, this parameter is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>EDAS-10022</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The returned message indicating the task execution result.</p>
             * 
             * <strong>example:</strong>
             * <p>init Namespace success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether a running task can be manually skipped. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The running task can be skipped.</li>
             * <li><strong>false</strong>: The zone does not allow you to change the network type of an ApsaraDB for Redis instance from classic network to VPC.</li>
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
             * <p>The ID of the stage.</p>
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
             * <li><strong>0</strong>: The task is prepared for execution.</li>
             * <li><strong>1</strong>: The task is being executed.</li>
             * <li><strong>2</strong>: successful</li>
             * <li><strong>3</strong>: The task could not be executed.</li>
             * <li><strong>5</strong>: The task is pending retry.</li>
             * <li><strong>6</strong>: The task was terminated.</li>
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
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>bef0122f-de9a-4ab0-8223-b88bf8ad****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
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
        private java.util.List < TaskList> taskList;

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
        public java.util.List < TaskList> getTaskList() {
            return this.taskList;
        }

        public static final class Builder {
            private Integer executorType; 
            private String stageId; 
            private String stageName; 
            private Integer status; 
            private java.util.List < TaskList> taskList; 

            /**
             * <p>The execution type of the stage. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: in sequence.</li>
             * <li><strong>1</strong>: in parallel.</li>
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
             * <p>The ID of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The name of the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>Deploy an application</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The status of the batch processing stage. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The batch is prepared for this processing stage.</li>
             * <li><strong>1</strong>: The task is being executed.</li>
             * <li><strong>2</strong>: successful</li>
             * <li><strong>3</strong>: The processing failed in this stage.</li>
             * <li><strong>6</strong>: The processing stage was terminated.</li>
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
             * <p>The list of task statuses.</p>
             */
            public Builder taskList(java.util.List < TaskList> taskList) {
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
        private java.util.List < StageList> stageList;

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
        public java.util.List < StageList> getStageList() {
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
            private java.util.List < StageList> stageList; 

            /**
             * <p>The status of the change order for the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder coStatus(String coStatus) {
                this.coStatus = coStatus;
                return this;
            }

            /**
             * <p>The ID of the batch processing stage.</p>
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
             * <p>The ID of the batch.</p>
             * 
             * <strong>example:</strong>
             * <p>917660ba-5092-44ca-b8e0-80012c96****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The name of the batch.</p>
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
             * <li><strong>0</strong>: The batch is prepared for processing.</li>
             * <li><strong>1</strong>: The task is being executed.</li>
             * <li><strong>2</strong>: successful</li>
             * <li><strong>3</strong>: The processing failed in this stage.</li>
             * <li><strong>6</strong>: The batch processing was terminated.</li>
             * <li><strong>10</strong>: The batch could not be processed due to a system exception.</li>
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
             * <p>Indicates whether to start processing the next batch. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: indicates that the next batch cannot be processed yet.</li>
             * <li><strong>true</strong>: indicates that the next batch can be processed now.</li>
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
             * <p>The list of batch processing stages.</p>
             */
            public Builder stageList(java.util.List < StageList> stageList) {
                this.stageList = stageList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
