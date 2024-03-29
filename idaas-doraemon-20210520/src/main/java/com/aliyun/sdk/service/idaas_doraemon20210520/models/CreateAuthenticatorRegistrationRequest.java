// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthenticatorRegistrationRequest} extends {@link RequestModel}
 *
 * <p>CreateAuthenticatorRegistrationRequest</p>
 */
public class CreateAuthenticatorRegistrationRequest extends Request {
    @Query
    @NameInMap("ApplicationExternalId")
    @Validation(required = true, maxLength = 64)
    private String applicationExternalId;

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
    @NameInMap("RegistrationContext")
    private String registrationContext;

    @Query
    @NameInMap("ServerExtendParamsJson")
    private String serverExtendParamsJson;

    @Query
    @NameInMap("UserDisplayName")
    @Validation(maxLength = 64)
    private String userDisplayName;

    @Query
    @NameInMap("UserId")
    @Validation(required = true, maxLength = 64)
    private String userId;

    @Query
    @NameInMap("UserName")
    @Validation(maxLength = 64)
    private String userName;

    private CreateAuthenticatorRegistrationRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticatorType = builder.authenticatorType;
        this.clientExtendParamsJson = builder.clientExtendParamsJson;
        this.clientExtendParamsJsonSign = builder.clientExtendParamsJsonSign;
        this.registrationContext = builder.registrationContext;
        this.serverExtendParamsJson = builder.serverExtendParamsJson;
        this.userDisplayName = builder.userDisplayName;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthenticatorRegistrationRequest create() {
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
     * @return registrationContext
     */
    public String getRegistrationContext() {
        return this.registrationContext;
    }

    /**
     * @return serverExtendParamsJson
     */
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    /**
     * @return userDisplayName
     */
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateAuthenticatorRegistrationRequest, Builder> {
        private String applicationExternalId; 
        private String authenticatorType; 
        private String clientExtendParamsJson; 
        private String clientExtendParamsJsonSign; 
        private String registrationContext; 
        private String serverExtendParamsJson; 
        private String userDisplayName; 
        private String userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuthenticatorRegistrationRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.authenticatorType = request.authenticatorType;
            this.clientExtendParamsJson = request.clientExtendParamsJson;
            this.clientExtendParamsJsonSign = request.clientExtendParamsJsonSign;
            this.registrationContext = request.registrationContext;
            this.serverExtendParamsJson = request.serverExtendParamsJson;
            this.userDisplayName = request.userDisplayName;
            this.userId = request.userId;
            this.userName = request.userName;
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
         * RegistrationContext.
         */
        public Builder registrationContext(String registrationContext) {
            this.putQueryParameter("RegistrationContext", registrationContext);
            this.registrationContext = registrationContext;
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
         * UserDisplayName.
         */
        public Builder userDisplayName(String userDisplayName) {
            this.putQueryParameter("UserDisplayName", userDisplayName);
            this.userDisplayName = userDisplayName;
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
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CreateAuthenticatorRegistrationRequest build() {
            return new CreateAuthenticatorRegistrationRequest(this);
        } 

    } 

}
