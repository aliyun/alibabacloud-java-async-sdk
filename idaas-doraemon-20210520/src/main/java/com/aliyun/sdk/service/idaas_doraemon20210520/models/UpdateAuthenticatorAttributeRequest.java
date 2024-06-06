// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuthenticatorAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthenticatorAttributeRequest</p>
 */
public class UpdateAuthenticatorAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationExternalId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticatorName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authenticatorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticatorUuid")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authenticatorUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    private UpdateAuthenticatorAttributeRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.authenticatorName = builder.authenticatorName;
        this.authenticatorUuid = builder.authenticatorUuid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthenticatorAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateAuthenticatorAttributeRequest, Builder> {
        private String applicationExternalId; 
        private String authenticatorName; 
        private String authenticatorUuid; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthenticatorAttributeRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.authenticatorName = request.authenticatorName;
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
         * AuthenticatorName.
         */
        public Builder authenticatorName(String authenticatorName) {
            this.putQueryParameter("AuthenticatorName", authenticatorName);
            this.authenticatorName = authenticatorName;
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
        public UpdateAuthenticatorAttributeRequest build() {
            return new UpdateAuthenticatorAttributeRequest(this);
        } 

    } 

}
