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
 * {@link LoadAgentSessionRequest} extends {@link RequestModel}
 *
 * <p>LoadAgentSessionRequest</p>
 */
public class LoadAgentSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private Params params;

    private LoadAgentSessionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoadAgentSessionRequest create() {
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

    public static final class Builder extends Request.Builder<LoadAgentSessionRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(LoadAgentSessionRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * <p>The client-generated request ID, which is returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>4as3dasf654a</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The JSON-RPC version. The value must be <code>2.0</code>.</p>
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
         * <p>Business parameters.</p>
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public LoadAgentSessionRequest build() {
            return new LoadAgentSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link LoadAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>LoadAgentSessionRequest</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginLogOffset")
        private Long beginLogOffset;

        @com.aliyun.core.annotation.NameInMap("IsReload")
        private Boolean isReload;

        private Meta(Builder builder) {
            this.beginLogOffset = builder.beginLogOffset;
            this.isReload = builder.isReload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return beginLogOffset
         */
        public Long getBeginLogOffset() {
            return this.beginLogOffset;
        }

        /**
         * @return isReload
         */
        public Boolean getIsReload() {
            return this.isReload;
        }

        public static final class Builder {
            private Long beginLogOffset; 
            private Boolean isReload; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.beginLogOffset = model.beginLogOffset;
                this.isReload = model.isReload;
            } 

            /**
             * <p>In a resumable transfer scenario, this specifies the offset from which to resume fetching the SSE output.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder beginLogOffset(Long beginLogOffset) {
                this.beginLogOffset = beginLogOffset;
                return this;
            }

            /**
             * <p>Specifies whether to use resumable transfer. If the SSE stream is interrupted due to issues like an unstable network connection, you can set this parameter to <code>true</code> to re-fetch the stream data from the point of failure.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isReload(Boolean isReload) {
                this.isReload = isReload;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoadAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>LoadAgentSessionRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Params(Builder builder) {
            this.meta = builder.meta;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private Meta meta; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.meta = model.meta;
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>DataWorks-specific extended parameters for ACP.</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The ID of the target session. If the session does not exist, an SSE error frame is returned.</p>
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
