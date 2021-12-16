// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteConsumerGroupRequest</p>
 */
public class DeleteConsumerGroupRequest extends Request {
    @Path
    @NameInMap("logstore")
    private String logstore;

    @Path
    @NameInMap("consumerGroup")
    private String consumerGroup;

    @Host
    @NameInMap("project")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String logstore; 
        private String consumerGroup; 
        private String project; 

        /**
         * <p>Logstore name</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>Consumer group</p>
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putPathParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * <p>Project name</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        public DeleteConsumerGroupRequest build() {
            return new DeleteConsumerGroupRequest(this);
        } 

    } 

}
