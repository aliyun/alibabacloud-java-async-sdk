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
 * {@link DescribePortViewSourceProvincesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortViewSourceProvincesResponseBody</p>
 */
public class DescribePortViewSourceProvincesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceProvinces")
    private java.util.List<SourceProvinces> sourceProvinces;

    private DescribePortViewSourceProvincesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sourceProvinces = builder.sourceProvinces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortViewSourceProvincesResponseBody create() {
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
     * @return sourceProvinces
     */
    public java.util.List<SourceProvinces> getSourceProvinces() {
        return this.sourceProvinces;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SourceProvinces> sourceProvinces; 

        private Builder() {
        } 

        private Builder(DescribePortViewSourceProvincesResponseBody model) {
            this.requestId = model.requestId;
            this.sourceProvinces = model.sourceProvinces;
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
         * <p>The details of the administrative region in China from which the requests are sent.</p>
         */
        public Builder sourceProvinces(java.util.List<SourceProvinces> sourceProvinces) {
            this.sourceProvinces = sourceProvinces;
            return this;
        }

        public DescribePortViewSourceProvincesResponseBody build() {
            return new DescribePortViewSourceProvincesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortViewSourceProvincesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortViewSourceProvincesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SourceProvinces model) {
                this.count = model.count;
                this.provinceId = model.provinceId;
            } 

            /**
             * <p>The total number of requests that are sent from the ISP.</p>
             * <blockquote>
             * <p>This parameter does not indicate the accurate number of requests. You can use this parameter to calculate the proportion of requests from different administrative regions in China.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3390671</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The ID of the administrative region in China from which the requests are sent. For example, <strong>110000</strong> indicates Beijing, and <strong>120000</strong> indicates Tianjin.</p>
             * <blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">Location parameters</a>.</p>
             * </blockquote>
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
