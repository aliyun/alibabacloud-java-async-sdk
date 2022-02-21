// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportCertificateRequest} extends {@link RequestModel}
 *
 * <p>ImportCertificateRequest</p>
 */
public class ImportCertificateRequest extends Request {
    @Query
    @NameInMap("PKCS12Blob")
    @Validation(required = true)
    private String PKCS12Blob;

    @Query
    @NameInMap("Passphrase")
    @Validation(required = true)
    private String passphrase;

    private ImportCertificateRequest(Builder builder) {
        super(builder);
        this.PKCS12Blob = builder.PKCS12Blob;
        this.passphrase = builder.passphrase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return PKCS12Blob
     */
    public String getPKCS12Blob() {
        return this.PKCS12Blob;
    }

    /**
     * @return passphrase
     */
    public String getPassphrase() {
        return this.passphrase;
    }

    public static final class Builder extends Request.Builder<ImportCertificateRequest, Builder> {
        private String PKCS12Blob; 
        private String passphrase; 

        private Builder() {
            super();
        } 

        private Builder(ImportCertificateRequest response) {
            super(response);
            this.PKCS12Blob = response.PKCS12Blob;
            this.passphrase = response.passphrase;
        } 

        /**
         * PKCS12Blob.
         */
        public Builder PKCS12Blob(String PKCS12Blob) {
            this.putQueryParameter("PKCS12Blob", PKCS12Blob);
            this.PKCS12Blob = PKCS12Blob;
            return this;
        }

        /**
         * Passphrase.
         */
        public Builder passphrase(String passphrase) {
            this.putQueryParameter("Passphrase", passphrase);
            this.passphrase = passphrase;
            return this;
        }

        @Override
        public ImportCertificateRequest build() {
            return new ImportCertificateRequest(this);
        } 

    } 

}
