// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveClientIdFromOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>RemoveClientIdFromOIDCProviderRequest</p>
 */
public class RemoveClientIdFromOIDCProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private RemoveClientIdFromOIDCProviderRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveClientIdFromOIDCProviderRequest create() {
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
     * @return OIDCProviderName
     */
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

    public static final class Builder extends Request.Builder<RemoveClientIdFromOIDCProviderRequest, Builder> {
        private String clientId; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveClientIdFromOIDCProviderRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * The client ID that you want to remove.
         * <p>
         * 
         * The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are `periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)`.``
         * 
         * The client ID can be up to 64 characters in length.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * The name of the OIDC IdP.
         */
        public Builder OIDCProviderName(String OIDCProviderName) {
            this.putQueryParameter("OIDCProviderName", OIDCProviderName);
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }

        @Override
        public RemoveClientIdFromOIDCProviderRequest build() {
            return new RemoveClientIdFromOIDCProviderRequest(this);
        } 

    } 

}
