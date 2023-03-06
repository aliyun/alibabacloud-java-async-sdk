// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitIsvCustomerTermsRequest} extends {@link RequestModel}
 *
 * <p>SubmitIsvCustomerTermsRequest</p>
 */
public class SubmitIsvCustomerTermsRequest extends Request {
    @Query
    @NameInMap("BusinessDesc")
    @Validation(required = true)
    private String businessDesc;

    @Query
    @NameInMap("ContactMail")
    @Validation(required = true)
    private String contactMail;

    @Query
    @NameInMap("CountryId")
    @Validation(required = true)
    private String countryId;

    @Query
    @NameInMap("CustName")
    @Validation(required = true)
    private String custName;

    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Query
    @NameInMap("IsvTerms")
    @Validation(required = true)
    private String isvTerms;

    @Query
    @NameInMap("OfficeAddress")
    @Validation(required = true)
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
         * 企业使用场景
         */
        public Builder businessDesc(String businessDesc) {
            this.putQueryParameter("BusinessDesc", businessDesc);
            this.businessDesc = businessDesc;
            return this;
        }

        /**
         * 企业邮箱
         */
        public Builder contactMail(String contactMail) {
            this.putQueryParameter("ContactMail", contactMail);
            this.contactMail = contactMail;
            return this;
        }

        /**
         * 国家编码ID
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * 企业名称
         */
        public Builder custName(String custName) {
            this.putQueryParameter("CustName", custName);
            this.custName = custName;
            return this;
        }

        /**
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * Isv/Client协议
         */
        public Builder isvTerms(String isvTerms) {
            this.putQueryParameter("IsvTerms", isvTerms);
            this.isvTerms = isvTerms;
            return this;
        }

        /**
         * 企业地址
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
