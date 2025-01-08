// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ConsumerGroupUpdateCheckPointRequest} extends {@link RequestModel}
 *
 * <p>ConsumerGroupUpdateCheckPointRequest</p>
 */
public class ConsumerGroupUpdateCheckPointRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkpoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shard")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("forceSuccess")
    private Boolean forceSuccess;

    private ConsumerGroupUpdateCheckPointRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.consumerGroup = builder.consumerGroup;
        this.checkpoint = builder.checkpoint;
        this.shard = builder.shard;
        this.consumer = builder.consumer;
        this.forceSuccess = builder.forceSuccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsumerGroupUpdateCheckPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return consumerGroup
     */
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * @return checkpoint
     */
    public String getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return shard
     */
    public Integer getShard() {
        return this.shard;
    }

    /**
     * @return consumer
     */
    public String getConsumer() {
        return this.consumer;
    }

    /**
     * @return forceSuccess
     */
    public Boolean getForceSuccess() {
        return this.forceSuccess;
    }

    public static final class Builder extends Request.Builder<ConsumerGroupUpdateCheckPointRequest, Builder> {
        private String project; 
        private String logstore; 
        private String consumerGroup; 
        private String checkpoint; 
        private Integer shard; 
        private String consumer; 
        private Boolean forceSuccess; 

        private Builder() {
            super();
        } 

        private Builder(ConsumerGroupUpdateCheckPointRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.consumerGroup = request.consumerGroup;
            this.checkpoint = request.checkpoint;
            this.shard = request.shard;
            this.consumer = request.consumer;
            this.forceSuccess = request.forceSuccess;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The name of the consumer group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer_group_test</p>
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putPathParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * <p>The value of the checkpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MTUyNDE1NTM3OTM3MzkwODQ5Ng==</p>
         */
        public Builder checkpoint(String checkpoint) {
            this.putBodyParameter("checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * <p>The ID of the shard.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder shard(Integer shard) {
            this.putBodyParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        /**
         * <p>The consumer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer_1</p>
         */
        public Builder consumer(String consumer) {
            this.putQueryParameter("consumer", consumer);
            this.consumer = consumer;
            return this;
        }

        /**
         * <p>Specifies whether to enable forceful updates. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder forceSuccess(Boolean forceSuccess) {
            this.putQueryParameter("forceSuccess", forceSuccess);
            this.forceSuccess = forceSuccess;
            return this;
        }

        @Override
        public ConsumerGroupUpdateCheckPointRequest build() {
            return new ConsumerGroupUpdateCheckPointRequest(this);
        } 

    } 

}
