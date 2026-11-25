// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyApplicationSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyApplicationSSLRequest</p>
 */
public class ModifyApplicationSSLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaPem")
    private String caPem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertPem")
    private String certPem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPem")
    private String keyPem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SslEnabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean sslEnabled;

    private ModifyApplicationSSLRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.caPem = builder.caPem;
        this.certPem = builder.certPem;
        this.keyPem = builder.keyPem;
        this.sslEnabled = builder.sslEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationSSLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return caPem
     */
    public String getCaPem() {
        return this.caPem;
    }

    /**
     * @return certPem
     */
    public String getCertPem() {
        return this.certPem;
    }

    /**
     * @return keyPem
     */
    public String getKeyPem() {
        return this.keyPem;
    }

    /**
     * @return sslEnabled
     */
    public Boolean getSslEnabled() {
        return this.sslEnabled;
    }

    public static final class Builder extends Request.Builder<ModifyApplicationSSLRequest, Builder> {
        private String applicationId; 
        private String caPem; 
        private String certPem; 
        private String keyPem; 
        private Boolean sslEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApplicationSSLRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.caPem = request.caPem;
            this.certPem = request.certPem;
            this.keyPem = request.keyPem;
            this.sslEnabled = request.sslEnabled;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The server certificate chain in PEM format. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIICa
         * -----END CERTIFICATE-----</p>
         */
        public Builder caPem(String caPem) {
            this.putQueryParameter("CaPem", caPem);
            this.caPem = caPem;
            return this;
        }

        /**
         * <p>The server certificate in PEM format. Provide this parameter when you bring your own (BYO) certificate. The certificate must match the KeyPem parameter and override the instance connection domain name. This parameter is allowed only when CA SSL is enabled for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIICert
         * -----END CERTIFICATE-----</p>
         */
        public Builder certPem(String certPem) {
            this.putQueryParameter("CertPem", certPem);
            this.certPem = certPem;
            return this;
        }

        /**
         * <p>The server private key in PEM format. PKCS#1, PKCS#8, and EC SEC1 formats are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----
         * MIIKey
         * -----END PRIVATE KEY-----</p>
         */
        public Builder keyPem(String keyPem) {
            this.putQueryParameter("KeyPem", keyPem);
            this.keyPem = keyPem;
            return this;
        }

        /**
         * <p>Specifies whether SSL is enabled.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sslEnabled(Boolean sslEnabled) {
            this.putQueryParameter("SslEnabled", sslEnabled);
            this.sslEnabled = sslEnabled;
            return this;
        }

        @Override
        public ModifyApplicationSSLRequest build() {
            return new ModifyApplicationSSLRequest(this);
        } 

    } 

}
