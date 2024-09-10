// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorISPCityListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorISPCityListResponseBody</p>
 */
public class DescribeSiteMonitorISPCityListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IspCityList")
    private IspCityList ispCityList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSiteMonitorISPCityListResponseBody(Builder builder) {
        this.code = builder.code;
        this.ispCityList = builder.ispCityList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorISPCityListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return ispCityList
     */
    public IspCityList getIspCityList() {
        return this.ispCityList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private IspCityList ispCityList; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The queried detection points.
         */
        public Builder ispCityList(IspCityList ispCityList) {
            this.ispCityList = ispCityList;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSiteMonitorISPCityListResponseBody build() {
            return new DescribeSiteMonitorISPCityListResponseBody(this);
        } 

    } 

    public static class IPPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPPool")
        private java.util.List < String > IPPool;

        private IPPool(Builder builder) {
            this.IPPool = builder.IPPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPPool create() {
            return builder().build();
        }

        /**
         * @return IPPool
         */
        public java.util.List < String > getIPPool() {
            return this.IPPool;
        }

        public static final class Builder {
            private java.util.List < String > IPPool; 

            /**
             * IPPool.
             */
            public Builder IPPool(java.util.List < String > IPPool) {
                this.IPPool = IPPool;
                return this;
            }

            public IPPool build() {
                return new IPPool(this);
            } 

        } 

    }
    public static class IspCity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area.en")
        private String area_en;

        @com.aliyun.core.annotation.NameInMap("Area.zh_CN")
        private String area_zh_cN;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CityName.en")
        private String cityName_en;

        @com.aliyun.core.annotation.NameInMap("CityName.zh_CN")
        private String cityName_zh_cN;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Country.en")
        private String country_en;

        @com.aliyun.core.annotation.NameInMap("Country.zh_CN")
        private String country_zh_cN;

        @com.aliyun.core.annotation.NameInMap("IPPool")
        private IPPool IPPool;

        @com.aliyun.core.annotation.NameInMap("IPV4ProbeCount")
        private String IPV4ProbeCount;

        @com.aliyun.core.annotation.NameInMap("IPV6ProbeCount")
        private String IPV6ProbeCount;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("IspName.en")
        private String ispName_en;

        @com.aliyun.core.annotation.NameInMap("IspName.zh_CN")
        private String ispName_zh_cN;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Region.en")
        private String region_en;

        @com.aliyun.core.annotation.NameInMap("Region.zh_CN")
        private String region_zh_cN;

        private IspCity(Builder builder) {
            this.area_en = builder.area_en;
            this.area_zh_cN = builder.area_zh_cN;
            this.city = builder.city;
            this.cityName_en = builder.cityName_en;
            this.cityName_zh_cN = builder.cityName_zh_cN;
            this.country = builder.country;
            this.country_en = builder.country_en;
            this.country_zh_cN = builder.country_zh_cN;
            this.IPPool = builder.IPPool;
            this.IPV4ProbeCount = builder.IPV4ProbeCount;
            this.IPV6ProbeCount = builder.IPV6ProbeCount;
            this.isp = builder.isp;
            this.ispName_en = builder.ispName_en;
            this.ispName_zh_cN = builder.ispName_zh_cN;
            this.region = builder.region;
            this.region_en = builder.region_en;
            this.region_zh_cN = builder.region_zh_cN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCity create() {
            return builder().build();
        }

        /**
         * @return area_en
         */
        public String getArea_en() {
            return this.area_en;
        }

        /**
         * @return area_zh_cN
         */
        public String getArea_zh_cN() {
            return this.area_zh_cN;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityName_en
         */
        public String getCityName_en() {
            return this.cityName_en;
        }

        /**
         * @return cityName_zh_cN
         */
        public String getCityName_zh_cN() {
            return this.cityName_zh_cN;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return country_en
         */
        public String getCountry_en() {
            return this.country_en;
        }

        /**
         * @return country_zh_cN
         */
        public String getCountry_zh_cN() {
            return this.country_zh_cN;
        }

        /**
         * @return IPPool
         */
        public IPPool getIPPool() {
            return this.IPPool;
        }

        /**
         * @return IPV4ProbeCount
         */
        public String getIPV4ProbeCount() {
            return this.IPV4ProbeCount;
        }

        /**
         * @return IPV6ProbeCount
         */
        public String getIPV6ProbeCount() {
            return this.IPV6ProbeCount;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return ispName_en
         */
        public String getIspName_en() {
            return this.ispName_en;
        }

        /**
         * @return ispName_zh_cN
         */
        public String getIspName_zh_cN() {
            return this.ispName_zh_cN;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return region_en
         */
        public String getRegion_en() {
            return this.region_en;
        }

        /**
         * @return region_zh_cN
         */
        public String getRegion_zh_cN() {
            return this.region_zh_cN;
        }

        public static final class Builder {
            private String area_en; 
            private String area_zh_cN; 
            private String city; 
            private String cityName_en; 
            private String cityName_zh_cN; 
            private String country; 
            private String country_en; 
            private String country_zh_cN; 
            private IPPool IPPool; 
            private String IPV4ProbeCount; 
            private String IPV6ProbeCount; 
            private String isp; 
            private String ispName_en; 
            private String ispName_zh_cN; 
            private String region; 
            private String region_en; 
            private String region_zh_cN; 

            /**
             * Area.en.
             */
            public Builder area_en(String area_en) {
                this.area_en = area_en;
                return this;
            }

            /**
             * Area.zh_CN.
             */
            public Builder area_zh_cN(String area_zh_cN) {
                this.area_zh_cN = area_zh_cN;
                return this;
            }

            /**
             * The city ID.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CityName.en.
             */
            public Builder cityName_en(String cityName_en) {
                this.cityName_en = cityName_en;
                return this;
            }

            /**
             * CityName.zh_CN.
             */
            public Builder cityName_zh_cN(String cityName_zh_cN) {
                this.cityName_zh_cN = cityName_zh_cN;
                return this;
            }

            /**
             * The country name.
             * <p>
             * 
             * > This parameter is valid only on the China site (aliyun.com).
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Country.en.
             */
            public Builder country_en(String country_en) {
                this.country_en = country_en;
                return this;
            }

            /**
             * Country.zh_CN.
             */
            public Builder country_zh_cN(String country_zh_cN) {
                this.country_zh_cN = country_zh_cN;
                return this;
            }

            /**
             * The IP address pool.
             */
            public Builder IPPool(IPPool IPPool) {
                this.IPPool = IPPool;
                return this;
            }

            /**
             * The number of IPv4 probes.
             */
            public Builder IPV4ProbeCount(String IPV4ProbeCount) {
                this.IPV4ProbeCount = IPV4ProbeCount;
                return this;
            }

            /**
             * The number of IPv6 probes.
             */
            public Builder IPV6ProbeCount(String IPV6ProbeCount) {
                this.IPV6ProbeCount = IPV6ProbeCount;
                return this;
            }

            /**
             * The carrier ID.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * IspName.en.
             */
            public Builder ispName_en(String ispName_en) {
                this.ispName_en = ispName_en;
                return this;
            }

            /**
             * IspName.zh_CN.
             */
            public Builder ispName_zh_cN(String ispName_zh_cN) {
                this.ispName_zh_cN = ispName_zh_cN;
                return this;
            }

            /**
             * The province name.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Region.en.
             */
            public Builder region_en(String region_en) {
                this.region_en = region_en;
                return this;
            }

            /**
             * Region.zh_CN.
             */
            public Builder region_zh_cN(String region_zh_cN) {
                this.region_zh_cN = region_zh_cN;
                return this;
            }

            public IspCity build() {
                return new IspCity(this);
            } 

        } 

    }
    public static class IspCityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IspCity")
        private java.util.List < IspCity> ispCity;

        private IspCityList(Builder builder) {
            this.ispCity = builder.ispCity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityList create() {
            return builder().build();
        }

        /**
         * @return ispCity
         */
        public java.util.List < IspCity> getIspCity() {
            return this.ispCity;
        }

        public static final class Builder {
            private java.util.List < IspCity> ispCity; 

            /**
             * IspCity.
             */
            public Builder ispCity(java.util.List < IspCity> ispCity) {
                this.ispCity = ispCity;
                return this;
            }

            public IspCityList build() {
                return new IspCityList(this);
            } 

        } 

    }
}
