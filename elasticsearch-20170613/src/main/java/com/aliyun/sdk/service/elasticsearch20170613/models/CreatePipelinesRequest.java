// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelinesRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelinesRequest</p>
 */
public class CreatePipelinesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("body")
    private java.util.List < CreatePipelinesRequestBody> body;

    @Query
    @NameInMap("trigger")
    private Boolean trigger;

    private CreatePipelinesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.body = builder.body;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return body
     */
    public java.util.List < CreatePipelinesRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return trigger
     */
    public Boolean getTrigger() {
        return this.trigger;
    }

    public static final class Builder extends Request.Builder<CreatePipelinesRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private java.util.List < CreatePipelinesRequestBody> body; 
        private Boolean trigger; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelinesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.body = request.body;
            this.trigger = request.trigger;
        } 

        /**
         * ls-cn-oew1qbgl\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List < CreatePipelinesRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * false
         */
        public Builder trigger(Boolean trigger) {
            this.putQueryParameter("trigger", trigger);
            this.trigger = trigger;
            return this;
        }

        @Override
        public CreatePipelinesRequest build() {
            return new CreatePipelinesRequest(this);
        } 

    } 

    public static class CreatePipelinesRequestBody extends TeaModel {
        @NameInMap("batchDelay")
        private Integer batchDelay;

        @NameInMap("batchSize")
        private Integer batchSize;

        @NameInMap("config")
        @Validation(required = true)
        private String config;

        @NameInMap("description")
        private String description;

        @NameInMap("pipelineId")
        @Validation(required = true)
        private String pipelineId;

        @NameInMap("queueCheckPointWrites")
        private Integer queueCheckPointWrites;

        @NameInMap("queueMaxBytes")
        private Integer queueMaxBytes;

        @NameInMap("queueType")
        private String queueType;

        @NameInMap("workers")
        private Integer workers;

        private CreatePipelinesRequestBody(Builder builder) {
            this.batchDelay = builder.batchDelay;
            this.batchSize = builder.batchSize;
            this.config = builder.config;
            this.description = builder.description;
            this.pipelineId = builder.pipelineId;
            this.queueCheckPointWrites = builder.queueCheckPointWrites;
            this.queueMaxBytes = builder.queueMaxBytes;
            this.queueType = builder.queueType;
            this.workers = builder.workers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreatePipelinesRequestBody create() {
            return builder().build();
        }

        /**
         * @return batchDelay
         */
        public Integer getBatchDelay() {
            return this.batchDelay;
        }

        /**
         * @return batchSize
         */
        public Integer getBatchSize() {
            return this.batchSize;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return queueCheckPointWrites
         */
        public Integer getQueueCheckPointWrites() {
            return this.queueCheckPointWrites;
        }

        /**
         * @return queueMaxBytes
         */
        public Integer getQueueMaxBytes() {
            return this.queueMaxBytes;
        }

        /**
         * @return queueType
         */
        public String getQueueType() {
            return this.queueType;
        }

        /**
         * @return workers
         */
        public Integer getWorkers() {
            return this.workers;
        }

        public static final class Builder {
            private Integer batchDelay; 
            private Integer batchSize; 
            private String config; 
            private String description; 
            private String pipelineId; 
            private Integer queueCheckPointWrites; 
            private Integer queueMaxBytes; 
            private String queueType; 
            private Integer workers; 

            /**
             * 管道批延迟。单位ms。
             */
            public Builder batchDelay(Integer batchDelay) {
                this.batchDelay = batchDelay;
                return this;
            }

            /**
             * 管道批大小。
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * 管道具体配置。
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * 管道描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 管道Id。
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * 队列检查点写入数。
             */
            public Builder queueCheckPointWrites(Integer queueCheckPointWrites) {
                this.queueCheckPointWrites = queueCheckPointWrites;
                return this;
            }

            /**
             * 队列最大字节数。单位：MB。
             */
            public Builder queueMaxBytes(Integer queueMaxBytes) {
                this.queueMaxBytes = queueMaxBytes;
                return this;
            }

            /**
             * 队列类型。
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * 管道工作线程数。
             */
            public Builder workers(Integer workers) {
                this.workers = workers;
                return this;
            }

            public CreatePipelinesRequestBody build() {
                return new CreatePipelinesRequestBody(this);
            } 

        } 

    }
}
