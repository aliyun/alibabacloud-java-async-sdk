// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitIsvCustomerTermsRequest} extends {@link RequestModel}
 *
 * <p>SubmitIsvCustomerTermsRequest</p>
 */
public class SubmitIsvCustomerTermsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessDesc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactMail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactMail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String countryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsvTerms")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isvTerms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeAddress;

    private SubmitIsvCustomerTermsRequest(Builder builder) {
        super(builder);
        this.businessDesc = builder.businessDesc;
        this.contactMail = builder.contactMail;
        this.countryId = builder.countryId;
        this.custName = builder.custName;
        this.custSpaceId = builder.custSpaceId;
        this.isvTerms = builder.isvTerms;
        this.officeAddress = builder.officeAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitIsvCustomerTermsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessDesc
     */
    public String getBusinessDesc() {
        return this.businessDesc;
    }

    /**
     * @return contactMail
     */
    public String getContactMail() {
        return this.contactMail;
    }

    /**
     * @return countryId
     */
    public String getCountryId() {
        return this.countryId;
    }

    /**
     * @return custName
     */
    public String getCustName() {
        return this.custName;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return isvTerms
     */
    public String getIsvTerms() {
        return this.isvTerms;
    }

    /**
     * @return officeAddress
     */
    public String getOfficeAddress() {
        return this.officeAddress;
    }

    public static final class Builder extends Request.Builder<SubmitIsvCustomerTermsRequest, Builder> {
        private String businessDesc; 
        private String contactMail; 
        private String countryId; 
        private String custName; 
        private String custSpaceId; 
        private String isvTerms; 
        private String officeAddress; 

        private Builder() {
            super();
        } 

        private Builder(SubmitIsvCustomerTermsRequest request) {
            super(request);
            this.businessDesc = request.businessDesc;
            this.contactMail = request.contactMail;
            this.countryId = request.countryId;
            this.custName = request.custName;
            this.custSpaceId = request.custSpaceId;
            this.isvTerms = request.isvTerms;
            this.officeAddress = request.officeAddress;
        } 

        /**
         * The use scenario.
         */
        public Builder businessDesc(String businessDesc) {
            this.putQueryParameter("BusinessDesc", businessDesc);
            this.businessDesc = businessDesc;
            return this;
        }

        /**
         * The email address of your business.
         */
        public Builder contactMail(String contactMail) {
            this.putQueryParameter("ContactMail", contactMail);
            this.contactMail = contactMail;
            return this;
        }

        /**
         * The country code.
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * The display name of your business.
         */
        public Builder custName(String custName) {
            this.putQueryParameter("CustName", custName);
            this.custName = custName;
            return this;
        }

        /**
         * The space ID of the user under the ISV account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The ISV or Client Agreement.
         * <p>
         * 
         * > Before you upload files to Object Storage Service (OSS) servers, you must call the GetChatappUploadAuthorization operation to obtain the authentication information required to upload files. You can use the SDK provided by OSS to upload files. When you upload a file, you must set the key parameter value. To set the value for the key parameter, concatenate the value of the Dir parameter and the file name by using a forward slash (/). You can obtain the value of the Dir parameter by calling the GetChatappUploadAuthorization operation.
         * 
         * > The value of this parameter is the name of the uploaded file.
         */
        public Builder isvTerms(String isvTerms) {
            this.putQueryParameter("IsvTerms", isvTerms);
            this.isvTerms = isvTerms;
            return this;
        }

        /**
         * The address of your business.
         */
        public Builder officeAddress(String officeAddress) {
            this.putQueryParameter("OfficeAddress", officeAddress);
            this.officeAddress = officeAddress;
            return this;
        }

        @Override
        public SubmitIsvCustomerTermsRequest build() {
            return new SubmitIsvCustomerTermsRequest(this);
        } 

    } 

}
