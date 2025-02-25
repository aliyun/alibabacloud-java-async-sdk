// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionDefaultInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionDefaultInstanceResponseBody</p>
 */
public class GetFunctionDefaultInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FunctionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Long httpCode;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("Latency")
    private Long latency;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetFunctionDefaultInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.functionName = builder.functionName;
        this.httpCode = builder.httpCode;
        this.instanceName = builder.instanceName;
        this.latency = builder.latency;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionDefaultInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return latency
     */
    public Long getLatency() {
        return this.latency;
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
        private String code; 
        private String functionName; 
        private Long httpCode; 
        private String instanceName; 
        private Long latency; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String status; 

        /**
         * The error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The name of the feature.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The default running time.
         */
        public Builder latency(Long latency) {
            this.latency = latency;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result of the request.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * The status of the request.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetFunctionDefaultInstanceResponseBody build() {
            return new GetFunctionDefaultInstanceResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private Result(Builder builder) {
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private String instanceName; 

            /**
             * The default instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
