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
 * {@link GetAgentSessionArtifactMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentSessionArtifactMetaResponseBody</p>
 */
public class GetAgentSessionArtifactMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonRpcResponse")
    private JsonRpcResponse jsonRpcResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentSessionArtifactMetaResponseBody(Builder builder) {
        this.jsonRpcResponse = builder.jsonRpcResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSessionArtifactMetaResponseBody create() {
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

        private Builder(GetAgentSessionArtifactMetaResponseBody model) {
            this.jsonRpcResponse = model.jsonRpcResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The JSON-RPC response object.</p>
         */
        public Builder jsonRpcResponse(JsonRpcResponse jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>The ID of the request. You can use it to trace the request in logs.</p>
         * 
         * <strong>example:</strong>
         * <p>CE70C54F-A3BD-5C19-88EF-2A7D3451C449</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentSessionArtifactMetaResponseBody build() {
            return new GetAgentSessionArtifactMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentSessionArtifactMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentSessionArtifactMetaResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactContent")
        private String artifactContent;

        @com.aliyun.core.annotation.NameInMap("ArtifactName")
        private String artifactName;

        @com.aliyun.core.annotation.NameInMap("ArtifactPath")
        private String artifactPath;

        private Result(Builder builder) {
            this.artifactContent = builder.artifactContent;
            this.artifactName = builder.artifactName;
            this.artifactPath = builder.artifactPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return artifactContent
         */
        public String getArtifactContent() {
            return this.artifactContent;
        }

        /**
         * @return artifactName
         */
        public String getArtifactName() {
            return this.artifactName;
        }

        /**
         * @return artifactPath
         */
        public String getArtifactPath() {
            return this.artifactPath;
        }

        public static final class Builder {
            private String artifactContent; 
            private String artifactName; 
            private String artifactPath; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.artifactContent = model.artifactContent;
                this.artifactName = model.artifactName;
                this.artifactPath = model.artifactPath;
            } 

            /**
             * <p>The content of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>This is md content</p>
             */
            public Builder artifactContent(String artifactContent) {
                this.artifactContent = artifactContent;
                return this;
            }

            /**
             * <p>The name of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>mock_report.md</p>
             */
            public Builder artifactName(String artifactName) {
                this.artifactName = artifactName;
                return this;
            }

            /**
             * <p>The path of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>mock/mock_report.md</p>
             */
            public Builder artifactPath(String artifactPath) {
                this.artifactPath = artifactPath;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentSessionArtifactMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentSessionArtifactMetaResponseBody</p>
     */
    public static class JsonRpcResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Jsonrpc")
        private String jsonrpc;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        private JsonRpcResponse(Builder builder) {
            this.id = builder.id;
            this.jsonrpc = builder.jsonrpc;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JsonRpcResponse create() {
            return builder().build();
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

        public static final class Builder {
            private String id; 
            private String jsonrpc; 
            private Result result; 

            private Builder() {
            } 

            private Builder(JsonRpcResponse model) {
                this.id = model.id;
                this.jsonrpc = model.jsonrpc;
                this.result = model.result;
            } 

            /**
             * <p>The ID from the original request.</p>
             * 
             * <strong>example:</strong>
             * <p>300010555</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The JSON-RPC version. The value is <code>2.0</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder jsonrpc(String jsonrpc) {
                this.jsonrpc = jsonrpc;
                return this;
            }

            /**
             * <p>Contains the metadata and content of the artifact.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            public JsonRpcResponse build() {
                return new JsonRpcResponse(this);
            } 

        } 

    }
}
