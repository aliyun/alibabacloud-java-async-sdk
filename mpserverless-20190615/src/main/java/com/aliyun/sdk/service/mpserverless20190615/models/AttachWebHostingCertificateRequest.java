// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachWebHostingCertificateRequest} extends {@link RequestModel}
 *
 * <p>AttachWebHostingCertificateRequest</p>
 */
public class AttachWebHostingCertificateRequest extends Request {
    @Body
    @NameInMap("CertName")
    private String certName;

    @Body
    @NameInMap("CertType")
    @Validation(required = true)
    private String certType;

    @Body
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Body
    @NameInMap("PrivateKey")
    @Validation(required = true)
    private String privateKey;

    @Body
    @NameInMap("ServerCertificate")
    @Validation(required = true)
    private String serverCertificate;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private AttachWebHostingCertificateRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.certType = builder.certType;
        this.domain = builder.domain;
        this.privateKey = builder.privateKey;
        this.serverCertificate = builder.serverCertificate;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachWebHostingCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return serverCertificate
     */
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<AttachWebHostingCertificateRequest, Builder> {
        private String certName; 
        private String certType; 
        private String domain; 
        private String privateKey; 
        private String serverCertificate; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(AttachWebHostingCertificateRequest request) {
            super(request);
            this.certName = request.certName;
            this.certType = request.certType;
            this.domain = request.domain;
            this.privateKey = request.privateKey;
            this.serverCertificate = request.serverCertificate;
            this.spaceId = request.spaceId;
        } 

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putBodyParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * CertType.
         */
        public Builder certType(String certType) {
            this.putBodyParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.putBodyParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * ServerCertificate.
         */
        public Builder serverCertificate(String serverCertificate) {
            this.putBodyParameter("ServerCertificate", serverCertificate);
            this.serverCertificate = serverCertificate;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public AttachWebHostingCertificateRequest build() {
            return new AttachWebHostingCertificateRequest(this);
        } 

    } 

}
