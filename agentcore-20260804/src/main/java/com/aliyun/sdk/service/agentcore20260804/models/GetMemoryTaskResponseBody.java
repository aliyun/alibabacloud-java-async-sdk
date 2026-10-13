// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMemoryTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMemoryTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
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
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The task error code.</p>
             * 
             * <strong>example:</strong>
             * <p>UnknownError</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The task error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Memory extraction failed.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Memories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memoryId")
        private String memoryId;

        private Memories(Builder builder) {
            this.memoryId = builder.memoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memories create() {
            return builder().build();
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        public static final class Builder {
            private String memoryId; 

            private Builder() {
            } 

            private Builder(Memories model) {
                this.memoryId = model.memoryId;
            } 

            /**
             * <p>The long-term memory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mem-2f5f9c5a8d0e4c3b</p>
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
                return this;
            }

            public Memories build() {
                return new Memories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("memories")
        private java.util.List<Memories> memories;

        @com.aliyun.core.annotation.NameInMap("status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskId;

        private Data(Builder builder) {
            this.error = builder.error;
            this.memories = builder.memories;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return memories
         */
        public java.util.List<Memories> getMemories() {
            return this.memories;
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
            private Error error; 
            private java.util.List<Memories> memories; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.error = model.error;
                this.memories = model.memories;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The task error returned only when the status is FAILED or UNKNOWN. This does not indicate that the current query failed.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The memories returned only when the status is SUCCEEDED. An empty array is allowed.</p>
             */
            public Builder memories(java.util.List<Memories> memories) {
                this.memories = memories;
                return this;
            }

            /**
             * <p>The extraction task status.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>task-2f5f9c5a8d0e4c3b</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
