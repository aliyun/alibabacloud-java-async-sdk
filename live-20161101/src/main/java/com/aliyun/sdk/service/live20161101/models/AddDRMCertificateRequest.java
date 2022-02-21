// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDRMCertificateRequest} extends {@link RequestModel}
 *
 * <p>AddDRMCertificateRequest</p>
 */
public class AddDRMCertificateRequest extends Request {
    @Query
    @NameInMap("Ask")
    @Validation(required = true)
    private String ask;

    @Query
    @NameInMap("CertName")
    @Validation(required = true)
    private String certName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Passphrase")
    @Validation(required = true)
    private String passphrase;

    @Query
    @NameInMap("PrivateKey")
    @Validation(required = true)
    private String privateKey;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ServCert")
    @Validation(required = true)
    private String servCert;

    private AddDRMCertificateRequest(Builder builder) {
        super(builder);
        this.ask = builder.ask;
        this.certName = builder.certName;
        this.description = builder.description;
        this.ownerId = builder.ownerId;
        this.passphrase = builder.passphrase;
        this.privateKey = builder.privateKey;
        this.regionId = builder.regionId;
        this.servCert = builder.servCert;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDRMCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ask
     */
    public String getAsk() {
        return this.ask;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return passphrase
     */
    public String getPassphrase() {
        return this.passphrase;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return servCert
     */
    public String getServCert() {
        return this.servCert;
    }

    public static final class Builder extends Request.Builder<AddDRMCertificateRequest, Builder> {
        private String ask; 
        private String certName; 
        private String description; 
        private Long ownerId; 
        private String passphrase; 
        private String privateKey; 
        private String regionId; 
        private String servCert; 

        private Builder() {
            super();
        } 

        private Builder(AddDRMCertificateRequest response) {
            super(response);
            this.ask = response.ask;
            this.certName = response.certName;
            this.description = response.description;
            this.ownerId = response.ownerId;
            this.passphrase = response.passphrase;
            this.privateKey = response.privateKey;
            this.regionId = response.regionId;
            this.servCert = response.servCert;
        } 

        /**
         * Ask.
         */
        public Builder ask(String ask) {
            this.putQueryParameter("Ask", ask);
            this.ask = ask;
            return this;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * Passphrase.
         */
        public Builder passphrase(String passphrase) {
            this.putQueryParameter("Passphrase", passphrase);
            this.passphrase = passphrase;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServCert.
         */
        public Builder servCert(String servCert) {
            this.putQueryParameter("ServCert", servCert);
            this.servCert = servCert;
            return this;
        }

        @Override
        public AddDRMCertificateRequest build() {
            return new AddDRMCertificateRequest(this);
        } 

    } 

}
