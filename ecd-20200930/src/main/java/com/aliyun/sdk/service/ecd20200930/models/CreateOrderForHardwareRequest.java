// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderForHardwareRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderForHardwareRequest</p>
 */
public class CreateOrderForHardwareRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(maximum = 500)
    private Integer amount;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("CityCode")
    private String cityCode;

    @Query
    @NameInMap("CityName")
    private String cityName;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("CountryCode")
    private String countryCode;

    @Query
    @NameInMap("CountryName")
    private String countryName;

    @Query
    @NameInMap("DetailAddress")
    private String detailAddress;

    @Query
    @NameInMap("DistrictCode")
    private String districtCode;

    @Query
    @NameInMap("DistrictName")
    private String districtName;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("HardwareType")
    @Validation(required = true)
    private String hardwareType;

    @Query
    @NameInMap("HardwareVersion")
    @Validation(required = true)
    private String hardwareVersion;

    @Query
    @NameInMap("MobilePhone")
    private String mobilePhone;

    @Query
    @NameInMap("Phone")
    private String phone;

    @Query
    @NameInMap("PromotionId")
    private String promotionId;

    @Query
    @NameInMap("ProvCode")
    private String provCode;

    @Query
    @NameInMap("ProvName")
    private String provName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StreetCode")
    private String streetCode;

    @Query
    @NameInMap("StreetName")
    private String streetName;

    @Query
    @NameInMap("ZipCode")
    private String zipCode;

    private CreateOrderForHardwareRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.cityCode = builder.cityCode;
        this.cityName = builder.cityName;
        this.contactName = builder.contactName;
        this.countryCode = builder.countryCode;
        this.countryName = builder.countryName;
        this.detailAddress = builder.detailAddress;
        this.districtCode = builder.districtCode;
        this.districtName = builder.districtName;
        this.email = builder.email;
        this.hardwareType = builder.hardwareType;
        this.hardwareVersion = builder.hardwareVersion;
        this.mobilePhone = builder.mobilePhone;
        this.phone = builder.phone;
        this.promotionId = builder.promotionId;
        this.provCode = builder.provCode;
        this.provName = builder.provName;
        this.regionId = builder.regionId;
        this.streetCode = builder.streetCode;
        this.streetName = builder.streetName;
        this.zipCode = builder.zipCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderForHardwareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return cityName
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return countryName
     */
    public String getCountryName() {
        return this.countryName;
    }

    /**
     * @return detailAddress
     */
    public String getDetailAddress() {
        return this.detailAddress;
    }

    /**
     * @return districtCode
     */
    public String getDistrictCode() {
        return this.districtCode;
    }

    /**
     * @return districtName
     */
    public String getDistrictName() {
        return this.districtName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return hardwareType
     */
    public String getHardwareType() {
        return this.hardwareType;
    }

    /**
     * @return hardwareVersion
     */
    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /**
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return provCode
     */
    public String getProvCode() {
        return this.provCode;
    }

    /**
     * @return provName
     */
    public String getProvName() {
        return this.provName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return streetCode
     */
    public String getStreetCode() {
        return this.streetCode;
    }

    /**
     * @return streetName
     */
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * @return zipCode
     */
    public String getZipCode() {
        return this.zipCode;
    }

    public static final class Builder extends Request.Builder<CreateOrderForHardwareRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private String cityCode; 
        private String cityName; 
        private String contactName; 
        private String countryCode; 
        private String countryName; 
        private String detailAddress; 
        private String districtCode; 
        private String districtName; 
        private String email; 
        private String hardwareType; 
        private String hardwareVersion; 
        private String mobilePhone; 
        private String phone; 
        private String promotionId; 
        private String provCode; 
        private String provName; 
        private String regionId; 
        private String streetCode; 
        private String streetName; 
        private String zipCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderForHardwareRequest response) {
            super(response);
            this.amount = response.amount;
            this.autoPay = response.autoPay;
            this.cityCode = response.cityCode;
            this.cityName = response.cityName;
            this.contactName = response.contactName;
            this.countryCode = response.countryCode;
            this.countryName = response.countryName;
            this.detailAddress = response.detailAddress;
            this.districtCode = response.districtCode;
            this.districtName = response.districtName;
            this.email = response.email;
            this.hardwareType = response.hardwareType;
            this.hardwareVersion = response.hardwareVersion;
            this.mobilePhone = response.mobilePhone;
            this.phone = response.phone;
            this.promotionId = response.promotionId;
            this.provCode = response.provCode;
            this.provName = response.provName;
            this.regionId = response.regionId;
            this.streetCode = response.streetCode;
            this.streetName = response.streetName;
            this.zipCode = response.zipCode;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * CityCode.
         */
        public Builder cityCode(String cityCode) {
            this.putQueryParameter("CityCode", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * CityName.
         */
        public Builder cityName(String cityName) {
            this.putQueryParameter("CityName", cityName);
            this.cityName = cityName;
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
         * CountryCode.
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * CountryName.
         */
        public Builder countryName(String countryName) {
            this.putQueryParameter("CountryName", countryName);
            this.countryName = countryName;
            return this;
        }

        /**
         * DetailAddress.
         */
        public Builder detailAddress(String detailAddress) {
            this.putQueryParameter("DetailAddress", detailAddress);
            this.detailAddress = detailAddress;
            return this;
        }

        /**
         * DistrictCode.
         */
        public Builder districtCode(String districtCode) {
            this.putQueryParameter("DistrictCode", districtCode);
            this.districtCode = districtCode;
            return this;
        }

        /**
         * DistrictName.
         */
        public Builder districtName(String districtName) {
            this.putQueryParameter("DistrictName", districtName);
            this.districtName = districtName;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * HardwareType.
         */
        public Builder hardwareType(String hardwareType) {
            this.putQueryParameter("HardwareType", hardwareType);
            this.hardwareType = hardwareType;
            return this;
        }

        /**
         * HardwareVersion.
         */
        public Builder hardwareVersion(String hardwareVersion) {
            this.putQueryParameter("HardwareVersion", hardwareVersion);
            this.hardwareVersion = hardwareVersion;
            return this;
        }

        /**
         * MobilePhone.
         */
        public Builder mobilePhone(String mobilePhone) {
            this.putQueryParameter("MobilePhone", mobilePhone);
            this.mobilePhone = mobilePhone;
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
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * ProvCode.
         */
        public Builder provCode(String provCode) {
            this.putQueryParameter("ProvCode", provCode);
            this.provCode = provCode;
            return this;
        }

        /**
         * ProvName.
         */
        public Builder provName(String provName) {
            this.putQueryParameter("ProvName", provName);
            this.provName = provName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StreetCode.
         */
        public Builder streetCode(String streetCode) {
            this.putQueryParameter("StreetCode", streetCode);
            this.streetCode = streetCode;
            return this;
        }

        /**
         * StreetName.
         */
        public Builder streetName(String streetName) {
            this.putQueryParameter("StreetName", streetName);
            this.streetName = streetName;
            return this;
        }

        /**
         * ZipCode.
         */
        public Builder zipCode(String zipCode) {
            this.putQueryParameter("ZipCode", zipCode);
            this.zipCode = zipCode;
            return this;
        }

        @Override
        public CreateOrderForHardwareRequest build() {
            return new CreateOrderForHardwareRequest(this);
        } 

    } 

}
