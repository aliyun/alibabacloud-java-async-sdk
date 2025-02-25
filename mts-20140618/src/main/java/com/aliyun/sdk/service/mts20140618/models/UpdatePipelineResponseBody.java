// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePipelineResponseBody</p>
 */
public class UpdatePipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Pipeline")
    private Pipeline pipeline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdatePipelineResponseBody(Builder builder) {
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelineResponseBody create() {
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
         * <p>The details of the MPS queue.</p>
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1FE0F96B-544D-4244-9D83-DFCFB0E5A231</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePipelineResponseBody build() {
            return new UpdatePipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePipelineResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePipelineResponseBody</p>
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
             * <p>The tags of the messages.</p>
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
             * <p>example1,example2</p>
             */
            public Builder mqTopic(String mqTopic) {
                this.mqTopic = mqTopic;
                return this;
            }

            /**
             * <p>The queue that is created in MNS.</p>
             * 
             * <strong>example:</strong>
             * <p>example-queue-****</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The topic that is created in MNS.</p>
             * 
             * <strong>example:</strong>
             * <p>example-topic-****</p>
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
     * {@link UpdatePipelineResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePipelineResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Pipeline(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.notifyConfig = builder.notifyConfig;
            this.quotaAllocate = builder.quotaAllocate;
            this.role = builder.role;
            this.speed = builder.speed;
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
            private String state; 

            /**
             * <p>The ID of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>d1ce4d3efcb549419193f50f1fcd****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The new name of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>example-pipeline-****</p>
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
             * <p>The role that is assigned to the current RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunMTSExampleRole</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The type of the MPS queue. Default value: <strong>Standard</strong>. Valid values:</p>
             * <ul>
             * <li><strong>Boost</strong>: MPS queue with transcoding speed boosted</li>
             * <li><strong>Standard</strong>: standard MPS queue</li>
             * <li><strong>NarrowBandHDV2</strong>: MPS queue that supports Narrowband HD 2.0</li>
             * <li><strong>AIVideoCover</strong>: MPS queue for intelligent snapshot capture</li>
             * <li><strong>AIVideoFPShot</strong>: MPS queue for media fingerprinting</li>
             * <li><strong>AIVideoCensor</strong>: MPS queue for automated review</li>
             * <li><strong>AIVideoMCU</strong>: MPS queue for smart tagging</li>
             * <li><strong>AIVideoSummary</strong>: MPS queue for video synopsis</li>
             * <li><strong>AIVideoPorn</strong>: MPS queue for pornography detection in videos</li>
             * <li><strong>AIAudioKWS</strong>: MPS queue for keyword recognition in audio</li>
             * <li><strong>AIAudioASR</strong>: MPS queue for speech-to-text conversion</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>The state of the MPS queue. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: The MPS queue is active.</li>
             * <li><strong>Paused</strong>: The MPS queue is paused.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Paused</p>
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
