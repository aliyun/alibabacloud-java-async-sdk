// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeIpAbroadCountryInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpAbroadCountryInfosResponseBody</p>
 */
public class DescribeIpAbroadCountryInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbroadInfos")
    private java.util.List<AbroadInfos> abroadInfos;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIpAbroadCountryInfosResponseBody(Builder builder) {
        this.abroadInfos = builder.abroadInfos;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpAbroadCountryInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abroadInfos
     */
    public java.util.List<AbroadInfos> getAbroadInfos() {
        return this.abroadInfos;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<AbroadInfos> abroadInfos; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeIpAbroadCountryInfosResponseBody model) {
            this.abroadInfos = model.abroadInfos;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AbroadInfos.
         */
        public Builder abroadInfos(java.util.List<AbroadInfos> abroadInfos) {
            this.abroadInfos = abroadInfos;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public DescribeIpAbroadCountryInfosResponseBody build() {
            return new DescribeIpAbroadCountryInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpAbroadCountryInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpAbroadCountryInfosResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbroadRegionId")
        private String abroadRegionId;

        @com.aliyun.core.annotation.NameInMap("AbroadRegionName")
        private String abroadRegionName;

        private Regions(Builder builder) {
            this.abroadRegionId = builder.abroadRegionId;
            this.abroadRegionName = builder.abroadRegionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return abroadRegionId
         */
        public String getAbroadRegionId() {
            return this.abroadRegionId;
        }

        /**
         * @return abroadRegionName
         */
        public String getAbroadRegionName() {
            return this.abroadRegionName;
        }

        public static final class Builder {
            private String abroadRegionId; 
            private String abroadRegionName; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.abroadRegionId = model.abroadRegionId;
                this.abroadRegionName = model.abroadRegionName;
            } 

            /**
             * AbroadRegionId.
             */
            public Builder abroadRegionId(String abroadRegionId) {
                this.abroadRegionId = abroadRegionId;
                return this;
            }

            /**
             * AbroadRegionName.
             */
            public Builder abroadRegionName(String abroadRegionName) {
                this.abroadRegionName = abroadRegionName;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIpAbroadCountryInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpAbroadCountryInfosResponseBody</p>
     */
    public static class AbroadInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Continent")
        private String continent;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("CountryName")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private java.util.List<Regions> regions;

        private AbroadInfos(Builder builder) {
            this.continent = builder.continent;
            this.country = builder.country;
            this.countryName = builder.countryName;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AbroadInfos create() {
            return builder().build();
        }

        /**
         * @return continent
         */
        public String getContinent() {
            return this.continent;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return regions
         */
        public java.util.List<Regions> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private String continent; 
            private String country; 
            private String countryName; 
            private java.util.List<Regions> regions; 

            private Builder() {
            } 

            private Builder(AbroadInfos model) {
                this.continent = model.continent;
                this.country = model.country;
                this.countryName = model.countryName;
                this.regions = model.regions;
            } 

            /**
             * Continent.
             */
            public Builder continent(String continent) {
                this.continent = continent;
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
             * CountryName.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * Regions.
             */
            public Builder regions(java.util.List<Regions> regions) {
                this.regions = regions;
                return this;
            }

            public AbroadInfos build() {
                return new AbroadInfos(this);
            } 

        } 

    }
}
