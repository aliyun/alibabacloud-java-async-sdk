// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link UpdateAccountProfileInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccountProfileInfoRequest</p>
 */
public class UpdateAccountProfileInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountAttribute")
    private String accountAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address2")
    private String address2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAlipayNo")
    private String bindAlipayNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CityJsonString")
    private java.util.Map<String, ?> cityJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactMethod")
    private String contactMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistrictJsonString")
    private java.util.Map<String, ?> districtJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fax")
    private String fax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstName")
    private String firstName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Head")
    private String head;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HeadColor")
    private String headColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastName")
    private String lastName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostCode")
    private String postCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvinceJsonString")
    private java.util.Map<String, ?> provinceJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelfServicingBusinessRegNum")
    private String selfServicingBusinessRegNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelfServicingIdentificationNum")
    private String selfServicingIdentificationNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrueName")
    private String trueName;

    private UpdateAccountProfileInfoRequest(Builder builder) {
        super(builder);
        this.accountAttribute = builder.accountAttribute;
        this.address = builder.address;
        this.address2 = builder.address2;
        this.bindAlipayNo = builder.bindAlipayNo;
        this.certType = builder.certType;
        this.cityJsonString = builder.cityJsonString;
        this.contactMethod = builder.contactMethod;
        this.districtJsonString = builder.districtJsonString;
        this.fax = builder.fax;
        this.firstName = builder.firstName;
        this.head = builder.head;
        this.headColor = builder.headColor;
        this.lastName = builder.lastName;
        this.pk = builder.pk;
        this.phone = builder.phone;
        this.postCode = builder.postCode;
        this.provinceJsonString = builder.provinceJsonString;
        this.selfServicingBusinessRegNum = builder.selfServicingBusinessRegNum;
        this.selfServicingIdentificationNum = builder.selfServicingIdentificationNum;
        this.trueName = builder.trueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccountProfileInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountAttribute
     */
    public String getAccountAttribute() {
        return this.accountAttribute;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return address2
     */
    public String getAddress2() {
        return this.address2;
    }

    /**
     * @return bindAlipayNo
     */
    public String getBindAlipayNo() {
        return this.bindAlipayNo;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return cityJsonString
     */
    public java.util.Map<String, ?> getCityJsonString() {
        return this.cityJsonString;
    }

    /**
     * @return contactMethod
     */
    public String getContactMethod() {
        return this.contactMethod;
    }

    /**
     * @return districtJsonString
     */
    public java.util.Map<String, ?> getDistrictJsonString() {
        return this.districtJsonString;
    }

    /**
     * @return fax
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return head
     */
    public String getHead() {
        return this.head;
    }

    /**
     * @return headColor
     */
    public String getHeadColor() {
        return this.headColor;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return postCode
     */
    public String getPostCode() {
        return this.postCode;
    }

    /**
     * @return provinceJsonString
     */
    public java.util.Map<String, ?> getProvinceJsonString() {
        return this.provinceJsonString;
    }

    /**
     * @return selfServicingBusinessRegNum
     */
    public String getSelfServicingBusinessRegNum() {
        return this.selfServicingBusinessRegNum;
    }

    /**
     * @return selfServicingIdentificationNum
     */
    public String getSelfServicingIdentificationNum() {
        return this.selfServicingIdentificationNum;
    }

    /**
     * @return trueName
     */
    public String getTrueName() {
        return this.trueName;
    }

    public static final class Builder extends Request.Builder<UpdateAccountProfileInfoRequest, Builder> {
        private String accountAttribute; 
        private String address; 
        private String address2; 
        private String bindAlipayNo; 
        private String certType; 
        private java.util.Map<String, ?> cityJsonString; 
        private String contactMethod; 
        private java.util.Map<String, ?> districtJsonString; 
        private String fax; 
        private String firstName; 
        private String head; 
        private String headColor; 
        private String lastName; 
        private String pk; 
        private String phone; 
        private String postCode; 
        private java.util.Map<String, ?> provinceJsonString; 
        private String selfServicingBusinessRegNum; 
        private String selfServicingIdentificationNum; 
        private String trueName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccountProfileInfoRequest request) {
            super(request);
            this.accountAttribute = request.accountAttribute;
            this.address = request.address;
            this.address2 = request.address2;
            this.bindAlipayNo = request.bindAlipayNo;
            this.certType = request.certType;
            this.cityJsonString = request.cityJsonString;
            this.contactMethod = request.contactMethod;
            this.districtJsonString = request.districtJsonString;
            this.fax = request.fax;
            this.firstName = request.firstName;
            this.head = request.head;
            this.headColor = request.headColor;
            this.lastName = request.lastName;
            this.pk = request.pk;
            this.phone = request.phone;
            this.postCode = request.postCode;
            this.provinceJsonString = request.provinceJsonString;
            this.selfServicingBusinessRegNum = request.selfServicingBusinessRegNum;
            this.selfServicingIdentificationNum = request.selfServicingIdentificationNum;
            this.trueName = request.trueName;
        } 

        /**
         * AccountAttribute.
         */
        public Builder accountAttribute(String accountAttribute) {
            this.putQueryParameter("AccountAttribute", accountAttribute);
            this.accountAttribute = accountAttribute;
            return this;
        }

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * Address2.
         */
        public Builder address2(String address2) {
            this.putQueryParameter("Address2", address2);
            this.address2 = address2;
            return this;
        }

        /**
         * BindAlipayNo.
         */
        public Builder bindAlipayNo(String bindAlipayNo) {
            this.putQueryParameter("BindAlipayNo", bindAlipayNo);
            this.bindAlipayNo = bindAlipayNo;
            return this;
        }

        /**
         * CertType.
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * CityJsonString.
         */
        public Builder cityJsonString(java.util.Map<String, ?> cityJsonString) {
            String cityJsonStringShrink = shrink(cityJsonString, "CityJsonString", "json");
            this.putQueryParameter("CityJsonString", cityJsonStringShrink);
            this.cityJsonString = cityJsonString;
            return this;
        }

        /**
         * ContactMethod.
         */
        public Builder contactMethod(String contactMethod) {
            this.putQueryParameter("ContactMethod", contactMethod);
            this.contactMethod = contactMethod;
            return this;
        }

        /**
         * DistrictJsonString.
         */
        public Builder districtJsonString(java.util.Map<String, ?> districtJsonString) {
            String districtJsonStringShrink = shrink(districtJsonString, "DistrictJsonString", "json");
            this.putQueryParameter("DistrictJsonString", districtJsonStringShrink);
            this.districtJsonString = districtJsonString;
            return this;
        }

        /**
         * Fax.
         */
        public Builder fax(String fax) {
            this.putQueryParameter("Fax", fax);
            this.fax = fax;
            return this;
        }

        /**
         * FirstName.
         */
        public Builder firstName(String firstName) {
            this.putQueryParameter("FirstName", firstName);
            this.firstName = firstName;
            return this;
        }

        /**
         * Head.
         */
        public Builder head(String head) {
            this.putQueryParameter("Head", head);
            this.head = head;
            return this;
        }

        /**
         * HeadColor.
         */
        public Builder headColor(String headColor) {
            this.putQueryParameter("HeadColor", headColor);
            this.headColor = headColor;
            return this;
        }

        /**
         * LastName.
         */
        public Builder lastName(String lastName) {
            this.putQueryParameter("LastName", lastName);
            this.lastName = lastName;
            return this;
        }

        /**
         * PK.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * PostCode.
         */
        public Builder postCode(String postCode) {
            this.putQueryParameter("PostCode", postCode);
            this.postCode = postCode;
            return this;
        }

        /**
         * ProvinceJsonString.
         */
        public Builder provinceJsonString(java.util.Map<String, ?> provinceJsonString) {
            String provinceJsonStringShrink = shrink(provinceJsonString, "ProvinceJsonString", "json");
            this.putQueryParameter("ProvinceJsonString", provinceJsonStringShrink);
            this.provinceJsonString = provinceJsonString;
            return this;
        }

        /**
         * SelfServicingBusinessRegNum.
         */
        public Builder selfServicingBusinessRegNum(String selfServicingBusinessRegNum) {
            this.putQueryParameter("SelfServicingBusinessRegNum", selfServicingBusinessRegNum);
            this.selfServicingBusinessRegNum = selfServicingBusinessRegNum;
            return this;
        }

        /**
         * SelfServicingIdentificationNum.
         */
        public Builder selfServicingIdentificationNum(String selfServicingIdentificationNum) {
            this.putQueryParameter("SelfServicingIdentificationNum", selfServicingIdentificationNum);
            this.selfServicingIdentificationNum = selfServicingIdentificationNum;
            return this;
        }

        /**
         * TrueName.
         */
        public Builder trueName(String trueName) {
            this.putQueryParameter("TrueName", trueName);
            this.trueName = trueName;
            return this;
        }

        @Override
        public UpdateAccountProfileInfoRequest build() {
            return new UpdateAccountProfileInfoRequest(this);
        } 

    } 

}
