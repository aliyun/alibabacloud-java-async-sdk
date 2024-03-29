// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyUserAuthenticationRequest} extends {@link RequestModel}
 *
 * <p>VerifyUserAuthenticationRequest</p>
 */
public class VerifyUserAuthenticationRequest extends Request {
    @Query
    @NameInMap("ApplicationExternalId")
    @Validation(required = true, maxLength = 64)
    private String applicationExternalId;

    @Query
    @NameInMap("AuthenticationContext")
    @Validation(required = true)
    private String authenticationContext;

    @Query
    @NameInMap("AuthenticatorType")
    @Validation(required = true, maxLength = 32)
    private String authenticatorType;

    @Query
    @NameInMap("ClientExtendParamsJson")
    private String clientExtendParamsJson;

    @Query
    @NameInMap("ClientExtendParamsJsonSign")
    private String clientExtendParamsJsonSign;

    @Query
    @NameInMap("LogParams")
    private String logParams;

    @Query
    @NameInMap("LogTag")
    private String logTag;

    @Query
    @NameInMap("RequireBindHashBase64")
    private String requireBindHashBase64;

    @Query
    @NameInMap("RequireChallengeBase64")
    private String requireChallengeBase64;

    @Query
    @NameInMap("ServerExtendParamsJson")
    private String serverExtendParamsJson;

    @Query
    @NameInMap("UserId")
    @Validation(required = true, maxLength = 64)
    private String userId;

    @Query
    @NameInMap("UserSourceIp")
    private String userSourceIp;

    private VerifyUserAuthenticationRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticationContext = builder.authenticationContext;
        this.authenticatorType = builder.authenticatorType;
        this.clientExtendParamsJson = builder.clientExtendParamsJson;
        this.clientExtendParamsJsonSign = builder.clientExtendParamsJsonSign;
        this.logParams = builder.logParams;
        this.logTag = builder.logTag;
        this.requireBindHashBase64 = builder.requireBindHashBase64;
        this.requireChallengeBase64 = builder.requireChallengeBase64;
        this.serverExtendParamsJson = builder.serverExtendParamsJson;
        this.userId = builder.userId;
        this.userSourceIp = builder.userSourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyUserAuthenticationRequest create() {
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
     * @return authenticationContext
     */
    public String getAuthenticationContext() {
        return this.authenticationContext;
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
     * @return logTag
     */
    public String getLogTag() {
        return this.logTag;
    }

    /**
     * @return requireBindHashBase64
     */
    public String getRequireBindHashBase64() {
        return this.requireBindHashBase64;
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

    public static final class Builder extends Request.Builder<VerifyUserAuthenticationRequest, Builder> {
        private String applicationExternalId; 
        private String authenticationContext; 
        private String authenticatorType; 
        private String clientExtendParamsJson; 
        private String clientExtendParamsJsonSign; 
        private String logParams; 
        private String logTag; 
        private String requireBindHashBase64; 
        private String requireChallengeBase64; 
        private String serverExtendParamsJson; 
        private String userId; 
        private String userSourceIp; 

        private Builder() {
            super();
        } 

        private Builder(VerifyUserAuthenticationRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.authenticationContext = request.authenticationContext;
            this.authenticatorType = request.authenticatorType;
            this.clientExtendParamsJson = request.clientExtendParamsJson;
            this.clientExtendParamsJsonSign = request.clientExtendParamsJsonSign;
            this.logParams = request.logParams;
            this.logTag = request.logTag;
            this.requireBindHashBase64 = request.requireBindHashBase64;
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
         * AuthenticationContext.
         */
        public Builder authenticationContext(String authenticationContext) {
            this.putQueryParameter("AuthenticationContext", authenticationContext);
            this.authenticationContext = authenticationContext;
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
         * LogTag.
         */
        public Builder logTag(String logTag) {
            this.putQueryParameter("LogTag", logTag);
            this.logTag = logTag;
            return this;
        }

        /**
         * RequireBindHashBase64.
         */
        public Builder requireBindHashBase64(String requireBindHashBase64) {
            this.putQueryParameter("RequireBindHashBase64", requireBindHashBase64);
            this.requireBindHashBase64 = requireBindHashBase64;
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
        public VerifyUserAuthenticationRequest build() {
            return new VerifyUserAuthenticationRequest(this);
        } 

    } 

}
