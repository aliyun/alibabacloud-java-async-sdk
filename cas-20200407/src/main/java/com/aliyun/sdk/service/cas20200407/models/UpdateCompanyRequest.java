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
 * {@link UpdateCompanyRequest} extends {@link RequestModel}
 *
 * <p>UpdateCompanyRequest</p>
 */
public class UpdateCompanyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    @com.aliyun.core.annotation.Validation(required = true)
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyEmail")
    private String companyEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyPhone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer companyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String countryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String postCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    @com.aliyun.core.annotation.Validation(required = true)
    private String province;

    private UpdateCompanyRequest(Builder builder) {
        super(builder);
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCompanyRequest create() {
        return builder().build();
    }

@Override
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

    public static final class Builder extends Request.Builder<UpdateCompanyRequest, Builder> {
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

        private Builder() {
            super();
        } 

        private Builder(UpdateCompanyRequest request) {
            super(request);
            this.city = request.city;
            this.companyAddress = request.companyAddress;
            this.companyCode = request.companyCode;
            this.companyEmail = request.companyEmail;
            this.companyId = request.companyId;
            this.companyName = request.companyName;
            this.companyPhone = request.companyPhone;
            this.companyType = request.companyType;
            this.countryCode = request.countryCode;
            this.department = request.department;
            this.lang = request.lang;
            this.postCode = request.postCode;
            this.province = request.province;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder companyAddress(String companyAddress) {
            this.putQueryParameter("CompanyAddress", companyAddress);
            this.companyAddress = companyAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder companyCode(String companyCode) {
            this.putQueryParameter("CompanyCode", companyCode);
            this.companyCode = companyCode;
            return this;
        }

        /**
         * CompanyEmail.
         */
        public Builder companyEmail(String companyEmail) {
            this.putQueryParameter("CompanyEmail", companyEmail);
            this.companyEmail = companyEmail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>51001</p>
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("CompanyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testYanwen045</p>
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1511</p>
         */
        public Builder companyPhone(String companyPhone) {
            this.putQueryParameter("CompanyPhone", companyPhone);
            this.companyPhone = companyPhone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder companyType(Integer companyType) {
            this.putQueryParameter("CompanyType", companyType);
            this.companyType = companyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Department.
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
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
         * <p>100000</p>
         */
        public Builder postCode(String postCode) {
            this.putQueryParameter("PostCode", postCode);
            this.postCode = postCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        @Override
        public UpdateCompanyRequest build() {
            return new UpdateCompanyRequest(this);
        } 

    } 

}
