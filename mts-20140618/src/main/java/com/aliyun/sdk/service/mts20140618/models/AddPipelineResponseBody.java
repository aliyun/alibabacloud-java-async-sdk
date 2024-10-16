// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>AddPipelineResponseBody</p>
 */
public class AddPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Pipeline")
    private Pipeline pipeline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddPipelineResponseBody(Builder builder) {
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPipelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return pipeline
     */
    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Pipeline pipeline; 
        private String requestId; 

        /**
         * <p>The MPS queue.</p>
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CFEA608A-5A1C-4C83-A54B-6197BC250D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPipelineResponseBody build() {
            return new AddPipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>AddPipelineResponseBody</p>
     */
    public static class NotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MqTag")
        private String mqTag;

        @com.aliyun.core.annotation.NameInMap("MqTopic")
        private String mqTopic;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private NotifyConfig(Builder builder) {
            this.mqTag = builder.mqTag;
            this.mqTopic = builder.mqTopic;
            this.queueName = builder.queueName;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyConfig create() {
            return builder().build();
        }

        /**
         * @return mqTag
         */
        public String getMqTag() {
            return this.mqTag;
        }

        /**
         * @return mqTopic
         */
        public String getMqTopic() {
            return this.mqTopic;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String mqTag; 
            private String mqTopic; 
            private String queueName; 
            private String topic; 

            /**
             * <p>The tag string.</p>
             * 
             * <strong>example:</strong>
             * <p>mts-test</p>
             */
            public Builder mqTag(String mqTag) {
                this.mqTag = mqTag;
                return this;
            }

            /**
             * <p>The queue of messages that are received.</p>
             * 
             * <strong>example:</strong>
             * <p>example1</p>
             */
            public Builder mqTopic(String mqTopic) {
                this.mqTopic = mqTopic;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>mts-queue-1</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The name of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>mts-topic-1</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public NotifyConfig build() {
                return new NotifyConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>AddPipelineResponseBody</p>
     */
    public static class Pipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotifyConfig")
        private NotifyConfig notifyConfig;

        @com.aliyun.core.annotation.NameInMap("QuotaAllocate")
        private Long quotaAllocate;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private String speed;

        @com.aliyun.core.annotation.NameInMap("SpeedLevel")
        private Long speedLevel;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Pipeline(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.notifyConfig = builder.notifyConfig;
            this.quotaAllocate = builder.quotaAllocate;
            this.role = builder.role;
            this.speed = builder.speed;
            this.speedLevel = builder.speedLevel;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipeline create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return notifyConfig
         */
        public NotifyConfig getNotifyConfig() {
            return this.notifyConfig;
        }

        /**
         * @return quotaAllocate
         */
        public Long getQuotaAllocate() {
            return this.quotaAllocate;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return speedLevel
         */
        public Long getSpeedLevel() {
            return this.speedLevel;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private NotifyConfig notifyConfig; 
            private Long quotaAllocate; 
            private String role; 
            private String speed; 
            private Long speedLevel; 
            private String state; 

            /**
             * <p>The ID of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>ed450ea0bfbd41e29f80a401fb4d****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>Media Fingerprint</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The MNS configuration.</p>
             */
            public Builder notifyConfig(NotifyConfig notifyConfig) {
                this.notifyConfig = notifyConfig;
                return this;
            }

            /**
             * <p>The quota that is allocated to the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder quotaAllocate(Long quotaAllocate) {
                this.quotaAllocate = quotaAllocate;
                return this;
            }

            /**
             * <p>The role.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunMTSDefaultRole</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The type of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>The level of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder speedLevel(Long speedLevel) {
                this.speedLevel = speedLevel;
                return this;
            }

            /**
             * <p>The state of the MPS queue.</p>
             * <ul>
             * <li>Active: The MPS queue is active. The jobs in the MPS queue are scheduled and transcoded by MPS.</li>
             * <li>Paused: The MPS queue is paused. Jobs in the MPS queue are no longer scheduled for transcoding by MPS. All of the jobs in the MPS queue remain in the Submitted state. Jobs that are being transcoded are not affected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Pipeline build() {
                return new Pipeline(this);
            } 

        } 

    }
}
