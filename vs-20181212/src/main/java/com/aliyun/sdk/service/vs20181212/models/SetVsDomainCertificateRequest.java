// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVsDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetVsDomainCertificateRequest</p>
 */
public class SetVsDomainCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceSet")
    private String forceSet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLPri")
    private String SSLPri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SSLProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLPub")
    private String SSLPub;

    private SetVsDomainCertificateRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.certType = builder.certType;
        this.domainName = builder.domainName;
        this.forceSet = builder.forceSet;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.SSLPri = builder.SSLPri;
        this.SSLProtocol = builder.SSLProtocol;
        this.SSLPub = builder.SSLPub;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVsDomainCertificateRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return forceSet
     */
    public String getForceSet() {
        return this.forceSet;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return SSLPri
     */
    public String getSSLPri() {
        return this.SSLPri;
    }

    /**
     * @return SSLProtocol
     */
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    /**
     * @return SSLPub
     */
    public String getSSLPub() {
        return this.SSLPub;
    }

    public static final class Builder extends Request.Builder<SetVsDomainCertificateRequest, Builder> {
        private String certName; 
        private String certType; 
        private String domainName; 
        private String forceSet; 
        private Long ownerId; 
        private String region; 
        private String SSLPri; 
        private String SSLProtocol; 
        private String SSLPub; 

        private Builder() {
            super();
        } 

        private Builder(SetVsDomainCertificateRequest request) {
            super(request);
            this.certName = request.certName;
            this.certType = request.certType;
            this.domainName = request.domainName;
            this.forceSet = request.forceSet;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.SSLPri = request.SSLPri;
            this.SSLProtocol = request.SSLProtocol;
            this.SSLPub = request.SSLPub;
        } 

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * CertType.
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * ForceSet.
         */
        public Builder forceSet(String forceSet) {
            this.putQueryParameter("ForceSet", forceSet);
            this.forceSet = forceSet;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * SSLPri.
         */
        public Builder SSLPri(String SSLPri) {
            this.putQueryParameter("SSLPri", SSLPri);
            this.SSLPri = SSLPri;
            return this;
        }

        /**
         * SSLProtocol.
         */
        public Builder SSLProtocol(String SSLProtocol) {
            this.putQueryParameter("SSLProtocol", SSLProtocol);
            this.SSLProtocol = SSLProtocol;
            return this;
        }

        /**
         * SSLPub.
         */
        public Builder SSLPub(String SSLPub) {
            this.putQueryParameter("SSLPub", SSLPub);
            this.SSLPub = SSLPub;
            return this;
        }

        @Override
        public SetVsDomainCertificateRequest build() {
            return new SetVsDomainCertificateRequest(this);
        } 

    } 

}
