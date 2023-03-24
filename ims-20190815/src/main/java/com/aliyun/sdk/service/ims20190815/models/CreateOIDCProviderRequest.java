// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateOIDCProviderRequest</p>
 */
public class CreateOIDCProviderRequest extends Request {
    @Query
    @NameInMap("ClientIds")
    private String clientIds;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Fingerprints")
    private String fingerprints;

    @Query
    @NameInMap("IssuerUrl")
    private String issuerUrl;

    @Query
    @NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private CreateOIDCProviderRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.description = builder.description;
        this.fingerprints = builder.fingerprints;
        this.issuerUrl = builder.issuerUrl;
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOIDCProviderRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fingerprints
     */
    public String getFingerprints() {
        return this.fingerprints;
    }

    /**
     * @return issuerUrl
     */
    public String getIssuerUrl() {
        return this.issuerUrl;
    }

    /**
     * @return OIDCProviderName
     */
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

    public static final class Builder extends Request.Builder<CreateOIDCProviderRequest, Builder> {
        private String clientIds; 
        private String description; 
        private String fingerprints; 
        private String issuerUrl; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(CreateOIDCProviderRequest request) {
            super(request);
            this.clientIds = request.clientIds;
            this.description = request.description;
            this.fingerprints = request.fingerprints;
            this.issuerUrl = request.issuerUrl;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * The ID of the client, which is provided by the external IdP Okta. If you want to specify multiple client IDs, separate the client IDs with commas (,).
         * <p>
         * 
         * The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are `periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)`.``
         * 
         * The client ID can be up to 64 characters in length.
         */
        public Builder clientIds(String clientIds) {
            this.putQueryParameter("ClientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * The description of the OIDC IdP.
         * <p>
         * 
         * The description can be up to 256 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The fingerprint of the HTTPS certificate, which is provided by the external IdP Okta. If you want to specify multiple fingerprints, separate the fingerprints with commas (,).
         * <p>
         * 
         * The fingerprint can contain letters and digits.
         * 
         * The fingerprint can be up to 40 characters in length.
         */
        public Builder fingerprints(String fingerprints) {
            this.putQueryParameter("Fingerprints", fingerprints);
            this.fingerprints = fingerprints;
            return this;
        }

        /**
         * The URL of the issuer, which is provided by the external IdP Okta. The URL of the issuer must be unique within an Alibaba Cloud account.
         * <p>
         * 
         * The URL of the issuer must start with `https` and be in the valid URL format. The URL cannot contain query parameters that follow a question mark (`?`) or logon information that is identified by at signs (`@`). The URL cannot be a fragment URL that contains number signs (`#`).
         * 
         * The URL can be up to 255 characters in length.
         */
        public Builder issuerUrl(String issuerUrl) {
            this.putQueryParameter("IssuerUrl", issuerUrl);
            this.issuerUrl = issuerUrl;
            return this;
        }

        /**
         * The name of the OIDC IdP.
         * <p>
         * 
         * The name can contain letters, digits, and special characters and cannot start or end with the special characters. The special characters are `periods, (.), hyphens (-), and underscores (_)`.
         * 
         * The name can be up to 128 characters in length.
         */
        public Builder OIDCProviderName(String OIDCProviderName) {
            this.putQueryParameter("OIDCProviderName", OIDCProviderName);
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }

        @Override
        public CreateOIDCProviderRequest build() {
            return new CreateOIDCProviderRequest(this);
        } 

    } 

}
