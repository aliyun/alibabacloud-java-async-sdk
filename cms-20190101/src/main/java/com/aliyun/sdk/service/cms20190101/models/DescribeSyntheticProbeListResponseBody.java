// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyntheticProbeListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyntheticProbeListResponseBody</p>
 */
public class DescribeSyntheticProbeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IspCityList")
    private java.util.List < IspCityList> ispCityList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSyntheticProbeListResponseBody(Builder builder) {
        this.code = builder.code;
        this.ispCityList = builder.ispCityList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyntheticProbeListResponseBody create() {
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
    public java.util.List < IspCityList> getIspCityList() {
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
        private java.util.List < IspCityList> ispCityList; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IspCityList.
         */
        public Builder ispCityList(java.util.List < IspCityList> ispCityList) {
            this.ispCityList = ispCityList;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSyntheticProbeListResponseBody build() {
            return new DescribeSyntheticProbeListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyntheticProbeListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyntheticProbeListResponseBody</p>
     */
    public static class IspCityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaCn")
        private String areaCn;

        @com.aliyun.core.annotation.NameInMap("AreaEn")
        private String areaEn;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CityCn")
        private String cityCn;

        @com.aliyun.core.annotation.NameInMap("CityEn")
        private String cityEn;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("CountryCn")
        private String countryCn;

        @com.aliyun.core.annotation.NameInMap("CountryEn")
        private String countryEn;

        @com.aliyun.core.annotation.NameInMap("IdcV4ProbeCount")
        private Integer idcV4ProbeCount;

        @com.aliyun.core.annotation.NameInMap("IdcV6ProbeCount")
        private Integer idcV6ProbeCount;

        @com.aliyun.core.annotation.NameInMap("IpPool")
        private java.util.List < String > ipPool;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("IspCn")
        private String ispCn;

        @com.aliyun.core.annotation.NameInMap("IspEn")
        private String ispEn;

        @com.aliyun.core.annotation.NameInMap("LmProbeCount")
        private Integer lmProbeCount;

        @com.aliyun.core.annotation.NameInMap("MbProbeCount")
        private Integer mbProbeCount;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionCn")
        private String regionCn;

        @com.aliyun.core.annotation.NameInMap("RegionEn")
        private String regionEn;

        private IspCityList(Builder builder) {
            this.areaCn = builder.areaCn;
            this.areaEn = builder.areaEn;
            this.city = builder.city;
            this.cityCn = builder.cityCn;
            this.cityEn = builder.cityEn;
            this.country = builder.country;
            this.countryCn = builder.countryCn;
            this.countryEn = builder.countryEn;
            this.idcV4ProbeCount = builder.idcV4ProbeCount;
            this.idcV6ProbeCount = builder.idcV6ProbeCount;
            this.ipPool = builder.ipPool;
            this.isp = builder.isp;
            this.ispCn = builder.ispCn;
            this.ispEn = builder.ispEn;
            this.lmProbeCount = builder.lmProbeCount;
            this.mbProbeCount = builder.mbProbeCount;
            this.region = builder.region;
            this.regionCn = builder.regionCn;
            this.regionEn = builder.regionEn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityList create() {
            return builder().build();
        }

        /**
         * @return areaCn
         */
        public String getAreaCn() {
            return this.areaCn;
        }

        /**
         * @return areaEn
         */
        public String getAreaEn() {
            return this.areaEn;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityCn
         */
        public String getCityCn() {
            return this.cityCn;
        }

        /**
         * @return cityEn
         */
        public String getCityEn() {
            return this.cityEn;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return countryCn
         */
        public String getCountryCn() {
            return this.countryCn;
        }

        /**
         * @return countryEn
         */
        public String getCountryEn() {
            return this.countryEn;
        }

        /**
         * @return idcV4ProbeCount
         */
        public Integer getIdcV4ProbeCount() {
            return this.idcV4ProbeCount;
        }

        /**
         * @return idcV6ProbeCount
         */
        public Integer getIdcV6ProbeCount() {
            return this.idcV6ProbeCount;
        }

        /**
         * @return ipPool
         */
        public java.util.List < String > getIpPool() {
            return this.ipPool;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return ispCn
         */
        public String getIspCn() {
            return this.ispCn;
        }

        /**
         * @return ispEn
         */
        public String getIspEn() {
            return this.ispEn;
        }

        /**
         * @return lmProbeCount
         */
        public Integer getLmProbeCount() {
            return this.lmProbeCount;
        }

        /**
         * @return mbProbeCount
         */
        public Integer getMbProbeCount() {
            return this.mbProbeCount;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionCn
         */
        public String getRegionCn() {
            return this.regionCn;
        }

        /**
         * @return regionEn
         */
        public String getRegionEn() {
            return this.regionEn;
        }

        public static final class Builder {
            private String areaCn; 
            private String areaEn; 
            private String city; 
            private String cityCn; 
            private String cityEn; 
            private String country; 
            private String countryCn; 
            private String countryEn; 
            private Integer idcV4ProbeCount; 
            private Integer idcV6ProbeCount; 
            private java.util.List < String > ipPool; 
            private String isp; 
            private String ispCn; 
            private String ispEn; 
            private Integer lmProbeCount; 
            private Integer mbProbeCount; 
            private String region; 
            private String regionCn; 
            private String regionEn; 

            /**
             * AreaCn.
             */
            public Builder areaCn(String areaCn) {
                this.areaCn = areaCn;
                return this;
            }

            /**
             * AreaEn.
             */
            public Builder areaEn(String areaEn) {
                this.areaEn = areaEn;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CityCn.
             */
            public Builder cityCn(String cityCn) {
                this.cityCn = cityCn;
                return this;
            }

            /**
             * CityEn.
             */
            public Builder cityEn(String cityEn) {
                this.cityEn = cityEn;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * CountryCn.
             */
            public Builder countryCn(String countryCn) {
                this.countryCn = countryCn;
                return this;
            }

            /**
             * CountryEn.
             */
            public Builder countryEn(String countryEn) {
                this.countryEn = countryEn;
                return this;
            }

            /**
             * IdcV4ProbeCount.
             */
            public Builder idcV4ProbeCount(Integer idcV4ProbeCount) {
                this.idcV4ProbeCount = idcV4ProbeCount;
                return this;
            }

            /**
             * IdcV6ProbeCount.
             */
            public Builder idcV6ProbeCount(Integer idcV6ProbeCount) {
                this.idcV6ProbeCount = idcV6ProbeCount;
                return this;
            }

            /**
             * IpPool.
             */
            public Builder ipPool(java.util.List < String > ipPool) {
                this.ipPool = ipPool;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * IspCn.
             */
            public Builder ispCn(String ispCn) {
                this.ispCn = ispCn;
                return this;
            }

            /**
             * IspEn.
             */
            public Builder ispEn(String ispEn) {
                this.ispEn = ispEn;
                return this;
            }

            /**
             * LmProbeCount.
             */
            public Builder lmProbeCount(Integer lmProbeCount) {
                this.lmProbeCount = lmProbeCount;
                return this;
            }

            /**
             * MbProbeCount.
             */
            public Builder mbProbeCount(Integer mbProbeCount) {
                this.mbProbeCount = mbProbeCount;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RegionCn.
             */
            public Builder regionCn(String regionCn) {
                this.regionCn = regionCn;
                return this;
            }

            /**
             * RegionEn.
             */
            public Builder regionEn(String regionEn) {
                this.regionEn = regionEn;
                return this;
            }

            public IspCityList build() {
                return new IspCityList(this);
            } 

        } 

    }
}
