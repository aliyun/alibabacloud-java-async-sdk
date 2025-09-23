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
 * {@link AddressVerifyV2IntlRequest} extends {@link RequestModel}
 *
 * <p>AddressVerifyV2IntlRequest</p>
 */
public class AddressVerifyV2IntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegCountry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regCountry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyType")
    private String verifyType;

    private AddressVerifyV2IntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deviceToken = builder.deviceToken;
        this.mobile = builder.mobile;
        this.productCode = builder.productCode;
        this.regCountry = builder.regCountry;
        this.text = builder.text;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressVerifyV2IntlRequest create() {
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
     * @return deviceToken
     */
    public String getDeviceToken() {
        return this.deviceToken;
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
     * @return regCountry
     */
    public String getRegCountry() {
        return this.regCountry;
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

    public static final class Builder extends Request.Builder<AddressVerifyV2IntlRequest, Builder> {
        private String regionId; 
        private String deviceToken; 
        private String mobile; 
        private String productCode; 
        private String regCountry; 
        private String text; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(AddressVerifyV2IntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deviceToken = request.deviceToken;
            this.mobile = request.mobile;
            this.productCode = request.productCode;
            this.regCountry = request.regCountry;
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
         * <p>DeviceToken obtained via the client SDK</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tk9SSUQuMS*****************ZDNmNWY5NzQxOW1o</p>
         */
        public Builder deviceToken(String deviceToken) {
            this.putQueryParameter("DeviceToken", deviceToken);
            this.deviceToken = deviceToken;
            return this;
        }

        /**
         * <p>Supported: Chinese mobile phone numbers</p>
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
         * <p>List of prohibited countries or regions</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Currently supported: USA</p>
         */
        public Builder regCountry(String regCountry) {
            this.putQueryParameter("RegCountry", regCountry);
            this.regCountry = regCountry;
            return this;
        }

        /**
         * <p>Detailed address text content</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省杭州市西湖区灯彩街云谷园区</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>Address verification method:</p>
         * <ul>
         * <li><p><strong>HOME</strong>: Home address verification</p>
         * </li>
         * <li><p><strong>WORK</strong>: Work address verification</p>
         * </li>
         * </ul>
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
        public AddressVerifyV2IntlRequest build() {
            return new AddressVerifyV2IntlRequest(this);
        } 

    } 

}
