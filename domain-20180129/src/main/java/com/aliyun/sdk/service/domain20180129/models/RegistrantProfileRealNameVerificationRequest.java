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
         * <p>Upload the Base64-encoded image of your identity verification documents. Image requirements:  </p>
         * <ul>
         * <li>Format must be <strong>JPG</strong> or <strong>BMP</strong>.  </li>
         * <li>Original image size must be between <strong>55 KB and 1 MB</strong>.</li>
         * </ul>
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
         * <p>Enter the certificate number used for identity verification.</p>
         * <p>For example, an identity card number or business license number. The certificate number must exactly match the number on the submitted certificate. For enterprise certificates, enter the <strong>18-digit</strong> Unified Social Credit Code shown on the certificate.</p>
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
         * <p>Certificate type for identity verification. Select the certificate type you use for identity verification. Valid values:  </p>
         * <ul>
         * <li><strong>SFZ</strong>: Identity card.  </li>
         * <li><strong>HZ</strong>: Passport.  </li>
         * <li><strong>YYZZ</strong>: Business license.  </li>
         * <li><strong>ORG</strong>: Organization code certificate.  </li>
         * <li><strong>XYDM</strong>: Unified Social Credit Code certificate.  </li>
         * <li><strong>TXZ</strong>: Mainland Travel Permits for Hong Kong and Macao Residents.</li>
         * </ul>
         * <blockquote>
         * <p>For more certificate types, see <a href="https://help.aliyun.com/document_detail/72209.html">Certificate Types Supported for Identity Verification</a>.</p>
         * </blockquote>
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
         * <p>Language for error messages returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.  </li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value is <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>ID of the information template to undergo identity verification. This ID is automatically generated by the system after the information template is successfully created. You can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the information template ID.</p>
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
         * <p>User IP address. You can set it to 127.0.0.1.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
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
