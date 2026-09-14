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
 * {@link GetAgentSessionArtifactMetaRequest} extends {@link RequestModel}
 *
 * <p>GetAgentSessionArtifactMetaRequest</p>
 */
public class GetAgentSessionArtifactMetaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private Params params;

    private GetAgentSessionArtifactMetaRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSessionArtifactMetaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<GetAgentSessionArtifactMetaRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentSessionArtifactMetaRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * <p>A client-provided ID that is echoed in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>900335678024</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
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
            this.putBodyParameter("Jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * <p>The container for business parameters.</p>
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public GetAgentSessionArtifactMetaRequest build() {
            return new GetAgentSessionArtifactMetaRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentSessionArtifactMetaRequest} extends {@link TeaModel}
     *
     * <p>GetAgentSessionArtifactMetaRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactPath")
        private String artifactPath;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Params(Builder builder) {
            this.artifactPath = builder.artifactPath;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return artifactPath
         */
        public String getArtifactPath() {
            return this.artifactPath;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String artifactPath; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.artifactPath = model.artifactPath;
                this.sessionId = model.sessionId;
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

            /**
             * <p>The ID of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>sess_0f12abc34</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
