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
 * {@link DeleteClientSecretRequest} extends {@link RequestModel}
 *
 * <p>DeleteClientSecretRequest</p>
 */
public class DeleteClientSecretRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientName")
    private String clientName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientSecretId")
    private String clientSecretId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private DeleteClientSecretRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
        this.clientSecretId = builder.clientSecretId;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClientSecretRequest create() {
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
     * @return clientSecretId
     */
    public String getClientSecretId() {
        return this.clientSecretId;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<DeleteClientSecretRequest, Builder> {
        private String clientId; 
        private String clientName; 
        private String clientSecretId; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClientSecretRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientName = request.clientName;
            this.clientSecretId = request.clientSecretId;
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
         * ClientSecretId.
         */
        public Builder clientSecretId(String clientSecretId) {
            this.putBodyParameter("ClientSecretId", clientSecretId);
            this.clientSecretId = clientSecretId;
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
        public DeleteClientSecretRequest build() {
            return new DeleteClientSecretRequest(this);
        } 

    } 

}
