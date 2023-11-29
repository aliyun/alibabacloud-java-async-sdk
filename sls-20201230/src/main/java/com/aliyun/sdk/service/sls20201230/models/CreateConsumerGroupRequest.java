// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerGroupRequest</p>
 */
public class CreateConsumerGroupRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("consumerGroup")
    @Validation(required = true)
    private String consumerGroup;

    @Body
    @NameInMap("order")
    @Validation(required = true)
    private Boolean order;

    @Body
    @NameInMap("timeout")
    @Validation(required = true)
    private Integer timeout;

    private CreateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.consumerGroup = builder.consumerGroup;
        this.order = builder.order;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return consumerGroup
     */
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * @return order
     */
    public Boolean getOrder() {
        return this.order;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CreateConsumerGroupRequest, Builder> {
        private String logstore; 
        private String project; 
        private String consumerGroup; 
        private Boolean order; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerGroupRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.project = request.project;
            this.consumerGroup = request.consumerGroup;
            this.order = request.order;
            this.timeout = request.timeout;
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
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the consumer group. The name must be unique in a project.
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putBodyParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * Specifies whether to consume data in sequence. Valid values:
         * <p>
         * 
         * *   true
         * 
         *     *   In a shard, data is consumed in ascending order based on the value of the \*\*\__tag\_\_:\__receive_time\_\_\*\* field.
         *     *   If a shard is split, data in the original shard is consumed first. Then, data in the new shards is consumed at the same time.
         *     *   If shards are merged, data in the original shards is consumed first. Then, data in the new shard is consumed.
         * 
         * *   false Data in all shards is consumed at the same time. If a new shard is generated after a shard is split or after shards are merged, data in the new shard is immediately consumed.
         */
        public Builder order(Boolean order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * The timeout period. If the server does not receive heartbeats from a consumer within the timeout period, the server deletes the consumer. Unit: seconds.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CreateConsumerGroupRequest build() {
            return new CreateConsumerGroupRequest(this);
        } 

    } 

}
