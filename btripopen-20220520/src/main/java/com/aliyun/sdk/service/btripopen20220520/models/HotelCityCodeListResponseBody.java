// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelCityCodeListResponseBody} extends {@link TeaModel}
 *
 * <p>HotelCityCodeListResponseBody</p>
 */
public class HotelCityCodeListResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private java.util.List < Module> module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private HotelCityCodeListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelCityCodeListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public java.util.List < Module> getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < Module> module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(java.util.List < Module> module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelCityCodeListResponseBody build() {
            return new HotelCityCodeListResponseBody(this);
        } 

    } 

    public static class Districts extends TeaModel {
        @NameInMap("district_code")
        private String districtCode;

        @NameInMap("district_name")
        private String districtName;

        private Districts(Builder builder) {
            this.districtCode = builder.districtCode;
            this.districtName = builder.districtName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Districts create() {
            return builder().build();
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

        public static final class Builder {
            private String districtCode; 
            private String districtName; 

            /**
             * 行程区code
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
                return this;
            }

            /**
             * 行程区名称
             */
            public Builder districtName(String districtName) {
                this.districtName = districtName;
                return this;
            }

            public Districts build() {
                return new Districts(this);
            } 

        } 

    }
    public static class Citys extends TeaModel {
        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("districts")
        private java.util.List < Districts> districts;

        private Citys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.districts = builder.districts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Citys create() {
            return builder().build();
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
         * @return districts
         */
        public java.util.List < Districts> getDistricts() {
            return this.districts;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private java.util.List < Districts> districts; 

            /**
             * 城市code
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * 城市名称
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * 行政区列表
             */
            public Builder districts(java.util.List < Districts> districts) {
                this.districts = districts;
                return this;
            }

            public Citys build() {
                return new Citys(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("citys")
        private java.util.List < Citys> citys;

        @NameInMap("provice_code")
        private String proviceCode;

        @NameInMap("province_name")
        private String provinceName;

        private Module(Builder builder) {
            this.citys = builder.citys;
            this.proviceCode = builder.proviceCode;
            this.provinceName = builder.provinceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return citys
         */
        public java.util.List < Citys> getCitys() {
            return this.citys;
        }

        /**
         * @return proviceCode
         */
        public String getProviceCode() {
            return this.proviceCode;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        public static final class Builder {
            private java.util.List < Citys> citys; 
            private String proviceCode; 
            private String provinceName; 

            /**
             * 城市列表
             */
            public Builder citys(java.util.List < Citys> citys) {
                this.citys = citys;
                return this;
            }

            /**
             * 省份code
             */
            public Builder proviceCode(String proviceCode) {
                this.proviceCode = proviceCode;
                return this;
            }

            /**
             * 省份名称
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
