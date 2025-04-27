// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePipelinesRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelinesRequest</p>
 */
public class CreatePipelinesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<CreatePipelinesRequestBody> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("trigger")
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
    public java.util.List<CreatePipelinesRequestBody> getBody() {
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
        private java.util.List<CreatePipelinesRequestBody> body; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-oew1qbgl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List<CreatePipelinesRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * trigger.
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

    /**
     * 
     * {@link CreatePipelinesRequest} extends {@link TeaModel}
     *
     * <p>CreatePipelinesRequest</p>
     */
    public static class CreatePipelinesRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchDelay")
        private Integer batchDelay;

        @com.aliyun.core.annotation.NameInMap("batchSize")
        private Integer batchSize;

        @com.aliyun.core.annotation.NameInMap("config")
        @com.aliyun.core.annotation.Validation(required = true)
        private String config;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("pipelineId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("queueCheckPointWrites")
        private Integer queueCheckPointWrites;

        @com.aliyun.core.annotation.NameInMap("queueMaxBytes")
        private Integer queueMaxBytes;

        @com.aliyun.core.annotation.NameInMap("queueType")
        private String queueType;

        @com.aliyun.core.annotation.NameInMap("workers")
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

            private Builder() {
            } 

            private Builder(CreatePipelinesRequestBody model) {
                this.batchDelay = model.batchDelay;
                this.batchSize = model.batchSize;
                this.config = model.config;
                this.description = model.description;
                this.pipelineId = model.pipelineId;
                this.queueCheckPointWrites = model.queueCheckPointWrites;
                this.queueMaxBytes = model.queueMaxBytes;
                this.queueType = model.queueType;
                this.workers = model.workers;
            } 

            /**
             * batchDelay.
             */
            public Builder batchDelay(Integer batchDelay) {
                this.batchDelay = batchDelay;
                return this;
            }

            /**
             * batchSize.
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>input { } filter { } output { }</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>pipeline-test</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * queueCheckPointWrites.
             */
            public Builder queueCheckPointWrites(Integer queueCheckPointWrites) {
                this.queueCheckPointWrites = queueCheckPointWrites;
                return this;
            }

            /**
             * queueMaxBytes.
             */
            public Builder queueMaxBytes(Integer queueMaxBytes) {
                this.queueMaxBytes = queueMaxBytes;
                return this;
            }

            /**
             * queueType.
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * workers.
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
