// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSecurityCheckScheduleConfigResponseBody model) {
            this.requestId = model.requestId;
            this.riskCheckJobConfig = model.riskCheckJobConfig;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>48D2E9A9-A1B0-4295-B727-0995757C47E9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of custom check tasks.</p>
         */
        public Builder riskCheckJobConfig(RiskCheckJobConfig riskCheckJobConfig) {
            this.riskCheckJobConfig = riskCheckJobConfig;
            return this;
        }

        public DescribeSecurityCheckScheduleConfigResponseBody build() {
            return new DescribeSecurityCheckScheduleConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityCheckScheduleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityCheckScheduleConfigResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RiskCheckJobConfig model) {
                this.daysOfWeek = model.daysOfWeek;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The day of the week when the check tasks are performed. Multiple days can be specified. Multiple days are separated by commas (,).</p>
             * <ul>
             * <li><strong>1</strong>: Monday</li>
             * <li><strong>2</strong>: Tuesday</li>
             * <li><strong>3</strong>: Wednesday</li>
             * <li><strong>4</strong>: Thursday</li>
             * <li><strong>5</strong>: Friday</li>
             * <li><strong>6</strong>: Saturday</li>
             * <li><strong>7</strong>: Sunday</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1,2,3</p>
             */
            public Builder daysOfWeek(String daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * <p>The time range during which check tasks end. Valid values:</p>
             * <ul>
             * <li><strong>6</strong>: 00:00 to 06:00</li>
             * <li><strong>12</strong>: 06:00 to 12:00</li>
             * <li><strong>18</strong>: 12:00 to 18:00</li>
             * <li><strong>24</strong>: 18:00 to 24:00</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time range during which check tasks start. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: 00:00 to 06:00</li>
             * <li><strong>6</strong>: 06:00 to 12:00</li>
             * <li><strong>12</strong>: 12:00 to 18:00</li>
             * <li><strong>18</strong>: 18:00 to 24:00</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
