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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12EF3845-CCEB-4B84-AE60-2B49B*****EE5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of statistics.</p>
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
             * <p>The number of attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder cnt(Long cnt) {
                this.cnt = cnt;
                return this;
            }

            /**
             * <p>The country to which the source IP address of the attack belongs.</p>
             * <blockquote>
             * <p>This field returns a meaningful value only when the statistical object (<strong>Metric</strong>) is set to source IP address (<strong>src</strong>).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The region to which the source IP address of the attack belongs.</p>
             * <blockquote>
             * <p>This field returns a meaningful value only when the statistical object (<strong>Metric</strong>) is set to source IP address (<strong>src</strong>).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The attack value. The meaning of this field varies depending on the value of <strong>Metric</strong>.</p>
             * <ul>
             * <li>If <strong>Metric</strong> is set to <strong>time</strong>, this field indicates the attack time.</li>
             * <li>If <strong>Metric</strong> is set to <strong>src</strong>, this field indicates the source IP address of the attack.</li>
             * <li>If <strong>Metric</strong> is set to <strong>target</strong>, this field indicates the URL of the attack request.</li>
             * <li>If <strong>Metric</strong> is set to <strong>type</strong>, this field indicates the attack type. <strong>dirscan</strong> indicates directory scanning, <strong>webscan</strong> indicates web scanning, and other attack types are described in the <strong>detectType</strong> (detection type) parameter of the <strong>custom regular rule</strong> (<strong>regular_custom</strong>) in the <a href="https://help.aliyun.com/document_detail/461421.html"><strong>CreateDefenseRule</strong></a> operation.</li>
             * <li>If <strong>Metric</strong> is set to <strong>tools</strong>, this field indicates the attack tool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>115.28.209.212</p>
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
