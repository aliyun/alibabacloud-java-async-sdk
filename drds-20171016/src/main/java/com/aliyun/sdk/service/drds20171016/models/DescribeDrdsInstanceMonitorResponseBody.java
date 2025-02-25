// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceMonitorResponseBody</p>
 */
public class DescribeDrdsInstanceMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDrdsInstanceMonitorResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstanceMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsInstanceMonitorResponseBody build() {
            return new DescribeDrdsInstanceMonitorResponseBody(this);
        } 

    } 

    public static class PerformanceValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private Long date;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PerformanceValue(Builder builder) {
            this.date = builder.date;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceValue create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public Long getDate() {
            return this.date;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long date; 
            private String value; 

            /**
             * Date.
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PerformanceValue build() {
                return new PerformanceValue(this);
            } 

        } 

    }
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceValue")
        private java.util.List < PerformanceValue> performanceValue;

        private Values(Builder builder) {
            this.performanceValue = builder.performanceValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return performanceValue
         */
        public java.util.List < PerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

        public static final class Builder {
            private java.util.List < PerformanceValue> performanceValue; 

            /**
             * PerformanceValue.
             */
            public Builder performanceValue(java.util.List < PerformanceValue> performanceValue) {
                this.performanceValue = performanceValue;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class PartialPerformanceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Values")
        private Values values;

        private PartialPerformanceData(Builder builder) {
            this.key = builder.key;
            this.unit = builder.unit;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartialPerformanceData create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return values
         */
        public Values getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String unit; 
            private Values values; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(Values values) {
                this.values = values;
                return this;
            }

            public PartialPerformanceData build() {
                return new PartialPerformanceData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PartialPerformanceData")
        private java.util.List < PartialPerformanceData> partialPerformanceData;

        private Data(Builder builder) {
            this.partialPerformanceData = builder.partialPerformanceData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return partialPerformanceData
         */
        public java.util.List < PartialPerformanceData> getPartialPerformanceData() {
            return this.partialPerformanceData;
        }

        public static final class Builder {
            private java.util.List < PartialPerformanceData> partialPerformanceData; 

            /**
             * PartialPerformanceData.
             */
            public Builder partialPerformanceData(java.util.List < PartialPerformanceData> partialPerformanceData) {
                this.partialPerformanceData = partialPerformanceData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
