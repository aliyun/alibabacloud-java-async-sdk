// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AISearchV2ResponseBody} extends {@link TeaModel}
 *
 * <p>AISearchV2ResponseBody</p>
 */
public class AISearchV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private AISearchV2ResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private String payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AISearchV2ResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return header
     */
    public AISearchV2ResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AISearchV2ResponseBodyHeader header; 
        private String payload; 
        private String requestId; 

        /**
         * header.
         */
        public Builder header(AISearchV2ResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * payload.
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AISearchV2ResponseBody build() {
            return new AISearchV2ResponseBody(this);
        } 

    } 

    public static class AISearchV2ResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("eventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("responseTime")
        private String responseTime;

        private AISearchV2ResponseBodyHeader(Builder builder) {
            this.event = builder.event;
            this.eventId = builder.eventId;
            this.responseTime = builder.responseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AISearchV2ResponseBodyHeader create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return responseTime
         */
        public String getResponseTime() {
            return this.responseTime;
        }

        public static final class Builder {
            private String event; 
            private String eventId; 
            private String responseTime; 

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * eventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * responseTime.
             */
            public Builder responseTime(String responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            public AISearchV2ResponseBodyHeader build() {
                return new AISearchV2ResponseBodyHeader(this);
            } 

        } 

    }
}
