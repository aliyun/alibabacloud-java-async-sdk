// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetCompanyResponseBody} extends {@link TeaModel}
 *
 * <p>GetCompanyResponseBody</p>
 */
public class GetCompanyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("CompanyAddress")
    private String companyAddress;

    @com.aliyun.core.annotation.NameInMap("CompanyCode")
    private String companyCode;

    @com.aliyun.core.annotation.NameInMap("CompanyEmail")
    private String companyEmail;

    @com.aliyun.core.annotation.NameInMap("CompanyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("CompanyName")
    private String companyName;

    @com.aliyun.core.annotation.NameInMap("CompanyPhone")
    private String companyPhone;

    @com.aliyun.core.annotation.NameInMap("CompanyType")
    private Integer companyType;

    @com.aliyun.core.annotation.NameInMap("CountryCode")
    private String countryCode;

    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.NameInMap("PostCode")
    private String postCode;

    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCompanyResponseBody(Builder builder) {
        this.city = builder.city;
        this.companyAddress = builder.companyAddress;
        this.companyCode = builder.companyCode;
        this.companyEmail = builder.companyEmail;
        this.companyId = builder.companyId;
        this.companyName = builder.companyName;
        this.companyPhone = builder.companyPhone;
        this.companyType = builder.companyType;
        this.countryCode = builder.countryCode;
        this.department = builder.department;
        this.lang = builder.lang;
        this.postCode = builder.postCode;
        this.province = builder.province;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompanyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return companyAddress
     */
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    /**
     * @return companyCode
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * @return companyEmail
     */
    public String getCompanyEmail() {
        return this.companyEmail;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return companyPhone
     */
    public String getCompanyPhone() {
        return this.companyPhone;
    }

    /**
     * @return companyType
     */
    public Integer getCompanyType() {
        return this.companyType;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return postCode
     */
    public String getPostCode() {
        return this.postCode;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String city; 
        private String companyAddress; 
        private String companyCode; 
        private String companyEmail; 
        private Long companyId; 
        private String companyName; 
        private String companyPhone; 
        private Integer companyType; 
        private String countryCode; 
        private String department; 
        private String lang; 
        private String postCode; 
        private String province; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCompanyResponseBody model) {
            this.city = model.city;
            this.companyAddress = model.companyAddress;
            this.companyCode = model.companyCode;
            this.companyEmail = model.companyEmail;
            this.companyId = model.companyId;
            this.companyName = model.companyName;
            this.companyPhone = model.companyPhone;
            this.companyType = model.companyType;
            this.countryCode = model.countryCode;
            this.department = model.department;
            this.lang = model.lang;
            this.postCode = model.postCode;
            this.province = model.province;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The city.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * <p>The address of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder companyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }

        /**
         * <p>The company code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder companyCode(String companyCode) {
            this.companyCode = companyCode;
            return this;
        }

        /**
         * <p>The email address of the company.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@163.com">test@163.com</a></p>
         */
        public Builder companyEmail(String companyEmail) {
            this.companyEmail = companyEmail;
            return this;
        }

        /**
         * <p>The company ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51001</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>The name of the company or organization.</p>
         * 
         * <strong>example:</strong>
         * <p>testYanwen045</p>
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
         * <p>The phone number of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>1511</p>
         */
        public Builder companyPhone(String companyPhone) {
            this.companyPhone = companyPhone;
            return this;
        }

        /**
         * <p>The company type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder companyType(Integer companyType) {
            this.companyType = companyType;
            return this;
        }

        /**
         * <p>The country code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * <p>The department.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder department(String department) {
            this.department = department;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }

        /**
         * <p>The postal code.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder postCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        /**
         * <p>The province.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0068247C-A454-5FC9-93BF-C41CBB5CD19E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCompanyResponseBody build() {
            return new GetCompanyResponseBody(this);
        } 

    } 

}
