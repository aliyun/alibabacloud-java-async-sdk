// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyScheduledTaskRequest</p>
 */
public class ModifyScheduledTaskRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("taskId")
    @Validation(required = true)
    private String taskId;

    @Body
    @NameInMap("body")
    private Object body;

    private ModifyScheduledTaskRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.taskId = builder.taskId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScheduledTaskRequest create() {
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

    /**
     * @return body
     */
    public Object getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifyScheduledTaskRequest, Builder> {
        private String appGroupIdentity; 
        private String taskId; 
        private Object body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScheduledTaskRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.taskId = request.taskId;
            this.body = request.body;
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

        /**
         * 请求参数。
         */
        public Builder body(Object body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifyScheduledTaskRequest build() {
            return new ModifyScheduledTaskRequest(this);
        } 

    } 

}
