// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link SaveTaskForSubmittingDomainNameCredentialRequest} extends {@link RequestModel}
 *
 * <p>SaveTaskForSubmittingDomainNameCredentialRequest</p>
 */
public class SaveTaskForSubmittingDomainNameCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Credential")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialType")
    private String credentialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleId")
    private String saleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveTaskForSubmittingDomainNameCredentialRequest(Builder builder) {
        super(builder);
        this.credential = builder.credential;
        this.credentialNo = builder.credentialNo;
        this.credentialType = builder.credentialType;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.saleId = builder.saleId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTaskForSubmittingDomainNameCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credential
     */
    public String getCredential() {
        return this.credential;
    }

    /**
     * @return credentialNo
     */
    public String getCredentialNo() {
        return this.credentialNo;
    }

    /**
     * @return credentialType
     */
    public String getCredentialType() {
        return this.credentialType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return saleId
     */
    public String getSaleId() {
        return this.saleId;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveTaskForSubmittingDomainNameCredentialRequest, Builder> {
        private String credential; 
        private String credentialNo; 
        private String credentialType; 
        private String domainName; 
        private String lang; 
        private String saleId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveTaskForSubmittingDomainNameCredentialRequest request) {
            super(request);
            this.credential = request.credential;
            this.credentialNo = request.credentialNo;
            this.credentialType = request.credentialType;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.saleId = request.saleId;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder credential(String credential) {
            this.putQueryParameter("Credential", credential);
            this.credential = credential;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder credentialNo(String credentialNo) {
            this.putQueryParameter("CredentialNo", credentialNo);
            this.credentialNo = credentialNo;
            return this;
        }

        /**
         * CredentialType.
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("CredentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SaleId.
         */
        public Builder saleId(String saleId) {
            this.putQueryParameter("SaleId", saleId);
            this.saleId = saleId;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveTaskForSubmittingDomainNameCredentialRequest build() {
            return new SaveTaskForSubmittingDomainNameCredentialRequest(this);
        } 

    } 

}
