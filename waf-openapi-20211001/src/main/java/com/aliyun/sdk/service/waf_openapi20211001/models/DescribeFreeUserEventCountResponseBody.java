// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFreeUserEventCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFreeUserEventCountResponseBody</p>
 */
public class DescribeFreeUserEventCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Event")
    private Event event;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFreeUserEventCountResponseBody(Builder builder) {
        this.event = builder.event;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFreeUserEventCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return event
     */
    public Event getEvent() {
        return this.event;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Event event; 
        private String requestId; 

        /**
         * <p>The information about the security events that are detected by using the basic detection feature.</p>
         */
        public Builder event(Event event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0D9FB3BC-0DE9-58A8-9663-ACE56F24F405</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFreeUserEventCountResponseBody build() {
            return new DescribeFreeUserEventCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFreeUserEventCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFreeUserEventCountResponseBody</p>
     */
    public static class Event extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventHigh")
        private Long eventHigh;

        @com.aliyun.core.annotation.NameInMap("EventLow")
        private Long eventLow;

        @com.aliyun.core.annotation.NameInMap("EventMedium")
        private Long eventMedium;

        @com.aliyun.core.annotation.NameInMap("EventTotal")
        private Long eventTotal;

        private Event(Builder builder) {
            this.eventHigh = builder.eventHigh;
            this.eventLow = builder.eventLow;
            this.eventMedium = builder.eventMedium;
            this.eventTotal = builder.eventTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Event create() {
            return builder().build();
        }

        /**
         * @return eventHigh
         */
        public Long getEventHigh() {
            return this.eventHigh;
        }

        /**
         * @return eventLow
         */
        public Long getEventLow() {
            return this.eventLow;
        }

        /**
         * @return eventMedium
         */
        public Long getEventMedium() {
            return this.eventMedium;
        }

        /**
         * @return eventTotal
         */
        public Long getEventTotal() {
            return this.eventTotal;
        }

        public static final class Builder {
            private Long eventHigh; 
            private Long eventLow; 
            private Long eventMedium; 
            private Long eventTotal; 

            /**
             * <p>The number of high-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventHigh(Long eventHigh) {
                this.eventHigh = eventHigh;
                return this;
            }

            /**
             * <p>The number of low-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder eventLow(Long eventLow) {
                this.eventLow = eventLow;
                return this;
            }

            /**
             * <p>The number of medium-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder eventMedium(Long eventMedium) {
                this.eventMedium = eventMedium;
                return this;
            }

            /**
             * <p>The total number of security events.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder eventTotal(Long eventTotal) {
                this.eventTotal = eventTotal;
                return this;
            }

            public Event build() {
                return new Event(this);
            } 

        } 

    }
}
