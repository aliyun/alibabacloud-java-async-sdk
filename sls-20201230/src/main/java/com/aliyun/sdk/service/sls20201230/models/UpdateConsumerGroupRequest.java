// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateConsumerGroupRequest</p>
 */
public class UpdateConsumerGroupRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Body
    @NameInMap("consumerGroup")
    private String consumerGroup;

    @Body
    @NameInMap("order")
    private Boolean order;

    @Body
    @NameInMap("timeout")
    private Integer timeout;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private UpdateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.consumerGroup = builder.consumerGroup;
        this.order = builder.order;
        this.timeout = builder.timeout;
        this.project = builder.project;
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

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<UpdateConsumerGroupRequest, Builder> {
        private String logstore; 
        private String consumerGroup; 
        private Boolean order; 
        private Integer timeout; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConsumerGroupRequest response) {
            super(response);
            this.logstore = response.logstore;
            this.consumerGroup = response.consumerGroup;
            this.order = response.order;
            this.timeout = response.timeout;
            this.project = response.project;
        } 

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * consumerGroup.
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putBodyParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * order.
         */
        public Builder order(Boolean order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public UpdateConsumerGroupRequest build() {
            return new UpdateConsumerGroupRequest(this);
        } 

    } 

}
