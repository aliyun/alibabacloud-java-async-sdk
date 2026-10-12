// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link BatchUpdateHttpApiOperationRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateHttpApiOperationRequest</p>
 */
public class BatchUpdateHttpApiOperationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private AuthConfig authConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationIds")
    private java.util.List<String> operationIds;

    private BatchUpdateHttpApiOperationRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.authConfig = builder.authConfig;
        this.enableAuth = builder.enableAuth;
        this.operationIds = builder.operationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateHttpApiOperationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return authConfig
     */
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return enableAuth
     */
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    /**
     * @return operationIds
     */
    public java.util.List<String> getOperationIds() {
        return this.operationIds;
    }

    public static final class Builder extends Request.Builder<BatchUpdateHttpApiOperationRequest, Builder> {
        private String httpApiId; 
        private AuthConfig authConfig; 
        private Boolean enableAuth; 
        private java.util.List<String> operationIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateHttpApiOperationRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.authConfig = request.authConfig;
            this.enableAuth = request.enableAuth;
            this.operationIds = request.operationIds;
        } 

        /**
         * <p>The ID of the HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The authentication configuration. This parameter is required when enableAuth is set to true.</p>
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.putBodyParameter("authConfig", authConfig);
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable consumer authentication. If set to true, a valid authConfig must be provided. If set to false, authConfig is not validated and the existing configuration remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuth(Boolean enableAuth) {
            this.putBodyParameter("enableAuth", enableAuth);
            this.enableAuth = enableAuth;
            return this;
        }

        /**
         * <p>The list of operation IDs to update in batches. This parameter cannot be empty.</p>
         */
        public Builder operationIds(java.util.List<String> operationIds) {
            this.putBodyParameter("operationIds", operationIds);
            this.operationIds = operationIds;
            return this;
        }

        @Override
        public BatchUpdateHttpApiOperationRequest build() {
            return new BatchUpdateHttpApiOperationRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchUpdateHttpApiOperationRequest} extends {@link TeaModel}
     *
     * <p>BatchUpdateHttpApiOperationRequest</p>
     */
    public static class AuthConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authMode")
        private String authMode;

        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        private AuthConfig(Builder builder) {
            this.authMode = builder.authMode;
            this.authType = builder.authType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConfig create() {
            return builder().build();
        }

        /**
         * @return authMode
         */
        public String getAuthMode() {
            return this.authMode;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        public static final class Builder {
            private String authMode; 
            private String authType; 

            private Builder() {
            } 

            private Builder(AuthConfig model) {
                this.authMode = model.authMode;
                this.authType = model.authType;
            } 

            /**
             * <p>The authentication mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder authMode(String authMode) {
                this.authMode = authMode;
                return this;
            }

            /**
             * <p>The authentication type.</p>
             * 
             * <strong>example:</strong>
             * <p>Jwt</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            public AuthConfig build() {
                return new AuthConfig(this);
            } 

        } 

    }
}
