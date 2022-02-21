// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchedulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSchedulesResponseBody</p>
 */
public class ListSchedulesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Schedules")
    private java.util.List < Schedules> schedules;

    private ListSchedulesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.schedules = builder.schedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchedulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schedules
     */
    public java.util.List < Schedules> getSchedules() {
        return this.schedules;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Schedules> schedules; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Schedules.
         */
        public Builder schedules(java.util.List < Schedules> schedules) {
            this.schedules = schedules;
            return this;
        }

        public ListSchedulesResponseBody build() {
            return new ListSchedulesResponseBody(this);
        } 

    } 

    public static class Schedules extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("CronExpression")
        private String cronExpression;

        @NameInMap("Description")
        private String description;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("LastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("Payload")
        private String payload;

        @NameInMap("ScheduleId")
        private String scheduleId;

        @NameInMap("ScheduleName")
        private String scheduleName;

        private Schedules(Builder builder) {
            this.createdTime = builder.createdTime;
            this.cronExpression = builder.cronExpression;
            this.description = builder.description;
            this.enable = builder.enable;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.payload = builder.payload;
            this.scheduleId = builder.scheduleId;
            this.scheduleName = builder.scheduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedules create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return payload
         */
        public String getPayload() {
            return this.payload;
        }

        /**
         * @return scheduleId
         */
        public String getScheduleId() {
            return this.scheduleId;
        }

        /**
         * @return scheduleName
         */
        public String getScheduleName() {
            return this.scheduleName;
        }

        public static final class Builder {
            private String createdTime; 
            private String cronExpression; 
            private String description; 
            private Boolean enable; 
            private String lastModifiedTime; 
            private String payload; 
            private String scheduleId; 
            private String scheduleName; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * LastModifiedTime.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * Payload.
             */
            public Builder payload(String payload) {
                this.payload = payload;
                return this;
            }

            /**
             * ScheduleId.
             */
            public Builder scheduleId(String scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * ScheduleName.
             */
            public Builder scheduleName(String scheduleName) {
                this.scheduleName = scheduleName;
                return this;
            }

            public Schedules build() {
                return new Schedules(this);
            } 

        } 

    }
}
