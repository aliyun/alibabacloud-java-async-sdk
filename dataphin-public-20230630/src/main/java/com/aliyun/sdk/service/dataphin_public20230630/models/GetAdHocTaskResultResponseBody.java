// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetAdHocTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAdHocTaskResultResponseBody</p>
 */
public class GetAdHocTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ExecuteResult")
    private ExecuteResult executeResult;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAdHocTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.executeResult = builder.executeResult;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdHocTaskResultResponseBody create() {
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
     * @return executeResult
     */
    public ExecuteResult getExecuteResult() {
        return this.executeResult;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private ExecuteResult executeResult; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAdHocTaskResultResponseBody model) {
            this.code = model.code;
            this.executeResult = model.executeResult;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ExecuteResult.
         */
        public Builder executeResult(ExecuteResult executeResult) {
            this.executeResult = executeResult;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetAdHocTaskResultResponseBody build() {
            return new GetAdHocTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAdHocTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAdHocTaskResultResponseBody</p>
     */
    public static class ExecuteResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("ScheduleTaskId")
        private String scheduleTaskId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private ExecuteResult(Builder builder) {
            this.result = builder.result;
            this.scheduleTaskId = builder.scheduleTaskId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecuteResult create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return scheduleTaskId
         */
        public String getScheduleTaskId() {
            return this.scheduleTaskId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String result; 
            private String scheduleTaskId; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(ExecuteResult model) {
                this.result = model.result;
                this.scheduleTaskId = model.scheduleTaskId;
                this.taskId = model.taskId;
            } 

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * ScheduleTaskId.
             */
            public Builder scheduleTaskId(String scheduleTaskId) {
                this.scheduleTaskId = scheduleTaskId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public ExecuteResult build() {
                return new ExecuteResult(this);
            } 

        } 

    }
}
