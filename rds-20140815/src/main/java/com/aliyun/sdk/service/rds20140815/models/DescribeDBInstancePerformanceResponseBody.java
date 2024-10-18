// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstancePerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancePerformanceResponseBody</p>
 */
public class DescribeDBInstancePerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2012-06-19T15:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>Details of the performance metrics.</p>
         */
        public Builder performanceKeys(PerformanceKeys performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5409D02-D661-4BF3-8F3D-0A814D0574E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2012-06-10T15:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBInstancePerformanceResponseBody build() {
            return new DescribeDBInstancePerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancePerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancePerformanceResponseBody</p>
     */
    public static class PerformanceValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

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
             * <p>The date and time when the value of the performance metric was recorded. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-05-30T03:29:00Z</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The value of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0&amp;13.6</p>
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
    /**
     * 
     * {@link DescribeDBInstancePerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancePerformanceResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDBInstancePerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancePerformanceResponseBody</p>
     */
    public static class PerformanceKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("ValueFormat")
        private String valueFormat;

        @com.aliyun.core.annotation.NameInMap("Values")
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
             * <p>The name of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL_Sessions</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The unit of the performance metrics.</p>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The format in which the value of the performance metric is returned.</p>
             * <blockquote>
             * <p> If a performance metric value consists of multiple fields, the values are separated with ampersands (&amp;). Example: com_delete&amp;com_insert&amp;com_insert_select&amp;com_replace.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>recv_k&amp;sent_k</p>
             */
            public Builder valueFormat(String valueFormat) {
                this.valueFormat = valueFormat;
                return this;
            }

            /**
             * <p>The performance metric values.</p>
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
    /**
     * 
     * {@link DescribeDBInstancePerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancePerformanceResponseBody</p>
     */
    public static class PerformanceKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceKey")
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
