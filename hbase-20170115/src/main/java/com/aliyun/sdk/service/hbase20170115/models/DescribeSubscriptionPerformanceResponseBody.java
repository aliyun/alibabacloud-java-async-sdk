// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

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
 * {@link DescribeSubscriptionPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionPerformanceResponseBody</p>
 */
public class DescribeSubscriptionPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PerformanceKeys")
    private PerformanceKeys performanceKeys;

    @com.aliyun.core.annotation.NameInMap("ReplicaId")
    private String replicaId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeSubscriptionPerformanceResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.performanceKeys = builder.performanceKeys;
        this.replicaId = builder.replicaId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionPerformanceResponseBody create() {
        return builder().build();
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
     * @return replicaId
     */
    public String getReplicaId() {
        return this.replicaId;
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
        private String endTime; 
        private PerformanceKeys performanceKeys; 
        private String replicaId; 
        private String requestId; 
        private String startTime; 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * PerformanceKeys.
         */
        public Builder performanceKeys(PerformanceKeys performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }

        /**
         * ReplicaId.
         */
        public Builder replicaId(String replicaId) {
            this.replicaId = replicaId;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeSubscriptionPerformanceResponseBody build() {
            return new DescribeSubscriptionPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSubscriptionPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionPerformanceResponseBody</p>
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
             * Date.
             */
            public Builder date(String date) {
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
    /**
     * 
     * {@link DescribeSubscriptionPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionPerformanceResponseBody</p>
     */
    public static class PerformanceValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceValue")
        private java.util.List<PerformanceValue> performanceValue;

        private PerformanceValues(Builder builder) {
            this.performanceValue = builder.performanceValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceValues create() {
            return builder().build();
        }

        /**
         * @return performanceValue
         */
        public java.util.List<PerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

        public static final class Builder {
            private java.util.List<PerformanceValue> performanceValue; 

            /**
             * PerformanceValue.
             */
            public Builder performanceValue(java.util.List<PerformanceValue> performanceValue) {
                this.performanceValue = performanceValue;
                return this;
            }

            public PerformanceValues build() {
                return new PerformanceValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSubscriptionPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionPerformanceResponseBody</p>
     */
    public static class PerformanceKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("PerformanceValues")
        private PerformanceValues performanceValues;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("ValueFormat")
        private String valueFormat;

        private PerformanceKey(Builder builder) {
            this.key = builder.key;
            this.performanceValues = builder.performanceValues;
            this.unit = builder.unit;
            this.valueFormat = builder.valueFormat;
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
         * @return performanceValues
         */
        public PerformanceValues getPerformanceValues() {
            return this.performanceValues;
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

        public static final class Builder {
            private String key; 
            private PerformanceValues performanceValues; 
            private String unit; 
            private String valueFormat; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * PerformanceValues.
             */
            public Builder performanceValues(PerformanceValues performanceValues) {
                this.performanceValues = performanceValues;
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
             * ValueFormat.
             */
            public Builder valueFormat(String valueFormat) {
                this.valueFormat = valueFormat;
                return this;
            }

            public PerformanceKey build() {
                return new PerformanceKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSubscriptionPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSubscriptionPerformanceResponseBody</p>
     */
    public static class PerformanceKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PerformanceKey")
        private java.util.List<PerformanceKey> performanceKey;

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
        public java.util.List<PerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

        public static final class Builder {
            private java.util.List<PerformanceKey> performanceKey; 

            /**
             * PerformanceKey.
             */
            public Builder performanceKey(java.util.List<PerformanceKey> performanceKey) {
                this.performanceKey = performanceKey;
                return this;
            }

            public PerformanceKeys build() {
                return new PerformanceKeys(this);
            } 

        } 

    }
}
