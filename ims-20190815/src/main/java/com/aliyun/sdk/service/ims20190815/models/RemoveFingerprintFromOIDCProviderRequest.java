// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveFingerprintFromOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>RemoveFingerprintFromOIDCProviderRequest</p>
 */
public class RemoveFingerprintFromOIDCProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
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
         * <p>The fingerprint that you want to remove.</p>
         * 
         * <strong>example:</strong>
         * <p>6938fd4d98bab03faadb97b34396831e3780****</p>
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
        public RemoveFingerprintFromOIDCProviderRequest build() {
            return new RemoveFingerprintFromOIDCProviderRequest(this);
        } 

    } 

}
