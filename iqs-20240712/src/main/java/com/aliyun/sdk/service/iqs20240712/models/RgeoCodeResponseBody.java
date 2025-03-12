// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link RgeoCodeResponseBody} extends {@link TeaModel}
 *
 * <p>RgeoCodeResponseBody</p>
 */
public class RgeoCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RgeoCodeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RgeoCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RgeoCodeResponseBody build() {
            return new RgeoCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RgeoCodeResponseBody} extends {@link TeaModel}
     *
     * <p>RgeoCodeResponseBody</p>
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
     * {@link RgeoCodeResponseBody} extends {@link TeaModel}
     *
     * <p>RgeoCodeResponseBody</p>
     */
    public static class BusinessAreas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private BusinessAreas(Builder builder) {
            this.id = builder.id;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessAreas create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String latitude; 
            private String longitude; 
            private String name; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BusinessAreas build() {
                return new BusinessAreas(this);
            } 

        } 

    }
    /**
     * 
     * {@link RgeoCodeResponseBody} extends {@link TeaModel}
     *
     * <p>RgeoCodeResponseBody</p>
     */
    public static class Neighborhood extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Neighborhood(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Neighborhood create() {
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

            public Neighborhood build() {
                return new Neighborhood(this);
            } 

        } 

    }
    /**
     * 
     * {@link RgeoCodeResponseBody} extends {@link TeaModel}
     *
     * <p>RgeoCodeResponseBody</p>
     */
    public static class StreetNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("distanceMeter")
        private String distanceMeter;

        @com.aliyun.core.annotation.NameInMap("latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("street")
        private String street;

        private StreetNumber(Builder builder) {
            this.direction = builder.direction;
            this.distanceMeter = builder.distanceMeter;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.number = builder.number;
            this.street = builder.street;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreetNumber create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return distanceMeter
         */
        public String getDistanceMeter() {
            return this.distanceMeter;
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
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return street
         */
        public String getStreet() {
            return this.street;
        }

        public static final class Builder {
            private String direction; 
            private String distanceMeter; 
            private String latitude; 
            private String longitude; 
            private String number; 
            private String street; 

            /**
             * direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * distanceMeter.
             */
            public Builder distanceMeter(String distanceMeter) {
                this.distanceMeter = distanceMeter;
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
             * street.
             */
            public Builder street(String street) {
                this.street = street;
                return this;
            }

            public StreetNumber build() {
                return new StreetNumber(this);
            } 

        } 

    }
    /**
     * 
     * {@link RgeoCodeResponseBody} extends {@link TeaModel}
     *
     * <p>RgeoCodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("building")
        private Building building;

        @com.aliyun.core.annotation.NameInMap("businessAreas")
        private java.util.List<BusinessAreas> businessAreas;

        @com.aliyun.core.annotation.NameInMap("city")
        private String city;

        @com.aliyun.core.annotation.NameInMap("cityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("district")
        private String district;

        @com.aliyun.core.annotation.NameInMap("districtCode")
        private String districtCode;

        @com.aliyun.core.annotation.NameInMap("formattedAddress")
        private String formattedAddress;

        @com.aliyun.core.annotation.NameInMap("neighborhood")
        private Neighborhood neighborhood;

        @com.aliyun.core.annotation.NameInMap("province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("streetNumber")
        private StreetNumber streetNumber;

        @com.aliyun.core.annotation.NameInMap("townCode")
        private String townCode;

        @com.aliyun.core.annotation.NameInMap("townShip")
        private String townShip;

        private Data(Builder builder) {
            this.building = builder.building;
            this.businessAreas = builder.businessAreas;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.country = builder.country;
            this.district = builder.district;
            this.districtCode = builder.districtCode;
            this.formattedAddress = builder.formattedAddress;
            this.neighborhood = builder.neighborhood;
            this.province = builder.province;
            this.streetNumber = builder.streetNumber;
            this.townCode = builder.townCode;
            this.townShip = builder.townShip;
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
         * @return businessAreas
         */
        public java.util.List<BusinessAreas> getBusinessAreas() {
            return this.businessAreas;
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
         * @return country
         */
        public String getCountry() {
            return this.country;
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
         * @return formattedAddress
         */
        public String getFormattedAddress() {
            return this.formattedAddress;
        }

        /**
         * @return neighborhood
         */
        public Neighborhood getNeighborhood() {
            return this.neighborhood;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return streetNumber
         */
        public StreetNumber getStreetNumber() {
            return this.streetNumber;
        }

        /**
         * @return townCode
         */
        public String getTownCode() {
            return this.townCode;
        }

        /**
         * @return townShip
         */
        public String getTownShip() {
            return this.townShip;
        }

        public static final class Builder {
            private Building building; 
            private java.util.List<BusinessAreas> businessAreas; 
            private String city; 
            private String cityCode; 
            private String country; 
            private String district; 
            private String districtCode; 
            private String formattedAddress; 
            private Neighborhood neighborhood; 
            private String province; 
            private StreetNumber streetNumber; 
            private String townCode; 
            private String townShip; 

            /**
             * building.
             */
            public Builder building(Building building) {
                this.building = building;
                return this;
            }

            /**
             * businessAreas.
             */
            public Builder businessAreas(java.util.List<BusinessAreas> businessAreas) {
                this.businessAreas = businessAreas;
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
             * country.
             */
            public Builder country(String country) {
                this.country = country;
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
             * formattedAddress.
             */
            public Builder formattedAddress(String formattedAddress) {
                this.formattedAddress = formattedAddress;
                return this;
            }

            /**
             * neighborhood.
             */
            public Builder neighborhood(Neighborhood neighborhood) {
                this.neighborhood = neighborhood;
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
             * streetNumber.
             */
            public Builder streetNumber(StreetNumber streetNumber) {
                this.streetNumber = streetNumber;
                return this;
            }

            /**
             * townCode.
             */
            public Builder townCode(String townCode) {
                this.townCode = townCode;
                return this;
            }

            /**
             * townShip.
             */
            public Builder townShip(String townShip) {
                this.townShip = townShip;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
