// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link SetAppDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetAppDomainCertificateRequest</p>
 */
public class SetAppDomainCertificateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateName")
    private String certificateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateType")
    private String certificateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKey")
    private String publicKey;

    private SetAppDomainCertificateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.certificateName = builder.certificateName;
        this.certificateType = builder.certificateType;
        this.domainName = builder.domainName;
        this.privateKey = builder.privateKey;
        this.publicKey = builder.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAppDomainCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return certificateName
     */
    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * @return certificateType
     */
    public String getCertificateType() {
        return this.certificateType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    public static final class Builder extends Request.Builder<SetAppDomainCertificateRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String certificateName; 
        private String certificateType; 
        private String domainName; 
        private String privateKey; 
        private String publicKey; 

        private Builder() {
            super();
        } 

        private Builder(SetAppDomainCertificateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.certificateName = request.certificateName;
            this.certificateType = request.certificateType;
            this.domainName = request.domainName;
            this.privateKey = request.privateKey;
            this.publicKey = request.publicKey;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CertificateName.
         */
        public Builder certificateName(String certificateName) {
            this.putQueryParameter("CertificateName", certificateName);
            this.certificateName = certificateName;
            return this;
        }

        /**
         * CertificateType.
         */
        public Builder certificateType(String certificateType) {
            this.putQueryParameter("CertificateType", certificateType);
            this.certificateType = certificateType;
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
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.putQueryParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        @Override
        public SetAppDomainCertificateRequest build() {
            return new SetAppDomainCertificateRequest(this);
        } 

    } 

}
