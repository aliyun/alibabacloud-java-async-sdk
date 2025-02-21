// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link CreatePowerForecastJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePowerForecastJobResponseBody</p>
 */
public class CreatePowerForecastJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreatePowerForecastJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePowerForecastJobResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>68738E75-43C1-5AE5-9F3A-AFEF576D7B5F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreatePowerForecastJobResponseBody build() {
            return new CreatePowerForecastJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePowerForecastJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePowerForecastJobResponseBody</p>
     */
    public static class Response extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DebugInfo")
        private Object debugInfo;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Object result;

        private Response(Builder builder) {
            this.debugInfo = builder.debugInfo;
            this.jobType = builder.jobType;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Response create() {
            return builder().build();
        }

        /**
         * @return debugInfo
         */
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return result
         */
        public Object getResult() {
            return this.result;
        }

        public static final class Builder {
            private Object debugInfo; 
            private String jobType; 
            private Object result; 

            /**
             * DebugInfo.
             */
            public Builder debugInfo(Object debugInfo) {
                this.debugInfo = debugInfo;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Object result) {
                this.result = result;
                return this;
            }

            public Response build() {
                return new Response(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePowerForecastJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePowerForecastJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Completed")
        private Boolean completed;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Response")
        private Response response;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.completed = builder.completed;
            this.createTime = builder.createTime;
            this.error = builder.error;
            this.jobId = builder.jobId;
            this.progress = builder.progress;
            this.response = builder.response;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completed
         */
        public Boolean getCompleted() {
            return this.completed;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return response
         */
        public Response getResponse() {
            return this.response;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean completed; 
            private String createTime; 
            private String error; 
            private String jobId; 
            private Integer progress; 
            private Response response; 
            private String status; 

            /**
             * Completed.
             */
            public Builder completed(Boolean completed) {
                this.completed = completed;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Response.
             */
            public Builder response(Response response) {
                this.response = response;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
