// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserAuthenticateOptionsRequest} extends {@link RequestModel}
 *
 * <p>CreateUserAuthenticateOptionsRequest</p>
 */
public class CreateUserAuthenticateOptionsRequest extends Request {
    @Query
    @NameInMap("ApplicationExternalId")
    @Validation(required = true, maxLength = 64)
    private String applicationExternalId;

    @Query
    @NameInMap("AuthenticatorType")
    @Validation(required = true, maxLength = 32)
    private String authenticatorType;

    @Query
    @NameInMap("BindHashBase64")
    @Validation(maxLength = 64)
    private String bindHashBase64;

    @Query
    @NameInMap("ClientExtendParamsJson")
    private String clientExtendParamsJson;

    @Query
    @NameInMap("ClientExtendParamsJsonSign")
    private String clientExtendParamsJsonSign;

    @Query
    @NameInMap("ServerExtendParamsJson")
    private String serverExtendParamsJson;

    @Query
    @NameInMap("UserId")
    @Validation(required = true, maxLength = 64)
    private String userId;

    private CreateUserAuthenticateOptionsRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticatorType = builder.authenticatorType;
        this.bindHashBase64 = builder.bindHashBase64;
        this.clientExtendParamsJson = builder.clientExtendParamsJson;
        this.clientExtendParamsJsonSign = builder.clientExtendParamsJsonSign;
        this.serverExtendParamsJson = builder.serverExtendParamsJson;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserAuthenticateOptionsRequest create() {
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
     * @return bindHashBase64
     */
    public String getBindHashBase64() {
        return this.bindHashBase64;
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

    public static final class Builder extends Request.Builder<CreateUserAuthenticateOptionsRequest, Builder> {
        private String applicationExternalId; 
        private String authenticatorType; 
        private String bindHashBase64; 
        private String clientExtendParamsJson; 
        private String clientExtendParamsJsonSign; 
        private String serverExtendParamsJson; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserAuthenticateOptionsRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.authenticatorType = request.authenticatorType;
            this.bindHashBase64 = request.bindHashBase64;
            this.clientExtendParamsJson = request.clientExtendParamsJson;
            this.clientExtendParamsJsonSign = request.clientExtendParamsJsonSign;
            this.serverExtendParamsJson = request.serverExtendParamsJson;
            this.userId = request.userId;
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
         * BindHashBase64.
         */
        public Builder bindHashBase64(String bindHashBase64) {
            this.putQueryParameter("BindHashBase64", bindHashBase64);
            this.bindHashBase64 = bindHashBase64;
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

        @Override
        public CreateUserAuthenticateOptionsRequest build() {
            return new CreateUserAuthenticateOptionsRequest(this);
        } 

    } 

}
