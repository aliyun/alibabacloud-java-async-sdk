// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link QueryTracedEventByEventIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTracedEventByEventIdResponseBody</p>
 */
public class QueryTracedEventByEventIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryTracedEventByEventIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTracedEventByEventIdResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned HTTP status code. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTracedEventByEventIdResponseBody build() {
            return new QueryTracedEventByEventIdResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("EventBusName")
        private String eventBusName;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventReceivedTime")
        private Long eventReceivedTime;

        @NameInMap("EventSource")
        private String eventSource;

        @NameInMap("EventType")
        private String eventType;

        private Events(Builder builder) {
            this.eventBusName = builder.eventBusName;
            this.eventId = builder.eventId;
            this.eventReceivedTime = builder.eventReceivedTime;
            this.eventSource = builder.eventSource;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventReceivedTime
         */
        public Long getEventReceivedTime() {
            return this.eventReceivedTime;
        }

        /**
         * @return eventSource
         */
        public String getEventSource() {
            return this.eventSource;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventBusName; 
            private String eventId; 
            private Long eventReceivedTime; 
            private String eventSource; 
            private String eventType; 

            /**
             * The name of the event bus.
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * The event ID.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The time when the event was delivered to the event bus.
             */
            public Builder eventReceivedTime(Long eventReceivedTime) {
                this.eventReceivedTime = eventReceivedTime;
                return this;
            }

            /**
             * The name of the event source.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * The event type.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Events")
        private java.util.List < Events> events;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.events = builder.events;
            this.nextToken = builder.nextToken;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Events> events; 
            private String nextToken; 
            private Integer total; 

            /**
             * The events.
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * If excess return values exist, this parameter is returned.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
