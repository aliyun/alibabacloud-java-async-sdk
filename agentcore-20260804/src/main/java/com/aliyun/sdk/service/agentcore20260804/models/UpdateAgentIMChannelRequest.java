// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link UpdateAgentIMChannelRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentIMChannelRequest</p>
 */
public class UpdateAgentIMChannelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("imChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imChannelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateAgentIMChannelRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateAgentIMChannelRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.imChannelId = builder.imChannelId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentIMChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return imChannelId
     */
    public String getImChannelId() {
        return this.imChannelId;
    }

    /**
     * @return body
     */
    public UpdateAgentIMChannelRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateAgentIMChannelRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String imChannelId; 
        private UpdateAgentIMChannelRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentIMChannelRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.imChannelId = request.imChannelId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        public Builder agentId(String agentId) {
            this.putPathParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-1</p>
         */
        public Builder imChannelId(String imChannelId) {
            this.putPathParameter("imChannelId", imChannelId);
            this.imChannelId = imChannelId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateAgentIMChannelRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateAgentIMChannelRequest build() {
            return new UpdateAgentIMChannelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAgentIMChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentIMChannelRequest</p>
     */
    public static class ChannelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("showThinking")
        private Boolean showThinking;

        @com.aliyun.core.annotation.NameInMap("showToolCalls")
        private Boolean showToolCalls;

        private ChannelConfig(Builder builder) {
            this.showThinking = builder.showThinking;
            this.showToolCalls = builder.showToolCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelConfig create() {
            return builder().build();
        }

        /**
         * @return showThinking
         */
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        /**
         * @return showToolCalls
         */
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

        public static final class Builder {
            private Boolean showThinking; 
            private Boolean showToolCalls; 

            private Builder() {
            } 

            private Builder(ChannelConfig model) {
                this.showThinking = model.showThinking;
                this.showToolCalls = model.showToolCalls;
            } 

            /**
             * showThinking.
             */
            public Builder showThinking(Boolean showThinking) {
                this.showThinking = showThinking;
                return this;
            }

            /**
             * showToolCalls.
             */
            public Builder showToolCalls(Boolean showToolCalls) {
                this.showToolCalls = showToolCalls;
                return this;
            }

            public ChannelConfig build() {
                return new ChannelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAgentIMChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentIMChannelRequest</p>
     */
    public static class UpdateAgentIMChannelRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channelConfig")
        private ChannelConfig channelConfig;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
        private String serviceEndpointId;

        private UpdateAgentIMChannelRequestBody(Builder builder) {
            this.channelConfig = builder.channelConfig;
            this.enabled = builder.enabled;
            this.serviceEndpointId = builder.serviceEndpointId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateAgentIMChannelRequestBody create() {
            return builder().build();
        }

        /**
         * @return channelConfig
         */
        public ChannelConfig getChannelConfig() {
            return this.channelConfig;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return serviceEndpointId
         */
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public static final class Builder {
            private ChannelConfig channelConfig; 
            private Boolean enabled; 
            private String serviceEndpointId; 

            private Builder() {
            } 

            private Builder(UpdateAgentIMChannelRequestBody model) {
                this.channelConfig = model.channelConfig;
                this.enabled = model.enabled;
                this.serviceEndpointId = model.serviceEndpointId;
            } 

            /**
             * channelConfig.
             */
            public Builder channelConfig(ChannelConfig channelConfig) {
                this.channelConfig = channelConfig;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * serviceEndpointId.
             */
            public Builder serviceEndpointId(String serviceEndpointId) {
                this.serviceEndpointId = serviceEndpointId;
                return this;
            }

            public UpdateAgentIMChannelRequestBody build() {
                return new UpdateAgentIMChannelRequestBody(this);
            } 

        } 

    }
}
