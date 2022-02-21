// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortViewSourceProvincesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortViewSourceProvincesResponseBody</p>
 */
public class DescribePortViewSourceProvincesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceProvinces")
    private java.util.List < SourceProvinces> sourceProvinces;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceProvinces.
         */
        public Builder sourceProvinces(java.util.List < SourceProvinces> sourceProvinces) {
            this.sourceProvinces = sourceProvinces;
            return this;
        }

        public DescribePortViewSourceProvincesResponseBody build() {
            return new DescribePortViewSourceProvincesResponseBody(this);
        } 

    } 

    public static class SourceProvinces extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("ProvinceId")
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
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * ProvinceId.
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
