// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.address_purification20191118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAddressSimilarityRequest} extends {@link RequestModel}
 *
 * <p>GetAddressSimilarityRequest</p>
 */
public class GetAddressSimilarityRequest extends Request {
    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("DefaultCity")
    private String defaultCity;

    @Body
    @NameInMap("DefaultDistrict")
    private String defaultDistrict;

    @Body
    @NameInMap("DefaultProvince")
    private String defaultProvince;

    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    @Body
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    private GetAddressSimilarityRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.defaultCity = builder.defaultCity;
        this.defaultDistrict = builder.defaultDistrict;
        this.defaultProvince = builder.defaultProvince;
        this.serviceCode = builder.serviceCode;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddressSimilarityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return defaultCity
     */
    public String getDefaultCity() {
        return this.defaultCity;
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
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<GetAddressSimilarityRequest, Builder> {
        private String appKey; 
        private String defaultCity; 
        private String defaultDistrict; 
        private String defaultProvince; 
        private String serviceCode; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(GetAddressSimilarityRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.defaultCity = request.defaultCity;
            this.defaultDistrict = request.defaultDistrict;
            this.defaultProvince = request.defaultProvince;
            this.serviceCode = request.serviceCode;
            this.text = request.text;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * DefaultCity.
         */
        public Builder defaultCity(String defaultCity) {
            this.putBodyParameter("DefaultCity", defaultCity);
            this.defaultCity = defaultCity;
            return this;
        }

        /**
         * DefaultDistrict.
         */
        public Builder defaultDistrict(String defaultDistrict) {
            this.putBodyParameter("DefaultDistrict", defaultDistrict);
            this.defaultDistrict = defaultDistrict;
            return this;
        }

        /**
         * DefaultProvince.
         */
        public Builder defaultProvince(String defaultProvince) {
            this.putBodyParameter("DefaultProvince", defaultProvince);
            this.defaultProvince = defaultProvince;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public GetAddressSimilarityRequest build() {
            return new GetAddressSimilarityRequest(this);
        } 

    } 

}
