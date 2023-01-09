// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateOIDCProviderRequest</p>
 */
public class UpdateOIDCProviderRequest extends Request {
    @Query
    @NameInMap("ClientIds")
    private String clientIds;

    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private UpdateOIDCProviderRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.newDescription = builder.newDescription;
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOIDCProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIds
     */
    public String getClientIds() {
        return this.clientIds;
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    /**
     * @return OIDCProviderName
     */
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

    public static final class Builder extends Request.Builder<UpdateOIDCProviderRequest, Builder> {
        private String clientIds; 
        private String newDescription; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOIDCProviderRequest request) {
            super(request);
            this.clientIds = request.clientIds;
            this.newDescription = request.newDescription;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * ClientIds.
         */
        public Builder clientIds(String clientIds) {
            this.putQueryParameter("ClientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * NewDescription.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
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
        public UpdateOIDCProviderRequest build() {
            return new UpdateOIDCProviderRequest(this);
        } 

    } 

}
