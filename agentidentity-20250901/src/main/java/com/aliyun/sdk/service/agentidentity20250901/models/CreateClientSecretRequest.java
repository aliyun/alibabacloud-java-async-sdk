// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreateClientSecretRequest} extends {@link RequestModel}
 *
 * <p>CreateClientSecretRequest</p>
 */
public class CreateClientSecretRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientName")
    private String clientName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private CreateClientSecretRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientSecretRequest create() {
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
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<CreateClientSecretRequest, Builder> {
        private String clientId; 
        private String clientName; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientSecretRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientName = request.clientName;
            this.userPoolName = request.userPoolName;
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
         * ClientName.
         */
        public Builder clientName(String clientName) {
            this.putBodyParameter("ClientName", clientName);
            this.clientName = clientName;
            return this;
        }

        /**
         * UserPoolName.
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public CreateClientSecretRequest build() {
            return new CreateClientSecretRequest(this);
        } 

    } 

}
