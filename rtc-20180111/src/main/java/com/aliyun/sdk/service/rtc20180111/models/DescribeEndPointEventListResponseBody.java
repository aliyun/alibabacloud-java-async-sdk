// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEndPointEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEndPointEventListResponseBody</p>
 */
public class DescribeEndPointEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List < Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEndPointEventListResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEndPointEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodes
     */
    public java.util.List < Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Nodes> nodes; 
        private String requestId; 

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEndPointEventListResponseBody build() {
            return new DescribeEndPointEventListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEndPointEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndPointEventListResponseBody</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private Long ts;

        @com.aliyun.core.annotation.NameInMap("TsInMs")
        private String tsInMs;

        private EventList(Builder builder) {
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.ts = builder.ts;
            this.tsInMs = builder.tsInMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return ts
         */
        public Long getTs() {
            return this.ts;
        }

        /**
         * @return tsInMs
         */
        public String getTsInMs() {
            return this.tsInMs;
        }

        public static final class Builder {
            private String eventName; 
            private String eventType; 
            private Long ts; 
            private String tsInMs; 

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            /**
             * TsInMs.
             */
            public Builder tsInMs(String tsInMs) {
                this.tsInMs = tsInMs;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEndPointEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndPointEventListResponseBody</p>
     */
    public static class EventDataItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventList")
        private java.util.List < EventList> eventList;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private Long ts;

        private EventDataItems(Builder builder) {
            this.eventList = builder.eventList;
            this.ts = builder.ts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventDataItems create() {
            return builder().build();
        }

        /**
         * @return eventList
         */
        public java.util.List < EventList> getEventList() {
            return this.eventList;
        }

        /**
         * @return ts
         */
        public Long getTs() {
            return this.ts;
        }

        public static final class Builder {
            private java.util.List < EventList> eventList; 
            private Long ts; 

            /**
             * EventList.
             */
            public Builder eventList(java.util.List < EventList> eventList) {
                this.eventList = eventList;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            public EventDataItems build() {
                return new EventDataItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEndPointEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndPointEventListResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventDataItems")
        private java.util.List < EventDataItems> eventDataItems;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Nodes(Builder builder) {
            this.eventDataItems = builder.eventDataItems;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return eventDataItems
         */
        public java.util.List < EventDataItems> getEventDataItems() {
            return this.eventDataItems;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < EventDataItems> eventDataItems; 
            private String userId; 

            /**
             * EventDataItems.
             */
            public Builder eventDataItems(java.util.List < EventDataItems> eventDataItems) {
                this.eventDataItems = eventDataItems;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
