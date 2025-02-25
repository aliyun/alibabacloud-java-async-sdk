// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsMessageTraceResponseBody} extends {@link TeaModel}
 *
 * <p>OnsMessageTraceResponseBody</p>
 */
public class OnsMessageTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the message that is queried.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EAE5BE23-37A1-4354-94D6-E44AE17E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsMessageTraceResponseBody build() {
            return new OnsMessageTraceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsMessageTraceResponseBody} extends {@link TeaModel}
     *
     * <p>OnsMessageTraceResponseBody</p>
     */
    public static class MessageTrack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerGroup")
        private String consumerGroup;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TrackType")
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
             * <p>The ID of the consumer group that subscribes to the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test_group_id</p>
             */
            public Builder consumerGroup(String consumerGroup) {
                this.consumerGroup = consumerGroup;
                return this;
            }

            /**
             * <p>The ID of the instance to which the message you want to query belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_111111111111_DOxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the message. Valid values:</p>
             * <ul>
             * <li><strong>CONSUMED</strong>: The message is consumed.</li>
             * <li><strong>CONSUMED_BUT_FILTERED</strong>: No consumer group subscribes to the message. The message is filtered out and not consumed.</li>
             * <li><strong>NOT_CONSUME_YET</strong>: The message is not consumed.</li>
             * <li><strong>NOT_ONLINE</strong>: The consumer group is offline.</li>
             * <li><strong>UNKNOWN</strong>: The message is not consumed due to unknown reasons.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONSUMED</p>
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
    /**
     * 
     * {@link OnsMessageTraceResponseBody} extends {@link TeaModel}
     *
     * <p>OnsMessageTraceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageTrack")
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
