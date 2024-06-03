// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveExternalSAMLIdPCertificateRequest} extends {@link RequestModel}
 *
 * <p>RemoveExternalSAMLIdPCertificateRequest</p>
 */
public class RemoveExternalSAMLIdPCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    private RemoveExternalSAMLIdPCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveExternalSAMLIdPCertificateRequest create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder<RemoveExternalSAMLIdPCertificateRequest, Builder> {
        private String certificateId; 
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveExternalSAMLIdPCertificateRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.directoryId = request.directoryId;
        } 

        /**
         * The ID of the certificate.
         * <p>
         * 
         * You can call the [ListExternalSAMLIdPCertificates](~~341629~~) operation to query the IDs of certificates.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public RemoveExternalSAMLIdPCertificateRequest build() {
            return new RemoveExternalSAMLIdPCertificateRequest(this);
        } 

    } 

}
