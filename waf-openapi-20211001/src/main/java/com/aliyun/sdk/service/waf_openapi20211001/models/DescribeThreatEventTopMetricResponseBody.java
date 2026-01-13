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
 * {@link DescribeThreatEventTopMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeThreatEventTopMetricResponseBody</p>
 */
public class DescribeThreatEventTopMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopMetrics")
    private java.util.List<TopMetrics> topMetrics;

    private DescribeThreatEventTopMetricResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.topMetrics = builder.topMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeThreatEventTopMetricResponseBody create() {
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
     * @return topMetrics
     */
    public java.util.List<TopMetrics> getTopMetrics() {
        return this.topMetrics;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TopMetrics> topMetrics; 

        private Builder() {
        } 

        private Builder(DescribeThreatEventTopMetricResponseBody model) {
            this.requestId = model.requestId;
            this.topMetrics = model.topMetrics;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TopMetrics.
         */
        public Builder topMetrics(java.util.List<TopMetrics> topMetrics) {
            this.topMetrics = topMetrics;
            return this;
        }

        public DescribeThreatEventTopMetricResponseBody build() {
            return new DescribeThreatEventTopMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeThreatEventTopMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeThreatEventTopMetricResponseBody</p>
     */
    public static class TopMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cnt")
        private Long cnt;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TopMetrics(Builder builder) {
            this.cnt = builder.cnt;
            this.country = builder.country;
            this.region = builder.region;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopMetrics create() {
            return builder().build();
        }

        /**
         * @return cnt
         */
        public Long getCnt() {
            return this.cnt;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long cnt; 
            private String country; 
            private String region; 
            private String value; 

            private Builder() {
            } 

            private Builder(TopMetrics model) {
                this.cnt = model.cnt;
                this.country = model.country;
                this.region = model.region;
                this.value = model.value;
            } 

            /**
             * Cnt.
             */
            public Builder cnt(Long cnt) {
                this.cnt = cnt;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TopMetrics build() {
                return new TopMetrics(this);
            } 

        } 

    }
}
