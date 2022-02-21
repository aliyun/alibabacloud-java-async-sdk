// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBoardEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBoardEventsResponseBody</p>
 */
public class DescribeBoardEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    private java.util.List < Events> events;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBoardEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBoardEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
        return this.events;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Events> events; 
        private String requestId; 

        /**
         * Events.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBoardEventsResponseBody build() {
            return new DescribeBoardEventsResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("EventId")
        private Long eventId;

        @NameInMap("EventType")
        private Integer eventType;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("UserId")
        private Integer userId;

        private Events(Builder builder) {
            this.data = builder.data;
            this.eventId = builder.eventId;
            this.eventType = builder.eventType;
            this.timestamp = builder.timestamp;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
            return this.eventId;
        }

        /**
         * @return eventType
         */
        public Integer getEventType() {
            return this.eventType;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return userId
         */
        public Integer getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String data; 
            private Long eventId; 
            private Integer eventType; 
            private Long timestamp; 
            private Integer userId; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
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
             * EventType.
             */
            public Builder eventType(Integer eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Integer userId) {
                this.userId = userId;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
