// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDocumentAnalyzeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDocumentAnalyzeTaskResponseBody</p>
 */
public class CreateDocumentAnalyzeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private CreateDocumentAnalyzeTaskResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDocumentAnalyzeTaskResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 

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

        public CreateDocumentAnalyzeTaskResponseBody build() {
            return new CreateDocumentAnalyzeTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDocumentAnalyzeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDocumentAnalyzeTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        private Result(Builder builder) {
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String taskId; 

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
