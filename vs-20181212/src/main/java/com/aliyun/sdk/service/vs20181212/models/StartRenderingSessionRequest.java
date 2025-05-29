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
 * {@link StartRenderingSessionRequest} extends {@link RequestModel}
 *
 * <p>StartRenderingSessionRequest</p>
 */
public class StartRenderingSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientParams")
    private ClientParams clientParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private StartRenderingSessionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientId = builder.clientId;
        this.clientParams = builder.clientParams;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRenderingSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientParams
     */
    public ClientParams getClientParams() {
        return this.clientParams;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<StartRenderingSessionRequest, Builder> {
        private String appId; 
        private String clientId; 
        private ClientParams clientParams; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(StartRenderingSessionRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientId = request.clientId;
            this.clientParams = request.clientParams;
            this.projectId = request.projectId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>04c30850-1d91-4da1-b811-66d0ee94af7d</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientParams.
         */
        public Builder clientParams(ClientParams clientParams) {
            String clientParamsShrink = shrink(clientParams, "ClientParams", "json");
            this.putQueryParameter("ClientParams", clientParamsShrink);
            this.clientParams = clientParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public StartRenderingSessionRequest build() {
            return new StartRenderingSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartRenderingSessionRequest} extends {@link TeaModel}
     *
     * <p>StartRenderingSessionRequest</p>
     */
    public static class ClientParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        private ClientParams(Builder builder) {
            this.clientIp = builder.clientIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientParams create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        public static final class Builder {
            private String clientIp; 

            private Builder() {
            } 

            private Builder(ClientParams model) {
                this.clientIp = model.clientIp;
            } 

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            public ClientParams build() {
                return new ClientParams(this);
            } 

        } 

    }
}
