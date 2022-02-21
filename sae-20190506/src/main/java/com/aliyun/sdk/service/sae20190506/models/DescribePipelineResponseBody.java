// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePipelineResponseBody</p>
 */
public class DescribePipelineResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribePipelineResponseBody build() {
            return new DescribePipelineResponseBody(this);
        } 

    } 

    public static class TaskList extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorIgnore")
        private Integer errorIgnore;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Message")
        private String message;

        @NameInMap("ShowManualIgnore")
        private Boolean showManualIgnore;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorIgnore.
             */
            public Builder errorIgnore(Integer errorIgnore) {
                this.errorIgnore = errorIgnore;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ShowManualIgnore.
             */
            public Builder showManualIgnore(Boolean showManualIgnore) {
                this.showManualIgnore = showManualIgnore;
                return this;
            }

            /**
             * StageId.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
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
    public static class StageList extends TeaModel {
        @NameInMap("ExecutorType")
        private Integer executorType;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskList")
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
             * ExecutorType.
             */
            public Builder executorType(Integer executorType) {
                this.executorType = executorType;
                return this;
            }

            /**
             * StageId.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskList.
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
    public static class Data extends TeaModel {
        @NameInMap("CoStatus")
        private String coStatus;

        @NameInMap("CurrentStageId")
        private String currentStageId;

        @NameInMap("NextPipelineId")
        private String nextPipelineId;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("PipelineName")
        private String pipelineName;

        @NameInMap("PipelineStatus")
        private Integer pipelineStatus;

        @NameInMap("ShowBatch")
        private Boolean showBatch;

        @NameInMap("StageList")
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
             * CoStatus.
             */
            public Builder coStatus(String coStatus) {
                this.coStatus = coStatus;
                return this;
            }

            /**
             * CurrentStageId.
             */
            public Builder currentStageId(String currentStageId) {
                this.currentStageId = currentStageId;
                return this;
            }

            /**
             * NextPipelineId.
             */
            public Builder nextPipelineId(String nextPipelineId) {
                this.nextPipelineId = nextPipelineId;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * PipelineName.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * PipelineStatus.
             */
            public Builder pipelineStatus(Integer pipelineStatus) {
                this.pipelineStatus = pipelineStatus;
                return this;
            }

            /**
             * ShowBatch.
             */
            public Builder showBatch(Boolean showBatch) {
                this.showBatch = showBatch;
                return this;
            }

            /**
             * StageList.
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
