// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RemoveExternalSAMLIdPCertificateRequest} extends {@link RequestModel}
 *
 * <p>RemoveExternalSAMLIdPCertificateRequest</p>
 */
public class RemoveExternalSAMLIdPCertificateRequest extends Request {
    @Query
    @NameInMap("CertificateId")
    private String certificateId;

    @Query
    @NameInMap("DirectoryId")
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

    public static final class Builder extends Request.Builder {
        private String certificateId; 
        private String directoryId; 

        /**
         * <p>CertificateId.</p>
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        public RemoveExternalSAMLIdPCertificateRequest build() {
            return new RemoveExternalSAMLIdPCertificateRequest(this);
        } 

    } 

}
