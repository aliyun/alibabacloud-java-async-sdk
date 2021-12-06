// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AddExternalSAMLIdPCertificateRequest} extends {@link RequestModel}
 *
 * <p>AddExternalSAMLIdPCertificateRequest</p>
 */
public class AddExternalSAMLIdPCertificateRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("X509Certificate")
    private String x509Certificate;


    private AddExternalSAMLIdPCertificateRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddExternalSAMLIdPCertificateRequest create() {
        return builder().build();
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return x509Certificate
     */
    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String x509Certificate; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>X509Certificate.</p>
         */
        public Builder x509Certificate(String x509Certificate) {
            this.putQueryParameter("X509Certificate", x509Certificate);
            this.x509Certificate = x509Certificate;
            return this;
        }

        public AddExternalSAMLIdPCertificateRequest build() {
            return new AddExternalSAMLIdPCertificateRequest(this);
        } 

    } 

}
