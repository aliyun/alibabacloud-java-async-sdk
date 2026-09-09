// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAlarmListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmListResponseBody</p>
 */
public class DescribeAlarmListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Alarms")
    private java.util.List<Alarms> alarms;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAlarmListResponseBody(Builder builder) {
        this.alarms = builder.alarms;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarms
     */
    public java.util.List<Alarms> getAlarms() {
        return this.alarms;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Alarms> alarms; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAlarmListResponseBody model) {
            this.alarms = model.alarms;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The alerts.</p>
         */
        public Builder alarms(java.util.List<Alarms> alarms) {
            this.alarms = alarms;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D8EBFB7-E1EB-5236-952A-092EDC72***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAlarmListResponseBody build() {
            return new DescribeAlarmListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlarmListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmListResponseBody</p>
     */
    public static class Alarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cause")
        private String cause;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("MaxQps")
        private Long maxQps;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private Long spec;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Alarms(Builder builder) {
            this.cause = builder.cause;
            this.endTime = builder.endTime;
            this.maxQps = builder.maxQps;
            this.spec = builder.spec;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return maxQps
         */
        public Long getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return spec
         */
        public Long getSpec() {
            return this.spec;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cause; 
            private Long endTime; 
            private Long maxQps; 
            private Long spec; 
            private Long startTime; 
            private Integer status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Alarms model) {
                this.cause = model.cause;
                this.endTime = model.endTime;
                this.maxQps = model.maxQps;
                this.spec = model.spec;
                this.startTime = model.startTime;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The cause of the alert. Valid values:</p>
             * <ul>
             * <li><p><strong>fivefold</strong>: The QPS exceeds the limit of the current WAF instance specifications.</p>
             * </li>
             * <li><p><strong>4count</strong>: The actual QPS has cumulatively exceeded the limit of the current WAF instance specifications.</p>
             * </li>
             * <li><p><strong>exceed10w</strong>: The peak QPS exceeds 100,000.</p>
             * </li>
             * <li><p><strong>costProtection</strong>: Billing protection is triggered.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4count</p>
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * <p>The end time of the alert. This is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1605600798</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The peak QPS during the alert period.</p>
             * 
             * <strong>example:</strong>
             * <p>12000</p>
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * <p>The QPS limit of the current WAF instance specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder spec(Long spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The start time of the alert. This is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1605600767</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The current status of the alert. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: The queries per second (QPS) limit is exceeded.</p>
             * </li>
             * <li><p><strong>2</strong>: The WAF instance enters the sandbox.</p>
             * </li>
             * <li><p><strong>3</strong>: The WAF instance is removed from the sandbox.</p>
             * </li>
             * <li><p><strong>4</strong>: The QPS no longer exceeds the limit.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the alert. Valid value:</p>
             * <ul>
             * <li><strong>qps</strong>: a QPS alert.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>qps</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
}
