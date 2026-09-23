// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
         * <p>The client ID to remove.</p>
         * <p>Format: letters, digits, and the special characters <code>.-_:/</code> are allowed. The value cannot start with the special characters <code>.-_:/</code>.</p>
         * <p>Length: up to 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>498469743454717****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The name of an existing OIDC IdP that has the target <code>ClientId</code> attached. If you have not created or attached one, call <code>CreateOIDCProvider</code> (with <code>ClientIds</code> specified) or <code>AddClientIdToOIDCProvider</code> first.</p>
         * 
         * <strong>example:</strong>
         * <p>TestOIDCProvider</p>
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
