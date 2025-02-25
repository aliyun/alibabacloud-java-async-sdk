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
 * {@link UpdateConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateConsumerGroupRequest</p>
 */
public class UpdateConsumerGroupRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("order")
    private Boolean order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    private UpdateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.consumerGroup = builder.consumerGroup;
        this.order = builder.order;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConsumerGroupRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateConsumerGroupRequest, Builder> {
        private String project; 
        private String logstore; 
        private String consumerGroup; 
        private Boolean order; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConsumerGroupRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.consumerGroup = request.consumerGroup;
            this.order = request.order;
            this.timeout = request.timeout;
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
         * <p>logstore-test</p>
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
         * <p>consumer-group-1</p>
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putPathParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * <p>Specifies whether to consume data in sequence. Valid values:</p>
         * <ul>
         * <li>true: If a shard is split, the data in the original shard is consumed first. Then, the data in the new shards is consumed at the same time. If shards are merged, the data in the original shards is consumed first. Then, the data in the new shard is consumed.</li>
         * <li>false: The data in all shards is consumed at the same time. If a new shard is generated after a shard is split or shards are merged, the data in the new shard is immediately consumed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder order(Boolean order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The timeout period. If Simple Log Service does not receive heartbeats from a consumer within the timeout period, Simple Log Service deletes the consumer. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public UpdateConsumerGroupRequest build() {
            return new UpdateConsumerGroupRequest(this);
        } 

    } 

}
