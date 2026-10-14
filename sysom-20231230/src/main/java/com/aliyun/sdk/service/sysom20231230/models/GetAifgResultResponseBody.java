// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetAifgResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAifgResultResponseBody</p>
 */
public class GetAifgResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAifgResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAifgResultResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAifgResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Execution succeeded&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAifgResultResponseBody build() {
            return new GetAifgResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAifgResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAifgResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private Object result;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("submitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("traceTaskId")
        private String traceTaskId;

        private Data(Builder builder) {
            this.result = builder.result;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.taskId = builder.taskId;
            this.traceTaskId = builder.traceTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Object getResult() {
            return this.result;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return traceTaskId
         */
        public String getTraceTaskId() {
            return this.traceTaskId;
        }

        public static final class Builder {
            private Object result; 
            private String serviceName; 
            private String status; 
            private String submitTime; 
            private String taskId; 
            private String traceTaskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
                this.serviceName = model.serviceName;
                this.status = model.status;
                this.submitTime = model.submitTime;
                this.taskId = model.taskId;
                this.traceTaskId = model.traceTaskId;
            } 

            /**
             * <p>The diagnostic result.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder result(Object result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>user-service</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The status of the root data.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the data was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01T00:00:00Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The unique task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The training task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-as2993fsx</p>
             */
            public Builder traceTaskId(String traceTaskId) {
                this.traceTaskId = traceTaskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
