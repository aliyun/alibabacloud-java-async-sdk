// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodesAddingTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodesAddingTaskResponseBody</p>
 */
public class GetNodesAddingTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("SuccessCount")
    private Long successCount;

    @NameInMap("SuccessDevEuis")
    private SuccessDevEuis successDevEuis;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskState")
    private String taskState;

    @NameInMap("TotalCount")
    private Long totalCount;

    private GetNodesAddingTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.successCount = builder.successCount;
        this.successDevEuis = builder.successDevEuis;
        this.taskId = builder.taskId;
        this.taskState = builder.taskState;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodesAddingTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return successCount
     */
    public Long getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return successDevEuis
     */
    public SuccessDevEuis getSuccessDevEuis() {
        return this.successDevEuis;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskState
     */
    public String getTaskState() {
        return this.taskState;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long successCount; 
        private SuccessDevEuis successDevEuis; 
        private String taskId; 
        private String taskState; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * SuccessCount.
         */
        public Builder successCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * SuccessDevEuis.
         */
        public Builder successDevEuis(SuccessDevEuis successDevEuis) {
            this.successDevEuis = successDevEuis;
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
         * TaskState.
         */
        public Builder taskState(String taskState) {
            this.taskState = taskState;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetNodesAddingTaskResponseBody build() {
            return new GetNodesAddingTaskResponseBody(this);
        } 

    } 

    public static class SuccessDevEuis extends TeaModel {
        @NameInMap("SuccessDevEui")
        private java.util.List < String > successDevEui;

        private SuccessDevEuis(Builder builder) {
            this.successDevEui = builder.successDevEui;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessDevEuis create() {
            return builder().build();
        }

        /**
         * @return successDevEui
         */
        public java.util.List < String > getSuccessDevEui() {
            return this.successDevEui;
        }

        public static final class Builder {
            private java.util.List < String > successDevEui; 

            /**
             * SuccessDevEui.
             */
            public Builder successDevEui(java.util.List < String > successDevEui) {
                this.successDevEui = successDevEui;
                return this;
            }

            public SuccessDevEuis build() {
                return new SuccessDevEuis(this);
            } 

        } 

    }
}
