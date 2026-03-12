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
 * {@link SaveContactTemplateCredentialRequest} extends {@link RequestModel}
 *
 * <p>SaveContactTemplateCredentialRequest</p>
 */
public class SaveContactTemplateCredentialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Credential")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveContactTemplateCredentialRequest(Builder builder) {
        super(builder);
        this.contactTemplateId = builder.contactTemplateId;
        this.credential = builder.credential;
        this.credentialNo = builder.credentialNo;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveContactTemplateCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactTemplateId
     */
    public Long getContactTemplateId() {
        return this.contactTemplateId;
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

    public static final class Builder extends Request.Builder<SaveContactTemplateCredentialRequest, Builder> {
        private Long contactTemplateId; 
        private String credential; 
        private String credentialNo; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveContactTemplateCredentialRequest request) {
            super(request);
            this.contactTemplateId = request.contactTemplateId;
            this.credential = request.credential;
            this.credentialNo = request.credentialNo;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactTemplateId(Long contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
            return this;
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
        public SaveContactTemplateCredentialRequest build() {
            return new SaveContactTemplateCredentialRequest(this);
        } 

    } 

}
