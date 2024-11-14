// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserEventTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserEventTypeResponseBody</p>
 */
public class DescribeUserEventTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Event")
    private java.util.List < Event> event;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserEventTypeResponseBody(Builder builder) {
        this.event = builder.event;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserEventTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return event
     */
    public java.util.List < Event> getEvent() {
        return this.event;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Event> event; 
        private String requestId; 

        /**
         * <p>The types and statistics of security events.</p>
         */
        public Builder event(java.util.List < Event> event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>177BA739-6512-5470-98C6-E***0BAA3D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserEventTypeResponseBody build() {
            return new DescribeUserEventTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserEventTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserEventTypeResponseBody</p>
     */
    public static class Event extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Long eventCount;

        @com.aliyun.core.annotation.NameInMap("EventParentType")
        private String eventParentType;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        private Event(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventCount = builder.eventCount;
            this.eventParentType = builder.eventParentType;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Event create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventCount
         */
        public Long getEventCount() {
            return this.eventCount;
        }

        /**
         * @return eventParentType
         */
        public String getEventParentType() {
            return this.eventParentType;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventCode; 
            private Long eventCount; 
            private String eventParentType; 
            private String eventType; 

            /**
             * <p>The code of the security event.</p>
             * 
             * <strong>example:</strong>
             * <p>Event_LoginCollision</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>The number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder eventCount(Long eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * <p>The parent type of the security event.</p>
             * 
             * <strong>example:</strong>
             * <p>EventType_Account</p>
             */
            public Builder eventParentType(String eventParentType) {
                this.eventParentType = eventParentType;
                return this;
            }

            /**
             * <p>The type of the security event.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeApisecRules~~">DescribeApisecRules</a> operation to query the supported types of security events.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Event_AbnormalFrequency</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public Event build() {
                return new Event(this);
            } 

        } 

    }
}
