// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityCheckScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityCheckScheduleConfigResponseBody</p>
 */
public class DescribeSecurityCheckScheduleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskCheckJobConfig")
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations of custom check tasks.
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
        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private String daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * The day of the week when the check tasks are performed. Multiple days can be specified. Multiple days are separated by commas (,).
             * <p>
             * 
             * *   **1**: Monday
             * *   **2**: Tuesday
             * *   **3**: Wednesday
             * *   **4**: Thursday
             * *   **5**: Friday
             * *   **6**: Saturday
             * *   **7**: Sunday
             */
            public Builder daysOfWeek(String daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * The time range during which check tasks end. Valid values:
             * <p>
             * 
             * *   **6**: 00:00 to 06:00
             * *   **12**: 06:00 to 12:00
             * *   **18**: 12:00 to 18:00
             * *   **24**: 18:00 to 24:00
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The time range during which check tasks start. Valid values:
             * <p>
             * 
             * *   **0**: 00:00 to 06:00
             * *   **6**: 06:00 to 12:00
             * *   **12**: 12:00 to 18:00
             * *   **18**: 18:00 to 24:00
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
