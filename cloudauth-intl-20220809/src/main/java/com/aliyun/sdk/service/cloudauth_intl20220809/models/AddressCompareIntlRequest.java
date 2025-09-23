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
 * {@link AddressCompareIntlRequest} extends {@link RequestModel}
 *
 * <p>AddressCompareIntlRequest</p>
 */
public class AddressCompareIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCountry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultCountry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text1")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text2")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text2;

    private AddressCompareIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.defaultCountry = builder.defaultCountry;
        this.productCode = builder.productCode;
        this.text1 = builder.text1;
        this.text2 = builder.text2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressCompareIntlRequest create() {
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
     * @return defaultCountry
     */
    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return text1
     */
    public String getText1() {
        return this.text1;
    }

    /**
     * @return text2
     */
    public String getText2() {
        return this.text2;
    }

    public static final class Builder extends Request.Builder<AddressCompareIntlRequest, Builder> {
        private String regionId; 
        private String defaultCountry; 
        private String productCode; 
        private String text1; 
        private String text2; 

        private Builder() {
            super();
        } 

        private Builder(AddressCompareIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.defaultCountry = request.defaultCountry;
            this.productCode = request.productCode;
            this.text1 = request.text1;
            this.text2 = request.text2;
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
         * <p>Country name</p>
         * <ul>
         * <li>China</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fixed value：中国</p>
         */
        public Builder defaultCountry(String defaultCountry) {
            this.putQueryParameter("DefaultCountry", defaultCountry);
            this.defaultCountry = defaultCountry;
            return this;
        }

        /**
         * <p>ADD_VERIFY</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fixed value：ADD_VERIFY</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Address 1</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市阿里巴巴西溪园区</p>
         */
        public Builder text1(String text1) {
            this.putQueryParameter("Text1", text1);
            this.text1 = text1;
            return this;
        }

        /**
         * <p>Address 2</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市文一西路969号1号楼</p>
         */
        public Builder text2(String text2) {
            this.putQueryParameter("Text2", text2);
            this.text2 = text2;
            return this;
        }

        @Override
        public AddressCompareIntlRequest build() {
            return new AddressCompareIntlRequest(this);
        } 

    } 

}
