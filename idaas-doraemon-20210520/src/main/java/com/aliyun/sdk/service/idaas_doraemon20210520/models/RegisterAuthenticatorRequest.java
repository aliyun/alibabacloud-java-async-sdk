// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterAuthenticatorRequest} extends {@link RequestModel}
 *
 * <p>RegisterAuthenticatorRequest</p>
 */
public class RegisterAuthenticatorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationExternalId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticatorName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String authenticatorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticatorType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String authenticatorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientExtendParamsJson")
    private String clientExtendParamsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientExtendParamsJsonSign")
    private String clientExtendParamsJsonSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogParams")
    private String logParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrationContext")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 3096)
    private String registrationContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireChallengeBase64")
    private String requireChallengeBase64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerExtendParamsJson")
    private String serverExtendParamsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSourceIp")
    private String userSourceIp;

    private RegisterAuthenticatorRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticatorName = builder.authenticatorName;
        this.authenticatorType = builder.authenticatorType;
        this.clientExtendParamsJson = builder.clientExtendParamsJson;
        this.clientExtendParamsJsonSign = builder.clientExtendParamsJsonSign;
        this.logParams = builder.logParams;
        this.registrationContext = builder.registrationContext;
        this.requireChallengeBase64 = builder.requireChallengeBase64;
        this.serverExtendParamsJson = builder.serverExtendParamsJson;
        this.userId = builder.userId;
        this.userSourceIp = builder.userSourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterAuthenticatorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationExternalId
     */
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    /**
     * @return authenticatorName
     */
    public String getAuthenticatorName() {
        return this.authenticatorName;
    }

    /**
     * @return authenticatorType
     */
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    /**
     * @return clientExtendParamsJson
     */
    public String getClientExtendParamsJson() {
        return this.clientExtendParamsJson;
    }

    /**
     * @return clientExtendParamsJsonSign
     */
    public String getClientExtendParamsJsonSign() {
        return this.clientExtendParamsJsonSign;
    }

    /**
     * @return logParams
     */
    public String getLogParams() {
        return this.logParams;
    }

    /**
     * @return registrationContext
     */
    public String getRegistrationContext() {
        return this.registrationContext;
    }

    /**
     * @return requireChallengeBase64
     */
    public String getRequireChallengeBase64() {
        return this.requireChallengeBase64;
    }

    /**
     * @return serverExtendParamsJson
     */
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userSourceIp
     */
    public String getUserSourceIp() {
        return this.userSourceIp;
    }

    public static final class Builder extends Request.Builder<RegisterAuthenticatorRequest, Builder> {
        private String applicationExternalId; 
        private String authenticatorName; 
        private String authenticatorType; 
        private String clientExtendParamsJson; 
        private String clientExtendParamsJsonSign; 
        private String logParams; 
        private String registrationContext; 
        private String requireChallengeBase64; 
        private String serverExtendParamsJson; 
        private String userId; 
        private String userSourceIp; 

        private Builder() {
            super();
        } 

        private Builder(RegisterAuthenticatorRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.authenticatorName = request.authenticatorName;
            this.authenticatorType = request.authenticatorType;
            this.clientExtendParamsJson = request.clientExtendParamsJson;
            this.clientExtendParamsJsonSign = request.clientExtendParamsJsonSign;
            this.logParams = request.logParams;
            this.registrationContext = request.registrationContext;
            this.requireChallengeBase64 = request.requireChallengeBase64;
            this.serverExtendParamsJson = request.serverExtendParamsJson;
            this.userId = request.userId;
            this.userSourceIp = request.userSourceIp;
        } 

        /**
         * ApplicationExternalId.
         */
        public Builder applicationExternalId(String applicationExternalId) {
            this.putQueryParameter("ApplicationExternalId", applicationExternalId);
            this.applicationExternalId = applicationExternalId;
            return this;
        }

        /**
         * AuthenticatorName.
         */
        public Builder authenticatorName(String authenticatorName) {
            this.putQueryParameter("AuthenticatorName", authenticatorName);
            this.authenticatorName = authenticatorName;
            return this;
        }

        /**
         * AuthenticatorType.
         */
        public Builder authenticatorType(String authenticatorType) {
            this.putQueryParameter("AuthenticatorType", authenticatorType);
            this.authenticatorType = authenticatorType;
            return this;
        }

        /**
         * ClientExtendParamsJson.
         */
        public Builder clientExtendParamsJson(String clientExtendParamsJson) {
            this.putQueryParameter("ClientExtendParamsJson", clientExtendParamsJson);
            this.clientExtendParamsJson = clientExtendParamsJson;
            return this;
        }

        /**
         * ClientExtendParamsJsonSign.
         */
        public Builder clientExtendParamsJsonSign(String clientExtendParamsJsonSign) {
            this.putQueryParameter("ClientExtendParamsJsonSign", clientExtendParamsJsonSign);
            this.clientExtendParamsJsonSign = clientExtendParamsJsonSign;
            return this;
        }

        /**
         * LogParams.
         */
        public Builder logParams(String logParams) {
            this.putQueryParameter("LogParams", logParams);
            this.logParams = logParams;
            return this;
        }

        /**
         * RegistrationContext.
         */
        public Builder registrationContext(String registrationContext) {
            this.putQueryParameter("RegistrationContext", registrationContext);
            this.registrationContext = registrationContext;
            return this;
        }

        /**
         * RequireChallengeBase64.
         */
        public Builder requireChallengeBase64(String requireChallengeBase64) {
            this.putQueryParameter("RequireChallengeBase64", requireChallengeBase64);
            this.requireChallengeBase64 = requireChallengeBase64;
            return this;
        }

        /**
         * ServerExtendParamsJson.
         */
        public Builder serverExtendParamsJson(String serverExtendParamsJson) {
            this.putQueryParameter("ServerExtendParamsJson", serverExtendParamsJson);
            this.serverExtendParamsJson = serverExtendParamsJson;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserSourceIp.
         */
        public Builder userSourceIp(String userSourceIp) {
            this.putQueryParameter("UserSourceIp", userSourceIp);
            this.userSourceIp = userSourceIp;
            return this;
        }

        @Override
        public RegisterAuthenticatorRequest build() {
            return new RegisterAuthenticatorRequest(this);
        } 

    } 

}
