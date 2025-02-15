// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RegistrantProfileRealNameVerificationRequest} extends {@link RequestModel}
 *
 * <p>RegistrantProfileRealNameVerificationRequest</p>
 */
public class RegistrantProfileRealNameVerificationRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileID")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registrantProfileID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private RegistrantProfileRealNameVerificationRequest(Builder builder) {
        super(builder);
        this.identityCredential = builder.identityCredential;
        this.identityCredentialNo = builder.identityCredentialNo;
        this.identityCredentialType = builder.identityCredentialType;
        this.lang = builder.lang;
        this.registrantProfileID = builder.registrantProfileID;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistrantProfileRealNameVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return registrantProfileID
     */
    public Long getRegistrantProfileID() {
        return this.registrantProfileID;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<RegistrantProfileRealNameVerificationRequest, Builder> {
        private String identityCredential; 
        private String identityCredentialNo; 
        private String identityCredentialType; 
        private String lang; 
        private Long registrantProfileID; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(RegistrantProfileRealNameVerificationRequest request) {
            super(request);
            this.identityCredential = request.identityCredential;
            this.identityCredentialNo = request.identityCredentialNo;
            this.identityCredentialType = request.identityCredentialType;
            this.lang = request.lang;
            this.registrantProfileID = request.registrantProfileID;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdA==</p>
         */
        public Builder identityCredential(String identityCredential) {
            this.putBodyParameter("IdentityCredential", identityCredential);
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>43012512345678****</p>
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.putQueryParameter("IdentityCredentialNo", identityCredentialNo);
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SFZ</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder registrantProfileID(Long registrantProfileID) {
            this.putQueryParameter("RegistrantProfileID", registrantProfileID);
            this.registrantProfileID = registrantProfileID;
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
        public RegistrantProfileRealNameVerificationRequest build() {
            return new RegistrantProfileRealNameVerificationRequest(this);
        } 

    } 

}
