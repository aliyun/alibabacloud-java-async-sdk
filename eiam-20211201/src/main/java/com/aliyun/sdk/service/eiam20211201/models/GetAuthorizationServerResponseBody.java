// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetAuthorizationServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorizationServerResponseBody</p>
 */
public class GetAuthorizationServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationServer")
    private AuthorizationServer authorizationServer;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAuthorizationServerResponseBody(Builder builder) {
        this.authorizationServer = builder.authorizationServer;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationServer
     */
    public AuthorizationServer getAuthorizationServer() {
        return this.authorizationServer;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AuthorizationServer authorizationServer; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAuthorizationServerResponseBody model) {
            this.authorizationServer = model.authorizationServer;
            this.requestId = model.requestId;
        } 

        /**
         * AuthorizationServer.
         */
        public Builder authorizationServer(AuthorizationServer authorizationServer) {
            this.authorizationServer = authorizationServer;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAuthorizationServerResponseBody build() {
            return new GetAuthorizationServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthorizationServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthorizationServerResponseBody</p>
     */
    public static class ProtocolEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Oauth2TokenEndpoint")
        private String oauth2TokenEndpoint;

        @com.aliyun.core.annotation.NameInMap("OidcJwksEndpoint")
        private String oidcJwksEndpoint;

        private ProtocolEndpoint(Builder builder) {
            this.oauth2TokenEndpoint = builder.oauth2TokenEndpoint;
            this.oidcJwksEndpoint = builder.oidcJwksEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolEndpoint create() {
            return builder().build();
        }

        /**
         * @return oauth2TokenEndpoint
         */
        public String getOauth2TokenEndpoint() {
            return this.oauth2TokenEndpoint;
        }

        /**
         * @return oidcJwksEndpoint
         */
        public String getOidcJwksEndpoint() {
            return this.oidcJwksEndpoint;
        }

        public static final class Builder {
            private String oauth2TokenEndpoint; 
            private String oidcJwksEndpoint; 

            private Builder() {
            } 

            private Builder(ProtocolEndpoint model) {
                this.oauth2TokenEndpoint = model.oauth2TokenEndpoint;
                this.oidcJwksEndpoint = model.oidcJwksEndpoint;
            } 

            /**
             * Oauth2TokenEndpoint.
             */
            public Builder oauth2TokenEndpoint(String oauth2TokenEndpoint) {
                this.oauth2TokenEndpoint = oauth2TokenEndpoint;
                return this;
            }

            /**
             * OidcJwksEndpoint.
             */
            public Builder oidcJwksEndpoint(String oidcJwksEndpoint) {
                this.oidcJwksEndpoint = oidcJwksEndpoint;
                return this;
            }

            public ProtocolEndpoint build() {
                return new ProtocolEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAuthorizationServerResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthorizationServerResponseBody</p>
     */
    public static class AuthorizationServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationServerId")
        private String authorizationServerId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationServerName")
        private String authorizationServerName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreationType")
        private String creationType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("IssuerDomain")
        private String issuerDomain;

        @com.aliyun.core.annotation.NameInMap("IssuerMode")
        private String issuerMode;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("ProtocolEndpoint")
        private ProtocolEndpoint protocolEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AuthorizationServer(Builder builder) {
            this.authorizationServerId = builder.authorizationServerId;
            this.authorizationServerName = builder.authorizationServerName;
            this.createTime = builder.createTime;
            this.creationType = builder.creationType;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.issuer = builder.issuer;
            this.issuerDomain = builder.issuerDomain;
            this.issuerMode = builder.issuerMode;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.protocolEndpoint = builder.protocolEndpoint;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationServer create() {
            return builder().build();
        }

        /**
         * @return authorizationServerId
         */
        public String getAuthorizationServerId() {
            return this.authorizationServerId;
        }

        /**
         * @return authorizationServerName
         */
        public String getAuthorizationServerName() {
            return this.authorizationServerName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creationType
         */
        public String getCreationType() {
            return this.creationType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return issuerDomain
         */
        public String getIssuerDomain() {
            return this.issuerDomain;
        }

        /**
         * @return issuerMode
         */
        public String getIssuerMode() {
            return this.issuerMode;
        }

        /**
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return protocolEndpoint
         */
        public ProtocolEndpoint getProtocolEndpoint() {
            return this.protocolEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String authorizationServerId; 
            private String authorizationServerName; 
            private Long createTime; 
            private String creationType; 
            private String description; 
            private String instanceId; 
            private String issuer; 
            private String issuerDomain; 
            private String issuerMode; 
            private Long lastUpdateTime; 
            private ProtocolEndpoint protocolEndpoint; 
            private String status; 

            private Builder() {
            } 

            private Builder(AuthorizationServer model) {
                this.authorizationServerId = model.authorizationServerId;
                this.authorizationServerName = model.authorizationServerName;
                this.createTime = model.createTime;
                this.creationType = model.creationType;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.issuer = model.issuer;
                this.issuerDomain = model.issuerDomain;
                this.issuerMode = model.issuerMode;
                this.lastUpdateTime = model.lastUpdateTime;
                this.protocolEndpoint = model.protocolEndpoint;
                this.status = model.status;
            } 

            /**
             * <p>IDaaS EIAM 授权服务器ID</p>
             * 
             * <strong>example:</strong>
             * <p>iauths_system</p>
             */
            public Builder authorizationServerId(String authorizationServerId) {
                this.authorizationServerId = authorizationServerId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 授权服务器名称</p>
             * 
             * <strong>example:</strong>
             * <p>System_Default</p>
             */
            public Builder authorizationServerName(String authorizationServerName) {
                this.authorizationServerName = authorizationServerName;
                return this;
            }

            /**
             * <p>IDaaS EIAM 授权服务器创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1754620108295</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>创建类型：system_init-系统默认创建，jwt_credential_provider-JWT凭据提供商创建，user_custom-用户创建</p>
             * 
             * <strong>example:</strong>
             * <p>system_init</p>
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * <p>授权服务器描述</p>
             * 
             * <strong>example:</strong>
             * <p>description of authorization server</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_qzljgbhtwnnsywtdbz7yzy2any</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 授权token颁发者</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2">https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>Issuer使用的域名，可为初始化域名或已添加的自定义域名</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx.aliyunidaas.com</p>
             */
            public Builder issuerDomain(String issuerDomain) {
                this.issuerDomain = issuerDomain;
                return this;
            }

            /**
             * <p>Issuer模式：dynamic-动态基于请求域名，static-使用固定域名</p>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder issuerMode(String issuerMode) {
                this.issuerMode = issuerMode;
                return this;
            }

            /**
             * <p>IDaaS EIAM 授权服务器最近更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1781608572164</p>
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * ProtocolEndpoint.
             */
            public Builder protocolEndpoint(ProtocolEndpoint protocolEndpoint) {
                this.protocolEndpoint = protocolEndpoint;
                return this;
            }

            /**
             * <p>IDaaS EIAM 授权服务器状态，enabled启用，disabled禁用</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AuthorizationServer build() {
                return new AuthorizationServer(this);
            } 

        } 

    }
}
