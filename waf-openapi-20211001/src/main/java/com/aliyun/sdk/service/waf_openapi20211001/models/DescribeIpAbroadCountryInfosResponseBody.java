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
         * <p>The list of country information outside China.</p>
         */
        public Builder abroadInfos(java.util.List<AbroadInfos> abroadInfos) {
            this.abroadInfos = abroadInfos;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 500. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>US-CA</p>
             */
            public Builder abroadRegionId(String abroadRegionId) {
                this.abroadRegionId = abroadRegionId;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>California</p>
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
             * <p>The continent to which the country belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>North America</p>
             */
            public Builder continent(String continent) {
                this.continent = continent;
                return this;
            }

            /**
             * <p>The ID of the country.</p>
             * 
             * <strong>example:</strong>
             * <p>US</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The name of the country.</p>
             * 
             * <strong>example:</strong>
             * <p>United States</p>
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * <p>The list of region information outside China.</p>
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
