// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
         * <p>The business scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Marketing products</p>
         */
        public Builder businessDesc(String businessDesc) {
            this.putQueryParameter("BusinessDesc", businessDesc);
            this.businessDesc = businessDesc;
            return this;
        }

        /**
         * <p>The enterprise mail.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:partner@aliyun.com">partner@aliyun.com</a></p>
         */
        public Builder contactMail(String contactMail) {
            this.putQueryParameter("ContactMail", contactMail);
            this.contactMail = contactMail;
            return this;
        }

        /**
         * <p>The country code.</p>
         * <blockquote>
         * <p> For more information about country codes, see <a href="https://help.aliyun.com/document_detail/608210.html">Country codes</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * <p>The enterprise name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder custName(String custName) {
            this.putQueryParameter("CustName", custName);
            this.custName = custName;
            return this;
        }

        /**
         * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>293483938849493</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The ISV or Client agreement.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>isvTerms.pdf</p>
         */
        public Builder isvTerms(String isvTerms) {
            this.putQueryParameter("IsvTerms", isvTerms);
            this.isvTerms = isvTerms;
            return this;
        }

        /**
         * <p>The enterprise address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
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
