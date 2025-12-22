// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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

        private Builder() {
        } 

        private Builder(GetFunctionDefaultInstanceResponseBody model) {
            this.code = model.code;
            this.functionName = model.functionName;
            this.httpCode = model.httpCode;
            this.instanceName = model.instanceName;
            this.latency = model.latency;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DefaultInstance.NotExist</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>cdn_waf</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sh-bp1oi31w1jn4ctdyv</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The default running time.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder latency(Long latency) {
            this.latency = latency;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>default instance not set.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>062BA91F-A568-5779-8A5B-9E62C9BB3DC1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Pagination&quot;: {&quot;TotalCount&quot;: 0, &quot;PageNumber&quot;: 1, &quot;PageSize&quot;: 10}, &quot;AntConsortiums&quot;: []}</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The status of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetFunctionDefaultInstanceResponseBody build() {
            return new GetFunctionDefaultInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFunctionDefaultInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetFunctionDefaultInstanceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.instanceName = model.instanceName;
            } 

            /**
             * <p>The default instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>model1</p>
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
