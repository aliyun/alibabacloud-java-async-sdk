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
 * {@link AddClientIdToOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>AddClientIdToOIDCProviderRequest</p>
 */
public class AddClientIdToOIDCProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private AddClientIdToOIDCProviderRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClientIdToOIDCProviderRequest create() {
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

    public static final class Builder extends Request.Builder<AddClientIdToOIDCProviderRequest, Builder> {
        private String clientId; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(AddClientIdToOIDCProviderRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * <p>The client ID that you want to add.</p>
         * <p>The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are periods (.), hyphens (-), underscores (_), colons (:), and forward slashes (/). </p>
         * <p>The client ID can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>598469743454717****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The name of the OIDC IdP.</p>
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
        public AddClientIdToOIDCProviderRequest build() {
            return new AddClientIdToOIDCProviderRequest(this);
        } 

    } 

}
