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
 * {@link UpdateAgentSessionTitleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentSessionTitleRequest</p>
 */
public class UpdateAgentSessionTitleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private Params params;

    private UpdateAgentSessionTitleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentSessionTitleRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateAgentSessionTitleRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentSessionTitleRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * <p>The JSON-RPC correlation ID for the current request. It is specified by the caller and used to correlate the request and response.</p>
         * 
         * <strong>example:</strong>
         * <p>updateagentsessiontitle-rpc-001</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The JSON-RPC protocol version. Set the value to 2.0.</p>
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
         * <p>The request parameters for modifying the session title, including the target session ID and the new title.</p>
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public UpdateAgentSessionTitleRequest build() {
            return new UpdateAgentSessionTitleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAgentSessionTitleRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentSessionTitleRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Title")
        @com.aliyun.core.annotation.Validation(required = true)
        private String title;

        private Params(Builder builder) {
            this.sessionId = builder.sessionId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
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

            private Builder(Params model) {
                this.sessionId = model.sessionId;
                this.title = model.title;
            } 

            /**
             * <p>The ID of the agent session that belongs to the current account.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123e4567-e89b-42d3-a456-426614174000</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The new title. The length must be 1 to 512 characters after leading and trailing whitespaces are removed.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>New title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
