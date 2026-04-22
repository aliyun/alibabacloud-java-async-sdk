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
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Jsonrpc.
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("Jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * Params.
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
             * BeginLogOffset.
             */
            public Builder beginLogOffset(Long beginLogOffset) {
                this.beginLogOffset = beginLogOffset;
                return this;
            }

            /**
             * IsReload.
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
             * Meta.
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * SessionId.
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
