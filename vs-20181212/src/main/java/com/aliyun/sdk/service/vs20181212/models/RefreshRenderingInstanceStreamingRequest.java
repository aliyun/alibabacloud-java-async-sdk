// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link RefreshRenderingInstanceStreamingRequest} extends {@link RequestModel}
 *
 * <p>RefreshRenderingInstanceStreamingRequest</p>
 */
public class RefreshRenderingInstanceStreamingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private ClientInfo clientInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private RefreshRenderingInstanceStreamingRequest(Builder builder) {
        super(builder);
        this.clientInfo = builder.clientInfo;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshRenderingInstanceStreamingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientInfo
     */
    public ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<RefreshRenderingInstanceStreamingRequest, Builder> {
        private ClientInfo clientInfo; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshRenderingInstanceStreamingRequest request) {
            super(request);
            this.clientInfo = request.clientInfo;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * ClientInfo.
         */
        public Builder clientInfo(ClientInfo clientInfo) {
            String clientInfoShrink = shrink(clientInfo, "ClientInfo", "json");
            this.putQueryParameter("ClientInfo", clientInfoShrink);
            this.clientInfo = clientInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public RefreshRenderingInstanceStreamingRequest build() {
            return new RefreshRenderingInstanceStreamingRequest(this);
        } 

    } 

    /**
     * 
     * {@link RefreshRenderingInstanceStreamingRequest} extends {@link TeaModel}
     *
     * <p>RefreshRenderingInstanceStreamingRequest</p>
     */
    public static class ClientInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("NewClient")
        private Boolean newClient;

        private ClientInfo(Builder builder) {
            this.clientIp = builder.clientIp;
            this.newClient = builder.newClient;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientInfo create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return newClient
         */
        public Boolean getNewClient() {
            return this.newClient;
        }

        public static final class Builder {
            private String clientIp; 
            private Boolean newClient; 

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * NewClient.
             */
            public Builder newClient(Boolean newClient) {
                this.newClient = newClient;
                return this;
            }

            public ClientInfo build() {
                return new ClientInfo(this);
            } 

        } 

    }
}
