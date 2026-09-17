// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ReplyAgentSessionResponseBody} extends {@link TeaModel}
 *
 * <p>ReplyAgentSessionResponseBody</p>
 */
public class ReplyAgentSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonRpcResponse")
    private JsonRpcResponse jsonRpcResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReplyAgentSessionResponseBody(Builder builder) {
        this.jsonRpcResponse = builder.jsonRpcResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplyAgentSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonRpcResponse
     */
    public JsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JsonRpcResponse jsonRpcResponse; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ReplyAgentSessionResponseBody model) {
            this.jsonRpcResponse = model.jsonRpcResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The JSON-RPC response. Returns Result on success or Error on protocol errors.</p>
         */
        public Builder jsonRpcResponse(JsonRpcResponse jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>The request ID for this call, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>request-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReplyAgentSessionResponseBody build() {
            return new ReplyAgentSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReplyAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ReplyAgentSessionResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.data = builder.data;
            this.errorCode = builder.errorCode;
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
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Integer code; 
            private Object data; 
            private String errorCode; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.data = model.data;
                this.errorCode = model.errorCode;
                this.message = model.message;
            } 

            /**
             * <p>The JSON-RPC error code.</p>
             * 
             * <strong>example:</strong>
             * <p>-32601</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The optional additional error information. The content depends on the error type.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The business error code.</p>
             * 
             * <strong>example:</strong>
             * <p>DAEMON_PERMISSION_UNAVAILABLE</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>DataAgent daemon permission reply is not enabled</p>
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
     * {@link ReplyAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ReplyAgentSessionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accepted")
        private Boolean accepted;

        private Result(Builder builder) {
            this.accepted = builder.accepted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accepted
         */
        public Boolean getAccepted() {
            return this.accepted;
        }

        public static final class Builder {
            private Boolean accepted; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.accepted = model.accepted;
            } 

            /**
             * <p>Indicates whether the daemon accepted the reply. A value of true indicates that the daemon accepted the reply. A value of false indicates that the reply was not accepted. Possible reasons include an unknown request, an already processed request, an expired request, or a nonexistent session. You cannot determine the specific reason from this value.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder accepted(Boolean accepted) {
                this.accepted = accepted;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReplyAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>ReplyAgentSessionResponseBody</p>
     */
    public static class JsonRpcResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Jsonrpc")
        private String jsonrpc;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private JsonRpcResponse(Builder builder) {
            this.error = builder.error;
            this.id = builder.id;
            this.jsonrpc = builder.jsonrpc;
            this.result = builder.result;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JsonRpcResponse create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jsonrpc
         */
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Error error; 
            private String id; 
            private String jsonrpc; 
            private Result result; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(JsonRpcResponse model) {
                this.error = model.error;
                this.id = model.id;
                this.jsonrpc = model.jsonrpc;
                this.result = model.result;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The JSON-RPC fault information. For example, DAEMON_PERMISSION_UNAVAILABLE is returned when the daemon reply feature is not enabled.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The JSON-RPC correlation ID for this reply request.</p>
             * 
             * <strong>example:</strong>
             * <p>reply-rpc-001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The JSON-RPC protocol version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder jsonrpc(String jsonrpc) {
                this.jsonrpc = jsonrpc;
                return this;
            }

            /**
             * <p>The reply processing result. This only indicates whether the reply was accepted, not whether the original task has completed.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The response time. This is a UNIX timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1789549200000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public JsonRpcResponse build() {
                return new JsonRpcResponse(this);
            } 

        } 

    }
}
