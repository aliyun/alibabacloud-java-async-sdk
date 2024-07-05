// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The MPS queue.
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPipelineResponseBody build() {
            return new AddPipelineResponseBody(this);
        } 

    } 

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
             * The tag string.
             */
            public Builder mqTag(String mqTag) {
                this.mqTag = mqTag;
                return this;
            }

            /**
             * The queue of messages that are received.
             */
            public Builder mqTopic(String mqTopic) {
                this.mqTopic = mqTopic;
                return this;
            }

            /**
             * The name of the queue.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The name of the topic.
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
             * The ID of the MPS queue.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the MPS queue.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The MNS configuration.
             */
            public Builder notifyConfig(NotifyConfig notifyConfig) {
                this.notifyConfig = notifyConfig;
                return this;
            }

            /**
             * The quota that is allocated to the MPS queue.
             */
            public Builder quotaAllocate(Long quotaAllocate) {
                this.quotaAllocate = quotaAllocate;
                return this;
            }

            /**
             * The role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The type of the MPS queue.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * The level of the MPS queue.
             */
            public Builder speedLevel(Long speedLevel) {
                this.speedLevel = speedLevel;
                return this;
            }

            /**
             * The state of the MPS queue.
             * <p>
             * 
             * *   Active: The MPS queue is active. The jobs in the MPS queue are scheduled and transcoded by MPS.
             * *   Paused: The MPS queue is paused. Jobs in the MPS queue are no longer scheduled for transcoding by MPS. All of the jobs in the MPS queue remain in the Submitted state. Jobs that are being transcoded are not affected.
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
