// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The IDs of MPS queues that do not exist.</p>
         */
        public Builder nonExistPids(NonExistPids nonExistPids) {
            this.nonExistPids = nonExistPids;
            return this;
        }

        /**
         * <p>The MPS queues.</p>
         */
        public Builder pipelineList(PipelineList pipelineList) {
            this.pipelineList = pipelineList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1C538EAA-ACAF-5AD8-B091-A72C63007149</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPipelineListResponseBody build() {
            return new QueryPipelineListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPipelineListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPipelineListResponseBody</p>
     */
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
    /**
     * 
     * {@link QueryPipelineListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPipelineListResponseBody</p>
     */
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
    /**
     * 
     * {@link QueryPipelineListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPipelineListResponseBody</p>
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
             * <p>example1,example2</p>
             */
            public Builder mqTopic(String mqTopic) {
                this.mqTopic = mqTopic;
                return this;
            }

            /**
             * <p>The name of the queue that is created in MNS.</p>
             * 
             * <strong>example:</strong>
             * <p>example-queue-****</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The name of the topic that is created in MNS.</p>
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
     * {@link QueryPipelineListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPipelineListResponseBody</p>
     */
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
             * <p>The name of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>example-pipeline-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Message Service (MNS) configuration.</p>
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
             * <p>AliyunMTSDefaultRole</p>
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
             * <p>The level of the MPS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder speedLevel(Long speedLevel) {
                this.speedLevel = speedLevel;
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
    /**
     * 
     * {@link QueryPipelineListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPipelineListResponseBody</p>
     */
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
