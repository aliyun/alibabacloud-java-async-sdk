// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeliveryAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeliveryAddressResponseBody</p>
 */
public class DescribeDeliveryAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List < Addresses> addresses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDeliveryAddressResponseBody(Builder builder) {
        this.addresses = builder.addresses;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeliveryAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return addresses
     */
    public java.util.List < Addresses> getAddresses() {
        return this.addresses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Addresses> addresses; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Addresses.
         */
        public Builder addresses(java.util.List < Addresses> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDeliveryAddressResponseBody build() {
            return new DescribeDeliveryAddressResponseBody(this);
        } 

    } 

    public static class Area extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaId")
        private Long areaId;

        @com.aliyun.core.annotation.NameInMap("AreaName")
        private String areaName;

        private Area(Builder builder) {
            this.areaId = builder.areaId;
            this.areaName = builder.areaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Area create() {
            return builder().build();
        }

        /**
         * @return areaId
         */
        public Long getAreaId() {
            return this.areaId;
        }

        /**
         * @return areaName
         */
        public String getAreaName() {
            return this.areaName;
        }

        public static final class Builder {
            private Long areaId; 
            private String areaName; 

            /**
             * AreaId.
             */
            public Builder areaId(Long areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * AreaName.
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            public Area build() {
                return new Area(this);
            } 

        } 

    }
    public static class City extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityId")
        private Long cityId;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        private City(Builder builder) {
            this.cityId = builder.cityId;
            this.cityName = builder.cityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static City create() {
            return builder().build();
        }

        /**
         * @return cityId
         */
        public Long getCityId() {
            return this.cityId;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        public static final class Builder {
            private Long cityId; 
            private String cityName; 

            /**
             * CityId.
             */
            public Builder cityId(Long cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            public City build() {
                return new City(this);
            } 

        } 

    }
    public static class Province extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProvinceId")
        private Long provinceId;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        private String provinceName;

        private Province(Builder builder) {
            this.provinceId = builder.provinceId;
            this.provinceName = builder.provinceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Province create() {
            return builder().build();
        }

        /**
         * @return provinceId
         */
        public Long getProvinceId() {
            return this.provinceId;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        public static final class Builder {
            private Long provinceId; 
            private String provinceName; 

            /**
             * ProvinceId.
             */
            public Builder provinceId(Long provinceId) {
                this.provinceId = provinceId;
                return this;
            }

            /**
             * ProvinceName.
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            public Province build() {
                return new Province(this);
            } 

        } 

    }
    public static class Town extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TownId")
        private Long townId;

        @com.aliyun.core.annotation.NameInMap("TownName")
        private String townName;

        private Town(Builder builder) {
            this.townId = builder.townId;
            this.townName = builder.townName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Town create() {
            return builder().build();
        }

        /**
         * @return townId
         */
        public Long getTownId() {
            return this.townId;
        }

        /**
         * @return townName
         */
        public String getTownName() {
            return this.townName;
        }

        public static final class Builder {
            private Long townId; 
            private String townName; 

            /**
             * TownId.
             */
            public Builder townId(Long townId) {
                this.townId = townId;
                return this;
            }

            /**
             * TownName.
             */
            public Builder townName(String townName) {
                this.townName = townName;
                return this;
            }

            public Town build() {
                return new Town(this);
            } 

        } 

    }
    public static class Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private Area area;

        @com.aliyun.core.annotation.NameInMap("City")
        private City city;

        @com.aliyun.core.annotation.NameInMap("Contacts")
        private String contacts;

        @com.aliyun.core.annotation.NameInMap("DefaultAddress")
        private Boolean defaultAddress;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("PostalCode")
        private String postalCode;

        @com.aliyun.core.annotation.NameInMap("Province")
        private Province province;

        @com.aliyun.core.annotation.NameInMap("Town")
        private Town town;

        private Addresses(Builder builder) {
            this.area = builder.area;
            this.city = builder.city;
            this.contacts = builder.contacts;
            this.defaultAddress = builder.defaultAddress;
            this.detail = builder.detail;
            this.mobile = builder.mobile;
            this.postalCode = builder.postalCode;
            this.province = builder.province;
            this.town = builder.town;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addresses create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public Area getArea() {
            return this.area;
        }

        /**
         * @return city
         */
        public City getCity() {
            return this.city;
        }

        /**
         * @return contacts
         */
        public String getContacts() {
            return this.contacts;
        }

        /**
         * @return defaultAddress
         */
        public Boolean getDefaultAddress() {
            return this.defaultAddress;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return postalCode
         */
        public String getPostalCode() {
            return this.postalCode;
        }

        /**
         * @return province
         */
        public Province getProvince() {
            return this.province;
        }

        /**
         * @return town
         */
        public Town getTown() {
            return this.town;
        }

        public static final class Builder {
            private Area area; 
            private City city; 
            private String contacts; 
            private Boolean defaultAddress; 
            private String detail; 
            private String mobile; 
            private String postalCode; 
            private Province province; 
            private Town town; 

            /**
             * Area.
             */
            public Builder area(Area area) {
                this.area = area;
                return this;
            }

            /**
             * City.
             */
            public Builder city(City city) {
                this.city = city;
                return this;
            }

            /**
             * Contacts.
             */
            public Builder contacts(String contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * DefaultAddress.
             */
            public Builder defaultAddress(Boolean defaultAddress) {
                this.defaultAddress = defaultAddress;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * PostalCode.
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(Province province) {
                this.province = province;
                return this;
            }

            /**
             * Town.
             */
            public Builder town(Town town) {
                this.town = town;
                return this;
            }

            public Addresses build() {
                return new Addresses(this);
            } 

        } 

    }
}
