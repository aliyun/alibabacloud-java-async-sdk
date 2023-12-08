// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Address} extends {@link TeaModel}
 *
 * <p>Address</p>
 */
public class Address extends TeaModel {
    @NameInMap("cityCode")
    @Validation(required = true)
    private String cityCode;

    @NameInMap("detail")
    @Validation(required = true)
    private String detail;

    @NameInMap("districtCode")
    @Validation(required = true)
    private String districtCode;

    @NameInMap("provinceCode")
    @Validation(required = true)
    private String provinceCode;

    private Address(Builder builder) {
        this.cityCode = builder.cityCode;
        this.detail = builder.detail;
        this.districtCode = builder.districtCode;
        this.provinceCode = builder.provinceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Address create() {
        return builder().build();
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return districtCode
     */
    public String getDistrictCode() {
        return this.districtCode;
    }

    /**
     * @return provinceCode
     */
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public static final class Builder {
        private String cityCode; 
        private String detail; 
        private String districtCode; 
        private String provinceCode; 

        /**
         * cityCode.
         */
        public Builder cityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }

        /**
         * detail.
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * districtCode.
         */
        public Builder districtCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }

        /**
         * provinceCode.
         */
        public Builder provinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        } 

    } 

}
