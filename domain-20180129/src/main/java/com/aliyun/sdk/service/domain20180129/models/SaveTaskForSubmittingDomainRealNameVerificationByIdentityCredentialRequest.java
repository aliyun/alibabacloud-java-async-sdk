// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest} extends {@link RequestModel}
 *
 * <p>SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest</p>
 */
public class SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityCredential")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityCredential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityCredentialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityCredentialNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityCredentialType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityCredentialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
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
    public java.util.List<String> getDomainName() {
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
        private java.util.List<String> domainName; 
        private String identityCredential; 
        private String identityCredentialNo; 
        private String identityCredentialType; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.identityCredential = request.identityCredential;
            this.identityCredentialNo = request.identityCredentialNo;
            this.identityCredentialType = request.identityCredentialType;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The domain names to be verified in bulk.</p>
         * <p>This parameter is required.</p>
         */
        public Builder domainName(java.util.List<String> domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The Base64-encoded content of the identity credential file.</p>
         * <p>This parameter is required.</p>
         */
        public Builder identityCredential(String identityCredential) {
            this.putBodyParameter("IdentityCredential", identityCredential);
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * <p>The ID number of the identity credential.</p>
         * <p>This parameter is required.</p>
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.putQueryParameter("IdentityCredentialNo", identityCredentialNo);
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * <p>The type of the identity credential. Valid values: IDC, Passport, and OfficerAcademy.</p>
         * <p>This parameter is required.</p>
         */
        public Builder identityCredentialType(String identityCredentialType) {
            this.putQueryParameter("IdentityCredentialType", identityCredentialType);
            this.identityCredentialType = identityCredentialType;
            return this;
        }

        /**
         * <p>The response language. Valid values: zh-CN and en-US. The default is en-US.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The client IP address.</p>
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
