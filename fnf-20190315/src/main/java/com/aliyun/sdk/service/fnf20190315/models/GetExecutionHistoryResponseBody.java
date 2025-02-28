// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link GetExecutionHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetExecutionHistoryResponseBody</p>
 */
public class GetExecutionHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<Events> getEvents() {
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
        private java.util.List<Events> events; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The events.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>You do not need to specify this parameter for the first request. The returned value of <strong>ScheduleEventId</strong> is used as the token for the next query. No value is returned for the last query.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testRequestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExecutionHistoryResponseBody build() {
            return new GetExecutionHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExecutionHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetExecutionHistoryResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventDetail")
        private String eventDetail;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private Long eventId;

        @com.aliyun.core.annotation.NameInMap("ScheduleEventId")
        private Long scheduleEventId;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The details about the execution step.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder eventDetail(String eventDetail) {
                this.eventDetail = eventDetail;
                return this;
            }

            /**
             * <p>The ID of the execution step.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The ID of the scheduling step.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scheduleEventId(Long scheduleEventId) {
                this.scheduleEventId = scheduleEventId;
                return this;
            }

            /**
             * <p>The name of the execution step.</p>
             * 
             * <strong>example:</strong>
             * <p>passStep</p>
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * <p>The time when the event was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T01:01:01.001Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The type of the execution step. Valid values:</p>
             * <ul>
             * <li><strong>StepEntered</strong></li>
             * <li><strong>StepStarted</strong></li>
             * <li><strong>StepSucceeded</strong></li>
             * <li><strong>StepFailed</strong></li>
             * <li><strong>StepExited</strong></li>
             * <li><strong>BranchEntered</strong></li>
             * <li><strong>BranchExited</strong></li>
             * <li><strong>IterationEntered</strong></li>
             * <li><strong>IterationExited</strong></li>
             * <li><strong>TaskScheduled</strong></li>
             * <li><strong>TaskStarted</strong></li>
             * <li><strong>TaskSubmitted</strong></li>
             * <li><strong>TaskSubmitFailed</strong></li>
             * <li><strong>TaskSucceeded</strong></li>
             * <li><strong>TaskFailed</strong></li>
             * <li><strong>TaskTimedOut</strong></li>
             * <li><strong>ExecutionStarted</strong></li>
             * <li><strong>ExecutionStopped</strong></li>
             * <li><strong>ExecutionSucceeded</strong></li>
             * <li><strong>ExecutionFailed</strong></li>
             * <li><strong>ExecutionTimedOut</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TaskSucceeded</p>
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
