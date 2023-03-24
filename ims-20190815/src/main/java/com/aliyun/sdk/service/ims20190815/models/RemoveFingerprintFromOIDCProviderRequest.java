// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveFingerprintFromOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>RemoveFingerprintFromOIDCProviderRequest</p>
 */
public class RemoveFingerprintFromOIDCProviderRequest extends Request {
    @Query
    @NameInMap("Fingerprint")
    private String fingerprint;

    @Query
    @NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private RemoveFingerprintFromOIDCProviderRequest(Builder builder) {
        super(builder);
        this.fingerprint = builder.fingerprint;
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveFingerprintFromOIDCProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return OIDCProviderName
     */
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

    public static final class Builder extends Request.Builder<RemoveFingerprintFromOIDCProviderRequest, Builder> {
        private String fingerprint; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveFingerprintFromOIDCProviderRequest request) {
            super(request);
            this.fingerprint = request.fingerprint;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * The fingerprint that you want to remove.
         */
        public Builder fingerprint(String fingerprint) {
            this.putQueryParameter("Fingerprint", fingerprint);
            this.fingerprint = fingerprint;
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
        public RemoveFingerprintFromOIDCProviderRequest build() {
            return new RemoveFingerprintFromOIDCProviderRequest(this);
        } 

    } 

}
