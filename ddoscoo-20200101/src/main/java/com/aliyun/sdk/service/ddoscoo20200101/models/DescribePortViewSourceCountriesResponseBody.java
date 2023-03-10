// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortViewSourceCountriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortViewSourceCountriesResponseBody</p>
 */
public class DescribePortViewSourceCountriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceCountrys")
    private java.util.List < SourceCountrys> sourceCountrys;

    private DescribePortViewSourceCountriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sourceCountrys = builder.sourceCountrys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortViewSourceCountriesResponseBody create() {
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
         * An array consisting of countries or areas from which the requests are sent.
         */
        public Builder sourceCountrys(java.util.List < SourceCountrys> sourceCountrys) {
            this.sourceCountrys = sourceCountrys;
            return this;
        }

        public DescribePortViewSourceCountriesResponseBody build() {
            return new DescribePortViewSourceCountriesResponseBody(this);
        } 

    } 

    public static class SourceCountrys extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("CountryId")
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
             * The number of requests.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The abbreviation of the country or area. For example, **cn** indicates China and **us** indicates the United States.
             * <p>
             * 
             * > For more information, see [Location parameters](~~167926~~).
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
