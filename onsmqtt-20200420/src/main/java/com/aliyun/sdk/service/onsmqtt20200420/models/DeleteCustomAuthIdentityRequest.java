// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomAuthIdentityRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomAuthIdentityRequest</p>
 */
public class DeleteCustomAuthIdentityRequest extends Request {
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
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private DeleteCustomAuthIdentityRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.identityType = builder.identityType;
        this.instanceId = builder.instanceId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomAuthIdentityRequest create() {
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
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<DeleteCustomAuthIdentityRequest, Builder> {
        private String clientId; 
        private String identityType; 
        private String instanceId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomAuthIdentityRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.identityType = request.identityType;
            this.instanceId = request.instanceId;
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
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public DeleteCustomAuthIdentityRequest build() {
            return new DeleteCustomAuthIdentityRequest(this);
        } 

    } 

}
