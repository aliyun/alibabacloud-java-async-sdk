// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetContextDatabaseSyncJobScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseSyncJobScheduleResponseBody</p>
 */
public class GetContextDatabaseSyncJobScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetContextDatabaseSyncJobScheduleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseSyncJobScheduleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetContextDatabaseSyncJobScheduleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Example value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Example value</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetContextDatabaseSyncJobScheduleResponseBody build() {
            return new GetContextDatabaseSyncJobScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseSyncJobScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseSyncJobScheduleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPauseReason")
        private String autoPauseReason;

        @com.aliyun.core.annotation.NameInMap("AutoPaused")
        private Boolean autoPaused;

        @com.aliyun.core.annotation.NameInMap("DailyTimes")
        private java.util.List<String> dailyTimes;

        @com.aliyun.core.annotation.NameInMap("IntervalMinutes")
        private Integer intervalMinutes;

        @com.aliyun.core.annotation.NameInMap("MissedPolicy")
        private String missedPolicy;

        @com.aliyun.core.annotation.NameInMap("NextRunAt")
        private String nextRunAt;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.autoPauseReason = builder.autoPauseReason;
            this.autoPaused = builder.autoPaused;
            this.dailyTimes = builder.dailyTimes;
            this.intervalMinutes = builder.intervalMinutes;
            this.missedPolicy = builder.missedPolicy;
            this.nextRunAt = builder.nextRunAt;
            this.timezone = builder.timezone;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoPauseReason
         */
        public String getAutoPauseReason() {
            return this.autoPauseReason;
        }

        /**
         * @return autoPaused
         */
        public Boolean getAutoPaused() {
            return this.autoPaused;
        }

        /**
         * @return dailyTimes
         */
        public java.util.List<String> getDailyTimes() {
            return this.dailyTimes;
        }

        /**
         * @return intervalMinutes
         */
        public Integer getIntervalMinutes() {
            return this.intervalMinutes;
        }

        /**
         * @return missedPolicy
         */
        public String getMissedPolicy() {
            return this.missedPolicy;
        }

        /**
         * @return nextRunAt
         */
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String autoPauseReason; 
            private Boolean autoPaused; 
            private java.util.List<String> dailyTimes; 
            private Integer intervalMinutes; 
            private String missedPolicy; 
            private String nextRunAt; 
            private String timezone; 
            private String type; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoPauseReason = model.autoPauseReason;
                this.autoPaused = model.autoPaused;
                this.dailyTimes = model.dailyTimes;
                this.intervalMinutes = model.intervalMinutes;
                this.missedPolicy = model.missedPolicy;
                this.nextRunAt = model.nextRunAt;
                this.timezone = model.timezone;
                this.type = model.type;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The reason for the automatic pause.</p>
             * 
             * <strong>example:</strong>
             * <p>Three consecutive execution failures</p>
             */
            public Builder autoPauseReason(String autoPauseReason) {
                this.autoPauseReason = autoPauseReason;
                return this;
            }

            /**
             * <p>Indicates whether the task is automatically paused.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPaused(Boolean autoPaused) {
                this.autoPaused = autoPaused;
                return this;
            }

            /**
             * <p>The list of daily trigger times for daily-times scheduling in the HH:mm 24-hour format. The number of times ranges from 1 to 6.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;09:00&quot;, &quot;18:00&quot;]</p>
             */
            public Builder dailyTimes(java.util.List<String> dailyTimes) {
                this.dailyTimes = dailyTimes;
                return this;
            }

            /**
             * <p>The interval in minutes for interval scheduling. The minimum value is 10.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder intervalMinutes(Integer intervalMinutes) {
                this.intervalMinutes = intervalMinutes;
                return this;
            }

            /**
             * <p>The processing policy for missed schedules. Valid values: skip and catch-up.</p>
             * 
             * <strong>example:</strong>
             * <p>skip</p>
             */
            public Builder missedPolicy(String missedPolicy) {
                this.missedPolicy = missedPolicy;
                return this;
            }

            /**
             * <p>The next run time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder nextRunAt(String nextRunAt) {
                this.nextRunAt = nextRunAt;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The scheduling type. Valid values: interval and daily-times.</p>
             * 
             * <strong>example:</strong>
             * <p>daily-times</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
