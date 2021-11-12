// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSecurityCheckScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityCheckScheduleConfigResponseBody</p>
 */
public class DescribeSecurityCheckScheduleConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskCheckJobConfig")
    private RiskCheckJobConfig riskCheckJobConfig;


    private DescribeSecurityCheckScheduleConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskCheckJobConfig = builder.riskCheckJobConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityCheckScheduleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskCheckJobConfig
     */
    public RiskCheckJobConfig getRiskCheckJobConfig() {
        return this.riskCheckJobConfig;
    }

    public static final class Builder {
        private String requestId; 
        private RiskCheckJobConfig riskCheckJobConfig; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>RiskCheckJobConfig.</p>
         */
        public Builder riskCheckJobConfig(RiskCheckJobConfig riskCheckJobConfig) {
            this.riskCheckJobConfig = riskCheckJobConfig;
            return this;
        }

        public DescribeSecurityCheckScheduleConfigResponseBody build() {
            return new DescribeSecurityCheckScheduleConfigResponseBody(this);
        } 

    } 

    public static class RiskCheckJobConfig extends TeaModel {
        @NameInMap("DaysOfWeek")
        private String daysOfWeek;

        @NameInMap("EndTime")
        private Integer endTime;

        @NameInMap("StartTime")
        private Integer startTime;


        private RiskCheckJobConfig(Builder builder) {
            this.daysOfWeek = builder.daysOfWeek;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskCheckJobConfig create() {
            return builder().build();
        }

        /**
         * @return daysOfWeek
         */
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String daysOfWeek; 
            private Integer endTime; 
            private Integer startTime; 

            /**
             * <p>DaysOfWeek.</p>
             */
            public Builder daysOfWeek(String daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * <p>EndTime.</p>
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>StartTime.</p>
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            public RiskCheckJobConfig build() {
                return new RiskCheckJobConfig(this);
            } 

        } 

    }
}
