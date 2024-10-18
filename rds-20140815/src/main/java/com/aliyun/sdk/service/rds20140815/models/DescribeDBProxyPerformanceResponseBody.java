// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBProxyPerformanceResponseBody</p>
 */
public class DescribeDBProxyPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDBProxyPerformanceResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.endTime = builder.endTime;
        this.performanceKeys = builder.performanceKeys;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBProxyPerformanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
        private String DBProxyEngineType; 
        private String endTime; 
        private PerformanceKeys performanceKeys; 
        private String requestId; 
        private String startTime; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsmexxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>An internal parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * <p>The end time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-21T18:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The performance list.</p>
         */
        public Builder performanceKeys(PerformanceKeys performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD31056F-A0CE-41D7-AD39-689B6ABAE982</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-19T01:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBProxyPerformanceResponseBody build() {
            return new DescribeDBProxyPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyPerformanceResponseBody</p>
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
             * <p>2019-10-10T09:00:00Z</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The value of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>2.83</p>
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
     * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyPerformanceResponseBody</p>
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
     * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyPerformanceResponseBody</p>
     */
    public static class PerformanceKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ValueFormat")
        private String valueFormat;

        @com.aliyun.core.annotation.NameInMap("Values")
        private Values values;

        private PerformanceKey(Builder builder) {
            this.key = builder.key;
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
            private String valueFormat; 
            private Values values; 

            /**
             * <p>The performance parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_ratio</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The format in which the value of the performance metric is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>docker_container_cpu</p>
             */
            public Builder valueFormat(String valueFormat) {
                this.valueFormat = valueFormat;
                return this;
            }

            /**
             * <p>The performance metrics.</p>
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
     * {@link DescribeDBProxyPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyPerformanceResponseBody</p>
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
