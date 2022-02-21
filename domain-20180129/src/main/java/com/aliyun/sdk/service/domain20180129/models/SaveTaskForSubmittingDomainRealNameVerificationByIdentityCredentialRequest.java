// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest} extends {@link RequestModel}
 *
 * <p>SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest</p>
 */
public class SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private java.util.List < String > domainName;

    @Body
    @NameInMap("IdentityCredential")
    @Validation(required = true)
    private String identityCredential;

    @Query
    @NameInMap("IdentityCredentialNo")
    @Validation(required = true)
    private String identityCredentialNo;

    @Query
    @NameInMap("IdentityCredentialType")
    @Validation(required = true)
    private String identityCredentialType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.identityCredential = builder.identityCredential;
        this.identityCredentialNo = builder.identityCredentialNo;
        this.identityCredentialType = builder.identityCredentialType;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public java.util.List < String > getDomainName() {
        return this.domainName;
    }

    /**
     * @return identityCredential
     */
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    /**
     * @return identityCredentialNo
     */
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    /**
     * @return identityCredentialType
     */
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest, Builder> {
        private java.util.List < String > domainName; 
        private String identityCredential; 
        private String identityCredentialNo; 
        private String identityCredentialType; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.identityCredential = response.identityCredential;
            this.identityCredentialNo = response.identityCredentialNo;
            this.identityCredentialType = response.identityCredentialType;
            this.lang = response.lang;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(java.util.List < String > domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * IdentityCredential.
         */
        public Builder identityCredential(String identityCredential) {
            this.putBodyParameter("IdentityCredential", identityCredential);
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * IdentityCredentialNo.
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.putQueryParameter("IdentityCredentialNo", identityCredentialNo);
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * IdentityCredentialType.
         */
        public Builder identityCredentialType(String identityCredentialType) {
            this.putQueryParameter("IdentityCredentialType", identityCredentialType);
            this.identityCredentialType = identityCredentialType;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest build() {
            return new SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest(this);
        } 

    } 

}
