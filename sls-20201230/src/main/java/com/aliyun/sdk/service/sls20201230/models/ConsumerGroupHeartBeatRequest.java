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
 * {@link ConsumerGroupHeartBeatRequest} extends {@link RequestModel}
 *
 * <p>ConsumerGroupHeartBeatRequest</p>
 */
public class ConsumerGroupHeartBeatRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumer;

    private ConsumerGroupHeartBeatRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.consumerGroup = builder.consumerGroup;
        this.body = builder.body;
        this.consumer = builder.consumer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsumerGroupHeartBeatRequest create() {
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
     * @return body
     */
    public java.util.List<Integer> getBody() {
        return this.body;
    }

    /**
     * @return consumer
     */
    public String getConsumer() {
        return this.consumer;
    }

    public static final class Builder extends Request.Builder<ConsumerGroupHeartBeatRequest, Builder> {
        private String project; 
        private String logstore; 
        private String consumerGroup; 
        private java.util.List<Integer> body; 
        private String consumer; 

        private Builder() {
            super();
        } 

        private Builder(ConsumerGroupHeartBeatRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.consumerGroup = request.consumerGroup;
            this.body = request.body;
            this.consumer = request.consumer;
        } 

        /**
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
         * <p>The name of the consumer group. The name must be unique in a project.</p>
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
         * <p>The IDs of shards whose data is being consumed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(java.util.List<Integer> body) {
            this.putBodyParameter("body", body);
            this.body = body;
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

        @Override
        public ConsumerGroupHeartBeatRequest build() {
            return new ConsumerGroupHeartBeatRequest(this);
        } 

    } 

}
