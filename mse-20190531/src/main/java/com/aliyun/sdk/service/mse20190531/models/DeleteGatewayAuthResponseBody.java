// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link DeleteGatewayAuthResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGatewayAuthResponseBody</p>
 */
public class DeleteGatewayAuthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteGatewayAuthResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayAuthResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteGatewayAuthResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteGatewayAuthResponseBody build() {
            return new DeleteGatewayAuthResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteGatewayAuthResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteGatewayAuthResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("CookieDomain")
        private String cookieDomain;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsWhite")
        private Boolean isWhite;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Jwks")
        private String jwks;

        @com.aliyun.core.annotation.NameInMap("LoginUrl")
        private String loginUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RedirectUrl")
        private String redirectUrl;

        @com.aliyun.core.annotation.NameInMap("ScopesList")
        private java.util.List<String> scopesList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("TokenName")
        private String tokenName;

        @com.aliyun.core.annotation.NameInMap("TokenNamePrefix")
        private String tokenNamePrefix;

        @com.aliyun.core.annotation.NameInMap("TokenPass")
        private Boolean tokenPass;

        @com.aliyun.core.annotation.NameInMap("TokenPosition")
        private String tokenPosition;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.cookieDomain = builder.cookieDomain;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isWhite = builder.isWhite;
            this.issuer = builder.issuer;
            this.jwks = builder.jwks;
            this.loginUrl = builder.loginUrl;
            this.name = builder.name;
            this.redirectUrl = builder.redirectUrl;
            this.scopesList = builder.scopesList;
            this.status = builder.status;
            this.tokenName = builder.tokenName;
            this.tokenNamePrefix = builder.tokenNamePrefix;
            this.tokenPass = builder.tokenPass;
            this.tokenPosition = builder.tokenPosition;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        /**
         * @return cookieDomain
         */
        public String getCookieDomain() {
            return this.cookieDomain;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isWhite
         */
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return jwks
         */
        public String getJwks() {
            return this.jwks;
        }

        /**
         * @return loginUrl
         */
        public String getLoginUrl() {
            return this.loginUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return redirectUrl
         */
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        /**
         * @return scopesList
         */
        public java.util.List<String> getScopesList() {
            return this.scopesList;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        /**
         * @return tokenName
         */
        public String getTokenName() {
            return this.tokenName;
        }

        /**
         * @return tokenNamePrefix
         */
        public String getTokenNamePrefix() {
            return this.tokenNamePrefix;
        }

        /**
         * @return tokenPass
         */
        public Boolean getTokenPass() {
            return this.tokenPass;
        }

        /**
         * @return tokenPosition
         */
        public String getTokenPosition() {
            return this.tokenPosition;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clientId; 
            private String clientSecret; 
            private String cookieDomain; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean isWhite; 
            private String issuer; 
            private String jwks; 
            private String loginUrl; 
            private String name; 
            private String redirectUrl; 
            private java.util.List<String> scopesList; 
            private Boolean status; 
            private String tokenName; 
            private String tokenNamePrefix; 
            private Boolean tokenPass; 
            private String tokenPosition; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
                this.cookieDomain = model.cookieDomain;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.isWhite = model.isWhite;
                this.issuer = model.issuer;
                this.jwks = model.jwks;
                this.loginUrl = model.loginUrl;
                this.name = model.name;
                this.redirectUrl = model.redirectUrl;
                this.scopesList = model.scopesList;
                this.status = model.status;
                this.tokenName = model.tokenName;
                this.tokenNamePrefix = model.tokenNamePrefix;
                this.tokenPass = model.tokenPass;
                this.tokenPosition = model.tokenPosition;
                this.type = model.type;
            } 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientSecret.
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * CookieDomain.
             */
            public Builder cookieDomain(String cookieDomain) {
                this.cookieDomain = cookieDomain;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsWhite.
             */
            public Builder isWhite(Boolean isWhite) {
                this.isWhite = isWhite;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * Jwks.
             */
            public Builder jwks(String jwks) {
                this.jwks = jwks;
                return this;
            }

            /**
             * LoginUrl.
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RedirectUrl.
             */
            public Builder redirectUrl(String redirectUrl) {
                this.redirectUrl = redirectUrl;
                return this;
            }

            /**
             * ScopesList.
             */
            public Builder scopesList(java.util.List<String> scopesList) {
                this.scopesList = scopesList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * TokenName.
             */
            public Builder tokenName(String tokenName) {
                this.tokenName = tokenName;
                return this;
            }

            /**
             * TokenNamePrefix.
             */
            public Builder tokenNamePrefix(String tokenNamePrefix) {
                this.tokenNamePrefix = tokenNamePrefix;
                return this;
            }

            /**
             * TokenPass.
             */
            public Builder tokenPass(Boolean tokenPass) {
                this.tokenPass = tokenPass;
                return this;
            }

            /**
             * TokenPosition.
             */
            public Builder tokenPosition(String tokenPosition) {
                this.tokenPosition = tokenPosition;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
