// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomAuthIdentityRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomAuthIdentityRequest</p>
 */
public class UpdateCustomAuthIdentityRequest extends Request {
    @Body
    @NameInMap("ClientId")
    private String clientId;

    @Body
    @NameInMap("IdentityType")
    @Validation(required = true)
    private String identityType;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Secret")
    @Validation(required = true)
    private String secret;

    @Body
    @NameInMap("SignMode")
    @Validation(required = true)
    private String signMode;

    @Body
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private UpdateCustomAuthIdentityRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.identityType = builder.identityType;
        this.instanceId = builder.instanceId;
        this.secret = builder.secret;
        this.signMode = builder.signMode;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomAuthIdentityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return this.secret;
    }

    /**
     * @return signMode
     */
    public String getSignMode() {
        return this.signMode;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<UpdateCustomAuthIdentityRequest, Builder> {
        private String clientId; 
        private String identityType; 
        private String instanceId; 
        private String secret; 
        private String signMode; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomAuthIdentityRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.identityType = request.identityType;
            this.instanceId = request.instanceId;
            this.secret = request.secret;
            this.signMode = request.signMode;
            this.username = request.username;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * IdentityType.
         */
        public Builder identityType(String identityType) {
            this.putBodyParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Secret.
         */
        public Builder secret(String secret) {
            this.putBodyParameter("Secret", secret);
            this.secret = secret;
            return this;
        }

        /**
         * SignMode.
         */
        public Builder signMode(String signMode) {
            this.putBodyParameter("SignMode", signMode);
            this.signMode = signMode;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public UpdateCustomAuthIdentityRequest build() {
            return new UpdateCustomAuthIdentityRequest(this);
        } 

    } 

}
