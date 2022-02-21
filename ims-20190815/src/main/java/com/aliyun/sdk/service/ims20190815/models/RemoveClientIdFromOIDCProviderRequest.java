// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveClientIdFromOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>RemoveClientIdFromOIDCProviderRequest</p>
 */
public class RemoveClientIdFromOIDCProviderRequest extends Request {
    @Query
    @NameInMap("ClientId")
    private String clientId;

    @Query
    @NameInMap("OIDCProviderName")
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

        private Builder(RemoveClientIdFromOIDCProviderRequest response) {
            super(response);
            this.clientId = response.clientId;
            this.OIDCProviderName = response.OIDCProviderName;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * OIDCProviderName.
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
