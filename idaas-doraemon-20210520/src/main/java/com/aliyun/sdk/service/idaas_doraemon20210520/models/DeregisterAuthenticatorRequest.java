// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterAuthenticatorRequest} extends {@link RequestModel}
 *
 * <p>DeregisterAuthenticatorRequest</p>
 */
public class DeregisterAuthenticatorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationExternalId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticatorUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authenticatorUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    private DeregisterAuthenticatorRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticatorUuid = builder.authenticatorUuid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterAuthenticatorRequest create() {
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
     * @return authenticatorUuid
     */
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeregisterAuthenticatorRequest, Builder> {
        private String applicationExternalId; 
        private String authenticatorUuid; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeregisterAuthenticatorRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.authenticatorUuid = request.authenticatorUuid;
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
         * AuthenticatorUuid.
         */
        public Builder authenticatorUuid(String authenticatorUuid) {
            this.putQueryParameter("AuthenticatorUuid", authenticatorUuid);
            this.authenticatorUuid = authenticatorUuid;
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
        public DeregisterAuthenticatorRequest build() {
            return new DeregisterAuthenticatorRequest(this);
        } 

    } 

}
