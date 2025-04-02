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
 * {@link DescribeSiteTopDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteTopDataResponseBody</p>
 */
public class DescribeSiteTopDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SamplingRate")
    private Float samplingRate;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeSiteTopDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.samplingRate = builder.samplingRate;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteTopDataResponseBody create() {
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private String endTime; 
        private String requestId; 
        private Float samplingRate; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeSiteTopDataResponseBody model) {
            this.data = model.data;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.samplingRate = model.samplingRate;
            this.startTime = model.startTime;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SamplingRate.
         */
        public Builder samplingRate(Float samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeSiteTopDataResponseBody build() {
            return new DescribeSiteTopDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSiteTopDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteTopDataResponseBody</p>
     */
    public static class DetailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DimensionValue")
        private String dimensionValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private DetailData(Builder builder) {
            this.dimensionValue = builder.dimensionValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailData create() {
            return builder().build();
        }

        /**
         * @return dimensionValue
         */
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String dimensionValue; 
            private Object value; 

            private Builder() {
            } 

            private Builder(DetailData model) {
                this.dimensionValue = model.dimensionValue;
                this.value = model.value;
            } 

            /**
             * DimensionValue.
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            /**
             * Value.
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
     * {@link DescribeSiteTopDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteTopDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailData")
        private java.util.List<DetailData> detailData;

        @com.aliyun.core.annotation.NameInMap("DimensionName")
        private String dimensionName;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        private Data(Builder builder) {
            this.detailData = builder.detailData;
            this.dimensionName = builder.dimensionName;
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
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        public static final class Builder {
            private java.util.List<DetailData> detailData; 
            private String dimensionName; 
            private String fieldName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.detailData = model.detailData;
                this.dimensionName = model.dimensionName;
                this.fieldName = model.fieldName;
            } 

            /**
             * DetailData.
             */
            public Builder detailData(java.util.List<DetailData> detailData) {
                this.detailData = detailData;
                return this;
            }

            /**
             * DimensionName.
             */
            public Builder dimensionName(String dimensionName) {
                this.dimensionName = dimensionName;
                return this;
            }

            /**
             * FieldName.
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
}
