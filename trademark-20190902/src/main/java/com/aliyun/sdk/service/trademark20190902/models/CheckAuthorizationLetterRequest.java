// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAuthorizationLetterRequest} extends {@link RequestModel}
 *
 * <p>CheckAuthorizationLetterRequest</p>
 */
public class CheckAuthorizationLetterRequest extends Request {
    @Query
    @NameInMap("ApplicantType")
    private String applicantType;

    @Query
    @NameInMap("Color")
    private String color;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("ContactNumber")
    private String contactNumber;

    @Query
    @NameInMap("ContactZipcode")
    private String contactZipcode;

    @Query
    @NameInMap("OssKey")
    @Validation(required = true)
    private String ossKey;

    @Query
    @NameInMap("PersonalType")
    private String personalType;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CheckAuthorizationLetterRequest(Builder builder) {
        super(builder);
        this.applicantType = builder.applicantType;
        this.color = builder.color;
        this.contactName = builder.contactName;
        this.contactNumber = builder.contactNumber;
        this.contactZipcode = builder.contactZipcode;
        this.ossKey = builder.ossKey;
        this.personalType = builder.personalType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAuthorizationLetterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicantType
     */
    public String getApplicantType() {
        return this.applicantType;
    }

    /**
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return contactNumber
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * @return contactZipcode
     */
    public String getContactZipcode() {
        return this.contactZipcode;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return personalType
     */
    public String getPersonalType() {
        return this.personalType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CheckAuthorizationLetterRequest, Builder> {
        private String applicantType; 
        private String color; 
        private String contactName; 
        private String contactNumber; 
        private String contactZipcode; 
        private String ossKey; 
        private String personalType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CheckAuthorizationLetterRequest request) {
            super(request);
            this.applicantType = request.applicantType;
            this.color = request.color;
            this.contactName = request.contactName;
            this.contactNumber = request.contactNumber;
            this.contactZipcode = request.contactZipcode;
            this.ossKey = request.ossKey;
            this.personalType = request.personalType;
            this.type = request.type;
        } 

        /**
         * ApplicantType.
         */
        public Builder applicantType(String applicantType) {
            this.putQueryParameter("ApplicantType", applicantType);
            this.applicantType = applicantType;
            return this;
        }

        /**
         * Color.
         */
        public Builder color(String color) {
            this.putQueryParameter("Color", color);
            this.color = color;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * ContactNumber.
         */
        public Builder contactNumber(String contactNumber) {
            this.putQueryParameter("ContactNumber", contactNumber);
            this.contactNumber = contactNumber;
            return this;
        }

        /**
         * ContactZipcode.
         */
        public Builder contactZipcode(String contactZipcode) {
            this.putQueryParameter("ContactZipcode", contactZipcode);
            this.contactZipcode = contactZipcode;
            return this;
        }

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * PersonalType.
         */
        public Builder personalType(String personalType) {
            this.putQueryParameter("PersonalType", personalType);
            this.personalType = personalType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CheckAuthorizationLetterRequest build() {
            return new CheckAuthorizationLetterRequest(this);
        } 

    } 

}
