// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>ListConsumerGroupRequest</p>
 */
public class ListConsumerGroupRequest extends Request {
    @Path
    @NameInMap("logstore")
    private String logstore;

    @Host
    @NameInMap("project")
    private String project;


    private ListConsumerGroupRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumerGroupRequest create() {
        return builder().build();
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

    public static final class Builder extends Request.Builder<Builder> {
        private String logstore; 
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
         * <p>Project name</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        public ListConsumerGroupRequest build() {
            return new ListConsumerGroupRequest(this);
        } 

    } 

}
