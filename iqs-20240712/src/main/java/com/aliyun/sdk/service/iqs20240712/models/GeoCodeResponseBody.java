// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GeoCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GeoCodeResponseBody</p>
 */
public class GeoCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GeoCodeResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer errorCode; 
        private String errorMessage; 
        private Boolean success; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GeoCodeResponseBody build() {
            return new GeoCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GeoCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GeoCodeResponseBody</p>
     */
    public static class Building extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Building(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Building create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Building build() {
                return new Building(this);
            } 

        } 

    }
    /**
     * 
     * {@link GeoCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GeoCodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("building")
        private Building building;

        @com.aliyun.core.annotation.NameInMap("city")
        private String city;

        @com.aliyun.core.annotation.NameInMap("cityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("district")
        private String district;

        @com.aliyun.core.annotation.NameInMap("districtCode")
        private String districtCode;

        @com.aliyun.core.annotation.NameInMap("latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("street")
        private String street;

        private Data(Builder builder) {
            this.building = builder.building;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.district = builder.district;
            this.districtCode = builder.districtCode;
            this.latitude = builder.latitude;
            this.level = builder.level;
            this.longitude = builder.longitude;
            this.number = builder.number;
            this.province = builder.province;
            this.street = builder.street;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return building
         */
        public Building getBuilding() {
            return this.building;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return districtCode
         */
        public String getDistrictCode() {
            return this.districtCode;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return street
         */
        public String getStreet() {
            return this.street;
        }

        public static final class Builder {
            private Building building; 
            private String city; 
            private String cityCode; 
            private String district; 
            private String districtCode; 
            private String latitude; 
            private String level; 
            private String longitude; 
            private String number; 
            private String province; 
            private String street; 

            /**
             * building.
             */
            public Builder building(Building building) {
                this.building = building;
                return this;
            }

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * cityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * district.
             */
            public Builder district(String district) {
                this.district = district;
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
             * latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * street.
             */
            public Builder street(String street) {
                this.street = street;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
