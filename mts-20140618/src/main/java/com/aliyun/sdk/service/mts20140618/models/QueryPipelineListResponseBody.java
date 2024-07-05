// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPipelineListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPipelineListResponseBody</p>
 */
public class QueryPipelineListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistPids")
    private NonExistPids nonExistPids;

    @com.aliyun.core.annotation.NameInMap("PipelineList")
    private PipelineList pipelineList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryPipelineListResponseBody(Builder builder) {
        this.nonExistPids = builder.nonExistPids;
        this.pipelineList = builder.pipelineList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPipelineListResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistPids
     */
    public NonExistPids getNonExistPids() {
        return this.nonExistPids;
    }

    /**
     * @return pipelineList
     */
    public PipelineList getPipelineList() {
        return this.pipelineList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NonExistPids nonExistPids; 
        private PipelineList pipelineList; 
        private String requestId; 

        /**
         * The IDs of MPS queues that do not exist.
         */
        public Builder nonExistPids(NonExistPids nonExistPids) {
            this.nonExistPids = nonExistPids;
            return this;
        }

        /**
         * The MPS queues.
         */
        public Builder pipelineList(PipelineList pipelineList) {
            this.pipelineList = pipelineList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPipelineListResponseBody build() {
            return new QueryPipelineListResponseBody(this);
        } 

    } 

    public static class NonExistPids extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private NonExistPids(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistPids create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistPids build() {
                return new NonExistPids(this);
            } 

        } 

    }
    public static class ExtendConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsBoostNew")
        private Boolean isBoostNew;

        @com.aliyun.core.annotation.NameInMap("MaxMultiSpeed")
        private Integer maxMultiSpeed;

        @com.aliyun.core.annotation.NameInMap("MultiSpeedDowngradePolicy")
        private String multiSpeedDowngradePolicy;

        private ExtendConfig(Builder builder) {
            this.isBoostNew = builder.isBoostNew;
            this.maxMultiSpeed = builder.maxMultiSpeed;
            this.multiSpeedDowngradePolicy = builder.multiSpeedDowngradePolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendConfig create() {
            return builder().build();
        }

        /**
         * @return isBoostNew
         */
        public Boolean getIsBoostNew() {
            return this.isBoostNew;
        }

        /**
         * @return maxMultiSpeed
         */
        public Integer getMaxMultiSpeed() {
            return this.maxMultiSpeed;
        }

        /**
         * @return multiSpeedDowngradePolicy
         */
        public String getMultiSpeedDowngradePolicy() {
            return this.multiSpeedDowngradePolicy;
        }

        public static final class Builder {
            private Boolean isBoostNew; 
            private Integer maxMultiSpeed; 
            private String multiSpeedDowngradePolicy; 

            /**
             * IsBoostNew.
             */
            public Builder isBoostNew(Boolean isBoostNew) {
                this.isBoostNew = isBoostNew;
                return this;
            }

            /**
             * MaxMultiSpeed.
             */
            public Builder maxMultiSpeed(Integer maxMultiSpeed) {
                this.maxMultiSpeed = maxMultiSpeed;
                return this;
            }

            /**
             * MultiSpeedDowngradePolicy.
             */
            public Builder multiSpeedDowngradePolicy(String multiSpeedDowngradePolicy) {
                this.multiSpeedDowngradePolicy = multiSpeedDowngradePolicy;
                return this;
            }

            public ExtendConfig build() {
                return new ExtendConfig(this);
            } 

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
             * The name of the queue that is created in MNS.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The name of the topic that is created in MNS.
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
        @com.aliyun.core.annotation.NameInMap("ExtendConfig")
        private ExtendConfig extendConfig;

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
            this.extendConfig = builder.extendConfig;
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
         * @return extendConfig
         */
        public ExtendConfig getExtendConfig() {
            return this.extendConfig;
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
            private ExtendConfig extendConfig; 
            private String id; 
            private String name; 
            private NotifyConfig notifyConfig; 
            private Long quotaAllocate; 
            private String role; 
            private String speed; 
            private Long speedLevel; 
            private String state; 

            /**
             * ExtendConfig.
             */
            public Builder extendConfig(ExtendConfig extendConfig) {
                this.extendConfig = extendConfig;
                return this;
            }

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
             * The Message Service (MNS) configuration.
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
             * The role that is assigned to the current RAM user.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The type of the MPS queue. Default value: **Standard**. Valid values:
             * <p>
             * 
             * *   **Boost**: MPS queue with transcoding speed boosted
             * *   **Standard**: standard MPS queue
             * *   **NarrowBandHDV2**: MPS queue that supports Narrowband HD 2.0
             * *   **AIVideoCover**: MPS queue for intelligent snapshot capture
             * *   **AIVideoFPShot**: MPS queue for media fingerprinting
             * *   **AIVideoCensor**: MPS queue for automated review
             * *   **AIVideoMCU**: MPS queue for smart tagging
             * *   **AIVideoSummary**: MPS queue for video synopsis
             * *   **AIVideoPorn**: MPS queue for pornography detection in videos
             * *   **AIAudioKWS**: MPS queue for keyword recognition in audio
             * *   **AIAudioASR**: MPS queue for speech-to-text conversion
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
             * The state of the MPS queue. Valid values:
             * <p>
             * 
             * *   **Active**: The MPS queue is active.
             * *   **Paused**: The MPS queue is paused.
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
    public static class PipelineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pipeline")
        private java.util.List < Pipeline> pipeline;

        private PipelineList(Builder builder) {
            this.pipeline = builder.pipeline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineList create() {
            return builder().build();
        }

        /**
         * @return pipeline
         */
        public java.util.List < Pipeline> getPipeline() {
            return this.pipeline;
        }

        public static final class Builder {
            private java.util.List < Pipeline> pipeline; 

            /**
             * Pipeline.
             */
            public Builder pipeline(java.util.List < Pipeline> pipeline) {
                this.pipeline = pipeline;
                return this;
            }

            public PipelineList build() {
                return new PipelineList(this);
            } 

        } 

    }
}
