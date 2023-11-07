// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedEventsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedEventsResponseBody</p>
 */
public class GetAccessKeyLastUsedEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    @Validation(required = true)
    private java.util.List < Events> events;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    private GetAccessKeyLastUsedEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedEventsResponseBody create() {
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
         * The list of returned events.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * The token that determines the start point of the query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyLastUsedEventsResponseBody build() {
            return new GetAccessKeyLastUsedEventsResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("Source")
        private String source;

        @NameInMap("UsedTimestamp")
        private Long usedTimestamp;

        private Events(Builder builder) {
            this.detail = builder.detail;
            this.eventName = builder.eventName;
            this.source = builder.source;
            this.usedTimestamp = builder.usedTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return usedTimestamp
         */
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

        public static final class Builder {
            private String detail; 
            private String eventName; 
            private String source; 
            private Long usedTimestamp; 

            /**
             * An array that consists of the details about the event.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The name of the event.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The event source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The timestamp when the event was generated.
             */
            public Builder usedTimestamp(Long usedTimestamp) {
                this.usedTimestamp = usedTimestamp;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
