// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchPipelineResponseBody build() {
            return new SearchPipelineResponseBody(this);
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
             * The tags.
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
