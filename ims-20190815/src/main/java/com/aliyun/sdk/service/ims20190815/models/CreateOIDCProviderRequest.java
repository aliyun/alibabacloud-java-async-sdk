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
         * ClientIds.
         */
        public Builder clientIds(String clientIds) {
            this.putQueryParameter("ClientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Fingerprints.
         */
        public Builder fingerprints(String fingerprints) {
            this.putQueryParameter("Fingerprints", fingerprints);
            this.fingerprints = fingerprints;
            return this;
        }

        /**
         * IssuerUrl.
         */
        public Builder issuerUrl(String issuerUrl) {
            this.putQueryParameter("IssuerUrl", issuerUrl);
            this.issuerUrl = issuerUrl;
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
        public CreateOIDCProviderRequest build() {
            return new CreateOIDCProviderRequest(this);
        } 

    } 

}
