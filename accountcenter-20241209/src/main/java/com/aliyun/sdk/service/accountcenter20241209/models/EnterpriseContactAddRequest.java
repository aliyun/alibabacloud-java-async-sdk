// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseContactAddRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseContactAddRequest</p>
 */
public class EnterpriseContactAddRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AsyncEmailVerify")
    private Boolean asyncEmailVerify;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AsyncMobileVerify")
    private Boolean asyncMobileVerify;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactEmail")
    private String contactEmail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactMobile")
    private String contactMobile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactPosition")
    private String contactPosition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmailCode")
    private String emailCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MobileCode")
    private String mobileCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SharedContact")
    private Boolean sharedContact;

    private EnterpriseContactAddRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.asyncEmailVerify = builder.asyncEmailVerify;
        this.asyncMobileVerify = builder.asyncMobileVerify;
        this.contactEmail = builder.contactEmail;
        this.contactMobile = builder.contactMobile;
        this.contactName = builder.contactName;
        this.contactPosition = builder.contactPosition;
        this.emailCode = builder.emailCode;
        this.mobileCode = builder.mobileCode;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.sharedContact = builder.sharedContact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseContactAddRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return asyncEmailVerify
     */
    public Boolean getAsyncEmailVerify() {
        return this.asyncEmailVerify;
    }

    /**
     * @return asyncMobileVerify
     */
    public Boolean getAsyncMobileVerify() {
        return this.asyncMobileVerify;
    }

    /**
     * @return contactEmail
     */
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * @return contactMobile
     */
    public String getContactMobile() {
        return this.contactMobile;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return contactPosition
     */
    public String getContactPosition() {
        return this.contactPosition;
    }

    /**
     * @return emailCode
     */
    public String getEmailCode() {
        return this.emailCode;
    }

    /**
     * @return mobileCode
     */
    public String getMobileCode() {
        return this.mobileCode;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return sharedContact
     */
    public Boolean getSharedContact() {
        return this.sharedContact;
    }

    public static final class Builder extends Request.Builder<EnterpriseContactAddRequest, Builder> {
        private String appName; 
        private Boolean asyncEmailVerify; 
        private Boolean asyncMobileVerify; 
        private String contactEmail; 
        private String contactMobile; 
        private String contactName; 
        private String contactPosition; 
        private String emailCode; 
        private String mobileCode; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private Boolean sharedContact; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseContactAddRequest request) {
            super(request);
            this.appName = request.appName;
            this.asyncEmailVerify = request.asyncEmailVerify;
            this.asyncMobileVerify = request.asyncMobileVerify;
            this.contactEmail = request.contactEmail;
            this.contactMobile = request.contactMobile;
            this.contactName = request.contactName;
            this.contactPosition = request.contactPosition;
            this.emailCode = request.emailCode;
            this.mobileCode = request.mobileCode;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.sharedContact = request.sharedContact;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AsyncEmailVerify.
         */
        public Builder asyncEmailVerify(Boolean asyncEmailVerify) {
            this.putBodyParameter("AsyncEmailVerify", asyncEmailVerify);
            this.asyncEmailVerify = asyncEmailVerify;
            return this;
        }

        /**
         * AsyncMobileVerify.
         */
        public Builder asyncMobileVerify(Boolean asyncMobileVerify) {
            this.putBodyParameter("AsyncMobileVerify", asyncMobileVerify);
            this.asyncMobileVerify = asyncMobileVerify;
            return this;
        }

        /**
         * ContactEmail.
         */
        public Builder contactEmail(String contactEmail) {
            this.putBodyParameter("ContactEmail", contactEmail);
            this.contactEmail = contactEmail;
            return this;
        }

        /**
         * ContactMobile.
         */
        public Builder contactMobile(String contactMobile) {
            this.putBodyParameter("ContactMobile", contactMobile);
            this.contactMobile = contactMobile;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * ContactPosition.
         */
        public Builder contactPosition(String contactPosition) {
            this.putBodyParameter("ContactPosition", contactPosition);
            this.contactPosition = contactPosition;
            return this;
        }

        /**
         * EmailCode.
         */
        public Builder emailCode(String emailCode) {
            this.putBodyParameter("EmailCode", emailCode);
            this.emailCode = emailCode;
            return this;
        }

        /**
         * MobileCode.
         */
        public Builder mobileCode(String mobileCode) {
            this.putBodyParameter("MobileCode", mobileCode);
            this.mobileCode = mobileCode;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putBodyParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * SharedContact.
         */
        public Builder sharedContact(Boolean sharedContact) {
            this.putBodyParameter("SharedContact", sharedContact);
            this.sharedContact = sharedContact;
            return this;
        }

        @Override
        public EnterpriseContactAddRequest build() {
            return new EnterpriseContactAddRequest(this);
        } 

    } 

}
