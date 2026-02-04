// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link IntrospectAppInstanceTicketForPreviewResponseBody} extends {@link TeaModel}
 *
 * <p>IntrospectAppInstanceTicketForPreviewResponseBody</p>
 */
public class IntrospectAppInstanceTicketForPreviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private IntrospectAppInstanceTicketForPreviewResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntrospectAppInstanceTicketForPreviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(IntrospectAppInstanceTicketForPreviewResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public IntrospectAppInstanceTicketForPreviewResponseBody build() {
            return new IntrospectAppInstanceTicketForPreviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntrospectAppInstanceTicketForPreviewResponseBody} extends {@link TeaModel}
     *
     * <p>IntrospectAppInstanceTicketForPreviewResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokenExpiresAt")
        private String accessTokenExpiresAt;

        @com.aliyun.core.annotation.NameInMap("AccessTokenIssuedAt")
        private String accessTokenIssuedAt;

        @com.aliyun.core.annotation.NameInMap("AccessTokenValue")
        private String accessTokenValue;

        @com.aliyun.core.annotation.NameInMap("AliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("Attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("AuthorizationGrantType")
        private String authorizationGrantType;

        @com.aliyun.core.annotation.NameInMap("Bid")
        private String bid;

        @com.aliyun.core.annotation.NameInMap("ParentPk")
        private String parentPk;

        @com.aliyun.core.annotation.NameInMap("RefreshTokenExpiresAt")
        private String refreshTokenExpiresAt;

        @com.aliyun.core.annotation.NameInMap("RefreshTokenIssuedAt")
        private String refreshTokenIssuedAt;

        @com.aliyun.core.annotation.NameInMap("RefreshTokenValue")
        private String refreshTokenValue;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Module(Builder builder) {
            this.accessTokenExpiresAt = builder.accessTokenExpiresAt;
            this.accessTokenIssuedAt = builder.accessTokenIssuedAt;
            this.accessTokenValue = builder.accessTokenValue;
            this.aliyunPk = builder.aliyunPk;
            this.attributes = builder.attributes;
            this.authorizationGrantType = builder.authorizationGrantType;
            this.bid = builder.bid;
            this.parentPk = builder.parentPk;
            this.refreshTokenExpiresAt = builder.refreshTokenExpiresAt;
            this.refreshTokenIssuedAt = builder.refreshTokenIssuedAt;
            this.refreshTokenValue = builder.refreshTokenValue;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return accessTokenExpiresAt
         */
        public String getAccessTokenExpiresAt() {
            return this.accessTokenExpiresAt;
        }

        /**
         * @return accessTokenIssuedAt
         */
        public String getAccessTokenIssuedAt() {
            return this.accessTokenIssuedAt;
        }

        /**
         * @return accessTokenValue
         */
        public String getAccessTokenValue() {
            return this.accessTokenValue;
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return authorizationGrantType
         */
        public String getAuthorizationGrantType() {
            return this.authorizationGrantType;
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return parentPk
         */
        public String getParentPk() {
            return this.parentPk;
        }

        /**
         * @return refreshTokenExpiresAt
         */
        public String getRefreshTokenExpiresAt() {
            return this.refreshTokenExpiresAt;
        }

        /**
         * @return refreshTokenIssuedAt
         */
        public String getRefreshTokenIssuedAt() {
            return this.refreshTokenIssuedAt;
        }

        /**
         * @return refreshTokenValue
         */
        public String getRefreshTokenValue() {
            return this.refreshTokenValue;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String accessTokenExpiresAt; 
            private String accessTokenIssuedAt; 
            private String accessTokenValue; 
            private String aliyunPk; 
            private String attributes; 
            private String authorizationGrantType; 
            private String bid; 
            private String parentPk; 
            private String refreshTokenExpiresAt; 
            private String refreshTokenIssuedAt; 
            private String refreshTokenValue; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.accessTokenExpiresAt = model.accessTokenExpiresAt;
                this.accessTokenIssuedAt = model.accessTokenIssuedAt;
                this.accessTokenValue = model.accessTokenValue;
                this.aliyunPk = model.aliyunPk;
                this.attributes = model.attributes;
                this.authorizationGrantType = model.authorizationGrantType;
                this.bid = model.bid;
                this.parentPk = model.parentPk;
                this.refreshTokenExpiresAt = model.refreshTokenExpiresAt;
                this.refreshTokenIssuedAt = model.refreshTokenIssuedAt;
                this.refreshTokenValue = model.refreshTokenValue;
                this.uuid = model.uuid;
            } 

            /**
             * AccessTokenExpiresAt.
             */
            public Builder accessTokenExpiresAt(String accessTokenExpiresAt) {
                this.accessTokenExpiresAt = accessTokenExpiresAt;
                return this;
            }

            /**
             * AccessTokenIssuedAt.
             */
            public Builder accessTokenIssuedAt(String accessTokenIssuedAt) {
                this.accessTokenIssuedAt = accessTokenIssuedAt;
                return this;
            }

            /**
             * AccessTokenValue.
             */
            public Builder accessTokenValue(String accessTokenValue) {
                this.accessTokenValue = accessTokenValue;
                return this;
            }

            /**
             * <p>aliyunPk</p>
             * 
             * <strong>example:</strong>
             * <p>12343131221311</p>
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * Attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * AuthorizationGrantType.
             */
            public Builder authorizationGrantType(String authorizationGrantType) {
                this.authorizationGrantType = authorizationGrantType;
                return this;
            }

            /**
             * <p>bid</p>
             * 
             * <strong>example:</strong>
             * <p>123131</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * ParentPk.
             */
            public Builder parentPk(String parentPk) {
                this.parentPk = parentPk;
                return this;
            }

            /**
             * RefreshTokenExpiresAt.
             */
            public Builder refreshTokenExpiresAt(String refreshTokenExpiresAt) {
                this.refreshTokenExpiresAt = refreshTokenExpiresAt;
                return this;
            }

            /**
             * RefreshTokenIssuedAt.
             */
            public Builder refreshTokenIssuedAt(String refreshTokenIssuedAt) {
                this.refreshTokenIssuedAt = refreshTokenIssuedAt;
                return this;
            }

            /**
             * RefreshTokenValue.
             */
            public Builder refreshTokenValue(String refreshTokenValue) {
                this.refreshTokenValue = refreshTokenValue;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
