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
 * {@link SumStorageMetricsByTypeResponseBody} extends {@link TeaModel}
 *
 * <p>SumStorageMetricsByTypeResponseBody</p>
 */
public class SumStorageMetricsByTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SumStorageMetricsByTypeResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumStorageMetricsByTypeResponseBody create() {
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

        private Builder(SumStorageMetricsByTypeResponseBody model) {
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

        public SumStorageMetricsByTypeResponseBody build() {
            return new SumStorageMetricsByTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SumStorageMetricsByTypeResponseBody} extends {@link TeaModel}
     *
     * <p>SumStorageMetricsByTypeResponseBody</p>
     */
    public static class DailyStorageMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("percentage")
        private Double percentage;

        @com.aliyun.core.annotation.NameInMap("storageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Double usage;

        private DailyStorageMetrics(Builder builder) {
            this.dateTime = builder.dateTime;
            this.percentage = builder.percentage;
            this.storageType = builder.storageType;
            this.unit = builder.unit;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyStorageMetrics create() {
            return builder().build();
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return percentage
         */
        public Double getPercentage() {
            return this.percentage;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
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
        public Double getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String dateTime; 
            private Double percentage; 
            private String storageType; 
            private String unit; 
            private Double usage; 

            private Builder() {
            } 

            private Builder(DailyStorageMetrics model) {
                this.dateTime = model.dateTime;
                this.percentage = model.percentage;
                this.storageType = model.storageType;
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
             * percentage.
             */
            public Builder percentage(Double percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * storageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
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
            public Builder usage(Double usage) {
                this.usage = usage;
                return this;
            }

            public DailyStorageMetrics build() {
                return new DailyStorageMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link SumStorageMetricsByTypeResponseBody} extends {@link TeaModel}
     *
     * <p>SumStorageMetricsByTypeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dailyStorageMetrics")
        private java.util.List<DailyStorageMetrics> dailyStorageMetrics;

        @com.aliyun.core.annotation.NameInMap("storageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Double usage;

        private Data(Builder builder) {
            this.dailyStorageMetrics = builder.dailyStorageMetrics;
            this.storageType = builder.storageType;
            this.unit = builder.unit;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dailyStorageMetrics
         */
        public java.util.List<DailyStorageMetrics> getDailyStorageMetrics() {
            return this.dailyStorageMetrics;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
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
        public Double getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<DailyStorageMetrics> dailyStorageMetrics; 
            private String storageType; 
            private String unit; 
            private Double usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dailyStorageMetrics = model.dailyStorageMetrics;
                this.storageType = model.storageType;
                this.unit = model.unit;
                this.usage = model.usage;
            } 

            /**
             * dailyStorageMetrics.
             */
            public Builder dailyStorageMetrics(java.util.List<DailyStorageMetrics> dailyStorageMetrics) {
                this.dailyStorageMetrics = dailyStorageMetrics;
                return this;
            }

            /**
             * storageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
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
            public Builder usage(Double usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
