// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryTaskResponseBody</p>
 */
public class GetMemoryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetMemoryTaskResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetMemoryTaskResponseBody model) {
            this.latency = model.latency;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
        } 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetMemoryTaskResponseBody build() {
            return new GetMemoryTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("error_message")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("memory_ids")
        private java.util.List<String> memoryIds;

        @com.aliyun.core.annotation.NameInMap("skill_ids")
        private java.util.List<String> skillIds;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        private Result(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.memoryIds = builder.memoryIds;
            this.skillIds = builder.skillIds;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return memoryIds
         */
        public java.util.List<String> getMemoryIds() {
            return this.memoryIds;
        }

        /**
         * @return skillIds
         */
        public java.util.List<String> getSkillIds() {
            return this.skillIds;
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

        public static final class Builder {
            private String errorMessage; 
            private java.util.List<String> memoryIds; 
            private java.util.List<String> skillIds; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.errorMessage = model.errorMessage;
                this.memoryIds = model.memoryIds;
                this.skillIds = model.skillIds;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * error_message.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * memory_ids.
             */
            public Builder memoryIds(java.util.List<String> memoryIds) {
                this.memoryIds = memoryIds;
                return this;
            }

            /**
             * skill_ids.
             */
            public Builder skillIds(java.util.List<String> skillIds) {
                this.skillIds = skillIds;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * task_id.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
