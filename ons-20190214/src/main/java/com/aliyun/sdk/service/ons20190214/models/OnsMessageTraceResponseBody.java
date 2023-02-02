// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessageTraceResponseBody} extends {@link TeaModel}
 *
 * <p>OnsMessageTraceResponseBody</p>
 */
public class OnsMessageTraceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsMessageTraceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsMessageTraceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The information about the message that is queried.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsMessageTraceResponseBody build() {
            return new OnsMessageTraceResponseBody(this);
        } 

    } 

    public static class MessageTrack extends TeaModel {
        @NameInMap("ConsumerGroup")
        private String consumerGroup;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TrackType")
        private String trackType;

        private MessageTrack(Builder builder) {
            this.consumerGroup = builder.consumerGroup;
            this.instanceId = builder.instanceId;
            this.trackType = builder.trackType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageTrack create() {
            return builder().build();
        }

        /**
         * @return consumerGroup
         */
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return trackType
         */
        public String getTrackType() {
            return this.trackType;
        }

        public static final class Builder {
            private String consumerGroup; 
            private String instanceId; 
            private String trackType; 

            /**
             * The ID of the consumer group that subscribes to the topic.
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * The ID of the instance where the message that you want to query resides.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The status of the message. Valid values:
             * <p>
             * 
             * *   **CONSUMED**: The message is consumed.
             * *   **CONSUMED_BUT_FILTERED:** No consumer groups subscribe to the message. The message is filtered out and not consumed.
             * *   **NOT_CONSUME_YET**: The message is pending to be consumed.
             * *   **NOT_ONLINE**: The consumer group is offline.
             * *   **UNKNOWN**: The message is not consumed due to unknown reasons.
             */
            public Builder trackType(String trackType) {
                this.trackType = trackType;
                return this;
            }

            public MessageTrack build() {
                return new MessageTrack(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("MessageTrack")
        private java.util.List < MessageTrack> messageTrack;

        private Data(Builder builder) {
            this.messageTrack = builder.messageTrack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return messageTrack
         */
        public java.util.List < MessageTrack> getMessageTrack() {
            return this.messageTrack;
        }

        public static final class Builder {
            private java.util.List < MessageTrack> messageTrack; 

            /**
             * MessageTrack.
             */
            public Builder messageTrack(java.util.List < MessageTrack> messageTrack) {
                this.messageTrack = messageTrack;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
