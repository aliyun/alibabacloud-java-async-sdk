// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddFingerprintToOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>AddFingerprintToOIDCProviderRequest</p>
 */
public class AddFingerprintToOIDCProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private AddFingerprintToOIDCProviderRequest(Builder builder) {
        super(builder);
        this.fingerprint = builder.fingerprint;
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFingerprintToOIDCProviderRequest create() {
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

    public static final class Builder extends Request.Builder<AddFingerprintToOIDCProviderRequest, Builder> {
        private String fingerprint; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(AddFingerprintToOIDCProviderRequest request) {
            super(request);
            this.fingerprint = request.fingerprint;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * <p>The fingerprint of the HTTPS certificate.</p>
         * <p>The fingerprint can contain letters and digits.</p>
         * <p>The fingerprint can be up to 40 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>902ef2deeb3c5b13ea4c3d5193629309e231****</p>
         */
        public Builder fingerprint(String fingerprint) {
            this.putQueryParameter("Fingerprint", fingerprint);
            this.fingerprint = fingerprint;
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
        public AddFingerprintToOIDCProviderRequest build() {
            return new AddFingerprintToOIDCProviderRequest(this);
        } 

    } 

}
