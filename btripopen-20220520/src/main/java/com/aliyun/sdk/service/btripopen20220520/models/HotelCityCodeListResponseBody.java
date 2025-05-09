// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link HotelCityCodeListResponseBody} extends {@link TeaModel}
 *
 * <p>HotelCityCodeListResponseBody</p>
 */
public class HotelCityCodeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Module> getModule() {
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
        private java.util.List<Module> module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(HotelCityCodeListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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
        public Builder module(java.util.List<Module> module) {
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

    /**
     * 
     * {@link HotelCityCodeListResponseBody} extends {@link TeaModel}
     *
     * <p>HotelCityCodeListResponseBody</p>
     */
    public static class Districts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("district_code")
        private String districtCode;

        @com.aliyun.core.annotation.NameInMap("district_name")
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

            private Builder() {
            } 

            private Builder(Districts model) {
                this.districtCode = model.districtCode;
                this.districtName = model.districtName;
            } 

            /**
             * district_code.
             */
            public Builder districtCode(String districtCode) {
                this.districtCode = districtCode;
                return this;
            }

            /**
             * district_name.
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
    /**
     * 
     * {@link HotelCityCodeListResponseBody} extends {@link TeaModel}
     *
     * <p>HotelCityCodeListResponseBody</p>
     */
    public static class Citys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("districts")
        private java.util.List<Districts> districts;

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
        public java.util.List<Districts> getDistricts() {
            return this.districts;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private java.util.List<Districts> districts; 

            private Builder() {
            } 

            private Builder(Citys model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.districts = model.districts;
            } 

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * districts.
             */
            public Builder districts(java.util.List<Districts> districts) {
                this.districts = districts;
                return this;
            }

            public Citys build() {
                return new Citys(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelCityCodeListResponseBody} extends {@link TeaModel}
     *
     * <p>HotelCityCodeListResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("citys")
        private java.util.List<Citys> citys;

        @com.aliyun.core.annotation.NameInMap("provice_code")
        private String proviceCode;

        @com.aliyun.core.annotation.NameInMap("province_name")
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
        public java.util.List<Citys> getCitys() {
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
            private java.util.List<Citys> citys; 
            private String proviceCode; 
            private String provinceName; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.citys = model.citys;
                this.proviceCode = model.proviceCode;
                this.provinceName = model.provinceName;
            } 

            /**
             * citys.
             */
            public Builder citys(java.util.List<Citys> citys) {
                this.citys = citys;
                return this;
            }

            /**
             * provice_code.
             */
            public Builder proviceCode(String proviceCode) {
                this.proviceCode = proviceCode;
                return this;
            }

            /**
             * province_name.
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
