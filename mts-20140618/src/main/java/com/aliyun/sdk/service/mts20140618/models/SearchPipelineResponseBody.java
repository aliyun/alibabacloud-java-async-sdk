// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>SearchPipelineResponseBody</p>
 */
public class SearchPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("PipelineList")
    private PipelineList pipelineList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private SearchPipelineResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pipelineList = builder.pipelineList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPipelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private PipelineList pipelineList; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * <p>338CA33A-AE83-5DF4-B6F2-C6D3ED8143F5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchPipelineResponseBody build() {
            return new SearchPipelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>SearchPipelineResponseBody</p>
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
             * <p>The tags.</p>
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
     * {@link SearchPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>SearchPipelineResponseBody</p>
     */
    public static class Pipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

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
            this.creationTime = builder.creationTime;
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
            private String creationTime; 
            private String id; 
            private String name; 
            private NotifyConfig notifyConfig; 
            private Long quotaAllocate; 
            private String role; 
            private String speed; 
            private Long speedLevel; 
            private String state; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * <p>1</p>
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
     * {@link SearchPipelineResponseBody} extends {@link TeaModel}
     *
     * <p>SearchPipelineResponseBody</p>
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
