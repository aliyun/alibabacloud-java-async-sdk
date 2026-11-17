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
 * {@link UploadAgentSessionFileResponseBody} extends {@link TeaModel}
 *
 * <p>UploadAgentSessionFileResponseBody</p>
 */
public class UploadAgentSessionFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonRpcResponse")
    private JsonRpcResponse jsonRpcResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UploadAgentSessionFileResponseBody(Builder builder) {
        this.jsonRpcResponse = builder.jsonRpcResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadAgentSessionFileResponseBody create() {
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

        private Builder(UploadAgentSessionFileResponseBody model) {
            this.jsonRpcResponse = model.jsonRpcResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The JSON-RPC response. Returns Result on success and Error on protocol errors.</p>
         */
        public Builder jsonRpcResponse(JsonRpcResponse jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>The server correlation ID for the current request. You can provide this value for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A0B6E0-E005-1465-B5DE-5CD17677426F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UploadAgentSessionFileResponseBody build() {
            return new UploadAgentSessionFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadAgentSessionFileResponseBody} extends {@link TeaModel}
     *
     * <p>UploadAgentSessionFileResponseBody</p>
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
             * <p>400</p>
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
             * <p>SESSION_ATTACHMENT_OBJECT_MISMATCH</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>SESSION_ATTACHMENT_OBJECT_MISMATCH</p>
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
     * {@link UploadAgentSessionFileResponseBody} extends {@link TeaModel}
     *
     * <p>UploadAgentSessionFileResponseBody</p>
     */
    public static class Signature extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Signature(Builder builder) {
            this.expiresAt = builder.expiresAt;
            this.headers = builder.headers;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Signature create() {
            return builder().build();
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String expiresAt; 
            private java.util.Map<String, String> headers; 
            private String url; 

            private Builder() {
            } 

            private Builder(Signature model) {
                this.expiresAt = model.expiresAt;
                this.headers = model.headers;
                this.url = model.url;
            } 

            /**
             * <p>The expiration time of the current upload signature in ISO 8601 UTC string format. The trailing Z indicates UTC, and fractional seconds may be included. The signature is valid for 5 minutes. Signature expiration does not indicate that the staged object has been deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-12T09:46:33.477365753Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>All signed request headers that must be included in the PUT request. The names and values must be used exactly as provided. This includes Content-Type, Content-MD5, Content-Length, x-oss-object-acl, and x-oss-forbid-overwrite.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Content-Type&quot;:&quot;application/octet-stream&quot;,&quot;Content-MD5&quot;:&quot;sZRqySSS0jR8YjW00mERhA==&quot;,&quot;Content-Length&quot;:&quot;6&quot;,&quot;x-oss-object-acl&quot;:&quot;private&quot;,&quot;x-oss-forbid-overwrite&quot;:&quot;true&quot;}</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The complete signed HTTPS PUT URL returned by prepare, which must be used exactly as provided for the upload. The example displayed for this field does not contain a valid signature. The actual request must use the complete signed URL returned by the current prepare call.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://attachments.example.test/signed">https://attachments.example.test/signed</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Signature build() {
                return new Signature(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadAgentSessionFileResponseBody} extends {@link TeaModel}
     *
     * <p>UploadAgentSessionFileResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelativePath")
        private String relativePath;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private Signature signature;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("UploadId")
        private String uploadId;

        private Result(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.relativePath = builder.relativePath;
            this.signature = builder.signature;
            this.size = builder.size;
            this.uploadId = builder.uploadId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relativePath
         */
        public String getRelativePath() {
            return this.relativePath;
        }

        /**
         * @return signature
         */
        public Signature getSignature() {
            return this.signature;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return uploadId
         */
        public String getUploadId() {
            return this.uploadId;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String relativePath; 
            private Signature signature; 
            private Long size; 
            private String uploadId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.id = model.id;
                this.name = model.name;
                this.relativePath = model.relativePath;
                this.signature = model.signature;
                this.size = model.size;
                this.uploadId = model.uploadId;
            } 

            /**
             * <p>The attachment identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The original file name.</p>
             * 
             * <strong>example:</strong>
             * <p>sample.csv</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The relative path in the session working directory.</p>
             * 
             * <strong>example:</strong>
             * <p>upload/session_bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.csv</p>
             */
            public Builder relativePath(String relativePath) {
                this.relativePath = relativePath;
                return this;
            }

            /**
             * <p>The time-limited object storage signature returned by prepare.</p>
             */
            public Builder signature(Signature signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The number of file bytes saved in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The staged upload identifier issued by prepare.</p>
             * 
             * <strong>example:</strong>
             * <p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadAgentSessionFileResponseBody} extends {@link TeaModel}
     *
     * <p>UploadAgentSessionFileResponseBody</p>
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
             * <p>The JSON-RPC fault message. This field is not returned on success.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The JSON-RPC correlation identifier for the current request, which is passed by the caller and returned as is.</p>
             * 
             * <strong>example:</strong>
             * <p>attachment-rpc-001</p>
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
             * <p>Issues the staged upload URL or returns the attachment information after writing to the instance.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The response time as a UNIX timestamp in milliseconds.</p>
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
