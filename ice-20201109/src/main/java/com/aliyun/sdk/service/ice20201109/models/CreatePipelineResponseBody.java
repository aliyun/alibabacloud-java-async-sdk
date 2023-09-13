// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePipelineResponseBody</p>
 */
public class CreatePipelineResponseBody extends TeaModel {
    @NameInMap("Pipeline")
    private Pipeline pipeline;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePipelineResponseBody(Builder builder) {
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineResponseBody create() {
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
         * Pipeline.
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePipelineResponseBody build() {
            return new CreatePipelineResponseBody(this);
        } 

    } 

    public static class Pipeline extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Speed")
        private String speed;

        @NameInMap("Status")
        private String status;

        private Pipeline(Builder builder) {
            this.createTime = builder.createTime;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
            this.speed = builder.speed;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipeline create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String modifiedTime; 
            private String name; 
            private String pipelineId; 
            private Integer priority; 
            private String speed; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
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
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Pipeline build() {
                return new Pipeline(this);
            } 

        } 

    }
}
