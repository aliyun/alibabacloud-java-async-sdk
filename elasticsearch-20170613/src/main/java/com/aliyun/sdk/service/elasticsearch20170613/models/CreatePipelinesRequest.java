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
         * <p>The Logstash instance ID.</p>
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
         * <p>A unique token used to ensure the idempotence of the request. The client generates this value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The request body parameters that specify pipeline information. For more information, see <a href="https://www.elastic.co/guide/en/logstash/6.7/logstash-settings-file.html">logstash.yml</a>.</p>
         */
        public Builder body(java.util.List<CreatePipelinesRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>Specifies whether to save and deploy the pipeline. Valid values:</p>
         * <ul>
         * <li>true: Save and deploy.</li>
         * <li>false (default): Save only.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
             * <p>The pipeline batch delay. Unit: milliseconds. Default value: 50.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder batchDelay(Integer batchDelay) {
                this.batchDelay = batchDelay;
                return this;
            }

            /**
             * <p>The pipeline batch size. Default value: 125.</p>
             * 
             * <strong>example:</strong>
             * <p>125</p>
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>The specific configuration of the pipeline.</p>
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
             * <p>The pipeline description.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The pipeline ID.</p>
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
             * <p>The number of queue checkpoint writes. Default value: 1024.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder queueCheckPointWrites(Integer queueCheckPointWrites) {
                this.queueCheckPointWrites = queueCheckPointWrites;
                return this;
            }

            /**
             * <p>The total capacity of the queue in bytes. Unit: MB. Default value: 1024.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder queueMaxBytes(Integer queueMaxBytes) {
                this.queueMaxBytes = queueMaxBytes;
                return this;
            }

            /**
             * <p>The queue type. Valid values:</p>
             * <ul>
             * <li>MEMORY: A traditional memory-based queue.</li>
             * <li>PERSISTED: A disk-based ACKed queue (persistent queue).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MEMORY</p>
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * <p>The number of pipeline worker threads. Default value: the number of CPU cores of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
