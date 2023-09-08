// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancePerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancePerformanceResponseBody</p>
 */
public class DescribeDBInstancePerformanceResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDBInstancePerformanceResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.endTime = builder.endTime;
        this.engine = builder.engine;
        this.performanceKeys = builder.performanceKeys;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancePerformanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return performanceKeys
     */
    public PerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String endTime; 
        private String engine; 
        private PerformanceKeys performanceKeys; 
        private String requestId; 
        private String startTime; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The end time of the query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The database engine of the instance.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * An array that consists of performance metrics.
         */
        public Builder performanceKeys(PerformanceKeys performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The start time of the query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBInstancePerformanceResponseBody build() {
            return new DescribeDBInstancePerformanceResponseBody(this);
        } 

    } 

    public static class PerformanceValue extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("Value")
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
        public String getDate() {
            return this.date;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String date; 
            private String value; 

            /**
             * The date and time when the value of the performance metric was recorded. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * The queried values of the performance metric.
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
        @NameInMap("PerformanceValue")
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
    public static class PerformanceKey extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("ValueFormat")
        private String valueFormat;

        @NameInMap("Values")
        private Values values;

        private PerformanceKey(Builder builder) {
            this.key = builder.key;
            this.unit = builder.unit;
            this.valueFormat = builder.valueFormat;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKey create() {
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
         * @return valueFormat
         */
        public String getValueFormat() {
            return this.valueFormat;
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
            private String valueFormat; 
            private Values values; 

            /**
             * Specify the name of the performance metric.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The unit of the performance metrics.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The format in which the value of the performance metric is returned.
             * <p>
             * 
             * >  Multiple performance metric values are separated with ampersands (&). Example: com_delete\&com_insert\&com_insert_select\&com_replace.
             */
            public Builder valueFormat(String valueFormat) {
                this.valueFormat = valueFormat;
                return this;
            }

            /**
             * An array that consists of the values of the performance metric in the following format: {value1, value2, ...}.
             */
            public Builder values(Values values) {
                this.values = values;
                return this;
            }

            public PerformanceKey build() {
                return new PerformanceKey(this);
            } 

        } 

    }
    public static class PerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        private java.util.List < PerformanceKey> performanceKey;

        private PerformanceKeys(Builder builder) {
            this.performanceKey = builder.performanceKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceKeys create() {
            return builder().build();
        }

        /**
         * @return performanceKey
         */
        public java.util.List < PerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

        public static final class Builder {
            private java.util.List < PerformanceKey> performanceKey; 

            /**
             * PerformanceKey.
             */
            public Builder performanceKey(java.util.List < PerformanceKey> performanceKey) {
                this.performanceKey = performanceKey;
                return this;
            }

            public PerformanceKeys build() {
                return new PerformanceKeys(this);
            } 

        } 

    }
}
