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
 * {@link UpdateAgentSessionTitleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAgentSessionTitleResponseBody</p>
 */
public class UpdateAgentSessionTitleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonRpcResponse")
    private JsonRpcResponse jsonRpcResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAgentSessionTitleResponseBody(Builder builder) {
        this.jsonRpcResponse = builder.jsonRpcResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentSessionTitleResponseBody create() {
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

        private Builder(UpdateAgentSessionTitleResponseBody model) {
            this.jsonRpcResponse = model.jsonRpcResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The JSON-RPC response. Result is returned upon success, and Error is returned upon a protocol error.</p>
         */
        public Builder jsonRpcResponse(JsonRpcResponse jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>The unique ID of the current OpenAPI request. You can use it to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01A0B6E0-E005-1465-B5DE-5CD17677426F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAgentSessionTitleResponseBody build() {
            return new UpdateAgentSessionTitleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAgentSessionTitleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAgentSessionTitleResponseBody</p>
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
             * <p>500</p>
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
             * <p>0x4883300000000019</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The session does not exist or the current account is not authorized to access it. Return to the session list and select another session</p>
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
     * {@link UpdateAgentSessionTitleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAgentSessionTitleResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Result(Builder builder) {
            this.sessionId = builder.sessionId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String sessionId; 
            private String title; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.sessionId = model.sessionId;
                this.title = model.title;
            } 

            /**
             * <p>The ID of the agent session whose title is modified. It corresponds to the SessionId in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>123e4567-e89b-42d3-a456-426614174000</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The saved session title after modification. Leading and trailing whitespace characters are removed.</p>
             * 
             * <strong>example:</strong>
             * <p>New title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAgentSessionTitleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAgentSessionTitleResponseBody</p>
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
             * <p>The JSON-RPC error message. This field is not returned upon success.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The JSON-RPC correlation ID for the current request. It is passed by the caller and returned as is.</p>
             * 
             * <strong>example:</strong>
             * <p>updateagentsessiontitle-rpc-001</p>
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
             * <p>The operation result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The response time. It is a UNIX timestamp in milliseconds.</p>
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
