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
    @NameInMap("IssuanceLimitTime")
    private Long issuanceLimitTime;

    @Query
    @NameInMap("NewDescription")
    private String newDescription;

    @Query
    @NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private UpdateOIDCProviderRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.issuanceLimitTime = builder.issuanceLimitTime;
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
     * @return issuanceLimitTime
     */
    public Long getIssuanceLimitTime() {
        return this.issuanceLimitTime;
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
        private Long issuanceLimitTime; 
        private String newDescription; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOIDCProviderRequest request) {
            super(request);
            this.clientIds = request.clientIds;
            this.issuanceLimitTime = request.issuanceLimitTime;
            this.newDescription = request.newDescription;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * The ID of the client. If you want to specify multiple client IDs, separate the client IDs with commas (,).
         * <p>
         * 
         * The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are `periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)`.``
         * 
         * The client ID can be up to 64 characters in length.
         * 
         * > If you specify this parameter, all the client IDs of the OIDC IdP are replaced. If you need to only add or remove a client ID, call the AddClientIdToOIDCProvider or RemoveClientIdFromOIDCProvider operation. For more information, see [AddClientIdToOIDCProvider](~~332057~~) or [RemoveClientIdFromOIDCProvider](~~332058~~).
         */
        public Builder clientIds(String clientIds) {
            this.putQueryParameter("ClientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * The earliest time when an external IdP can issue an ID token. If the value of the iat field in the ID token is later than the current time, the request is rejected. Unit: hours. Valid values: 1 to 168.
         */
        public Builder issuanceLimitTime(Long issuanceLimitTime) {
            this.putQueryParameter("IssuanceLimitTime", issuanceLimitTime);
            this.issuanceLimitTime = issuanceLimitTime;
            return this;
        }

        /**
         * The description of the OIDC IdP.
         * <p>
         * 
         * The description can be up to 256 characters in length.
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
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
        public UpdateOIDCProviderRequest build() {
            return new UpdateOIDCProviderRequest(this);
        } 

    } 

}
