// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainViewSourceProvincesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainViewSourceProvincesResponseBody</p>
 */
public class DescribeDomainViewSourceProvincesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceProvinces")
    private java.util.List < SourceProvinces> sourceProvinces;

    private DescribeDomainViewSourceProvincesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sourceProvinces = builder.sourceProvinces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainViewSourceProvincesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceProvinces
     */
    public java.util.List < SourceProvinces> getSourceProvinces() {
        return this.sourceProvinces;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SourceProvinces> sourceProvinces; 

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
         * <p>An array consisting of the details of the administrative region in China from which the requests are sent.</p>
         */
        public Builder sourceProvinces(java.util.List < SourceProvinces> sourceProvinces) {
            this.sourceProvinces = sourceProvinces;
            return this;
        }

        public DescribeDomainViewSourceProvincesResponseBody build() {
            return new DescribeDomainViewSourceProvincesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainViewSourceProvincesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainViewSourceProvincesResponseBody</p>
     */
    public static class SourceProvinces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("ProvinceId")
        private String provinceId;

        private SourceProvinces(Builder builder) {
            this.count = builder.count;
            this.provinceId = builder.provinceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceProvinces create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return provinceId
         */
        public String getProvinceId() {
            return this.provinceId;
        }

        public static final class Builder {
            private Long count; 
            private String provinceId; 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>3390671</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The ID of the region inside China. For more information, see the <strong>Codes of administrative regions in China</strong> section of the <a href="https://help.aliyun.com/document_detail/167926.html">Codes of administrative regions in China and codes of countries and areas</a> topic. For example, <strong>110000</strong> indicates Beijing, and <strong>120000</strong> indicates Tianjin.</p>
             * 
             * <strong>example:</strong>
             * <p>440000</p>
             */
            public Builder provinceId(String provinceId) {
                this.provinceId = provinceId;
                return this;
            }

            public SourceProvinces build() {
                return new SourceProvinces(this);
            } 

        } 

    }
}
