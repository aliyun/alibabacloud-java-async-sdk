// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainViewSourceCountriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainViewSourceCountriesResponseBody</p>
 */
public class DescribeDomainViewSourceCountriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceCountrys")
    private java.util.List < SourceCountrys> sourceCountrys;

    private DescribeDomainViewSourceCountriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sourceCountrys = builder.sourceCountrys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainViewSourceCountriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceCountrys
     */
    public java.util.List < SourceCountrys> getSourceCountrys() {
        return this.sourceCountrys;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SourceCountrys> sourceCountrys; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array consisting of the country or area from which the requests are sent.
         */
        public Builder sourceCountrys(java.util.List < SourceCountrys> sourceCountrys) {
            this.sourceCountrys = sourceCountrys;
            return this;
        }

        public DescribeDomainViewSourceCountriesResponseBody build() {
            return new DescribeDomainViewSourceCountriesResponseBody(this);
        } 

    } 

    public static class SourceCountrys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("CountryId")
        private String countryId;

        private SourceCountrys(Builder builder) {
            this.count = builder.count;
            this.countryId = builder.countryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceCountrys create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return countryId
         */
        public String getCountryId() {
            return this.countryId;
        }

        public static final class Builder {
            private Long count; 
            private String countryId; 

            /**
             * The total number of requests.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The abbreviation of the country or area. For more information, see the **Codes of countries and areas** section of the [Codes of administrative regions in China and codes of countries and areas](~~167926~~) topic. For example, **cn** indicates China, and **us** indicates the United States.
             */
            public Builder countryId(String countryId) {
                this.countryId = countryId;
                return this;
            }

            public SourceCountrys build() {
                return new SourceCountrys(this);
            } 

        } 

    }
}
