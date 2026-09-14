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
 * {@link ListAgentSessionArtifactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentSessionArtifactsResponseBody</p>
 */
public class ListAgentSessionArtifactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JsonRpcResponse")
    private JsonRpcResponse jsonRpcResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAgentSessionArtifactsResponseBody(Builder builder) {
        this.jsonRpcResponse = builder.jsonRpcResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentSessionArtifactsResponseBody create() {
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

        private Builder(ListAgentSessionArtifactsResponseBody model) {
            this.jsonRpcResponse = model.jsonRpcResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The JSON-RPC response.</p>
         */
        public Builder jsonRpcResponse(JsonRpcResponse jsonRpcResponse) {
            this.jsonRpcResponse = jsonRpcResponse;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAgentSessionArtifactsResponseBody build() {
            return new ListAgentSessionArtifactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentSessionArtifactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSessionArtifactsResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactName")
        private String artifactName;

        @com.aliyun.core.annotation.NameInMap("ArtifactPath")
        private String artifactPath;

        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        private Artifacts(Builder builder) {
            this.artifactName = builder.artifactName;
            this.artifactPath = builder.artifactPath;
            this.artifactType = builder.artifactType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
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

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        public static final class Builder {
            private String artifactName; 
            private String artifactPath; 
            private String artifactType; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.artifactName = model.artifactName;
                this.artifactPath = model.artifactPath;
                this.artifactType = model.artifactType;
            } 

            /**
             * <p>The name of the model artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>mock_report.md</p>
             */
            public Builder artifactName(String artifactName) {
                this.artifactName = artifactName;
                return this;
            }

            /**
             * <p>The path of the model artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>mock/mock_report.md</p>
             */
            public Builder artifactPath(String artifactPath) {
                this.artifactPath = artifactPath;
                return this;
            }

            /**
             * <p>The type of the model artifact, typically a file extension.</p>
             * 
             * <strong>example:</strong>
             * <p>md</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSessionArtifactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSessionArtifactsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Artifacts")
        private java.util.List<Artifacts> artifacts;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Result(Builder builder) {
            this.artifacts = builder.artifacts;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return artifacts
         */
        public java.util.List<Artifacts> getArtifacts() {
            return this.artifacts;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List<Artifacts> artifacts; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.artifacts = model.artifacts;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The list of model artifacts.</p>
             */
            public Builder artifacts(java.util.List<Artifacts> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * <p>The actual number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token for the next page. The value is null for the last page.</p>
             * 
             * <strong>example:</strong>
             * <p>CAESExFsbyH...</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSessionArtifactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSessionArtifactsResponseBody</p>
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
             * <p>The ID passed in by the requester. The value is returned as-is.</p>
             * 
             * <strong>example:</strong>
             * <p>28477817</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The JSON-RPC version. Fixed value: 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder jsonrpc(String jsonrpc) {
                this.jsonrpc = jsonrpc;
                return this;
            }

            /**
             * <p>The pagination information of model artifacts.</p>
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
