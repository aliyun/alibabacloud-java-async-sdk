// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteConsumerGroupRequest</p>
 */
public class DeleteConsumerGroupRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("consumerGroup")
    @Validation(required = true)
    private String consumerGroup;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private DeleteConsumerGroupRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.consumerGroup = builder.consumerGroup;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConsumerGroupRequest create() {
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
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<DeleteConsumerGroupRequest, Builder> {
        private String logstore; 
        private String consumerGroup; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConsumerGroupRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.consumerGroup = request.consumerGroup;
            this.project = request.project;
        } 

        /**
         * Logstore name
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * Consumer group
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putPathParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * Project name
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public DeleteConsumerGroupRequest build() {
            return new DeleteConsumerGroupRequest(this);
        } 

    } 

}
