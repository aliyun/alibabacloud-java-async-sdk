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
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
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
             * dateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * usage.
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
             * dailyComputeMetrics.
             */
            public Builder dailyComputeMetrics(java.util.List<DailyComputeMetrics> dailyComputeMetrics) {
                this.dailyComputeMetrics = dailyComputeMetrics;
                return this;
            }

            /**
             * type.
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
