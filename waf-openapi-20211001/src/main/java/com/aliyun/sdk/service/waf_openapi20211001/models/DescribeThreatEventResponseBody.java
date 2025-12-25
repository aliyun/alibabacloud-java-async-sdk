// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeThreatEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeThreatEventResponseBody</p>
 */
public class DescribeThreatEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ThreatEvents")
    private java.util.List<ThreatEvents> threatEvents;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeThreatEventResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.threatEvents = builder.threatEvents;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeThreatEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return threatEvents
     */
    public java.util.List<ThreatEvents> getThreatEvents() {
        return this.threatEvents;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ThreatEvents> threatEvents; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeThreatEventResponseBody model) {
            this.requestId = model.requestId;
            this.threatEvents = model.threatEvents;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ThreatEvents.
         */
        public Builder threatEvents(java.util.List<ThreatEvents> threatEvents) {
            this.threatEvents = threatEvents;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeThreatEventResponseBody build() {
            return new DescribeThreatEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeThreatEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeThreatEventResponseBody</p>
     */
    public static class ThreatEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockRate")
        private String blockRate;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventSrc")
        private String eventSrc;

        @com.aliyun.core.annotation.NameInMap("EventTag")
        private String eventTag;

        @com.aliyun.core.annotation.NameInMap("EventTarget")
        private String eventTarget;

        private ThreatEvents(Builder builder) {
            this.blockRate = builder.blockRate;
            this.endTime = builder.endTime;
            this.eventId = builder.eventId;
            this.eventLevel = builder.eventLevel;
            this.eventSrc = builder.eventSrc;
            this.eventTag = builder.eventTag;
            this.eventTarget = builder.eventTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreatEvents create() {
            return builder().build();
        }

        /**
         * @return blockRate
         */
        public String getBlockRate() {
            return this.blockRate;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventSrc
         */
        public String getEventSrc() {
            return this.eventSrc;
        }

        /**
         * @return eventTag
         */
        public String getEventTag() {
            return this.eventTag;
        }

        /**
         * @return eventTarget
         */
        public String getEventTarget() {
            return this.eventTarget;
        }

        public static final class Builder {
            private String blockRate; 
            private Long endTime; 
            private String eventId; 
            private String eventLevel; 
            private String eventSrc; 
            private String eventTag; 
            private String eventTarget; 

            private Builder() {
            } 

            private Builder(ThreatEvents model) {
                this.blockRate = model.blockRate;
                this.endTime = model.endTime;
                this.eventId = model.eventId;
                this.eventLevel = model.eventLevel;
                this.eventSrc = model.eventSrc;
                this.eventTag = model.eventTag;
                this.eventTarget = model.eventTarget;
            } 

            /**
             * BlockRate.
             */
            public Builder blockRate(String blockRate) {
                this.blockRate = blockRate;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * EventSrc.
             */
            public Builder eventSrc(String eventSrc) {
                this.eventSrc = eventSrc;
                return this;
            }

            /**
             * EventTag.
             */
            public Builder eventTag(String eventTag) {
                this.eventTag = eventTag;
                return this;
            }

            /**
             * EventTarget.
             */
            public Builder eventTarget(String eventTarget) {
                this.eventTarget = eventTarget;
                return this;
            }

            public ThreatEvents build() {
                return new ThreatEvents(this);
            } 

        } 

    }
}
