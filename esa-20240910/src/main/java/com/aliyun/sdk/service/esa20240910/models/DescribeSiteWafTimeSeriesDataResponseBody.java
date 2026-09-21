// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeSiteWafTimeSeriesDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteWafTimeSeriesDataResponseBody</p>
 */
public class DescribeSiteWafTimeSeriesDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SamplingRate")
    private Float samplingRate;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("SummarizedData")
    private java.util.List<SummarizedData> summarizedData;

    private DescribeSiteWafTimeSeriesDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.requestId = builder.requestId;
        this.samplingRate = builder.samplingRate;
        this.startTime = builder.startTime;
        this.summarizedData = builder.summarizedData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteWafTimeSeriesDataResponseBody create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return samplingRate
     */
    public Float getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return summarizedData
     */
    public java.util.List<SummarizedData> getSummarizedData() {
        return this.summarizedData;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String endTime; 
        private Long interval; 
        private String requestId; 
        private Float samplingRate; 
        private String startTime; 
        private java.util.List<SummarizedData> summarizedData; 

        private Builder() {
        } 

        private Builder(DescribeSiteWafTimeSeriesDataResponseBody model) {
            this.data = model.data;
            this.endTime = model.endTime;
            this.interval = model.interval;
            this.requestId = model.requestId;
            this.samplingRate = model.samplingRate;
            this.startTime = model.startTime;
            this.summarizedData = model.summarizedData;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The end of the time range for the returned data.</p>
         * <p>The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC+0.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-09T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The data granularity. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder interval(Long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>93652946-2687-5428-8254-533B1E6A***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sampling rate. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder samplingRate(Float samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-08T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The summarized data.</p>
         */
        public Builder summarizedData(java.util.List<SummarizedData> summarizedData) {
            this.summarizedData = summarizedData;
            return this;
        }

        public DescribeSiteWafTimeSeriesDataResponseBody build() {
            return new DescribeSiteWafTimeSeriesDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSiteWafTimeSeriesDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteWafTimeSeriesDataResponseBody</p>
     */
    public static class DetailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private DetailData(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailData create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timeStamp; 
            private Object value; 

            private Builder() {
            } 

            private Builder(DetailData model) {
                this.timeStamp = model.timeStamp;
                this.value = model.value;
            } 

            /**
             * <p>The start time of the time slice.</p>
             * <p>The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC+0.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-08T16:00:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public DetailData build() {
                return new DetailData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteWafTimeSeriesDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteWafTimeSeriesDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailData")
        private java.util.List<DetailData> detailData;

        @com.aliyun.core.annotation.NameInMap("DimensionName")
        private String dimensionName;

        @com.aliyun.core.annotation.NameInMap("DimensionValue")
        private String dimensionValue;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        private Data(Builder builder) {
            this.detailData = builder.detailData;
            this.dimensionName = builder.dimensionName;
            this.dimensionValue = builder.dimensionValue;
            this.fieldName = builder.fieldName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detailData
         */
        public java.util.List<DetailData> getDetailData() {
            return this.detailData;
        }

        /**
         * @return dimensionName
         */
        public String getDimensionName() {
            return this.dimensionName;
        }

        /**
         * @return dimensionValue
         */
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        public static final class Builder {
            private java.util.List<DetailData> detailData; 
            private String dimensionName; 
            private String dimensionValue; 
            private String fieldName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.detailData = model.detailData;
                this.dimensionName = model.dimensionName;
                this.dimensionValue = model.dimensionValue;
                this.fieldName = model.fieldName;
            } 

            /**
             * <p>The returned data.</p>
             */
            public Builder detailData(java.util.List<DetailData> detailData) {
                this.detailData = detailData;
                return this;
            }

            /**
             * <p>The query dimensions.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder dimensionName(String dimensionName) {
                this.dimensionName = dimensionName;
                return this;
            }

            /**
             * <p>The dimension value.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>Requests</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteWafTimeSeriesDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteWafTimeSeriesDataResponseBody</p>
     */
    public static class SummarizedData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggMethod")
        private String aggMethod;

        @com.aliyun.core.annotation.NameInMap("DimensionName")
        private String dimensionName;

        @com.aliyun.core.annotation.NameInMap("DimensionValue")
        private String dimensionValue;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private SummarizedData(Builder builder) {
            this.aggMethod = builder.aggMethod;
            this.dimensionName = builder.dimensionName;
            this.dimensionValue = builder.dimensionValue;
            this.fieldName = builder.fieldName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummarizedData create() {
            return builder().build();
        }

        /**
         * @return aggMethod
         */
        public String getAggMethod() {
            return this.aggMethod;
        }

        /**
         * @return dimensionName
         */
        public String getDimensionName() {
            return this.dimensionName;
        }

        /**
         * @return dimensionValue
         */
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String aggMethod; 
            private String dimensionName; 
            private String dimensionValue; 
            private String fieldName; 
            private Object value; 

            private Builder() {
            } 

            private Builder(SummarizedData model) {
                this.aggMethod = model.aggMethod;
                this.dimensionName = model.dimensionName;
                this.dimensionValue = model.dimensionValue;
                this.fieldName = model.fieldName;
                this.value = model.value;
            } 

            /**
             * <p>The aggregation method.</p>
             * 
             * <strong>example:</strong>
             * <p>sum</p>
             */
            public Builder aggMethod(String aggMethod) {
                this.aggMethod = aggMethod;
                return this;
            }

            /**
             * <p>The summarized dimension name.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder dimensionName(String dimensionName) {
                this.dimensionName = dimensionName;
                return this;
            }

            /**
             * <p>The summarized dimension value.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            /**
             * <p>The summarized metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>Requests</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The aggregated value.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public SummarizedData build() {
                return new SummarizedData(this);
            } 

        } 

    }
}
