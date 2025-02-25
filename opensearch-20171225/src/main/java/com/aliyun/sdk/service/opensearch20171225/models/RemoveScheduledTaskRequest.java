// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>RemoveScheduledTaskRequest</p>
 */
public class RemoveScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private RemoveScheduledTaskRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveScheduledTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<RemoveScheduledTaskRequest, Builder> {
        private String appGroupIdentity; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveScheduledTaskRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.taskId = request.taskId;
        } 

        /**
         * "my_app_group_name"
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * "2f12c585-5873-11ea-974a-7cd30ad3e268"
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public RemoveScheduledTaskRequest build() {
            return new RemoveScheduledTaskRequest(this);
        } 

    } 

}
