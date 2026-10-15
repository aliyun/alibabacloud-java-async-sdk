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
 * {@link RefreshAppInstanceTicketResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshAppInstanceTicketResponseBody</p>
 */
public class RefreshAppInstanceTicketResponseBody extends TeaModel {
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

    private RefreshAppInstanceTicketResponseBody(Builder builder) {
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

    public static RefreshAppInstanceTicketResponseBody create() {
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

        private Builder(RefreshAppInstanceTicketResponseBody model) {
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
         * <p>The detailed reason why access is denied.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retry is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>mar</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> response parameter.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error parameters returned.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The application module.</p>
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The exception message.</p>
         * 
         * <strong>example:</strong>
         * <p>系统异常</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public RefreshAppInstanceTicketResponseBody build() {
            return new RefreshAppInstanceTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefreshAppInstanceTicketResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshAppInstanceTicketResponseBody</p>
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
             * <p>The time when the access token expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T22:30:00+08:00</p>
             */
            public Builder accessTokenExpiresAt(String accessTokenExpiresAt) {
                this.accessTokenExpiresAt = accessTokenExpiresAt;
                return this;
            }

            /**
             * <p>The time when the access token was issued.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T22:30:00+08:00</p>
             */
            public Builder accessTokenIssuedAt(String accessTokenIssuedAt) {
                this.accessTokenIssuedAt = accessTokenIssuedAt;
                return this;
            }

            /**
             * <p>The access token value.</p>
             * 
             * <strong>example:</strong>
             * <p>2108341e17661121129745384e79f9</p>
             */
            public Builder accessTokenValue(String accessTokenValue) {
                this.accessTokenValue = accessTokenValue;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1907880872137014</p>
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * <p>The extended properties.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The authorization code type.</p>
             * 
             * <strong>example:</strong>
             * <p>authorization_code</p>
             */
            public Builder authorizationGrantType(String authorizationGrantType) {
                this.authorizationGrantType = authorizationGrantType;
                return this;
            }

            /**
             * <p>bid</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1907880872137014</p>
             */
            public Builder parentPk(String parentPk) {
                this.parentPk = parentPk;
                return this;
            }

            /**
             * <p>The time when the refresh token expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T22:30:00+08:00</p>
             */
            public Builder refreshTokenExpiresAt(String refreshTokenExpiresAt) {
                this.refreshTokenExpiresAt = refreshTokenExpiresAt;
                return this;
            }

            /**
             * <p>The time when the refresh token was issued.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T22:30:00+08:00</p>
             */
            public Builder refreshTokenIssuedAt(String refreshTokenIssuedAt) {
                this.refreshTokenIssuedAt = refreshTokenIssuedAt;
                return this;
            }

            /**
             * <p>The refresh token value.</p>
             * 
             * <strong>example:</strong>
             * <p>2108341e17661121129745384e79f9</p>
             */
            public Builder refreshTokenValue(String refreshTokenValue) {
                this.refreshTokenValue = refreshTokenValue;
                return this;
            }

            /**
             * <p>The external unique identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>357504C7F21FCAE502756332ECE8B533</p>
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
