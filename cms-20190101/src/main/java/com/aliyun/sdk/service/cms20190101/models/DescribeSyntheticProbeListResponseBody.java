// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeSyntheticProbeListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyntheticProbeListResponseBody</p>
 */
public class DescribeSyntheticProbeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IspCityList")
    private java.util.List<IspCityList> ispCityList;

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
     * @return ispCityList
     */
    public java.util.List<IspCityList> getIspCityList() {
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
        private java.util.List<IspCityList> ispCityList; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSyntheticProbeListResponseBody model) {
            this.code = model.code;
            this.ispCityList = model.ispCityList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of detection points.</p>
         */
        public Builder ispCityList(java.util.List<IspCityList> ispCityList) {
            this.ispCityList = ispCityList;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>87170bc7-e28a-4c93-b9bf-90a1dbe84736</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li>true: The operation is successful.</li>
         * <li>false: The operation fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
        private java.util.List<String> ipPool;

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
        public java.util.List<String> getIpPool() {
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
            private java.util.List<String> ipPool; 
            private String isp; 
            private String ispCn; 
            private String ispEn; 
            private Integer lmProbeCount; 
            private Integer mbProbeCount; 
            private String region; 
            private String regionCn; 
            private String regionEn; 

            private Builder() {
            } 

            private Builder(IspCityList model) {
                this.areaCn = model.areaCn;
                this.areaEn = model.areaEn;
                this.city = model.city;
                this.cityCn = model.cityCn;
                this.cityEn = model.cityEn;
                this.country = model.country;
                this.countryCn = model.countryCn;
                this.countryEn = model.countryEn;
                this.idcV4ProbeCount = model.idcV4ProbeCount;
                this.idcV6ProbeCount = model.idcV6ProbeCount;
                this.ipPool = model.ipPool;
                this.isp = model.isp;
                this.ispCn = model.ispCn;
                this.ispEn = model.ispEn;
                this.lmProbeCount = model.lmProbeCount;
                this.mbProbeCount = model.mbProbeCount;
                this.region = model.region;
                this.regionCn = model.regionCn;
                this.regionEn = model.regionEn;
            } 

            /**
             * <p>The Chinese name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>North China</p>
             */
            public Builder areaCn(String areaCn) {
                this.areaCn = areaCn;
                return this;
            }

            /**
             * <p>The English name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>Huabei</p>
             */
            public Builder areaEn(String areaEn) {
                this.areaEn = areaEn;
                return this;
            }

            /**
             * <p>The city ID.</p>
             * 
             * <strong>example:</strong>
             * <p>738</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The Chinese name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder cityCn(String cityCn) {
                this.cityCn = cityCn;
                return this;
            }

            /**
             * <p>The English name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder cityEn(String cityEn) {
                this.cityEn = cityEn;
                return this;
            }

            /**
             * <p>The country code.</p>
             * 
             * <strong>example:</strong>
             * <p>629</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The Chinese name of the country.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder countryCn(String countryCn) {
                this.countryCn = countryCn;
                return this;
            }

            /**
             * <p>The English name of the country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder countryEn(String countryEn) {
                this.countryEn = countryEn;
                return this;
            }

            /**
             * <p>The number of IPv4 nodes in the IDC.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder idcV4ProbeCount(Integer idcV4ProbeCount) {
                this.idcV4ProbeCount = idcV4ProbeCount;
                return this;
            }

            /**
             * <p>The number of IPv6 nodes in the IDC.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder idcV6ProbeCount(Integer idcV6ProbeCount) {
                this.idcV6ProbeCount = idcV6ProbeCount;
                return this;
            }

            /**
             * <p>The list of node IP addresses.</p>
             */
            public Builder ipPool(java.util.List<String> ipPool) {
                this.ipPool = ipPool;
                return this;
            }

            /**
             * <p>The carrier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>232</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The Chinese name of the carrier.</p>
             * 
             * <strong>example:</strong>
             * <p>China Unicom</p>
             */
            public Builder ispCn(String ispCn) {
                this.ispCn = ispCn;
                return this;
            }

            /**
             * <p>The English name of the carrier.</p>
             * 
             * <strong>example:</strong>
             * <p>China-Unicom</p>
             */
            public Builder ispEn(String ispEn) {
                this.ispEn = ispEn;
                return this;
            }

            /**
             * <p>The number of Lastmile detection points.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lmProbeCount(Integer lmProbeCount) {
                this.lmProbeCount = lmProbeCount;
                return this;
            }

            /**
             * <p>The number of mobile detection points.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mbProbeCount(Integer mbProbeCount) {
                this.mbProbeCount = mbProbeCount;
                return this;
            }

            /**
             * <p>The province code.</p>
             * 
             * <strong>example:</strong>
             * <p>264</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The Chinese name of the province.</p>
             * 
             * <strong>example:</strong>
             * <p>Jiangxi</p>
             */
            public Builder regionCn(String regionCn) {
                this.regionCn = regionCn;
                return this;
            }

            /**
             * <p>The English name of the province.</p>
             * 
             * <strong>example:</strong>
             * <p>Jiangxi</p>
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
