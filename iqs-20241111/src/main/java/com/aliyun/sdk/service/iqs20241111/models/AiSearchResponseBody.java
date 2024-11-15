// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AiSearchResponseBody} extends {@link TeaModel}
 *
 * <p>AiSearchResponseBody</p>
 */
public class AiSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private AiSearchResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private String payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AiSearchResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiSearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return header
     */
    public AiSearchResponseBodyHeader getHeader() {
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
        private AiSearchResponseBodyHeader header; 
        private String payload; 
        private String requestId; 

        /**
         * header.
         */
        public Builder header(AiSearchResponseBodyHeader header) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AiSearchResponseBody build() {
            return new AiSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AiSearchResponseBody} extends {@link TeaModel}
     *
     * <p>AiSearchResponseBody</p>
     */
    public static class AiSearchResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("eventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("responseTime")
        private Long responseTime;

        private AiSearchResponseBodyHeader(Builder builder) {
            this.event = builder.event;
            this.eventId = builder.eventId;
            this.responseTime = builder.responseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiSearchResponseBodyHeader create() {
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
        public Long getResponseTime() {
            return this.responseTime;
        }

        public static final class Builder {
            private String event; 
            private String eventId; 
            private Long responseTime; 

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
            public Builder responseTime(Long responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            public AiSearchResponseBodyHeader build() {
                return new AiSearchResponseBodyHeader(this);
            } 

        } 

    }
}
