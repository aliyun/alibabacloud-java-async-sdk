// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link QueryTracedEventByEventIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTracedEventByEventIdResponseBody</p>
 */
public class QueryTracedEventByEventIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryTracedEventByEventIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <p>Success: The request was successful.</p>
         * <p>Other codes: The request failed. For information about error codes, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBusNotExist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5D7B9F4-BF96-51A9-90B1-928955FABB5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. If the operation was successful, the value true is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTracedEventByEventIdResponseBody build() {
            return new QueryTracedEventByEventIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTracedEventByEventIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTracedEventByEventIdResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventReceivedTime")
        private Long eventReceivedTime;

        @com.aliyun.core.annotation.NameInMap("EventSource")
        private String eventSource;

        @com.aliyun.core.annotation.NameInMap("EventType")
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

            private Builder() {
            } 

            private Builder(Events model) {
                this.eventBusName = model.eventBusName;
                this.eventId = model.eventId;
                this.eventReceivedTime = model.eventReceivedTime;
                this.eventSource = model.eventSource;
                this.eventType = model.eventType;
            } 

            /**
             * <p>The name of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>37C-1P6Yn6EM7TcH37Vod8w7rbSeimJ</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The time when the event was delivered to the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>1661773573100</p>
             */
            public Builder eventReceivedTime(Long eventReceivedTime) {
                this.eventReceivedTime = eventReceivedTime;
                return this;
            }

            /**
             * <p>The name of the event source.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-api</p>
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>eventbridge:Events:HTTPEvent</p>
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
    /**
     * 
     * {@link QueryTracedEventByEventIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTracedEventByEventIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List<Events> events;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Total")
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Events> events; 
            private String nextToken; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.events = model.events;
                this.nextToken = model.nextToken;
                this.total = model.total;
            } 

            /**
             * <p>The events.</p>
             */
            public Builder events(java.util.List<Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>If excess return values exist, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
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
