// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCensorPipelineListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCensorPipelineListResponseBody</p>
 */
public class QueryCensorPipelineListResponseBody extends TeaModel {
    @NameInMap("NonExistIds")
    private NonExistIds nonExistIds;

    @NameInMap("PipelineList")
    private PipelineList pipelineList;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCensorPipelineListResponseBody(Builder builder) {
        this.nonExistIds = builder.nonExistIds;
        this.pipelineList = builder.pipelineList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCensorPipelineListResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistIds
     */
    public NonExistIds getNonExistIds() {
        return this.nonExistIds;
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
        private NonExistIds nonExistIds; 
        private PipelineList pipelineList; 
        private String requestId; 

        /**
         * NonExistIds.
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * PipelineList.
         */
        public Builder pipelineList(PipelineList pipelineList) {
            this.pipelineList = pipelineList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCensorPipelineListResponseBody build() {
            return new QueryCensorPipelineListResponseBody(this);
        } 

    } 

    public static class NonExistIds extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private NonExistIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistIds create() {
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

            public NonExistIds build() {
                return new NonExistIds(this);
            } 

        } 

    }
    public static class NotifyConfig extends TeaModel {
        @NameInMap("Queue")
        private String queue;

        @NameInMap("Topic")
        private String topic;

        private NotifyConfig(Builder builder) {
            this.queue = builder.queue;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyConfig create() {
            return builder().build();
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String queue; 
            private String topic; 

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Topic.
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
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("NotifyConfig")
        private NotifyConfig notifyConfig;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("State")
        private String state;

        private Pipeline(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.notifyConfig = builder.notifyConfig;
            this.priority = builder.priority;
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
         * @return priority
         */
        public String getPriority() {
            return this.priority;
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
            private String priority; 
            private String state; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NotifyConfig.
             */
            public Builder notifyConfig(NotifyConfig notifyConfig) {
                this.notifyConfig = notifyConfig;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * State.
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
        @NameInMap("Pipeline")
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
