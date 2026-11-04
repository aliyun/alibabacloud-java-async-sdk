// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeDeliveryAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeliveryAddressResponseBody</p>
 */
public class DescribeDeliveryAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<Addresses> addresses;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addresses
     */
    public java.util.List<Addresses> getAddresses() {
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
        private java.util.List<Addresses> addresses; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDeliveryAddressResponseBody model) {
            this.addresses = model.addresses;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of addresses.</p>
         */
        public Builder addresses(java.util.List<Addresses> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>72481C12-69AB-5CE1-8A35-A8EFA921****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of addresses. A maximum of 20 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDeliveryAddressResponseBody build() {
            return new DescribeDeliveryAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeliveryAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeliveryAddressResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Area model) {
                this.areaId = model.areaId;
                this.areaName = model.areaName;
            } 

            /**
             * <p>The district ID.</p>
             * 
             * <strong>example:</strong>
             * <p>33****</p>
             */
            public Builder areaId(Long areaId) {
                this.areaId = areaId;
                return this;
            }

            /**
             * <p>The district name.</p>
             * 
             * <strong>example:</strong>
             * <p>Xihu District</p>
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
    /**
     * 
     * {@link DescribeDeliveryAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeliveryAddressResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(City model) {
                this.cityId = model.cityId;
                this.cityName = model.cityName;
            } 

            /**
             * <p>The city ID.</p>
             * 
             * <strong>example:</strong>
             * <p>33****</p>
             */
            public Builder cityId(Long cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * <p>The city name.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
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
    /**
     * 
     * {@link DescribeDeliveryAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeliveryAddressResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Province model) {
                this.provinceId = model.provinceId;
                this.provinceName = model.provinceName;
            } 

            /**
             * <p>The province ID. For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">Codes for regions, countries, and areas in China</a>. For example, <strong>110000</strong> indicates Beijing, and <strong>120000</strong> indicates Tianjin.</p>
             * 
             * <strong>example:</strong>
             * <p>330000</p>
             */
            public Builder provinceId(Long provinceId) {
                this.provinceId = provinceId;
                return this;
            }

            /**
             * <p>The province name.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang Province</p>
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
    /**
     * 
     * {@link DescribeDeliveryAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeliveryAddressResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Town model) {
                this.townId = model.townId;
                this.townName = model.townName;
            } 

            /**
             * <p>The town ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001****</p>
             */
            public Builder townId(Long townId) {
                this.townId = townId;
                return this;
            }

            /**
             * <p>The town name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sandun Town</p>
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
    /**
     * 
     * {@link DescribeDeliveryAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeliveryAddressResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Addresses model) {
                this.area = model.area;
                this.city = model.city;
                this.contacts = model.contacts;
                this.defaultAddress = model.defaultAddress;
                this.detail = model.detail;
                this.mobile = model.mobile;
                this.postalCode = model.postalCode;
                this.province = model.province;
                this.town = model.town;
            } 

            /**
             * <p>The district.</p>
             */
            public Builder area(Area area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The city.</p>
             */
            public Builder city(City city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder contacts(String contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>Indicates whether the address is the default address.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultAddress(Boolean defaultAddress) {
                this.defaultAddress = defaultAddress;
                return this;
            }

            /**
             * <p>The detailed address, which must be accurate down to the street and building number.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Center, Building 2, Cloud Park, No. 1008 Dengcai Street</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The mobile phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The postal code.</p>
             * 
             * <strong>example:</strong>
             * <p>03****</p>
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * <p>The province.</p>
             */
            public Builder province(Province province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The town.</p>
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
