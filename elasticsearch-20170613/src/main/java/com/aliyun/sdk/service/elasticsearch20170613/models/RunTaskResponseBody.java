// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunTaskResponseBody} extends {@link TeaModel}
 *
 * <p>RunTaskResponseBody</p>
 */
public class RunTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private RunTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public RunTaskResponseBody build() {
            return new RunTaskResponseBody(this);
        } 

    } 

    public static class TaskStatusInfo extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("progress")
        private Float progress;

        private TaskStatusInfo(Builder builder) {
            this.status = builder.status;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStatusInfo create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String status; 
            private Float progress; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            public TaskStatusInfo build() {
                return new TaskStatusInfo(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("TaskStatusInfo")
        private TaskStatusInfo taskStatusInfo;

        private Result(Builder builder) {
            this.taskStatusInfo = builder.taskStatusInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return taskStatusInfo
         */
        public TaskStatusInfo getTaskStatusInfo() {
            return this.taskStatusInfo;
        }

        public static final class Builder {
            private TaskStatusInfo taskStatusInfo; 

            /**
             * TaskStatusInfo.
             */
            public Builder taskStatusInfo(TaskStatusInfo taskStatusInfo) {
                this.taskStatusInfo = taskStatusInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
