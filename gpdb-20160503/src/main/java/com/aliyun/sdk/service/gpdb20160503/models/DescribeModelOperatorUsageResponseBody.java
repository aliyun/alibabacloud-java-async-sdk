// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeModelOperatorUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelOperatorUsageResponseBody</p>
 */
public class DescribeModelOperatorUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List<Keys> keys;

    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeModelOperatorUsageResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.keys = builder.keys;
        this.period = builder.period;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOperatorUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return keys
     */
    public java.util.List<Keys> getKeys() {
        return this.keys;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
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
        private java.util.List<Keys> keys; 
        private Integer period; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeModelOperatorUsageResponseBody model) {
            this.endTime = model.endTime;
            this.keys = model.keys;
            this.period = model.period;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Keys.
         */
        public Builder keys(java.util.List<Keys> keys) {
            this.keys = keys;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.period = period;
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

        public DescribeModelOperatorUsageResponseBody build() {
            return new DescribeModelOperatorUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelOperatorUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelOperatorUsageResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Point")
        private java.util.List<String> point;

        private Values(Builder builder) {
            this.point = builder.point;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return point
         */
        public java.util.List<String> getPoint() {
            return this.point;
        }

        public static final class Builder {
            private java.util.List<String> point; 

            private Builder() {
            } 

            private Builder(Values model) {
                this.point = model.point;
            } 

            /**
             * Point.
             */
            public Builder point(java.util.List<String> point) {
                this.point = point;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelOperatorUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelOperatorUsageResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyId")
        private Integer apiKeyId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Values> values;

        private Series(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.name = builder.name;
            this.role = builder.role;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return apiKeyId
         */
        public Integer getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return values
         */
        public java.util.List<Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private Integer apiKeyId; 
            private String name; 
            private String role; 
            private java.util.List<Values> values; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.apiKeyId = model.apiKeyId;
                this.name = model.name;
                this.role = model.role;
                this.values = model.values;
            } 

            /**
             * ApiKeyId.
             */
            public Builder apiKeyId(Integer apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<Values> values) {
                this.values = values;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelOperatorUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelOperatorUsageResponseBody</p>
     */
    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Series")
        private java.util.List<Series> series;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Keys(Builder builder) {
            this.name = builder.name;
            this.series = builder.series;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keys create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return series
         */
        public java.util.List<Series> getSeries() {
            return this.series;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<Series> series; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Keys model) {
                this.name = model.name;
                this.series = model.series;
                this.unit = model.unit;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
}
