// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportCertificateRequest} extends {@link RequestModel}
 *
 * <p>ExportCertificateRequest</p>
 */
public class ExportCertificateRequest extends Request {
    @Query
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    @Query
    @NameInMap("ExportFormat")
    private String exportFormat;

    @Query
    @NameInMap("Passphrase")
    @Validation(required = true)
    private String passphrase;

    private ExportCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.exportFormat = builder.exportFormat;
        this.passphrase = builder.passphrase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return exportFormat
     */
    public String getExportFormat() {
        return this.exportFormat;
    }

    /**
     * @return passphrase
     */
    public String getPassphrase() {
        return this.passphrase;
    }

    public static final class Builder extends Request.Builder<ExportCertificateRequest, Builder> {
        private String certificateId; 
        private String exportFormat; 
        private String passphrase; 

        private Builder() {
            super();
        } 

        private Builder(ExportCertificateRequest response) {
            super(response);
            this.certificateId = response.certificateId;
            this.exportFormat = response.exportFormat;
            this.passphrase = response.passphrase;
        } 

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * ExportFormat.
         */
        public Builder exportFormat(String exportFormat) {
            this.putQueryParameter("ExportFormat", exportFormat);
            this.exportFormat = exportFormat;
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
        public ExportCertificateRequest build() {
            return new ExportCertificateRequest(this);
        } 

    } 

}
