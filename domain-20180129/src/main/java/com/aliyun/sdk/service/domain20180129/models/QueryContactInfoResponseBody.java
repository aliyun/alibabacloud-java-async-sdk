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
 * {@link QueryContactInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryContactInfoResponseBody</p>
 */
public class QueryContactInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("CreateDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("PostalCode")
    private String postalCode;

    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("RegistrantName")
    private String registrantName;

    @com.aliyun.core.annotation.NameInMap("RegistrantOrganization")
    private String registrantOrganization;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TelArea")
    private String telArea;

    @com.aliyun.core.annotation.NameInMap("TelExt")
    private String telExt;

    @com.aliyun.core.annotation.NameInMap("Telephone")
    private String telephone;

    @com.aliyun.core.annotation.NameInMap("ZhAddress")
    private String zhAddress;

    @com.aliyun.core.annotation.NameInMap("ZhCity")
    private String zhCity;

    @com.aliyun.core.annotation.NameInMap("ZhProvince")
    private String zhProvince;

    @com.aliyun.core.annotation.NameInMap("ZhRegistrantName")
    private String zhRegistrantName;

    @com.aliyun.core.annotation.NameInMap("ZhRegistrantOrganization")
    private String zhRegistrantOrganization;

    private QueryContactInfoResponseBody(Builder builder) {
        this.address = builder.address;
        this.city = builder.city;
        this.country = builder.country;
        this.createDate = builder.createDate;
        this.email = builder.email;
        this.postalCode = builder.postalCode;
        this.province = builder.province;
        this.registrantName = builder.registrantName;
        this.registrantOrganization = builder.registrantOrganization;
        this.requestId = builder.requestId;
        this.telArea = builder.telArea;
        this.telExt = builder.telExt;
        this.telephone = builder.telephone;
        this.zhAddress = builder.zhAddress;
        this.zhCity = builder.zhCity;
        this.zhProvince = builder.zhProvince;
        this.zhRegistrantName = builder.zhRegistrantName;
        this.zhRegistrantOrganization = builder.zhRegistrantOrganization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryContactInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return postalCode
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return registrantName
     */
    public String getRegistrantName() {
        return this.registrantName;
    }

    /**
     * @return registrantOrganization
     */
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return telArea
     */
    public String getTelArea() {
        return this.telArea;
    }

    /**
     * @return telExt
     */
    public String getTelExt() {
        return this.telExt;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * @return zhAddress
     */
    public String getZhAddress() {
        return this.zhAddress;
    }

    /**
     * @return zhCity
     */
    public String getZhCity() {
        return this.zhCity;
    }

    /**
     * @return zhProvince
     */
    public String getZhProvince() {
        return this.zhProvince;
    }

    /**
     * @return zhRegistrantName
     */
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    /**
     * @return zhRegistrantOrganization
     */
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

    public static final class Builder {
        private String address; 
        private String city; 
        private String country; 
        private String createDate; 
        private String email; 
        private String postalCode; 
        private String province; 
        private String registrantName; 
        private String registrantOrganization; 
        private String requestId; 
        private String telArea; 
        private String telExt; 
        private String telephone; 
        private String zhAddress; 
        private String zhCity; 
        private String zhProvince; 
        private String zhRegistrantName; 
        private String zhRegistrantOrganization; 

        private Builder() {
        } 

        private Builder(QueryContactInfoResponseBody model) {
            this.address = model.address;
            this.city = model.city;
            this.country = model.country;
            this.createDate = model.createDate;
            this.email = model.email;
            this.postalCode = model.postalCode;
            this.province = model.province;
            this.registrantName = model.registrantName;
            this.registrantOrganization = model.registrantOrganization;
            this.requestId = model.requestId;
            this.telArea = model.telArea;
            this.telExt = model.telExt;
            this.telephone = model.telephone;
            this.zhAddress = model.zhAddress;
            this.zhCity = model.zhCity;
            this.zhProvince = model.zhProvince;
            this.zhRegistrantName = model.zhRegistrantName;
            this.zhRegistrantOrganization = model.zhRegistrantOrganization;
        } 

        /**
         * <p>Mailing address (English).</p>
         * 
         * <strong>example:</strong>
         * <p>xi hu qu *** jiedao *** xiaoqu *** zhuang 101</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>City (English).</p>
         * 
         * <strong>example:</strong>
         * <p>hang zhou shi</p>
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * <p>Country code. For example, <strong>CN</strong> represents China and <strong>US</strong> represents the United States.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * <p>Domain registration date.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-20 11:37:29</p>
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * <p>Mailbox.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>Postal code.</p>
         * 
         * <strong>example:</strong>
         * <p>310024</p>
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * <p>Province (English).</p>
         * 
         * <strong>example:</strong>
         * <p>zhe jiang</p>
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * <p>Contact name (English).</p>
         * 
         * <strong>example:</strong>
         * <p>zhang san</p>
         */
        public Builder registrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }

        /**
         * <p>Registrant name (English).</p>
         * 
         * <strong>example:</strong>
         * <p>zhang san</p>
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>C39ECA8A-BB5E-4F92-B013-6A032FA06B04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The country code for the telephone number. For example, the country code for China is <strong>86</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder telArea(String telArea) {
            this.telArea = telArea;
            return this;
        }

        /**
         * <p>Telephone extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder telExt(String telExt) {
            this.telExt = telExt;
            return this;
        }

        /**
         * <p>Telephone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1820000****</p>
         */
        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        /**
         * <p>Mailing address (in Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>西湖区<em><strong>街道</strong></em>小区***幢101</p>
         */
        public Builder zhAddress(String zhAddress) {
            this.zhAddress = zhAddress;
            return this;
        }

        /**
         * <p>City (Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市</p>
         */
        public Builder zhCity(String zhCity) {
            this.zhCity = zhCity;
            return this;
        }

        /**
         * <p>Province (Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>浙江</p>
         */
        public Builder zhProvince(String zhProvince) {
            this.zhProvince = zhProvince;
            return this;
        }

        /**
         * <p>Contact name (Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder zhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }

        /**
         * <p>Registrant name (Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }

        public QueryContactInfoResponseBody build() {
            return new QueryContactInfoResponseBody(this);
        } 

    } 

}
