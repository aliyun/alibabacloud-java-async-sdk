// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link RegistDRMCertInfoRequest} extends {@link RequestModel}
 *
 * <p>RegistDRMCertInfoRequest</p>
 */
public class RegistDRMCertInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ask")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PassPhrase")
    @com.aliyun.core.annotation.Validation(required = true)
    private String passPhrase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRealOwnerId")
    @com.aliyun.core.annotation.Validation()
    private Long resourceRealOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServCert")
    @com.aliyun.core.annotation.Validation(required = true)
    private String servCert;

    private RegistDRMCertInfoRequest(Builder builder) {
        super(builder);
        this.ask = builder.ask;
        this.certName = builder.certName;
        this.description = builder.description;
        this.ownerId = builder.ownerId;
        this.passPhrase = builder.passPhrase;
        this.privateKey = builder.privateKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceRealOwnerId = builder.resourceRealOwnerId;
        this.servCert = builder.servCert;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistDRMCertInfoRequest create() {
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
     * @return passPhrase
     */
    public String getPassPhrase() {
        return this.passPhrase;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceRealOwnerId
     */
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    /**
     * @return servCert
     */
    public String getServCert() {
        return this.servCert;
    }

    public static final class Builder extends Request.Builder<RegistDRMCertInfoRequest, Builder> {
        private String ask; 
        private String certName; 
        private String description; 
        private Long ownerId; 
        private String passPhrase; 
        private String privateKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long resourceRealOwnerId; 
        private String servCert; 

        private Builder() {
            super();
        } 

        private Builder(RegistDRMCertInfoRequest request) {
            super(request);
            this.ask = request.ask;
            this.certName = request.certName;
            this.description = request.description;
            this.ownerId = request.ownerId;
            this.passPhrase = request.passPhrase;
            this.privateKey = request.privateKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceRealOwnerId = request.resourceRealOwnerId;
            this.servCert = request.servCert;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ask(String ask) {
            this.putQueryParameter("Ask", ask);
            this.ask = ask;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder passPhrase(String passPhrase) {
            this.putQueryParameter("PassPhrase", passPhrase);
            this.passPhrase = passPhrase;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ResourceRealOwnerId.
         */
        public Builder resourceRealOwnerId(Long resourceRealOwnerId) {
            this.putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId);
            this.resourceRealOwnerId = resourceRealOwnerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder servCert(String servCert) {
            this.putQueryParameter("ServCert", servCert);
            this.servCert = servCert;
            return this;
        }

        @Override
        public RegistDRMCertInfoRequest build() {
            return new RegistDRMCertInfoRequest(this);
        } 

    } 

}
