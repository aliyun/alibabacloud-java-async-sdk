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
         * Alarms.
         */
        public Builder alarms(java.util.List<Alarms> alarms) {
            this.alarms = alarms;
            return this;
        }

        /**
         * RequestId.
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
             * Cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * MaxQps.
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(Long spec) {
                this.spec = spec;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
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
