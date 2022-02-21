// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExecutionHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetExecutionHistoryResponseBody</p>
 */
public class GetExecutionHistoryResponseBody extends TeaModel {
    @NameInMap("Events")
    private java.util.List < Events> events;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private GetExecutionHistoryResponseBody(Builder builder) {
        this.events = builder.events;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExecutionHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
        return this.events;
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

    public static final class Builder {
        private java.util.List < Events> events; 
        private String nextToken; 
        private String requestId; 

        /**
         * Events.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

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

        public GetExecutionHistoryResponseBody build() {
            return new GetExecutionHistoryResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("EventDetail")
        private String eventDetail;

        @NameInMap("EventId")
        private Long eventId;

        @NameInMap("ScheduleEventId")
        private Long scheduleEventId;

        @NameInMap("StepName")
        private String stepName;

        @NameInMap("Time")
        private String time;

        @NameInMap("Type")
        private String type;

        private Events(Builder builder) {
            this.eventDetail = builder.eventDetail;
            this.eventId = builder.eventId;
            this.scheduleEventId = builder.scheduleEventId;
            this.stepName = builder.stepName;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return eventDetail
         */
        public String getEventDetail() {
            return this.eventDetail;
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
            return this.eventId;
        }

        /**
         * @return scheduleEventId
         */
        public Long getScheduleEventId() {
            return this.scheduleEventId;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String eventDetail; 
            private Long eventId; 
            private Long scheduleEventId; 
            private String stepName; 
            private String time; 
            private String type; 

            /**
             * EventDetail.
             */
            public Builder eventDetail(String eventDetail) {
                this.eventDetail = eventDetail;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * ScheduleEventId.
             */
            public Builder scheduleEventId(Long scheduleEventId) {
                this.scheduleEventId = scheduleEventId;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
