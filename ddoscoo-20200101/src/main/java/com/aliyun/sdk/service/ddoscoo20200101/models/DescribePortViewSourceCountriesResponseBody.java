// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribePortViewSourceCountriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortViewSourceCountriesResponseBody</p>
 */
public class DescribePortViewSourceCountriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceCountrys")
    private java.util.List<SourceCountrys> sourceCountrys;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SourceCountrys> getSourceCountrys() {
        return this.sourceCountrys;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SourceCountrys> sourceCountrys; 

        private Builder() {
        } 

        private Builder(DescribePortViewSourceCountriesResponseBody model) {
            this.requestId = model.requestId;
            this.sourceCountrys = model.sourceCountrys;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the country or area from which the requests are sent.</p>
         */
        public Builder sourceCountrys(java.util.List<SourceCountrys> sourceCountrys) {
            this.sourceCountrys = sourceCountrys;
            return this;
        }

        public DescribePortViewSourceCountriesResponseBody build() {
            return new DescribePortViewSourceCountriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortViewSourceCountriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortViewSourceCountriesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SourceCountrys model) {
                this.count = model.count;
                this.countryId = model.countryId;
            } 

            /**
             * <p>The number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>3390671</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The abbreviation of the country or area. For example, <strong>cn</strong> indicates China and <strong>us</strong> indicates the United States.</p>
             * <blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">Location parameters</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
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
