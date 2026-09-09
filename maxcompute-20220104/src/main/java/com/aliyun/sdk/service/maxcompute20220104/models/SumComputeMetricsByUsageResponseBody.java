// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link SumComputeMetricsByUsageResponseBody} extends {@link TeaModel}
 *
 * <p>SumComputeMetricsByUsageResponseBody</p>
 */
public class SumComputeMetricsByUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SumComputeMetricsByUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumComputeMetricsByUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SumComputeMetricsByUsageResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The usage data for each metering type.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li><p><code>1xx</code>: Informational response. The request is received and is being processed.</p>
         * </li>
         * <li><p><code>2xx</code>: Success. The request was successfully received, understood, and accepted.</p>
         * </li>
         * <li><p><code>3xx</code>: Redirection. Further action is required to complete the request.</p>
         * </li>
         * <li><p><code>4xx</code>: Client error. The request has invalid syntax or cannot be fulfilled.</p>
         * </li>
         * <li><p><code>5xx</code>: Server error. The server failed to fulfill an otherwise valid request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc0598d17544456742466519e6611</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SumComputeMetricsByUsageResponseBody build() {
            return new SumComputeMetricsByUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SumComputeMetricsByUsageResponseBody} extends {@link TeaModel}
     *
     * <p>SumComputeMetricsByUsageResponseBody</p>
     */
    public static class DailyComputeMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("usage")
        private String usage;

        private DailyComputeMetrics(Builder builder) {
            this.dateTime = builder.dateTime;
            this.unit = builder.unit;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyComputeMetrics create() {
            return builder().build();
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String dateTime; 
            private String unit; 
            private String usage; 

            private Builder() {
            } 

            private Builder(DailyComputeMetrics model) {
                this.dateTime = model.dateTime;
                this.unit = model.unit;
                this.usage = model.usage;
            } 

            /**
             * <p>The date of the usage, in <code>yyyyMMdd</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>20260413</p>
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * <p>The unit of compute usage.</p>
             * 
             * <strong>example:</strong>
             * <p>GBCplx</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The total usage for the day.</p>
             * 
             * <strong>example:</strong>
             * <p>1.149683987</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public DailyComputeMetrics build() {
                return new DailyComputeMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link SumComputeMetricsByUsageResponseBody} extends {@link TeaModel}
     *
     * <p>SumComputeMetricsByUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dailyComputeMetrics")
        private java.util.List<DailyComputeMetrics> dailyComputeMetrics;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.dailyComputeMetrics = builder.dailyComputeMetrics;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dailyComputeMetrics
         */
        public java.util.List<DailyComputeMetrics> getDailyComputeMetrics() {
            return this.dailyComputeMetrics;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<DailyComputeMetrics> dailyComputeMetrics; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dailyComputeMetrics = model.dailyComputeMetrics;
                this.type = model.type;
            } 

            /**
             * <p>The daily usage statistics.</p>
             */
            public Builder dailyComputeMetrics(java.util.List<DailyComputeMetrics> dailyComputeMetrics) {
                this.dailyComputeMetrics = dailyComputeMetrics;
                return this;
            }

            /**
             * <p>The metering type.</p>
             * <p><code>ComputationSql</code>: Metering data for SQL jobs on internal tables.</p>
             * <p><code>ComputationSqlOTS</code>: Metering data for SQL jobs on OTS external tables.</p>
             * <p><code>ComputationSqlOSS</code>: Metering data for SQL jobs on OSS external tables.</p>
             * <p><code>MapReduce</code>: Metering data for MapReduce jobs.</p>
             * <p><code>spark</code>: Metering data for Spark jobs.</p>
             * <p><code>mars</code>: Metering data for Mars jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>ComputationSql</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
