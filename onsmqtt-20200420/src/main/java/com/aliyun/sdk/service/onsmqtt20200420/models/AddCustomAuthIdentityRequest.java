// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link AddCustomAuthIdentityRequest} extends {@link RequestModel}
 *
 * <p>AddCustomAuthIdentityRequest</p>
 */
public class AddCustomAuthIdentityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Secret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secret;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SignMode")
    private String signMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private AddCustomAuthIdentityRequest(Builder builder) {
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

    public static AddCustomAuthIdentityRequest create() {
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

    public static final class Builder extends Request.Builder<AddCustomAuthIdentityRequest, Builder> {
        private String clientId; 
        private String identityType; 
        private String instanceId; 
        private String secret; 
        private String signMode; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(AddCustomAuthIdentityRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.identityType = request.identityType;
            this.instanceId = request.instanceId;
            this.secret = request.secret;
            this.signMode = request.signMode;
            this.username = request.username;
        } 

        /**
         * <p>The client ID if you set IdentityType to CLIENT.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test@@@test</p>
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The identity type. Valid values: USER and CLIENT.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder identityType(String identityType) {
            this.putBodyParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * <p>The ID of the Message Queue for MQTT instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The AccessKey secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder secret(String secret) {
            this.putBodyParameter("Secret", secret);
            this.secret = secret;
            return this;
        }

        /**
         * <p>The signature verification mode. ORIGIN: compares the password and the AccessKey secret. SIGNED: uses the HMAC_SHA1 algorithm to sign the client ID to obtain a password and then compares the password.</p>
         * 
         * <strong>example:</strong>
         * <p>SIGNED</p>
         */
        public Builder signMode(String signMode) {
            this.putBodyParameter("SignMode", signMode);
            this.signMode = signMode;
            return this;
        }

        /**
         * <p>The username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public AddCustomAuthIdentityRequest build() {
            return new AddCustomAuthIdentityRequest(this);
        } 

    } 

}
