// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link AddressVerifyIntlRequest} extends {@link RequestModel}
 *
 * <p>AddressVerifyIntlRequest</p>
 */
public class AddressVerifyIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCity")
    private String defaultCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCountry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultCountry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultDistrict")
    private String defaultDistrict;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultProvince")
    private String defaultProvince;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Latitude")
    private String latitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Longitude")
    private String longitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyType;

    private AddressVerifyIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addressType = builder.addressType;
        this.defaultCity = builder.defaultCity;
        this.defaultCountry = builder.defaultCountry;
        this.defaultDistrict = builder.defaultDistrict;
        this.defaultProvince = builder.defaultProvince;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.mobile = builder.mobile;
        this.productCode = builder.productCode;
        this.text = builder.text;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressVerifyIntlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return defaultCity
     */
    public String getDefaultCity() {
        return this.defaultCity;
    }

    /**
     * @return defaultCountry
     */
    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    /**
     * @return defaultDistrict
     */
    public String getDefaultDistrict() {
        return this.defaultDistrict;
    }

    /**
     * @return defaultProvince
     */
    public String getDefaultProvince() {
        return this.defaultProvince;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return verifyType
     */
    public String getVerifyType() {
        return this.verifyType;
    }

    public static final class Builder extends Request.Builder<AddressVerifyIntlRequest, Builder> {
        private String regionId; 
        private String addressType; 
        private String defaultCity; 
        private String defaultCountry; 
        private String defaultDistrict; 
        private String defaultProvince; 
        private String latitude; 
        private String longitude; 
        private String mobile; 
        private String productCode; 
        private String text; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(AddressVerifyIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addressType = request.addressType;
            this.defaultCity = request.defaultCity;
            this.defaultCountry = request.defaultCountry;
            this.defaultDistrict = request.defaultDistrict;
            this.defaultProvince = request.defaultProvince;
            this.latitude = request.latitude;
            this.longitude = request.longitude;
            this.mobile = request.mobile;
            this.productCode = request.productCode;
            this.text = request.text;
            this.verifyType = request.verifyType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Verification address type:</p>
         * <ul>
         * <li>“0”: Text address</li>
         * <li>“1”: Latitude and longitude</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>“0”</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>Default city</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市</p>
         */
        public Builder defaultCity(String defaultCity) {
            this.putQueryParameter("DefaultCity", defaultCity);
            this.defaultCity = defaultCity;
            return this;
        }

        /**
         * <p>Country name, currently only supports: China</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>中国</p>
         */
        public Builder defaultCountry(String defaultCountry) {
            this.putQueryParameter("DefaultCountry", defaultCountry);
            this.defaultCountry = defaultCountry;
            return this;
        }

        /**
         * <p>Default district</p>
         * 
         * <strong>example:</strong>
         * <p>余杭区</p>
         */
        public Builder defaultDistrict(String defaultDistrict) {
            this.putQueryParameter("DefaultDistrict", defaultDistrict);
            this.defaultDistrict = defaultDistrict;
            return this;
        }

        /**
         * <p>Default province</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省</p>
         */
        public Builder defaultProvince(String defaultProvince) {
            this.putQueryParameter("DefaultProvince", defaultProvince);
            this.defaultProvince = defaultProvince;
            return this;
        }

        /**
         * <p>Latitude.</p>
         * 
         * <strong>example:</strong>
         * <p>“31.2304”</p>
         */
        public Builder latitude(String latitude) {
            this.putQueryParameter("Latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * <p>Longitude.</p>
         * 
         * <strong>example:</strong>
         * <p>“121.4737”</p>
         */
        public Builder longitude(String longitude) {
            this.putQueryParameter("Longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * <p>Supports Chinese mobile phone numbers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1872334****</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>Fixed value: ADD_VERIFY_PRO</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD_VERIFY_PRO</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Detailed address text content</p>
         * 
         * <strong>example:</strong>
         * <p>阿里巴巴西溪园区</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>Address verification method:</p>
         * <ul>
         * <li>HOME: Home address verification</li>
         * <li>WORK: Work address verification</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOME</p>
         */
        public Builder verifyType(String verifyType) {
            this.putQueryParameter("VerifyType", verifyType);
            this.verifyType = verifyType;
            return this;
        }

        @Override
        public AddressVerifyIntlRequest build() {
            return new AddressVerifyIntlRequest(this);
        } 

    } 

}
