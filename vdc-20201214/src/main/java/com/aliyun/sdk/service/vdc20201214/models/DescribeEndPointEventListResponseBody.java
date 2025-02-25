// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndPointEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEndPointEventListResponseBody</p>
 */
public class DescribeEndPointEventListResponseBody extends TeaModel {
    @NameInMap("Nodes")
    private java.util.List < Nodes> nodes;

    @NameInMap("RequestId")
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

    public static class EventList extends TeaModel {
        @NameInMap("Acs")
        private String acs;

        @NameInMap("EventCode")
        private String eventCode;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Os")
        private String os;

        @NameInMap("Sdk")
        private String sdk;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("StreamType")
        private String streamType;

        @NameInMap("TrackCode")
        private String trackCode;

        @NameInMap("TrackName")
        private String trackName;

        @NameInMap("Ts")
        private Long ts;

        @NameInMap("TsInMs")
        private String tsInMs;

        @NameInMap("UserId")
        private String userId;

        private EventList(Builder builder) {
            this.acs = builder.acs;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.os = builder.os;
            this.sdk = builder.sdk;
            this.streamName = builder.streamName;
            this.streamType = builder.streamType;
            this.trackCode = builder.trackCode;
            this.trackName = builder.trackName;
            this.ts = builder.ts;
            this.tsInMs = builder.tsInMs;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return acs
         */
        public String getAcs() {
            return this.acs;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
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
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return sdk
         */
        public String getSdk() {
            return this.sdk;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return streamType
         */
        public String getStreamType() {
            return this.streamType;
        }

        /**
         * @return trackCode
         */
        public String getTrackCode() {
            return this.trackCode;
        }

        /**
         * @return trackName
         */
        public String getTrackName() {
            return this.trackName;
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

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String acs; 
            private String eventCode; 
            private String eventName; 
            private String eventType; 
            private String os; 
            private String sdk; 
            private String streamName; 
            private String streamType; 
            private String trackCode; 
            private String trackName; 
            private Long ts; 
            private String tsInMs; 
            private String userId; 

            /**
             * Acs.
             */
            public Builder acs(String acs) {
                this.acs = acs;
                return this;
            }

            /**
             * EventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

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
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * Sdk.
             */
            public Builder sdk(String sdk) {
                this.sdk = sdk;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * TrackCode.
             */
            public Builder trackCode(String trackCode) {
                this.trackCode = trackCode;
                return this;
            }

            /**
             * TrackName.
             */
            public Builder trackName(String trackName) {
                this.trackName = trackName;
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

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
    public static class EventDataItems extends TeaModel {
        @NameInMap("EventList")
        private java.util.List < EventList> eventList;

        @NameInMap("Ts")
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
    public static class Nodes extends TeaModel {
        @NameInMap("EventDataItems")
        private java.util.List < EventDataItems> eventDataItems;

        @NameInMap("UserId")
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
