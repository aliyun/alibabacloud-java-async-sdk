// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ConsumerGroupHeartBeatRequest} extends {@link RequestModel}
 *
 * <p>ConsumerGroupHeartBeatRequest</p>
 */
public class ConsumerGroupHeartBeatRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("consumerGroup")
    @Validation(required = true)
    private String consumerGroup;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < Integer > body;

    @Query
    @NameInMap("consumer")
    @Validation(required = true)
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
    public java.util.List < Integer > getBody() {
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
        private java.util.List < Integer > body; 
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
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * The name of the consumer group. The name must be unique in a project.
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putPathParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * The IDs of shards whose data is being consumed.
         */
        public Builder body(java.util.List < Integer > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The consumer.
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
