// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthenticatorRequest} extends {@link RequestModel}
 *
 * <p>GetAuthenticatorRequest</p>
 */
public class GetAuthenticatorRequest extends Request {
    @Query
    @NameInMap("ApplicationExternalId")
    @Validation(required = true, maxLength = 64)
    private String applicationExternalId;

    @Query
    @NameInMap("AuthenticatorUuid")
    @Validation(required = true, maxLength = 64)
    private String authenticatorUuid;

    @Query
    @NameInMap("UserId")
    @Validation(required = true, maxLength = 64)
    private String userId;

    private GetAuthenticatorRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticatorUuid = builder.authenticatorUuid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthenticatorRequest create() {
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

    public static final class Builder extends Request.Builder<GetAuthenticatorRequest, Builder> {
        private String applicationExternalId; 
        private String authenticatorUuid; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthenticatorRequest request) {
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
        public GetAuthenticatorRequest build() {
            return new GetAuthenticatorRequest(this);
        } 

    } 

}
